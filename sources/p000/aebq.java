package p000;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.common.Feature;

/* renamed from: aebq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aebq extends aebp {

    /* renamed from: b */
    private final aphs f63085b;

    public aebq(Context context, int i, int i2, aphs aphs) {
        super(context, i, i2);
        this.f63085b = aphs;
    }

    /* renamed from: a */
    public final void mo34019a(aapx aapx) {
        aphs aphs = this.f63085b;
        int i = aapx.f28863p;
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{aphb.f84374b};
        b.f43472a = new apjj(i);
        b.mo24979b();
        ((rjx) aphs).mo24701a(b.mo24977a());
    }

    /* renamed from: b */
    public final void mo34020b(ComponentName componentName) {
        this.f63085b.mo47223a(mo34017a(componentName));
    }

    /* renamed from: b */
    public final void mo34021b(ComponentName componentName, String str) {
        this.f63085b.mo47223a(mo34018a(componentName, str));
    }

    /* renamed from: b */
    public final boolean mo34022b(aeca aeca) {
        this.f63085b.mo47223a(mo34016a(aeca));
        return true;
    }
}
