package p000;

import android.util.SparseArray;

/* renamed from: arme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class arme {

    /* renamed from: a */
    public final bxvd f87890a = bovb.f134982c.mo74144da();

    /* renamed from: b */
    private final SparseArray f87891b = new SparseArray();

    /* renamed from: a */
    public final void mo48637a(int i) {
        int i2 = i - 1;
        bxvd bxvd = (bxvd) this.f87891b.get(i2);
        if (bxvd == null) {
            bxvd = boub.f134908d.mo74144da();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boub boub = (boub) bxvd.f164949b;
            boub.f134911b = i2;
            boub.f134910a |= 1;
            this.f87891b.put(i2, bxvd);
        }
        int i3 = ((boub) bxvd.f164949b).f134912c + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boub boub2 = (boub) bxvd.f164949b;
        boub boub3 = boub.f134908d;
        boub2.f134910a |= 2;
        boub2.f134912c = i3;
    }

    /* renamed from: a */
    public final boub[] mo48638a() {
        boub[] boubArr = new boub[this.f87891b.size()];
        for (int i = 0; i < this.f87891b.size(); i++) {
            boubArr[i] = (boub) ((bxvd) this.f87891b.valueAt(i)).mo74062i();
        }
        return boubArr;
    }
}
