package p000;

import java.util.Set;

/* renamed from: axxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxb {

    /* renamed from: a */
    public final Set f96635a;

    /* renamed from: b */
    public final String f96636b;

    public axxb(String str, Set set) {
        this.f96635a = set;
        this.f96636b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axxb axxb = (axxb) obj;
            String str = this.f96636b;
            if (str == null ? axxb.f96636b != null : !str.equals(axxb.f96636b)) {
                return false;
            }
            if (this.f96635a.equals(axxb.f96635a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f96635a.hashCode() * 31;
        String str = this.f96636b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f96636b;
        String valueOf = String.valueOf(this.f96635a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(valueOf).length());
        sb.append("ConnectedCapabilityNotification<");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append(">");
        return sb.toString();
    }
}
