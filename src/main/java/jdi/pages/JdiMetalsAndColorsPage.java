package jdi.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import forms.MetalsAndColorsForm;
import jdi.entities.MetalsAndColors;

public class JdiMetalsAndColorsPage extends WebPage {

    public MetalsAndColorsForm metalsAndColorsForm;

    public void fill(MetalsAndColors metalsAndColors) {
        metalsAndColorsForm.fill(metalsAndColors);
    }

}
