package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: akee */
final /* synthetic */ class akee implements Runnable {

    /* renamed from: a */
    private final akgy f71716a;

    /* renamed from: b */
    private final byte[] f71717b;

    /* renamed from: c */
    private final String f71718c;

    /* renamed from: d */
    private final byte[] f71719d;

    /* renamed from: e */
    private final int f71720e;

    /* renamed from: f */
    private final boolean f71721f;

    /* renamed from: g */
    private final ajud f71722g;

    /* renamed from: h */
    private final ShareTarget f71723h;

    /* renamed from: i */
    private final akgq f71724i;

    /* renamed from: j */
    private final long f71725j;

    public akee(akgy akgy, byte[] bArr, String str, byte[] bArr2, int i, boolean z, ajud ajud, ShareTarget shareTarget, akgq akgq, long j) {
        this.f71716a = akgy;
        this.f71717b = bArr;
        this.f71718c = str;
        this.f71719d = bArr2;
        this.f71720e = i;
        this.f71721f = z;
        this.f71722g = ajud;
        this.f71723h = shareTarget;
        this.f71724i = akgq;
        this.f71725j = j;
    }

    public final void run() {
        akgy akgy = this.f71716a;
        byte[] bArr = this.f71717b;
        String str = this.f71718c;
        byte[] bArr2 = this.f71719d;
        int i = this.f71720e;
        boolean z = this.f71721f;
        ajud ajud = this.f71722g;
        ShareTarget shareTarget = this.f71723h;
        akgq akgq = this.f71724i;
        long j = this.f71725j;
        akdd a = akgy.f71940g.mo39280a(bArr, str, bArr2, i, z);
        if (a == null) {
            akgy.mo39385a(new akfm(akgy, ajud, shareTarget));
        } else {
            akgy.mo39385a(new akfn(akgy, a, ajud, shareTarget, akgq, j, str));
        }
    }
}
