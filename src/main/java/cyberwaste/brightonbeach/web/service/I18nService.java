package cyberwaste.brightonbeach.web.service;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.domain.Card;

public interface I18nService {
    
    String accessDenied();
    String loggedOut();
    String youAreLoggedOut();
    String returnBack();
    String login();
    String loginInformation();
    String loginFailed();
    String loginFailedReason(String springSecurityMessage);
    String user();
    String password();
    String rememberMe();
    String title(String title);
    String cards();
    String userFullname(String username);
    String appliesFor(Card card);
    String applies();
    String view();
    String card();
    String search();
    String cardName();
    String showAll();
    String applyBy();
    String status();
    String status(String status);
    String apply(Apply apply);
    String applyForCard(Apply apply);
    String back();
    String accept();
    String reject();
    String information();
    String applyName();
    String newCard();
    String deleteCard();
    String editCard();
    String appliesForCard();
    String areYouSureToDelete(Card card);
    String confirmDeletion(Card card);
    String yes();
    String no();
    String card(Card card);
    String save();
    String attachedFiles();
    String fileName();
    String uploadFile();
    String chooseFile();
    String underConstruction();
    String download();
    String viewCard();
    String makeApply();
    String getApply();
}
