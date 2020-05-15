package p000;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: baja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baja extends cazu {

    /* renamed from: b */
    private final cazn f101030b;

    /* renamed from: c */
    private final cazn f101031c;

    /* renamed from: d */
    private final cazn f101032d;

    public baja(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(baja.class), cijl);
        this.f101030b = cbac.m127643a(cazn);
        this.f101031c = cbac.m127643a(cazn2);
        this.f101032d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f101030b.mo75201b(), this.f101031c.mo75201b(), this.f101032d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        baok baok = (baok) list.get(2);
        ArrayList arrayList = new ArrayList();
        for (baog baog : baok.mo55826a((Account) list.get(0), (bygz) list.get(1))) {
            bygx e = baog.mo55818e();
            if (e != null && e.f166403a == 3) {
                arrayList.add((byhc) e.f166404b);
            }
        }
        return bqga.m112775a((Object) bngx.m109368a((Collection) arrayList));
    }
}
