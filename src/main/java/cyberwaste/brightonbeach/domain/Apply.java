package cyberwaste.brightonbeach.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "apply")
public class Apply implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Basic(optional = false)
    @NotNull
    @Size(max = 40)
    @Column(name = "name", unique=true)
    private String name;
    
    @Basic(optional = false)
    @NotNull
    @Size(max = 40)
    @Column(name = "state", unique=true)
    private String state;

    @JoinColumn(name = "card_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Card card;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private User user;

    public Apply() {}

    public Apply(Long id) {
        this.id = id;
    }

    public Apply(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Card getCard() {
        return card;
    }
    
    public void setCard(Card card) {
        this.card = card;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        
        if (!(obj instanceof Apply)) return false;
        Apply other = (Apply) obj;
        
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
    
    // business methods
    
    public void applyState(ApplyState applyState) {
        setState(applyState.name());
    }
}
