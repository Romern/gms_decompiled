package p000;

import android.accounts.Account;

/* renamed from: aeuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeuo {

    /* renamed from: a */
    public Account f63850a;

    /* renamed from: b */
    public Boolean f63851b;

    /* renamed from: c */
    public Boolean f63852c;

    /* renamed from: d */
    public Long f63853d;

    /* renamed from: e */
    public String f63854e;

    /* renamed from: f */
    public Boolean f63855f;

    /* renamed from: g */
    public String f63856g;

    /* renamed from: a */
    public final aeup mo34581a() {
        String str = this.f63850a == null ? " account" : "";
        if (this.f63851b == null) {
            str = str.concat(" enableLocationFix");
        }
        if (this.f63852c == null) {
            str = String.valueOf(str).concat(" enableActivityFix");
        }
        if (this.f63853d == null) {
            str = String.valueOf(str).concat(" burstDuration");
        }
        if (this.f63854e == null) {
            str = String.valueOf(str).concat(" burstReason");
        }
        if (this.f63855f == null) {
            str = String.valueOf(str).concat(" enablePreburst");
        }
        if (this.f63856g == null) {
            str = String.valueOf(str).concat(" gcmMetrics");
        }
        if (str.isEmpty()) {
            return new aeug(this.f63850a, this.f63851b.booleanValue(), this.f63852c.booleanValue(), this.f63853d, this.f63854e, this.f63855f.booleanValue(), this.f63856g);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }
}
