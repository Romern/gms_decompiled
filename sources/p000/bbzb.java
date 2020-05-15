package p000;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbzb */
final /* synthetic */ class bbzb implements bmxj {

    /* renamed from: a */
    private final bcas f103785a;

    /* renamed from: b */
    private final ConversationId f103786b;

    public bbzb(bcas bcas, ConversationId conversationId) {
        this.f103785a = bcas;
        this.f103786b = conversationId;
    }

    public final Object apply(Object obj) {
        bcas bcas = this.f103785a;
        bngx b = bccf.m88797b(this.f103786b, (Cursor) obj);
        bnre i = bcbz.m88785a(b).listIterator();
        while (i.hasNext()) {
            bcas.f103907b.mo56753a((bcns) i.next());
        }
        return bcbz.m88786b(b);
    }
}
