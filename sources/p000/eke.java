package p000;

import java.util.Set;

/* renamed from: eke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eke {

    /* renamed from: a */
    private Long f15176a;

    /* renamed from: b */
    private Long f15177b;

    /* renamed from: c */
    private Set f15178c;

    /* renamed from: a */
    public final ekf mo10231a() {
        String str = this.f15176a == null ? " delta" : "";
        if (this.f15177b == null) {
            str = str.concat(" maxAllowedDelay");
        }
        if (this.f15178c == null) {
            str = String.valueOf(str).concat(" flags");
        }
        if (str.isEmpty()) {
            return new eka(this.f15176a.longValue(), this.f15177b.longValue(), this.f15178c);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo10234b() {
        this.f15177b = 86400000L;
    }

    /* renamed from: a */
    public final void mo10232a(long j) {
        this.f15176a = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo10233a(Set set) {
        if (set != null) {
            this.f15178c = set;
            return;
        }
        throw new NullPointerException("Null flags");
    }
}
