package com.jaguarcode.guestbook.service;

import com.jaguarcode.guestbook.dto.GuestbookDTO;
import com.jaguarcode.guestbook.dto.PageRequestDTO;
import com.jaguarcode.guestbook.dto.PageResultDTO;
import com.jaguarcode.guestbook.entity.Guestbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GuestbookServiceTests {

    @Autowired
    private GuestbookService service;

    @Test
    public void testGetDTOList() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();
        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);

        for(GuestbookDTO dto : resultDTO.getDtoList()) {
            System.out.println(dto);
        }
    }
}
