func hasDuplicate(nums []int) bool {
    seen := make(map[int]int)

    for _, val := range nums {
        _, wasSeen := seen[val]
        if wasSeen {
            return wasSeen
        }
        seen[val] = val
    }

    return false
}
