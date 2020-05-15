package p000;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: agal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agal extends agas {

    /* renamed from: a */
    public Inet6Address f65077a;

    /* renamed from: b */
    public Inet4Address f65078b;

    public agal(String[] strArr, int i, agap agap) {
        super(strArr, i, agap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35136a(agap agap) {
        int i;
        if (this.f65093d == 28) {
            i = 16;
        } else {
            i = 4;
        }
        byte[] bArr = new byte[i];
        agap.mo35146b(i);
        System.arraycopy(agap.f65083a, agap.f65085c, bArr, 0, i);
        agap.f65085c += i;
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (byAddress instanceof Inet4Address) {
                this.f65078b = (Inet4Address) byAddress;
                this.f65077a = null;
            } else if (byAddress instanceof Inet6Address) {
                this.f65078b = null;
                this.f65077a = (Inet6Address) byAddress;
            } else {
                this.f65078b = null;
                this.f65077a = null;
            }
        } catch (UnknownHostException e) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agal) && super.equals(obj)) {
            agal agal = (agal) obj;
            return sdg.m34949a(this.f65078b, agal.f65078b) && sdg.m34949a(this.f65077a, agal.f65077a);
        }
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        return (hashCode * 31) + Arrays.hashCode(new Object[]{this.f65078b}) + Arrays.hashCode(new Object[]{this.f65077a});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "%s: Inet4Address: %s Inet6Address: %s", this.f65093d != 1 ? "AAAA" : "A", this.f65078b, this.f65077a);
    }
}
