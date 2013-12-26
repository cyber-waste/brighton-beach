package cyberwaste.brightonbeach.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cyberwaste.brightonbeach.domain.Apply;
import cyberwaste.brightonbeach.domain.ApplyState;
import cyberwaste.brightonbeach.domain.Card;
import cyberwaste.brightonbeach.domain.User;
import cyberwaste.brightonbeach.web.service.I18nService;
import cyberwaste.brightonbeach.web.service.UserService;

@Service("i18nService")
public class I18nServiceImpl implements I18nService {
    
    @Autowired
    private UserService userService;
    
    @Override
    public String accessDenied() {
        return "Доступ заборонено!";
    }

    @Override
    public String loggedOut() {
        return "Вихід";
    }

    @Override
    public String youAreLoggedOut() {
        return "Ви вийшли із системи";
    }

    @Override
    public String returnBack() {
        return "Повернутися назад";
    }

    @Override
    public String login() {
        return "Увійти";
    }

    @Override
    public String loginInformation() {
        return "Інформація для входу";
    }

    @Override
    public String loginFailed() {
        return "Вхід неможливий";
    }

    @Override
    public String loginFailedReason(String springSecurityMessage) {
        if ("Bad credentials".equals(springSecurityMessage)) {
            return "Неправильні логін чи пароль";
        }
        return "Причина: " + springSecurityMessage;
    }

    @Override
    public String user() {
        return "Користувач";
    }

    @Override
    public String password() {
        return "Пароль";
    }

    @Override
    public String rememberMe() {
        return "Запам'ятати мене";
    };
    
    @Override
    public String title(String title) {
        return "Електроний архів документів :: " + title;
    }
    
    @Override
    public String cards() {
        return "Картки";
    }
    
    @Override
    public String userFullname(String username) {
        if (username == null) {
            return "Анонінмий користувач";
        }
        return user(userService.getUser(username));
    }
    
    @Override
    public String appliesFor(Card card) {
        if (card == null) {
            return applies();
        }
        return "Заявки на картку '" + card.getName() + "'";
    }
    
    @Override
    public String applies() {
        return "Заявки";
    }
    
    @Override
    public String view() {
        return "Переглянути";
    }
    
    @Override
    public String card() {
        return "Картка";
    }
    
    @Override
    public String search() {
        return "Пошук";
    }
    
    @Override
    public String cardName() {
        return "Назва картки";
    }
    
    @Override
    public String showAll() {
        return "Показати всі";
    }
    
    @Override
    public String applyBy() {
        return "Заявку подав";
    }
    
    @Override
    public String status() {
        return "Статус";
    }
    
    @Override
    public String status(String status) {
        switch (ApplyState.valueOf(status)) {
            case OPEN: return "Очікує розгляду";
            
            case ACCEPTED: return "Прийнята";
            
            case REJECTED: return "Відхилена";
            
            default: return "Невідомо";
        }
    }
    
    @Override
    public String apply(Apply apply) {
        return "Заявка '" + apply.getName() + "'";
    }
    
    @Override
    public String applyForCard(Apply apply) {
        return "Заявка '" + apply.getName() + "' на картку '" + apply.getCard().getName() + "'";
    }
    
    @Override
    public String back() {
        return "Назад";
    }
    
    @Override
    public String accept() {
        return "Прийняти";
    }
    
    @Override
    public String reject() {
        return "Відхилити";
    }
    
    @Override
    public String information() {
        return "Інформація";
    }
    
    @Override
    public String applyName() {
        return "Назва заявки";
    }
    
    @Override
    public String newCard() {
        return "Створити нову картку";
    }
    
    @Override
    public String deleteCard() {
        return "Видалити картку";
    }
    
    @Override
    public String editCard() {
        return "Редагувати картку";
    }
    
    @Override
    public String appliesForCard() {
        return "Переглянути заявки на картку";
    }
    
    @Override
    public String areYouSureToDeleteCard(Card card) {
        if (card == null) {
            return "Ви дійсно бажаєте видалити картку?";
        }
        return "Ви дійсно бажаєте видалити картку '" + card.getName() + "'?";
    }
    
