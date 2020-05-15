package p000;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: bnip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnip implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator f131674a;

    /* renamed from: b */
    final Object[] f131675b;

    public bnip(Comparator comparator, Object[] objArr) {
        this.f131674a = comparator;
        this.f131675b = objArr;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        bnio bnio = new bnio(this.f131674a);
        bnio.mo67799c(this.f131675b);
        return bnio.mo67751a();
    }
}
