using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace Demo.PracticalTest
{
    public class ViewAllProduct
    {
        SqlConnection connection = new ConnectionDb().GetData();
        public List<Product> getData()
        {
            List<Product> products = new List<Product>();
            string query = "SELECT * FROM product";
            SqlCommand command = new SqlCommand(query, connection);
            connection.Open();
            SqlDataReader reader = command.ExecuteReader();
            while (reader.Read())
            {
                int id = Convert.ToInt32(reader[0]);
                string name = Convert.ToString(reader[1]);
                string desc = Convert.ToString(reader[2]);
                int price = Convert.ToInt32(reader[3]);
                products.Add(new Product { Id = id, productName = name, productDesc = desc, Price = price });
            }
            connection.Close();
            return products;
        }
    }
}
