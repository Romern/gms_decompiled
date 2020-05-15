package p000;

/* renamed from: banc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class banc extends bamz {

    /* renamed from: g */
    final /* synthetic */ bane f101334g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public banc(bane bane) {
        super(bane);
        this.f101334g = bane;
        if (bane.f101344d.mo32679a()) {
            bane.f101341a.readLock().lock();
        }
    }

    public final void close() {
        bmxy.m108601b(!this.f101328a, "Transaction is closed");
        try {
            mo55794a(this.f101329b);
            this.f101328a = true;
            if (this.f101334g.f101344d.mo32679a()) {
                this.f101334g.f101341a.readLock().unlock();
            }
            mo55794a(this.f101331d);
        } catch (Throwable th) {
            this.f101328a = true;
            if (this.f101334g.f101344d.mo32679a()) {
                this.f101334g.f101341a.readLock().unlock();
            }
            mo55794a(this.f101331d);
            throw th;
        }
    }
}
