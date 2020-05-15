package p000;

import java.util.Map;

/* renamed from: beoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beoy extends bepc {
    /* renamed from: a */
    public final Map mo60878a() {
        return null;
    }

    /* renamed from: b */
    public final Class mo60879b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bepc) {
            bepc bepc = (bepc) obj;
            return bepc.mo60878a() == null && bepc.mo60879b() == null;
        }
    }

    public final int hashCode() {
        return -721379959;
    }

    public final String toString() {
        String valueOf = String.valueOf((Object) null);
        String valueOf2 = String.valueOf((Object) null);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("StrictModeVmConfig{maxInstanceLimits=");
        sb.append(valueOf);
        sb.append(", leakDetector=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
