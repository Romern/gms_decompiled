package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Future;

/* renamed from: bcie */
final /* synthetic */ class bcie implements bqeg {

    /* renamed from: a */
    private final bcjm f104199a;

    /* renamed from: b */
    private final bqgg f104200b;

    /* renamed from: c */
    private final ContactId f104201c;

    /* renamed from: d */
    private final int f104202d;

    public bcie(bcjm bcjm, bqgg bqgg, int i, ContactId contactId) {
        this.f104199a = bcjm;
        this.f104200b = bqgg;
        this.f104202d = i;
        this.f104201c = contactId;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        cbms cbms;
        int a;
        bcjm bcjm = this.f104199a;
        bqgg bqgg = this.f104200b;
        int i = this.f104202d;
        ContactId contactId = this.f104201c;
        try {
            bqga.m112780a((Future) bqgg);
        } catch (Throwable th) {
            bckc.m89179a();
            chtr b = chuv.m149610b(th);
            int i2 = 1;
            if (b == null || (cbms = (cbms) b.mo85652b(bckc.f104364a)) == null || (a = cipm.m150697a(cbms.f177675a)) == 0 || a == 1) {
                i2 = 2;
            } else {
                int a2 = cipm.m150697a(cbms.f177675a);
                if (a2 != 0) {
                    i2 = a2;
                }
            }
            if (i2 == i) {
                bcjm.f104336e.mo56273a(contactId);
            }
        }
        return bqgg;
    }
}
