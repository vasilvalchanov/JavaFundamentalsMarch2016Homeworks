using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;



class LargerThanNeighbours
{
    static void Main()
    {
        int[] numbers = Console.ReadLine().Split(new[] { ' ', ',' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

        for (int i = 0; i < numbers.Length; i++)
        {
            Console.WriteLine(IsLargerThanNeighbours(numbers, i));
        }
    }

    static bool IsLargerThanNeighbours(int[] numbers, int currentPosition)
    {
        bool isLarger = false;


        if (currentPosition == 0)
        {

            if (numbers[currentPosition] > numbers[currentPosition + 1])
            {
                isLarger = true;

            }
        }
        else if (currentPosition == numbers.Length - 1)
        {


            if (numbers[currentPosition] > numbers[currentPosition - 1])
            {
                isLarger = true;

            }
        }
        else
        {

            if ((numbers[currentPosition] > numbers[currentPosition - 1]) && (numbers[currentPosition] > numbers[currentPosition + 1]))
            {
                isLarger = true;
            }
        }

        return isLarger;

    }

}


