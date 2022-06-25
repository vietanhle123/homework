using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace Demo.PracticalTest
{
     class DeleteProduct
    {
        public void RemoveProduct(int id)
        {
            SqlConnection connection = new ConnectionDb().GetData();
            connection.Open();
            SqlCommand command = new SqlCommand("DELETE FROM product WHERE id =@id", connection);
            command.Parameters.AddWithValue("@id", id);
            int check = command.ExecuteNonQuery();
            if (check > 0)
            {
                Console.WriteLine("Delete success {0} product", check);
            }
            else { Console.WriteLine("Delete false!"); }
            connection.Close();
        }
    }
}
