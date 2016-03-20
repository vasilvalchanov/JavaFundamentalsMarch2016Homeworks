using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;



class FirstLargerThanNeighbours
{
    static void Main()
    {
        int[] numbers = Console.ReadLine().Split(new[] { ' ', ',' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

        Console.WriteLine(GetIndexOfFirstElementLargerThanNeighbours(numbers));
    }

    static int GetIndexOfFirstElementLargerThanNeighbours(int[] numbers)
    {
        int index = 0;
        bool isLarger = false;

        for (int currentPosition = 0; currentPosition < numbers.Length; currentPosition++)
        {
            if (currentPosition == 0)
            {

                if (numbers[currentPosition] > numbers[currentPosition + 1])
                {
                    isLarger = true;
                    index = currentPosition;
                    break;


                }
            }
            else if (currentPosition == numbers.Length - 1)
            {


                if (numbers[currentPosition] > numbers[currentPosition - 1])
                {
                    isLarger = true;
                    index = currentPosition;
                    break;

                }
            }
            else
            {

                if ((numbers[currentPosition] > numbers[currentPosition - 1]) && (numbers[currentPosition] > numbers[currentPosition + 1]))
                {
                    isLarger = true;
                    index = currentPosition;
                    break;
                }
            }
        }


        if (isLarger)
        {
            return index;
        }
        else
        {
            return -1;
        }

    }
}

