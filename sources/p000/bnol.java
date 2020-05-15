package p000;

import java.io.Serializable;

/* renamed from: bnol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnol implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object[] f131917a;

    /* renamed from: b */
    final int[] f131918b;

    public bnol(bnnn bnnn) {
        bnhy bnhy = (bnhy) bnnn;
        int size = bnhy.mo67324e().size();
        this.f131917a = new Object[size];
        this.f131918b = new int[size];
        int i = 0;
        for (bnno bnno : bnhy.mo67324e()) {
            this.f131917a[i] = bnno.f131866a;
            this.f131918b[i] = bnno.mo68118a();
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        bnhv bnhv = new bnhv(this.f131917a.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.f131917a;
            if (i >= objArr.length) {
                return bnhv.mo67740a();
            }
            bnhv.mo67741a(objArr[i], this.f131918b[i]);
            i++;
        }
    }
}
