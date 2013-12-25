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
        
        User user = userService.getUser(username);
        if (user == null) {
            return "Анонінмий користувач";
        }
        
        if ("ROLE_ADMIN".equals(user.getRole())) {
            return "Адміністратор " + user.getFullname();
        }
        return "Користувач " + user.getFullname();
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
    public String areYouSureToDelete(Card card) {
        if (card == null) {
            return "Ви дійсно бажаєте видалити картку?";
        }
        return "Ви дійсно бажаєте видалити картку '" + card.getName() + "'?";
    }
    
    @Override
    public String confirmDeletion(Card card) {
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
}
