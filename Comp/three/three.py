def elsie_must_be_lying(t, test_cases):
  for i in range(t):
    n, m, inputs_outputs = test_cases[i]
    # Initialize a set to store the outputs for each input
    output_set = set()
    for input_output in inputs_outputs:
      b, output = input_output
      # If the input has not been seen before, add it to the set
      # with its output. If it has been seen before, check that
      # the output is the same as the one previously seen for
      # this input. If it is different, Elsie must be lying.
      if b not in output_set:
        output_set[b] = output
      else:
        if output_set[b] != output:
          print("LIE")
          break
    # If we have not found any inconsistencies, the output is "OK"
    else:
      print("OK")

# Test the function with the sample input
elsie_must_be_lying(4, [
  (1, 3, [("0", 0), ("0", 0), ("1", 1)]),
  (2, 4, [("00", 0), ("01", 1), ("10", 1), ("11", 1)]),
  (1, 2, [("0", 1), ("0", 0)]),
  (2, 4, [("00", 0), ("01", 1), ("10", 1), ("11", 0)]),
])
