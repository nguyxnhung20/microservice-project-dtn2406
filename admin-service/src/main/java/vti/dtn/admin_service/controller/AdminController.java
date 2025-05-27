package vti.dtn.admin_service.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vti.dtn.admin_service.dto.AccountDTO;
import vti.dtn.admin_service.dto.DepartmentDTO;
import vti.dtn.admin_service.service.AdminService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/admin")
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/accounts")
    public List<AccountDTO> getAccounts() {
        return adminService.getAccounts();
    }

    @GetMapping("/departments")
    public List<DepartmentDTO> getDepartments() {
        return adminService.getDepartments();
    }

}
