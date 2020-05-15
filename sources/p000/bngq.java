package p000;

import java.io.Serializable;
import java.util.EnumSet;

/* renamed from: bngq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngq implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final EnumSet f131603a;

    public bngq(EnumSet enumSet) {
        this.f131603a = enumSet;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return new bngr(this.f131603a.clone());
    }
}
