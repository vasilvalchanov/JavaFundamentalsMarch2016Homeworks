using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;
using System.Threading;



class ReverseNumber
{
    static void Main()
    {
        Thread.CurrentThread.CurrentCulture = CultureInfo.InvariantCulture;



        double number = double.Parse(Console.ReadLine());
        double reversed = GetReversedNumber(number);

        Console.WriteLine(reversed);
    }



    static double GetReversedNumber(double number)
    {
        string numberInString = number.ToString();

        char[] reversedNumber = numberInString.Reverse().ToArray();

        if (number < 0)
        {
            double result = double.Parse(string.Join("", reversedNumber).Remove(reversedNumber.Length - 1));

            return -result;
        }
        else
        {
            double result = double.Parse(string.Join("", reversedNumber));

            return result;
        }
        
    }
}

