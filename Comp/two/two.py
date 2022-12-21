def minimum_patches(n: int, k: int, cows: str) -> int:
    # Initialize variables to keep track of the number of patches
    # needed and the configuration
    patches_needed = 0
    configuration = []

    # Iterate through the cows
    for i, cow in enumerate(cows):
        # If the current cow's breed is different from the previous cow's breed
        # or if this is the first cow, we need to plant a patch
        if i == 0 or cows[i - 1] != cow:
            patches_needed += 1
            configuration.append(cow)
        # If the current cow's breed is the same as the previous cow's breed,
        # we can use the previous patch
        else:
            configuration.append('.')
    
    # Return the results
    return patches_needed, configuration

# Test the function with the sample input
T = 6
test_cases = [
    (5, 0, 'GHHGG'),
    (5, 1, 'GHHGG'),
    (5, 2, 'GHHGG'),
    (5, 3, 'GHHGG'),
    (5, 4, 'GHHGG'),
    (2, 1, 'GH'),
]

for t in range(T):
    n, k, cows = test_cases[t]
    patches, config = minimum_patches(n, k, cows)
    print(patches)
    print(''.join(config))
