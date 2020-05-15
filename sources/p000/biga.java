package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: biga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biga extends bhpv {

    /* renamed from: b */
    final /* synthetic */ boolean f120489b;

    /* renamed from: c */
    final /* synthetic */ bigb f120490c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public biga(bigb bigb, rkb rkb, boolean z) {
        super(rkb);
        this.f120490c = bigb;
        this.f120489b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rke mo64140a() {
        bigb bigb = this.f120490c;
        return aeja.m51917a(bigb.f120491a, bigb.mo64587b());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        super.mo9454a(status);
        if (status.mo17710c()) {
            bigb bigb = this.f120490c;
            bigb.f120493c = false;
            if (this.f120489b) {
                bigb.f120491a.mo24803g();
            }
        }
    }
}
