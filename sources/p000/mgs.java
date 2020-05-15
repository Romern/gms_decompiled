package p000;

/* renamed from: mgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mgs implements bqfp {

    /* renamed from: a */
    final /* synthetic */ int f33657a;

    /* renamed from: b */
    final /* synthetic */ mgw f33658b;

    public mgs(mgw mgw, int i) {
        this.f33658b = mgw;
        this.f33657a = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        String str;
        Void voidR = (Void) obj;
        int i = this.f33657a;
        if (i != 1) {
            str = "D2dTransport";
        } else {
            str = "GmsTransport";
        }
        this.f33658b.mo20001a(7, str, mgw.m25080a(i), mgw.m25080a(this.f33657a));
        mgw.m25081a(str.length() == 0 ? new String("Task complete, selectedTransport=") : "Task complete, selectedTransport=".concat(str));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        this.f33658b.mo20001a(7, "UnknownTransport", 1, 1);
    }
}
