package bai5;

import java.util.ArrayList;
import java.util.List;

/*
    Tạo interface Subject để quản lý danh sách các observer và thông báo cho chúng khi có thay đổi gồm các phương thức trừu tượng sau:
    registerObserver(Observer o): Thêm người nhận thông báo
    removeObserver(Observer o): Xóa người nhận
    notifyObservers(String message): Gửi thông báo đến tất cả observer
    Tạo lớp NotificationSystem implements Subject để triển khai các phương thức trên.
    Tạo một số lớp Observer cụ thể và thử nghiệm. Ví dụ
    EmailSubscriber implements Observer: Nhận thông báo qua email.
    SmsSubscriber implements Observer: Nhận thông báo qua tin nhắn
    Tạo lớp Main: Để kiểm tra hệ thống gửi thông báo hoạt động đúng.
* */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}
