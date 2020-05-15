package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bbwx */
final /* synthetic */ class bbwx implements Callable {

    /* renamed from: a */
    private final bbxm f103641a;

    /* renamed from: b */
    private final bcoh f103642b;

    public bbwx(bbxm bbxm, bcoh bcoh) {
        this.f103641a = bbxm;
        this.f103642b = bcoh;
    }

    public final Object call() {
        int i;
        bbxm bbxm = this.f103641a;
        bcoh bcoh = this.f103642b;
        synchronized (bbxm.f103681g) {
            bbxm.f103683i.put(Long.valueOf(bcoh.mo57057a()), bbxm.f103676b.mo56668a(bcoh));
        }
        int i2 = 0;
        if (!bbxm.f103676b.mo56673b(bcoh)) {
            return false;
        }
        bbwq bbwq = (bbwq) bbxm.f103680f;
        bbwq.f103606d.mo25812a(new bbvf(bbwq, bcoh));
        List list = bbxm.f103678d;
        int size = list.size();
        while (i2 < size) {
            bbpt bbpt = (bbpt) list.get(i2);
            bnre i3 = bcoh.mo57058b().mo57075f().listIterator();
            while (true) {
                i = i2 + 1;
                if (!i3.hasNext()) {
                    break;
                }
                ContactId contactId = (ContactId) i3.next();
                bbpt.mo54578b();
            }
            i2 = i;
        }
        return true;
    }
}
