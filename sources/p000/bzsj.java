package p000;

import java.security.MessageDigest;
import java.util.concurrent.Executors;

/* renamed from: bzsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bzsj implements bzsq {

    /* renamed from: a */
    public static final char[] f171251a = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

    /* renamed from: b */
    public final String f171252b;

    /* renamed from: c */
    public final String f171253c;

    /* renamed from: d */
    public final bzsa f171254d;

    /* renamed from: e */
    public final String f171255e;

    /* renamed from: f */
    public final bzrx f171256f;

    /* renamed from: g */
    public final MessageDigest f171257g;

    /* renamed from: h */
    public bzsu f171258h;

    /* renamed from: i */
    public int f171259i;

    public bzsj(String str, String str2, bzsa bzsa, bzrx bzrx, String str3, bzse bzse, bzsw bzsw) {
        bmxy.m108581a(str);
        bmxy.m108581a(str2);
        bmxy.m108581a(bzrx);
        bmxy.m108581a(bzse);
        this.f171252b = str;
        this.f171253c = str2;
        this.f171254d = bzsa;
        this.f171255e = str3 == null ? "" : str3;
        this.f171256f = bzrx;
        this.f171257g = bzsw.f171301b;
    }

    /* renamed from: a */
    public final bqgg mo74567a() {
        bzsh bzsh = new bzsh(this);
        bqha bqha = new bqha();
        bqha.mo69262a("Scotty-Uploader-MultipartTransfer-%d");
        bqgj a = bqgs.m112811a(Executors.newSingleThreadExecutor(bqha.m112820a(bqha)));
        bqgg b = a.mo25819b(bzsh);
        a.shutdown();
        return b;
    }

    /* renamed from: d */
    public final long mo74571d() {
        return this.f171256f.mo20323d();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final synchronized void mo74568a(bzsu bzsu, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Progress threshold (bytes) must be greater than 0");
        bmxy.m108589a(true, (Object) "Progress threshold (millis) must be greater or equal to 0");
        this.f171258h = bzsu;
        this.f171259i = i;
    }
}
