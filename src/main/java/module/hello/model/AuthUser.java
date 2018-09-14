package module.hello.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author rumman
 * @since 9/14/18
 */
@XmlRootElement
public class AuthUser implements Serializable {

    public static final long serialVersionUID = 1L;

    private String username;

    private String address;

    @XmlElement
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @XmlElement
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
