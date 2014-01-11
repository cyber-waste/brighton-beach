package cyberwaste.brightonbeach.web.service;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.User;

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
    String areYouSureToDeleteCard(Card card);
    String confirmCardDeletion(Card card);
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
    String applyWasMadeFor(Apply apply);
    String applyWasAccepted(Apply apply);
    String applyWasAlreadyResolved(Apply apply);
    String applyWasRejected(Apply apply);
    String cardWasSaved(Card card);
    String cardWasDeleted(Card card);
    String users();
    String newUser();
    String deleteUser();
    String editUser();
    String appliesForUser();
    String userFullname();
    String userRole();
    String userRole(String role);
    String user(User user);
    String userWasSaved(User userToSave);
    String areYouSureToDeleteUser(User user);
    String confirmUserDeletion(User user);
    String userCantDeleteItself();
    String userWasDeleted(User userToDelete);
    String cardAuthor();
    String cardDocumentDate();
    String cardDocumentIndex();
    String cardArriveDate();
    String cardIndex();
    String cardHeader();
    String cardResolution();
    String cardPerformer();
    String cardStorageTerm();
    String cardDone();
    String cardPageNumber();
    String cardDoneTerm();
    String cardTermIncrement();
    String cardConversionName();
    String cardConversionDate();
    String cardConversionAct();
    String cardConversionActFileName();
    String cardConversor();
    String cardBeforeConversionType();
    String cardAfterConversionType();
    String cardConversionVersion();
    String cardDestroyDate();
    String cardDestroyAct();
    String cardDestroyer();
    String cardTechnicalReview();
    String cardReviewAct();
    String cardArriveMessageDate();
    String cardEditDate();
    String cardReviewDate();
    String cardSuggestionReviewDate();
    String cardDesignReviewDate();
    String cardUnit();
    String cardUnitDate();
    String cardDeal();
    String cardVolume();
    String cardDealIndex();
    String cardDealHeader();
    String cardDealTerm();
    String cardFund();
    String cardArchiveEdrpou();
    String cardArchiveName();
    String cardCountryId();
    String cardEdrpou();
    String cardEMessageAcceptReject();
    String cardPositionAcceptReject();
    String guide();
    String developers();
}
