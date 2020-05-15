package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import java.util.Observable;
import java.util.Observer;

/* renamed from: aavl */
public final /* synthetic */ class aavl implements Observer {

    /* renamed from: a */
    private final ChatConversationChimeraActivity f56657a;

    /* renamed from: b */
    private final aarn f56658b;

    public aavl(ChatConversationChimeraActivity chatConversationChimeraActivity, aarn aarn) {
        this.f56657a = chatConversationChimeraActivity;
        this.f56658b = aarn;
    }

    public final void update(Observable observable, Object obj) {
        this.f56658b.mo31653a(this.f56657a.f78882t);
    }
}
