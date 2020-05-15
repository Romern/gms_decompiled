package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: bahi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahi extends cazu {

    /* renamed from: b */
    private final cazn f100873b;

    /* renamed from: c */
    private final cazn f100874c;

    /* renamed from: d */
    private final cazn f100875d;

    public bahi(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(bahi.class), cijl);
        this.f100873b = cbac.m127643a(cazn);
        this.f100874c = cbac.m127643a(cazn2);
        this.f100875d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100873b.mo75201b(), this.f100874c.mo75201b(), this.f100875d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        byjq byjq;
        List list = (List) obj;
        int i = 0;
        Long l = null;
        Long l2 = null;
        boolean z = false;
        boolean z2 = false;
        for (baog baog : ((baok) list.get(2)).mo55826a((Account) list.get(0), (bygz) list.get(1))) {
            bygx e = baog.mo55818e();
            if (e.f166403a == 2) {
                byjq = (byjq) e.f166404b;
            } else {
                byjq = byjq.f166688e;
            }
            i = Math.min(i + byjq.f166691b, 1000);
            if (z || (byjq.f166690a & 2) == 0) {
                l2 = null;
                z = true;
            } else {
                long j = byjq.f166692c;
                if (l2 != null) {
                    j = Math.max(l2.longValue(), j);
                }
                l2 = Long.valueOf(j);
            }
            if (z2 || (byjq.f166690a & 4) == 0) {
                l = null;
                z2 = true;
            } else {
                long j2 = byjq.f166693d;
                if (l != null) {
                    j2 = Math.min(l.longValue(), j2);
                }
                l = Long.valueOf(j2);
            }
        }
        return bqga.m112775a(badr.m86659a(i, l, l2));
    }
}
