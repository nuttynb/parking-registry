package hu.nutty.interview.ulyssys.parkingregistry.web.validator;

import hu.nutty.interview.ulyssys.parkingregistry.web.managedbeans.view.MBCar;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "licensePlateNumberValidator")
public class LicensePlateNumberValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        MBCar car = facesContext.getApplication().evaluateExpressionGet(facesContext, "#{carBean}", MBCar.class);
        if (car.findCarByLicensePlateNumber((String) o) != null) {
            FacesMessage msg = new FacesMessage("License plate number validation failed. It has to be unique.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
