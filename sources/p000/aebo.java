package p000;

import android.os.Bundle;

/* renamed from: aebo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aebo {

    /* renamed from: a */
    public static final aebo f63077a = new aebo(0, 30, 3600);

    /* renamed from: b */
    public final int f63078b;

    /* renamed from: c */
    public final int f63079c;

    /* renamed from: d */
    public final int f63080d;

    static {
        new aebo(1, 30, 3600);
    }

    public aebo(int i, int i2, int i3) {
        this.f63078b = i;
        this.f63079c = i2;
        this.f63080d = i3;
    }

    /* renamed from: a */
    public static aebo m51579a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        aebn aebn = new aebn();
        aebn.f63074a = bundle.getInt("retry_policy");
        aebn.f63075b = bundle.getInt("initial_backoff_seconds");
        aebn.f63076c = bundle.getInt("maximum_backoff_seconds");
        return aebn.mo34011a();
    }

    /* renamed from: b */
    public final void mo34012b(Bundle bundle) {
        bundle.putInt("retry_policy", this.f63078b);
        bundle.putInt("initial_backoff_seconds", this.f63079c);
        bundle.putInt("maximum_backoff_seconds", this.f63080d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aebo) {
            aebo aebo = (aebo) obj;
            return aebo.f63078b == this.f63078b && aebo.f63079c == this.f63079c && aebo.f63080d == this.f63080d;
        }
    }

    public final int hashCode() {
        return (((((this.f63078b + 1) ^ 1000003) * 1000003) ^ this.f63079c) * 1000003) ^ this.f63080d;
    }

    public final String toString() {
        int i = this.f63078b;
        int i2 = this.f63079c;
        int i3 = this.f63080d;
        StringBuilder sb = new StringBuilder(74);
        sb.append("policy=");
        sb.append(i);
        sb.append(" initial_backoff=");
        sb.append(i2);
        sb.append(" maximum_backoff=");
        sb.append(i3);
        return sb.toString();
    }
}
