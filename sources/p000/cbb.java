package p000;

/* renamed from: cbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbb {
    /* renamed from: a */
    public static cba m3876a(Object obj) {
        String replaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return new cba(replaceAll.substring(lastIndexOf + 1));
    }

    /* renamed from: b */
    public static void m3883b(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* renamed from: a */
    public static RuntimeException m3877a(Throwable th) {
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public static void m3878a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    /* renamed from: a */
    public static void m3879a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m3880a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: a */
    public static void m3881a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static byte[] m3882a(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            int length = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i2, length);
            i2 += length;
        }
        return bArr3;
    }
}
