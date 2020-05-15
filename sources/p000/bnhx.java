package p000;

import java.io.Serializable;

/* renamed from: bnhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhx implements Serializable {

    /* renamed from: a */
    final bnhy f131650a;

    public bnhx(bnhy bnhy) {
        this.f131650a = bnhy;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.f131650a.mo67324e();
    }
}
