package p000;

/* renamed from: jyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jyg implements bqfp {

    /* renamed from: a */
    final /* synthetic */ jyj f23520a;

    public jyg(jyj jyj) {
        this.f23520a = jyj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        jyj.f23524a.mo25414c("Successfully written logs to disk", new Object[0]);
        this.f23520a.f23526c.mo13118a(true);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        jyj.f23524a.mo25415d("Failed to write logs to disk ", th, new Object[0]);
        this.f23520a.f23526c.mo13118a(false);
    }
}
