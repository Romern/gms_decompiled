package p000;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: bhpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bhpv implements rkl, rjz {

    /* renamed from: a */
    protected final rkb f119278a;

    public bhpv(rkb rkb) {
        this.f119278a = rkb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract rke mo64140a();

    /* renamed from: a */
    public final void mo7244a(int i) {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        mo64140a().mo9459a(this, 10, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public void mo9454a(rkk rkk) {
        this.f119278a.mo24796b(this);
    }
}
