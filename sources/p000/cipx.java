package p000;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: cipx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cipx implements Serializable, Comparable {

    /* renamed from: a */
    static final char[] f191214a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final cipx f191215b = m150786a(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: c */
    final byte[] f191216c;

    /* renamed from: d */
    transient int f191217d;

    /* renamed from: e */
    transient String f191218e;

    public cipx(byte[] bArr) {
        this.f191216c = bArr;
    }

    /* renamed from: a */
    public static cipx m150785a(String str) {
        if (str != null) {
            cipx cipx = new cipx(str.getBytes(ciqu.f191265a));
            cipx.f191218e = str;
            return cipx;
        }
        throw new IllegalArgumentException("s == null");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            cipx cipx = new cipx(bArr);
            try {
                Field declaredField = cipx.class.getDeclaredField("c");
                declaredField.setAccessible(true);
                declaredField.set(this, cipx.f191216c);
            } catch (NoSuchFieldException e) {
                throw new AssertionError();
            } catch (IllegalAccessException e2) {
                throw new AssertionError();
            }
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("byteCount < 0: ");
            sb.append(readInt);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f191216c.length);
        objectOutputStream.write(this.f191216c);
    }

    /* renamed from: b */
    public String mo86341b() {
        byte[] bArr = this.f191216c;
        byte[] bArr2 = cips.f191209a;
        int length = bArr.length;
        byte[] bArr3 = new byte[(((length + 2) / 3) * 4)];
        int i = length - (length % 3);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 3) {
            int i4 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i3] & 255) >> 2];
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr3[i4] = bArr2[((bArr[i3] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i7 = i5 + 1;
            int i8 = i3 + 2;
            bArr3[i5] = bArr2[((bArr[i6] & 15) << 2) | ((bArr[i8] & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[bArr[i8] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(bArr[i] & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            int i11 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i] & 255) >> 2];
            int i12 = i11 + 1;
            int i13 = i + 1;
            bArr3[i11] = bArr2[((bArr[i] & 3) << 4) | ((bArr[i13] & 255) >> 4)];
            bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            bArr3[i12 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public String mo86342c() {
        byte[] bArr = this.f191216c;
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f191214a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        cipx cipx = (cipx) obj;
        int e = mo86345e();
        int e2 = cipx.mo86345e();
        int min = Math.min(e, e2);
        int i = 0;
        while (true) {
            if (i < min) {
                byte a = mo86335a(i) & 255;
                byte a2 = cipx.mo86335a(i) & 255;
                if (a != a2) {
                    return a >= a2 ? 1 : -1;
                }
                i++;
            } else if (e == e2) {
                return 0;
            } else {
                if (e < e2) {
                    return -1;
                }
            }
        }
    }

    /* renamed from: d */
    public cipx mo86344d() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f191216c;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new cipx(bArr2);
            }
            i++;
        }
    }

    /* renamed from: e */
    public int mo86345e() {
        return this.f191216c.length;
    }

    public boolean equals(Object obj) {
        cipx cipx;
        byte[] bArr;
        int length;
        if (obj != this) {
            return (obj instanceof cipx) && (cipx = (cipx) obj).mo86345e() == (length = (bArr = this.f191216c).length) && cipx.mo86338a(0, bArr, 0, length);
        }
        return true;
    }

    /* renamed from: f */
    public byte[] mo86347f() {
        return (byte[]) this.f191216c.clone();
    }

    /* renamed from: g */
    public cipx mo86348g() {
        byte[] bArr = this.f191216c;
        int length = bArr.length;
        if (length < 64) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("endIndex > length(");
            sb.append(length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        } else if (length == 64) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new cipx(bArr2);
        }
    }

    public int hashCode() {
        int i = this.f191217d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f191216c);
        this.f191217d = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.f191216c.length == 0) {
            return "[size=0]";
        }
        String a = mo86336a();
        int length = a.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                if (i2 == 64) {
                    break;
                }
                int codePointAt = a.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            } else {
                i = a.length();
                break;
            }
        }
        i = -1;
        if (i != -1) {
            String replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a.length()) {
                int length2 = this.f191216c.length;
                StringBuilder sb = new StringBuilder(String.valueOf(replace).length() + 25);
                sb.append("[size=");
                sb.append(length2);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + 7);
            sb2.append("[text=");
            sb2.append(replace);
            sb2.append("]");
            return sb2.toString();
        }
        int length3 = this.f191216c.length;
        if (length3 <= 64) {
            String c = mo86342c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 6);
            sb3.append("[hex=");
            sb3.append(c);
            sb3.append("]");
            return sb3.toString();
        }
        String c2 = mo86348g().mo86342c();
        StringBuilder sb4 = new StringBuilder(String.valueOf(c2).length() + 24);
        sb4.append("[size=");
        sb4.append(length3);
        sb4.append(" hex=");
        sb4.append(c2);
        sb4.append("…]");
        return sb4.toString();
    }

    /* renamed from: a */
    public static cipx m150786a(byte... bArr) {
        if (bArr != null) {
            return new cipx((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public byte mo86335a(int i) {
        return this.f191216c[i];
    }

    /* renamed from: a */
    public String mo86336a() {
        String str = this.f191218e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f191216c, ciqu.f191265a);
        this.f191218e = str2;
        return str2;
    }

    /* renamed from: a */
    public void mo86337a(cipu cipu) {
        byte[] bArr = this.f191216c;
        cipu.mo86294b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo86338a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f191216c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && ciqu.m150906a(bArr2, i, bArr, i2, i3);
    }

    /* renamed from: a */
    public final boolean mo86339a(cipx cipx) {
        return mo86340a(cipx, cipx.mo86345e());
    }

    /* renamed from: a */
    public boolean mo86340a(cipx cipx, int i) {
        return cipx.mo86338a(0, this.f191216c, 0, i);
    }
}
