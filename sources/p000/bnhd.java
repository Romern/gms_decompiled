package p000;

import java.io.Serializable;
import java.util.Map;

/* renamed from: bnhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bnhd implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object[] f131616a;

    /* renamed from: b */
    private final Object[] f131617b;

    public bnhd(bnhe bnhe) {
        this.f131616a = new Object[bnhe.size()];
        this.f131617b = new Object[bnhe.size()];
        bnrd a = bnhe.entrySet().iterator();
        int i = 0;
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            this.f131616a[i] = entry.getKey();
            this.f131617b[i] = entry.getValue();
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo67699a(bnha bnha) {
        int i = 0;
        while (true) {
            Object[] objArr = this.f131616a;
            if (i >= objArr.length) {
                return bnha.mo67618b();
            }
            bnha.mo67695b(objArr[i], this.f131617b[i]);
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return mo67699a(new bnha(this.f131616a.length));
    }
}
