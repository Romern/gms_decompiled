package p000;

import java.util.Map;

/* renamed from: ejz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejz extends ekh {

    /* renamed from: a */
    public final Map f15162a;

    /* renamed from: b */
    private final eme f15163b;

    public ejz(eme eme, Map map) {
        if (eme != null) {
            this.f15163b = eme;
            if (map != null) {
                this.f15162a = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* renamed from: a */
    public final eme mo10216a() {
        return this.f15163b;
    }

    /* renamed from: b */
    public final Map mo10217b() {
        return this.f15162a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekh) {
            ekh ekh = (ekh) obj;
            return this.f15163b.equals(ekh.mo10216a()) && this.f15162a.equals(ekh.mo10217b());
        }
    }

    public final int hashCode() {
        return ((this.f15163b.hashCode() ^ 1000003) * 1000003) ^ this.f15162a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15163b);
        String valueOf2 = String.valueOf(this.f15162a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("SchedulerConfig{clock=");
        sb.append(valueOf);
        sb.append(", values=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
