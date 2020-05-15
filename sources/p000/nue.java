package p000;

/* renamed from: nue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nue implements Runnable {

    /* renamed from: a */
    final /* synthetic */ num f36508a;

    public nue(num num) {
        this.f36508a = num;
    }

    public final void run() {
        num num = this.f36508a;
        bnsn bnsn = num.f36518v;
        num.f36520A++;
        bnsi c = num.f36518v.mo68388c();
        c.mo68432a("nue", "run", 136, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68409a("Bind timed out: %d", this.f36508a.f36520A);
        if (this.f36508a.f36520A < 3) {
            bnsi c2 = num.f36518v.mo68388c();
            c2.mo68432a("nue", "run", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Retrying...");
            this.f36508a.f36527H = false;
            this.f36508a.mo21611s();
            return;
        }
        bnsi c3 = num.f36518v.mo68388c();
        c3.mo68432a("nue", "run", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c3.mo68405a("Giving up, crashing client");
        num num2 = this.f36508a;
        num2.f36548y.mo21602a(new RuntimeException(String.valueOf(num2.f35707d.flattenToShortString()).concat(" timeout during bind")));
    }
}
