package p000;

import android.util.SparseArray;

/* renamed from: aabe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabe implements bdpn {

    /* renamed from: a */
    private final float f27876a;

    /* renamed from: b */
    private final aaaw f27877b;

    /* renamed from: c */
    private final float f27878c;

    public aabe(float f, aaaw aaaw, int i) {
        this.f27876a = f;
        this.f27877b = aaaw;
        float f2 = 1.0f;
        if (cdoz.f181455a.mo6606a().mo78126s() && i > 0) {
            f2 = 1.0f / ((float) i);
        }
        this.f27878c = f2;
    }

    /* renamed from: a */
    public final bmxv mo16675a(SparseArray sparseArray, bljz bljz) {
        boolean z;
        bxwc bxwc = bljz.f126717d;
        int size = bxwc.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            bliz bliz = (bliz) bxwc.get(i);
            bljc a = bljf.m107236a(blkn.f126753a, (bljf) sparseArray.get(bliz.f126651c, blje.f126668a), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
            if (a.mo66589b()) {
                z = ((aabk) a.mo66588a()).f27885a;
            } else {
                z = false;
            }
            if (z || bliz.f126652d == -1) {
                str = bliz.f126650b;
                if (z) {
                    break;
                }
            }
        }
        float sqrt = this.f27876a / ((float) Math.sqrt((double) this.f27877b.mo16670a(str, bljz.f126718e, 1)));
        return blkb.m107277a(bljz, sqrt) ? bmxv.m108566b(Float.valueOf(sqrt * this.f27878c)) : bmvz.f131120a;
    }
}
