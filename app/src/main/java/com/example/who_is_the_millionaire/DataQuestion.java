package com.example.who_is_the_millionaire;

import java.util.ArrayList;

public class DataQuestion {

    public ArrayList<ArrayList> getQuestion() {
        ArrayList<ArrayList> listquestion = new ArrayList<>();

        ArrayList<Question> arrayListquestion1 = new ArrayList<>();

        ArrayList<Answser> arrayList1 = new ArrayList<>();
        arrayList1.add(new Answser("Voi", true));
        arrayList1.add(new Answser("Ngựa", false));
        arrayList1.add(new Answser("Hổ", false));
        arrayList1.add(new Answser("Sư tử", false));

        ArrayList<Answser> arrayList2 = new ArrayList<>();
        arrayList2.add(new Answser(" Ếch", false));
        arrayList2.add(new Answser(" Cóc", true));
        arrayList2.add(new Answser("Thằn lằn", false));
        arrayList2.add(new Answser("Nhái", false));

        ArrayList<Answser> arrayList3 = new ArrayList<>();
        arrayList3.add(new Answser("Đá Lăn", false));
        arrayList3.add(new Answser("Đá Nhảy", true));
        arrayList3.add(new Answser("Đá Chạy", false));
        arrayList3.add(new Answser("Đá Bò", false));

        ArrayList<Answser> arrayList4 = new ArrayList<>();
        arrayList4.add(new Answser("Nhật Bản", true));
        arrayList4.add(new Answser("Mông Cổ", false));
        arrayList4.add(new Answser("Trung Quốc", false));
        arrayList4.add(new Answser("Việt Nam", false));

        arrayListquestion1.add(new Question(1, "Hai bà trưng đánh trận bằng gì ", arrayList1));
        arrayListquestion1.add(new Question(2, "Đâu là một loại hình chợ tạm tự phát thường xuất hiện trong các khu dân cư? ", arrayList2));
        arrayListquestion1.add(new Question(3, "Đâu là tên một bãi biển ở Quảng Bình?", arrayList3));
        arrayListquestion1.add(new Question(4, "Haiku là thể thơ truyền thống của nước nào?", arrayList4));

        listquestion.add(arrayListquestion1);

        ArrayList<Question> arrayListquestion2 = new ArrayList<>();

        ArrayList<Answser> arrayList5 = new ArrayList<>();
        arrayList5.add(new Answser("Thanh Hóa", false));
        arrayList5.add(new Answser("Quảng Bình", false));
        arrayList5.add(new Answser("Quảng Trị", false));
        arrayList5.add(new Answser("KonTum", true));

        ArrayList<Answser> arrayList6 = new ArrayList<>();
        arrayList6.add(new Answser(" Khoái ", true));
        arrayList6.add(new Answser(" Sướng", false));
        arrayList6.add(new Answser("Thích ", false));
        arrayList6.add(new Answser("Vui", false));

        ArrayList<Answser> arrayList7 = new ArrayList<>();
        arrayList7.add(new Answser("D1", true));
        arrayList7.add(new Answser("C1", false));
        arrayList7.add(new Answser("F1", false));
        arrayList7.add(new Answser("A1", false));

        ArrayList<Answser> arrayList8 = new ArrayList<>();
        arrayList8.add(new Answser("Đôi bạn ", false));
        arrayList8.add(new Answser("Mẹ", false));
        arrayList8.add(new Answser("Em Thúy", false));
        arrayList8.add(new Answser("Em gái tôi", true));

        arrayListquestion2.add(new Question(5, "Chiến trường Đắk Tô - Tân Cảnh, nơi diễn ra chiến thắng vang đội năm 1972, nay thuộc địa bàn tỉnh nào ở Tây Nguyên?", arrayList5));
        arrayListquestion2.add(new Question(6, "Đâu là tên một loại bánh Huế? ", arrayList6));
        arrayListquestion2.add(new Question(7, "Tượng đài Chiến thắng Điện Biên Phủ được dựng trên ngọn đồi nào?", arrayList7));
        arrayListquestion2.add(new Question(8, "Đâu không phải là một tác phẩm của họa sĩ Trần Văn Cẩn?", arrayList8));

        listquestion.add(arrayListquestion2);

        ArrayList<Question> arrayListquestion3 = new ArrayList<>();

        ArrayList<Answser> arrayList9 = new ArrayList<>();
        arrayList9.add(new Answser("Cơm", false));
        arrayList9.add(new Answser("Thóc", false));
        arrayList9.add(new Answser("Khoai", false));
        arrayList9.add(new Answser("Gạo", true));

        ArrayList<Answser> arrayList10 = new ArrayList<>();
        arrayList10.add(new Answser(" TB ", true));
        arrayList10.add(new Answser(" GB", false));
        arrayList10.add(new Answser("MB ", false));
        arrayList10.add(new Answser("KB", false));

        ArrayList<Answser> arrayList11 = new ArrayList<>();
        arrayList11.add(new Answser("Chết Đứng", true));
        arrayList11.add(new Answser("Chết Nằm", false));
        arrayList11.add(new Answser("Chết", false));
        arrayList11.add(new Answser("Sống", false));

        ArrayList<Answser> arrayList12 = new ArrayList<>();
        arrayList12.add(new Answser("Thứ Hai ", false));
        arrayList12.add(new Answser("Thứ Sáu", false));
        arrayList12.add(new Answser("Thứ Năm", false));
        arrayList12.add(new Answser("Thứ Bảy", true));

        arrayListquestion3.add(new Question(9, "Mạnh vì..., bạo vì tiền ", arrayList9));
        arrayListquestion3.add(new Question(10, "Đơn vị đo dung lượng bộ nhớ nào lớn nhất ", arrayList10));
        arrayListquestion3.add(new Question(11, "Cây ngay không sợ... ", arrayList11));
        arrayListquestion3.add(new Question(12, "Sat trong tiếng Anh là thứ mấy trong tuần", arrayList12));

        listquestion.add(arrayListquestion3);

        ArrayList<Question> arrayListquestion4 = new ArrayList<>();

        ArrayList<Answser> arrayList13 = new ArrayList<>();
        arrayList13.add(new Answser("2508m", false));
        arrayList13.add(new Answser("258m", false));
        arrayList13.add(new Answser("2580m", false));
        arrayList13.add(new Answser("25080m", true));

        ArrayList<Answser> arrayList14 = new ArrayList<>();
        arrayList14.add(new Answser(" Lúa ", true));
        arrayList14.add(new Answser(" Gạo", false));
        arrayList14.add(new Answser("Khoai ", false));
        arrayList14.add(new Answser("Sắn", false));

        ArrayList<Answser> arrayList15 = new ArrayList<>();
        arrayList15.add(new Answser("Ngọ", true));
        arrayList15.add(new Answser("Tý", false));
        arrayList15.add(new Answser("Dậu", false));
        arrayList15.add(new Answser("Tuấn", false));

        ArrayList<Answser> arrayList16 = new ArrayList<>();
        arrayList16.add(new Answser("Everres ", false));
        arrayList16.add(new Answser("Panxipăng", false));
        arrayList16.add(new Answser("Trường lệ", false));
        arrayList16.add(new Answser("Phú Sỹ", true));

        arrayListquestion4.add(new Question(13, "Trong các số do dưới đây, số đo nào bằng 25,08 km ", arrayList13));
        arrayListquestion4.add(new Question(14, "Người đẹp vì lụa, ... tốt vì phân", arrayList14));
        arrayListquestion4.add(new Question(15, "Mưa chẳng qua... gió chẳng qua mùi", arrayList15));
        arrayListquestion4.add(new Question(16, "Ngọn núi nào cao nhất Nhật Bản", arrayList16));

        listquestion.add(arrayListquestion4);

        ArrayList<Question> arrayListquestion5 = new ArrayList<>();

        ArrayList<Answser> arrayList17 = new ArrayList<>();
        arrayList17.add(new Answser("Ếch", false));
        arrayList17.add(new Answser("Nhái", false));
        arrayList17.add(new Answser("Cóc", false));
        arrayList17.add(new Answser("Nòng Nọc", true));

        ArrayList<Answser> arrayList18 = new ArrayList<>();
        arrayList18.add(new Answser(" Philadenphia ", true));
        arrayList18.add(new Answser(" NewYork", false));
        arrayList18.add(new Answser("Caliphonia ", false));
        arrayList18.add(new Answser("Penvasia", false));

        ArrayList<Answser> arrayList19 = new ArrayList<>();
        arrayList19.add(new Answser("Nước Lã", true));
        arrayList19.add(new Answser("Nước Sôi", false));
        arrayList19.add(new Answser("Nước Ngọt", false));
        arrayList19.add(new Answser("Nước Lạnh", false));

        ArrayList<Answser> arrayList20 = new ArrayList<>();
        arrayList20.add(new Answser("Bọ Hung ", false));
        arrayList20.add(new Answser("Thằn Lằn", false));
        arrayList20.add(new Answser("Chim Sâu", false));
        arrayList20.add(new Answser("Ruồi Giấm", true));

        arrayListquestion5.add(new Question(17, "Con có cha như nhà có nóc, con không cha như... đứt đuôi ", arrayList17));
        arrayListquestion5.add(new Question(18, "Trước Wasington, thành phố nào là thủ đô của Mỹ", arrayList18));
        arrayListquestion5.add(new Question(19, "Chị em dâu như bầu...", arrayList19));
        arrayListquestion5.add(new Question(20, "Năm 1910, Morgan đã chọn cái gì làm thí nghiệm về di truyền ", arrayList20));

        listquestion.add(arrayListquestion5);


        ArrayList<Question> arrayListquestion6 = new ArrayList<>();

        ArrayList<Answser> arrayList21 = new ArrayList<>();
        arrayList21.add(new Answser("Châu Âu", false));
        arrayList21.add(new Answser("Châu Đại Dương", false));
        arrayList21.add(new Answser("Châu Á", false));
        arrayList21.add(new Answser("Châu Phi", true));

        ArrayList<Answser> arrayList22 = new ArrayList<>();
        arrayList22.add(new Answser(" CaCo3 ", true));
        arrayList22.add(new Answser(" CaHCo3", false));
        arrayList22.add(new Answser("CaCl3 ", false));
        arrayList22.add(new Answser("CaOH", false));

        ArrayList<Answser> arrayList23 = new ArrayList<>();
        arrayList23.add(new Answser("Lí Nhân Tông", true));
        arrayList23.add(new Answser("Trần Nhân Tông", false));
        arrayList23.add(new Answser("Lê Thái Tổ", false));
        arrayList23.add(new Answser("Đinh Tiên Hoàng", false));

        ArrayList<Answser> arrayList24 = new ArrayList<>();
        arrayList24.add(new Answser("Lào Cai ", false));
        arrayList24.add(new Answser("Yên Bái", false));
        arrayList24.add(new Answser("Cao Bằng", false));
        arrayList24.add(new Answser("Thái Nguyên", true));

        arrayListquestion6.add(new Question(21, "Sau chiến tranh thế giới 2, phong trào giải phóng dân tộc nổi lên mạnh nhất ở đâu?", arrayList21));
        arrayListquestion6.add(new Question(22, "Công thức hóa học của đá vôi", arrayList22));
        arrayListquestion6.add(new Question(23, "Vua nào đặt nhiều niên hiệu nhất lịch sử nước ta ", arrayList23));
        arrayListquestion6.add(new Question(24, "Huyện Võ Nhai thuộc tỉnh nào nước ta?", arrayList24));

        listquestion.add(arrayListquestion6);


        ArrayList<Question> arrayListquestion7 = new ArrayList<>();

        ArrayList<Answser> arrayList25 = new ArrayList<>();
        arrayList25.add(new Answser("Biển Alatic", false));
        arrayList25.add(new Answser("Biển Đông", false));
        arrayList25.add(new Answser("Biển Bắc Băng Dương", false));
        arrayList25.add(new Answser("Biển Chết", true));

        ArrayList<Answser> arrayList26 = new ArrayList<>();
        arrayList26.add(new Answser(" Trần Thủ Độ ", true));
        arrayList26.add(new Answser(" Trần Nhân Tông", false));
        arrayList26.add(new Answser("Trần Quốc Toản ", false));
        arrayList26.add(new Answser("Trần Cảnh", false));

        ArrayList<Answser> arrayList27 = new ArrayList<>();
        arrayList27.add(new Answser("Ba Lan", true));
        arrayList27.add(new Answser("Bồ Đào Nha", false));
        arrayList27.add(new Answser("Trung Quốc", false));
        arrayList27.add(new Answser("Pháp", false));

        ArrayList<Answser> arrayList28 = new ArrayList<>();
        arrayList28.add(new Answser("Quảng Ngãi ", false));
        arrayList28.add(new Answser("Quảng Trị", false));
        arrayList28.add(new Answser("Quảng Châu", false));
        arrayList28.add(new Answser("Quảng Ngãi", true));

        arrayListquestion7.add(new Question(25, "Biển có nồng độ muối lớn nhất thế giới?", arrayList25));
        arrayListquestion7.add(new Question(26, "Câu nói: Đầu tôi chưa rơi xuống đất, xin bệ hạ đừng lo là của ai?", arrayList26));
        arrayListquestion7.add(new Question(27, "Quốc kỳ nào giống hệt quốc kỳ Indonexia nhưng ngược chiều  ", arrayList27));
        arrayListquestion7.add(new Question(28, "Kinh thành trà kiệu thuộc tỉnh nào?", arrayList28));

        listquestion.add(arrayListquestion7);

        ArrayList<Question> arrayListquestion8 = new ArrayList<>();

        ArrayList<Answser> arrayList29 = new ArrayList<>();
        arrayList29.add(new Answser("Biển Alatic", false));
        arrayList29.add(new Answser("Biển Đông", false));
        arrayList29.add(new Answser("Biển Bắc Băng Dương", false));
        arrayList29.add(new Answser("Biển Chết", true));

        ArrayList<Answser> arrayList30 = new ArrayList<>();
        arrayList30.add(new Answser(" Trần Thủ Độ ", true));
        arrayList30.add(new Answser(" Trần Nhân Tông", false));
        arrayList30.add(new Answser("Trần Quốc Toản ", false));
        arrayList30.add(new Answser("Trần Cảnh", false));

        ArrayList<Answser> arrayList31 = new ArrayList<>();
        arrayList31.add(new Answser("Ba Lan", true));
        arrayList31.add(new Answser("Bồ Đào Nha", false));
        arrayList31.add(new Answser("Trung Quốc", false));
        arrayList31.add(new Answser("Pháp", false));

        ArrayList<Answser> arrayList32 = new ArrayList<>();
        arrayList32.add(new Answser("Quảng Ngãi ", false));
        arrayList32.add(new Answser("Quảng Trị", false));
        arrayList32.add(new Answser("Quảng Châu", false));
        arrayList32.add(new Answser("Quảng Ngãi", true));

        arrayListquestion8.add(new Question(29, "Biển có nồng độ muối lớn nhất thế giới?", arrayList29));
        arrayListquestion8.add(new Question(30, "Câu nói: Đầu tôi chưa rơi xuống đất, xin bệ hạ đừng lo là của ai?", arrayList30));
        arrayListquestion8.add(new Question(31, "Quốc kỳ nào giống hệt quốc kỳ Indonexia nhưng ngược chiều  ", arrayList31));
        arrayListquestion8.add(new Question(32, "Kinh thành trà kiệu thuộc tỉnh nào?", arrayList32));

        listquestion.add(arrayListquestion8);

        ArrayList<Question> arrayListquestion9 = new ArrayList<>();

        ArrayList<Answser> arrayList33 = new ArrayList<>();
        arrayList33.add(new Answser("Sáo", false));
        arrayList33.add(new Answser("Đàn Gẩy", false));
        arrayList33.add(new Answser("Trống ", false));
        arrayList33.add(new Answser("Đàn Piano", true));

        ArrayList<Answser> arrayList34 = new ArrayList<>();
        arrayList34.add(new Answser(" Báo Tuổi Trẻ Cười ", true));
        arrayList34.add(new Answser(" Báo Lao Động", false));
        arrayList34.add(new Answser("Báo Pháp Luật ", false));
        arrayList34.add(new Answser("Báo Dân Trí", false));

        ArrayList<Answser> arrayList35 = new ArrayList<>();
        arrayList35.add(new Answser("Giơ Ne Vơ", true));
        arrayList35.add(new Answser("Pari", false));
        arrayList35.add(new Answser("Wasington", false));
        arrayList35.add(new Answser("Caliphonia", false));

        ArrayList<Answser> arrayList36 = new ArrayList<>();
        arrayList36.add(new Answser("Kim Loại ", false));
        arrayList36.add(new Answser("Phi Kim", false));
        arrayList36.add(new Answser("Không xác định", false));
        arrayList36.add(new Answser("Á Kim", true));

        arrayListquestion9.add(new Question(33, "Nhạc sĩ Sô Panh gắn liền với nhạc cụ nào?", arrayList33));
        arrayListquestion9.add(new Question(34, "Giải thưởng \"Cù Nèo Vàng\" dành cho nghệ sĩ hài được cơ quan nào trao tặng?", arrayList34));
        arrayListquestion9.add(new Question(35, "Năm 1954, nước ta ký hiệp định nào với Pháp?  ", arrayList35));
        arrayListquestion9.add(new Question(36, "Silic là kim loại hay phi kim? ", arrayList36));

        listquestion.add(arrayListquestion9);

        ArrayList<Question> arrayListquestion10 = new ArrayList<>();

        ArrayList<Answser> arrayList37 = new ArrayList<>();
        arrayList37.add(new Answser("Chính Phủ", false));
        arrayList37.add(new Answser("Nhà Nước", false));
        arrayList37.add(new Answser("Quốc Hội ", false));
        arrayList37.add(new Answser("Hội đồng nhân dân", true));

        ArrayList<Answser> arrayList38 = new ArrayList<>();
        arrayList38.add(new Answser(" Phần Lan ", true));
        arrayList38.add(new Answser(" Hà Lan", false));
        arrayList38.add(new Answser("Pháp ", false));
        arrayList38.add(new Answser("Đan Mạch", false));

        ArrayList<Answser> arrayList39 = new ArrayList<>();
        arrayList39.add(new Answser("Điện Biên Phủ", true));
        arrayList39.add(new Answser("Cao Bằng", false));
        arrayList39.add(new Answser("Sài Gòn", false));
        arrayList39.add(new Answser("Dinh Độc Lập", false));

        ArrayList<Answser> arrayList40 = new ArrayList<>();
        arrayList40.add(new Answser("Vua Lê Thái Tổ ", false));
        arrayList40.add(new Answser("Vua Trần Nhân Tông", false));
        arrayList40.add(new Answser("Vua Lí Thái Tổ", false));
        arrayList40.add(new Answser("Vua Quang Trung", true));

        arrayListquestion10.add(new Question(37, "Lần đầu tiên nước ta dùng bộc phá 1000 kg thuốc nổ đánh giặc là ở đâu? ", arrayList37));
        arrayListquestion10.add(new Question(38, "Đất nước nào là quê hương của ông già tuyết? ", arrayList38));
        arrayListquestion10.add(new Question(39, "Năm 1954, nước ta ký hiệp định nào với Pháp?  ", arrayList39));
        arrayListquestion10.add(new Question(40, "Ở Chùa Bộc, ngoài thờ phật, nhân dân còn thờ vị tướng nào? ", arrayList40));

        listquestion.add(arrayListquestion10);

        ArrayList<Question> arrayListquestion11 = new ArrayList<>();

        ArrayList<Answser> arrayList41 = new ArrayList<>();
        arrayList41.add(new Answser("Dãy Hoàng Liên Sơn", false));
        arrayList41.add(new Answser("Dãy Đông Triều", false));
        arrayList41.add(new Answser("Dãy Bạch Mã ", false));
        arrayList41.add(new Answser("Dãy Trường Sơn", true));

        ArrayList<Answser> arrayList42 = new ArrayList<>();
        arrayList42.add(new Answser(" 20-05-2007 ", true));
        arrayList42.add(new Answser(" 21-05-2007", false));
        arrayList42.add(new Answser("22-05-2007 ", false));
        arrayList42.add(new Answser("23-05-2007", false));

        ArrayList<Answser> arrayList43 = new ArrayList<>();
        arrayList43.add(new Answser("28-10-1892", true));
        arrayList43.add(new Answser("28-10-1893", false));
        arrayList43.add(new Answser("28-10-1894", false));
        arrayList43.add(new Answser("28-10-1895", false));

        ArrayList<Answser> arrayList44 = new ArrayList<>();
        arrayList44.add(new Answser("Cát Vàng ", false));
        arrayList44.add(new Answser("Ngọc Trai", false));
        arrayList44.add(new Answser("Ngọc ", false));
        arrayList44.add(new Answser("Cát Trắng", true));

        arrayListquestion11.add(new Question(41, "Miền núi có các vành đai thực vật theo độ cao, phong phú nhất nước ta? ", arrayList41));
        arrayListquestion11.add(new Question(42, "Ngày bầu cử quốc hội khóa 12?", arrayList42));
        arrayListquestion11.add(new Question(43, "Phim hoạt hình đầu tiên được công chiếu vào thời gian nào? ", arrayList43));
        arrayListquestion11.add(new Question(44, "Loại vật liệu dùng trong sản xuất thủy tinh ", arrayList44));

        listquestion.add(arrayListquestion11);

        ArrayList<Question> arrayListquestion12 = new ArrayList<>();

        ArrayList<Answser> arrayList45 = new ArrayList<>();
        arrayList45.add(new Answser("Và", false));
        arrayList45.add(new Answser("Sâu", false));
        arrayList45.add(new Answser("Cạn", false));
        arrayList45.add(new Answser("Tù", true));

        ArrayList<Answser> arrayList46 = new ArrayList<>();
        arrayList46.add(new Answser(" Bạch Tuộc ", true));
        arrayList46.add(new Answser(" Sứa", false));
        arrayList46.add(new Answser("Cá Heo ", false));
        arrayList46.add(new Answser("Cá Mập", false));

        ArrayList<Answser> arrayList47 = new ArrayList<>();
        arrayList47.add(new Answser("2010", true));
        arrayList47.add(new Answser("2009", false));
        arrayList47.add(new Answser("2011", false));
        arrayList47.add(new Answser("2012", false));

        ArrayList<Answser> arrayList48 = new ArrayList<>();
        arrayList48.add(new Answser("1", false));
        arrayList48.add(new Answser("2", false));
        arrayList48.add(new Answser("3 ", false));
        arrayList48.add(new Answser("4", true));

        arrayListquestion12.add(new Question(45, "Ao... nước đọng", arrayList45));
        arrayListquestion12.add(new Question(46, "Loài động vật nào có 3 tim, 8 chi và máu màu xanh", arrayList46));
        arrayListquestion12.add(new Question(47, "Thăng Long Hà Nội 1000 tuổi vào năm nào? ", arrayList47));
        arrayListquestion12.add(new Question(48, "Tim người gồm bao nhiêu ngăn? ", arrayList48));

        listquestion.add(arrayListquestion12);

        ArrayList<Question> arrayListquestion13 = new ArrayList<>();

        ArrayList<Answser> arrayList49 = new ArrayList<>();
        arrayList49.add(new Answser("Trọng Thủy", false));
        arrayList49.add(new Answser("Ngô Quyền", false));
        arrayList49.add(new Answser("Vua Hùng", false));
        arrayList49.add(new Answser("Thục Phán", true));

        ArrayList<Answser> arrayList50 = new ArrayList<>();
        arrayList50.add(new Answser(" Châu Á  ", true));
        arrayList50.add(new Answser(" Châu Âu", false));
        arrayList50.add(new Answser("Châu Đại Dương ", false));
        arrayList50.add(new Answser("Châu Phi ", false));

        ArrayList<Answser> arrayList51 = new ArrayList<>();
        arrayList51.add(new Answser("Núi Yên Tử", true));
        arrayList51.add(new Answser("Chùa Hương", false));
        arrayList51.add(new Answser("Núi Trúc", false));
        arrayList51.add(new Answser("Núi Bạch Mã", false));

        ArrayList<Answser> arrayList52 = new ArrayList<>();
        arrayList52.add(new Answser("Lương Thế Vinh", false));
        arrayList52.add(new Answser("Lê Long Dĩnh", false));
        arrayList52.add(new Answser("Nguyễn Hiền ", false));
        arrayList52.add(new Answser("Nguyễn Bỉnh Khiêm", true));

        arrayListquestion13.add(new Question(49, "Người dựng nên nước Âu Lạc là ai? ", arrayList49));
        arrayListquestion13.add(new Question(50, "Liên đoàn bóng đá Úc thuộc liên đoàn bóng đá nào?", arrayList50));
        arrayListquestion13.add(new Question(51, "Chùa Đồng lớn nhất Việt Nam ở đâu? ", arrayList51));
        arrayListquestion13.add(new Question(52, "Trạng gì quê đất Trung Am, Bạch Vân Cư Sĩ lấy làm hiệu riêng? ", arrayList52));

        listquestion.add(arrayListquestion13);


        ArrayList<Question> arrayListquestion14 = new ArrayList<>();

        ArrayList<Answser> arrayList53 = new ArrayList<>();
        arrayList53.add(new Answser("Pháo", false));
        arrayList53.add(new Answser("Nỏ", false));
        arrayList53.add(new Answser("Cung Tên", false));
        arrayList53.add(new Answser("Bomerang", true));

        ArrayList<Answser> arrayList54 = new ArrayList<>();
        arrayList54.add(new Answser("Câu Cầu Khiến ", true));
        arrayList54.add(new Answser(" Câu Cảm Thán", false));
        arrayList54.add(new Answser("Câu Hỏi ", false));
        arrayList54.add(new Answser("Câu Đố ", false));

        ArrayList<Answser> arrayList55 = new ArrayList<>();
        arrayList55.add(new Answser("Con Mắt", true));
        arrayList55.add(new Answser("Con Ngươi", false));
        arrayList55.add(new Answser("Lông Mày", false));
        arrayList55.add(new Answser("Mũi", false));

        ArrayList<Answser> arrayList56 = new ArrayList<>();
        arrayList56.add(new Answser("Đường Tròn Ngoại Tiêp", false));
        arrayList56.add(new Answser("Tâm Đường Tròn Ngoại Tiêp", false));
        arrayList56.add(new Answser("Đường Tròn Nội Tiêp ", false));
        arrayList56.add(new Answser("Tâm Đường Tròn Nội Tiêp", true));

        arrayListquestion14.add(new Question(53, "Tên vũ khí của thổ dân Úc có khả năng bay lại về vị trí cũ ", arrayList53));
        arrayListquestion14.add(new Question(54, "U nó không được thế! là kiểu câu gì?   ", arrayList54));
        arrayListquestion14.add(new Question(55, "Trên lông dưới lông, ở giữa không lông, phồng lên để ngắm, là con gì?", arrayList55));
        arrayListquestion14.add(new Question(56, "Giao điểm 3 đường trung trực của tam giác gọi là? ", arrayList56));

        listquestion.add(arrayListquestion14);



        ArrayList<Question> arrayListquestion15 = new ArrayList<>();

        ArrayList<Answser> arrayList57 = new ArrayList<>();
        arrayList57.add(new Answser("Pháo", false));
        arrayList57.add(new Answser("Nỏ", false));
        arrayList57.add(new Answser("Cung Tên", false));
        arrayList57.add(new Answser("Bomerang", true));

        ArrayList<Answser> arrayList58 = new ArrayList<>();
        arrayList58.add(new Answser("Câu Cầu Khiến ", true));
        arrayList58.add(new Answser(" Câu Cảm Thán", false));
        arrayList58.add(new Answser("Câu Hỏi ", false));
        arrayList58.add(new Answser("Câu Đố ", false));

        ArrayList<Answser> arrayList59 = new ArrayList<>();
        arrayList59.add(new Answser("Con Mắt", true));
        arrayList59.add(new Answser("Con Ngươi", false));
        arrayList59.add(new Answser("Lông Mày", false));
        arrayList59.add(new Answser("Mũi", false));

        ArrayList<Answser> arrayList60 = new ArrayList<>();
        arrayList60.add(new Answser("Đường Tròn Ngoại Tiêp", false));
        arrayList60.add(new Answser("Tâm Đường Tròn Ngoại Tiêp", false));
        arrayList60.add(new Answser("Đường Tròn Nội Tiêp ", false));
        arrayList60.add(new Answser("Tâm Đường Tròn Nội Tiêp", true));

        arrayListquestion15.add(new Question(57, "Tên vũ khí của thổ dân Úc có khả năng bay lại về vị trí cũ ", arrayList57));
        arrayListquestion15.add(new Question(58, "U nó không được thế! là kiểu câu gì?   ", arrayList58));
        arrayListquestion15.add(new Question(59, "Trên lông dưới lông, ở giữa không lông, phồng lên để ngắm, là con gì?", arrayList59));
        arrayListquestion15.add(new Question(60, "Giao điểm 3 đường trung trực của tam giác gọi là? ", arrayList60));

        listquestion.add(arrayListquestion15);



        return listquestion;
    }
}
