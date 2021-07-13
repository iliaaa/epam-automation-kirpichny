package forms;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import jdi.entities.MetalsAndColors;

public class MetalsAndColorsForm extends Form<MetalsAndColors> {

    @UI("[name=custom_radio_odd")
    private RadioButtons summaryElementOdd;

    @UI("[name=custom_radio_even]")
    private RadioButtons summaryElementEven;

    @UI(".summ-res")
    private UIElement summary;

    @JDropdown(root = "#colors", value = ".filter-option", list = "li", expand = ".caret")
    private Dropdown colors;

    @JDropdown(root = "#metals", value = ".filter-option", list = "li", expand = ".caret")
    private Dropdown metals;

    @Css("#elements-checklist input")
    private Checklist elements;

    @Css("#salad-dropdown  input")
    private Checklist vegetables;

    @JDropdown(root = "#vegetables", list = "li", expand = ".caret")
    private Button buttonForVegetables;

    @FindBy(id = "submit-button")
    private Button submit;

    public void fill(MetalsAndColors data) {
        summaryElementEven.select(data.getSummary().get(1));
        summaryElementOdd.select(data.getSummary().get(0));
        data.getElements().forEach(elements::select);
        colors.select(data.getColor());
        metals.select(data.getMetals());
        buttonForVegetables.click();
        data.getVegetables().forEach(vegetables::select);
        submit.click();
    }
}
