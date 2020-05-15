package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: bok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bok implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private byte[] f5253a;

    public bok() {
    }

    /* renamed from: l */
    private final int mo3343l() {
        byte[] bArr = this.f5253a;
        return ((bArr[5] & 255) << 8) + (bArr[6] & 255);
    }

    /* renamed from: m */
    private final boj mo3344m() {
        int length;
        byte[] bArr = this.f5253a;
        if (bArr == null || (length = bArr.length) < 4) {
            throw m3404n();
        } else if (length == 4) {
            return boj.CASE_1;
        } else {
            if (length != 5 && (length != 6 || bArr[4] != 0 || bArr[5] != 0)) {
                if (bArr[4] == 0) {
                    if (length == 7) {
                        return boj.EXTENDED_CASE_2;
                    }
                    if (length == mo3343l() + 7) {
                        return boj.EXTENDED_CASE_1;
                    }
                    if (this.f5253a.length == mo3343l() + 9) {
                        return boj.EXTENDED_CASE_3;
                    }
                }
                byte[] bArr2 = this.f5253a;
                int length2 = bArr2.length;
                byte b = bArr2[4] & 255;
                if (length2 == b + 5) {
                    return boj.CASE_3;
                }
                if (length2 != b + 6) {
                    throw new bon("Wrong Length", bop.f5273m);
                } else if (bArr2[length2 - 1] != -1) {
                    return boj.CASE_4;
                } else {
                    throw m3404n();
                }
            } else if (bArr[4] != -1) {
                return boj.CASE_2;
            } else {
                throw m3404n();
            }
        }
    }

    /* renamed from: n */
    private final IllegalArgumentException m3404n() {
        byte[] bArr = this.f5253a;
        String valueOf = String.valueOf(bArr != null ? cbm.m3893a(bArr) : "null");
        return new IllegalArgumentException(valueOf.length() == 0 ? new String("APDU encoding is invalid (, not according ISO 7816). ") : "APDU encoding is invalid (, not according ISO 7816). ".concat(valueOf));
    }

    /* renamed from: a */
    public final String mo3325a() {
        return cbm.m3895a(this.f5253a, false);
    }

    /* renamed from: b */
    public final byte mo3326b() {
        return this.f5253a[0];
    }

    /* renamed from: c */
    public final byte mo3327c() {
        return this.f5253a[1];
    }

    /* renamed from: d */
    public final byte mo3328d() {
        return this.f5253a[2];
    }

    /* renamed from: e */
    public final byte mo3329e() {
        return this.f5253a[3];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bok) {
            return Arrays.equals(this.f5253a, ((bok) obj).mo3333h());
        }
        return false;
    }

    /* renamed from: f */
    public final byte[] mo3331f() {
        boj m = mo3344m();
        boj boj = boj.CASE_1;
        if (!m.f5250i) {
            return new byte[0];
        }
        int ordinal = mo3344m().ordinal();
        if (ordinal == 2 || ordinal == 3) {
            byte[] bArr = this.f5253a;
            int i = bArr[4] & 255;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 5, bArr2, 0, i);
            return bArr2;
        } else if (ordinal == 4 || ordinal == 6) {
            int l = mo3343l();
            byte[] bArr3 = new byte[l];
            System.arraycopy(this.f5253a, 7, bArr3, 0, l);
            return bArr3;
        } else {
            String valueOf = String.valueOf(bok.class);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Implementation fault detected in ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: g */
    public final boolean mo3332g() {
        return mo3344m().f5251j;
    }

    /* renamed from: h */
    public final byte[] mo3333h() {
        return (byte[]) this.f5253a.clone();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5253a);
    }

    /* renamed from: i */
    public final int mo3335i() {
        boj m = mo3344m();
        boj boj = boj.CASE_1;
        if (!m.f5252k) {
            return this.f5253a[4] & 255;
        }
        byte[] bArr = this.f5253a;
        return (bArr[6] & 255) + ((bArr[5] & 255) * 255);
    }

    /* renamed from: j */
    public final int mo3336j() {
        boj m = mo3344m();
        if (!m.f5251j) {
            return -1;
        }
        if (m.f5252k) {
            byte[] bArr = this.f5253a;
            int length = bArr.length;
            return (bArr[length - 1] & 255) | ((bArr[length - 2] & 255) << 8);
        }
        byte[] bArr2 = this.f5253a;
        byte b = bArr2[bArr2.length - 1];
        return b != 0 ? b & 255 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* renamed from: k */
    public final byte mo3337k() {
        return (byte) ((mo3329e() & 255) >> 3);
    }

    public final String toString() {
        return mo3344m().f5249h.concat(": ").concat(cbm.m3895a(this.f5253a, false));
    }

    public bok(byte b, byte b2) {
        byte[] bArr = new byte[5];
        this.f5253a = bArr;
        bArr[0] = 0;
        bArr[1] = -78;
        bArr[2] = b;
        bArr[3] = b2;
        mo3344m();
    }

    public bok(byte[] bArr) {
        this.f5253a = (byte[]) bArr.clone();
        mo3344m();
    }
}
