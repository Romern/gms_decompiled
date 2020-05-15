package p000;

/* renamed from: bfcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcw {

    /* renamed from: a */
    public final btzs f113444a;

    /* renamed from: b */
    private final bfcz f113445b;

    public bfcw(bfcz bfcz) {
        this.f113445b = bfcz;
        btzs btzs = new btzs();
        this.f113444a = new btzm(btzs, btzl.m119052a(1000, btzs.f153156c)).mo72501a();
    }

    /* renamed from: a */
    public final int mo61428a() {
        return this.f113444a.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: btzs.a(long, boolean):java.lang.Object
     arg types: [long, int]
     candidates:
      btzs.a(long, java.lang.Object):java.lang.Object
      btzs.a(java.lang.Object, boolean):java.lang.Object
      buan.a(java.lang.Object, boolean):java.lang.Object
      btzs.a(long, boolean):java.lang.Object */
    /* renamed from: a */
    public final bfcx mo61429a(long j) {
        return (bfcx) this.f113444a.mo72510a(j, true);
    }

    /* renamed from: a */
    public final void mo61430a(bfcx bfcx) {
        if (mo61428a() == 1000) {
            this.f113445b.mo61436a();
        }
        this.f113444a.mo72509a(bfcx.f113446a, bfcx);
    }
}
