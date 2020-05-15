package p000;

import android.accounts.Account;
import java.util.Iterator;
import java.util.List;

/* renamed from: acjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acjp extends cazu {

    /* renamed from: b */
    private final cazn f60005b;

    /* renamed from: c */
    private final cazn f60006c;

    public acjp(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(acjp.class), cijl);
        this.f60005b = cbac.m127643a(cazn);
        this.f60006c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f60005b.mo75201b(), this.f60006c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        acjl acjl;
        List list = (List) obj;
        acjj acjj = (acjj) list.get(0);
        List list2 = (List) list.get(1);
        Account c = acjj.mo32666c();
        if (!acjj.mo32667d()) {
            if (c != null) {
                acjl = acjl.SUPERFLOUS;
            } else {
                acjl = acjl.PASS;
            }
        } else if (c != null) {
            if (c.type.equals("com.google")) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c.equals((Account) it.next())) {
                            acjl = acjl.PASS;
                            break;
                        }
                    } else {
                        acjl = acjl.UNKNOWN_ACCOUNT;
                        break;
                    }
                }
            } else {
                acjl = acjl.BAD_TYPE;
            }
        } else {
            acjl = acjl.UNKNOWN_ACCOUNT;
        }
        return bqga.m112775a(acjl);
    }
}
