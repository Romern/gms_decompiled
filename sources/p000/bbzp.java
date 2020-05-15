package p000;

import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Set;

/* renamed from: bbzp */
final /* synthetic */ class bbzp implements Runnable {

    /* renamed from: a */
    private final bcas f103820a;

    /* renamed from: b */
    private final bngx f103821b;

    /* renamed from: c */
    private final bnhe f103822c;

    /* renamed from: d */
    private final Set f103823d;

    public bbzp(bcas bcas, bngx bngx, bnhe bnhe, Set set) {
        this.f103820a = bcas;
        this.f103821b = bngx;
        this.f103822c = bnhe;
        this.f103823d = set;
    }

    public final void run() {
        bcas bcas = this.f103820a;
        bngx bngx = this.f103821b;
        bnhe bnhe = this.f103822c;
        Set<ConversationId> set = this.f103823d;
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            bctr bctr = (bctr) i.next();
            bcas.f103908c.mo54674a(bcas.mo56655d("messages"), (ContentValues) bnhe.get(bctr.mo57359a()), "message_id = ?", new String[]{bctr.mo57359a()});
            bcas.mo56653c(bctr.mo57359a());
            set.add(bctr.mo57361c());
        }
        for (ConversationId conversationId : set) {
            bcas.mo56660g(conversationId);
        }
    }
}
