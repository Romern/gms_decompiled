package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.Observable;
import java.util.Observer;

/* renamed from: aawr */
final /* synthetic */ class aawr implements Observer {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56723a;

    /* renamed from: b */
    private final abdo f56724b;

    public aawr(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, abdo abdo) {
        this.f56723a = chatRequestAndConversationChimeraService;
        this.f56724b = abdo;
    }

    public final void update(Observable observable, Object obj) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56723a;
        chatRequestAndConversationChimeraService.mo43291a(chatRequestAndConversationChimeraService.mo43283a(this.f56724b));
    }
}
