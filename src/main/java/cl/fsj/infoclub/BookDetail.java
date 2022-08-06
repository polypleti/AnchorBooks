package cl.fsj.infoclub;

public class BookDetail {

	private Integer id, pages, year, price, lastPrice;
	private String author, country, imageLink, language, link, title;
	private Boolean delivery;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(Integer lastPrice) {
		this.lastPrice = lastPrice;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getDelivery() {
		return delivery;
	}
	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}
	@Override
	public String toString() {
		return "ID: " + id + "/ Paginas: " + pages + "/ Ano: " + year + "/ Precio: " + price + "/ Ultimo Precio: "
				+ lastPrice + "/ Autor: " + author + "/ Pais: " + country + "/ Imagen: " + imageLink + "/ Idioma: "
				+ language + "/ Zelda: " + link + "/ Titulo: " + title + "/ Delivery? :" + delivery;
	}
	
}
