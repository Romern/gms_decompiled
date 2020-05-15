package p000;

import java.net.InetAddress;

/* renamed from: aiiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiiu extends aios {

    /* renamed from: a */
    private final InetAddress f68921a;

    /* renamed from: b */
    private final int f68922b;

    public aiiu(InetAddress inetAddress, int i) {
        if (inetAddress != null) {
            this.f68921a = inetAddress;
            this.f68922b = i;
            return;
        }
        throw new NullPointerException("Null ipAddress");
    }

    /* renamed from: a */
    public final InetAddress mo37556a() {
        return this.f68921a;
    }

    /* renamed from: b */
    public final int mo37557b() {
        return this.f68922b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aios) {
            aios aios = (aios) obj;
            return this.f68921a.equals(aios.mo37556a()) && this.f68922b == aios.mo37557b();
        }
    }

    public final int hashCode() {
        return ((this.f68921a.hashCode() ^ 1000003) * 1000003) ^ this.f68922b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f68921a);
        int i = this.f68922b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("Credentials{ipAddress=");
        sb.append(valueOf);
        sb.append(", port=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
