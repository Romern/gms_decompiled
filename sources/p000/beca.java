package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: beca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beca extends becg {

    /* renamed from: a */
    private final bngx f106892a;

    public beca(List list) {
        bngs j = bngx.m109377j();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!bmxx.m108577a(str)) {
                bmxv a = becc.m91759a(str);
                if (a.mo66813a()) {
                    j.mo67668c((becc) a.mo66814b());
                }
            }
        }
        this.f106892a = j.mo67664a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29318a(String str) {
        bnre i = this.f106892a.listIterator();
        while (i.hasNext()) {
            becc becc = (becc) i.next();
            if (becc != null && becc.f106895a.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
