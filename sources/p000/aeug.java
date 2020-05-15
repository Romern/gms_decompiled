package p000;

import android.accounts.Account;

/* renamed from: aeug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeug extends aeup {

    /* renamed from: a */
    public final Account f63823a;

    /* renamed from: b */
    public final boolean f63824b;

    /* renamed from: c */
    public final boolean f63825c;

    /* renamed from: d */
    public final Long f63826d;

    /* renamed from: e */
    public final String f63827e;

    /* renamed from: f */
    public final boolean f63828f;

    /* renamed from: g */
    public final String f63829g;

    public aeug(Account account, boolean z, boolean z2, Long l, String str, boolean z3, String str2) {
        this.f63823a = account;
        this.f63824b = z;
        this.f63825c = z2;
        this.f63826d = l;
        this.f63827e = str;
        this.f63828f = z3;
        this.f63829g = str2;
    }

    /* renamed from: a */
    public final Account mo34569a() {
        return this.f63823a;
    }

    /* renamed from: b */
    public final boolean mo34570b() {
        return this.f63824b;
    }

    /* renamed from: c */
    public final boolean mo34571c() {
        return this.f63825c;
    }

    /* renamed from: d */
    public final Long mo34572d() {
        return this.f63826d;
    }

    /* renamed from: e */
    public final String mo34573e() {
        return this.f63827e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeup) {
            aeup aeup = (aeup) obj;
            return this.f63823a.equals(aeup.mo34569a()) && this.f63824b == aeup.mo34570b() && this.f63825c == aeup.mo34571c() && this.f63826d.equals(aeup.mo34572d()) && this.f63827e.equals(aeup.mo34573e()) && this.f63828f == aeup.mo34575f() && this.f63829g.equals(aeup.mo34576g());
        }
    }

    /* renamed from: f */
    public final boolean mo34575f() {
        return this.f63828f;
    }

    /* renamed from: g */
    public final String mo34576g() {
        return this.f63829g;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (this.f63823a.hashCode() ^ 1000003) * 1000003;
        int i3 = 1237;
        if (!this.f63824b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = (hashCode ^ i) * 1000003;
        if (!this.f63825c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int hashCode2 = (((((i4 ^ i2) * 1000003) ^ this.f63826d.hashCode()) * 1000003) ^ this.f63827e.hashCode()) * 1000003;
        if (this.f63828f) {
            i3 = 1231;
        }
        return ((hashCode2 ^ i3) * 1000003) ^ this.f63829g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f63823a);
        boolean z = this.f63824b;
        boolean z2 = this.f63825c;
        String valueOf2 = String.valueOf(this.f63826d);
        String str = this.f63827e;
        boolean z3 = this.f63828f;
        String str2 = this.f63829g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 141 + length2 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("OvenfreshDetails{account=");
        sb.append(valueOf);
        sb.append(", enableLocationFix=");
        sb.append(z);
        sb.append(", enableActivityFix=");
        sb.append(z2);
        sb.append(", burstDuration=");
        sb.append(valueOf2);
        sb.append(", burstReason=");
        sb.append(str);
        sb.append(", enablePreburst=");
        sb.append(z3);
        sb.append(", gcmMetrics=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
