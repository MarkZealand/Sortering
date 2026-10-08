n = længden af array

    // Start med et stort gap og reducer det gradvist
    gap = n / 2

    while gap > 0 do
        // Udfør en gap-sortering for det aktuelle gap
        for i = gap to n - 1 do
            temp = array[i]
            j = i

            // Flyt elementer af arrayet, der er gap pladser bagud
            while j >= gap and array[j - gap] > temp do
                array[j] = array[j - gap]
                j = j - gap
            end while

            // Placer temp på sin korrekte position
            array[j] = temp
        end for

        // Reducer gap for næste iteration
        gap = gap / 2
    end while