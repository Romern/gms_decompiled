package p000;

/* renamed from: agkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f65782a;

    /* renamed from: b */
    final /* synthetic */ String f65783b;

    /* renamed from: c */
    final /* synthetic */ Object f65784c;

    /* renamed from: d */
    final /* synthetic */ long f65785d;

    /* renamed from: e */
    final /* synthetic */ agkm f65786e;

    public agkf(agkm agkm, String str, String str2, Object obj, long j) {
        this.f65786e = agkm;
        this.f65782a = str;
        this.f65783b = str2;
        this.f65784c = obj;
        this.f65785d = j;
    }

    public final void run() {
        this.f65786e.mo35573a(this.f65782a, this.f65783b, this.f65784c, this.f65785d);
    }
}
