package p000;

import java.io.Serializable;

/* renamed from: bngv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngv implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f131608a;

    public bngv(Object[] objArr) {
        this.f131608a = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return bngx.m109370a(this.f131608a);
    }
}
