package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: apgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apgr {

    /* renamed from: b */
    private static final char[] f84345b = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public final byte[] f84346a;

    static {
        apgr.class.getSimpleName();
    }

    public apgr(byte[] bArr) {
        this.f84346a = bArr;
    }

    /* renamed from: a */
    public static String m70245a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            sb.append(f84345b[(b >> 4) & 15]);
            sb.append(f84345b[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final apgr mo47194b() {
        return new apgr(Arrays.copyOfRange(this.f84346a, 0, 4));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        try {
            if (obj instanceof apgr) {
                return Arrays.equals(this.f84346a, ((apgr) obj).f84346a);
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f84346a) + 527;
    }

    /* renamed from: a */
    public static byte[] m70246a(int i) {
        return ByteBuffer.allocate(4).putInt(i).array();
    }

    /* renamed from: a */
    public final int mo47192a() {
        return this.f84346a.length;
    }

    /* renamed from: a */
    public final boolean mo47193a(apgr apgr) {
        if (this.f84346a.length < apgr.mo47192a()) {
            return false;
        }
        byte[] bArr = apgr.f84346a;
        for (int i = 0; i < apgr.mo47192a(); i++) {
            if (this.f84346a[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
