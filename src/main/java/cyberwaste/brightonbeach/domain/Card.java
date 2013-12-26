package cyberwaste.brightonbeach.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "card")
public class Card implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(max = 100)
    @Column(name = "cardName")
    private String name;
    
    @Basic(optional = false)
    @NotNull
    @Size(max = 100)
    @Column(name = "author")
    private String author;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "documentDate")
    private Date documentDate;
    
    @Size(max = 100)
    @Column(name = "documentIndex")
    private String documentIndex;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "arriveDate")
    private Date arriveDate;
    
    @Size(max = 100)
    @Column(name = "index0")
    private String index;
    
    @Size(max = 100)
    @Column(name = "header")
    private String header;
    
    @Size(max = 100)
    @Column(name = "resolution")
    private String resolution;
    
    @Size(max = 100)
    @Column(name = "performer")
    private String performer;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "storageTerm")
    private Date storageTerm;
    
    @Size(max = 100)
    @Column(name = "done")
    private String done;
    
    @Column(name = "pageNumber")
    private Integer pageNumber;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "doneTerm")
    private Date doneTerm;
    
    @Size(max = 100)
    @Column(name = "termIncrement")
    private String termIncrement;
    
    @Size(max = 100)
    @Column(name = "conversionName")
    private String conversionName;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "conversionDate")
    private Date conversionDate;
    
    @Size(max = 100)
    @Column(name = "conversionAct")
    private String conversionAct;
    
    @Size(max = 100)
    @Column(name = "conversionActFileName")
    private String conversionActFileName;
    
    @Size(max = 100)
    @Column(name = "conversor")
    private String conversor;
    
    @Size(max = 100)
    @Column(name = "beforeConversionType")
    private String beforeConversionType;
    
    @Size(max = 100)
    @Column(name = "afterConversionType")
    private String afterConversionType;
    
    @Size(max = 100)
    @Column(name = "conversionVersion")
    private String conversionVersion;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "destroyDate")
    private Date destroyDate;
    
    @Size(max = 100)
    @Column(name = "destroyAct")
    private String destroyAct;
    
    @Size(max = 100)
    @Column(name = "destroyer")
    private String destroyer;
    
    @Size(max = 100)
    @Column(name = "technicalReview")
    private String technicalReview;
    
    @Size(max = 100)
    @Column(name = "reviewAct")
    private String reviewAct;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "arriveMessageDate")
    private Date arriveMessageDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "suggestionDate")
    private Date suggestionDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "editDate")
    private Date editDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "reviewDate")
    private Date reviewDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "suggestionReviewDate")
    private Date suggestionReviewDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "designReviewDate")
    private Date designReviewDate;
    
    @Size(max = 100)
    @Column(name = "unit")
    private String unit;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "unitDate")
    private Date unitDate;
    
    @Size(max = 100)
    @Column(name = "deal")
    private String deal;
    
    @Size(max = 100)
    @Column(name = "volume")
    private String volume;
    
    @Size(max = 100)
    @Column(name = "dealIndex")
    private String dealIndex;
    
    @Size(max = 100)
    @Column(name = "dealHeader")
    private String dealHeader;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dealTerm")
    private Date dealTerm;
    
    @Size(max = 100)
    @Column(name = "fund")
    private String fund;
    
    @Size(max = 100)
    @Column(name = "archiveEdrpou")
    private String archiveEdrpou;
    
    @Size(max = 100)
    @Column(name = "archiveName")
    private String archiveName;
    
    @Size(max = 100)
    @Column(name = "countryId")
    private String countryId;
    
    @Size(max = 100)
    @Column(name = "edrpou")
    private String edrpou;
    
    @Size(max = 100)
    @Column(name = "eMessageAcceptReject")
    private String eMessageAcceptReject;
    
    @Size(max = 100)
    @Column(name = "positionAcceptReject")
    private String positionAcceptReject;
    
    public void setId(Long id) {
        this.id = id;
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

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public String getDocumentIndex() {
        return documentIndex;
    }

    public void setDocumentIndex(String documentIndex) {
        this.documentIndex = documentIndex;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public Date getStorageTerm() {
        return storageTerm;
    }

    public void setStorageTerm(Date storageTerm) {
        this.storageTerm = storageTerm;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Date getDoneTerm() {
        return doneTerm;
    }

    public void setDoneTerm(Date doneTerm) {
        this.doneTerm = doneTerm;
    }

    public String getTermIncrement() {
        return termIncrement;
    }

    public void setTermIncrement(String termIncrement) {
        this.termIncrement = termIncrement;
    }

    public String getConversionName() {
        return conversionName;
    }

    public void setConversionName(String conversionName) {
        this.conversionName = conversionName;
    }

    public Date getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(Date conversionDate) {
        this.conversionDate = conversionDate;
    }

    public String getConversionAct() {
        return conversionAct;
    }

    public void setConversionAct(String conversionAct) {
        this.conversionAct = conversionAct;
    }

    public String getConversionActFileName() {
        return conversionActFileName;
    }

    public void setConversionActFileName(String conversionActFileName) {
        this.conversionActFileName = conversionActFileName;
    }

    public String getConversor() {
        return conversor;
    }

    public void setConversor(String conversor) {
        this.conversor = conversor;
    }

    public String getBeforeConversionType() {
        return beforeConversionType;
    }

    public void setBeforeConversionType(String beforeConversionType) {
        this.beforeConversionType = beforeConversionType;
    }

    public String getAfterConversionType() {
        return afterConversionType;
    }

    public void setAfterConversionType(String afterConversionType) {
        this.afterConversionType = afterConversionType;
    }

    public String getConversionVersion() {
        return conversionVersion;
    }

    public void setConversionVersion(String conversionVersion) {
        this.conversionVersion = conversionVersion;
    }

    public Date getDestroyDate() {
        return destroyDate;
    }

    public void setDestroyDate(Date destroyDate) {
        this.destroyDate = destroyDate;
    }

    public String getDestroyAct() {
        return destroyAct;
    }

    public void setDestroyAct(String destroyAct) {
        this.destroyAct = destroyAct;
    }

    public String getDestroyer() {
        return destroyer;
    }

    public void setDestroyer(String destroyer) {
        this.destroyer = destroyer;
    }

    public String getTechnicalReview() {
        return technicalReview;
    }

    public void setTechnicalReview(String technicalReview) {
        this.technicalReview = technicalReview;
    }

    public String getReviewAct() {
        return reviewAct;
    }

    public void setReviewAct(String reviewAct) {
        this.reviewAct = reviewAct;
    }

    public Date getArriveMessageDate() {
        return arriveMessageDate;
    }

    public void setArriveMessageDate(Date arriveMessageDate) {
        this.arriveMessageDate = arriveMessageDate;
    }

    public Date getSuggestionDate() {
        return suggestionDate;
    }

    public void setSuggestionDate(Date suggestionDate) {
        this.suggestionDate = suggestionDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Date getSuggestionReviewDate() {
        return suggestionReviewDate;
    }

    public void setSuggestionReviewDate(Date suggestionReviewDate) {
        this.suggestionReviewDate = suggestionReviewDate;
    }

    public Date getDesignReviewDate() {
        return designReviewDate;
    }

    public void setDesignReviewDate(Date designReviewDate) {
        this.designReviewDate = designReviewDate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Date getUnitDate() {
        return unitDate;
    }

    public void setUnitDate(Date unitDate) {
        this.unitDate = unitDate;
    }

    public String getDeal() {
        return deal;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getDealIndex() {
        return dealIndex;
    }

    public void setDealIndex(String dealIndex) {
        this.dealIndex = dealIndex;
    }

    public String getDealHeader() {
        return dealHeader;
    }

    public void setDealHeader(String dealHeader) {
        this.dealHeader = dealHeader;
    }

    public Date getDealTerm() {
        return dealTerm;
    }

    public void setDealTerm(Date dealTerm) {
        this.dealTerm = dealTerm;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getArchiveEdrpou() {
        return archiveEdrpou;
    }

    public void setArchiveEdrpou(String archiveEdrpou) {
        this.archiveEdrpou = archiveEdrpou;
    }

    public String getArchiveName() {
        return archiveName;
    }

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getEdrpou() {
        return edrpou;
    }

    public void setEdrpou(String edrpou) {
        this.edrpou = edrpou;
    }

    public String geteMessageAcceptReject() {
        return eMessageAcceptReject;
    }

    public void seteMessageAcceptReject(String eMessageAcceptReject) {
        this.eMessageAcceptReject = eMessageAcceptReject;
    }

    public String getPositionAcceptReject() {
        return positionAcceptReject;
    }

    public void setPositionAcceptReject(String positionAcceptReject) {
        this.positionAcceptReject = positionAcceptReject;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        
        if (!(obj instanceof Card)) return false;
        Card other = (Card) obj;
        
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        equalsBuilder.append(this.id, other.id);
        return equalsBuilder.isEquals();
    }
    
    @Override
    public int hashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        hashCodeBuilder.append(id);
        return hashCodeBuilder.hashCode();
    }
    
    @Override
    public String toString() {
        ToStringBuilder toStringBuilder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
        toStringBuilder.append("id", id).append("name", name);
        return toStringBuilder.toString();
    }
    
    // conventional getters
    
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
