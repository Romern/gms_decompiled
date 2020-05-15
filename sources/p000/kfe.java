package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: kfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kfe {

    /* renamed from: a */
    public final int f23976a;

    /* renamed from: b */
    public final qqa f23977b;

    /* renamed from: c */
    private final Context f23978c;

    public kfe(Context context, int i, qqa qqa) {
        this.f23978c = context;
        this.f23976a = i;
        this.f23977b = qqa;
    }

    /* renamed from: a */
    public final Intent mo14441a(int i) {
        return new Intent().setPackage(this.f23978c.getPackageName()).putExtra("component_name", "autofill").putExtra("data_type", i);
    }

    /* renamed from: b */
    public final void mo14446b() {
        lqv.m19545a(this.f23977b.mo24202b(mo14441a(this.f23976a)));
    }

    /* renamed from: a */
    public final bqgg mo14442a(Bundle bundle) {
        return qqk.m32658a(this.f23977b, mo14441a(this.f23976a), new kfb(this, bundle));
    }

    /* renamed from: a */
    public final bqgg mo14443a(bxxc bxxc, Bundle bundle) {
        return qqk.m32658a(this.f23977b, mo14441a(this.f23976a), new kfc(this, bxxc, bundle));
    }

    /* renamed from: a */
    public final void mo14444a() {
        lqv.m19545a(this.f23977b.mo24199a(mo14441a(this.f23976a)));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo14445a(Intent intent) {
        lqv.m19545a(this.f23977b.mo24202b(intent));
    }
}
