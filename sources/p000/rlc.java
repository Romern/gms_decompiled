package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: rlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rlc {

    /* renamed from: a */
    public final C1223np f43209a;

    /* renamed from: b */
    public final aucf f43210b = new aucf();

    /* renamed from: c */
    private final C1223np f43211c = new C1223np();

    /* renamed from: d */
    private int f43212d;

    /* renamed from: e */
    private boolean f43213e;

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public rlc(Iterable r6) {
        this.f43213e = false;
        this.f43209a = new C1223np();
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            this.f43209a.put(((rkc) r6.get(i)).mo24744f(), null);
        }
        this.f43212d = this.f43209a.keySet().size();
    }

    /* renamed from: a */
    public final void mo24845a(rkz rkz, ConnectionResult connectionResult, String str) {
        this.f43209a.put(rkz, connectionResult);
        this.f43211c.put(rkz, str);
        this.f43212d--;
        if (!connectionResult.mo17671b()) {
            this.f43213e = true;
        }
        if (this.f43212d != 0) {
            return;
        }
        if (this.f43213e) {
            this.f43210b.mo50390a((Exception) new rjq(this.f43209a));
            return;
        }
        this.f43210b.mo50391a(this.f43211c);
    }
}
