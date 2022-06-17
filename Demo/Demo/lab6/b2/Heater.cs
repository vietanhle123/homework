using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo.lab6.b2
{
    internal class Heater
    {
        public Heater(float temperature)
        {
            Temperature = temperature;
        }
        public float Temperature
        {
            get { return _Temperature; }
            set { _Temperature = value; }
        }
        private float _Temperature;
        public void OnTemperatureChanged(float newTemperature)
        {
            if (newTemperature < Temperature)
            {
                System.Console.WriteLine("Heater: On");
            }
            else
            {
                System.Console.WriteLine("Heater: Off");
            }
        }

    }
}
