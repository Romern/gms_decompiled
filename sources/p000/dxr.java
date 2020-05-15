package p000;

/* renamed from: dxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class dxr {

    /* renamed from: a */
    public final dxp f14367a;

    /* renamed from: b */
    public final String f14368b;

    /* renamed from: c */
    public final int[] f14369c;

    /* renamed from: d */
    public final int[] f14370d;

    /* renamed from: e */
    public final boolean f14371e;

    public dxr(dxp dxp, String str, int[] iArr, int[] iArr2) {
        this(dxp, str, iArr, iArr2, false);
    }

    /* renamed from: a */
    public int mo9837a(int i) {
        return !sqc.m35957a(this.f14369c, i) ? 1 : 0;
    }

    public dxr(dxp dxp, String str, int[] iArr, int[] iArr2, boolean z) {
        sdo.m34959a(dxp);
        this.f14367a = dxp;
        sdo.m34977c(str);
        this.f14368b = str;
        sdo.m34959a(iArr);
        sdo.m34974b(iArr.length > 0);
        this.f14369c = iArr;
        this.f14370d = iArr2;
        this.f14371e = z;
    }
}
