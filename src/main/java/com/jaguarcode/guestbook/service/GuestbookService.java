package com.jaguarcode.guestbook.service;

import com.jaguarcode.guestbook.dto.GuestbookDTO;
import com.jaguarcode.guestbook.dto.PageRequestDTO;
import com.jaguarcode.guestbook.dto.PageResultDTO;
import com.jaguarcode.guestbook.entity.Guestbook;

public interface GuestbookService {

    // Register
    Long register(GuestbookDTO dto);

    // Get List
    PageResultDTO<GuestbookDTO, Guestbook> getList(PageRequestDTO requestDTO);

    // Read
    GuestbookDTO read(Long gno);

    // Remove
    void remove(Long gno);

    // Modify
    void modify(GuestbookDTO dto);

    default Guestbook dtoToEntity(GuestbookDTO dto) {
        Guestbook entity = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return entity;
    }

    default GuestbookDTO entityToDto(Guestbook entity) {
        GuestbookDTO dto = GuestbookDTO.builder()
                .gno(entity.getGno())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writer(entity.getWriter())
                .regDate(entity.getRegdate())
                .modDate(entity.getModdate())
                .build();
        return dto;
    }
}
