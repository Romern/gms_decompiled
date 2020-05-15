package p000;

import android.accounts.Account;
import java.util.List;

/* renamed from: wdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wdd extends cazu {

    /* renamed from: b */
    private final cazn f50532b;

    /* renamed from: c */
    private final cazn f50533c;

    /* renamed from: d */
    private final cazn f50534d;

    public wdd(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(wdd.class), cijl);
        this.f50532b = cbac.m127643a(cazn);
        this.f50533c = cbac.m127643a(cazn2);
        this.f50534d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f50532b.mo75201b(), this.f50533c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        bmxv bmxv = (bmxv) list.get(0);
        bqgy bqgy = (bqgy) list.get(1);
        cazn cazn = this.f50534d;
        if (!bmxv.mo66813a()) {
            return cazn.mo75201b();
        }
        wdb d = wdc.m41786d();
        d.mo29044a(1);
        d.f50529a = (Account) bmxv.mo66814b();
        bqgy.mo69138b(d.mo29043a());
        return bqga.m112775a((Object) null);
    }
}
