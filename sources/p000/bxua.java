package p000;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bxua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxua extends bxuc {

    /* renamed from: e */
    private final InputStream f164809e;

    /* renamed from: f */
    private final byte[] f164810f;

    /* renamed from: g */
    private int f164811g;

    /* renamed from: h */
    private int f164812h;

    /* renamed from: i */
    private int f164813i;

    /* renamed from: j */
    private int f164814j;

    /* renamed from: k */
    private int f164815k;

    /* renamed from: l */
    private int f164816l = Integer.MAX_VALUE;

    /* renamed from: D */
    private final void m123335D() {
        int i = this.f164811g + this.f164812h;
        this.f164811g = i;
        int i2 = this.f164815k + i;
        int i3 = this.f164816l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f164812h = i4;
            this.f164811g = i - i4;
            return;
        }
        this.f164812h = 0;
    }

    /* renamed from: h */
    private final void m123336h(int i) {
        if (m123337i(i)) {
            return;
        }
        if (i > (this.f164827c - this.f164815k) - this.f164813i) {
            throw bxwf.m124094g();
        }
        throw bxwf.m124088a();
    }

    /* renamed from: i */
    private final boolean m123337i(int i) {
        int i2 = this.f164813i;
        int i3 = this.f164811g;
        if (i2 + i > i3) {
            int i4 = this.f164827c;
            int i5 = this.f164815k;
            if (i > (i4 - i5) - i2 || i5 + i2 + i > this.f164816l) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f164810f;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i5 = this.f164815k + i2;
                this.f164815k = i5;
                i3 = this.f164811g - i2;
                this.f164811g = i3;
                this.f164813i = 0;
            }
            InputStream inputStream = this.f164809e;
            byte[] bArr2 = this.f164810f;
            int read = inputStream.read(bArr2, i3, Math.min(bArr2.length - i3, (this.f164827c - i5) - i3));
            if (read == 0 || read < -1 || read > this.f164810f.length) {
                String valueOf = String.valueOf(this.f164809e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } else if (read <= 0) {
                return false;
            } else {
                this.f164811g += read;
                m123335D();
                if (this.f164811g < i) {
                    return m123337i(i);
                }
                return true;
            }
        } else {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: j */
    private final byte[] m123338j(int i) {
        if (i == 0) {
            return bxwd.f164981b;
        }
        if (i >= 0) {
            int i2 = this.f164815k;
            int i3 = this.f164813i;
            int i4 = i2 + i3 + i;
            if (i4 - this.f164827c <= 0) {
                int i5 = this.f164816l;
                if (i4 <= i5) {
                    int i6 = this.f164811g - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096 && i7 > this.f164809e.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f164810f, this.f164813i, bArr, 0, i6);
                    this.f164815k += this.f164811g;
                    this.f164813i = 0;
                    this.f164811g = 0;
                    while (i6 < i) {
                        int read = this.f164809e.read(bArr, i6, i - i6);
                        if (read != -1) {
                            this.f164815k += read;
                            i6 += read;
                        } else {
                            throw bxwf.m124088a();
                        }
                    }
                    return bArr;
                }
                mo73797f((i5 - i2) - i3);
                throw bxwf.m124088a();
            }
            throw bxwf.m124094g();
        }
        throw bxwf.m124089b();
    }

    /* renamed from: k */
    private final List m123339k(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f164809e.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.f164815k += read;
                    i2 += read;
                } else {
                    throw bxwf.m124088a();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: l */
    private final byte[] m123340l(int i) {
        byte[] j = m123338j(i);
        if (j != null) {
            return j;
        }
        int i2 = this.f164813i;
        int i3 = this.f164811g;
        int i4 = i3 - i2;
        this.f164815k += i3;
        this.f164813i = 0;
        this.f164811g = 0;
        List k = m123339k(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f164810f, i2, bArr, 0, i4);
        int size = k.size();
        for (int i5 = 0; i5 < size; i5++) {
            byte[] bArr2 = (byte[]) k.get(i5);
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: A */
    public final boolean mo73783A() {
        return this.f164813i == this.f164811g && !m123337i(1);
    }

    /* renamed from: B */
    public final int mo73784B() {
        return this.f164815k + this.f164813i;
    }

    /* renamed from: C */
    public final byte mo73785C() {
        if (this.f164813i == this.f164811g) {
            m123336h(1);
        }
        byte[] bArr = this.f164810f;
        int i = this.f164813i;
        this.f164813i = i + 1;
        return bArr[i];
    }

    /* renamed from: a */
    public final int mo73786a() {
        if (!mo73783A()) {
            int t = mo73811t();
            this.f164814j = t;
            if (bxzh.m124563b(t) != 0) {
                return this.f164814j;
            }
            throw bxwf.m124091d();
        }
        this.f164814j = 0;
        return 0;
    }

    /* renamed from: b */
    public final double mo73788b() {
        return Double.longBitsToDouble(mo73821x());
    }

    /* renamed from: c */
    public final float mo73790c() {
        return Float.intBitsToFloat(mo73820w());
    }

    /* renamed from: d */
    public final long mo73792d() {
        return mo73818u();
    }

    /* renamed from: e */
    public final long mo73794e() {
        return mo73818u();
    }

    /* renamed from: f */
    public final int mo73796f() {
        return mo73811t();
    }

    /* renamed from: g */
    public final long mo73798g() {
        return mo73821x();
    }

    /* renamed from: m */
    public final byte[] mo73804m() {
        int t = mo73811t();
        int i = this.f164811g;
        int i2 = this.f164813i;
        if (t > i - i2 || t <= 0) {
            return m123340l(t);
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.f164810f, i2, i2 + t);
        this.f164813i += t;
        return copyOfRange;
    }

    /* renamed from: n */
    public final int mo73805n() {
        return mo73811t();
    }

    /* renamed from: o */
    public final int mo73806o() {
        return mo73811t();
    }

    /* renamed from: p */
    public final int mo73807p() {
        return mo73820w();
    }

    /* renamed from: q */
    public final long mo73808q() {
        return mo73821x();
    }

    /* renamed from: r */
    public final int mo73809r() {
        return bxuc.m123422g(mo73811t());
    }

    /* renamed from: s */
    public final long mo73810s() {
        return bxuc.m123415a(mo73818u());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r2[r3] >= 0) goto L_0x0066;
     */
    /* renamed from: t */
    public final int mo73811t() {
        byte b;
        int i = this.f164813i;
        int i2 = this.f164811g;
        if (i2 != i) {
            byte[] bArr = this.f164810f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f164813i = i3;
                return b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 >= 0) {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 < 0) {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 >= 0) {
                            i5 = i4 + 1;
                            byte b6 = bArr[i4];
                            b = (b5 ^ (b6 << 28)) ^ 266354560;
                            if (b6 < 0) {
                                i4 = i5 + 1;
                                if (bArr[i5] < 0) {
                                    i5 = i4 + 1;
                                    if (bArr[i4] < 0) {
                                        i4 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i4 + 1;
                                            if (bArr[i4] < 0) {
                                                i4 = i5 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            b = b5 ^ -2080896;
                        }
                    } else {
                        b = b4 ^ 16256;
                    }
                    i4 = i5;
                } else {
                    b = b3 ^ Byte.MIN_VALUE;
                }
                this.f164813i = i4;
                return b;
            }
        }
        return (int) mo73819v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (((long) r2[r3]) >= 0) goto L_0x0095;
     */
    /* renamed from: u */
    public final long mo73818u() {
        int i;
        long j;
        byte b;
        long j2;
        long j3;
        int i2 = this.f164813i;
        int i3 = this.f164811g;
        if (i3 != i2) {
            byte[] bArr = this.f164810f;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f164813i = i4;
                return (long) b2;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                byte b3 = b2 ^ (bArr[i4] << 7);
                if (b3 >= 0) {
                    i = i5 + 1;
                    byte b4 = b3 ^ (bArr[i5] << 14);
                    if (b4 < 0) {
                        i5 = i + 1;
                        byte b5 = b4 ^ (bArr[i] << 21);
                        if (b5 >= 0) {
                            i = i5 + 1;
                            long j4 = (((long) bArr[i5]) << 28) ^ ((long) b5);
                            if (j4 < 0) {
                                int i6 = i + 1;
                                long j5 = j4 ^ (((long) bArr[i]) << 35);
                                if (j5 >= 0) {
                                    i = i6 + 1;
                                    j4 = j5 ^ (((long) bArr[i6]) << 42);
                                    if (j4 < 0) {
                                        i6 = i + 1;
                                        j5 = j4 ^ (((long) bArr[i]) << 49);
                                        if (j5 >= 0) {
                                            i = i6 + 1;
                                            j = (j5 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i6 = i + 1;
                                            }
                                        } else {
                                            j3 = -558586000294016L;
                                        }
                                    } else {
                                        j2 = 4363953127296L;
                                    }
                                } else {
                                    j3 = -34093383808L;
                                }
                                j = j5 ^ j3;
                                i = i6;
                            } else {
                                j2 = 266354560;
                            }
                            j = j4 ^ j2;
                        } else {
                            b = b5 ^ -2080896;
                        }
                    } else {
                        j = (long) (b4 ^ 16256);
                    }
                    this.f164813i = i;
                    return j;
                }
                b = b3 ^ Byte.MIN_VALUE;
                i = i5;
                j = (long) b;
                this.f164813i = i;
                return j;
            }
        }
        return mo73819v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final long mo73819v() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte C = mo73785C();
            j |= ((long) (C & Byte.MAX_VALUE)) << i;
            if ((C & 128) == 0) {
                return j;
            }
        }
        throw bxwf.m124090c();
    }

    /* renamed from: w */
    public final int mo73820w() {
        int i = this.f164813i;
        if (this.f164811g - i < 4) {
            m123336h(4);
            i = this.f164813i;
        }
        byte[] bArr = this.f164810f;
        this.f164813i = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: x */
    public final long mo73821x() {
        int i = this.f164813i;
        if (this.f164811g - i < 8) {
            m123336h(8);
            i = this.f164813i;
        }
        byte[] bArr = this.f164810f;
        this.f164813i = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: y */
    public final void mo73816y() {
        this.f164815k = -this.f164813i;
    }

    /* renamed from: z */
    public final int mo73817z() {
        int i = this.f164816l;
        if (i != Integer.MAX_VALUE) {
            return i - (this.f164815k + this.f164813i);
        }
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxwd.a(java.lang.Object, java.lang.String):void
     arg types: [java.io.InputStream, java.lang.String]
     candidates:
      bxwd.a(java.lang.Object, java.lang.Object):java.lang.Object
      bxwd.a(java.lang.Object, java.lang.String):void */
    public bxua(InputStream inputStream, int i) {
        bxwd.m124084a((Object) inputStream, "input");
        this.f164809e = inputStream;
        this.f164810f = new byte[i];
        this.f164811g = 0;
        this.f164813i = 0;
        this.f164815k = 0;
    }

    /* renamed from: b */
    public final boolean mo73789b(int i) {
        int a;
        int a2 = bxzh.m124561a(i);
        int i2 = 0;
        if (a2 == 0) {
            if (this.f164811g - this.f164813i < 10) {
                while (i2 < 10) {
                    if (mo73785C() < 0) {
                        i2++;
                    }
                }
                throw bxwf.m124090c();
            }
            while (i2 < 10) {
                byte[] bArr = this.f164810f;
                int i3 = this.f164813i;
                this.f164813i = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw bxwf.m124090c();
            return true;
        } else if (a2 == 1) {
            mo73797f(8);
            return true;
        } else if (a2 == 2) {
            mo73797f(mo73811t());
            return true;
        } else if (a2 == 3) {
            do {
                a = mo73786a();
                if (a == 0) {
                    break;
                }
            } while (mo73789b(a));
            mo73787a(bxzh.m124562a(bxzh.m124563b(i), 4));
            return true;
        } else if (a2 == 4) {
            return false;
        } else {
            if (a2 == 5) {
                mo73797f(4);
                return true;
            }
            throw bxwf.m124093f();
        }
    }

    /* renamed from: c */
    public final int mo73791c(int i) {
        if (i >= 0) {
            int i2 = i + this.f164815k + this.f164813i;
            int i3 = this.f164816l;
            if (i2 <= i3) {
                this.f164816l = i2;
                m123335D();
                return i3;
            }
            throw bxwf.m124088a();
        }
        throw bxwf.m124089b();
    }

    /* renamed from: d */
    public final void mo73793d(int i) {
        this.f164816l = i;
        m123335D();
    }

    /* renamed from: e */
    public final byte[] mo73795e(int i) {
        int i2 = this.f164813i;
        if (i > this.f164811g - i2 || i <= 0) {
            return m123340l(i);
        }
        int i3 = i + i2;
        this.f164813i = i3;
        return Arrays.copyOfRange(this.f164810f, i2, i3);
    }

    /* renamed from: f */
    public final void mo73797f(int i) {
        int i2 = this.f164811g;
        int i3 = this.f164813i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f164813i = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f164815k;
            int i6 = i5 + i3;
            int i7 = this.f164816l;
            if (i6 + i <= i7) {
                this.f164815k = i6;
                this.f164811g = 0;
                this.f164813i = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.f164809e.skip(j);
                        if (skip >= 0 && skip <= j) {
                            if (skip == 0) {
                                break;
                            }
                            i4 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.f164809e.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.f164815k += i4;
                        m123335D();
                        throw th;
                    }
                }
                this.f164815k += i4;
                m123335D();
                if (i4 < i) {
                    int i8 = this.f164811g;
                    int i9 = i8 - this.f164813i;
                    this.f164813i = i8;
                    m123336h(1);
                    while (true) {
                        int i10 = i - i9;
                        int i11 = this.f164811g;
                        if (i10 > i11) {
                            i9 += i11;
                            this.f164813i = i11;
                            m123336h(1);
                        } else {
                            this.f164813i = i10;
                            return;
                        }
                    }
                }
            } else {
                mo73797f((i7 - i5) - i3);
                throw bxwf.m124088a();
            }
        } else {
            throw bxwf.m124089b();
        }
    }

    /* renamed from: a */
    public final void mo73787a(int i) {
        if (this.f164814j != i) {
            throw bxwf.m124092e();
        }
    }

    /* renamed from: h */
    public final int mo73799h() {
        return mo73820w();
    }

    /* renamed from: k */
    public final String mo73802k() {
        byte[] bArr;
        int t = mo73811t();
        int i = this.f164813i;
        int i2 = this.f164811g;
        if (t <= i2 - i && t > 0) {
            bArr = this.f164810f;
            this.f164813i = i + t;
        } else if (t == 0) {
            return "";
        } else {
            if (t <= i2) {
                m123336h(t);
                bArr = this.f164810f;
                this.f164813i = t;
                i = 0;
            } else {
                bArr = m123340l(t);
                i = 0;
            }
        }
        return bxzd.m124559c(bArr, i, t);
    }

    /* renamed from: l */
    public final ByteString mo73803l() {
        int t = mo73811t();
        int i = this.f164811g;
        int i2 = this.f164813i;
        if (t <= i - i2 && t > 0) {
            ByteString a = ByteString.m123262a(this.f164810f, i2, t);
            this.f164813i += t;
            return a;
        } else if (t == 0) {
            return ByteString.f164797b;
        } else {
            byte[] j = m123338j(t);
            if (j != null) {
                return ByteString.m123261a(j);
            }
            int i3 = this.f164813i;
            int i4 = this.f164811g;
            int i5 = i4 - i3;
            this.f164815k += i4;
            this.f164813i = 0;
            this.f164811g = 0;
            List k = m123339k(t - i5);
            byte[] bArr = new byte[t];
            System.arraycopy(this.f164810f, i3, bArr, 0, i5);
            int size = k.size();
            for (int i6 = 0; i6 < size; i6++) {
                byte[] bArr2 = (byte[]) k.get(i6);
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return ByteString.m123264b(bArr);
        }
    }

    /* renamed from: i */
    public final boolean mo73800i() {
        return mo73818u() != 0;
    }

    /* renamed from: j */
    public final String mo73801j() {
        int t = mo73811t();
        if (t > 0) {
            int i = this.f164811g;
            int i2 = this.f164813i;
            if (t <= i - i2) {
                String str = new String(this.f164810f, i2, t, bxwd.f164980a);
                this.f164813i += t;
                return str;
            }
        }
        if (t == 0) {
            return "";
        }
        if (t > this.f164811g) {
            return new String(m123340l(t), bxwd.f164980a);
        }
        m123336h(t);
        String str2 = new String(this.f164810f, this.f164813i, t, bxwd.f164980a);
        this.f164813i += t;
        return str2;
    }
}
