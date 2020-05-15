package p000;

import java.io.Serializable;
import java.util.EnumMap;

/* renamed from: bngo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngo implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final EnumMap f131601a;

    public bngo(EnumMap enumMap) {
        this.f131601a = enumMap;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return new bngp(this.f131601a);
    }
}
