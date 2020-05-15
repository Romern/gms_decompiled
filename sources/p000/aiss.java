package p000;

import java.util.Arrays;

/* renamed from: aiss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiss {

    /* renamed from: a */
    public final String f69653a;

    public aiss(String str) {
        this.f69653a = str;
    }

    /* renamed from: a */
    public static aiss m57869a(byte[] bArr) {
        return new aiss(srv.m36164d(ails.m57446a(bArr, 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aiss) {
            return sdg.m34949a(this.f69653a, ((aiss) obj).f69653a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f69653a});
    }

    public final String toString() {
        return String.format("PeerId<id: %s>", this.f69653a);
    }
}
