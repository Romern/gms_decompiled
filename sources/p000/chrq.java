package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: chrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrq {

    /* renamed from: a */
    public static final chqg f189051a = chqg.m149394a("io.grpc.EquivalentAddressGroup.authorityOverride");

    /* renamed from: b */
    public final List f189052b;

    /* renamed from: c */
    public final chqh f189053c;

    /* renamed from: d */
    private final int f189054d = this.f189052b.hashCode();

    public chrq(SocketAddress socketAddress) {
        chqh chqh = chqh.f188999b;
        List singletonList = Collections.singletonList(socketAddress);
        bmxy.m108589a(!singletonList.isEmpty(), "addrs is empty");
        this.f189052b = Collections.unmodifiableList(new ArrayList(singletonList));
        bmxy.m108582a(chqh, "attrs");
        this.f189053c = chqh;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chrq) {
            chrq chrq = (chrq) obj;
            if (this.f189052b.size() == chrq.f189052b.size()) {
                for (int i = 0; i < this.f189052b.size(); i++) {
                    if (!((SocketAddress) this.f189052b.get(i)).equals(chrq.f189052b.get(i))) {
                        return false;
                    }
                }
                if (this.f189053c.equals(chrq.f189053c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f189054d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f189052b);
        String valueOf2 = String.valueOf(this.f189053c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
