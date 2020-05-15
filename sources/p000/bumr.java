package p000;

/* renamed from: bumr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumr {
    /* renamed from: a */
    public static final int m120006a(byte b) {
        return b & 255;
    }

    /* renamed from: b */
    public static final long m120008b(byte b) {
        return (long) (b & 255);
    }

    /* renamed from: a */
    public static final int m120007a(byte[] bArr, int i) {
        return (m120006a(bArr[i]) << 8) + m120006a(bArr[i + 1]);
    }
}
