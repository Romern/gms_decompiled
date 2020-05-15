package p000;

import java.net.NetworkInterface;
import java.util.List;

/* renamed from: agbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agbw {

    /* renamed from: a */
    public final NetworkInterface f65205a;

    public agbw(NetworkInterface networkInterface) {
        this.f65205a = networkInterface;
    }

    /* renamed from: a */
    public final List mo35212a() {
        return this.f65205a.getInterfaceAddresses();
    }

    public final String toString() {
        return this.f65205a.toString();
    }
}
