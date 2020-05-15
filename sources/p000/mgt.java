package p000;

/* renamed from: mgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mgt implements bqfp {

    /* renamed from: a */
    final /* synthetic */ mgw f33659a;

    public mgt(mgw mgw) {
        this.f33659a = mgw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        mgw.m25081a("We're stopping.");
        this.f33659a.mo20001a(18, null, 2, 2);
        this.f33659a.mo20005d();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        mgw.m25081a("Failed to switch to GMS before stopping.");
        this.f33659a.mo20005d();
    }
}
