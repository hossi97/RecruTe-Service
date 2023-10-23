package com.hossi.recrute.common.response.service;

import java.util.HashMap;
import java.util.Map;

public enum RecruitmentCode implements ServiceCode {
    RCT001("채용공고 상세 페이지 조회"), RCT002("채용공고 지원");

    private final static Map<String, ServiceCode> codeBox = new HashMap<>();
    private final static ServicePrefix prefix = ServicePrefix.RCT;
    private final String description;

    RecruitmentCode(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    static Map<String, ServiceCode> getCodeBox() {
        ServiceCode.mapCodeBox(prefix, codeBox);
        return codeBox;
    }

    static ServicePrefix getPrefix() {
        return prefix;
    }
}
