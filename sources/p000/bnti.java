package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: bnti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnti extends bnut implements bnup {

    /* renamed from: a */
    public static final Locale f132123a = Locale.ROOT;

    /* renamed from: b */
    public static final bntg f132124b = new bntf();

    /* renamed from: c */
    public final Object[] f132125c;

    /* renamed from: d */
    public final StringBuilder f132126d = new StringBuilder();

    /* renamed from: e */
    public int f132127e = 0;

    private bnti(bntk bntk, Object[] objArr) {
        super(bntk);
        this.f132125c = (Object[]) bnuy.m110474a(objArr, "log arguments");
    }

    /* renamed from: a */
    public static String m110384a(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                return String.valueOf(obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            return Arrays.toString((Object[]) obj);
        } catch (RuntimeException e) {
            return m110385a(obj, e);
        }
    }

    /* renamed from: a */
    private static String m110385a(Object obj, RuntimeException runtimeException) {
        String str;
        try {
            str = runtimeException.toString();
        } catch (RuntimeException e) {
            str = e.getClass().getSimpleName();
        }
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 16 + String.valueOf(str).length());
        sb.append("{");
        sb.append(name);
        sb.append("@");
        sb.append(identityHashCode);
        sb.append(": ");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m110386a(bnsw bnsw, bnth bnth, bntg bntg) {
        boolean z;
        String str;
        bnta k = bnsw.mo68446k();
        Throwable th = (Throwable) k.mo68397b(bnrw.f132044a);
        int i = 0;
        while (true) {
            if (i < k.mo68393a()) {
                if (m110390a(k.mo68395a(i), bntg)) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (bnsw.mo68442g() != null) {
            bnti bnti = new bnti(bnsw.mo68442g(), bnsw.mo68443h());
            bnti.mo68501a().mo68503a(bnti);
            int i2 = bnti.f132207f;
            if (((i2 + 1) & i2) != 0 || (bnti.f132208g > 31 && i2 != -1)) {
                throw new bnuv(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(i2 ^ -1))));
            }
            bnti.mo68501a().mo68504a(bnti.f132126d, bnti.mo68502b(), bnti.f132127e, bnti.mo68502b().length());
            StringBuilder sb = bnti.f132126d;
            if (bnsw.mo68443h().length > bnti.f132208g + 1) {
                sb.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            }
            if (!z) {
                m110388a(sb, k, bntg);
            }
            str = sb.toString();
        } else {
            String a = m110384a(bnsw.mo68444i());
            if (!z) {
                StringBuilder sb2 = new StringBuilder(a);
                m110388a(sb2, bnsw.mo68446k(), bntg);
                str = sb2.toString();
            } else {
                str = a;
            }
        }
        bnth.mo68481a(bnsw.mo68438c(), str, th);
    }

    /* renamed from: a */
    private static void m110387a(StringBuilder sb, long j, boolean z) {
        String str;
        if (j == 0) {
            sb.append("0");
            return;
        }
        if (!z) {
            str = "0123456789abcdef";
        } else {
            str = "0123456789ABCDEF";
        }
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & -4; numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    /* renamed from: a */
    private static void m110388a(StringBuilder sb, bnta bnta, bntg bntg) {
        bnsu bnsu = new bnsu("[CONTEXT ", " ]", sb);
        bntj bntj = null;
        for (int i = 0; i < bnta.mo68393a(); i++) {
            bnsj a = bnta.mo68395a(i);
            if (m110390a(a, bntg)) {
                if (a.equals(bnrw.f132049f)) {
                    bntj = (bntj) bnrw.f132049f.mo68460a(bnta.mo68396b(i));
                } else {
                    bnsu.mo68470a(a.f132072a, bnta.mo68396b(i));
                }
            }
        }
        if (bntj != null) {
            bntj.mo68483a(bnsu);
        }
        bnsu.mo68469a();
    }

    /* renamed from: a */
    public static void m110389a(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(m110384a(obj));
        sb.append("]");
    }

    /* renamed from: a */
    private static boolean m110390a(bnsj bnsj, bntg bntg) {
        return !bnsj.equals(bnrw.f132044a) && bntg.mo68480a(bnsj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if ((r8 instanceof java.math.BigDecimal) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        if ((r8 instanceof java.math.BigInteger) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0056, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a0  */
    /* renamed from: a */
    public final void mo68482a(Object obj, bnsr bnsr, bnss bnss) {
        bnss bnss2;
        boolean z;
        int ordinal = bnsr.f132097m.ordinal();
        int i = 4;
        int i2 = 2;
        int i3 = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = obj instanceof Boolean;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw null;
                    } else if (!(obj instanceof Double)) {
                        if (!(obj instanceof Float)) {
                        }
                    }
                } else if (!(obj instanceof Integer)) {
                    if (!(obj instanceof Long)) {
                        if (!(obj instanceof Byte)) {
                            if (!(obj instanceof Short)) {
                            }
                        }
                    }
                }
            } else if (!(obj instanceof Character)) {
                if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                    z = Character.isValidCodePoint(((Number) obj).intValue());
                }
                m110389a(this.f132126d, obj, bnsr.f132099o);
                return;
            }
        }
        StringBuilder sb = this.f132126d;
        bnsr bnsr2 = bnsr.STRING;
        int ordinal2 = bnsr.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5) {
                            if (!bnss.mo68464a()) {
                                int i4 = bnss.f132102b;
                                int i5 = i4 & 128;
                                if (i5 == 0) {
                                    bnss2 = bnss.f132100a;
                                } else if (!(i5 == i4 && bnss.f132103c == -1 && bnss.f132104d == -1)) {
                                    bnss2 = new bnss(i5, -1, -1);
                                }
                                if (bnss2.equals(bnss)) {
                                    Number number = (Number) obj;
                                    boolean b = bnss.mo68466b();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        m110387a(sb, longValue, b);
                                        return;
                                    } else if (number instanceof Integer) {
                                        m110387a(sb, longValue & 4294967295L, b);
                                        return;
                                    } else if (number instanceof Byte) {
                                        m110387a(sb, longValue & 255, b);
                                        return;
                                    } else if (number instanceof Short) {
                                        m110387a(sb, longValue & 65535, b);
                                        return;
                                    } else if (number instanceof BigInteger) {
                                        String bigInteger = ((BigInteger) number).toString(16);
                                        if (b) {
                                            bigInteger = bigInteger.toUpperCase(f132123a);
                                        }
                                        sb.append(bigInteger);
                                        return;
                                    } else {
                                        String valueOf = String.valueOf(number.getClass());
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 25);
                                        sb2.append("unsupported number type: ");
                                        sb2.append(valueOf);
                                        throw new RuntimeException(sb2.toString());
                                    }
                                }
                            }
                            bnss2 = bnss;
                            if (bnss2.equals(bnss)) {
                            }
                        }
                    }
                } else if (bnss.mo68464a()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if (Character.isBmpCodePoint(intValue)) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (bnss.mo68464a()) {
                sb.append(obj);
                return;
            }
        } else if (obj instanceof Formattable) {
            Formattable formattable = (Formattable) obj;
            int i6 = bnss.f132102b & 162;
            if (i6 != 0) {
                if ((i6 & 32) == 0) {
                    i3 = 0;
                }
                if ((i6 & 128) == 0) {
                    i2 = 0;
                }
                int i7 = i3 | i2;
                if ((i6 & 2) == 0) {
                    i = 0;
                }
                i6 = i7 | i;
            }
            int length = sb.length();
            Formatter formatter = new Formatter(sb, f132123a);
            try {
                formattable.formatTo(formatter, i6, bnss.f132103c, bnss.f132104d);
                return;
            } catch (RuntimeException e) {
                sb.setLength(length);
                try {
                    formatter.out().append(m110385a(formattable, e));
                    return;
                } catch (IOException e2) {
                    return;
                }
            }
        } else if (bnss.mo68464a()) {
            sb.append(m110384a(obj));
            return;
        }
        String str = bnsr.f132099o;
        if (!bnss.mo68464a()) {
            char c = bnsr.f132096l;
            if (bnss.mo68466b()) {
                c &= 65503;
            }
            StringBuilder sb3 = new StringBuilder("%");
            bnss.mo68463a(sb3);
            sb3.append((char) c);
            str = sb3.toString();
        }
        sb.append(String.format(f132123a, str, obj));
    }
}
