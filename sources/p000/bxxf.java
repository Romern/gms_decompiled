package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: bxxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxf implements bxxv {

    /* renamed from: a */
    private static final int[] f165017a = new int[0];

    /* renamed from: b */
    private static final Unsafe f165018b = bxyx.m124498a();

    /* renamed from: c */
    private final int[] f165019c;

    /* renamed from: d */
    private final Object[] f165020d;

    /* renamed from: e */
    private final int f165021e;

    /* renamed from: f */
    private final int f165022f;

    /* renamed from: g */
    private final bxxc f165023g;

    /* renamed from: h */
    private final boolean f165024h;

    /* renamed from: i */
    private final boolean f165025i;

    /* renamed from: j */
    private final boolean f165026j;

    /* renamed from: k */
    private final int[] f165027k;

    /* renamed from: l */
    private final int f165028l;

    /* renamed from: m */
    private final int f165029m;

    /* renamed from: n */
    private final bxwp f165030n;

    /* renamed from: o */
    private final bxyn f165031o;

    private bxxf(int[] iArr, Object[] objArr, int i, int i2, bxxc bxxc, boolean z, int[] iArr2, int i3, int i4, bxwp bxwp, bxyn bxyn, bxut bxut) {
        this.f165019c = iArr;
        this.f165020d = objArr;
        this.f165021e = i;
        this.f165022f = i2;
        this.f165025i = bxxc instanceof GeneratedMessageLite;
        this.f165026j = z;
        boolean z2 = false;
        if (bxut != null && (bxxc instanceof bxvg)) {
            z2 = true;
        }
        this.f165024h = z2;
        this.f165027k = iArr2;
        this.f165028l = i3;
        this.f165029m = i4;
        this.f165030n = bxwp;
        this.f165031o = bxyn;
        this.f165023g = bxxc;
    }

    /* renamed from: a */
    private final int m124171a(int i, int i2) {
        if (i < this.f165021e || i > this.f165022f) {
            return -1;
        }
        return m124191b(i, i2);
    }

    /* renamed from: b */
    private static double m124190b(Object obj, long j) {
        return ((Double) bxyx.m124518f(obj, j)).doubleValue();
    }

    /* renamed from: c */
    private static float m124198c(Object obj, long j) {
        return ((Float) bxyx.m124518f(obj, j)).floatValue();
    }

    /* renamed from: d */
    private final int m124203d(int i) {
        return this.f165019c[i];
    }

    /* renamed from: e */
    private final int m124205e(int i) {
        return this.f165019c[i + 1];
    }

    /* renamed from: f */
    private final int m124207f(int i) {
        return this.f165019c[i + 2];
    }

    /* renamed from: g */
    private static int m124210g(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: h */
    private static boolean m124213h(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: i */
    private static long m124214i(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: j */
    private final int m124215j(int i) {
        if (i < this.f165021e || i > this.f165022f) {
            return -1;
        }
        return m124191b(i, 0);
    }

    /* renamed from: a */
    private final int m124172a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, bxtf bxtf) {
        Object obj2;
        Object obj3;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        bxtf bxtf2 = bxtf;
        Unsafe unsafe = f165018b;
        long j3 = (long) (this.f165019c[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj4, j2, Double.valueOf(bxtg.m123145c(bArr, i)));
                    unsafe.putInt(obj4, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj4, j2, Float.valueOf(bxtg.m123147d(bArr, i)));
                    unsafe.putInt(obj4, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int b = bxtg.m123143b(bArr2, i9, bxtf2);
                    unsafe.putObject(obj4, j2, Long.valueOf(bxtf2.f164768b));
                    unsafe.putInt(obj4, j3, i11);
                    return b;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int a = bxtg.m123141a(bArr2, i9, bxtf2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(bxtf2.f164767a));
                    unsafe.putInt(obj4, j3, i11);
                    return a;
                }
                break;
            case FelicaException.TYPE_ACTIVATE_FAILED:
            case KeyInformation.AES128_DES56:
                if (i12 == 1) {
                    unsafe.putObject(obj4, j2, Long.valueOf(bxtg.m123144b(bArr, i)));
                    unsafe.putInt(obj4, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj4, j2, Integer.valueOf(bxtg.m123140a(bArr, i)));
                    unsafe.putInt(obj4, j3, i11);
                    return i9 + 4;
                }
                break;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                if (i12 == 0) {
                    int b2 = bxtg.m123143b(bArr2, i9, bxtf2);
                    unsafe.putObject(obj4, j2, Boolean.valueOf(bxtf2.f164768b != 0));
                    unsafe.putInt(obj4, j3, i11);
                    return b2;
                }
                break;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                if (i12 == 2) {
                    int a2 = bxtg.m123141a(bArr2, i9, bxtf2);
                    int i14 = bxtf2.f164767a;
                    if (i14 == 0) {
                        unsafe.putObject(obj4, j2, "");
                    } else if ((i6 & 536870912) != 0 && !bxzd.m124557a(bArr2, a2, a2 + i14)) {
                        throw bxwf.m124096i();
                    } else {
                        unsafe.putObject(obj4, j2, new String(bArr2, a2, i14, bxwd.f164980a));
                        a2 += i14;
                    }
                    unsafe.putInt(obj4, j3, i11);
                    return a2;
                }
                break;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                if (i12 == 2) {
                    int a3 = bxtg.m123139a(m124178a(i13), bArr2, i9, i2, bxtf2);
                    if (unsafe.getInt(obj4, j3) == i11) {
                        obj2 = unsafe.getObject(obj4, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        unsafe.putObject(obj4, j2, bxwd.m124081a(obj2, bxtf2.f164769c));
                    } else {
                        unsafe.putObject(obj4, j2, bxtf2.f164769c);
                    }
                    unsafe.putInt(obj4, j3, i11);
                    return a3;
                }
                break;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                if (i12 == 2) {
                    int e = bxtg.m123149e(bArr2, i9, bxtf2);
                    unsafe.putObject(obj4, j2, bxtf2.f164769c);
                    unsafe.putInt(obj4, j3, i11);
                    return e;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int a4 = bxtg.m123141a(bArr2, i9, bxtf2);
                    int i15 = bxtf2.f164767a;
                    bxvr c = m124199c(i13);
                    if (c == null || c.mo3213a(i15)) {
                        unsafe.putObject(obj4, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj4, j3, i11);
                    } else {
                        m124200c(obj).mo74283a(i10, Long.valueOf((long) i15));
                    }
                    return a4;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int a5 = bxtg.m123141a(bArr2, i9, bxtf2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(bxuc.m123422g(bxtf2.f164767a)));
                    unsafe.putInt(obj4, j3, i11);
                    return a5;
                }
                break;
            case KeyInformation.AES128_DES112:
                if (i12 == 0) {
                    int b3 = bxtg.m123143b(bArr2, i9, bxtf2);
                    unsafe.putObject(obj4, j2, Long.valueOf(bxuc.m123415a(bxtf2.f164768b)));
                    unsafe.putInt(obj4, j3, i11);
                    return b3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int a6 = bxtg.m123138a(m124178a(i13), bArr, i, i2, (i10 & -8) | 4, bxtf);
                    if (unsafe.getInt(obj4, j3) == i11) {
                        obj3 = unsafe.getObject(obj4, j2);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        unsafe.putObject(obj4, j2, bxwd.m124081a(obj3, bxtf2.f164769c));
                    } else {
                        unsafe.putObject(obj4, j2, bxtf2.f164769c);
                    }
                    unsafe.putInt(obj4, j3, i11);
                    return a6;
                }
                break;
        }
        return i9;
    }

    /* renamed from: b */
    private final int m124191b(int i, int i2) {
        int length = (this.f165019c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int d = m124203d(i4);
            if (i == d) {
                return i4;
            }
            if (i >= d) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private final bxvr m124199c(int i) {
        int i2 = i / 3;
        return (bxvr) this.f165020d[i2 + i2 + 1];
    }

    /* renamed from: d */
    private static int m124204d(Object obj, long j) {
        return ((Integer) bxyx.m124518f(obj, j)).intValue();
    }

    /* renamed from: e */
    private static long m124206e(Object obj, long j) {
        return ((Long) bxyx.m124518f(obj, j)).longValue();
    }

    /* renamed from: f */
    private final int m124208f(Object obj) {
        int i;
        Unsafe unsafe = f165018b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1048575;
        for (int i5 = 0; i5 < this.f165019c.length; i5 += 3) {
            int e = m124205e(i5);
            int d = m124203d(i5);
            int g = m124210g(e);
            if (g <= 17) {
                int i6 = this.f165019c[i5 + 2];
                int i7 = i6 & 1048575;
                i = 1 << (i6 >>> 20);
                if (i7 != i4) {
                    i3 = unsafe.getInt(obj, (long) i7);
                    i4 = i7;
                }
            } else {
                i = 0;
            }
            long i8 = m124214i(e);
            switch (g) {
                case 0:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123666p(d);
                        break;
                    }
                case 1:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123669s(d);
                        break;
                    }
                case 2:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123645d(d, unsafe.getLong(obj, i8));
                        break;
                    }
                case 3:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123647e(d, unsafe.getLong(obj, i8));
                        break;
                    }
                case 4:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123653g(d, unsafe.getInt(obj, i8));
                        break;
                    }
                case 5:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123668r(d);
                        break;
                    }
                case 6:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123667q(d);
                        break;
                    }
                case 7:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123665o(d);
                        break;
                    }
                case 8:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, i8);
                        if (!(object instanceof ByteString)) {
                            i2 += bxuk.m123639b(d, (String) object);
                            break;
                        } else {
                            i2 += bxuk.m123642c(d, (ByteString) object);
                            break;
                        }
                    }
                case 9:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxxw.m124342a(d, unsafe.getObject(obj, i8), m124178a(i5));
                        break;
                    }
                case 10:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123642c(d, (ByteString) unsafe.getObject(obj, i8));
                        break;
                    }
                case 11:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123655h(d, unsafe.getInt(obj, i8));
                        break;
                    }
                case 12:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123660j(d, unsafe.getInt(obj, i8));
                        break;
                    }
                case 13:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123670t(d);
                        break;
                    }
                case 14:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123671u(d);
                        break;
                    }
                case 15:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123658i(d, unsafe.getInt(obj, i8));
                        break;
                    }
                case 16:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123650f(d, unsafe.getLong(obj, i8));
                        break;
                    }
                case 17:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += bxuk.m123638b(d, (bxxc) unsafe.getObject(obj, i8), m124178a(i5));
                        break;
                    }
                case 18:
                    i2 += bxxw.m124372f(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 19:
                    i2 += bxxw.m124369e(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 20:
                    i2 += bxxw.m124378h(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 21:
                    i2 += bxxw.m124389l(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 22:
                    i2 += bxxw.m124375g(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 23:
                    i2 += bxxw.m124372f(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 24:
                    i2 += bxxw.m124369e(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 25:
                    i2 += bxxw.m124362c(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 26:
                    i2 += bxxw.m124343a(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 27:
                    i2 += bxxw.m124344a(d, (List) unsafe.getObject(obj, i8), m124178a(i5));
                    break;
                case 28:
                    i2 += bxxw.m124355b(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 29:
                    i2 += bxxw.m124387k(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 30:
                    i2 += bxxw.m124366d(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 31:
                    i2 += bxxw.m124369e(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 32:
                    i2 += bxxw.m124372f(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 33:
                    i2 += bxxw.m124381i(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 34:
                    i2 += bxxw.m124384j(d, (List) unsafe.getObject(obj, i8));
                    break;
                case 35:
                    int i9 = bxxw.m124382i((List) unsafe.getObject(obj, i8));
                    if (i9 <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(i9) + i9;
                        break;
                    }
                case 36:
                    int h = bxxw.m124379h((List) unsafe.getObject(obj, i8));
                    if (h <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(h) + h;
                        break;
                    }
                case FelicaException.TYPE_NOT_CLOSED:
                    int a = bxxw.m124345a((List) unsafe.getObject(obj, i8));
                    if (a <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(a) + a;
                        break;
                    }
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    int b = bxxw.m124357b((List) unsafe.getObject(obj, i8));
                    if (b <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(b) + b;
                        break;
                    }
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    int e2 = bxxw.m124370e((List) unsafe.getObject(obj, i8));
                    if (e2 <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(e2) + e2;
                        break;
                    }
                case FelicaException.TYPE_PUSH_FAILED:
                    int i10 = bxxw.m124382i((List) unsafe.getObject(obj, i8));
                    if (i10 <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(i10) + i10;
                        break;
                    }
                case 41:
                    int h2 = bxxw.m124379h((List) unsafe.getObject(obj, i8));
                    if (h2 <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(h2) + h2;
                        break;
                    }
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    int j = bxxw.m124385j((List) unsafe.getObject(obj, i8));
                    if (j <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(j) + j;
                        break;
                    }
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    int f = bxxw.m124373f((List) unsafe.getObject(obj, i8));
                    if (f <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(f) + f;
                        break;
                    }
                case FelicaException.TYPE_RESET_FAILED:
                    int d2 = bxxw.m124367d((List) unsafe.getObject(obj, i8));
                    if (d2 <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(d2) + d2;
                        break;
                    }
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    int h3 = bxxw.m124379h((List) unsafe.getObject(obj, i8));
                    if (h3 <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(h3) + h3;
                        break;
                    }
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    int i11 = bxxw.m124382i((List) unsafe.getObject(obj, i8));
                    if (i11 <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(i11) + i11;
                        break;
                    }
                case 47:
                    int g2 = bxxw.m124376g((List) unsafe.getObject(obj, i8));
                    if (g2 <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(g2) + g2;
                        break;
                    }
                case 48:
                    int c = bxxw.m124363c((List) unsafe.getObject(obj, i8));
                    if (c <= 0) {
                        break;
                    } else {
                        i2 += bxuk.m123657i(d) + bxuk.m123661k(c) + c;
                        break;
                    }
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    i2 += bxxw.m124356b(d, (List) unsafe.getObject(obj, i8), m124178a(i5));
                    break;
                case 50:
                    i2 += bxwx.m124140a(d, unsafe.getObject(obj, i8), m124192b(i5));
                    break;
                case 51:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123666p(d);
                        break;
                    }
                case 52:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123669s(d);
                        break;
                    }
                case 53:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123645d(d, m124206e(obj, i8));
                        break;
                    }
                case 54:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123647e(d, m124206e(obj, i8));
                        break;
                    }
                case 55:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123653g(d, m124204d(obj, i8));
                        break;
                    }
                case FelicaException.TYPE_ACTIVATE_FAILED:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123668r(d);
                        break;
                    }
                case 57:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123667q(d);
                        break;
                    }
                case FelicaException.TYPE_OFFLINE_CANCELED:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123665o(d);
                        break;
                    }
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, i8);
                        if (!(object2 instanceof ByteString)) {
                            i2 += bxuk.m123639b(d, (String) object2);
                            break;
                        } else {
                            i2 += bxuk.m123642c(d, (ByteString) object2);
                            break;
                        }
                    }
                case FelicaException.TYPE_MFC_NOT_FOUND:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxxw.m124342a(d, unsafe.getObject(obj, i8), m124178a(i5));
                        break;
                    }
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123642c(d, (ByteString) unsafe.getObject(obj, i8));
                        break;
                    }
                case 62:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123655h(d, m124204d(obj, i8));
                        break;
                    }
                case 63:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123660j(d, m124204d(obj, i8));
                        break;
                    }
                case 64:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123670t(d);
                        break;
                    }
                case KeyInformation.AES128_DES56:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123671u(d);
                        break;
                    }
                case 66:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123658i(d, m124204d(obj, i8));
                        break;
                    }
                case KeyInformation.AES128_DES112:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123650f(d, m124206e(obj, i8));
                        break;
                    }
                case 68:
                    if (!m124187a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += bxuk.m123638b(d, (bxxc) unsafe.getObject(obj, i8), m124178a(i5));
                        break;
                    }
            }
        }
        int h4 = i2 + m124212h(obj);
        if (!this.f165024h) {
            return h4;
        }
        bxux a2 = bxut.m123748a(obj);
        int i12 = 0;
        for (int i13 = 0; i13 < a2.f164882a.mo74265a(); i13++) {
            Map.Entry b2 = a2.f164882a.mo74268b(i13);
            i12 += bxux.m123761b((bxvi) b2.getKey(), b2.getValue());
        }
        for (Map.Entry entry : a2.f164882a.mo74267b()) {
            i12 += bxux.m123761b((bxvi) entry.getKey(), entry.getValue());
        }
        return h4 + i12;
    }

    /* renamed from: g */
    private final int m124211g(Object obj) {
        Unsafe unsafe = f165018b;
        int i = 0;
        for (int i2 = 0; i2 < this.f165019c.length; i2 += 3) {
            int e = m124205e(i2);
            int g = m124210g(e);
            int d = m124203d(i2);
            long i3 = m124214i(e);
            if (g >= bxuy.DOUBLE_LIST_PACKED.f164938Z && g <= bxuy.SINT64_LIST_PACKED.f164938Z) {
                int i4 = this.f165019c[i2 + 2];
            }
            switch (g) {
                case 0:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123666p(d);
                        break;
                    }
                case 1:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123669s(d);
                        break;
                    }
                case 2:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123645d(d, bxyx.m124510b(obj, i3));
                        break;
                    }
                case 3:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123647e(d, bxyx.m124510b(obj, i3));
                        break;
                    }
                case 4:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123653g(d, bxyx.m124494a(obj, i3));
                        break;
                    }
                case 5:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123668r(d);
                        break;
                    }
                case 6:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123667q(d);
                        break;
                    }
                case 7:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123665o(d);
                        break;
                    }
                case 8:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        Object f = bxyx.m124518f(obj, i3);
                        if (!(f instanceof ByteString)) {
                            i += bxuk.m123639b(d, (String) f);
                            break;
                        } else {
                            i += bxuk.m123642c(d, (ByteString) f);
                            break;
                        }
                    }
                case 9:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxxw.m124342a(d, bxyx.m124518f(obj, i3), m124178a(i2));
                        break;
                    }
                case 10:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123642c(d, (ByteString) bxyx.m124518f(obj, i3));
                        break;
                    }
                case 11:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123655h(d, bxyx.m124494a(obj, i3));
                        break;
                    }
                case 12:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123660j(d, bxyx.m124494a(obj, i3));
                        break;
                    }
                case 13:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123670t(d);
                        break;
                    }
                case 14:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123671u(d);
                        break;
                    }
                case 15:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123658i(d, bxyx.m124494a(obj, i3));
                        break;
                    }
                case 16:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123650f(d, bxyx.m124510b(obj, i3));
                        break;
                    }
                case 17:
                    if (!m124186a(obj, i2)) {
                        break;
                    } else {
                        i += bxuk.m123638b(d, (bxxc) bxyx.m124518f(obj, i3), m124178a(i2));
                        break;
                    }
                case 18:
                    i += bxxw.m124372f(d, m124181a(obj, i3));
                    break;
                case 19:
                    i += bxxw.m124369e(d, m124181a(obj, i3));
                    break;
                case 20:
                    i += bxxw.m124378h(d, m124181a(obj, i3));
                    break;
                case 21:
                    i += bxxw.m124389l(d, m124181a(obj, i3));
                    break;
                case 22:
                    i += bxxw.m124375g(d, m124181a(obj, i3));
                    break;
                case 23:
                    i += bxxw.m124372f(d, m124181a(obj, i3));
                    break;
                case 24:
                    i += bxxw.m124369e(d, m124181a(obj, i3));
                    break;
                case 25:
                    i += bxxw.m124362c(d, m124181a(obj, i3));
                    break;
                case 26:
                    i += bxxw.m124343a(d, m124181a(obj, i3));
                    break;
                case 27:
                    i += bxxw.m124344a(d, m124181a(obj, i3), m124178a(i2));
                    break;
                case 28:
                    i += bxxw.m124355b(d, m124181a(obj, i3));
                    break;
                case 29:
                    i += bxxw.m124387k(d, m124181a(obj, i3));
                    break;
                case 30:
                    i += bxxw.m124366d(d, m124181a(obj, i3));
                    break;
                case 31:
                    i += bxxw.m124369e(d, m124181a(obj, i3));
                    break;
                case 32:
                    i += bxxw.m124372f(d, m124181a(obj, i3));
                    break;
                case 33:
                    i += bxxw.m124381i(d, m124181a(obj, i3));
                    break;
                case 34:
                    i += bxxw.m124384j(d, m124181a(obj, i3));
                    break;
                case 35:
                    int i5 = bxxw.m124382i((List) unsafe.getObject(obj, i3));
                    if (i5 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(i5) + i5;
                        break;
                    }
                case 36:
                    int h = bxxw.m124379h((List) unsafe.getObject(obj, i3));
                    if (h <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(h) + h;
                        break;
                    }
                case FelicaException.TYPE_NOT_CLOSED:
                    int a = bxxw.m124345a((List) unsafe.getObject(obj, i3));
                    if (a <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(a) + a;
                        break;
                    }
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    int b = bxxw.m124357b((List) unsafe.getObject(obj, i3));
                    if (b <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(b) + b;
                        break;
                    }
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    int e2 = bxxw.m124370e((List) unsafe.getObject(obj, i3));
                    if (e2 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(e2) + e2;
                        break;
                    }
                case FelicaException.TYPE_PUSH_FAILED:
                    int i6 = bxxw.m124382i((List) unsafe.getObject(obj, i3));
                    if (i6 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(i6) + i6;
                        break;
                    }
                case 41:
                    int h2 = bxxw.m124379h((List) unsafe.getObject(obj, i3));
                    if (h2 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(h2) + h2;
                        break;
                    }
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    int j = bxxw.m124385j((List) unsafe.getObject(obj, i3));
                    if (j <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(j) + j;
                        break;
                    }
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    int f2 = bxxw.m124373f((List) unsafe.getObject(obj, i3));
                    if (f2 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(f2) + f2;
                        break;
                    }
                case FelicaException.TYPE_RESET_FAILED:
                    int d2 = bxxw.m124367d((List) unsafe.getObject(obj, i3));
                    if (d2 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(d2) + d2;
                        break;
                    }
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    int h3 = bxxw.m124379h((List) unsafe.getObject(obj, i3));
                    if (h3 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(h3) + h3;
                        break;
                    }
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    int i7 = bxxw.m124382i((List) unsafe.getObject(obj, i3));
                    if (i7 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(i7) + i7;
                        break;
                    }
                case 47:
                    int g2 = bxxw.m124376g((List) unsafe.getObject(obj, i3));
                    if (g2 <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(g2) + g2;
                        break;
                    }
                case 48:
                    int c = bxxw.m124363c((List) unsafe.getObject(obj, i3));
                    if (c <= 0) {
                        break;
                    } else {
                        i += bxuk.m123657i(d) + bxuk.m123661k(c) + c;
                        break;
                    }
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    i += bxxw.m124356b(d, m124181a(obj, i3), m124178a(i2));
                    break;
                case 50:
                    i += bxwx.m124140a(d, bxyx.m124518f(obj, i3), m124192b(i2));
                    break;
                case 51:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123666p(d);
                        break;
                    }
                case 52:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123669s(d);
                        break;
                    }
                case 53:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123645d(d, m124206e(obj, i3));
                        break;
                    }
                case 54:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123647e(d, m124206e(obj, i3));
                        break;
                    }
                case 55:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123653g(d, m124204d(obj, i3));
                        break;
                    }
                case FelicaException.TYPE_ACTIVATE_FAILED:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123668r(d);
                        break;
                    }
                case 57:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123667q(d);
                        break;
                    }
                case FelicaException.TYPE_OFFLINE_CANCELED:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123665o(d);
                        break;
                    }
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        Object f3 = bxyx.m124518f(obj, i3);
                        if (!(f3 instanceof ByteString)) {
                            i += bxuk.m123639b(d, (String) f3);
                            break;
                        } else {
                            i += bxuk.m123642c(d, (ByteString) f3);
                            break;
                        }
                    }
                case FelicaException.TYPE_MFC_NOT_FOUND:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxxw.m124342a(d, bxyx.m124518f(obj, i3), m124178a(i2));
                        break;
                    }
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123642c(d, (ByteString) bxyx.m124518f(obj, i3));
                        break;
                    }
                case 62:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123655h(d, m124204d(obj, i3));
                        break;
                    }
                case 63:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123660j(d, m124204d(obj, i3));
                        break;
                    }
                case 64:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123670t(d);
                        break;
                    }
                case KeyInformation.AES128_DES56:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123671u(d);
                        break;
                    }
                case 66:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123658i(d, m124204d(obj, i3));
                        break;
                    }
                case KeyInformation.AES128_DES112:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123650f(d, m124206e(obj, i3));
                        break;
                    }
                case 68:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i += bxuk.m123638b(d, (bxxc) bxyx.m124518f(obj, i3), m124178a(i2));
                        break;
                    }
            }
        }
        return i + m124212h(obj);
    }

    /* renamed from: h */
    private static final int m124212h(Object obj) {
        return bxyn.m124416a(obj).mo74286c();
    }

    /* renamed from: b */
    private final Object m124192b(int i) {
        int i2 = i / 3;
        return this.f165020d[i2 + i2];
    }

    /* renamed from: c */
    static bxyo m124200c(Object obj) {
        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) obj;
        bxyo bxyo = GeneratedMessageLite.f164960ah;
        if (bxyo != bxyo.f165102a) {
            return bxyo;
        }
        bxyo a = bxyo.m124424a();
        GeneratedMessageLite.f164960ah = a;
        return a;
    }

    /* renamed from: d */
    public final void mo74225d(Object obj) {
        int i;
        int i2 = this.f165028l;
        while (true) {
            i = this.f165029m;
            if (i2 >= i) {
                break;
            }
            long i3 = m124214i(m124205e(this.f165027k[i2]));
            Object f = bxyx.m124518f(obj, i3);
            if (f != null) {
                ((bxww) f).mo74204b();
                bxyx.m124506a(obj, i3, f);
            }
            i2++;
        }
        int length = this.f165027k.length;
        while (i < length) {
            this.f165030n.mo74197b(obj, (long) this.f165027k[i]);
            i++;
        }
        bxyn.m124422c(obj);
        if (this.f165024h) {
            bxut.m123752c(obj);
        }
    }

    /* renamed from: e */
    public final boolean mo74226e(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f165028l) {
            int i6 = this.f165027k[i5];
            int d = m124203d(i6);
            int e = m124205e(i6);
            int i7 = this.f165019c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i3) {
                i2 = i3;
                i = i4;
            } else {
                if (i8 != 1048575) {
                    i4 = f165018b.getInt(obj2, (long) i8);
                }
                i = i4;
                i2 = i8;
            }
            if ((268435456 & e) != 0 && !m124188a(obj, i6, i2, i, i9)) {
                return false;
            }
            int g = m124210g(e);
            if (g != 9 && g != 17) {
                if (g != 27) {
                    if (g == 60 || g == 68) {
                        if (m124187a(obj2, d, i6) && !m124189a(obj2, e, m124178a(i6))) {
                            return false;
                        }
                    } else if (g != 49) {
                        if (g != 50) {
                            continue;
                        } else {
                            bxww bxww = (bxww) bxyx.m124518f(obj2, m124214i(e));
                            if (!bxww.isEmpty() && bxwx.m124141a(m124192b(i6)).f165010c.f165148s == bxzg.MESSAGE) {
                                bxxv bxxv = null;
                                for (Object obj3 : bxww.values()) {
                                    if (bxxv == null) {
                                        bxxv = bxxm.f165037a.mo74227a((Class) obj3.getClass());
                                    }
                                    if (!bxxv.mo74226e(obj3)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
                List list = (List) bxyx.m124518f(obj2, m124214i(e));
                if (!list.isEmpty()) {
                    bxxv a = m124178a(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!a.mo74226e(list.get(i10))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m124188a(obj, i6, i2, i, i9) && !m124189a(obj2, e, m124178a(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        return !this.f165024h || bxut.m123748a(obj).mo73918e();
    }

    /* renamed from: b */
    private final void m124193b(Object obj, int i) {
        int f = m124207f(i);
        long j = (long) (1048575 & f);
        if (j != 1048575) {
            bxyx.m124504a(obj, j, (1 << (f >>> 20)) | bxyx.m124494a(obj, j));
        }
    }

    /* renamed from: c */
    private static final void m124201c(Object obj, bxul bxul) {
        bxyn.m124416a(obj).mo74284a(bxul);
    }

    /* renamed from: b */
    private final void m124194b(Object obj, int i, int i2) {
        bxyx.m124504a(obj, (long) (m124207f(i2) & 1048575), i);
    }

    /* renamed from: c */
    private final boolean m124202c(Object obj, Object obj2, int i) {
        return m124186a(obj, i) == m124186a(obj2, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxxw.b(int, java.util.List, bxul, boolean):void
     arg types: [int, java.util.List, bxul, int]
     candidates:
      bxxw.b(int, java.util.List, bxul, bxxv):void
      bxxw.b(int, java.util.List, bxul, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxxw.a(int, java.util.List, bxul, boolean):void
     arg types: [int, java.util.List, bxul, int]
     candidates:
      bxxw.a(int, java.util.List, bxvr, java.lang.Object):java.lang.Object
      bxxw.a(int, java.util.List, bxul, bxxv):void
      bxxw.a(int, java.util.List, bxul, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: b */
    private final void m124195b(Object obj, bxul bxul) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i;
        int i2;
        Object obj2 = obj;
        bxul bxul2 = bxul;
        if (this.f165024h) {
            bxux a = bxut.m123748a(obj);
            if (!a.mo73910a()) {
                it = a.mo73917d();
                entry = (Map.Entry) it.next();
                length = this.f165019c.length;
                Unsafe unsafe = f165018b;
                int i3 = 1048575;
                i = 0;
                int i4 = 1048575;
                int i5 = 0;
                while (i < length) {
                    int e = m124205e(i);
                    int d = m124203d(i);
                    int g = m124210g(e);
                    if (this.f165026j) {
                        i2 = 0;
                    } else if (g <= 17) {
                        int i6 = this.f165019c[i + 2];
                        int i7 = i6 & i3;
                        if (i7 != i4) {
                            i5 = unsafe.getInt(obj2, (long) i7);
                            i4 = i7;
                        }
                        i2 = 1 << (i6 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && bxut.m123747a(entry) <= d) {
                        bxut.m123749a(bxul2, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long i8 = m124214i(e);
                    switch (g) {
                        case 0:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73874a(d, bxyx.m124517e(obj2, i8));
                                break;
                            }
                        case 1:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73875a(d, bxyx.m124515d(obj2, i8));
                                break;
                            }
                        case 2:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73877a(d, unsafe.getLong(obj2, i8));
                                break;
                            }
                        case 3:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73887c(d, unsafe.getLong(obj2, i8));
                                break;
                            }
                        case 4:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73886c(d, unsafe.getInt(obj2, i8));
                                break;
                            }
                        case 5:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73889d(d, unsafe.getLong(obj2, i8));
                                break;
                            }
                        case 6:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73888d(d, unsafe.getInt(obj2, i8));
                                break;
                            }
                        case 7:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73882a(d, bxyx.m124514c(obj2, i8));
                                break;
                            }
                        case 8:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                m124182a(d, unsafe.getObject(obj2, i8), bxul2);
                                break;
                            }
                        case 9:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73880a(d, unsafe.getObject(obj2, i8), m124178a(i));
                                break;
                            }
                        case 10:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73878a(d, (ByteString) unsafe.getObject(obj2, i8));
                                break;
                            }
                        case 11:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73890e(d, unsafe.getInt(obj2, i8));
                                break;
                            }
                        case 12:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73883b(d, unsafe.getInt(obj2, i8));
                                break;
                            }
                        case 13:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73876a(d, unsafe.getInt(obj2, i8));
                                break;
                            }
                        case 14:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73884b(d, unsafe.getLong(obj2, i8));
                                break;
                            }
                        case 15:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73892f(d, unsafe.getInt(obj2, i8));
                                break;
                            }
                        case 16:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73891e(d, unsafe.getLong(obj2, i8));
                                break;
                            }
                        case 17:
                            if ((i2 & i5) == 0) {
                                break;
                            } else {
                                bxul2.mo73885b(d, unsafe.getObject(obj2, i8), m124178a(i));
                                break;
                            }
                        case 18:
                            bxxw.m124351a(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 19:
                            bxxw.m124360b(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 20:
                            bxxw.m124364c(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 21:
                            bxxw.m124368d(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 22:
                            bxxw.m124380h(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 23:
                            bxxw.m124374f(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 24:
                            bxxw.m124388k(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 25:
                            bxxw.m124392n(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 26:
                            bxxw.m124349a(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2);
                            break;
                        case 27:
                            bxxw.m124350a(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, m124178a(i));
                            break;
                        case 28:
                            bxxw.m124358b(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2);
                            break;
                        case 29:
                            bxxw.m124383i(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 30:
                            bxxw.m124391m(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 31:
                            bxxw.m124390l(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 32:
                            bxxw.m124377g(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 33:
                            bxxw.m124386j(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 34:
                            bxxw.m124371e(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, false);
                            break;
                        case 35:
                            bxxw.m124351a(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case 36:
                            bxxw.m124360b(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_NOT_CLOSED:
                            bxxw.m124364c(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                            bxxw.m124368d(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_USED_BY_OTHER_APP:
                            bxxw.m124380h(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_PUSH_FAILED:
                            bxxw.m124374f(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case 41:
                            bxxw.m124388k(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_ALREADY_ACTIVATED:
                            bxxw.m124392n(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                            bxxw.m124383i(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_RESET_FAILED:
                            bxxw.m124391m(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                            bxxw.m124390l(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                            bxxw.m124377g(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case 47:
                            bxxw.m124386j(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case 48:
                            bxxw.m124371e(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, true);
                            break;
                        case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                            bxxw.m124359b(m124203d(i), (List) unsafe.getObject(obj2, i8), bxul2, m124178a(i));
                            break;
                        case 50:
                            m124183a(bxul2, d, unsafe.getObject(obj2, i8), i);
                            break;
                        case 51:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73874a(d, m124190b(obj2, i8));
                                break;
                            }
                        case 52:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73875a(d, m124198c(obj2, i8));
                                break;
                            }
                        case 53:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73877a(d, m124206e(obj2, i8));
                                break;
                            }
                        case 54:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73887c(d, m124206e(obj2, i8));
                                break;
                            }
                        case 55:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73886c(d, m124204d(obj2, i8));
                                break;
                            }
                        case FelicaException.TYPE_ACTIVATE_FAILED:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73889d(d, m124206e(obj2, i8));
                                break;
                            }
                        case 57:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73888d(d, m124204d(obj2, i8));
                                break;
                            }
                        case FelicaException.TYPE_OFFLINE_CANCELED:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73882a(d, m124209f(obj2, i8));
                                break;
                            }
                        case FelicaException.TYPE_NOW_EXECUTING_FALP:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                m124182a(d, unsafe.getObject(obj2, i8), bxul2);
                                break;
                            }
                        case FelicaException.TYPE_MFC_NOT_FOUND:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73880a(d, unsafe.getObject(obj2, i8), m124178a(i));
                                break;
                            }
                        case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73878a(d, (ByteString) unsafe.getObject(obj2, i8));
                                break;
                            }
                        case 62:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73890e(d, m124204d(obj2, i8));
                                break;
                            }
                        case 63:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73883b(d, m124204d(obj2, i8));
                                break;
                            }
                        case 64:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73876a(d, m124204d(obj2, i8));
                                break;
                            }
                        case KeyInformation.AES128_DES56:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73884b(d, m124206e(obj2, i8));
                                break;
                            }
                        case 66:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73892f(d, m124204d(obj2, i8));
                                break;
                            }
                        case KeyInformation.AES128_DES112:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73891e(d, m124206e(obj2, i8));
                                break;
                            }
                        case 68:
                            if (!m124187a(obj2, d, i)) {
                                break;
                            } else {
                                bxul2.mo73885b(d, unsafe.getObject(obj2, i8), m124178a(i));
                                break;
                            }
                    }
                    i += 3;
                    i3 = 1048575;
                }
                while (entry != null) {
                    bxut.m123749a(bxul2, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                m124201c(obj, bxul);
            }
        }
        it = null;
        entry = null;
        length = this.f165019c.length;
        Unsafe unsafe2 = f165018b;
        int i32 = 1048575;
        i = 0;
        int i42 = 1048575;
        int i52 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        m124201c(obj, bxul);
    }

    /* renamed from: a */
    private final int m124173a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, bxtf bxtf) {
        boolean z;
        int i8;
        int i9;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i10 = i;
        int i11 = i2;
        int i12 = i3;
        int i13 = i5;
        int i14 = i6;
        long j3 = j2;
        bxtf bxtf2 = bxtf;
        bxwc bxwc = (bxwc) f165018b.getObject(obj2, j3);
        if (!bxwc.mo73666a()) {
            int size = bxwc.size();
            bxwc = bxwc.mo73731c(size != 0 ? size + size : 10);
            f165018b.putObject(obj2, j3, bxwc);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i13 == 2) {
                    bxum bxum = (bxum) bxwc;
                    int a = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i15 = bxtf2.f164767a + a;
                    while (a < i15) {
                        bxum.mo73894a(bxtg.m123145c(bArr2, a));
                        a += 8;
                    }
                    if (a == i15) {
                        return a;
                    }
                    throw bxwf.m124088a();
                } else if (i13 == 1) {
                    bxum bxum2 = (bxum) bxwc;
                    bxum2.mo73894a(bxtg.m123145c(bArr, i));
                    int i16 = i10 + 8;
                    while (i16 < i11) {
                        int a2 = bxtg.m123141a(bArr2, i16, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return i16;
                        }
                        bxum2.mo73894a(bxtg.m123145c(bArr2, a2));
                        i16 = a2 + 8;
                    }
                    return i16;
                }
                break;
            case 19:
            case 36:
                if (i13 == 2) {
                    bxuz bxuz = (bxuz) bxwc;
                    int a3 = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i17 = bxtf2.f164767a + a3;
                    while (a3 < i17) {
                        bxuz.mo73922a(bxtg.m123147d(bArr2, a3));
                        a3 += 4;
                    }
                    if (a3 == i17) {
                        return a3;
                    }
                    throw bxwf.m124088a();
                } else if (i13 == 5) {
                    bxuz bxuz2 = (bxuz) bxwc;
                    bxuz2.mo73922a(bxtg.m123147d(bArr, i));
                    int i18 = i10 + 4;
                    while (i18 < i11) {
                        int a4 = bxtg.m123141a(bArr2, i18, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return i18;
                        }
                        bxuz2.mo73922a(bxtg.m123147d(bArr2, a4));
                        i18 = a4 + 4;
                    }
                    return i18;
                }
                break;
            case 20:
            case 21:
            case FelicaException.TYPE_NOT_CLOSED:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                if (i13 == 2) {
                    bxwq bxwq = (bxwq) bxwc;
                    int a5 = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i19 = bxtf2.f164767a + a5;
                    while (a5 < i19) {
                        a5 = bxtg.m123143b(bArr2, a5, bxtf2);
                        bxwq.mo74161a(bxtf2.f164768b);
                    }
                    if (a5 == i19) {
                        return a5;
                    }
                    throw bxwf.m124088a();
                } else if (i13 == 0) {
                    bxwq bxwq2 = (bxwq) bxwc;
                    int b = bxtg.m123143b(bArr2, i10, bxtf2);
                    bxwq2.mo74161a(bxtf2.f164768b);
                    while (b < i11) {
                        int a6 = bxtg.m123141a(bArr2, b, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return b;
                        }
                        b = bxtg.m123143b(bArr2, a6, bxtf2);
                        bxwq2.mo74161a(bxtf2.f164768b);
                    }
                    return b;
                }
                break;
            case 22:
            case 29:
            case FelicaException.TYPE_USED_BY_OTHER_APP:
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                if (i13 == 2) {
                    return bxtg.m123142a(bArr2, i10, bxwc, bxtf2);
                }
                if (i13 == 0) {
                    return bxtg.m123134a(i3, bArr, i, i2, bxwc, bxtf);
                }
                break;
            case 23:
            case 32:
            case FelicaException.TYPE_PUSH_FAILED:
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                if (i13 == 2) {
                    bxwq bxwq3 = (bxwq) bxwc;
                    int a7 = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i20 = bxtf2.f164767a + a7;
                    while (a7 < i20) {
                        bxwq3.mo74161a(bxtg.m123144b(bArr2, a7));
                        a7 += 8;
                    }
                    if (a7 == i20) {
                        return a7;
                    }
                    throw bxwf.m124088a();
                } else if (i13 == 1) {
                    bxwq bxwq4 = (bxwq) bxwc;
                    bxwq4.mo74161a(bxtg.m123144b(bArr, i));
                    int i21 = i10 + 8;
                    while (i21 < i11) {
                        int a8 = bxtg.m123141a(bArr2, i21, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return i21;
                        }
                        bxwq4.mo74161a(bxtg.m123144b(bArr2, a8));
                        i21 = a8 + 8;
                    }
                    return i21;
                }
                break;
            case 24:
            case 31:
            case 41:
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                if (i13 == 2) {
                    bxvm bxvm = (bxvm) bxwc;
                    int a9 = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i22 = bxtf2.f164767a + a9;
                    while (a9 < i22) {
                        bxvm.mo74153d(bxtg.m123140a(bArr2, a9));
                        a9 += 4;
                    }
                    if (a9 == i22) {
                        return a9;
                    }
                    throw bxwf.m124088a();
                } else if (i13 == 5) {
                    bxvm bxvm2 = (bxvm) bxwc;
                    bxvm2.mo74153d(bxtg.m123140a(bArr, i));
                    int i23 = i10 + 4;
                    while (i23 < i11) {
                        int a10 = bxtg.m123141a(bArr2, i23, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return i23;
                        }
                        bxvm2.mo74153d(bxtg.m123140a(bArr2, a10));
                        i23 = a10 + 4;
                    }
                    return i23;
                }
                break;
            case 25:
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                if (i13 == 2) {
                    bxtk bxtk = (bxtk) bxwc;
                    int a11 = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i24 = bxtf2.f164767a + a11;
                    while (a11 < i24) {
                        a11 = bxtg.m123143b(bArr2, a11, bxtf2);
                        bxtk.mo73729a(bxtf2.f164768b != 0);
                    }
                    if (a11 == i24) {
                        return a11;
                    }
                    throw bxwf.m124088a();
                } else if (i13 == 0) {
                    bxtk bxtk2 = (bxtk) bxwc;
                    int b2 = bxtg.m123143b(bArr2, i10, bxtf2);
                    if (bxtf2.f164768b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bxtk2.mo73729a(z);
                    while (b2 < i11) {
                        int a12 = bxtg.m123141a(bArr2, b2, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return b2;
                        }
                        b2 = bxtg.m123143b(bArr2, a12, bxtf2);
                        bxtk2.mo73729a(bxtf2.f164768b != 0);
                    }
                    return b2;
                }
                break;
            case 26:
                if (i13 == 2) {
                    if ((j & 536870912) != 0) {
                        int a13 = bxtg.m123141a(bArr2, i10, bxtf2);
                        int i25 = bxtf2.f164767a;
                        if (i25 >= 0) {
                            if (i25 == 0) {
                                bxwc.add("");
                            } else {
                                int i26 = a13 + i25;
                                if (bxzd.m124557a(bArr2, a13, i26)) {
                                    bxwc.add(new String(bArr2, a13, i25, bxwd.f164980a));
                                    a13 = i26;
                                } else {
                                    throw bxwf.m124096i();
                                }
                            }
                            while (i10 < i11) {
                                int a14 = bxtg.m123141a(bArr2, i10, bxtf2);
                                if (i12 != bxtf2.f164767a) {
                                    break;
                                } else {
                                    i10 = bxtg.m123141a(bArr2, a14, bxtf2);
                                    int i27 = bxtf2.f164767a;
                                    if (i27 < 0) {
                                        throw bxwf.m124089b();
                                    } else if (i27 == 0) {
                                        bxwc.add("");
                                    } else {
                                        int i28 = i10 + i27;
                                        if (bxzd.m124557a(bArr2, i10, i28)) {
                                            bxwc.add(new String(bArr2, i10, i27, bxwd.f164980a));
                                            i10 = i28;
                                        } else {
                                            throw bxwf.m124096i();
                                        }
                                    }
                                }
                            }
                            break;
                        } else {
                            throw bxwf.m124089b();
                        }
                    } else {
                        int a15 = bxtg.m123141a(bArr2, i10, bxtf2);
                        int i29 = bxtf2.f164767a;
                        if (i29 >= 0) {
                            if (i29 != 0) {
                                bxwc.add(new String(bArr2, a15, i29, bxwd.f164980a));
                                a15 += i29;
                            } else {
                                bxwc.add("");
                            }
                            while (i10 < i11) {
                                int a16 = bxtg.m123141a(bArr2, i10, bxtf2);
                                if (i12 != bxtf2.f164767a) {
                                    break;
                                } else {
                                    int i30 = bxtg.m123141a(bArr2, a16, bxtf2);
                                    int i31 = bxtf2.f164767a;
                                    if (i31 < 0) {
                                        throw bxwf.m124089b();
                                    } else if (i31 != 0) {
                                        bxwc.add(new String(bArr2, i30, i31, bxwd.f164980a));
                                        i30 += i31;
                                    } else {
                                        bxwc.add("");
                                    }
                                }
                            }
                            break;
                        } else {
                            throw bxwf.m124089b();
                        }
                    }
                }
                break;
            case 27:
                if (i13 == 2) {
                    return bxtg.m123137a(m124178a(i14), i3, bArr, i, i2, bxwc, bxtf);
                }
                break;
            case 28:
                if (i13 == 2) {
                    int a17 = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i32 = bxtf2.f164767a;
                    if (i32 < 0) {
                        throw bxwf.m124089b();
                    } else if (i32 <= bArr2.length - a17) {
                        if (i32 != 0) {
                            bxwc.add(ByteString.m123262a(bArr2, a17, i32));
                            a17 += i32;
                        } else {
                            bxwc.add(ByteString.f164797b);
                        }
                        while (i8 < i11) {
                            int a18 = bxtg.m123141a(bArr2, i8, bxtf2);
                            if (i12 != bxtf2.f164767a) {
                                return i8;
                            }
                            i8 = bxtg.m123141a(bArr2, a18, bxtf2);
                            int i33 = bxtf2.f164767a;
                            if (i33 < 0) {
                                throw bxwf.m124089b();
                            } else if (i33 > bArr2.length - i8) {
                                throw bxwf.m124088a();
                            } else if (i33 != 0) {
                                bxwc.add(ByteString.m123262a(bArr2, i8, i33));
                                i8 += i33;
                            } else {
                                bxwc.add(ByteString.f164797b);
                            }
                        }
                        return i8;
                    } else {
                        throw bxwf.m124088a();
                    }
                }
                break;
            case 30:
            case FelicaException.TYPE_RESET_FAILED:
                if (i13 == 2) {
                    i9 = bxtg.m123142a(bArr2, i10, bxwc, bxtf2);
                } else if (i13 == 0) {
                    i9 = bxtg.m123134a(i3, bArr, i, i2, bxwc, bxtf);
                }
                GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) obj2;
                bxyo bxyo = GeneratedMessageLite.f164960ah;
                if (bxyo == bxyo.f165102a) {
                    bxyo = null;
                }
                bxyo bxyo2 = (bxyo) bxxw.m124348a(i4, bxwc, m124199c(i14), bxyo);
                if (bxyo2 == null) {
                    return i9;
                }
                GeneratedMessageLite.f164960ah = bxyo2;
                return i9;
            case 33:
            case 47:
                if (i13 == 2) {
                    bxvm bxvm3 = (bxvm) bxwc;
                    int a19 = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i34 = bxtf2.f164767a + a19;
                    while (a19 < i34) {
                        a19 = bxtg.m123141a(bArr2, a19, bxtf2);
                        bxvm3.mo74153d(bxuc.m123422g(bxtf2.f164767a));
                    }
                    if (a19 == i34) {
                        return a19;
                    }
                    throw bxwf.m124088a();
                } else if (i13 == 0) {
                    bxvm bxvm4 = (bxvm) bxwc;
                    int a20 = bxtg.m123141a(bArr2, i10, bxtf2);
                    bxvm4.mo74153d(bxuc.m123422g(bxtf2.f164767a));
                    while (a20 < i11) {
                        int a21 = bxtg.m123141a(bArr2, a20, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return a20;
                        }
                        a20 = bxtg.m123141a(bArr2, a21, bxtf2);
                        bxvm4.mo74153d(bxuc.m123422g(bxtf2.f164767a));
                    }
                    return a20;
                }
                break;
            case 34:
            case 48:
                if (i13 == 2) {
                    bxwq bxwq5 = (bxwq) bxwc;
                    int a22 = bxtg.m123141a(bArr2, i10, bxtf2);
                    int i35 = bxtf2.f164767a + a22;
                    while (a22 < i35) {
                        a22 = bxtg.m123143b(bArr2, a22, bxtf2);
                        bxwq5.mo74161a(bxuc.m123415a(bxtf2.f164768b));
                    }
                    if (a22 == i35) {
                        return a22;
                    }
                    throw bxwf.m124088a();
                } else if (i13 == 0) {
                    bxwq bxwq6 = (bxwq) bxwc;
                    int b3 = bxtg.m123143b(bArr2, i10, bxtf2);
                    bxwq6.mo74161a(bxuc.m123415a(bxtf2.f164768b));
                    while (b3 < i11) {
                        int a23 = bxtg.m123141a(bArr2, b3, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return b3;
                        }
                        b3 = bxtg.m123143b(bArr2, a23, bxtf2);
                        bxwq6.mo74161a(bxuc.m123415a(bxtf2.f164768b));
                    }
                    return b3;
                }
                break;
            default:
                if (i13 == 3) {
                    bxxv a24 = m124178a(i14);
                    int i36 = (i12 & -8) | 4;
                    int a25 = bxtg.m123138a(a24, bArr, i, i2, i36, bxtf);
                    bxwc.add(bxtf2.f164769c);
                    while (a25 < i11) {
                        int a26 = bxtg.m123141a(bArr2, a25, bxtf2);
                        if (i12 != bxtf2.f164767a) {
                            return a25;
                        }
                        a25 = bxtg.m123138a(a24, bArr, a26, i2, i36, bxtf);
                        bxwc.add(bxtf2.f164769c);
                    }
                    return a25;
                }
                break;
        }
        return i10;
    }

    /* renamed from: b */
    private final void m124196b(Object obj, Object obj2, int i) {
        int e = m124205e(i);
        int d = m124203d(i);
        long i2 = m124214i(e);
        if (m124187a(obj2, d, i)) {
            Object f = bxyx.m124518f(obj, i2);
            Object f2 = bxyx.m124518f(obj2, i2);
            if (f != null && f2 != null) {
                bxyx.m124506a(obj, i2, bxwd.m124081a(f, f2));
                m124194b(obj, d, i);
            } else if (f2 != null) {
                bxyx.m124506a(obj, i2, f2);
                m124194b(obj, d, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [int], assign insn: 0x0023: IGET  (r3v18 ? I:int) = (r11v1 bxtf) bxtf.a int */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    private final void m124197b(Object obj, byte[] bArr, int i, int i2, bxtf bxtf) {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        bxxf bxxf;
        Unsafe unsafe;
        Object obj2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe2;
        int i15;
        bxxf bxxf2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i16 = i2;
        bxtf bxtf2 = bxtf;
        Unsafe unsafe3 = f165018b;
        int i17 = -1;
        int i18 = i;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1048575;
        while (i18 < i16) {
            int i23 = i18 + 1;
            byte b2 = bArr2[i18];
            if (b2 < 0) {
                i3 = bxtg.m123136a(b2, bArr2, i23, bxtf2);
                b = bxtf2.f164767a;
            } else {
                b = b2;
                i3 = i23;
            }
            int i24 = b >>> 3;
            byte b3 = b & 7;
            if (i24 > i19) {
                i4 = bxxf2.m124171a(i24, i20 / 3);
            } else {
                i4 = bxxf2.m124215j(i24);
            }
            if (i4 != i17) {
                int i25 = bxxf2.f165019c[i4 + 1];
                int g = m124210g(i25);
                Unsafe unsafe4 = unsafe3;
                long i26 = m124214i(i25);
                int i27 = i24;
                if (g <= 17) {
                    int i28 = bxxf2.f165019c[i4 + 2];
                    boolean z = true;
                    int i29 = 1 << (i28 >>> 20);
                    int i30 = i28 & 1048575;
                    if (i30 == i22) {
                        i13 = i25;
                        i14 = i4;
                        i30 = i22;
                        unsafe2 = unsafe4;
                    } else {
                        if (i22 != 1048575) {
                            i13 = i25;
                            i14 = i4;
                            long j = (long) i22;
                            unsafe2 = unsafe4;
                            unsafe2.putInt(obj3, j, i21);
                        } else {
                            i13 = i25;
                            i14 = i4;
                            unsafe2 = unsafe4;
                        }
                        if (i30 != 1048575) {
                            i21 = unsafe2.getInt(obj3, (long) i30);
                        }
                    }
                    switch (g) {
                        case 0:
                            i15 = i14;
                            i7 = i27;
                            if (b3 == 1) {
                                bxyx.m124502a(obj3, i26, bxtg.m123145c(bArr2, i3));
                                i18 = i3 + 8;
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i15;
                                i19 = i7;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                            i8 = i3;
                            unsafe = unsafe2;
                            i5 = i30;
                            i6 = i15;
                            obj2 = obj3;
                            bxxf = bxxf2;
                            break;
                        case 1:
                            i15 = i14;
                            i7 = i27;
                            if (b3 == 5) {
                                bxyx.m124503a(obj3, i26, bxtg.m123147d(bArr2, i3));
                                i18 = i3 + 4;
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i15;
                                i19 = i7;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                            i8 = i3;
                            unsafe = unsafe2;
                            i5 = i30;
                            i6 = i15;
                            obj2 = obj3;
                            bxxf = bxxf2;
                            break;
                        case 2:
                        case 3:
                            i15 = i14;
                            i7 = i27;
                            if (b3 == 0) {
                                int b4 = bxtg.m123143b(bArr2, i3, bxtf2);
                                unsafe2.putLong(obj, i26, bxtf2.f164768b);
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i15;
                                i18 = b4;
                                i19 = i7;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                            i8 = i3;
                            unsafe = unsafe2;
                            i5 = i30;
                            i6 = i15;
                            obj2 = obj3;
                            bxxf = bxxf2;
                            break;
                        case 4:
                        case 11:
                            i15 = i14;
                            i7 = i27;
                            if (b3 == 0) {
                                i18 = bxtg.m123141a(bArr2, i3, bxtf2);
                                unsafe2.putInt(obj3, i26, bxtf2.f164767a);
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i15;
                                i19 = i7;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                            i8 = i3;
                            unsafe = unsafe2;
                            i5 = i30;
                            i6 = i15;
                            obj2 = obj3;
                            bxxf = bxxf2;
                            break;
                        case 5:
                        case 14:
                            i15 = i14;
                            i7 = i27;
                            if (b3 != 1) {
                                i8 = i3;
                                unsafe = unsafe2;
                                i5 = i30;
                                i6 = i15;
                                obj2 = obj3;
                                bxxf = bxxf2;
                                break;
                            } else {
                                unsafe2.putLong(obj, i26, bxtg.m123144b(bArr2, i3));
                                i18 = i3 + 8;
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i15;
                                i19 = i7;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 6:
                        case 13:
                            int i31 = i2;
                            i15 = i14;
                            i7 = i27;
                            if (b3 == 5) {
                                unsafe2.putInt(obj3, i26, bxtg.m123140a(bArr2, i3));
                                i18 = i3 + 4;
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i19 = i7;
                                i17 = -1;
                                i16 = i31;
                                i20 = i15;
                                break;
                            }
                            i8 = i3;
                            unsafe = unsafe2;
                            i5 = i30;
                            i6 = i15;
                            obj2 = obj3;
                            bxxf = bxxf2;
                            break;
                        case 7:
                            int i32 = i2;
                            i15 = i14;
                            i7 = i27;
                            if (b3 == 0) {
                                i18 = bxtg.m123143b(bArr2, i3, bxtf2);
                                if (bxtf2.f164768b == 0) {
                                    z = false;
                                }
                                bxyx.m124507a(obj3, i26, z);
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i19 = i7;
                                i17 = -1;
                                i16 = i32;
                                i20 = i15;
                                break;
                            }
                            i8 = i3;
                            unsafe = unsafe2;
                            i5 = i30;
                            i6 = i15;
                            obj2 = obj3;
                            bxxf = bxxf2;
                            break;
                        case 8:
                            int i33 = i2;
                            i15 = i14;
                            i7 = i27;
                            if (b3 == 2) {
                                if ((i13 & 536870912) != 0) {
                                    i18 = bxtg.m123148d(bArr2, i3, bxtf2);
                                } else {
                                    i18 = bxtg.m123146c(bArr2, i3, bxtf2);
                                }
                                unsafe2.putObject(obj3, i26, bxtf2.f164769c);
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i19 = i7;
                                i17 = -1;
                                i16 = i33;
                                i20 = i15;
                                break;
                            }
                            i8 = i3;
                            unsafe = unsafe2;
                            i5 = i30;
                            i6 = i15;
                            obj2 = obj3;
                            bxxf = bxxf2;
                            break;
                        case 9:
                            i15 = i14;
                            i7 = i27;
                            if (b3 != 2) {
                                i8 = i3;
                                unsafe = unsafe2;
                                i5 = i30;
                                i6 = i15;
                                obj2 = obj3;
                                bxxf = bxxf2;
                                break;
                            } else {
                                int i34 = i2;
                                i18 = bxtg.m123139a(bxxf2.m124178a(i15), bArr2, i3, i34, bxtf2);
                                Object object = unsafe2.getObject(obj3, i26);
                                if (object == null) {
                                    unsafe2.putObject(obj3, i26, bxtf2.f164769c);
                                } else {
                                    unsafe2.putObject(obj3, i26, bxwd.m124081a(object, bxtf2.f164769c));
                                }
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i19 = i7;
                                i17 = -1;
                                i16 = i34;
                                i20 = i15;
                                break;
                            }
                        case 10:
                            i15 = i14;
                            i7 = i27;
                            if (b3 != 2) {
                                i8 = i3;
                                unsafe = unsafe2;
                                i5 = i30;
                                i6 = i15;
                                obj2 = obj3;
                                bxxf = bxxf2;
                                break;
                            } else {
                                i18 = bxtg.m123149e(bArr2, i3, bxtf2);
                                unsafe2.putObject(obj3, i26, bxtf2.f164769c);
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i15;
                                i19 = i7;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 12:
                            i15 = i14;
                            i7 = i27;
                            if (b3 != 0) {
                                i8 = i3;
                                unsafe = unsafe2;
                                i5 = i30;
                                i6 = i15;
                                obj2 = obj3;
                                bxxf = bxxf2;
                                break;
                            } else {
                                i18 = bxtg.m123141a(bArr2, i3, bxtf2);
                                unsafe2.putInt(obj3, i26, bxtf2.f164767a);
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i15;
                                i19 = i7;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 15:
                            i15 = i14;
                            i7 = i27;
                            if (b3 != 0) {
                                i8 = i3;
                                unsafe = unsafe2;
                                i5 = i30;
                                i6 = i15;
                                obj2 = obj3;
                                bxxf = bxxf2;
                                break;
                            } else {
                                i18 = bxtg.m123141a(bArr2, i3, bxtf2);
                                unsafe2.putInt(obj3, i26, bxuc.m123422g(bxtf2.f164767a));
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i15;
                                i19 = i7;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 16:
                            if (b3 != 0) {
                                i15 = i14;
                                i7 = i27;
                                i8 = i3;
                                unsafe = unsafe2;
                                i5 = i30;
                                i6 = i15;
                                obj2 = obj3;
                                bxxf = bxxf2;
                                break;
                            } else {
                                int b5 = bxtg.m123143b(bArr2, i3, bxtf2);
                                unsafe2.putLong(obj, i26, bxuc.m123415a(bxtf2.f164768b));
                                i21 |= i29;
                                unsafe3 = unsafe2;
                                i22 = i30;
                                i20 = i14;
                                i18 = b5;
                                i19 = i27;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        default:
                            i15 = i14;
                            i7 = i27;
                            i8 = i3;
                            unsafe = unsafe2;
                            i5 = i30;
                            i6 = i15;
                            obj2 = obj3;
                            bxxf = bxxf2;
                            break;
                    }
                } else {
                    i7 = i27;
                    int i35 = i25;
                    int i36 = i4;
                    Unsafe unsafe5 = unsafe4;
                    if (g == 27) {
                        int i37 = i3;
                        i9 = i21;
                        i5 = i22;
                        long j2 = i26;
                        Unsafe unsafe6 = unsafe5;
                        int i38 = i36;
                        if (b3 == 2) {
                            Object obj4 = obj;
                            long j3 = j2;
                            Unsafe unsafe7 = unsafe6;
                            bxwc bxwc = (bxwc) unsafe7.getObject(obj4, j3);
                            if (!bxwc.mo73666a()) {
                                int size = bxwc.size();
                                if (size != 0) {
                                    i12 = size + size;
                                } else {
                                    i12 = 10;
                                }
                                bxwc = bxwc.mo73731c(i12);
                                unsafe7.putObject(obj4, j3, bxwc);
                            }
                            i18 = bxtg.m123137a(m124178a(i38), b, bArr, i37, i2, bxwc, bxtf);
                            bArr2 = bArr;
                            i16 = i2;
                            bxtf2 = bxtf;
                            obj3 = obj4;
                            bxxf2 = this;
                            i20 = i38;
                            i19 = i7;
                            i21 = i9;
                            i22 = i5;
                            i17 = -1;
                            unsafe3 = unsafe7;
                        } else {
                            bxxf = this;
                            obj2 = obj;
                            i11 = i37;
                            i10 = i38;
                            unsafe = unsafe6;
                        }
                    } else if (g <= 49) {
                        int i39 = i3;
                        int i40 = i21;
                        i5 = i22;
                        Unsafe unsafe8 = unsafe5;
                        i6 = i36;
                        i18 = m124173a(obj, bArr, i3, i2, b, i7, b3, i36, (long) i35, g, i26, bxtf);
                        if (i18 != i39) {
                            bxxf2 = this;
                            obj3 = obj;
                            bArr2 = bArr;
                            i16 = i2;
                            bxtf2 = bxtf;
                            i19 = i7;
                            i20 = i6;
                            i21 = i40;
                            i22 = i5;
                            unsafe3 = unsafe8;
                            i17 = -1;
                        } else {
                            bxxf = this;
                            obj2 = obj;
                            i8 = i18;
                            i21 = i40;
                            unsafe = unsafe8;
                        }
                    } else {
                        byte b6 = b3;
                        int i41 = i3;
                        i9 = i21;
                        i5 = i22;
                        long j4 = i26;
                        Unsafe unsafe9 = unsafe5;
                        i6 = i36;
                        int i42 = i35;
                        int i43 = g;
                        if (i43 != 50) {
                            i18 = m124172a(obj, bArr, i41, i2, b, i7, b6, i42, i43, j4, i6, bxtf);
                            if (i18 != i41) {
                                bxxf2 = this;
                                obj3 = obj;
                                bArr2 = bArr;
                                i16 = i2;
                                bxtf2 = bxtf;
                                i19 = i7;
                                i20 = i6;
                                i21 = i9;
                                i22 = i5;
                                unsafe3 = unsafe9;
                                i17 = -1;
                            } else {
                                bxxf = this;
                                obj2 = obj;
                                i8 = i18;
                                i21 = i9;
                                unsafe = unsafe9;
                            }
                        } else if (b6 != 2) {
                            bxxf = this;
                            obj2 = obj;
                            i11 = i41;
                            i10 = i6;
                            unsafe = unsafe9;
                        } else {
                            i18 = m124174a(obj, bArr, i41, i2, i6, j4, bxtf);
                            if (i18 != i41) {
                                bxxf2 = this;
                                obj3 = obj;
                                bArr2 = bArr;
                                i16 = i2;
                                bxtf2 = bxtf;
                                i19 = i7;
                                i20 = i6;
                                i21 = i9;
                                i22 = i5;
                                unsafe3 = unsafe9;
                                i17 = -1;
                            } else {
                                bxxf = this;
                                obj2 = obj;
                                i8 = i18;
                                i21 = i9;
                                unsafe = unsafe9;
                            }
                        }
                    }
                    i8 = i11;
                    i6 = i10;
                    i21 = i9;
                }
            } else {
                i7 = i24;
                i5 = i22;
                unsafe = unsafe3;
                obj2 = obj3;
                bxxf = bxxf2;
                i8 = i3;
                i6 = 0;
            }
            i18 = bxtg.m123135a(b, bArr, i8, i2, m124200c(obj), bxtf);
            bArr2 = bArr;
            i16 = i2;
            bxtf2 = bxtf;
            obj3 = obj2;
            bxxf2 = bxxf;
            i19 = i7;
            i20 = i6;
            i22 = i5;
            i17 = -1;
            unsafe3 = unsafe;
        }
        int i44 = i21;
        Unsafe unsafe10 = unsafe3;
        Object obj5 = obj3;
        int i45 = i22;
        if (i45 != 1048575) {
            unsafe10.putInt(obj5, (long) i45, i44);
        }
        if (i18 != i2) {
            throw bxwf.m124095h();
        }
    }

    /* renamed from: f */
    private static boolean m124209f(Object obj, long j) {
        return ((Boolean) bxyx.m124518f(obj, j)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [int], assign insn: 0x0052: IGET  (r1v5 ? I:int) = (r8v0 bxtf) bxtf.a int */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    private final int m124174a(Object obj, byte[] bArr, int i, int i2, int i3, long j, bxtf bxtf) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i4 = i2;
        long j2 = j;
        bxtf bxtf2 = bxtf;
        Unsafe unsafe = f165018b;
        Object b = m124192b(i3);
        Object object = unsafe.getObject(obj2, j2);
        if (bxwx.m124144b(object)) {
            Object a = bxwx.m124142a();
            bxwx.m124143a(a, object);
            unsafe.putObject(obj2, j2, a);
            object = a;
        }
        bxwu a2 = bxwx.m124141a(b);
        bxww bxww = (bxww) object;
        int a3 = bxtg.m123141a(bArr2, i, bxtf2);
        int i5 = bxtf2.f164767a;
        if (i5 < 0 || i5 > i4 - a3) {
            throw bxwf.m124088a();
        }
        int i6 = a3 + i5;
        Object obj3 = a2.f165009b;
        Object obj4 = a2.f165011d;
        while (a3 < i6) {
            int i7 = a3 + 1;
            byte b2 = bArr2[a3];
            if (b2 < 0) {
                i7 = bxtg.m123136a(b2, bArr2, i7, bxtf2);
                b2 = bxtf2.f164767a;
            }
            byte b3 = b2 & 7;
            int i8 = b2 >>> 3;
            if (i8 == 1) {
                bxzf bxzf = a2.f165008a;
                if (b3 == bxzf.f165149t) {
                    a3 = m124175a(bArr, i7, i2, bxzf, (Class) null, bxtf);
                    obj3 = bxtf2.f164769c;
                }
            } else if (i8 == 2) {
                bxzf bxzf2 = a2.f165010c;
                if (b3 == bxzf2.f165149t) {
                    a3 = m124175a(bArr, i7, i2, bxzf2, a2.f165011d.getClass(), bxtf);
                    obj4 = bxtf2.f164769c;
                }
            }
            a3 = bxtg.m123133a(b2, bArr2, i7, i4, bxtf2);
        }
        if (a3 == i6) {
            bxww.put(obj3, obj4);
            return i6;
        }
        throw bxwf.m124095h();
    }

    /* renamed from: a */
    private static final int m124175a(byte[] bArr, int i, int i2, bxzf bxzf, Class cls, bxtf bxtf) {
        bxzf bxzf2 = bxzf.DOUBLE;
        switch (bxzf.ordinal()) {
            case 0:
                bxtf.f164769c = Double.valueOf(bxtg.m123145c(bArr, i));
                return i + 8;
            case 1:
                bxtf.f164769c = Float.valueOf(bxtg.m123147d(bArr, i));
                return i + 4;
            case 2:
            case 3:
                int b = bxtg.m123143b(bArr, i, bxtf);
                bxtf.f164769c = Long.valueOf(bxtf.f164768b);
                return b;
            case 4:
            case 12:
            case 13:
                int a = bxtg.m123141a(bArr, i, bxtf);
                bxtf.f164769c = Integer.valueOf(bxtf.f164767a);
                return a;
            case 5:
            case 15:
                bxtf.f164769c = Long.valueOf(bxtg.m123144b(bArr, i));
                return i + 8;
            case 6:
            case 14:
                bxtf.f164769c = Integer.valueOf(bxtg.m123140a(bArr, i));
                return i + 4;
            case 7:
                int b2 = bxtg.m123143b(bArr, i, bxtf);
                bxtf.f164769c = Boolean.valueOf(bxtf.f164768b != 0);
                return b2;
            case 8:
                return bxtg.m123148d(bArr, i, bxtf);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return bxtg.m123139a(bxxm.f165037a.mo74227a(cls), bArr, i, i2, bxtf);
            case 11:
                return bxtg.m123149e(bArr, i, bxtf);
            case 16:
                int a2 = bxtg.m123141a(bArr, i, bxtf);
                bxtf.f164769c = Integer.valueOf(bxuc.m123422g(bxtf.f164767a));
                return a2;
            case 17:
                int b3 = bxtg.m123143b(bArr, i, bxtf);
                bxtf.f164769c = Long.valueOf(bxuc.m123415a(bxtf.f164768b));
                return b3;
        }
    }

    /* renamed from: a */
    static bxxf m124176a(bxwz bxwz, bxxi bxxi, bxwp bxwp, bxyn bxyn, bxut bxut, bxwx bxwx) {
        if (bxwz instanceof bxxo) {
            return m124177a((bxxo) bxwz, bxwp, bxyn, bxut, bxwx);
        }
        bxyh bxyh = (bxyh) bxwz;
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxxf.a(java.lang.Class, java.lang.String):java.lang.reflect.Field
     arg types: [java.lang.Class<?>, java.lang.String]
     candidates:
      bxxf.a(int, int):int
      bxxf.a(java.lang.Object, long):java.util.List
      bxxf.a(java.lang.Object, int):boolean
      bxxf.a(java.lang.Object, bxul):void
      bxxf.a(java.lang.Object, java.lang.Object):boolean
      bxxv.a(java.lang.Object, bxul):void
      bxxv.a(java.lang.Object, java.lang.Object):boolean
      bxxf.a(java.lang.Class, java.lang.String):java.lang.reflect.Field */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0317  */
    /* renamed from: a */
    static bxxf m124177a(bxxo bxxo, bxwp bxwp, bxyn bxyn, bxut bxut, bxwx bxwx) {
        boolean z;
        int i;
        char c;
        int i2;
        int[] iArr;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i3;
        char c7;
        int i4;
        char c8;
        Object[] objArr;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        char c9;
        int[] iArr2;
        int i9;
        boolean z2;
        int i10;
        int i11;
        Field field;
        Field field2;
        int i12;
        char charAt;
        int objectFieldOffset;
        Field field3;
        int i13;
        int i14;
        char charAt2;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        char charAt9;
        int i22;
        char charAt10;
        int i23;
        char charAt11;
        int i24;
        char charAt12;
        int i25;
        char charAt13;
        bxxo bxxo2 = bxxo;
        char c10 = 0;
        if (bxxo.mo74215c() == 2) {
            z = true;
        } else {
            z = false;
        }
        String str2 = bxxo2.f165044b;
        int length = str2.length();
        char c11 = 55296;
        if (str2.charAt(0) < 55296) {
            i = 1;
        } else {
            int i26 = 1;
            while (true) {
                i = i26 + 1;
                if (str2.charAt(i26) < c11) {
                    break;
                }
                bxxo2 = bxxo2;
                i26 = i;
                c10 = 0;
                c11 = 55296;
            }
        }
        int i27 = i + 1;
        char charAt14 = str2.charAt(i);
        if (charAt14 >= c11) {
            char c12 = charAt14 & 8191;
            int i28 = 13;
            while (true) {
                i25 = i27 + 1;
                charAt13 = str2.charAt(i27);
                if (charAt13 < c11) {
                    break;
                }
                c12 |= (charAt13 & 8191) << i28;
                i28 += 13;
                i27 = i25;
            }
            charAt14 = c12 | (charAt13 << i28);
            i27 = i25;
        }
        if (charAt14 == 0) {
            iArr = f165017a;
            c5 = 0;
            c4 = 0;
            c3 = 0;
            c2 = 0;
            i2 = 0;
            c = 0;
        } else {
            int i29 = i27 + 1;
            char charAt15 = str2.charAt(i27);
            if (charAt15 >= c11) {
                char c13 = charAt15 & 8191;
                int i30 = 13;
                while (true) {
                    i24 = i29 + 1;
                    charAt12 = str2.charAt(i29);
                    if (charAt12 < c11) {
                        break;
                    }
                    c13 |= (charAt12 & 8191) << i30;
                    i30 += 13;
                    i29 = i24;
                }
                charAt15 = c13 | (charAt12 << i30);
                i29 = i24;
            }
            int i31 = i29 + 1;
            char charAt16 = str2.charAt(i29);
            if (charAt16 >= c11) {
                char c14 = charAt16 & 8191;
                int i32 = 13;
                while (true) {
                    i23 = i31 + 1;
                    charAt11 = str2.charAt(i31);
                    if (charAt11 < c11) {
                        break;
                    }
                    c14 |= (charAt11 & 8191) << i32;
                    i32 += 13;
                    i31 = i23;
                }
                charAt16 = c14 | (charAt11 << i32);
                i31 = i23;
            }
            int i33 = i31 + 1;
            c4 = str2.charAt(i31);
            if (c4 >= c11) {
                char c15 = c4 & 8191;
                int i34 = 13;
                while (true) {
                    i22 = i33 + 1;
                    charAt10 = str2.charAt(i33);
                    if (charAt10 < c11) {
                        break;
                    }
                    c15 |= (charAt10 & 8191) << i34;
                    i34 += 13;
                    i33 = i22;
                }
                c4 = c15 | (charAt10 << i34);
                i33 = i22;
            }
            int i35 = i33 + 1;
            c3 = str2.charAt(i33);
            if (c3 >= c11) {
                char c16 = c3 & 8191;
                int i36 = 13;
                while (true) {
                    i21 = i35 + 1;
                    charAt9 = str2.charAt(i35);
                    if (charAt9 < c11) {
                        break;
                    }
                    c16 |= (charAt9 & 8191) << i36;
                    i36 += 13;
                    i35 = i21;
                }
                c3 = c16 | (charAt9 << i36);
                i35 = i21;
            }
            int i37 = i35 + 1;
            c2 = str2.charAt(i35);
            if (c2 >= c11) {
                char c17 = c2 & 8191;
                int i38 = 13;
                while (true) {
                    i20 = i37 + 1;
                    charAt8 = str2.charAt(i37);
                    if (charAt8 < c11) {
                        break;
                    }
                    c17 |= (charAt8 & 8191) << i38;
                    i38 += 13;
                    i37 = i20;
                }
                c2 = c17 | (charAt8 << i38);
                i37 = i20;
            }
            int i39 = i37 + 1;
            char charAt17 = str2.charAt(i37);
            if (charAt17 >= c11) {
                char c18 = charAt17 & 8191;
                int i40 = 13;
                while (true) {
                    i19 = i39 + 1;
                    charAt7 = str2.charAt(i39);
                    if (charAt7 < c11) {
                        break;
                    }
                    c18 |= (charAt7 & 8191) << i40;
                    i40 += 13;
                    i39 = i19;
                }
                charAt17 = c18 | (charAt7 << i40);
                i39 = i19;
            }
            int i41 = i39 + 1;
            char charAt18 = str2.charAt(i39);
            if (charAt18 >= c11) {
                char c19 = charAt18 & 8191;
                int i42 = 13;
                while (true) {
                    i18 = i41 + 1;
                    charAt6 = str2.charAt(i41);
                    if (charAt6 < c11) {
                        break;
                    }
                    c19 |= (charAt6 & 8191) << i42;
                    i42 += 13;
                    i41 = i18;
                }
                charAt18 = c19 | (charAt6 << i42);
                i41 = i18;
            }
            int i43 = i41 + 1;
            c = str2.charAt(i41);
            if (c >= c11) {
                char c20 = c & 8191;
                int i44 = i43;
                int i45 = 13;
                while (true) {
                    i17 = i44 + 1;
                    charAt5 = str2.charAt(i44);
                    if (charAt5 < c11) {
                        break;
                    }
                    c20 |= (charAt5 & 8191) << i45;
                    i45 += 13;
                    i44 = i17;
                }
                c = c20 | (charAt5 << i45);
                i43 = i17;
            }
            i2 = charAt15 + charAt15 + charAt16;
            c5 = charAt17;
            iArr = new int[(c + charAt17 + charAt18)];
            c10 = charAt15;
            i27 = i43;
        }
        Unsafe unsafe = f165018b;
        Object[] objArr2 = bxxo2.f165045c;
        Class<?> cls = bxxo2.f165043a.getClass();
        int[] iArr3 = new int[(c2 * 3)];
        Object[] objArr3 = new Object[(c2 + c2)];
        int i46 = c + c5;
        char c21 = c;
        int i47 = i27;
        int i48 = i46;
        int i49 = 0;
        int i50 = 0;
        while (i47 < length) {
            int i51 = i47 + 1;
            int charAt19 = str2.charAt(i47);
            int i52 = length;
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = i51;
                int i55 = 13;
                while (true) {
                    i16 = i54 + 1;
                    charAt4 = str2.charAt(i54);
                    c6 = c;
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i54 = i16;
                    c = c6;
                }
                charAt19 = i53 | (charAt4 << i55);
                i3 = i16;
            } else {
                c6 = c;
                i3 = i51;
            }
            int i56 = i3 + 1;
            char charAt20 = str2.charAt(i3);
            int i57 = i56;
            if (charAt20 >= 55296) {
                char c22 = charAt20 & 8191;
                int i58 = i57;
                int i59 = 13;
                while (true) {
                    i15 = i58 + 1;
                    charAt3 = str2.charAt(i58);
                    c7 = c3;
                    if (charAt3 < 55296) {
                        break;
                    }
                    c22 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i58 = i15;
                    c3 = c7;
                }
                charAt20 = c22 | (charAt3 << i59);
                i4 = i15;
            } else {
                c7 = c3;
                i4 = i57;
            }
            char c23 = charAt20 & 255;
            char c24 = c4;
            if ((charAt20 & 1024) != 0) {
                iArr[i50] = i49;
                i50++;
            }
            if (c23 < '3') {
                int i60 = i2 + 1;
                Field a = m124180a((Class) cls, (String) objArr2[i2]);
                if (c23 != 9) {
                    if (c23 != 17) {
                        if (c23 == 27 || c23 == '1') {
                            int i61 = i49 / 3;
                            objArr3[i61 + i61 + 1] = objArr2[i60];
                            i60++;
                            z2 = z;
                            objArr = objArr3;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(a);
                            if ((charAt20 & 4096) == 4096) {
                            }
                            if (c23 >= 18) {
                            }
                            i9 = objectFieldOffset;
                            i7 = i4;
                            str = str2;
                        } else if (c23 == 12 || c23 == 30 || c23 == ',') {
                            if (!z) {
                                int i62 = i49 / 3;
                                objArr3[i62 + i62 + 1] = objArr2[i60];
                                i60++;
                            }
                            z2 = z;
                            objArr = objArr3;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(a);
                            if ((charAt20 & 4096) == 4096) {
                                c8 = c10;
                                c9 = charAt20;
                                i5 = i60;
                                i8 = 0;
                                i6 = 1048575;
                                iArr2 = iArr3;
                            } else if (c23 <= 17) {
                                int i63 = i4 + 1;
                                char charAt21 = str2.charAt(i4);
                                char c25 = 55296;
                                if (charAt21 >= 55296) {
                                    char c26 = charAt21 & 8191;
                                    int i64 = 13;
                                    while (true) {
                                        i14 = i63 + 1;
                                        charAt2 = str2.charAt(i63);
                                        if (charAt2 < c25) {
                                            break;
                                        }
                                        c26 |= (charAt2 & 8191) << i64;
                                        i64 += 13;
                                        i63 = i14;
                                        c25 = 55296;
                                    }
                                    charAt21 = c26 | (charAt2 << i64);
                                    i13 = i14;
                                } else {
                                    i13 = i63;
                                }
                                int i65 = c10 + c10 + (charAt21 / ' ');
                                c8 = c10;
                                Object obj = objArr2[i65];
                                i5 = i60;
                                if (obj instanceof Field) {
                                    field3 = (Field) obj;
                                } else {
                                    field3 = m124180a((Class) cls, (String) obj);
                                    objArr2[i65] = field3;
                                }
                                c9 = charAt20;
                                iArr2 = iArr3;
                                i8 = charAt21 % ' ';
                                i6 = (int) unsafe.objectFieldOffset(field3);
                            } else {
                                c8 = c10;
                                c9 = charAt20;
                                i5 = i60;
                                iArr2 = iArr3;
                                i8 = 0;
                                i6 = 1048575;
                            }
                            if (c23 >= 18 && c23 <= '1') {
                                iArr[i48] = objectFieldOffset;
                                i48++;
                                i9 = objectFieldOffset;
                                i7 = i4;
                                str = str2;
                            } else {
                                i9 = objectFieldOffset;
                                i7 = i4;
                                str = str2;
                            }
                        } else {
                            if (c23 == '2') {
                                int i66 = c21 + 1;
                                iArr[c21] = i49;
                                int i67 = i49 / 3;
                                int i68 = i60 + 1;
                                int i69 = i67 + i67;
                                objArr3[i69] = objArr2[i60];
                                if ((charAt20 & 2048) != 0) {
                                    i60 = i68 + 1;
                                    objArr3[i69 + 1] = objArr2[i68];
                                    c21 = i66;
                                } else {
                                    c21 = i66;
                                    i60 = i68;
                                }
                            }
                            z2 = z;
                            objArr = objArr3;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(a);
                            if ((charAt20 & 4096) == 4096) {
                            }
                            if (c23 >= 18) {
                                iArr[i48] = objectFieldOffset;
                                i48++;
                                i9 = objectFieldOffset;
                                i7 = i4;
                                str = str2;
                            }
                            i9 = objectFieldOffset;
                            i7 = i4;
                            str = str2;
                        }
                    }
                }
                int i70 = i49 / 3;
                objArr3[i70 + i70 + 1] = a.getType();
                z2 = z;
                objArr = objArr3;
                objectFieldOffset = (int) unsafe.objectFieldOffset(a);
                if ((charAt20 & 4096) == 4096) {
                }
                if (c23 >= 18) {
                }
                i9 = objectFieldOffset;
                i7 = i4;
                str = str2;
            } else {
                c8 = c10;
                iArr2 = iArr3;
                z2 = z;
                objArr = objArr3;
                c9 = charAt20;
                int i71 = i4 + 1;
                char charAt22 = str2.charAt(i4);
                if (charAt22 >= 55296) {
                    char c27 = charAt22 & 8191;
                    int i72 = 13;
                    while (true) {
                        i12 = i71 + 1;
                        charAt = str2.charAt(i71);
                        if (charAt < 55296) {
                            break;
                        }
                        c27 |= (charAt & 8191) << i72;
                        i72 += 13;
                        i71 = i12;
                    }
                    charAt22 = c27 | (charAt << i72);
                    i71 = i12;
                }
                int i73 = c23 - '3';
                if (i73 == 9 || i73 == 17) {
                    int i74 = i49 / 3;
                    objArr[i74 + i74 + 1] = objArr2[i2];
                    i2++;
                } else if (i73 == 12 && !z2) {
                    int i75 = i49 / 3;
                    objArr[i75 + i75 + 1] = objArr2[i2];
                    i2++;
                }
                int i76 = charAt22 + charAt22;
                Object obj2 = objArr2[i76];
                if (obj2 instanceof Field) {
                    field = (Field) obj2;
                } else {
                    field = m124180a((Class) cls, (String) obj2);
                    objArr2[i76] = field;
                }
                str = str2;
                i7 = i71;
                i9 = (int) unsafe.objectFieldOffset(field);
                int i77 = i76 + 1;
                Object obj3 = objArr2[i77];
                if (obj3 instanceof Field) {
                    field2 = (Field) obj3;
                } else {
                    field2 = m124180a((Class) cls, (String) obj3);
                    objArr2[i77] = field2;
                }
                i6 = (int) unsafe.objectFieldOffset(field2);
                i5 = i2;
                i8 = 0;
            }
            int i78 = i49 + 1;
            iArr2[i49] = charAt19;
            int i79 = i78 + 1;
            char c28 = c9;
            if ((c28 & 512) != 0) {
                i10 = 536870912;
            } else {
                i10 = 0;
            }
            if ((c28 & 256) != 0) {
                i11 = 268435456;
            } else {
                i11 = 0;
            }
            iArr2[i78] = i9 | i11 | i10 | (c23 << 20);
            i49 = i79 + 1;
            iArr2[i79] = (i8 << 20) | i6;
            z = z2;
            iArr3 = iArr2;
            str2 = str;
            i47 = i7;
            c4 = c24;
            length = i52;
            c = c6;
            c3 = c7;
            i2 = i5;
            objArr3 = objArr;
            c10 = c8;
        }
        return new bxxf(iArr3, objArr3, c4, c3, bxxo.f165043a, z, iArr, c, i46, bxwp, bxyn, bxut);
    }

    /* renamed from: b */
    public final int mo74223b(Object obj) {
        return !this.f165026j ? m124208f(obj) : m124211g(obj);
    }

    /* renamed from: b */
    public final void mo74224b(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i = 0; i < this.f165019c.length; i += 3) {
                int e = m124205e(i);
                long i2 = m124214i(e);
                int d = m124203d(i);
                switch (m124210g(e)) {
                    case 0:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124502a(obj, i2, bxyx.m124517e(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 1:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124503a(obj, i2, bxyx.m124515d(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 2:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124505a(obj, i2, bxyx.m124510b(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 3:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124505a(obj, i2, bxyx.m124510b(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 4:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124504a(obj, i2, bxyx.m124494a(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 5:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124505a(obj, i2, bxyx.m124510b(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 6:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124504a(obj, i2, bxyx.m124494a(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 7:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124507a(obj, i2, bxyx.m124514c(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 8:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124506a(obj, i2, bxyx.m124518f(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 9:
                        m124185a(obj, obj2, i);
                        break;
                    case 10:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124506a(obj, i2, bxyx.m124518f(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 11:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124504a(obj, i2, bxyx.m124494a(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 12:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124504a(obj, i2, bxyx.m124494a(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 13:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124504a(obj, i2, bxyx.m124494a(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 14:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124505a(obj, i2, bxyx.m124510b(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 15:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124504a(obj, i2, bxyx.m124494a(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 16:
                        if (!m124186a(obj2, i)) {
                            break;
                        } else {
                            bxyx.m124505a(obj, i2, bxyx.m124510b(obj2, i2));
                            m124193b(obj, i);
                            break;
                        }
                    case 17:
                        m124185a(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case FelicaException.TYPE_NOT_CLOSED:
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                    case FelicaException.TYPE_PUSH_FAILED:
                    case 41:
                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    case FelicaException.TYPE_RESET_FAILED:
                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                    case 47:
                    case 48:
                    case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                        this.f165030n.mo74196a(obj, obj2, i2);
                        break;
                    case 50:
                        bxxw.m124353a(obj, obj2, i2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case FelicaException.TYPE_ACTIVATE_FAILED:
                    case 57:
                    case FelicaException.TYPE_OFFLINE_CANCELED:
                    case FelicaException.TYPE_NOW_EXECUTING_FALP:
                        if (!m124187a(obj2, d, i)) {
                            break;
                        } else {
                            bxyx.m124506a(obj, i2, bxyx.m124518f(obj2, i2));
                            m124194b(obj, d, i);
                            break;
                        }
                    case FelicaException.TYPE_MFC_NOT_FOUND:
                        m124196b(obj, obj2, i);
                        break;
                    case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    case 62:
                    case 63:
                    case 64:
                    case KeyInformation.AES128_DES56:
                    case 66:
                    case KeyInformation.AES128_DES112:
                        if (!m124187a(obj2, d, i)) {
                            break;
                        } else {
                            bxyx.m124506a(obj, i2, bxyx.m124518f(obj2, i2));
                            m124194b(obj, d, i);
                            break;
                        }
                    case 68:
                        m124196b(obj, obj2, i);
                        break;
                }
            }
            bxxw.m124365c(obj, obj2);
            if (this.f165024h) {
                bxxw.m124361b(obj, obj2);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    private final bxxv m124178a(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        bxxv bxxv = (bxxv) this.f165020d[i3];
        if (bxxv != null) {
            return bxxv;
        }
        bxxv a = bxxm.f165037a.mo74227a((Class) this.f165020d[i3 + 1]);
        this.f165020d[i3] = a;
        return a;
    }

    /* renamed from: a */
    private final Object m124179a(Object obj, int i, Object obj2) {
        int d = m124203d(i);
        Object f = bxyx.m124518f(obj, m124214i(m124205e(i)));
        if (f == null) {
            return obj2;
        }
        bxvr c = m124199c(i);
        if (c != null) {
            bxwu a = bxwx.m124141a(m124192b(i));
            Iterator it = ((bxww) f).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!c.mo3213a(((Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        obj2 = bxyo.m124424a();
                    }
                    bxts e = ByteString.m123269e(bxwv.m124133a(a, entry.getKey(), entry.getValue()));
                    try {
                        bxwv.m124135a(e.f164787a, a, entry.getKey(), entry.getValue());
                        ((bxyo) obj2).mo74283a(bxzh.m124562a(d, 2), e.mo73749a());
                        it.remove();
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        return obj2;
    }

    /* renamed from: a */
    private static Field m124180a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    private static List m124181a(Object obj, long j) {
        return (List) bxyx.m124518f(obj, j);
    }

    /* renamed from: a */
    private static final void m124182a(int i, Object obj, bxul bxul) {
        if (obj instanceof String) {
            bxul.mo73881a(i, (String) obj);
        } else {
            bxul.mo73878a(i, (ByteString) obj);
        }
    }

    /* renamed from: a */
    private final void m124183a(bxul bxul, int i, Object obj, int i2) {
        if (obj != null) {
            bxwu a = bxwx.m124141a(m124192b(i2));
            for (Map.Entry entry : ((bxww) obj).entrySet()) {
                bxul.f164857a.mo73845b(i, 2);
                bxul.f164857a.mo73855d(bxwv.m124133a(a, entry.getKey(), entry.getValue()));
                bxwv.m124135a(bxul.f164857a, a, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    private final void m124184a(Object obj, int i, bxxp bxxp) {
        if (m124213h(i)) {
            bxyx.m124506a(obj, m124214i(i), bxxp.mo73714m());
        } else if (this.f165025i) {
            bxyx.m124506a(obj, m124214i(i), bxxp.mo73712l());
        } else {
            bxyx.m124506a(obj, m124214i(i), bxxp.mo73716n());
        }
    }

    /* renamed from: a */
    private final void m124185a(Object obj, Object obj2, int i) {
        long i2 = m124214i(m124205e(i));
        if (m124186a(obj2, i)) {
            Object f = bxyx.m124518f(obj, i2);
            Object f2 = bxyx.m124518f(obj2, i2);
            if (f != null && f2 != null) {
                bxyx.m124506a(obj, i2, bxwd.m124081a(f, f2));
                m124193b(obj, i);
            } else if (f2 != null) {
                bxyx.m124506a(obj, i2, f2);
                m124193b(obj, i);
            }
        }
    }

    /* renamed from: a */
    private final boolean m124186a(Object obj, int i) {
        int f = m124207f(i);
        long j = (long) (1048575 & f);
        if (j != 1048575) {
            return (bxyx.m124494a(obj, j) & (1 << (f >>> 20))) != 0;
        }
        int e = m124205e(i);
        long i2 = m124214i(e);
        switch (m124210g(e)) {
            case 0:
                return bxyx.m124517e(obj, i2) != 0.0d;
            case 1:
                return bxyx.m124515d(obj, i2) != 0.0f;
            case 2:
                return bxyx.m124510b(obj, i2) != 0;
            case 3:
                return bxyx.m124510b(obj, i2) != 0;
            case 4:
                return bxyx.m124494a(obj, i2) != 0;
            case 5:
                return bxyx.m124510b(obj, i2) != 0;
            case 6:
                return bxyx.m124494a(obj, i2) != 0;
            case 7:
                return bxyx.m124514c(obj, i2);
            case 8:
                Object f2 = bxyx.m124518f(obj, i2);
                if (f2 instanceof String) {
                    return !((String) f2).isEmpty();
                }
                if (f2 instanceof ByteString) {
                    return !ByteString.f164797b.equals(f2);
                }
                throw new IllegalArgumentException();
            case 9:
                return bxyx.m124518f(obj, i2) != null;
            case 10:
                return !ByteString.f164797b.equals(bxyx.m124518f(obj, i2));
            case 11:
                return bxyx.m124494a(obj, i2) != 0;
            case 12:
                return bxyx.m124494a(obj, i2) != 0;
            case 13:
                return bxyx.m124494a(obj, i2) != 0;
            case 14:
                return bxyx.m124510b(obj, i2) != 0;
            case 15:
                return bxyx.m124494a(obj, i2) != 0;
            case 16:
                return bxyx.m124510b(obj, i2) != 0;
            case 17:
                return bxyx.m124518f(obj, i2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private final boolean m124187a(Object obj, int i, int i2) {
        return bxyx.m124494a(obj, (long) (m124207f(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private final boolean m124188a(Object obj, int i, int i2, int i3, int i4) {
        if (i2 != 1048575) {
            return (i3 & i4) != 0;
        }
        return m124186a(obj, i);
    }

    /* renamed from: a */
    private static boolean m124189a(Object obj, int i, bxxv bxxv) {
        return bxxv.mo74226e(bxyx.m124518f(obj, m124214i(i)));
    }

    /* renamed from: a */
    public final int mo74216a(Object obj) {
        int length = this.f165019c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int e = m124205e(i2);
            int d = m124203d(i2);
            long i3 = m124214i(e);
            int i4 = 37;
            switch (m124210g(e)) {
                case 0:
                    i = (i * 53) + bxwd.m124079a(Double.doubleToLongBits(bxyx.m124517e(obj, i3)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(bxyx.m124515d(obj, i3));
                    break;
                case 2:
                    i = (i * 53) + bxwd.m124079a(bxyx.m124510b(obj, i3));
                    break;
                case 3:
                    i = (i * 53) + bxwd.m124079a(bxyx.m124510b(obj, i3));
                    break;
                case 4:
                    i = (i * 53) + bxyx.m124494a(obj, i3);
                    break;
                case 5:
                    i = (i * 53) + bxwd.m124079a(bxyx.m124510b(obj, i3));
                    break;
                case 6:
                    i = (i * 53) + bxyx.m124494a(obj, i3);
                    break;
                case 7:
                    i = (i * 53) + bxwd.m124080a(bxyx.m124514c(obj, i3));
                    break;
                case 8:
                    i = (i * 53) + ((String) bxyx.m124518f(obj, i3)).hashCode();
                    break;
                case 9:
                    Object f = bxyx.m124518f(obj, i3);
                    if (f != null) {
                        i4 = f.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + bxyx.m124518f(obj, i3).hashCode();
                    break;
                case 11:
                    i = (i * 53) + bxyx.m124494a(obj, i3);
                    break;
                case 12:
                    i = (i * 53) + bxyx.m124494a(obj, i3);
                    break;
                case 13:
                    i = (i * 53) + bxyx.m124494a(obj, i3);
                    break;
                case 14:
                    i = (i * 53) + bxwd.m124079a(bxyx.m124510b(obj, i3));
                    break;
                case 15:
                    i = (i * 53) + bxyx.m124494a(obj, i3);
                    break;
                case 16:
                    i = (i * 53) + bxwd.m124079a(bxyx.m124510b(obj, i3));
                    break;
                case 17:
                    Object f2 = bxyx.m124518f(obj, i3);
                    if (f2 != null) {
                        i4 = f2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FelicaException.TYPE_NOT_CLOSED:
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                case FelicaException.TYPE_PUSH_FAILED:
                case 41:
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                case FelicaException.TYPE_RESET_FAILED:
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                case 47:
                case 48:
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    i = (i * 53) + bxyx.m124518f(obj, i3).hashCode();
                    break;
                case 50:
                    i = (i * 53) + bxyx.m124518f(obj, i3).hashCode();
                    break;
                case 51:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxwd.m124079a(Double.doubleToLongBits(m124190b(obj, i3)));
                        break;
                    }
                case 52:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(m124198c(obj, i3));
                        break;
                    }
                case 53:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxwd.m124079a(m124206e(obj, i3));
                        break;
                    }
                case 54:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxwd.m124079a(m124206e(obj, i3));
                        break;
                    }
                case 55:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m124204d(obj, i3);
                        break;
                    }
                case FelicaException.TYPE_ACTIVATE_FAILED:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxwd.m124079a(m124206e(obj, i3));
                        break;
                    }
                case 57:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m124204d(obj, i3);
                        break;
                    }
                case FelicaException.TYPE_OFFLINE_CANCELED:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxwd.m124080a(m124209f(obj, i3));
                        break;
                    }
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) bxyx.m124518f(obj, i3)).hashCode();
                        break;
                    }
                case FelicaException.TYPE_MFC_NOT_FOUND:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxyx.m124518f(obj, i3).hashCode();
                        break;
                    }
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxyx.m124518f(obj, i3).hashCode();
                        break;
                    }
                case 62:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m124204d(obj, i3);
                        break;
                    }
                case 63:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m124204d(obj, i3);
                        break;
                    }
                case 64:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m124204d(obj, i3);
                        break;
                    }
                case KeyInformation.AES128_DES56:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxwd.m124079a(m124206e(obj, i3));
                        break;
                    }
                case 66:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m124204d(obj, i3);
                        break;
                    }
                case KeyInformation.AES128_DES112:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxwd.m124079a(m124206e(obj, i3));
                        break;
                    }
                case 68:
                    if (!m124187a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + bxyx.m124518f(obj, i3).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + bxyn.m124416a(obj).hashCode();
        return this.f165024h ? (hashCode * 53) + bxut.m123748a(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Type inference failed for: r38v0, types: [int], assign insn: null */
    /* JADX WARN: Type inference failed for: r1v96, types: [int], assign insn: 0x0027: IGET  (r1v96 ? I:int) = (r9v1 bxtf) bxtf.a int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxyn.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.Object, bxyo]
     candidates:
      bxyn.a(java.lang.Object, bxyo):void
      bxyn.a(java.lang.Object, bxxp):boolean
      bxyn.a(java.lang.Object, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    public final int mo74217a(Object obj, byte[] bArr, int i, int i2, int r38, bxtf bxtf) {
        Unsafe unsafe;
        byte b;
        int i3;
        bxxf bxxf;
        Object obj2;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        byte b3;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        bxtf bxtf2;
        int i12;
        int a;
        byte[] bArr2;
        int i13;
        int i14;
        int i15;
        Object obj3;
        Object b4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        byte b5;
        int i22;
        int i23;
        bxxf bxxf2 = this;
        Object obj4 = obj;
        byte[] bArr3 = bArr;
        int i24 = i2;
        byte b6 = r38;
        bxtf bxtf3 = bxtf;
        Unsafe unsafe2 = f165018b;
        int i25 = i;
        byte b7 = 0;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1048575;
        while (true) {
            if (i25 < i24) {
                int i30 = i25 + 1;
                byte b8 = bArr3[i25];
                if (b8 < 0) {
                    int a2 = bxtg.m123136a(b8, bArr3, i30, bxtf3);
                    b2 = bxtf3.f164767a;
                    i30 = a2;
                } else {
                    b2 = b8;
                }
                int i31 = b2 >>> 3;
                byte b9 = b2 & 7;
                if (i31 > i26) {
                    i5 = bxxf2.m124171a(i31, i27 / 3);
                } else {
                    i5 = bxxf2.m124215j(i31);
                }
                if (i5 != -1) {
                    int i32 = bxxf2.f165019c[i5 + 1];
                    int g = m124210g(i32);
                    int i33 = i31;
                    int i34 = i30;
                    long i35 = m124214i(i32);
                    if (g <= 17) {
                        int i36 = bxxf2.f165019c[i5 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 == i29) {
                            i20 = i29;
                            i21 = i28;
                        } else {
                            if (i29 == 1048575) {
                                i20 = i38;
                            } else {
                                i20 = i38;
                                unsafe2.putInt(obj4, (long) i29, i28);
                            }
                            i21 = unsafe2.getInt(obj4, (long) i20);
                        }
                        switch (g) {
                            case 0:
                                int i39 = i5;
                                b5 = b2;
                                i9 = i34;
                                long j = i35;
                                if (b9 != 1) {
                                    i8 = i39;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    bxyx.m124502a(obj4, j, bxtg.m123145c(bArr3, i9));
                                    i25 = i9 + 8;
                                    i28 = i21 | i37;
                                    i27 = i39;
                                    b7 = b5;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    b6 = r38;
                                    break;
                                }
                            case 1:
                                int i40 = i5;
                                b5 = b2;
                                i9 = i34;
                                long j2 = i35;
                                if (b9 != 5) {
                                    i8 = i40;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    bxyx.m124503a(obj4, j2, bxtg.m123147d(bArr3, i9));
                                    i25 = i9 + 4;
                                    i28 = i21 | i37;
                                    i27 = i40;
                                    b7 = b5;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    b6 = r38;
                                    break;
                                }
                            case 2:
                            case 3:
                                int i41 = i5;
                                b5 = b2;
                                i9 = i34;
                                long j3 = i35;
                                if (b9 != 0) {
                                    i8 = i41;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    int b10 = bxtg.m123143b(bArr3, i9, bxtf3);
                                    unsafe2.putLong(obj, j3, bxtf3.f164768b);
                                    i28 = i21 | i37;
                                    i25 = b10;
                                    i27 = i41;
                                    b7 = b5;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    b6 = r38;
                                    break;
                                }
                            case 4:
                            case 11:
                                int i42 = i5;
                                b5 = b2;
                                i9 = i34;
                                long j4 = i35;
                                if (b9 != 0) {
                                    i8 = i42;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    i25 = bxtg.m123141a(bArr3, i9, bxtf3);
                                    unsafe2.putInt(obj4, j4, bxtf3.f164767a);
                                    i28 = i21 | i37;
                                    i27 = i42;
                                    b7 = b5;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    b6 = r38;
                                    break;
                                }
                            case 5:
                            case 14:
                                int i43 = i5;
                                b5 = b2;
                                int i44 = i34;
                                long j5 = i35;
                                if (b9 != 1) {
                                    i9 = i44;
                                    i8 = i43;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j5, bxtg.m123144b(bArr3, i44));
                                    i25 = i44 + 8;
                                    i28 = i21 | i37;
                                    i27 = i43;
                                    b7 = b5;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    b6 = r38;
                                    break;
                                }
                            case 6:
                            case 13:
                                int i45 = i5;
                                b5 = b2;
                                int i46 = i34;
                                long j6 = i35;
                                int i47 = i2;
                                if (b9 != 5) {
                                    i9 = i46;
                                    i8 = i45;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j6, bxtg.m123140a(bArr3, i46));
                                    i25 = i46 + 4;
                                    i28 = i21 | i37;
                                    i27 = i45;
                                    b7 = b5;
                                    i29 = i20;
                                    b6 = r38;
                                    i24 = i47;
                                    i26 = i33;
                                    break;
                                }
                            case 7:
                                int i48 = i5;
                                b5 = b2;
                                int i49 = i34;
                                long j7 = i35;
                                int i50 = i2;
                                if (b9 != 0) {
                                    i9 = i49;
                                    i8 = i48;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    int b11 = bxtg.m123143b(bArr3, i49, bxtf3);
                                    bxyx.m124507a(obj4, j7, bxtf3.f164768b != 0);
                                    i28 = i21 | i37;
                                    i25 = b11;
                                    i27 = i48;
                                    b7 = b5;
                                    i29 = i20;
                                    b6 = r38;
                                    i24 = i50;
                                    i26 = i33;
                                    break;
                                }
                            case 8:
                                i22 = i5;
                                b5 = b2;
                                i23 = i34;
                                long j8 = i35;
                                int i51 = i2;
                                if (b9 == 2) {
                                    if ((536870912 & i32) != 0) {
                                        i25 = bxtg.m123148d(bArr3, i23, bxtf3);
                                    } else {
                                        i25 = bxtg.m123146c(bArr3, i23, bxtf3);
                                    }
                                    unsafe2.putObject(obj4, j8, bxtf3.f164769c);
                                    i28 = i21 | i37;
                                    i27 = i22;
                                    b7 = b5;
                                    i29 = i20;
                                    b6 = r38;
                                    i24 = i51;
                                    i26 = i33;
                                    break;
                                }
                                i9 = i23;
                                i8 = i22;
                                i6 = i21;
                                unsafe = unsafe2;
                                bxxf = bxxf2;
                                i7 = i33;
                                i29 = i20;
                                z = true;
                                b3 = b5;
                                obj2 = obj4;
                                break;
                            case 9:
                                i22 = i5;
                                b5 = b2;
                                i23 = i34;
                                long j9 = i35;
                                if (b9 != 2) {
                                    i9 = i23;
                                    i8 = i22;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    int i52 = i2;
                                    i25 = bxtg.m123139a(bxxf2.m124178a(i22), bArr3, i23, i52, bxtf3);
                                    if ((i21 & i37) == 0) {
                                        unsafe2.putObject(obj4, j9, bxtf3.f164769c);
                                    } else {
                                        unsafe2.putObject(obj4, j9, bxwd.m124081a(unsafe2.getObject(obj4, j9), bxtf3.f164769c));
                                    }
                                    i28 = i21 | i37;
                                    i27 = i22;
                                    b7 = b5;
                                    i29 = i20;
                                    b6 = r38;
                                    i24 = i52;
                                    i26 = i33;
                                    break;
                                }
                            case 10:
                                int i53 = i5;
                                b5 = b2;
                                int i54 = i34;
                                long j10 = i35;
                                if (b9 != 2) {
                                    i9 = i54;
                                    i8 = i53;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    i25 = bxtg.m123149e(bArr3, i54, bxtf3);
                                    unsafe2.putObject(obj4, j10, bxtf3.f164769c);
                                    i28 = i21 | i37;
                                    i27 = i53;
                                    b7 = b5;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    b6 = r38;
                                    break;
                                }
                            case 12:
                                int i55 = i5;
                                b5 = b2;
                                int i56 = i34;
                                long j11 = i35;
                                if (b9 != 0) {
                                    i9 = i56;
                                    i8 = i55;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    i25 = bxtg.m123141a(bArr3, i56, bxtf3);
                                    int i57 = bxtf3.f164767a;
                                    bxvr c = bxxf2.m124199c(i55);
                                    if (c != null && !c.mo3213a(i57)) {
                                        m124200c(obj).mo74283a(b5, Long.valueOf((long) i57));
                                        i28 = i21;
                                        i27 = i55;
                                        b7 = b5;
                                        i26 = i33;
                                        i29 = i20;
                                        i24 = i2;
                                        b6 = r38;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j11, i57);
                                        i28 = i21 | i37;
                                        i27 = i55;
                                        b7 = b5;
                                        i26 = i33;
                                        i29 = i20;
                                        i24 = i2;
                                        b6 = r38;
                                        break;
                                    }
                                }
                            case 15:
                                int i58 = i5;
                                b5 = b2;
                                int i59 = i34;
                                if (b9 != 0) {
                                    i9 = i59;
                                    i8 = i58;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    i25 = bxtg.m123141a(bArr3, i59, bxtf3);
                                    unsafe2.putInt(obj4, i35, bxuc.m123422g(bxtf3.f164767a));
                                    i28 = i21 | i37;
                                    i27 = i58;
                                    b7 = b5;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    b6 = r38;
                                    break;
                                }
                            case 16:
                                if (b9 != 0) {
                                    b5 = b2;
                                    i9 = i34;
                                    i8 = i5;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    int b12 = bxtg.m123143b(bArr3, i34, bxtf3);
                                    unsafe2.putLong(obj, i35, bxuc.m123415a(bxtf3.f164768b));
                                    i28 = i21 | i37;
                                    i25 = b12;
                                    i27 = i5;
                                    b7 = b2;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    b6 = r38;
                                    break;
                                }
                            default:
                                int i60 = i5;
                                b5 = b2;
                                i9 = i34;
                                long j12 = i35;
                                if (b9 != 3) {
                                    i8 = i60;
                                    i6 = i21;
                                    unsafe = unsafe2;
                                    bxxf = bxxf2;
                                    i7 = i33;
                                    i29 = i20;
                                    z = true;
                                    b3 = b5;
                                    obj2 = obj4;
                                    break;
                                } else {
                                    int i61 = i60;
                                    long j13 = j12;
                                    i25 = bxtg.m123138a(bxxf2.m124178a(i60), bArr, i9, i2, (i33 << 3) | 4, bxtf);
                                    if ((i21 & i37) == 0) {
                                        unsafe2.putObject(obj4, j13, bxtf3.f164769c);
                                    } else {
                                        unsafe2.putObject(obj4, j13, bxwd.m124081a(unsafe2.getObject(obj4, j13), bxtf3.f164769c));
                                    }
                                    i28 = i21 | i37;
                                    bArr3 = bArr;
                                    b6 = r38;
                                    b7 = b5;
                                    i27 = i61;
                                    i26 = i33;
                                    i29 = i20;
                                    i24 = i2;
                                    break;
                                }
                        }
                    } else {
                        i8 = i5;
                        byte b13 = b2;
                        int i62 = g;
                        int i63 = i34;
                        int i64 = i33;
                        long j14 = i35;
                        if (i62 == 27) {
                            i6 = i28;
                            i16 = i29;
                            i7 = i64;
                            Unsafe unsafe3 = unsafe2;
                            long j15 = j14;
                            b3 = b13;
                            obj2 = obj4;
                            z = true;
                            i17 = i63;
                            if (b9 == 2) {
                                long j16 = j15;
                                Unsafe unsafe4 = unsafe3;
                                bxwc bxwc = (bxwc) unsafe4.getObject(obj2, j16);
                                if (!bxwc.mo73666a()) {
                                    int size = bxwc.size();
                                    if (size != 0) {
                                        i19 = size + size;
                                    } else {
                                        i19 = 10;
                                    }
                                    bxwc = bxwc.mo73731c(i19);
                                    unsafe4.putObject(obj2, j16, bxwc);
                                }
                                b7 = b3;
                                i25 = bxtg.m123137a(m124178a(i8), b7, bArr, i17, i2, bxwc, bxtf);
                                bArr3 = bArr;
                                i24 = i2;
                                b6 = r38;
                                unsafe2 = unsafe4;
                                i27 = i8;
                                obj4 = obj2;
                                i26 = i7;
                                i28 = i6;
                                i29 = i16;
                                bxtf3 = bxtf;
                                bxxf2 = this;
                            } else {
                                bxxf = this;
                                i18 = i8;
                                unsafe = unsafe3;
                            }
                        } else if (i62 <= 49) {
                            i6 = i28;
                            int i65 = i29;
                            i7 = i64;
                            z = true;
                            b3 = b13;
                            Unsafe unsafe5 = unsafe2;
                            obj2 = obj4;
                            i25 = m124173a(obj, bArr, i63, i2, b13, i64, b9, i8, (long) i32, i62, j14, bxtf);
                            if (i25 != i63) {
                                bArr3 = bArr;
                                i24 = i2;
                                b6 = r38;
                                bxtf3 = bxtf;
                                obj4 = obj2;
                                i27 = i8;
                                b7 = b3;
                                i26 = i7;
                                i28 = i6;
                                i29 = i65;
                                unsafe2 = unsafe5;
                                bxxf2 = this;
                            } else {
                                bxxf = this;
                                i9 = i25;
                                i29 = i65;
                                unsafe = unsafe5;
                            }
                        } else {
                            i6 = i28;
                            i16 = i29;
                            i7 = i64;
                            Unsafe unsafe6 = unsafe2;
                            long j17 = j14;
                            b3 = b13;
                            obj2 = obj4;
                            z = true;
                            z = true;
                            z = true;
                            i17 = i63;
                            int i66 = i62;
                            if (i66 != 50) {
                                i25 = m124172a(obj, bArr, i17, i2, b3, i7, b9, i32, i66, j17, i8, bxtf);
                                if (i25 != i17) {
                                    bArr3 = bArr;
                                    i24 = i2;
                                    b6 = r38;
                                    bxtf3 = bxtf;
                                    obj4 = obj2;
                                    i27 = i8;
                                    b7 = b3;
                                    i26 = i7;
                                    i28 = i6;
                                    i29 = i16;
                                    unsafe2 = unsafe6;
                                    bxxf2 = this;
                                } else {
                                    bxxf = this;
                                    i9 = i25;
                                    i29 = i16;
                                    unsafe = unsafe6;
                                }
                            } else if (b9 != 2) {
                                bxxf = this;
                                i18 = i8;
                                unsafe = unsafe6;
                            } else {
                                i25 = m124174a(obj, bArr, i17, i2, i8, j17, bxtf);
                                if (i25 != i17) {
                                    bArr3 = bArr;
                                    i24 = i2;
                                    b6 = r38;
                                    bxtf3 = bxtf;
                                    obj4 = obj2;
                                    i27 = i8;
                                    b7 = b3;
                                    i26 = i7;
                                    i28 = i6;
                                    i29 = i16;
                                    unsafe2 = unsafe6;
                                    bxxf2 = this;
                                } else {
                                    bxxf = this;
                                    i9 = i25;
                                    i29 = i16;
                                    unsafe = unsafe6;
                                }
                            }
                        }
                        i8 = i18;
                        i9 = i17;
                        i29 = i16;
                    }
                } else {
                    i7 = i31;
                    b3 = b2;
                    i6 = i28;
                    unsafe = unsafe2;
                    bxxf = bxxf2;
                    z = true;
                    obj2 = obj4;
                    i9 = i30;
                    i8 = 0;
                }
                b = r38;
                byte b14 = b3;
                if (b14 == b && b != 0) {
                    i25 = i9;
                    i4 = i29;
                    b7 = b14;
                    i28 = i6;
                    i3 = i2;
                } else {
                    if (!bxxf.f165024h) {
                        bArr2 = bArr;
                        bxtf2 = bxtf;
                        i13 = i29;
                        i14 = i7;
                        i15 = i2;
                    } else {
                        bxtf2 = bxtf;
                        if (bxtf2.f164770d != bxus.m123743b()) {
                            int i67 = i7;
                            bxvj a3 = bxtf2.f164770d.mo73903a(bxxf.f165023g, i67);
                            if (a3 == null) {
                                a = bxtg.m123135a(b14, bArr, i9, i2, m124200c(obj), bxtf);
                                i10 = i29;
                                i11 = i67;
                                bArr3 = bArr;
                                i12 = i2;
                            } else {
                                bxvg bxvg = (bxvg) obj2;
                                bxvg.mo74136c();
                                bxux bxux = bxvg.f164952m;
                                if (a3.mo74140b() != bxzf.ENUM) {
                                    switch (a3.mo74140b().ordinal()) {
                                        case 0:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            i9 += 8;
                                            obj3 = Double.valueOf(bxtg.m123145c(bArr3, i9));
                                            break;
                                        case 1:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            i9 += 4;
                                            obj3 = Float.valueOf(bxtg.m123147d(bArr3, i9));
                                            break;
                                        case 2:
                                        case 3:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            i9 = bxtg.m123143b(bArr3, i9, bxtf2);
                                            obj3 = Long.valueOf(bxtf2.f164768b);
                                            break;
                                        case 4:
                                        case 12:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            i9 = bxtg.m123141a(bArr3, i9, bxtf2);
                                            obj3 = Integer.valueOf(bxtf2.f164767a);
                                            break;
                                        case 5:
                                        case 15:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            i9 += 8;
                                            obj3 = Long.valueOf(bxtg.m123144b(bArr3, i9));
                                            break;
                                        case 6:
                                        case 14:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            i9 += 4;
                                            obj3 = Integer.valueOf(bxtg.m123140a(bArr3, i9));
                                            break;
                                        case 7:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            i9 = bxtg.m123143b(bArr3, i9, bxtf2);
                                            if (bxtf2.f164768b == 0) {
                                                z = false;
                                            }
                                            obj3 = Boolean.valueOf(z);
                                            break;
                                        case 8:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            i9 = bxtg.m123146c(bArr3, i9, bxtf2);
                                            obj3 = bxtf2.f164769c;
                                            break;
                                        case 9:
                                            i10 = i29;
                                            i12 = i2;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i9 = bxtg.m123138a(bxxm.f165037a.mo74227a((Class) a3.f164957c.getClass()), bArr, i9, i2, (i67 << 3) | 4, bxtf);
                                            obj3 = bxtf2.f164769c;
                                            break;
                                        case 10:
                                            i9 = bxtg.m123139a(bxxm.f165037a.mo74227a((Class) a3.f164957c.getClass()), bArr, i9, i2, bxtf2);
                                            obj3 = bxtf2.f164769c;
                                            i10 = i29;
                                            i11 = i67;
                                            i12 = i2;
                                            bArr3 = bArr;
                                            break;
                                        case 11:
                                            i9 = bxtg.m123149e(bArr, i9, bxtf2);
                                            obj3 = bxtf2.f164769c;
                                            i10 = i29;
                                            i11 = i67;
                                            i12 = i2;
                                            bArr3 = bArr;
                                            break;
                                        case 13:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 16:
                                            i9 = bxtg.m123141a(bArr, i9, bxtf2);
                                            i10 = i29;
                                            i11 = i67;
                                            obj3 = Integer.valueOf(bxuc.m123422g(bxtf2.f164767a));
                                            i12 = i2;
                                            bArr3 = bArr;
                                            break;
                                        case 17:
                                            i9 = bxtg.m123143b(bArr, i9, bxtf2);
                                            i10 = i29;
                                            i11 = i67;
                                            obj3 = Long.valueOf(bxuc.m123415a(bxtf2.f164768b));
                                            i12 = i2;
                                            bArr3 = bArr;
                                            break;
                                        default:
                                            i10 = i29;
                                            i11 = i67;
                                            bArr3 = bArr;
                                            i12 = i2;
                                            obj3 = null;
                                            break;
                                    }
                                    int ordinal = a3.mo74140b().ordinal();
                                    if ((ordinal == 9 || ordinal == 10) && (b4 = bxux.mo73913b(a3.f164958d)) != null) {
                                        obj3 = bxwd.m124081a(b4, obj3);
                                    }
                                    bxux.mo73908a(a3.f164958d, obj3);
                                    a = i9;
                                } else {
                                    bxtg.m123141a(bArr, i9, bxtf2);
                                    throw null;
                                }
                            }
                            i24 = i12;
                            b7 = b14;
                            obj4 = obj2;
                            i27 = i8;
                            i26 = i11;
                            i28 = i6;
                            i29 = i10;
                            bxxf2 = bxxf;
                            unsafe2 = unsafe;
                            b6 = b;
                            bxtf3 = bxtf2;
                        } else {
                            bArr2 = bArr;
                            i13 = i29;
                            i14 = i7;
                            i15 = i2;
                        }
                    }
                    a = bxtg.m123135a(b14, bArr, i9, i2, m124200c(obj), bxtf);
                    i24 = i12;
                    b7 = b14;
                    obj4 = obj2;
                    i27 = i8;
                    i26 = i11;
                    i28 = i6;
                    i29 = i10;
                    bxxf2 = bxxf;
                    unsafe2 = unsafe;
                    b6 = b;
                    bxtf3 = bxtf2;
                }
            } else {
                unsafe = unsafe2;
                b = b6;
                i3 = i24;
                bxxf = bxxf2;
                obj2 = obj4;
                i4 = i29;
            }
        }
        if (i4 != 1048575) {
            unsafe.putInt(obj2, (long) i4, i28);
        }
        bxyo bxyo = null;
        for (int i68 = bxxf.f165028l; i68 < bxxf.f165029m; i68++) {
            bxyo = (bxyo) bxxf.m124179a(obj2, bxxf.f165027k[i68], bxyo);
        }
        if (bxyo != null) {
            bxyn.m124419a(obj2, (bxyo) ((Object) bxyo));
        }
        if (b != 0) {
            if (i25 > i3 || b7 != b) {
                throw bxwf.m124095h();
            }
        } else if (i25 != i3) {
            throw bxwf.m124095h();
        }
        return i25;
    }

    /* renamed from: a */
    public final Object mo74218a() {
        return ((GeneratedMessageLite) this.f165023g).mo74142c(4);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxxw.b(int, java.util.List, bxul, boolean):void
     arg types: [int, java.util.List, bxul, int]
     candidates:
      bxxw.b(int, java.util.List, bxul, bxxv):void
      bxxw.b(int, java.util.List, bxul, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxxw.a(int, java.util.List, bxul, boolean):void
     arg types: [int, java.util.List, bxul, int]
     candidates:
      bxxw.a(int, java.util.List, bxvr, java.lang.Object):java.lang.Object
      bxxw.a(int, java.util.List, bxul, bxxv):void
      bxxw.a(int, java.util.List, bxul, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0588  */
    /* renamed from: a */
    public final void mo74219a(Object obj, bxul bxul) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i;
        if (this.f165026j) {
            if (this.f165024h) {
                bxux a = bxut.m123748a(obj);
                if (!a.mo73910a()) {
                    it = a.mo73917d();
                    entry = (Map.Entry) it.next();
                    length = this.f165019c.length;
                    for (i = 0; i < length; i += 3) {
                        int e = m124205e(i);
                        int d = m124203d(i);
                        while (entry != null && bxut.m123747a(entry) <= d) {
                            bxut.m123749a(bxul, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        }
                        switch (m124210g(e)) {
                            case 0:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73874a(d, bxyx.m124517e(obj, m124214i(e)));
                                    break;
                                }
                            case 1:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73875a(d, bxyx.m124515d(obj, m124214i(e)));
                                    break;
                                }
                            case 2:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73877a(d, bxyx.m124510b(obj, m124214i(e)));
                                    break;
                                }
                            case 3:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73887c(d, bxyx.m124510b(obj, m124214i(e)));
                                    break;
                                }
                            case 4:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73886c(d, bxyx.m124494a(obj, m124214i(e)));
                                    break;
                                }
                            case 5:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73889d(d, bxyx.m124510b(obj, m124214i(e)));
                                    break;
                                }
                            case 6:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73888d(d, bxyx.m124494a(obj, m124214i(e)));
                                    break;
                                }
                            case 7:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73882a(d, bxyx.m124514c(obj, m124214i(e)));
                                    break;
                                }
                            case 8:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    m124182a(d, bxyx.m124518f(obj, m124214i(e)), bxul);
                                    break;
                                }
                            case 9:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73880a(d, bxyx.m124518f(obj, m124214i(e)), m124178a(i));
                                    break;
                                }
                            case 10:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73878a(d, (ByteString) bxyx.m124518f(obj, m124214i(e)));
                                    break;
                                }
                            case 11:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73890e(d, bxyx.m124494a(obj, m124214i(e)));
                                    break;
                                }
                            case 12:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73883b(d, bxyx.m124494a(obj, m124214i(e)));
                                    break;
                                }
                            case 13:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73876a(d, bxyx.m124494a(obj, m124214i(e)));
                                    break;
                                }
                            case 14:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73884b(d, bxyx.m124510b(obj, m124214i(e)));
                                    break;
                                }
                            case 15:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73892f(d, bxyx.m124494a(obj, m124214i(e)));
                                    break;
                                }
                            case 16:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73891e(d, bxyx.m124510b(obj, m124214i(e)));
                                    break;
                                }
                            case 17:
                                if (!m124186a(obj, i)) {
                                    break;
                                } else {
                                    bxul.mo73885b(d, bxyx.m124518f(obj, m124214i(e)), m124178a(i));
                                    break;
                                }
                            case 18:
                                bxxw.m124351a(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 19:
                                bxxw.m124360b(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 20:
                                bxxw.m124364c(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 21:
                                bxxw.m124368d(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 22:
                                bxxw.m124380h(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 23:
                                bxxw.m124374f(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 24:
                                bxxw.m124388k(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 25:
                                bxxw.m124392n(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 26:
                                bxxw.m124349a(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul);
                                break;
                            case 27:
                                bxxw.m124350a(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, m124178a(i));
                                break;
                            case 28:
                                bxxw.m124358b(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul);
                                break;
                            case 29:
                                bxxw.m124383i(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 30:
                                bxxw.m124391m(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 31:
                                bxxw.m124390l(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 32:
                                bxxw.m124377g(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 33:
                                bxxw.m124386j(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 34:
                                bxxw.m124371e(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, false);
                                break;
                            case 35:
                                bxxw.m124351a(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case 36:
                                bxxw.m124360b(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_NOT_CLOSED:
                                bxxw.m124364c(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                bxxw.m124368d(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_USED_BY_OTHER_APP:
                                bxxw.m124380h(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_PUSH_FAILED:
                                bxxw.m124374f(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case 41:
                                bxxw.m124388k(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_ALREADY_ACTIVATED:
                                bxxw.m124392n(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                bxxw.m124383i(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_RESET_FAILED:
                                bxxw.m124391m(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                bxxw.m124390l(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                                bxxw.m124377g(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case 47:
                                bxxw.m124386j(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case 48:
                                bxxw.m124371e(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, true);
                                break;
                            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                                bxxw.m124359b(m124203d(i), (List) bxyx.m124518f(obj, m124214i(e)), bxul, m124178a(i));
                                break;
                            case 50:
                                m124183a(bxul, d, bxyx.m124518f(obj, m124214i(e)), i);
                                break;
                            case 51:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73874a(d, m124190b(obj, m124214i(e)));
                                    break;
                                }
                            case 52:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73875a(d, m124198c(obj, m124214i(e)));
                                    break;
                                }
                            case 53:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73877a(d, m124206e(obj, m124214i(e)));
                                    break;
                                }
                            case 54:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73887c(d, m124206e(obj, m124214i(e)));
                                    break;
                                }
                            case 55:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73886c(d, m124204d(obj, m124214i(e)));
                                    break;
                                }
                            case FelicaException.TYPE_ACTIVATE_FAILED:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73889d(d, m124206e(obj, m124214i(e)));
                                    break;
                                }
                            case 57:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73888d(d, m124204d(obj, m124214i(e)));
                                    break;
                                }
                            case FelicaException.TYPE_OFFLINE_CANCELED:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73882a(d, m124209f(obj, m124214i(e)));
                                    break;
                                }
                            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    m124182a(d, bxyx.m124518f(obj, m124214i(e)), bxul);
                                    break;
                                }
                            case FelicaException.TYPE_MFC_NOT_FOUND:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73880a(d, bxyx.m124518f(obj, m124214i(e)), m124178a(i));
                                    break;
                                }
                            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73878a(d, (ByteString) bxyx.m124518f(obj, m124214i(e)));
                                    break;
                                }
                            case 62:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73890e(d, m124204d(obj, m124214i(e)));
                                    break;
                                }
                            case 63:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73883b(d, m124204d(obj, m124214i(e)));
                                    break;
                                }
                            case 64:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73876a(d, m124204d(obj, m124214i(e)));
                                    break;
                                }
                            case KeyInformation.AES128_DES56:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73884b(d, m124206e(obj, m124214i(e)));
                                    break;
                                }
                            case 66:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73892f(d, m124204d(obj, m124214i(e)));
                                    break;
                                }
                            case KeyInformation.AES128_DES112:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73891e(d, m124206e(obj, m124214i(e)));
                                    break;
                                }
                            case 68:
                                if (!m124187a(obj, d, i)) {
                                    break;
                                } else {
                                    bxul.mo73885b(d, bxyx.m124518f(obj, m124214i(e)), m124178a(i));
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        bxut.m123749a(bxul, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    m124201c(obj, bxul);
                    return;
                }
            }
            it = null;
            entry = null;
            length = this.f165019c.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            m124201c(obj, bxul);
            return;
        }
        m124195b(obj, bxul);
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0591 A[SYNTHETIC, Splitter:B:127:0x0591] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x06f4 A[LOOP:5: B:204:0x06f0->B:206:0x06f4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0701  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x059b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0007 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo74220a(Object obj, bxxp bxxp, bxus bxus) {
        int i;
        bxvj bxvj;
        Object obj2;
        if (bxus != null) {
            bxyn bxyn = this.f165031o;
            Object obj3 = null;
            bxux bxux = null;
            while (true) {
                try {
                    int a = bxxp.mo73681a();
                    int j = m124215j(a);
                    if (j >= 0) {
                        int e = m124205e(j);
                        try {
                            switch (m124210g(e)) {
                                case 0:
                                    bxyx.m124502a(obj, m124214i(e), bxxp.mo73696d());
                                    m124193b(obj, j);
                                    break;
                                case 1:
                                    bxyx.m124503a(obj, m124214i(e), bxxp.mo73698e());
                                    m124193b(obj, j);
                                    break;
                                case 2:
                                    bxyx.m124505a(obj, m124214i(e), bxxp.mo73702g());
                                    m124193b(obj, j);
                                    break;
                                case 3:
                                    bxyx.m124505a(obj, m124214i(e), bxxp.mo73700f());
                                    m124193b(obj, j);
                                    break;
                                case 4:
                                    bxyx.m124504a(obj, m124214i(e), bxxp.mo73704h());
                                    m124193b(obj, j);
                                    break;
                                case 5:
                                    bxyx.m124505a(obj, m124214i(e), bxxp.mo73706i());
                                    m124193b(obj, j);
                                    break;
                                case 6:
                                    bxyx.m124504a(obj, m124214i(e), bxxp.mo73708j());
                                    m124193b(obj, j);
                                    break;
                                case 7:
                                    bxyx.m124507a(obj, m124214i(e), bxxp.mo73711k());
                                    m124193b(obj, j);
                                    break;
                                case 8:
                                    m124184a(obj, e, bxxp);
                                    m124193b(obj, j);
                                    break;
                                case 9:
                                    if (m124186a(obj, j)) {
                                        bxyx.m124506a(obj, m124214i(e), bxwd.m124081a(bxyx.m124518f(obj, m124214i(e)), bxxp.mo73682a(m124178a(j), bxus)));
                                        break;
                                    } else {
                                        bxyx.m124506a(obj, m124214i(e), bxxp.mo73682a(m124178a(j), bxus));
                                        m124193b(obj, j);
                                        break;
                                    }
                                case 10:
                                    bxyx.m124506a(obj, m124214i(e), bxxp.mo73716n());
                                    m124193b(obj, j);
                                    break;
                                case 11:
                                    bxyx.m124504a(obj, m124214i(e), bxxp.mo73718o());
                                    m124193b(obj, j);
                                    break;
                                case 12:
                                    int p = bxxp.mo73720p();
                                    bxvr c = m124199c(j);
                                    if (c != null) {
                                        if (!c.mo3213a(p)) {
                                            obj3 = bxxw.m124347a(a, p, obj3);
                                            break;
                                        }
                                    }
                                    bxyx.m124504a(obj, m124214i(e), p);
                                    m124193b(obj, j);
                                    break;
                                case 13:
                                    bxyx.m124504a(obj, m124214i(e), bxxp.mo73722q());
                                    m124193b(obj, j);
                                    break;
                                case 14:
                                    bxyx.m124505a(obj, m124214i(e), bxxp.mo73724r());
                                    m124193b(obj, j);
                                    break;
                                case 15:
                                    bxyx.m124504a(obj, m124214i(e), bxxp.mo73725s());
                                    m124193b(obj, j);
                                    break;
                                case 16:
                                    bxyx.m124505a(obj, m124214i(e), bxxp.mo73726t());
                                    m124193b(obj, j);
                                    break;
                                case 17:
                                    if (m124186a(obj, j)) {
                                        bxyx.m124506a(obj, m124214i(e), bxwd.m124081a(bxyx.m124518f(obj, m124214i(e)), bxxp.mo73690b(m124178a(j), bxus)));
                                        break;
                                    } else {
                                        bxyx.m124506a(obj, m124214i(e), bxxp.mo73690b(m124178a(j), bxus));
                                        m124193b(obj, j);
                                        break;
                                    }
                                case 18:
                                    bxxp.mo73685a(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 19:
                                    bxxp.mo73692b(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 20:
                                    bxxp.mo73697d(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 21:
                                    bxxp.mo73694c(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 22:
                                    bxxp.mo73699e(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 23:
                                    bxxp.mo73701f(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 24:
                                    bxxp.mo73703g(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 25:
                                    bxxp.mo73705h(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 26:
                                    if (!m124213h(e)) {
                                        bxxp.mo73707i(this.f165030n.mo74195a(obj, m124214i(e)));
                                        break;
                                    } else {
                                        bxxp.mo73709j(this.f165030n.mo74195a(obj, m124214i(e)));
                                        break;
                                    }
                                case 27:
                                    bxxp.mo73686a(this.f165030n.mo74195a(obj, m124214i(e)), m124178a(j), bxus);
                                    break;
                                case 28:
                                    bxxp.mo73710k(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 29:
                                    bxxp.mo73713l(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 30:
                                    List a2 = this.f165030n.mo74195a(obj, m124214i(e));
                                    bxxp.mo73715m(a2);
                                    obj3 = bxxw.m124348a(a, a2, m124199c(j), obj3);
                                    break;
                                case 31:
                                    bxxp.mo73717n(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 32:
                                    bxxp.mo73719o(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 33:
                                    bxxp.mo73721p(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 34:
                                    bxxp.mo73723q(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 35:
                                    bxxp.mo73685a(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 36:
                                    bxxp.mo73692b(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_NOT_CLOSED:
                                    bxxp.mo73697d(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                    bxxp.mo73694c(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_USED_BY_OTHER_APP:
                                    bxxp.mo73699e(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_PUSH_FAILED:
                                    bxxp.mo73701f(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 41:
                                    bxxp.mo73703g(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_ALREADY_ACTIVATED:
                                    bxxp.mo73705h(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                    bxxp.mo73713l(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_RESET_FAILED:
                                    List a3 = this.f165030n.mo74195a(obj, m124214i(e));
                                    bxxp.mo73715m(a3);
                                    obj3 = bxxw.m124348a(a, a3, m124199c(j), obj3);
                                    break;
                                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                    bxxp.mo73717n(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                                    bxxp.mo73719o(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 47:
                                    bxxp.mo73721p(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case 48:
                                    bxxp.mo73723q(this.f165030n.mo74195a(obj, m124214i(e)));
                                    break;
                                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                                    bxxp.mo73693b(this.f165030n.mo74195a(obj, m124214i(e)), m124178a(j), bxus);
                                    break;
                                case 50:
                                    Object b = m124192b(j);
                                    long i2 = m124214i(m124205e(j));
                                    Object f = bxyx.m124518f(obj, i2);
                                    if (f == null) {
                                        f = bxwx.m124142a();
                                        bxyx.m124506a(obj, i2, f);
                                    } else if (bxwx.m124144b(f)) {
                                        Object a4 = bxwx.m124142a();
                                        bxwx.m124143a(a4, f);
                                        bxyx.m124506a(obj, i2, a4);
                                        f = a4;
                                    }
                                    bxxp.mo73688a((bxww) f, bxwx.m124141a(b), bxus);
                                    break;
                                case 51:
                                    bxyx.m124506a(obj, m124214i(e), Double.valueOf(bxxp.mo73696d()));
                                    m124194b(obj, a, j);
                                    break;
                                case 52:
                                    bxyx.m124506a(obj, m124214i(e), Float.valueOf(bxxp.mo73698e()));
                                    m124194b(obj, a, j);
                                    break;
                                case 53:
                                    bxyx.m124506a(obj, m124214i(e), Long.valueOf(bxxp.mo73702g()));
                                    m124194b(obj, a, j);
                                    break;
                                case 54:
                                    bxyx.m124506a(obj, m124214i(e), Long.valueOf(bxxp.mo73700f()));
                                    m124194b(obj, a, j);
                                    break;
                                case 55:
                                    bxyx.m124506a(obj, m124214i(e), Integer.valueOf(bxxp.mo73704h()));
                                    m124194b(obj, a, j);
                                    break;
                                case FelicaException.TYPE_ACTIVATE_FAILED:
                                    bxyx.m124506a(obj, m124214i(e), Long.valueOf(bxxp.mo73706i()));
                                    m124194b(obj, a, j);
                                    break;
                                case 57:
                                    bxyx.m124506a(obj, m124214i(e), Integer.valueOf(bxxp.mo73708j()));
                                    m124194b(obj, a, j);
                                    break;
                                case FelicaException.TYPE_OFFLINE_CANCELED:
                                    bxyx.m124506a(obj, m124214i(e), Boolean.valueOf(bxxp.mo73711k()));
                                    m124194b(obj, a, j);
                                    break;
                                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                                    m124184a(obj, e, bxxp);
                                    m124194b(obj, a, j);
                                    break;
                                case FelicaException.TYPE_MFC_NOT_FOUND:
                                    if (!m124187a(obj, a, j)) {
                                        bxyx.m124506a(obj, m124214i(e), bxxp.mo73682a(m124178a(j), bxus));
                                        m124193b(obj, j);
                                    } else {
                                        bxyx.m124506a(obj, m124214i(e), bxwd.m124081a(bxyx.m124518f(obj, m124214i(e)), bxxp.mo73682a(m124178a(j), bxus)));
                                    }
                                    m124194b(obj, a, j);
                                    break;
                                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                                    bxyx.m124506a(obj, m124214i(e), bxxp.mo73716n());
                                    m124194b(obj, a, j);
                                    break;
                                case 62:
                                    bxyx.m124506a(obj, m124214i(e), Integer.valueOf(bxxp.mo73718o()));
                                    m124194b(obj, a, j);
                                    break;
                                case 63:
                                    int p2 = bxxp.mo73720p();
                                    bxvr c2 = m124199c(j);
                                    if (c2 != null) {
                                        if (!c2.mo3213a(p2)) {
                                            obj3 = bxxw.m124347a(a, p2, obj3);
                                            break;
                                        }
                                    }
                                    bxyx.m124506a(obj, m124214i(e), Integer.valueOf(p2));
                                    m124194b(obj, a, j);
                                    break;
                                case 64:
                                    bxyx.m124506a(obj, m124214i(e), Integer.valueOf(bxxp.mo73722q()));
                                    m124194b(obj, a, j);
                                    break;
                                case KeyInformation.AES128_DES56:
                                    bxyx.m124506a(obj, m124214i(e), Long.valueOf(bxxp.mo73724r()));
                                    m124194b(obj, a, j);
                                    break;
                                case 66:
                                    bxyx.m124506a(obj, m124214i(e), Integer.valueOf(bxxp.mo73725s()));
                                    m124194b(obj, a, j);
                                    break;
                                case KeyInformation.AES128_DES112:
                                    bxyx.m124506a(obj, m124214i(e), Long.valueOf(bxxp.mo73726t()));
                                    m124194b(obj, a, j);
                                    break;
                                case 68:
                                    bxyx.m124506a(obj, m124214i(e), bxxp.mo73690b(m124178a(j), bxus));
                                    m124194b(obj, a, j);
                                    break;
                                default:
                                    if (obj3 == null) {
                                        obj3 = bxyo.m124424a();
                                    }
                                    try {
                                        if (bxyn.mo74282a(obj3, bxxp)) {
                                            break;
                                        } else {
                                            for (int i3 = this.f165028l; i3 < this.f165029m; i3++) {
                                                obj3 = m124179a(obj, this.f165027k[i3], obj3);
                                            }
                                            if (obj3 == null) {
                                                return;
                                            }
                                        }
                                    } catch (bxwe e2) {
                                        if (obj3 == null) {
                                        }
                                        if (bxyn.mo74282a(obj3, bxxp)) {
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        while (i < this.f165029m) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (bxwe e3) {
                            if (obj3 == null) {
                                try {
                                    obj3 = bxyn.m124421b(obj);
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (i < this.f165029m) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (bxyn.mo74282a(obj3, bxxp)) {
                                for (int i4 = this.f165028l; i4 < this.f165029m; i4++) {
                                    obj3 = m124179a(obj, this.f165027k[i4], obj3);
                                }
                                if (obj3 == null) {
                                    return;
                                }
                                bxyn.m124419a(obj, (bxyo) obj3);
                                return;
                            }
                        }
                    } else if (a == Integer.MAX_VALUE) {
                        for (int i5 = this.f165028l; i5 < this.f165029m; i5++) {
                            obj3 = m124179a(obj, this.f165027k[i5], obj3);
                        }
                        if (obj3 == null) {
                            return;
                        }
                    } else {
                        if (this.f165024h) {
                            bxvj = bxus.mo73903a(this.f165023g, a);
                        } else {
                            bxvj = null;
                        }
                        if (bxvj != null) {
                            if (bxux == null) {
                                bxux = bxut.m123751b(obj);
                            }
                            bxvj.mo73900a();
                            bxvi bxvi = bxvj.f164958d;
                            if (bxvj.mo74140b() != bxzf.ENUM) {
                                switch (bxvj.mo74140b().ordinal()) {
                                    case 0:
                                        obj2 = Double.valueOf(bxxp.mo73696d());
                                        break;
                                    case 1:
                                        obj2 = Float.valueOf(bxxp.mo73698e());
                                        break;
                                    case 2:
                                        obj2 = Long.valueOf(bxxp.mo73702g());
                                        break;
                                    case 3:
                                        obj2 = Long.valueOf(bxxp.mo73700f());
                                        break;
                                    case 4:
                                        obj2 = Integer.valueOf(bxxp.mo73704h());
                                        break;
                                    case 5:
                                        obj2 = Long.valueOf(bxxp.mo73706i());
                                        break;
                                    case 6:
                                        obj2 = Integer.valueOf(bxxp.mo73708j());
                                        break;
                                    case 7:
                                        obj2 = Boolean.valueOf(bxxp.mo73711k());
                                        break;
                                    case 8:
                                        obj2 = bxxp.mo73712l();
                                        break;
                                    case 9:
                                        obj2 = bxxp.mo73691b(bxvj.f164957c.getClass(), bxus);
                                        break;
                                    case 10:
                                        obj2 = bxxp.mo73683a(bxvj.f164957c.getClass(), bxus);
                                        break;
                                    case 11:
                                        obj2 = bxxp.mo73716n();
                                        break;
                                    case 12:
                                        obj2 = Integer.valueOf(bxxp.mo73718o());
                                        break;
                                    case 13:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case 14:
                                        obj2 = Integer.valueOf(bxxp.mo73722q());
                                        break;
                                    case 15:
                                        obj2 = Long.valueOf(bxxp.mo73724r());
                                        break;
                                    case 16:
                                        obj2 = Integer.valueOf(bxxp.mo73725s());
                                        break;
                                    case 17:
                                        obj2 = Long.valueOf(bxxp.mo73726t());
                                        break;
                                    default:
                                        obj2 = null;
                                        break;
                                }
                                int ordinal = bxvj.mo74140b().ordinal();
                                if (ordinal == 9 || ordinal == 10) {
                                    Object b2 = bxux.mo73913b(bxvj.f164958d);
                                    if (b2 != null) {
                                        obj2 = bxwd.m124081a(b2, obj2);
                                    }
                                }
                                bxux.mo73908a(bxvj.f164958d, obj2);
                            } else {
                                bxxp.mo73704h();
                                bxvi bxvi2 = bxvj.f164958d;
                                throw null;
                            }
                        } else {
                            if (obj3 == null) {
                                obj3 = bxyn.m124421b(obj);
                            }
                            try {
                                if (!bxyn.mo74282a(obj3, bxxp)) {
                                    for (int i6 = this.f165028l; i6 < this.f165029m; i6++) {
                                        obj3 = m124179a(obj, this.f165027k[i6], obj3);
                                    }
                                    if (obj3 == null) {
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                for (i = this.f165028l; i < this.f165029m; i++) {
                                    obj3 = m124179a(obj, this.f165027k[i], obj3);
                                }
                                if (obj3 != null) {
                                    bxyn.m124419a(obj, (bxyo) obj3);
                                }
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    while (i < this.f165029m) {
                    }
                    if (obj3 != null) {
                    }
                    throw th;
                }
            }
            bxyn.m124419a(obj, (bxyo) obj3);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo74221a(Object obj, byte[] bArr, int i, int i2, bxtf bxtf) {
        if (!this.f165026j) {
            mo74217a(obj, bArr, i, i2, 0, bxtf);
        } else {
            m124197b(obj, bArr, i, i2, bxtf);
        }
    }

    /* renamed from: a */
    public final boolean mo74222a(Object obj, Object obj2) {
        boolean z;
        int length = this.f165019c.length;
        for (int i = 0; i < length; i += 3) {
            int e = m124205e(i);
            long i2 = m124214i(e);
            switch (m124210g(e)) {
                case 0:
                    if (m124202c(obj, obj2, i) && Double.doubleToLongBits(bxyx.m124517e(obj, i2)) == Double.doubleToLongBits(bxyx.m124517e(obj2, i2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m124202c(obj, obj2, i) && Float.floatToIntBits(bxyx.m124515d(obj, i2)) == Float.floatToIntBits(bxyx.m124515d(obj2, i2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m124202c(obj, obj2, i) && bxyx.m124510b(obj, i2) == bxyx.m124510b(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m124202c(obj, obj2, i) && bxyx.m124510b(obj, i2) == bxyx.m124510b(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m124202c(obj, obj2, i) && bxyx.m124494a(obj, i2) == bxyx.m124494a(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m124202c(obj, obj2, i) && bxyx.m124510b(obj, i2) == bxyx.m124510b(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m124202c(obj, obj2, i) && bxyx.m124494a(obj, i2) == bxyx.m124494a(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m124202c(obj, obj2, i) && bxyx.m124514c(obj, i2) == bxyx.m124514c(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m124202c(obj, obj2, i) && bxxw.m124354a(bxyx.m124518f(obj, i2), bxyx.m124518f(obj2, i2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m124202c(obj, obj2, i) && bxxw.m124354a(bxyx.m124518f(obj, i2), bxyx.m124518f(obj2, i2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m124202c(obj, obj2, i) && bxxw.m124354a(bxyx.m124518f(obj, i2), bxyx.m124518f(obj2, i2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m124202c(obj, obj2, i) && bxyx.m124494a(obj, i2) == bxyx.m124494a(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m124202c(obj, obj2, i) && bxyx.m124494a(obj, i2) == bxyx.m124494a(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m124202c(obj, obj2, i) && bxyx.m124494a(obj, i2) == bxyx.m124494a(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m124202c(obj, obj2, i) && bxyx.m124510b(obj, i2) == bxyx.m124510b(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m124202c(obj, obj2, i) && bxyx.m124494a(obj, i2) == bxyx.m124494a(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m124202c(obj, obj2, i) && bxyx.m124510b(obj, i2) == bxyx.m124510b(obj2, i2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m124202c(obj, obj2, i) && bxxw.m124354a(bxyx.m124518f(obj, i2), bxyx.m124518f(obj2, i2))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FelicaException.TYPE_NOT_CLOSED:
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                case FelicaException.TYPE_PUSH_FAILED:
                case 41:
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                case FelicaException.TYPE_RESET_FAILED:
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                case 47:
                case 48:
                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                    z = bxxw.m124354a(bxyx.m124518f(obj, i2), bxyx.m124518f(obj2, i2));
                    break;
                case 50:
                    z = bxxw.m124354a(bxyx.m124518f(obj, i2), bxyx.m124518f(obj2, i2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case FelicaException.TYPE_ACTIVATE_FAILED:
                case 57:
                case FelicaException.TYPE_OFFLINE_CANCELED:
                case FelicaException.TYPE_NOW_EXECUTING_FALP:
                case FelicaException.TYPE_MFC_NOT_FOUND:
                case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                case 62:
                case 63:
                case 64:
                case KeyInformation.AES128_DES56:
                case 66:
                case KeyInformation.AES128_DES112:
                case 68:
                    long f = (long) (m124207f(i) & 1048575);
                    if (bxyx.m124494a(obj, f) == bxyx.m124494a(obj2, f) && bxxw.m124354a(bxyx.m124518f(obj, i2), bxyx.m124518f(obj2, i2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!bxyn.m124416a(obj).equals(bxyn.m124416a(obj2))) {
            return false;
        }
        if (this.f165024h) {
            return bxut.m123748a(obj).equals(bxut.m123748a(obj2));
        }
        return true;
    }
}
