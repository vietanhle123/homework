using System.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo.lab5
{
    internal class Program

    {
        ConnectionDb connectionDb = new ConnectionDb();
        static void Main(string[] args)
        {
            CreateData();
            
            GetData();
        }

        public static  void GetData()
        {
            ConnectionDb connectionDb = new ConnectionDb();
            SqlConnection conn = connectionDb.GetConnection();
            string query = "SELECT * FROM product";
            SqlCommand command = new SqlCommand(query, conn);
            conn.Open();
            SqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                Console.WriteLine("Product name: " + reader[1] + "desc:" + reader[2]);
            }
            conn.Close();


        }

        public static void CreateData()
        {
            ConnectionDb connectionDb = new ConnectionDb();
            SqlConnection conn = connectionDb.GetConnection();
            string query = "INSERT INTO Product VALUES('Nokia888','Product 2022','5000')";
            SqlCommand command = new SqlCommand(query, conn);
            conn.Open();
            int dataCount = command.ExecuteNonQuery();
            Console.WriteLine("them {1} ban ghi thanh cong", dataCount);
            conn.Close();


        }

        public static void UpdateData()
        {
            ConnectionDb connectionDb = new ConnectionDb();
            SqlConnection conn = connectionDb.GetConnection();
            string query = "UPDATE Product SET price = 10000 WHERE id = 1008";
            SqlCommand command = new SqlCommand(query, conn);
            conn.Open();
            int dataCount = command.ExecuteNonQuery();
            Console.WriteLine("them {1} ban ghi thanh cong", dataCount);
            conn.Close();

        }
    }
}
