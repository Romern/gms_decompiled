package p000;

import java.util.Arrays;

/* renamed from: aipt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aipt {

    /* renamed from: a */
    public final byte[] f69461a;

    /* renamed from: b */
    public int f69462b = 0;

    public aipt(byte[] bArr, int i) {
        this.f69461a = Arrays.copyOf(bArr, bArr.length);
        this.f69462b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aipt) && Arrays.equals(((aipt) obj).f69461a, this.f69461a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f69461a);
    }

    public final String toString() {
        return String.format("BlePeripheral { id=%s }", ails.m57438a(this.f69461a));
    }
}
