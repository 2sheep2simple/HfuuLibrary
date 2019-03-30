/**
 * @program: HfuuLibrary
 * @description:
 * @author: 2simple
 * @create: 2019-03-30 00:45
 **/
public class Book {
    public int id;
    public String name;
    public String author;
    public String press;
    public String pressdate;
    public String  status;
    public String address; // 图书馆所在位置
    public String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPressdate() {
        return pressdate;
    }

    public void setPressdate(String pressdate) {
        this.pressdate = pressdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", pressdate='" + pressdate + '\'' +
                ", status=" + status +
                ", address='" + address + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
