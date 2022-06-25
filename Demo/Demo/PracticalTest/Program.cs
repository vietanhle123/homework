using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo.PracticalTest
{
    public class Program
    {
        List<Product> products = new ViewAllProduct().getData();
        static void Main(string[] args)
        {
            Program pro = new Program();
            while (true)
            {
                Menu();
                int choose = int.Parse(Console.ReadLine());
                switch (choose)
                {
                    case 1://add
                        pro.AddProduct();
                        break;
                    case 2://view
                        pro.ShowAll();
                        break;
                    case 3://delete
                        pro.DeleteProduct();
                        break;
                    case 4:
                        Environment.Exit(0);
                        break;
                    default:
                        break;
                }
            }
            Console.ReadLine();

        }
        public static void Menu()
        {
            Console.WriteLine("========== Actions=========");
            Console.WriteLine("1. Add product records");
            Console.WriteLine("2. Display product records");
            Console.WriteLine("3. Delete product by Id");
            Console.WriteLine("4. End");
        }
        public void ShowAll()
        {
            var product = products.OrderBy(pro => pro.productName);
            foreach (var item in product)
            {
                Console.WriteLine("ID : " + item.Id + " " + "Product name : " + item.productName + " " + "Price : " + item.Price);
            }
        }
        public void AddProduct()
        {
            Addproduct add = new Addproduct();
            Console.WriteLine("Enter product name : ");
            string name = Console.ReadLine();
            Console.WriteLine("Enter product description :");
            string desc = Console.ReadLine();
            Console.WriteLine("Enter product price :");
            int price = int.Parse(Console.ReadLine());
            Product product = new Product { productName = name, productDesc = desc, Price = price };
            add.getData(product);
        }
        public void DeleteProduct()
        {
            DeleteProduct delete = new DeleteProduct();
            Console.WriteLine("Enter product id : ");
            int id = int.Parse(Console.ReadLine());
            int count = 0;
            foreach (var item in products)
            {
                if (item.Id.Equals(id))
                {
                    delete.RemoveProduct(id);
                    count = 1;
                    break;
                }
            }
            if (count == 0)
            {
                Console.WriteLine("ID {0} Not Found !", id);
            }

        }

    }
}
