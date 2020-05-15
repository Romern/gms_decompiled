package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Callable;

/* renamed from: bcaj */
final /* synthetic */ class bcaj implements Callable {

    /* renamed from: a */
    private final bcas f103876a;

    /* renamed from: b */
    private final ContactId f103877b;

    public bcaj(bcas bcas, ContactId contactId) {
        this.f103876a = bcas;
        this.f103877b = contactId;
    }

    public final Object call() {
        bcas bcas = this.f103876a;
        ContactId contactId = this.f103877b;
        long c = bcas.mo56649c(contactId);
        if (c == -1) {
            bcsi m = bcsj.m89802m();
            m.mo57441a(contactId);
            m.mo57442a((Long) -1L);
            m.mo57440a(bngx.m109376e());
            c = bcas.mo56637b(m.mo57436a());
        }
        return Long.valueOf(c);
    }
}
