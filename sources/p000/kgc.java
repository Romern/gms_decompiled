package p000;

import android.util.Pair;
import com.google.android.gms.autofill.data.Credential;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kgc extends cazu {

    /* renamed from: b */
    private final cazn f24028b;

    /* renamed from: c */
    private final cazn f24029c;

    public kgc(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2) {
        super(cijl2, cbag.m127657a(kgc.class), cijl);
        this.f24028b = cbac.m127643a(cazn);
        this.f24029c = cbac.m127643a(cazn2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f24028b.mo75201b(), this.f24029c.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        List list = (List) obj;
        Credential credential = (Credential) list.get(1);
        bnic bnic = ((kfj) list.get(0)).f23987a;
        ArrayList arrayList = new ArrayList(bnic.size());
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            Pair pair = (Pair) a.next();
            if (credential.equals((Credential) pair.second)) {
                arrayList.add((qun) pair.first);
            }
        }
        return bqga.m112775a((Object) arrayList);
    }
}
