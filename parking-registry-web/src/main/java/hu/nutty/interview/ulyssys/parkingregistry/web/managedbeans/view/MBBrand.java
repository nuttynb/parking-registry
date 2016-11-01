package hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.view;

import hu.nutty.interview.ulyssys.parkingregistry.vo.enums.Brand;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean(name = "brandBean")
@ViewScoped
public class MBBrand implements Serializable {

    private static final long serialVersionUID = 23562834658742365L;

    private Brand[] brands;

    public MBBrand() {
        brands = Brand.values();
    }

    public Brand[] getBrands() {
        return brands;
    }

    public void setBrands(Brand[] brands) {
        this.brands = brands;
    }
}
