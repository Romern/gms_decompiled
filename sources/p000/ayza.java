package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: ayza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayza implements ayvv {

    /* renamed from: a */
    public final ayyi f98789a;

    /* renamed from: b */
    public final aywe f98790b;

    /* renamed from: c */
    public boolean f98791c = false;

    /* renamed from: d */
    private final ayyo f98792d;

    /* renamed from: e */
    private final ayyo f98793e;

    public ayza(ayyi ayyi, ayyo ayyo, ayyo ayyo2, aywe aywe) {
        this.f98789a = ayyi;
        this.f98792d = ayyo;
        this.f98793e = ayyo2;
        this.f98790b = aywe;
    }

    /* renamed from: a */
    public final bqgg mo54458a(ayvy ayvy) {
        bqgg bqgg;
        ayyg ayyg = (ayyg) ayvy.f98587a;
        String a = this.f98789a.mo40447a(ayyg);
        if (a.isEmpty()) {
            return bqga.m112775a((Object) null);
        }
        List list = ayyg.f98741b;
        if (!this.f98791c) {
            bqgg = bqga.m112775a((Object) null);
        } else {
            int size = list.size();
            bxvf[] bxvfArr = new bxvf[size];
            ArrayList arrayList = new ArrayList();
            for (int i = size - 1; i >= 0; i--) {
                aywu aywu = (aywu) list.get(i);
                bxvf bxvf = (bxvf) bpcb.f135695g.mo74144da();
                bptu bptu = aywu.f98654c;
                if (bptu == null) {
                    bptu = bptu.f139179e;
                }
                int i2 = bptu.f139183c;
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = false;
                }
                bpcb bpcb = (bpcb) bxvf.f164949b;
                bpcb.f135697a |= 1;
                bpcb.f135698b = i2;
                bxvfArr[i] = bxvf;
                if (aywu.f98653b.size() > 0) {
                    this.f98792d.mo54530a(aywu, aywu.f98653b, bxvfArr[i], arrayList);
                }
            }
            if (arrayList.isEmpty()) {
                bqgg = bqga.m112775a(bxvfArr);
            } else {
                bqgg = bqga.m112785c(arrayList).mo69216a(new ayyz(arrayList, bxvfArr), bqfb.INSTANCE);
            }
        }
        bqgg b = this.f98789a.mo40448b(ayyg);
        bqgg a2 = this.f98789a.mo40446a(ayvy.f98588b);
        aywt aywt = ayyg.f98742c.f98642a;
        ArrayList arrayList2 = new ArrayList();
        this.f98793e.mo54530a(aywt, aywt.f98648c, null, arrayList2);
        return bqga.m112786c(b, a2, bqgg, bqga.m112774a((Iterable) arrayList2)).mo69214a(new ayyy(this, ayyg, aywt, arrayList2, bqgg, a, b, a2, ayvy), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final Set mo54459a() {
        return bnic.m109489a(ayyg.class);
    }
}
