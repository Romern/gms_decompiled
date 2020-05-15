package p000;

import java.io.Serializable;

/* renamed from: bnib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnib implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f131655a;

    public bnib(Object[] objArr) {
        this.f131655a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return bnic.m109496a(this.f131655a);
    }
}
