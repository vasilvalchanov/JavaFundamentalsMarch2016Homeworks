using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;



class BiggerNumber
{
    static void Main()
    {
        int firstNumber = int.Parse(Console.ReadLine());
        int secondNumber = int.Parse(Console.ReadLine());

        int maxNumber = GetMax(firstNumber, secondNumber);
        Console.WriteLine(maxNumber);
        
    }

    static int GetMax(int firstNumber, int secondNumber)
    {
        int biggerNumber = int.MinValue;

        if (firstNumber >= secondNumber)
        {
            biggerNumber = firstNumber;
        }
        else
        {
            biggerNumber = secondNumber;
        }

        return biggerNumber;
    }
}

