package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: bwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bwz implements Serializable {

    /* renamed from: k */
    public final bzu f5929k;

    /* renamed from: l */
    public byte[] f5930l;

    protected bwz(byte[] bArr, bzu bzu) {
        this(bArr, true, bzu);
    }

    /* renamed from: a */
    public static byte[] m3708a(bwz... bwzArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (bwz bwz : bwzArr) {
                byteArrayOutputStream.write(bwz.mo3563i());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: aP */
    public void mo3547aP() {
    }

    /* renamed from: b */
    public void mo3556b(byte[] bArr) {
    }

    /* renamed from: c */
    public final String mo3558c(int i) {
        return !mo3557b(i) ? "0" : "1";
    }

    /* renamed from: d */
    public final String mo3559d(int i) {
        return !mo3557b(i) ? "not " : "";
    }

    /* renamed from: e */
    public final byte[] mo3560e(int i) {
        byte[] bArr = this.f5930l;
        if (i + 6 <= bArr.length) {
            byte[] bArr2 = new byte[6];
            System.arraycopy(bArr, i, bArr2, 0, 6);
            return bArr2;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            bwz bwz = (bwz) obj;
            if (Arrays.equals(this.f5930l, bwz.f5930l)) {
                bzu bzu = this.f5929k;
                bzu bzu2 = bwz.f5929k;
                if (bzu == bzu2) {
                    return true;
                }
                if (bzu == null || !bzu.equals(bzu2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f5930l) + 259) * 37;
        bzu bzu = this.f5929k;
        return hashCode + (bzu != null ? bzu.hashCode() : 0);
    }

    /* renamed from: i */
    public final byte[] mo3563i() {
        return (byte[]) this.f5930l.clone();
    }

    /* renamed from: j */
    public final bpc mo3564j() {
        return bpk.m3438a(this.f5929k.f6274b, mo3563i());
    }

    /* renamed from: k */
    public final String mo3565k() {
        int i = this.f5929k.f6278f;
        byte[] i2 = mo3563i();
        if (i != 0) {
            int i3 = i - 1;
            if (i3 == 0) {
                return cbm.m3895a(i2, false).replaceFirst("^0*(?!$)", "");
            }
            if (i3 == 1) {
                return cbm.m3895a(i2, false).replaceAll("F*$", "");
            }
            if (i3 == 2) {
                return cbm.m3895a(i2, false);
            }
            if (i3 == 4) {
                return cbm.m3895a(i2, false);
            }
            if (i3 == 5) {
                return cbm.m3895a(i2, false);
            }
            if (i3 == 6) {
                return cbm.m3895a(i2, false);
            }
            String a = bzw.m3828a(i);
            StringBuilder sb = new StringBuilder(a.length() + 19);
            sb.append("Unsupported format ");
            sb.append(a);
            throw new IllegalStateException(sb.toString());
        }
        throw null;
    }

    public String toString() {
        int i = this.f5929k.f6278f;
        byte[] bArr = this.f5930l;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 0) {
                return String.valueOf(cbm.m3895a(bArr, false).replaceFirst("^0+(?!$)", ""));
            }
            if (i2 == 1) {
                return String.valueOf(cbm.m3895a(bArr, false).replaceAll("F", ""));
            }
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                return new String(bArr);
            }
            return cbm.m3895a(bArr, false);
        }
        throw null;
    }

    protected bwz(byte[] bArr, boolean z, bzu bzu) {
        if (bArr != null) {
            this.f5930l = z ? (byte[]) bArr.clone() : bArr;
            this.f5929k = bzu;
            mo3454b();
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null");
    }

    /* renamed from: b */
    private final void mo3454b() {
        int length = mo3563i().length;
        bzu bzu = this.f5929k;
        int i = bzu.f6275c;
        if (i == -1 || i == length) {
            int i2 = bzu.f6276d;
            if (length < i2 || length > bzu.f6277e) {
                String str = bzu.f6273a;
                int i3 = bzu.f6277e;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100);
                sb.append("Invalid length for data elemment ");
                sb.append(str);
                sb.append("; expected between ");
                sb.append(i2);
                sb.append(" and ");
                sb.append(i3);
                sb.append(", but was ");
                sb.append(length);
                throw new IllegalStateException(sb.toString());
            }
            int i4 = bzu.f6278f;
            byte[] bArr = this.f5930l;
            if (i4 != 0) {
                int i5 = i4 - 1;
                int i6 = 0;
                if (i5 == 0) {
                    String a = cbm.m3895a(bArr, false);
                    while (i6 < a.length()) {
                        char charAt = a.charAt(i6);
                        if (charAt >= '0' && charAt <= '9') {
                            i6++;
                        } else {
                            String valueOf = String.valueOf(cbm.m3893a(bArr));
                            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid numeric value: ") : "Invalid numeric value: ".concat(valueOf));
                        }
                    }
                } else if (i5 == 1) {
                    String a2 = cbm.m3895a(bArr, false);
                    while (i6 < a2.length()) {
                        char charAt2 = a2.charAt(i6);
                        if (charAt2 != 'F' && (charAt2 < '0' || charAt2 > '9')) {
                            String valueOf2 = String.valueOf(cbm.m3893a(bArr));
                            throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid compact numeric value: ") : "Invalid compact numeric value: ".concat(valueOf2));
                        }
                        i6++;
                    }
                } else if (i5 != 2) {
                    if (i5 == 4) {
                        String str2 = new String(bArr);
                        while (i6 < str2.length()) {
                            char charAt3 = str2.charAt(i6);
                            if ((charAt3 >= '0' && charAt3 <= '9') || ((charAt3 >= 'a' && charAt3 <= 'z') || (charAt3 >= 'A' && charAt3 <= 'Z'))) {
                                i6++;
                            } else {
                                String valueOf3 = String.valueOf(cbm.m3893a(bArr));
                                throw new IllegalArgumentException(valueOf3.length() == 0 ? new String("Invalid alpha numeric value: ") : "Invalid alpha numeric value: ".concat(valueOf3));
                            }
                        }
                    } else if (i5 == 5) {
                        int length2 = bArr.length;
                        while (i6 < length2) {
                            byte b = bArr[i6];
                            byte b2 = b & 240;
                            if (!((b & 15) == 15 && b2 == 7) && b2 >= 2) {
                                i6++;
                            } else {
                                String valueOf4 = String.valueOf(cbm.m3893a(bArr));
                                throw new IllegalArgumentException(valueOf4.length() == 0 ? new String("Invalid alpha numeric special value: ") : "Invalid alpha numeric special value: ".concat(valueOf4));
                            }
                        }
                    } else if (i5 != 6) {
                        String a3 = bzw.m3828a(i4);
                        StringBuilder sb2 = new StringBuilder(a3.length() + 19);
                        sb2.append("Unsupported format ");
                        sb2.append(a3);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
                mo3556b(this.f5930l);
                return;
            }
            throw null;
        }
        String str3 = bzu.f6273a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 76);
        sb3.append("Invalid length for data elemment ");
        sb3.append(str3);
        sb3.append("; expected ");
        sb3.append(i);
        sb3.append(", but was ");
        sb3.append(length);
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: a */
    public final byte mo3550a(int i) {
        return this.f5930l[i];
    }

    /* renamed from: a */
    public final void mo3551a(int i, int i2, boolean z) {
        byte[] bArr = this.f5930l;
        if (i < bArr.length) {
            byte b = (byte) (1 << i2);
            byte b2 = (byte) (bArr[i] & (b ^ -1));
            if (z) {
                b2 = (byte) (b | b2);
            }
            bArr[i] = b2;
            return;
        }
        throw new IndexOutOfBoundsException("byte index is out of bounds");
    }

    /* renamed from: a */
    public final void mo3552a(OutputStream outputStream) {
        outputStream.write(this.f5930l);
    }

    /* renamed from: a */
    public final void mo3553a(byte[] bArr) {
        if (bArr != null) {
            this.f5930l = (byte[]) bArr.clone();
            mo3454b();
            mo3547aP();
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null");
    }

    /* renamed from: a */
    public final void mo3554a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f5930l, 0, bArr, i, i2);
    }

    /* renamed from: a */
    public final boolean mo3555a(int i, int i2) {
        byte[] bArr = this.f5930l;
        if (i < bArr.length) {
            return (bArr[i] & ((byte) (1 << i2))) != 0;
        }
        throw new IndexOutOfBoundsException("byte index is out of bounds");
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo3557b(int i) {
        int length = this.f5930l.length * 8;
        if (i < length) {
            return mo3555a(i >> 3, 7 - (i & 7));
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("bit position ");
        sb.append(i);
        sb.append(" is out of bound ");
        sb.append(length);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
