package p000;

import android.os.Bundle;

/* renamed from: aglz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aglz {

    /* renamed from: a */
    protected long f65914a;

    /* renamed from: b */
    protected long f65915b;

    /* renamed from: c */
    public final agdo f65916c = new agly(this, this.f65917d.f65756y);

    /* renamed from: d */
    final /* synthetic */ agmb f65917d;

    public aglz(agmb agmb) {
        this.f65917d = agmb;
        long b = agmb.mo35534A().mo20506b();
        this.f65914a = b;
        this.f65915b = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo35646a() {
        long b = this.f65917d.mo35534A().mo20506b();
        long j = this.f65915b;
        this.f65915b = b;
        return b - j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35648b() {
        this.f65916c.mo35370c();
    }

    /* renamed from: a */
    public final boolean mo35647a(boolean z, boolean z2, long j) {
        this.f65917d.mo35241h();
        this.f65917d.mo35245l();
        if (!cfjd.m139819b() || !this.f65917d.mo35538v().mo35314a(aghn.f65490ap)) {
            j = this.f65917d.mo35534A().mo20506b();
        }
        cfji.f184204a.mo6606a();
        this.f65917d.mo35539w().f65632q.mo35459a(this.f65917d.mo35534A().mo20505a());
        long j2 = j - this.f65914a;
        if (!z && j2 < 1000) {
            this.f65917d.mo35497E().f65572k.mo35436a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (this.f65917d.mo35538v().mo35314a(aghn.f65459O) && !z2) {
            if (!cfjk.f184206a.mo6606a().mo81340a() || !this.f65917d.mo35538v().mo35314a(aghn.f65461Q) || !cfjd.m139819b() || !this.f65917d.mo35538v().mo35314a(aghn.f65490ap)) {
                j2 = mo35646a();
            } else {
                long j3 = this.f65915b;
                this.f65915b = j;
                j2 = j - j3;
            }
        }
        this.f65917d.mo35497E().f65572k.mo35436a("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        agkw.m54438a(this.f65917d.mo35236c().mo35597o(), bundle, true);
        if (this.f65917d.mo35538v().mo35314a(aghn.f65459O) && !this.f65917d.mo35538v().mo35314a(aghn.f65460P) && z2) {
            bundle.putLong("_fr", 1);
        }
        if (!this.f65917d.mo35538v().mo35314a(aghn.f65460P) || !z2) {
            this.f65917d.mo35239f().mo35570a("auto", "_e", bundle);
        }
        this.f65914a = j;
        this.f65916c.mo35370c();
        this.f65916c.mo35368a(3600000);
        return true;
    }
}
