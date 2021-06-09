package ac.cn.spring.entity;

import java.util.Date;

public class sample {
    private Integer sampleId;

    private String sampleAccession;

    private String originalSampleName;

    private String sampleName;

    private String indvAccession;

    private String prjAccession;

    private String prjCode;

    private String studyAccession;

    private String tumorType;

    private String primarySite;

    private String countryRegionsCode;

    private String organization;

    private String tissueType;

    private String indvIndex;

    private Boolean ffpe;

    private Boolean sampleAvailable;

    private String matchedSample;

    private Date collectionDate;

    public Integer getSampleId() {
        return sampleId;
    }

    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    public String getSampleAccession() {
        return sampleAccession;
    }

    public void setSampleAccession(String sampleAccession) {
        this.sampleAccession = sampleAccession == null ? null : sampleAccession.trim();
    }

    public String getOriginalSampleName() {
        return originalSampleName;
    }

    public void setOriginalSampleName(String originalSampleName) {
        this.originalSampleName = originalSampleName == null ? null : originalSampleName.trim();
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName == null ? null : sampleName.trim();
    }

    public String getIndvAccession() {
        return indvAccession;
    }

    public void setIndvAccession(String indvAccession) {
        this.indvAccession = indvAccession == null ? null : indvAccession.trim();
    }

    public String getPrjAccession() {
        return prjAccession;
    }

    public void setPrjAccession(String prjAccession) {
        this.prjAccession = prjAccession == null ? null : prjAccession.trim();
    }

    public String getPrjCode() {
        return prjCode;
    }

    public void setPrjCode(String prjCode) {
        this.prjCode = prjCode == null ? null : prjCode.trim();
    }

    public String getStudyAccession() {
        return studyAccession;
    }

    public void setStudyAccession(String studyAccession) {
        this.studyAccession = studyAccession == null ? null : studyAccession.trim();
    }

    public String getTumorType() {
        return tumorType;
    }

    public void setTumorType(String tumorType) {
        this.tumorType = tumorType == null ? null : tumorType.trim();
    }

    public String getPrimarySite() {
        return primarySite;
    }

    public void setPrimarySite(String primarySite) {
        this.primarySite = primarySite == null ? null : primarySite.trim();
    }

    public String getCountryRegionsCode() {
        return countryRegionsCode;
    }

    public void setCountryRegionsCode(String countryRegionsCode) {
        this.countryRegionsCode = countryRegionsCode == null ? null : countryRegionsCode.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getTissueType() {
        return tissueType;
    }

    public void setTissueType(String tissueType) {
        this.tissueType = tissueType == null ? null : tissueType.trim();
    }

    public String getIndvIndex() {
        return indvIndex;
    }

    public void setIndvIndex(String indvIndex) {
        this.indvIndex = indvIndex == null ? null : indvIndex.trim();
    }

    public Boolean getFfpe() {
        return ffpe;
    }

    public void setFfpe(Boolean ffpe) {
        this.ffpe = ffpe;
    }

    public Boolean getSampleAvailable() {
        return sampleAvailable;
    }

    public void setSampleAvailable(Boolean sampleAvailable) {
        this.sampleAvailable = sampleAvailable;
    }

    public String getMatchedSample() {
        return matchedSample;
    }

    public void setMatchedSample(String matchedSample) {
        this.matchedSample = matchedSample == null ? null : matchedSample.trim();
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }
}