package p000;

import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: addk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class addk {

    /* renamed from: a */
    public final KeyPair f61440a;

    /* renamed from: b */
    public final long f61441b;

    public addk(KeyPair keyPair, long j) {
        this.f61440a = keyPair;
        this.f61441b = j;
    }

    /* renamed from: a */
    public final String mo33348a() {
        return adea.m50243a(this.f61440a.getPublic().getEncoded());
    }

    /* renamed from: b */
    public final String mo33349b() {
        return adea.m50243a(this.f61440a.getPrivate().getEncoded());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof addk) {
            addk addk = (addk) obj;
            if (this.f61441b != addk.f61441b || !this.f61440a.getPublic().equals(addk.f61440a.getPublic()) || !this.f61440a.getPrivate().equals(addk.f61440a.getPrivate())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f61440a.getPublic(), this.f61440a.getPrivate(), Long.valueOf(this.f61441b)});
    }
}
