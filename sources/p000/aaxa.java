package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.Observable;
import java.util.Observer;

/* renamed from: aaxa */
public final /* synthetic */ class aaxa implements Observer {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56738a;

    /* renamed from: b */
    private final aarn f56739b;

    public aaxa(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, aarn aarn) {
        this.f56738a = chatRequestAndConversationChimeraService;
        this.f56739b = aarn;
    }

    public final void update(Observable observable, Object obj) {
        this.f56739b.mo31653a(this.f56738a.f78901g);
    }
}
