package com.github.mkolisnyk.cucumber.reporting.types.retrospective;

public class RetrospectiveModel {
    private String reportSuffix;
    private String title;
    private String mask;
    private RetrospectiveOrderBy orderBy;
    private String redirectTo;
    private int refreshTimeout;
    private int width;
    private int height;
    public RetrospectiveModel(String reportSuffixValue, String titleValue, String maskValue,
            RetrospectiveOrderBy orderByValue, String redirectToValue, int refreshTimeoutValue) {
        super();
        this.reportSuffix = reportSuffixValue;
        this.title = titleValue;
        this.mask = maskValue;
        this.orderBy = orderByValue;
        this.redirectTo = redirectToValue;
        this.refreshTimeout = refreshTimeoutValue;
    }
    public RetrospectiveModel(String reportSuffixValue, String titleValue, String maskValue,
            RetrospectiveOrderBy orderByValue) {
        this(reportSuffixValue, titleValue, maskValue, orderByValue, "", 0);
    }
    public RetrospectiveModel(String reportSuffixValue, String titleValue, String maskValue) {
        this(reportSuffixValue, titleValue, maskValue, RetrospectiveOrderBy.DATE_CREATED);
    }
    public RetrospectiveModel(String reportSuffixValue, String titleValue) {
        this(reportSuffixValue, titleValue, "(.*)");
    }
    public RetrospectiveModel(String reportSuffixValue) {
        this(reportSuffixValue, "Retrospective Results");
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String titleValue) {
        this.title = titleValue;
    }
    public String getMask() {
        return mask;
    }
    public void setMask(String maskValue) {
        this.mask = maskValue;
    }
    public RetrospectiveOrderBy getOrderBy() {
        return orderBy;
    }
    public void setOrderBy(RetrospectiveOrderBy orderByValue) {
        this.orderBy = orderByValue;
    }
    public String getReportSuffix() {
        return reportSuffix;
    }
    public void setReportSuffix(String reportSuffixValue) {
        this.reportSuffix = reportSuffixValue;
    }
    public String getRedirectTo() {
        return redirectTo;
    }
    public void setRedirectTo(String redirectToValue) {
        this.redirectTo = redirectToValue;
    }
    public int getRefreshTimeout() {
        return refreshTimeout;
    }
    public void setRefreshTimeout(int refreshTimeoutValue) {
        this.refreshTimeout = refreshTimeoutValue;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int widthValue) {
        this.width = widthValue;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int heightValue) {
        this.height = heightValue;
    }
}
