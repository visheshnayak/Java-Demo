public int fuzzyCompareNames(string key, string candidate)
        {
            int distance = 0;

            try
            {
                //get the difference between the each of the character with weights being given to the position of the character
                char[] charKey = key.ToCharArray();
                char[] charCandidate = candidate.ToCharArray();

                for (int i = 0; i < maxLength; i++)
                {
                    //the actual formula for fuzzy logic
                    distance += (charKey[i] - charCandidate[i]) * (maxLength - i);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }

            return distance;
        }
