package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: bcvh */
public final /* synthetic */ class bcvh implements Callable {

    /* renamed from: a */
    private final bcvt f104985a;

    /* renamed from: b */
    private final ConversationId f104986b;

    public bcvh(bcvt bcvt, ConversationId conversationId) {
        this.f104985a = bcvt;
        this.f104986b = conversationId;
    }

    public final Object call() {
        bcvt bcvt = this.f104985a;
        return Boolean.valueOf(bcvt.mo57602a(new File(bcvt.mo57600a(this.f104986b, "")).getParentFile(), (String) null));
    }
}
