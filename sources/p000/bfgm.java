package p000;

import android.content.Context;
import java.util.Locale;
import java.util.UUID;

/* renamed from: bfgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfgm extends bfgq {

    /* renamed from: a */
    public final bgns f113775a;

    /* renamed from: b */
    public volatile bffy f113776b;

    /* renamed from: c */
    public volatile boolean f113777c = false;

    /* renamed from: d */
    public final String f113778d;

    /* renamed from: e */
    public volatile bffw f113779e;

    /* renamed from: f */
    public bfgl f113780f;

    /* renamed from: g */
    public final bgmj f113781g;

    /* renamed from: m */
    private final String f113782m;

    /* renamed from: n */
    private final String f113783n;

    /* renamed from: o */
    private final byte[] f113784o;

    /* renamed from: p */
    private final Context f113785p;

    /* renamed from: q */
    private final Object f113786q = new Object();

    /* renamed from: r */
    private volatile boolean f113787r = false;

    /* renamed from: s */
    private final int f113788s;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    public bfgm(Context context, bgns bgns, int i, bfhd bfhd, String str, String str2, byte[] bArr, bfew bfew, String str3, bhdb bhdb, bgmj bgmj) {
        super(bfew, bhdb, bfhd);
        bmxy.m108582a(str3, "Session id should not be null. Please make sure you called the correct constructor.");
        i = i != 3 ? 2 : i;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unsupported policy: ");
        sb.append(i - 1);
        bmxy.m108589a(true, (Object) sb.toString());
        this.f113785p = context;
        this.f113783n = str;
        this.f113782m = str2;
        this.f113784o = bArr;
        this.f113778d = str3;
        this.f113788s = i;
        this.f113781g = bgmj;
        this.f113775a = bgns;
    }

    /* renamed from: a */
    public static final void m96656a(bsax bsax, bsax bsax2, String str) {
        if (str != null) {
            bsax2.mo70118b(2, str);
        }
        bsax.mo70118b(6, bsax2);
    }

    /* renamed from: b */
    static String m96657b() {
        String valueOf = String.valueOf(UUID.randomUUID().toString());
        return valueOf.length() == 0 ? new String("@") : "@".concat(valueOf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61567a() {
        bfgl bfgl = this.f113780f;
        if (bfgl != null) {
            bfgl.mo61658a();
        }
    }

    /* renamed from: a */
    public final void mo61661a(bsax bsax, bfgp bfgp, int i, String str) {
        bfew bfew = this.f113796h;
        if (bfew != null) {
            String str2 = bfgp.f113795d;
            if (str2 == null) {
                str2 = "none";
            }
            bfew.mo61494a(str, i, str2);
        }
        if (this.f113782m != null) {
            String name = Thread.currentThread().getName();
            Locale locale = Locale.US;
            Object[] objArr = {name, Integer.valueOf(bsax.mo70129e(6).mo70114b(3)), str, this.f113782m};
            synchronized (this.f113786q) {
                if (this.f113779e == null) {
                    this.f113779e = new bffw(this.f113775a, this.f113782m, this.f113784o, this.f113796h, this.f113797i, null, this.f113781g);
                }
            }
            if (str != null) {
                this.f113779e.mo61634a(str);
            }
            this.f113779e.mo61633a(bsax);
            return;
        }
        int b = bsax.mo70129e(6).mo70114b(3);
        StringBuilder sb = new StringBuilder(63);
        sb.append("No backup data path specified, dropping data seqNum:");
        sb.append(b);
        sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        return r0;
     */
    /* renamed from: a */
    public final synchronized boolean mo61568a(bsax bsax, bsax bsax2) {
        if (!this.f113787r) {
            this.f113787r = true;
            this.f113776b = new bffy(this.f113785p);
            bfgk bfgk = new bfgk(this, "RemoteScanResultWriter.workerThread");
            bfgk.start();
            this.f113780f = new bfgl(this, bfgk.getLooper());
        }
        if (bsax.mo70137i(1) && this.f113783n != null) {
            bsax.mo70129e(1).mo70118b(3, this.f113783n);
        }
        if (this.f113788s == 3) {
            boolean a = this.f113780f.mo61659a(bsax, bsax2, false);
            if (!a) {
                m96656a(bsax, bsax2, this.f113778d);
                mo61661a(bsax, new bfgp(null, "To many data in upload queue."), bsax.mo70129e(6).mo70114b(3), this.f113778d);
            }
        } else {
            return this.f113780f.mo61659a(bsax, bsax2, true);
        }
    }
}
