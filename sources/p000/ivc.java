package p000;

import java.util.Arrays;

/* renamed from: ivc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivc {

    /* renamed from: a */
    public final byte[] f21854a;

    public ivc(byte[] bArr) {
        this.f21854a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ivc) {
            return Arrays.equals(this.f21854a, ((ivc) obj).f21854a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21854a});
    }
}
