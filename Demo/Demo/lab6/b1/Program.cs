using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace Demo.lab6.b1
{
    internal class Program
    {
        public void Increment(ref int X);
        public static void Add2(ref int x)
        {
            x += 2;
        }
        public static void Add3(ref int x)
        {
            x += 3;
        }
        public static void Main()
        {
            Increment functionDelegate = Add2;
            functionDelegate += Add3;
            functionDelegate += Add2;
            int x = 5;
            functionDelegate(ref x);
            Console.ReadLine();
        }

    }


}
