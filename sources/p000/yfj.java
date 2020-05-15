package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfj extends yfe {
    public yfj(yga yga) {
        super(yga);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cadj mo30404a(yhg yhg, cadl cadl) {
        yfi yfi = (yfi) yhg;
        cadj a = super.mo30404a(yfi, cadl);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        cadi cadi = (cadi) bxvd;
        cadz cadz = yfi.f53724a;
        if (cadi.f164950c) {
            cadi.mo74035c();
            cadi.f164950c = false;
        }
        cadj cadj = (cadj) cadi.f164949b;
        cadj cadj2 = cadj.f172680i;
        cadz.getClass();
        cadj.f172685d = cadz;
        cadj.f172682a |= 8;
        return (cadj) cadi.mo74062i();
    }

    /* renamed from: a */
    public final List mo30405a(long j, long j2, long j3, List list, ygc ygc, ydw ydw) {
        ArrayList arrayList = new ArrayList();
        bngx a = this.f53719a.mo30456a(j, j2);
        ArrayList arrayList2 = new ArrayList();
        bnre i = a.listIterator();
        while (i.hasNext()) {
            cadz cadz = (cadz) i.next();
            if (cadz.f172780f > 0) {
                arrayList2.add(new yfi(cadz));
            }
        }
        List a2 = yee.m43883a(arrayList2, j3);
        if (!a2.isEmpty()) {
            arrayList.addAll(mo30406a(list, a2, cadl.SESSION_BUCKET, ygc, ydw));
        }
        return arrayList;
    }
}
