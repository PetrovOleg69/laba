package com.company;

class cl_essence extends Books
{
    public String alignment;
    public String magic;


    //тащемта конструктор для САМОЙ СУТИ книги//
    public cl_essence(String writer, String title, byte chapters, int pages, String about_book, double minval, String alignment, String magic)
    {
        super(writer, title, chapters, pages, about_book, minval);
        this.alignment = alignment;
        this.magic = magic;
    }
    //МаГиЧеСкИй метод взятия книги//
    @Override
    public void AllBookInfo(int id) //к тому-же ПоЛиМоРфНыЙ
    {System.out.println("\nАвтор: " + writer + "\nНазвание: " + title + "\nГлав: "+ chapters + "\nСтраниц: "+ pages + "\nОписание: "+ about_book + "\nЦена: "+ minval + "Влияние на Мир: " + alignment + "Что-то происходит... " + magic);}
}