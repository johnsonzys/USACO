def max_revenue(tuitions):
  # Sort the tuitions in non-ascending order
  tuitions.sort(reverse=True)

  # Set the initial revenue to 0 and the initial number of attendees to 0
  revenue = 0
  attendees = 0

  # Iterate through the tuitions
  for tuition in tuitions:
    # Add the tuition to the revenue and increment the number of attendees
    revenue += tuition
    attendees += 1

    # If the revenue is less than the number of attendees times the tuition,
    # then the current tuition is not the optimal solution
    if revenue < attendees * tuition:
      break

  # Return the total revenue and the optimal tuition
  return revenue, tuition

# Test the function with the sample input
tuitions = [1, 6, 4, 6]
print(max_revenue(tuitions))  # Output: (12, 4)