    @Override
    public String confirmCardDeletion(Card card) {
        if (card == null) {
            return "Підтвердіть видалення картки";
        }
        return "Підтвердіть видалення картки '" + card.getName() + "'";
    }
    
    @Override
    public String no() {
        return "Ні";
    }
    
    @Override
    public String yes() {
        return "Так";
    }
    
    @Override
    public String card(Card card) {
        if (card.getId() == null) {
            return "Нова картка";
        }
        return "Картка '" + card.getName() + "'";
    }
    
    @Override
    public String save() {
        return "Зберегти зміни";
    }
    
    @Override
    public String attachedFiles() {
        return "Прикріплені файли";
    }
    
    @Override
    public String fileName() {
        return "Ім'я файлу";
    }
    
    @Override
    public String uploadFile() {
        return "Завантажити файл";
    }
    
    @Override
    public String chooseFile() {
        return "Вибрати файли";
    }
    
    @Override
    public String underConstruction() {
        return "У розробці";
    }
    
    @Override
    public String download() {
        return "Завантажити файл";
    }
    
    @Override
    public String viewCard() {
        return "Переглянути картку";
    }
    
    @Override
    public String makeApply() {
        return "Подати заявку";
    }
    
    @Override
    public String getApply() {
        return "Отримати картку";
    }

    @Override
    public String applyWasMadeFor(Apply apply) {
        return "Заявка на картку '" + apply.getCard().getName() + "' подана";
    }

    @Override
    public String applyWasAccepted(Apply apply) {
        return "Заявка користувача " + apply.getUser().getFullname() + " на картку '" + apply.getCard().getName() + "' прийнята";
    }

    @Override
    public String applyWasAlreadyResolved(Apply apply) {
        return "Заявка користувача " + apply.getUser().getFullname() + " на картку '" + apply.getCard().getName() + "' уже вирішена";
    }

    @Override
    public String applyWasRejected(Apply apply) {
        return "Заявка користувача " + apply.getUser().getFullname() + " на картку '" + apply.getCard().getName() + "' відхилена";
    }

    @Override
    public String cardWasSaved(Card card) {
        return "Картка '" + card.getName() + "' збережена";
    }

    @Override
    public String cardWasDeleted(Card card) {
        return "Картка '" + card.getName() + "' видалена";
    }
    
    @Override
    public String users() {
        return "Користувачі";
    }
    
    @Override
    public String newUser() {
        return "Створити нового користувача";
    }
    
    @Override
    public String deleteUser() {
        return "Видалити користувача";
    }
    
    @Override
    public String editUser() {
        return "Редагувати користувача";
    }
    
    @Override
    public String appliesForUser() {
        return "Переглянути заявки користувача";
    }
    
    @Override
    public String userFullname() {
        return "Ім'я користувача";
    }
    
    @Override
    public String userRole() {
        return "Роль";
    }
    
    @Override
    public String userRole(String role) {
        if ("ROLE_ADMIN".equals(role)) {
            return "Адміністратор";
        }
        if ("ROLE_USER".equals(role)) {
            return "Користувач";
        }
        return "";
    }
    
    @Override
    public String user(User user) {
        if (user == null) {
            return "Анонінмий користувач";
        }
        if (user.getId() == null) {
            return "Новий користувач";
        }
        return userRole(user.getRole()) + " " + user.getFullname();
    }
    
    @Override
    public String userWasSaved(User userToSave) {
        return user(userToSave) + " збережений";
    }
    
    @Override
    public String areYouSureToDeleteUser(User user) {
        if (user == null) {
            return "Ви дійсно бажаєте видалити користувача?";
        }
        return "Ви дійсно бажаєте видалити користувача '" + user.getFullname() + "'?";
    }
    
    @Override
    public String confirmUserDeletion(User user) {
        if (user == null) {
            return "Підтвердіть видалення користувача";
        }
        return "Підтвердіть видалення користувача '" + user.getFullname() + "'";
    }
    
    @Override
    public String userCantDeleteItself() {
        return "Неможливо видалити самого себе";
    }
    
    @Override
    public String userWasDeleted(User userToDelete) {
        return user(userToDelete) + " був успішно видалений";
    }
    
    @Override
    public String cardAuthor() {
        return "Автор";
    }
    
    @Override
    public String cardDocumentDate() {
        return "Дата документа";
    }
    
