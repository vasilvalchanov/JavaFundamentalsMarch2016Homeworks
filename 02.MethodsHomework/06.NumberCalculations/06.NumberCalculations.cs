using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;
using System.Threading;



class NumberCalculations
{
    static void Main()
    {
        Thread.CurrentThread.CurrentCulture = CultureInfo.InvariantCulture;

        List<decimal> numbers = Console.ReadLine().Split(' ').Select(decimal.Parse).ToList();
        List<double> numbersInDouble = Console.ReadLine().Split(' ').Select(double.Parse).ToList();

        Console.WriteLine("sum = {0} ", GetSum(numbers));
        Console.WriteLine("min = {0} ", GetMin(numbers));
        Console.WriteLine("max = {0} ", GetMax(numbers));
        Console.WriteLine("product = {0} ", GetProduct(numbers));
        Console.WriteLine("average = {0} ", GetAverage(numbers));

        Console.WriteLine("sum = {0} ", GetSum(numbersInDouble));
        Console.WriteLine("min = {0} ", GetMin(numbersInDouble));
        Console.WriteLine("max = {0} ", GetMax(numbersInDouble));
        Console.WriteLine("product = {0} ", GetProduct(numbersInDouble));
        Console.WriteLine("average = {0} ", GetAverage(numbersInDouble));
    }

    static decimal GetSum (List<decimal> numbers)
    {
        decimal sum = 0;

        for (int i = 0; i < numbers.Count; i++)
        {
            sum = sum + numbers[i];
        }

        return sum;
    }

    static double GetSum(List<double> numbers)
    {
        double sum = 0;

        for (int i = 0; i < numbers.Count; i++)
        {
            sum = sum + numbers[i];
        }

        return sum;
    }

    static decimal GetMin(List<decimal> numbers)
    {
        decimal min = decimal.MaxValue;

        for (int i = 0; i < numbers.Count; i++)
        {
            if (numbers[i] < min)
            {
                min = numbers[i];
            }
        }

        return min;
    }

    static double GetMin(List<double> numbers)
    {
        double min = double.MaxValue;

        for (int i = 0; i < numbers.Count; i++)
        {
            if (numbers[i] < min)
            {
                min = numbers[i];
            }
        }

        return min;
    }

    static decimal GetMax(List<decimal> numbers)
    {
        decimal max = decimal.MinValue;

        for (int i = 0; i < numbers.Count; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }

        return max;
    }

    static double GetMax(List<double> numbers)
    {
        double max = double.MinValue;

        for (int i = 0; i < numbers.Count; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }

        return max;
    }

    static decimal GetProduct(List<decimal> numbers)
    {
        decimal product = 1;

        for (int i = 0; i < numbers.Count; i++)
        {
            product = product * numbers[i];
        }

        return product;
    }

    static double GetProduct(List<double> numbers)
    {
        double product = 1;

        for (int i = 0; i < numbers.Count; i++)
        {
            product = product * numbers[i];
        }

        return product;
    }

    static decimal GetAverage(List<decimal> numbers)
    {
        decimal sum = 0;
        decimal average = 0;

        for (int i = 0; i < numbers.Count; i++)
        {
            sum = sum + numbers[i];
        }

        average = sum / numbers.Count;
        return average;
    }

    static double GetAverage(List<double> numbers)
    {
        double sum = 0;
        double average = 0;

        for (int i = 0; i < numbers.Count; i++)
        {
            sum = sum + numbers[i];
        }

        average = sum / numbers.Count;
        return average;
    }
}

