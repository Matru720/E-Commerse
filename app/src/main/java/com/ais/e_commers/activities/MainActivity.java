package com.ais.e_commers.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.ais.e_commers.Adapter.CategoryAdapter;
import com.ais.e_commers.Adapter.ProductAdapter;
import com.ais.e_commers.Models.Category;
import com.ais.e_commers.Models.Product;
import com.ais.e_commers.R;
import com.ais.e_commers.databinding.ActivityMainBinding;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCategories();
        initProducts();
        initSlider();
    }

    private void initSlider() {
        binding.carousel.addData(new CarouselItem("https://www.bikes4sale.in/pictures/notes/mahindra-offers.jpg","fadu"));
        binding.carousel.addData(new CarouselItem("https://imgd.aeplcdn.com/370x208/n/cw/ec/124013/hunter-350-right-front-three-quarter.jpeg?isig=0&q=80","fadu"));
    }

    void initCategories(){
        categories = new ArrayList<>();
        categories.add(new Category("sports and outdoor","https://buffer.com/library/content/images/size/w1200/2023/10/free-images.jpg","#18ab4e","some description",1));
        categories.add(new Category("sports and outdoor","https://media.istockphoto.com/id/487666472/photo/girl-in-the-garden.jpg?s=170667a&w=0&k=20&c=mFC0_tCXan-sVUEw6o7n8OmX0dj_T8EiJ7KNPRFOLLA=","#fb0504","some description",1));
        categories.add(new Category("sports and outdoor","https://media.istockphoto.com/id/487666472/photo/girl-in-the-garden.jpg?s=170667a&w=0&k=20&c=mFC0_tCXan-sVUEw6o7n8OmX0dj_T8EiJ7KNPRFOLLA=","#4186ff","some description",1));
        categories.add(new Category("sports and outdoor","https://media.istockphoto.com/id/487666472/photo/girl-in-the-garden.jpg?s=170667a&w=0&k=20&c=mFC0_tCXan-sVUEw6o7n8OmX0dj_T8EiJ7KNPRFOLLA=","#bf360C","some description",1));
        categories.add(new Category("sports and outdoor","https://media.istockphoto.com/id/487666472/photo/girl-in-the-garden.jpg?s=170667a&w=0&k=20&c=mFC0_tCXan-sVUEw6o7n8OmX0dj_T8EiJ7KNPRFOLLA=","#ff870e","some description",1));
        categories.add(new Category("sports and outdoor","https://media.istockphoto.com/id/487666472/photo/girl-in-the-garden.jpg?s=170667a&w=0&k=20&c=mFC0_tCXan-sVUEw6o7n8OmX0dj_T8EiJ7KNPRFOLLA=","#ff6f52","some description",1));
        categoryAdapter = new CategoryAdapter(this,categories);

        GridLayoutManager layoutManager = new GridLayoutManager(this,4);
        binding.categorylist.setLayoutManager(layoutManager);
        binding.categorylist.setAdapter(categoryAdapter);

    }

    void initProducts(){
        products = new ArrayList<>();
        products.add(new Product("Mens fasion",
                "https://5.imimg.com/data5/ANDROID/Default/2021/7/CS/BC/PI/133782081/product-jpeg-500x500.jpg", "" ,2, 2, 2, 2));
        products.add(new Product("Mens fasion",
                "https://5.imimg.com/data5/ANDROID/Default/2021/7/CS/BC/PI/133782081/product-jpeg-500x500.jpg", "" ,2, 2, 2, 2));
        products.add(new Product("Mens fasion",
                "https://5.imimg.com/data5/ANDROID/Default/2021/7/CS/BC/PI/133782081/product-jpeg-500x500.jpg", "" ,2, 2, 2, 2));
        products.add(new Product("Mens fasion",
                "https://5.imimg.com/data5/ANDROID/Default/2021/7/CS/BC/PI/133782081/product-jpeg-500x500.jpg", "" ,2, 2, 2, 2));
        products.add(new Product("Mens fasion",
                "https://5.imimg.com/data5/ANDROID/Default/2021/7/CS/BC/PI/133782081/product-jpeg-500x500.jpg", "" ,2, 2, 2, 2));
        products.add(new Product("Mens fasion",
                "https://5.imimg.com/data5/ANDROID/Default/2021/7/CS/BC/PI/133782081/product-jpeg-500x500.jpg", "" ,2, 2, 2, 2));

        productAdapter = new ProductAdapter(this,products);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        binding.productlist.setLayoutManager(layoutManager);
        binding.productlist.setAdapter(productAdapter);
    }
}