    @Override
    public String cardDocumentIndex() {
        return "Індекс документа";
    }
    
    @Override
    public String cardArriveDate() {
        return "Дата надходження";
    }
    
    @Override
    public String cardIndex() {
        return "Індекс";
    }
    
    @Override
    public String cardHeader() {
        return "Заголовок документа";
    }
    
    @Override
    public String cardResolution() {
        return "Резолюція";
    }
    
    @Override
    public String cardPerformer() {
        return "Відповідальний виконавець";
    }
    
    @Override
    public String cardStorageTerm() {
        return "Строки виконання";
    }
    
    @Override
    public String cardDone() {
        return "Позначка про виконання";
    }
    
    @Override
    public String cardPageNumber() {
        return "Кількість аркушів";
    }
    
    @Override
    public String cardDoneTerm() {
        return "Строк зберігання";
    }
    
    @Override
    public String cardTermIncrement() {
        return "Відмітка про збільшення строку зберігання";
    }
    
    @Override
    public String cardConversionName() {
        return "Ім'я конвертованого документу";
    }
    
    @Override
    public String cardConversionDate() {
        return "Дата конвертування";
    }
    
    @Override
    public String cardConversionAct() {
        return "Індекс акта про конвертування";
    }
    
    @Override
    public String cardConversionActFileName() {
        return "Ім'я файлу з актом про конвертування";
    }
    
    @Override
    public String cardConversor() {
        return "Особа, що здійснила конвертування";
    }
    
    @Override
    public String cardBeforeConversionType() {
        return "Формат файлу до конвертування";
    }
    
    @Override
    public String cardAfterConversionType() {
        return "Формат файлу після конвертування";
    }
    
    @Override
    public String cardConversionVersion() {
        return "Версія конвертування";
    }
    
    @Override
    public String cardDestroyDate() {
        return "Дата знищення файлу";
    }
    
    @Override
    public String cardDestroyAct() {
        return "Індекс акту про знищення";
    }
    
    @Override
    public String cardDestroyer() {
        return "Особа, що здійснила знищення";
    }
    
    @Override
    public String cardTechnicalReview() {
        return "Індекс акту технічної перевірки";
    }
    
    @Override
    public String cardReviewAct() {
        return "Ім'я файлу акту технічної перевірки";
    }
    
    @Override
    public String cardArriveMessageDate() {
        return "Дата прочитання повідомлень про надходження";
    }
    
    @Override
    public String cardEditDate() {
        return "Дата внесення змін";
    }
    
    @Override
    public String cardReviewDate() {
        return "Дата ознайомлення";
    }
    
    @Override
    public String cardSuggestionReviewDate() {
        return "Дата ознайомлення з пропозиціями";
    }
    
    @Override
    public String cardDesignReviewDate() {
        return "Дата ознайомлення з проектом";
    }
    
    @Override
    public String cardUnit() {
        return "Номер опису справ структурного підрозділу";
    }
    
    @Override
    public String cardUnitDate() {
        return "Дата складання опису справ структурного підрозділу";
    }
    
    @Override
    public String cardDeal() {
        return "Номер справи";
    }
    
    @Override
    public String cardVolume() {
        return "Номер тому справи";
    }
    
    @Override
    public String cardDealIndex() {
        return "Індекс справи";
    }
    
    @Override
    public String cardDealHeader() {
        return "Заголовок справи";
    }
    
    @Override
    public String cardDealTerm() {
        return "Строк зберігання справи";
    }
    
    @Override
    public String cardFund() {
        return "Номер фонду";
    }
    
    @Override
    public String cardArchiveEdrpou() {
        return "Код архівної установи";
    }
    
    @Override
    public String cardArchiveName() {
        return "Найменування архівної установи";
    }
    
    @Override
    public String cardCountryId() {
        return "Ідентифікатор країни";
    }
    
    @Override
    public String cardEdrpou() {
        return "Код установи";
    }
    
    @Override
    public String cardEMessageAcceptReject() {
        return "Індекс повідомлення про отримання/відхилення";
    }
    
    @Override
    public String cardPositionAcceptReject() {
        return "Особа, яка отримала повідомлення";
    }
    
    @Override
    public String guide() {
        return "Допомога";
    }
}
