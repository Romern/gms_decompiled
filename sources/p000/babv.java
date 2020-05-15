package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: babv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class babv extends cazu {

    /* renamed from: b */
    private final cazn f100441b;

    /* renamed from: c */
    private final cazn f100442c;

    /* renamed from: d */
    private final cazn f100443d;

    private babv(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(babv.class), cijl);
        this.f100441b = cbac.m127643a(cazn);
        this.f100442c = cbac.m127643a(cazn2);
        this.f100443d = cbac.m127643a(cazn3);
    }

    /* renamed from: a */
    public static babv m86546a(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        return new babv(cijl, cijl2, cazn, cazn2, cazn3);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        return ((babt) list.get(0)).mo55566a((Account) list.get(1), (List) list.get(2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f100441b.mo75201b(), this.f100442c.mo75201b(), this.f100443d.mo75201b());
    }
}
