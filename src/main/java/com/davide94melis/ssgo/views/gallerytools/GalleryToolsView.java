package com.davide94melis.ssgo.views.gallerytools;

import com.davide94melis.ssgo.components.avataritem.AvatarItem;
import com.davide94melis.ssgo.components.phonenumberfield.PhoneNumberField;
import com.davide94melis.ssgo.components.pricefield.PriceField;
import com.davide94melis.ssgo.data.SamplePerson;
import com.davide94melis.ssgo.services.SamplePersonService;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.avatar.AvatarGroup;
import com.vaadin.flow.component.avatar.AvatarGroup.AvatarGroupItem;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.combobox.MultiSelectComboBox;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.listbox.MultiSelectListBox;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.messages.MessageList;
import com.vaadin.flow.component.messages.MessageListItem;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Gallery Tools")
@Menu(icon = "line-awesome/svg/user-lock-solid.svg", order = 8)
@Route(value = "gallery-tools")
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class GalleryToolsView extends Composite<VerticalLayout> {

    public GalleryToolsView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H3 h3 = new H3();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Paragraph textMedium = new Paragraph();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        Avatar avatar = new Avatar();
        AvatarGroup avatarGroup = new AvatarGroup();
        AvatarItem avatarItem = new AvatarItem();
        Span badge = new Span();
        Icon icon = new Icon();
        Hr hr = new Hr();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        Button buttonTertiary = new Button();
        MenuBar menuBar = new MenuBar();
        MenuBar menu = new MenuBar();
        Anchor link = new Anchor();
        TextField textField = new TextField();
        EmailField emailField = new EmailField();
        PhoneNumberField phoneNumber = new PhoneNumberField();
        NumberField numberField = new NumberField();
        PasswordField passwordField = new PasswordField();
        PriceField price = new PriceField();
        TextArea textArea = new TextArea();
        ComboBox comboBox = new ComboBox();
        MultiSelectComboBox multiSelectComboBox = new MultiSelectComboBox();
        Checkbox checkbox = new Checkbox();
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        RadioButtonGroup radioGroup = new RadioButtonGroup();
        TimePicker timePicker = new TimePicker();
        DatePicker datePicker = new DatePicker();
        DateTimePicker dateTimePicker = new DateTimePicker();
        RichTextEditor richTextEditor = new RichTextEditor();
        ProgressBar progressBar = new ProgressBar();
        MessageInput messageInput = new MessageInput();
        MessageList messageList = new MessageList();
        Details details = new Details();
        Accordion accordion = new Accordion();
        Tabs tabs = new Tabs();
        TabSheet tabSheet = new TabSheet();
        MultiSelectListBox textItems = new MultiSelectListBox();
        MultiSelectListBox avatarItems = new MultiSelectListBox();
        Grid basicGrid = new Grid(SamplePerson.class);
        VerticalLayout layoutColumn4 = new VerticalLayout();
        Paragraph textMedium2 = new Paragraph();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        H3 h32 = new H3();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h3.setText("Header");
        h3.setWidth("max-content");
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn2.getStyle().set("flex-grow", "1");
        textMedium.setText("Left Side content");
        textMedium.setWidth("100%");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        avatar.setName("Firstname Lastname");
        avatarGroup.setWidth("min-content");
        setAvatarGroupSampleData(avatarGroup);
        avatarItem.setWidth("min-content");
        setAvatarItemSampleData(avatarItem);
        badge.setText("Badge");
        badge.setWidth("min-content");
        badge.getElement().getThemeList().add("badge");
        icon.setIcon("lumo:user");
        buttonPrimary.setText("Button");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Button");
        buttonSecondary.setWidth("min-content");
        buttonTertiary.setText("Button");
        buttonTertiary.setWidth("min-content");
        buttonTertiary.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        menu.setWidth("min-content");
        setMenuSampleData(menu);
        link.setText("LINK");
        link.setHref("#");
        link.setWidth("min-content");
        textField.setLabel("Text field");
        textField.setWidth("min-content");
        emailField.setLabel("Email");
        emailField.setWidth("min-content");
        phoneNumber.setLabel("Phone number");
        phoneNumber.setWidth("min-content");
        numberField.setLabel("Number field");
        numberField.setWidth("min-content");
        passwordField.setLabel("Password field");
        passwordField.setWidth("min-content");
        price.setLabel("Price");
        price.setWidth("min-content");
        textArea.setLabel("Text area");
        textArea.setWidth("100%");
        comboBox.setLabel("Combo Box");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        multiSelectComboBox.setLabel("Multi-Select Combo Box");
        multiSelectComboBox.setWidth("min-content");
        setMultiSelectComboBoxSampleData(multiSelectComboBox);
        checkbox.setLabel("Checkbox");
        checkbox.setWidth("min-content");
        checkboxGroup.setLabel("Checkbox Group");
        checkboxGroup.setWidth("min-content");
        checkboxGroup.setItems("Order ID", "Product Name", "Customer", "Status");
        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        radioGroup.setLabel("Radio Group");
        radioGroup.setWidth("min-content");
        radioGroup.setItems("Order ID", "Product Name", "Customer", "Status");
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        timePicker.setLabel("Time picker");
        timePicker.setWidth("min-content");
        datePicker.setLabel("Date picker");
        datePicker.setWidth("min-content");
        dateTimePicker.setLabel("Date time picker");
        dateTimePicker.setWidth("min-content");
        richTextEditor.setWidth("100%");
        progressBar.setValue(0.5);
        messageInput.setWidth("min-content");
        messageList.setWidth("100%");
        setMessageListSampleData(messageList);
        details.setWidth("100%");
        setDetailsSampleData(details);
        accordion.setWidth("100%");
        setAccordionSampleData(accordion);
        tabs.setWidth("100%");
        setTabsSampleData(tabs);
        tabSheet.setWidth("100%");
        setTabSheetSampleData(tabSheet);
        textItems.setWidth("min-content");
        setMultiSelectListBoxSampleData(textItems);
        avatarItems.setWidth("min-content");
        setAvatarItemsSampleData(avatarItems);
        basicGrid.setWidth("100%");
        basicGrid.getStyle().set("flex-grow", "0");
        setGridSampleData(basicGrid);
        layoutColumn4.getStyle().set("flex-grow", "1");
        textMedium2.setText("Right side content");
        textMedium2.setWidth("100%");
        textMedium2.getStyle().set("font-size", "var(--lumo-font-size-m)");
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        h32.setText("Footer");
        h32.setWidth("max-content");
        getContent().add(layoutRow);
        layoutRow.add(h3);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(textMedium);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(avatar);
        layoutColumn3.add(avatarGroup);
        layoutColumn3.add(avatarItem);
        layoutColumn3.add(badge);
        layoutColumn3.add(icon);
        layoutColumn3.add(hr);
        layoutColumn3.add(buttonPrimary);
        layoutColumn3.add(buttonSecondary);
        layoutColumn3.add(buttonTertiary);
        layoutColumn3.add(menuBar);
        layoutColumn3.add(menu);
        layoutColumn3.add(link);
        layoutColumn3.add(textField);
        layoutColumn3.add(emailField);
        layoutColumn3.add(phoneNumber);
        layoutColumn3.add(numberField);
        layoutColumn3.add(passwordField);
        layoutColumn3.add(price);
        layoutColumn3.add(textArea);
        layoutColumn3.add(comboBox);
        layoutColumn3.add(multiSelectComboBox);
        layoutColumn3.add(checkbox);
        layoutColumn3.add(checkboxGroup);
        layoutColumn3.add(radioGroup);
        layoutColumn3.add(timePicker);
        layoutColumn3.add(datePicker);
        layoutColumn3.add(dateTimePicker);
        layoutColumn3.add(richTextEditor);
        layoutColumn3.add(progressBar);
        layoutColumn3.add(messageInput);
        layoutColumn3.add(messageList);
        layoutColumn3.add(details);
        layoutColumn3.add(accordion);
        layoutColumn3.add(tabs);
        layoutColumn3.add(tabSheet);
        layoutColumn3.add(textItems);
        layoutColumn3.add(avatarItems);
        layoutColumn3.add(basicGrid);
        layoutRow2.add(layoutColumn4);
        layoutColumn4.add(textMedium2);
        getContent().add(layoutRow3);
        layoutRow3.add(h32);
    }

    private void setAvatarGroupSampleData(AvatarGroup avatarGroup) {
        avatarGroup.add(new AvatarGroupItem("A B"));
        avatarGroup.add(new AvatarGroupItem("C D"));
        avatarGroup.add(new AvatarGroupItem("E F"));
    }

    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading("Aria Bailey");
        avatarItem.setDescription("Endocrinologist");
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }

    private void setMenuSampleData(MenuBar menuBar) {
        menuBar.addThemeVariants(MenuBarVariant.LUMO_ICON);
        MenuItem share = menuBar.addItem(new Text("Share"));
        share.add(new Icon(VaadinIcon.ANGLE_DOWN));
        SubMenu shareSubMenu = share.getSubMenu();
        MenuItem onSocialMedia = shareSubMenu.addItem("On social media");
        SubMenu socialMediaSubMenu = onSocialMedia.getSubMenu();
        socialMediaSubMenu.addItem("Facebook");
        socialMediaSubMenu.addItem("Twitter");
        socialMediaSubMenu.addItem("Instagram");
        shareSubMenu.addItem("By email");
        shareSubMenu.addItem("Get Link");
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }

    private void setMultiSelectComboBoxSampleData(MultiSelectComboBox multiSelectComboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        multiSelectComboBox.setItems(sampleItems);
        multiSelectComboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }

    private void setMessageListSampleData(MessageList messageList) {
        MessageListItem message1 = new MessageListItem("Nature does not hurry, yet everything gets accomplished.",
                LocalDateTime.now().minusDays(1).toInstant(ZoneOffset.UTC), "Matt Mambo");
        message1.setUserColorIndex(1);
        MessageListItem message2 = new MessageListItem(
                "Using your talent, hobby or profession in a way that makes you contribute with something good to this world is truly the way to go.",
                LocalDateTime.now().minusMinutes(55).toInstant(ZoneOffset.UTC), "Linsey Listy");
        message2.setUserColorIndex(2);
        messageList.setItems(message1, message2);
    }

    private void setDetailsSampleData(Details details) {
        Span name = new Span("Sophia Williams");
        Span email = new Span("sophia.williams@company.com");
        Span phone = new Span("(501) 555-9128");
        VerticalLayout content = new VerticalLayout(name, email, phone);
        content.setSpacing(false);
        content.setPadding(false);
        details.setSummaryText("Contact information");
        details.setOpened(true);
        details.setContent(content);
    }

    private void setAccordionSampleData(Accordion accordion) {
        Span name = new Span("Sophia Williams");
        Span email = new Span("sophia.williams@company.com");
        Span phone = new Span("(501) 555-9128");
        VerticalLayout personalInformationLayout = new VerticalLayout(name, email, phone);
        personalInformationLayout.setSpacing(false);
        personalInformationLayout.setPadding(false);
        accordion.add("Personal information", personalInformationLayout);
        Span street = new Span("4027 Amber Lake Canyon");
        Span zipCode = new Span("72333-5884 Cozy Nook");
        Span city = new Span("Arkansas");
        VerticalLayout billingAddressLayout = new VerticalLayout();
        billingAddressLayout.setSpacing(false);
        billingAddressLayout.setPadding(false);
        billingAddressLayout.add(street, zipCode, city);
        accordion.add("Billing address", billingAddressLayout);
        Span cardBrand = new Span("Mastercard");
        Span cardNumber = new Span("1234 5678 9012 3456");
        Span expiryDate = new Span("Expires 06/21");
        VerticalLayout paymentLayout = new VerticalLayout();
        paymentLayout.setSpacing(false);
        paymentLayout.setPadding(false);
        paymentLayout.add(cardBrand, cardNumber, expiryDate);
        accordion.add("Payment", paymentLayout);
    }

    private void setTabsSampleData(Tabs tabs) {
        tabs.add(new Tab("Dashboard"));
        tabs.add(new Tab("Payment"));
        tabs.add(new Tab("Shipping"));
    }

    private void setTabSheetSampleData(TabSheet tabSheet) {
        tabSheet.add("Dashboard", new Div(new Text("This is the Dashboard tab content")));
        tabSheet.add("Payment", new Div(new Text("This is the Payment tab content")));
        tabSheet.add("Shipping", new Div(new Text("This is the Shipping tab content")));
    }

    private void setMultiSelectListBoxSampleData(MultiSelectListBox multiSelectListBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        multiSelectListBox.setItems(sampleItems);
        multiSelectListBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
        multiSelectListBox.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }

    private void setAvatarItemsSampleData(MultiSelectListBox multiSelectListBox) {
        record Person(String name, String profession) {
        }
        ;
        List<Person> data = List.of(new Person("Aria Bailey", "Endocrinologist"), new Person("Aaliyah Butler", "Nephrologist"), new Person("Eleanor Price", "Ophthalmologist"), new Person("Allison Torres", "Allergist"), new Person("Madeline Lewis", "Gastroenterologist"));
        multiSelectListBox.setItems(data);
        multiSelectListBox.setRenderer(new ComponentRenderer(item -> {
            AvatarItem avatarItem = new AvatarItem();
            avatarItem.setHeading(((Person) item).name);
            avatarItem.setDescription(((Person) item).profession);
            avatarItem.setAvatar(new Avatar(((Person) item).name));
            return avatarItem;
        }));
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;
}
