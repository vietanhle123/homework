using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace Demo.PracticalTest
{
    public class ConnectionDb
    {
        public SqlConnection GetData()
        {
            string connectionString = "Data source = localhost; Initial Catalog = DbTest ; User = sa ; password = sa ; ";
            SqlConnection conn = new SqlConnection(connectionString);

            return conn;
        }
    }
}
