package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: rla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rla implements rka {

    /* renamed from: a */
    public final int f43204a;

    /* renamed from: b */
    public final rkb f43205b;

    /* renamed from: c */
    public final rka f43206c;

    /* renamed from: d */
    final /* synthetic */ rlb f43207d;

    public rla(rlb rlb, int i, rkb rkb, rka rka) {
        this.f43207d = rlb;
        this.f43204a = i;
        this.f43205b = rkb;
        this.f43206c = rka;
        rkb.mo24791a((rka) this);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("beginFailureResolution for ");
        sb.append(valueOf);
        sb.toString();
        this.f43207d.mo24859b(connectionResult, this.f43204a);
    }
}
