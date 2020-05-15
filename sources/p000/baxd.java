package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: baxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baxd {

    /* renamed from: a */
    private Boolean f102021a;

    /* renamed from: b */
    private bnic f102022b;

    /* renamed from: a */
    public final baxf mo56015a() {
        if (this.f102022b == null) {
            this.f102022b = bnon.f131923a;
        }
        String str = this.f102021a == null ? " requireUnmeteredNetwork" : "";
        if (str.isEmpty()) {
            return new baxb(this.f102021a.booleanValue(), this.f102022b);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo56016a(Set set) {
        this.f102022b = bnic.m109495a((Collection) set);
    }

    /* renamed from: a */
    public final void mo56017a(boolean z) {
        this.f102021a = Boolean.valueOf(z);
    }
}
