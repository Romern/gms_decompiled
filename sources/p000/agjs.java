package p000;

/* renamed from: agjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f65748a;

    /* renamed from: b */
    final /* synthetic */ String f65749b;

    /* renamed from: c */
    final /* synthetic */ String f65750c;

    /* renamed from: d */
    final /* synthetic */ long f65751d;

    /* renamed from: e */
    final /* synthetic */ aghp f65752e;

    public agjs(aghp aghp, String str, String str2, String str3, long j) {
        this.f65752e = aghp;
        this.f65748a = str;
        this.f65749b = str2;
        this.f65750c = str3;
        this.f65751d = j;
    }

    public final void run() {
        String str = this.f65748a;
        if (str != null) {
            this.f65752e.f65526a.f65953g.mo35507k().mo35596a(this.f65749b, new agkt(this.f65750c, str, this.f65751d));
            return;
        }
        this.f65752e.f65526a.f65953g.mo35507k().mo35596a(this.f65749b, (agkt) null);
    }
}
