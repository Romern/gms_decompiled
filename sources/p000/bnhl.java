package p000;

import java.io.Serializable;

/* renamed from: bnhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnhl implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bnhe f131628a;

    public bnhl(bnhe bnhe) {
        this.f131628a = bnhe;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.f131628a.values();
    }
}
