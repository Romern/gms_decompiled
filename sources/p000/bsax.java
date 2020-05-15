package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Vector;

/* renamed from: bsax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsax {

    /* renamed from: a */
    public static final byte[] f143913a = new byte[0];

    /* renamed from: b */
    public final bsaz f143914b;

    /* renamed from: c */
    private final bsbh f143915c;

    /* renamed from: d */
    private bsbh f143916d;

    static {
        new bsaw();
    }

    public bsax(bsaz bsaz) {
        int i;
        this.f143914b = bsaz;
        if (bsaz != null) {
            int i2 = bsaz.f143920a.f143939c;
            if (i2 > 0) {
                i = i2 + 1;
            } else {
                i = 128;
            }
            this.f143915c = new bsbh(i);
            return;
        }
        this.f143915c = new bsbh();
    }

    /* renamed from: a */
    private static int m114968a(long j) {
        if (j < 0) {
            return 10;
        }
        int i = 1;
        while (j >= 128) {
            i++;
            j >>= 7;
        }
        return i;
    }

    /* renamed from: b */
    private static int m114977b(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: b */
    private static long m114978b(long j) {
        return (-(j >>> 63)) ^ (j + j);
    }

    /* renamed from: c */
    private final void m114979c(int i, Object obj) {
        bsaz bsaz;
        int g = mo70133g(i);
        if (g != 16 || this.f143914b != null) {
            if (!(obj instanceof Boolean)) {
                if (!(obj instanceof Long)) {
                    if (!(obj instanceof byte[])) {
                        if (obj instanceof bsax) {
                            if (!(g == 2 || g == 3)) {
                                switch (g) {
                                }
                            }
                            bsaz bsaz2 = this.f143914b;
                            if (bsaz2 == null || bsaz2.mo70147b(i) == null || (bsaz = ((bsax) obj).f143914b) == null || bsaz.equals(this.f143914b.mo70147b(i))) {
                                return;
                            }
                        } else if ((obj instanceof String) && (g == 2 || g == 25 || g == 28 || g == 36)) {
                            return;
                        }
                    } else if (g == 2 || g == 25 || g == 27 || g == 28 || g == 35 || g == 36) {
                        return;
                    }
                } else if (g != 0 && g != 1 && g != 5) {
                    switch (g) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            return;
                        default:
                            switch (g) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                    return;
                            }
                    }
                } else {
                    return;
                }
            } else if (g == 24 || g == 0) {
                return;
            }
            String valueOf = String.valueOf(this.f143914b);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
            sb.append("Type mismatch type:");
            sb.append(valueOf);
            sb.append(" tag:");
            sb.append(i);
            sb.append(" tagType: ");
            sb.append(g);
            sb.append(" object: ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: h */
    private final Object m114980h(int i, int i2) {
        m114983n(i);
        Object a = this.f143915c.mo70166a(i);
        int a2 = m114971a(a);
        if (a2 == 0) {
            return m114982m(i);
        }
        if (a2 <= 1) {
            return m114974a(i, 0, i2, a);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    private final boolean m114981l(int i) {
        int g = mo70133g(i);
        return g == 33 || g == 34;
    }

    /* renamed from: m */
    private final Object m114982m(int i) {
        bsaz bsaz;
        int g = mo70133g(i);
        if (g == 16 || g == 26 || g == 27 || (bsaz = this.f143914b) == null) {
            return null;
        }
        return bsaz.mo70147b(i);
    }

    /* renamed from: n */
    private static void m114983n(int i) {
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    /* renamed from: o */
    private final int m114984o(int i) {
        int g = mo70133g(i);
        if (!(g == 0 || g == 1 || g == 2 || g == 3 || g == 5)) {
            switch (g) {
                case 16:
                    break;
                case 17:
                case 22:
                case 32:
                    return 1;
                case 18:
                case 23:
                case 31:
                    return 5;
                case 19:
                case 20:
                case 21:
                case 24:
                case 29:
                case 30:
                case 33:
                case 34:
                    return 0;
                case 25:
                case 27:
                case 28:
                case 35:
                case 36:
                    return 2;
                case 26:
                    return 3;
                default:
                    String valueOf = String.valueOf(this.f143914b);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Unsupp.Type:");
                    sb.append(valueOf);
                    sb.append('/');
                    sb.append(i);
                    sb.append('/');
                    sb.append(g);
                    throw new RuntimeException(sb.toString());
            }
        }
        return g;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            bsax bsax = new bsax(this.f143914b);
            bsax.mo70111a(mo70120b());
            return bsax;
        } catch (IOException e) {
            throw new RuntimeException("Could not serialize and parse ProtoBuf.");
        }
    }

    /* renamed from: d */
    public final float mo70126d(int i) {
        return Float.intBitsToFloat(mo70114b(i));
    }

    /* renamed from: e */
    public final float mo70128e(int i, int i2) {
        return Float.intBitsToFloat(mo70123c(i, i2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsax) {
            bsax bsax = (bsax) obj;
            return m114976a(this.f143914b, bsax.f143914b) && m114976a(this.f143915c, bsax.f143915c) && m114976a(this.f143916d, bsax.f143916d);
        }
    }

    /* renamed from: f */
    public final bsax mo70131f(int i, int i2) {
        return (bsax) m114973a(i, i2, 26);
    }

    /* renamed from: g */
    public final int mo70133g(int i) {
        int i2;
        Integer num;
        bsaz bsaz = this.f143914b;
        if (bsaz != null) {
            i2 = bsaz.mo70144a(i);
        } else {
            i2 = 16;
        }
        if (i2 == 16) {
            bsbh bsbh = this.f143916d;
            if (bsbh != null) {
                num = (Integer) bsbh.mo70166a(i);
            } else {
                num = null;
            }
            if (num != null) {
                i2 = num.intValue();
            }
        }
        if (i2 != 16 || mo70138j(i) <= 0) {
            return i2;
        }
        Object a = m114973a(i, 0, 16);
        return ((a instanceof Long) || (a instanceof Boolean)) ? 0 : 2;
    }

    public final int hashCode() {
        return ((((m114977b(this.f143914b) + 31) * 31) + m114977b(this.f143915c)) * 31) + m114977b(this.f143916d);
    }

    /* renamed from: i */
    public final boolean mo70137i(int i) {
        return mo70135h(i) || m114982m(i) != null;
    }

    /* renamed from: j */
    public final int mo70138j(int i) {
        if (i >= 0) {
            return m114971a(this.f143915c.mo70166a(i));
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    /* renamed from: k */
    public final void mo70139k(int i) {
        int j = mo70138j(i);
        if (j <= 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (j != 1) {
            ((Vector) this.f143915c.mo70166a(i)).removeElementAt(0);
        } else {
            this.f143915c.mo70169b(i);
        }
    }

    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            m114975a(stringWriter, 0);
        } catch (IOException e) {
            stringWriter.write(e.toString());
        }
        return stringWriter.toString();
    }

    /* renamed from: a */
    private final int m114969a(bsau bsau) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        bsau bsau2 = bsau;
        bsbg a = this.f143915c.mo70165a();
        int i5 = 0;
        while (a.mo70163a()) {
            int b = a.mo70164b();
            int j = mo70138j(b);
            int o = m114984o(b);
            int i6 = b << 3;
            int i7 = i6 | o;
            int i8 = 0;
            int i9 = 0;
            while (i8 < j) {
                i9 += m114970a(bsau2, (long) i7);
                int i10 = bsau2.f143904b;
                if (o != 0) {
                    if (o != 1) {
                        if (o == 2) {
                            if (mo70133g(b) == 27) {
                                i4 = 16;
                            } else {
                                i4 = 25;
                            }
                            Object a2 = m114973a(b, i8, i4);
                            if (a2 instanceof byte[]) {
                                byte[] bArr = (byte[]) a2;
                                m114970a(bsau2, (long) bArr.length);
                                bsau2.write(bArr);
                                i2 = j;
                                i = o;
                                z = false;
                            } else {
                                bsau2.mo70097b(bsau2.f143904b);
                                int i11 = bsau2.f143905c;
                                bsau2.mo70097b(-1);
                                int a3 = ((bsax) a2).m114969a(bsau2);
                                bsau2.f143903a[i11] = a3;
                                i9 += m114968a((long) a3) + a3;
                                i2 = j;
                                i = o;
                                z = true;
                            }
                        } else if (o == 3) {
                            i9 = i9 + ((bsax) m114973a(b, i8, 26)).m114969a(bsau2) + m114970a(bsau2, (long) (i6 | 4));
                            i2 = j;
                            i = o;
                            z = true;
                        } else if (o != 5) {
                            throw new IllegalArgumentException();
                        }
                    }
                    long longValue = ((Long) m114973a(b, i8, 19)).longValue();
                    if (o == 5) {
                        i3 = 4;
                    } else {
                        i3 = 8;
                    }
                    int i12 = 0;
                    while (i12 < i3) {
                        bsau2.write((int) (longValue & 255));
                        longValue >>= 8;
                        i12++;
                        j = j;
                        o = o;
                    }
                    i2 = j;
                    i = o;
                    z = false;
                } else {
                    i2 = j;
                    i = o;
                    long longValue2 = ((Long) m114973a(b, i8, 19)).longValue();
                    if (m114981l(b)) {
                        longValue2 = m114978b(longValue2);
                    }
                    m114970a(bsau2, longValue2);
                    z = false;
                }
                if (!z) {
                    i9 += bsau2.f143904b - i10;
                }
                i8++;
                j = i2;
                o = i;
            }
            i5 += i9;
        }
        return i5;
    }

    /* renamed from: d */
    public final long mo70127d(int i, int i2) {
        return ((Long) m114973a(i, i2, 19)).longValue();
    }

    /* renamed from: e */
    public final bsax mo70129e(int i) {
        return (bsax) m114980h(i, 26);
    }

    /* renamed from: f */
    public final String mo70132f(int i) {
        return (String) m114980h(i, 28);
    }

    /* renamed from: b */
    public final int mo70114b(int i) {
        return (int) ((Long) m114980h(i, 21)).longValue();
    }

    public bsax(bsaz bsaz, int i) {
        this.f143914b = bsaz;
        this.f143915c = new bsbh(i + 1);
    }

    /* renamed from: b */
    public final void mo70115b(int i, double d) {
        mo70117b(i, Double.doubleToLongBits(d));
    }

    /* renamed from: b */
    public final void mo70116b(int i, float f) {
        mo70134g(i, Float.floatToIntBits(f));
    }

    /* renamed from: h */
    public final boolean mo70135h(int i) {
        return mo70138j(i) > 0;
    }

    /* renamed from: b */
    public final void mo70117b(int i, long j) {
        mo70118b(i, Long.valueOf(j));
    }

    /* renamed from: g */
    public final void mo70134g(int i, int i2) {
        mo70117b(i, (long) i2);
    }

    /* renamed from: b */
    public final void mo70118b(int i, Object obj) {
        if (i >= 0) {
            if (obj != null) {
                m114979c(i, obj);
            }
            this.f143915c.mo70167a(i, obj);
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final void mo70119b(int i, boolean z) {
        mo70118b(i, !z ? Boolean.FALSE : Boolean.TRUE);
    }

    /* renamed from: c */
    public final int mo70122c() {
        int i;
        bsbg a = this.f143915c.mo70165a();
        int i2 = 0;
        while (a.mo70163a()) {
            int b = a.mo70164b();
            int j = mo70138j(b);
            for (int i3 = 0; i3 < j; i3++) {
                int a2 = m114968a((long) (b << 3));
                int o = m114984o(b);
                if (o == 0) {
                    long d = mo70127d(b, i3);
                    if (m114981l(b)) {
                        d = m114978b(d);
                    }
                    i = a2 + m114968a(d);
                } else if (o == 1) {
                    i = a2 + 8;
                } else if (o == 3) {
                    i = a2 + mo70131f(b, i3).mo70122c() + a2;
                } else if (o != 5) {
                    Object a3 = m114973a(b, i3, 16);
                    int length = a3 instanceof byte[] ? ((byte[]) a3).length : a3 instanceof String ? ((String) a3).getBytes(Charset.forName("UTF-8")).length : ((bsax) a3).mo70122c();
                    i = a2 + m114968a((long) length) + length;
                } else {
                    i = a2 + 4;
                }
                i2 += i;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final byte[] mo70120b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo70110a((OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    public final byte[] mo70121b(int i, int i2) {
        return (byte[]) m114973a(i, i2, 25);
    }

    /* renamed from: a */
    static int m114970a(OutputStream outputStream, long j) {
        int i = 0;
        while (i < 10) {
            int i2 = (int) (127 & j);
            j >>>= 7;
            if (j != 0) {
                outputStream.write(i2 | 128);
                i++;
            } else {
                outputStream.write(i2);
                return i + 1;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final int mo70123c(int i, int i2) {
        return (int) ((Long) m114973a(i, i2, 21)).longValue();
    }

    /* renamed from: a */
    private static int m114971a(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (!(obj instanceof Vector)) {
            return 1;
        }
        return ((Vector) obj).size();
    }

    /* renamed from: c */
    public final long mo70124c(int i) {
        return ((Long) m114980h(i, 19)).longValue();
    }

    /* renamed from: a */
    private static long m114972a(InputStream inputStream, boolean z, bsaw bsaw) {
        int i = 0;
        bsaw.f143912a = 0;
        long j = 0;
        int i2 = 0;
        while (i < 10) {
            int read = inputStream.read();
            if (read != -1) {
                j |= ((long) (read & 127)) << i2;
                if ((read & 128) == 0) {
                    break;
                }
                i2 += 7;
                i++;
            } else if (i == 0 && z) {
                return -1;
            } else {
                throw new IOException("EOF");
            }
        }
        bsaw.f143912a = i + 1;
        return j;
    }

    /* renamed from: a */
    private final Object m114973a(int i, int i2, int i3) {
        m114983n(i);
        Object a = this.f143915c.mo70166a(i);
        if (i2 < m114971a(a)) {
            return m114974a(i, i2, i3, a);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00da  */
    /* renamed from: a */
    private final Object m114974a(int i, int i2, int i3, Object obj) {
        Vector vector;
        String str;
        long j;
        bsax bsax;
        if (obj instanceof Vector) {
            Vector vector2 = (Vector) obj;
            vector = vector2;
            obj = vector2.elementAt(i2);
        } else {
            vector = null;
        }
        if (i3 != 16) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        str = Long.valueOf(j);
                        break;
                    }
                    break;
                case 24:
                    if (!(obj instanceof Boolean)) {
                        int longValue = (int) ((Long) obj).longValue();
                        if (longValue == 0) {
                            str = Boolean.FALSE;
                            break;
                        } else if (longValue == 1) {
                            str = Boolean.TRUE;
                            break;
                        } else {
                            throw new IllegalArgumentException("Type mismatch");
                        }
                    }
                    break;
                case 25:
                case 35:
                    if (obj instanceof String) {
                        str = ((String) obj).getBytes(Charset.forName("UTF-8"));
                        break;
                    } else if (obj instanceof bsax) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ((bsax) obj).mo70110a((OutputStream) byteArrayOutputStream);
                            str = byteArrayOutputStream.toByteArray();
                            break;
                        } catch (IOException e) {
                            throw new RuntimeException(e.toString());
                        }
                    }
                    break;
                case 26:
                case 27:
                    if (obj instanceof byte[]) {
                        if (i > 0) {
                            try {
                                bsaz bsaz = this.f143914b;
                                if (bsaz != null) {
                                    bsax = new bsax((bsaz) bsaz.mo70147b(i));
                                    bsax.mo70111a((byte[]) obj);
                                    str = bsax;
                                    break;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2.toString());
                            }
                        }
                        bsax = new bsax(null);
                        bsax.mo70111a((byte[]) obj);
                        str = bsax;
                    }
                    break;
                case 28:
                case 36:
                    if (obj instanceof byte[]) {
                        str = new String((byte[]) obj, Charset.forName("UTF-8"));
                        break;
                    }
                    break;
                default:
                    throw new RuntimeException("Unsupp.Type");
            }
            if (!(str == obj || obj == null)) {
                if (vector != null) {
                    mo70118b(i, str);
                } else {
                    vector.setElementAt(str, i2);
                }
            }
            return str;
        }
        str = obj;
        if (vector != null) {
        }
        return str;
    }

    /* renamed from: a */
    private final void m114975a(Writer writer, int i) {
        int i2 = i + i;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        String sb2 = sb.toString();
        for (int i4 = 0; i4 <= this.f143915c.f143940d; i4++) {
            for (int i5 = 0; i5 < mo70138j(i4); i5++) {
                writer.append((CharSequence) sb2).append((CharSequence) Integer.toString(i4));
                int g = mo70133g(i4);
                if (g == 26) {
                    writer.append(' ');
                } else {
                    writer.append(':');
                }
                switch (g) {
                    case 17:
                        writer.append((CharSequence) Double.toString(Double.longBitsToDouble(mo70127d(i4, i5))));
                        break;
                    case 18:
                        writer.append((CharSequence) Float.toString(mo70128e(i4, i5)));
                        break;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 36:
                        writer.append((CharSequence) m114973a(i4, i5, g).toString());
                        break;
                    case 25:
                    case 35:
                        int length = mo70121b(i4, i5).length;
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("<Byte array length:");
                        sb3.append(length);
                        sb3.append(">");
                        writer.append((CharSequence) sb3.toString());
                        break;
                    case 26:
                    case 27:
                        writer.append((CharSequence) "{\n");
                        mo70131f(i4, i5).m114975a(writer, i + 1);
                        writer.append((CharSequence) sb2).append('}');
                        break;
                    default:
                        writer.append((CharSequence) "UNSUPPORTED TYPE: ").append((CharSequence) Integer.toString(g));
                        break;
                }
                writer.append(10);
            }
        }
    }

    /* renamed from: a */
    private static boolean m114976a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:76:0x00f9 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:78:0x00f9 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:79:0x00f9 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:77:0x00f9 */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Long], assign insn: 0x00f5: INVOKE  (r2v7 ? I:java.lang.Long) = (r4v5 long) type: STATIC call: java.lang.Long.valueOf(long):java.lang.Long */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Long], assign insn: 0x00d9: INVOKE  (r2v11 ? I:java.lang.Long) = (r6v4 long) type: STATIC call: java.lang.Long.valueOf(long):java.lang.Long */
    /* JADX WARN: Type inference failed for: r2v14, types: [byte[]], assign insn: PHI: (r2v14 ?) = (r2v26 ?), (r2v27 ?) binds: [B:39:0x00a8, B:38:0x00a5] */
    /* JADX WARN: Type inference failed for: r2v17, types: [bsax], assign insn: 0x0092: CONSTRUCTOR  (r2v17 ? I:bsax) = (r13v9 bsaz) call: bsax.<init>(bsaz):void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r2v26, assign insn: ?: MOVE  (r2v26 ?) = (r2v15 byte[]) */
    /* JADX WARN: Type inference failed for: r2v27, assign insn: ?: MOVE  (r2v27 ?) = (r2v16 byte[]) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bsax.a(java.io.InputStream, boolean, bsaw):long
     arg types: [java.io.InputStream, int, bsaw]
     candidates:
      bsax.a(int, int, int):java.lang.Object
      bsax.a(java.io.InputStream, boolean, bsaw):long */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final int mo70102a(InputStream inputStream, int i, boolean z, bsaw bsaw) {
        int i2;
        ? r2;
        bsaz bsaz;
        if (z) {
            bsbh bsbh = this.f143915c;
            int i3 = 0;
            while (true) {
                Object[] objArr = bsbh.f143937a;
                if (i3 >= objArr.length) {
                    break;
                }
                objArr[i3] = null;
                i3++;
            }
            HashMap hashMap = bsbh.f143938b;
            if (hashMap != null) {
                hashMap.clear();
            }
            bsbh.f143940d = Integer.MIN_VALUE;
            bsbh.f143939c = Integer.MIN_VALUE;
            bsbh.f143941e = 0;
            this.f143916d = null;
        }
        while (true) {
            i2 = 1;
            if (i <= 0) {
                break;
            }
            long a = m114972a(inputStream, true, bsaw);
            if (a == -1) {
                break;
            }
            i -= bsaw.f143912a;
            int i4 = ((int) a) & 7;
            int i5 = 4;
            if (i4 == 4) {
                break;
            }
            int i6 = (int) (a >>> 3);
            if (mo70133g(i6) == 16) {
                if (this.f143916d == null) {
                    this.f143916d = new bsbh();
                }
                this.f143916d.mo70167a(i6, Integer.valueOf(i4));
            }
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        int a2 = (int) m114972a(inputStream, false, bsaw);
                        i = (i - bsaw.f143912a) - a2;
                        if (a2 != 0) {
                            r2 = new byte[a2];
                        } else {
                            r2 = f143913a;
                        }
                        int i7 = 0;
                        while (i7 < a2) {
                            int read = inputStream.read(r2, i7, a2 - i7);
                            if (read > 0) {
                                i7 += read;
                            } else {
                                throw new IOException("Unexp.EOF");
                            }
                        }
                        continue;
                    } else if (i4 == 3) {
                        bsaz bsaz2 = this.f143914b;
                        if (bsaz2 != null) {
                            bsaz = (bsaz) bsaz2.mo70147b(i6);
                        } else {
                            bsaz = null;
                        }
                        r2 = new bsax(bsaz);
                        i = r2.mo70102a(inputStream, i, false, bsaw);
                    } else if (i4 != 5) {
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("Unknown wire type ");
                        sb.append(i4);
                        sb.append(", reading garbage data?");
                        throw new IOException(sb.toString());
                    }
                }
                if (i4 != 5) {
                    i5 = 8;
                }
                i -= i5;
                long j = 0;
                int i8 = 0;
                while (true) {
                    int i9 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    j |= ((long) inputStream.read()) << i8;
                    i8 += 8;
                    i5 = i9;
                }
                r2 = Long.valueOf(j);
            } else {
                long a3 = m114972a(inputStream, false, bsaw);
                i -= bsaw.f143912a;
                if (m114981l(i6)) {
                    a3 = (-(a3 & 1)) ^ (a3 >>> 1);
                }
                r2 = Long.valueOf(a3);
            }
            mo70107a(i6, r2);
        }
        if (i >= 0) {
            bsbh bsbh2 = this.f143916d;
            if (bsbh2 != null) {
                int i10 = bsbh2.f143939c;
                if (i10 > 0) {
                    i2 = 1 + i10;
                }
                Object[] objArr2 = new Object[i2];
                System.arraycopy(bsbh2.f143937a, 0, objArr2, 0, i2);
                Arrays.fill(bsbh2.f143937a, (Object) null);
                bsbh2.f143937a = objArr2;
            }
            return i;
        }
        throw new IOException();
    }

    /* renamed from: a */
    public final void mo70103a(int i, double d) {
        mo70106a(i, Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public final void mo70104a(int i, float f) {
        mo70105a(i, Float.floatToIntBits(f));
    }

    /* renamed from: a */
    public final void mo70105a(int i, int i2) {
        mo70106a(i, (long) i2);
    }

    /* renamed from: a */
    public final void mo70106a(int i, long j) {
        mo70107a(i, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo70107a(int i, Object obj) {
        Vector vector;
        m114983n(i);
        Object a = this.f143915c.mo70166a(i);
        if (a instanceof Vector) {
            vector = (Vector) a;
        } else {
            vector = null;
        }
        if (a != null && (vector == null || vector.size() != 0)) {
            m114979c(i, obj);
            if (vector == null) {
                vector = new Vector();
                vector.addElement(a);
                this.f143915c.mo70167a(i, vector);
            }
            vector.addElement(obj);
            return;
        }
        mo70118b(i, obj);
    }

    /* renamed from: a */
    public final void mo70108a(int i, boolean z) {
        mo70107a(i, !z ? Boolean.FALSE : Boolean.TRUE);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bsax.a(java.io.InputStream, int, boolean, bsaw):int
     arg types: [java.io.InputStream, int, int, bsaw]
     candidates:
      bsax.a(int, int, int, java.lang.Object):java.lang.Object
      bsax.a(java.io.InputStream, int, boolean, bsaw):int */
    /* renamed from: a */
    public final void mo70109a(InputStream inputStream, int i) {
        mo70102a(inputStream, i, true, new bsaw());
    }

    /* renamed from: a */
    public final void mo70110a(OutputStream outputStream) {
        bsau bsau = new bsau();
        m114969a(bsau);
        int i = bsau.f143905c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int a = bsau.mo70095a(i2);
            bsau.mo70096a(outputStream, i3, a - i3);
            m114970a(outputStream, (long) bsau.mo70095a(i2 + 1));
            i2 += 2;
            i3 = a;
        }
        int i4 = bsau.f143904b;
        if (i3 < i4) {
            bsau.mo70096a(outputStream, i3, i4 - i3);
        }
    }

    /* renamed from: a */
    public final void mo70111a(byte[] bArr) {
        mo70109a(new ByteArrayInputStream(bArr), bArr.length);
    }

    /* renamed from: a */
    public final boolean mo70112a() {
        bsaz bsaz = this.f143914b;
        return bsaz == null || bsaz.mo70146a(this);
    }

    /* renamed from: a */
    public final boolean mo70113a(int i) {
        return ((Boolean) m114980h(i, 24)).booleanValue();
    }
}
