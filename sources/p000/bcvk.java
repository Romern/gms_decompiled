package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: bcvk */
public final /* synthetic */ class bcvk implements Callable {

    /* renamed from: a */
    private final bcvt f104995a;

    /* renamed from: b */
    private final ConversationId f104996b;

    public bcvk(bcvt bcvt, ConversationId conversationId) {
        this.f104995a = bcvt;
        this.f104996b = conversationId;
    }

    public final Object call() {
        bcvt bcvt = this.f104995a;
        ConversationId conversationId = this.f104996b;
        File b = bcvt.mo57603b();
        String valueOf = String.valueOf(bcvt.m90115a(conversationId.mo60498a()));
        String valueOf2 = String.valueOf(bcvt.m90116a(conversationId));
        return Boolean.valueOf(bcvt.mo57602a(b, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)));
    }
}
