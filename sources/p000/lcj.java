package p000;

import java.util.ArrayList;

/* renamed from: lcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lcj implements lch {

    /* renamed from: a */
    public static final srn f25791a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final bngx f25792b;

    public lcj(bngx bngx) {
        this.f25792b = bngx;
    }

    /* renamed from: a */
    public final bqgg mo14962a(lcf lcf) {
        if (this.f25792b.isEmpty()) {
            return bqga.m112775a(bmvz.f131120a);
        }
        bqgy c = bqgy.m112818c();
        ArrayList arrayList = new ArrayList(this.f25792b.size());
        bnre i = this.f25792b.listIterator();
        while (i.hasNext()) {
            arrayList.add(((lch) i.next()).mo14962a(lcf));
        }
        lci lci = new lci(c, arrayList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bqgg) arrayList.get(i2)).mo741a(lci, bqfb.INSTANCE);
        }
        return c;
    }
}
