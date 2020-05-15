package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: kgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kgb extends cazu {

    /* renamed from: b */
    private final cazn f24026b;

    /* renamed from: c */
    private final cazn f24027c;

    public kgb(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(kgb.class), cijl);
        this.f24026b = cbac.m127643a(cazn);
        this.f24027c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f24026b.mo75201b(), this.f24027c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Collection<qun> collection = (Collection) list.get(0);
        kfe kfe = (kfe) list.get(1);
        ArrayList arrayList = new ArrayList(collection.size());
        for (qun qun : collection) {
            arrayList.add(qqk.m32658a(kfe.f23977b, kfe.mo14441a(kfe.f23976a), new kfd(kfe, qun, Bundle.EMPTY)));
        }
        return bqga.m112774a((Iterable) arrayList);
    }
}
