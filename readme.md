procedure QuickSort(array, low, high)
if low < high then
        // Find pivot-elementets korrekte position i det sorterede array
        pivotIndex = Partition(array, low, high)
        // Rekursivt sorter elementerne før og efter pivot
        QuickSort(array, low, pivotIndex - 1)
        QuickSort(array, pivotIndex + 1, high)
end if


// Partition-funktionen opdeler arrayet og returnerer det korrekte pivot-index
procedure Partition(array, low, high)
    pivot = array[high]  // Vælg det sidste element som pivot
    i = low - 1          // Index for det mindre element
    for j = low to high - 1 do
        if array[j] <= pivot then
            i = i + 1
            Swap(array[i], array[j])  // Byt array[i] og array[j]
        end if
    end for
    // Byt pivot til sin korrekte position
    Swap(array[i + 1], array[high])
    return i + 1  // Returner pivot-elementets indeks


// Swap-funktion bytter to elementer i arrayet
procedure Swap(a, b)
    temp = a
    a = b
    b = temp
