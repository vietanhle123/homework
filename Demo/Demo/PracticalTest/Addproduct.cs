using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace Demo.PracticalTest
{
    public class Addproduct
    {
        SqlConnection connection = new ConnectionDb().GetData();
        public void getData(Product product)
        {
            connection.Open();
            string query = "INSERT INTO product VALUES (@proName,@proDesc,@price)";
            SqlCommand command = new SqlCommand(query, connection);
            command.Prepare();
            command.Parameters.AddWithValue("@proName", product.productName);
            command.Parameters.AddWithValue("@proDesc", product.productDesc);
            command.Parameters.AddWithValue("@price", product.Price);
            int check = command.ExecuteNonQuery();
            if (check >= 1)
            {
                Console.WriteLine("Add success {0} product ", check);
            }
            else
            {
                Console.WriteLine("Add false! ");
            }
            connection.Close();
        }
    }
}
