package p000;

import com.google.android.gms.udc.UdcCacheResponse;

/* renamed from: avbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avbm {

    /* renamed from: a */
    public final UdcCacheResponse.UdcSetting f92911a;

    /* renamed from: b */
    public final boolean f92912b;

    /* renamed from: c */
    public final int f92913c;

    public avbm(bxpd bxpd) {
        int i;
        int a = avjl.m78613a(bxpd.f164243b);
        if (!bxpd.f164244c) {
            i = 3;
        } else {
            i = 2;
        }
        this.f92911a = avbn.m78193a(a, i, true);
        this.f92912b = bxpd.f164246e;
        this.f92913c = avjl.m78613a(bxpd.f164243b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if ((r6 == null ? p000.bxrn.f164579e : r6).f164582b != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    public avbm(bxrq bxrq) {
        boolean z;
        int i = bxrq.f164589b;
        int a = bxsn.m123069a(bxrq.f164591d);
        boolean z2 = true;
        int i2 = (a == 0 ? 1 : a) - 1;
        if ((bxrq.f164588a & 8) != 0) {
            bxrn bxrn = bxrq.f164592e;
            if ((bxrn == null ? bxrn.f164579e : bxrn).f164584d) {
                z = true;
                this.f92911a = avbn.m78193a(i, i2, z);
                this.f92913c = bxrq.f164589b;
                if ((bxrq.f164588a & 8) != 0) {
                    bxrn bxrn2 = bxrq.f164592e;
                }
                z2 = false;
                this.f92912b = z2;
            }
        }
        z = false;
        this.f92911a = avbn.m78193a(i, i2, z);
        this.f92913c = bxrq.f164589b;
        if ((bxrq.f164588a & 8) != 0) {
        }
        z2 = false;
        this.f92912b = z2;
    }
}
