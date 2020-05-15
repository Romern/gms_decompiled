package p000;

import android.os.Bundle;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: adba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adba implements rjz, rka {

    /* renamed from: a */
    public final bqgy f61230a = bqgy.m112818c();

    /* renamed from: b */
    private final rkb f61231b;

    public adba(rjy rjy) {
        rjy.mo24781a((rjz) this);
        rjy.mo24782a((rka) this);
        rkb b = rjy.mo24784b();
        this.f61231b = b;
        b.mo24801e();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        this.f61230a.mo69138b(this.f61231b);
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f61230a.mo69136a((Throwable) rzy.m34725a(new Status(connectionResult.f30065c, connectionResult.f30067e, connectionResult.f30066d)));
    }

    public adba(rjy rjy, FragmentActivity fragmentActivity) {
        rjy.mo24781a((rjz) this);
        rjy.mo24776a(fragmentActivity, this);
        rkb b = rjy.mo24784b();
        this.f61231b = b;
        b.mo24801e();
    }
}
