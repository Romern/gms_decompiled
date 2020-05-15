package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;

/* renamed from: sja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sja {

    /* renamed from: f */
    private static final char[] f44541f = {'u', 'l', 'l'};

    /* renamed from: g */
    private static final char[] f44542g = {'r', 'u', 'e'};

    /* renamed from: h */
    private static final char[] f44543h = {'r', 'u', 'e', '\"'};

    /* renamed from: i */
    private static final char[] f44544i = {'a', 'l', 's', 'e'};

    /* renamed from: j */
    private static final char[] f44545j = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: k */
    private static final char[] f44546k = {10};

    /* renamed from: m */
    private static final siz f44547m = new siq();

    /* renamed from: n */
    private static final siz f44548n = new sir();

    /* renamed from: o */
    private static final siz f44549o = new sis();

    /* renamed from: p */
    private static final siz f44550p = new sit();

    /* renamed from: q */
    private static final siz f44551q = new siu();

    /* renamed from: r */
    private static final siz f44552r = new siv();

    /* renamed from: s */
    private static final siz f44553s = new siw();

    /* renamed from: t */
    private static final siz f44554t = new six();

    /* renamed from: a */
    private final char[] f44555a = new char[1];

    /* renamed from: b */
    private final char[] f44556b = new char[32];

    /* renamed from: c */
    private final char[] f44557c = new char[1024];

    /* renamed from: d */
    private final StringBuilder f44558d = new StringBuilder(32);

    /* renamed from: e */
    private final StringBuilder f44559e = new StringBuilder(1024);

    /* renamed from: l */
    private final Stack f44560l = new Stack();

    /* renamed from: a */
    private final int m35452a(BufferedReader bufferedReader, char[] cArr) {
        int i;
        char j = m35462j(bufferedReader);
        if (j == 0) {
            throw new siy("Unexpected EOF");
        } else if (j == ',') {
            throw new siy("Missing value");
        } else if (j != 'n') {
            bufferedReader.mark(1024);
            if (j != '\"') {
                cArr[0] = j;
                i = 1;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (c == '}' || c == ',' || Character.isWhitespace(c) || cArr[i] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i - 1));
                        cArr[i] = 0;
                        return i;
                    }
                    i++;
                }
            } else {
                int i2 = 0;
                boolean z = false;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c2 = cArr[i];
                    if (Character.isISOControl(c2)) {
                        throw new siy("Unexpected control character while reading string");
                    } else if (c2 == '\"' && !z) {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        return i;
                    } else {
                        z = c2 == '\\' && !z;
                        i2 = i + 1;
                    }
                }
            }
            if (i == cArr.length) {
                throw new siy("Absurdly long value");
            }
            throw new siy("Unexpected EOF");
        } else {
            m35459b(bufferedReader, f44541f);
            return 0;
        }
    }

    /* renamed from: b */
    private static final String m35458b(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                for (int i = 0; i < read; i++) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        if (cArr2 == null) {
                            break loop0;
                        }
                        int i2 = 0;
                        while (i2 < cArr2.length) {
                            if (cArr2[i2] != c) {
                                i2++;
                            }
                        }
                        break loop0;
                    }
                    if (c == '\"' && !z2) {
                        sb.append(cArr, 0, i);
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        if (!z) {
                            return sb.toString();
                        }
                        String sb2 = sb.toString();
                        if (TextUtils.isEmpty(sb2)) {
                            return sb2;
                        }
                        StringBuffer stringBuffer = null;
                        if (!TextUtils.isEmpty(sb2)) {
                            Matcher matcher = stt.f45137a.matcher(sb2);
                            StringBuffer stringBuffer2 = null;
                            while (matcher.find()) {
                                if (stringBuffer2 == null) {
                                    stringBuffer2 = new StringBuffer();
                                }
                                matcher.appendReplacement(stringBuffer2, new String(Character.toChars(Integer.parseInt(matcher.group().substring(2), 16))));
                            }
                            if (stringBuffer2 != null) {
                                matcher.appendTail(stringBuffer2);
                                sb2 = stringBuffer2.toString();
                            }
                        }
                        String str = sb2;
                        Matcher matcher2 = ssd.f45076a.matcher(str);
                        while (matcher2.find()) {
                            if (stringBuffer == null) {
                                stringBuffer = new StringBuffer();
                            }
                            char charAt = matcher2.group().charAt(1);
                            if (charAt == '\"') {
                                matcher2.appendReplacement(stringBuffer, "\"");
                            } else if (charAt == '/') {
                                matcher2.appendReplacement(stringBuffer, "/");
                            } else if (charAt == '\\') {
                                matcher2.appendReplacement(stringBuffer, "\\\\");
                            } else if (charAt == 'b') {
                                matcher2.appendReplacement(stringBuffer, "\b");
                            } else if (charAt == 'f') {
                                matcher2.appendReplacement(stringBuffer, "\f");
                            } else if (charAt == 'n') {
                                matcher2.appendReplacement(stringBuffer, "\n");
                            } else if (charAt == 'r') {
                                matcher2.appendReplacement(stringBuffer, "\r");
                            } else if (charAt == 't') {
                                matcher2.appendReplacement(stringBuffer, "\t");
                            } else {
                                throw new IllegalStateException("Found an escaped character that should never be.");
                            }
                        }
                        if (stringBuffer == null) {
                            return str;
                        }
                        matcher2.appendTail(stringBuffer);
                        return stringBuffer.toString();
                    }
                    if (c == '\\') {
                        z2 = !z2;
                        z = true;
                    } else {
                        z2 = false;
                    }
                }
                sb.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new siy("Unexpected EOF while parsing string");
            }
        }
        throw new siy("Unexpected control character while reading string");
    }

    /* renamed from: h */
    private final String m35460h(BufferedReader bufferedReader) {
        this.f44560l.push(2);
        char j = m35462j(bufferedReader);
        if (j == '\"') {
            this.f44560l.push(3);
            String b = m35458b(bufferedReader, this.f44556b, this.f44558d, null);
            m35456a(3);
            if (m35462j(bufferedReader) == ':') {
                return b;
            }
            throw new siy("Expected key/value separator");
        } else if (j == ']') {
            m35456a(2);
            m35456a(1);
            m35456a(5);
            return null;
        } else if (j == '}') {
            m35456a(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(j);
            throw new siy(sb.toString());
        }
    }

    /* renamed from: i */
    private final String m35461i(BufferedReader bufferedReader) {
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(1024);
        char j = m35462j(bufferedReader);
        if (j != '\"') {
            if (j == ',') {
                throw new siy("Missing value");
            } else if (j == '[') {
                this.f44560l.push(5);
                bufferedReader2.mark(32);
                if (m35462j(bufferedReader) == ']') {
                    m35456a(5);
                } else {
                    bufferedReader.reset();
                    int i = 1;
                    boolean z = false;
                    boolean z2 = false;
                    while (i > 0) {
                        char j2 = m35462j(bufferedReader);
                        if (j2 == 0) {
                            throw new siy("Unexpected EOF while parsing array");
                        } else if (!Character.isISOControl(j2)) {
                            if (j2 == '\"' && !z) {
                                z2 = !z2;
                            }
                            if (j2 == '[' && !z2) {
                                i++;
                            }
                            if (j2 == ']' && !z2) {
                                i--;
                            }
                            z = j2 == '\\' && z2 && !z;
                        } else {
                            throw new siy("Unexpected control character while reading array");
                        }
                    }
                    m35456a(5);
                }
            } else if (j != '{') {
                bufferedReader.reset();
                m35452a(bufferedReader2, this.f44557c);
            } else {
                this.f44560l.push(1);
                bufferedReader2.mark(32);
                char j3 = m35462j(bufferedReader);
                if (j3 == '}') {
                    m35456a(1);
                } else if (j3 == '\"') {
                    bufferedReader.reset();
                    m35460h(bufferedReader);
                    do {
                    } while (m35461i(bufferedReader) != null);
                    m35456a(1);
                } else {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append("Unexpected token ");
                    sb.append(j3);
                    throw new siy(sb.toString());
                }
            }
        } else if (bufferedReader2.read(this.f44555a) != -1) {
            char c = this.f44555a[0];
            boolean z3 = false;
            do {
                if (c != '\"' || z3) {
                    if (c != '\\') {
                        z3 = false;
                    } else if (!z3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bufferedReader2.read(this.f44555a) != -1) {
                        c = this.f44555a[0];
                    } else {
                        throw new siy("Unexpected EOF while parsing string");
                    }
                }
            } while (!Character.isISOControl(c));
            throw new siy("Unexpected control character while reading string");
        } else {
            throw new siy("Unexpected EOF while parsing string");
        }
        char j4 = m35462j(bufferedReader);
        if (j4 == ',') {
            m35456a(2);
            return m35460h(bufferedReader);
        } else if (j4 == '}') {
            m35456a(2);
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(j4);
            throw new siy(sb2.toString());
        }
    }

    /* renamed from: j */
    private final char m35462j(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.f44555a) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.f44555a[0])) {
            if (bufferedReader.read(this.f44555a) == -1) {
                return 0;
            }
        }
        return this.f44555a[0];
    }

    /* renamed from: c */
    public final long mo25629c(BufferedReader bufferedReader) {
        long j;
        long j2;
        int i;
        int a = m35452a(bufferedReader, this.f44557c);
        if (a == 0) {
            return 0;
        }
        char[] cArr = this.f44557c;
        if (a > 0) {
            int i2 = 0;
            char c = cArr[0];
            if (c == '-') {
                j = Long.MIN_VALUE;
            } else {
                j = -9223372036854775807L;
            }
            if (c == '-') {
                i2 = 1;
            }
            if (i2 < a) {
                i = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    j2 = (long) (-digit);
                } else {
                    throw new siy("Unexpected non-digit character");
                }
            } else {
                j2 = 0;
                i = i2;
            }
            while (i < a) {
                int i3 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 < 0) {
                    throw new siy("Unexpected non-digit character");
                } else if (j2 >= -922337203685477580L) {
                    long j3 = j2 * 10;
                    long j4 = (long) digit2;
                    if (j3 >= j + j4) {
                        j2 = j3 - j4;
                        i = i3;
                    } else {
                        throw new siy("Number too large");
                    }
                } else {
                    throw new siy("Number too large");
                }
            }
            if (i2 == 0) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new siy("No digits to parse");
        }
        throw new siy("No number to parse");
    }

    /* renamed from: d */
    public final BigInteger mo25630d(BufferedReader bufferedReader) {
        int a = m35452a(bufferedReader, this.f44557c);
        if (a != 0) {
            return new BigInteger(new String(this.f44557c, 0, a));
        }
        return null;
    }

    /* renamed from: e */
    public final float mo25631e(BufferedReader bufferedReader) {
        int a = m35452a(bufferedReader, this.f44557c);
        if (a != 0) {
            return Float.parseFloat(new String(this.f44557c, 0, a));
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final double mo25632f(BufferedReader bufferedReader) {
        int a = m35452a(bufferedReader, this.f44557c);
        if (a != 0) {
            return Double.parseDouble(new String(this.f44557c, 0, a));
        }
        return 0.0d;
    }

    /* renamed from: g */
    public final BigDecimal mo25633g(BufferedReader bufferedReader) {
        int a = m35452a(bufferedReader, this.f44557c);
        if (a != 0) {
            return new BigDecimal(new String(this.f44557c, 0, a));
        }
        return null;
    }

    /* renamed from: a */
    private final String m35453a(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        char j = m35462j(bufferedReader);
        if (j == '\"') {
            return m35458b(bufferedReader, cArr, sb, cArr2);
        }
        if (j == 'n') {
            m35459b(bufferedReader, f44541f);
            return null;
        }
        throw new siy("Expected string");
    }

    /* renamed from: a */
    private final ArrayList m35454a(BufferedReader bufferedReader, FastJsonResponse$Field fastJsonResponse$Field) {
        ArrayList arrayList = new ArrayList();
        char j = m35462j(bufferedReader);
        if (j == ']') {
            m35456a(5);
            return arrayList;
        } else if (j == 'n') {
            m35459b(bufferedReader, f44541f);
            m35456a(5);
            return null;
        } else if (j == '{') {
            this.f44560l.push(1);
            while (true) {
                try {
                    sio c = fastJsonResponse$Field.mo17859c();
                    if (!m35457a(bufferedReader, c)) {
                        return arrayList;
                    }
                    arrayList.add(c);
                    char j2 = m35462j(bufferedReader);
                    if (j2 != ',') {
                        if (j2 == ']') {
                            m35456a(5);
                            return arrayList;
                        }
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(j2);
                        throw new siy(sb.toString());
                    } else if (m35462j(bufferedReader) == '{') {
                        this.f44560l.push(1);
                    } else {
                        throw new siy("Expected start of next object in array");
                    }
                } catch (InstantiationException e) {
                    throw new siy("Error instantiating inner object", e);
                } catch (IllegalAccessException e2) {
                    throw new siy("Error instantiating inner object", e2);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Unexpected token: ");
            sb2.append(j);
            throw new siy(sb2.toString());
        }
    }

    /* renamed from: b */
    private final void m35459b(BufferedReader bufferedReader, char[] cArr) {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i < length) {
                int read = bufferedReader.read(this.f44556b, 0, length - i);
                if (read != -1) {
                    int i2 = 0;
                    while (i2 < read) {
                        if (cArr[i2 + i] == this.f44556b[i2]) {
                            i2++;
                        } else {
                            throw new siy("Unexpected character");
                        }
                    }
                    i += read;
                } else {
                    throw new siy("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final ArrayList m35455a(BufferedReader bufferedReader, siz siz) {
        char j = m35462j(bufferedReader);
        if (j == 'n') {
            m35459b(bufferedReader, f44541f);
            return null;
        } else if (j == '[') {
            this.f44560l.push(5);
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char j2 = m35462j(bufferedReader);
                if (j2 == 0) {
                    throw new siy("Unexpected EOF");
                } else if (j2 != ',') {
                    if (j2 != ']') {
                        bufferedReader.reset();
                        arrayList.add(siz.mo25623a(this, bufferedReader));
                    } else {
                        m35456a(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new siy("Expected start of array");
        }
    }

    /* renamed from: b */
    public final int mo25628b(BufferedReader bufferedReader) {
        int i;
        int i2;
        int i3;
        int i4;
        int a = m35452a(bufferedReader, this.f44557c);
        if (a == 0) {
            return 0;
        }
        char[] cArr = this.f44557c;
        if (a > 0) {
            char c = cArr[0];
            if (c == '-') {
                i = Integer.MIN_VALUE;
            } else {
                i = -2147483647;
            }
            if (c == '-') {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 < a) {
                i4 = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new siy("Unexpected non-digit character");
                }
            } else {
                i4 = i2;
                i3 = 0;
            }
            while (i4 < a) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(cArr[i4], 10);
                if (digit2 < 0) {
                    throw new siy("Unexpected non-digit character");
                } else if (i3 >= -214748364) {
                    int i6 = i3 * 10;
                    if (i6 >= i + digit2) {
                        i3 = i6 - digit2;
                        i4 = i5;
                    } else {
                        throw new siy("Number too large");
                    }
                } else {
                    throw new siy("Number too large");
                }
            }
            if (i2 == 0) {
                return -i3;
            }
            if (i4 > 1) {
                return i3;
            }
            throw new siy("No digits to parse");
        }
        throw new siy("No number to parse");
    }

    /* renamed from: a */
    private final void m35456a(int i) {
        if (!this.f44560l.isEmpty()) {
            int intValue = ((Integer) this.f44560l.pop()).intValue();
            if (intValue != i) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Expected state ");
                sb.append(i);
                sb.append(" but had ");
                sb.append(intValue);
                throw new siy(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i);
        sb2.append(" but had empty stack");
        throw new siy(sb2.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sja.a(java.io.BufferedReader, boolean):boolean
     arg types: [java.io.BufferedReader, int]
     candidates:
      sja.a(java.io.BufferedReader, char[]):int
      sja.a(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse$Field):java.util.ArrayList
      sja.a(java.io.BufferedReader, siz):java.util.ArrayList
      sja.a(java.io.BufferedReader, sio):boolean
      sja.a(java.io.InputStream, sio):void
      sja.a(java.lang.String, sio):void
      sja.a(java.io.BufferedReader, boolean):boolean */
    /* renamed from: a */
    private final boolean m35457a(BufferedReader bufferedReader, sio sio) {
        HashMap hashMap;
        BufferedReader bufferedReader2 = bufferedReader;
        sio sio2 = sio;
        Map a = sio.mo7367a();
        String h = m35460h(bufferedReader);
        if (h != null) {
            while (h != null) {
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) a.get(h);
                if (fastJsonResponse$Field == null) {
                    h = m35461i(bufferedReader);
                } else {
                    this.f44560l.push(4);
                    int i = fastJsonResponse$Field.f30314b;
                    switch (i) {
                        case 0:
                            if (!fastJsonResponse$Field.f30315c) {
                                int b = mo25628b(bufferedReader);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo7391a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, b);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, Integer.valueOf(b));
                                    break;
                                }
                            } else {
                                ArrayList a2 = m35455a(bufferedReader2, f44547m);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17834c(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a2);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a2);
                                    break;
                                }
                            }
                        case 1:
                            if (!fastJsonResponse$Field.f30315c) {
                                BigInteger d = mo25630d(bufferedReader);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17876a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, d);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, d);
                                    break;
                                }
                            } else {
                                ArrayList a3 = m35455a(bufferedReader2, f44553s);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17879d(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a3);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a3);
                                    break;
                                }
                            }
                        case 2:
                            if (!fastJsonResponse$Field.f30315c) {
                                long c = mo25629c(bufferedReader);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo7394a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, c);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, Long.valueOf(c));
                                    break;
                                }
                            } else {
                                ArrayList a4 = m35455a(bufferedReader2, f44548n);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17880e(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a4);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a4);
                                    break;
                                }
                            }
                        case 3:
                            if (!fastJsonResponse$Field.f30315c) {
                                float e = mo25631e(bufferedReader);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17874a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, e);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, Float.valueOf(e));
                                    break;
                                }
                            } else {
                                ArrayList a5 = m35455a(bufferedReader2, f44549o);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17881f(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a5);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a5);
                                    break;
                                }
                            }
                        case 4:
                            if (!fastJsonResponse$Field.f30315c) {
                                sio2.mo25607a(fastJsonResponse$Field, mo25632f(bufferedReader));
                                break;
                            } else {
                                ArrayList a6 = m35455a(bufferedReader2, f44550p);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17882g(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a6);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a6);
                                    break;
                                }
                            }
                        case 5:
                            if (!fastJsonResponse$Field.f30315c) {
                                BigDecimal g = mo25633g(bufferedReader);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17875a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, g);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, g);
                                    break;
                                }
                            } else {
                                ArrayList a7 = m35455a(bufferedReader2, f44554t);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17883h(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a7);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a7);
                                    break;
                                }
                            }
                        case 6:
                            if (!fastJsonResponse$Field.f30315c) {
                                sio2.mo25609a(fastJsonResponse$Field, mo25627a(bufferedReader2, false));
                                break;
                            } else {
                                ArrayList a8 = m35455a(bufferedReader2, f44551q);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo17884i(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a8);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a8);
                                    break;
                                }
                            }
                        case 7:
                            if (!fastJsonResponse$Field.f30315c) {
                                String a9 = mo25624a(bufferedReader);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo7376a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a9);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a9);
                                    break;
                                }
                            } else {
                                ArrayList a10 = m35455a(bufferedReader2, f44552r);
                                if (fastJsonResponse$Field.f30323k == null) {
                                    sio2.mo7387b(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, a10);
                                    break;
                                } else {
                                    sio2.mo25608a(fastJsonResponse$Field, a10);
                                    break;
                                }
                            }
                        case 8:
                            sio2.mo25610a(fastJsonResponse$Field, sqd.m35966a(m35453a(bufferedReader2, this.f44557c, this.f44559e, f44546k)));
                            break;
                        case 9:
                            sio2.mo25610a(fastJsonResponse$Field, sqd.m35969b(m35453a(bufferedReader2, this.f44557c, this.f44559e, f44546k)));
                            break;
                        case 10:
                            char j = m35462j(bufferedReader);
                            if (j == 'n') {
                                m35459b(bufferedReader2, f44541f);
                                hashMap = null;
                            } else if (j == '{') {
                                this.f44560l.push(1);
                                hashMap = new HashMap();
                                while (true) {
                                    char j2 = m35462j(bufferedReader);
                                    if (j2 == 0) {
                                        throw new siy("Unexpected EOF");
                                    } else if (j2 == '\"') {
                                        String b2 = m35458b(bufferedReader2, this.f44556b, this.f44558d, null);
                                        if (m35462j(bufferedReader) != ':') {
                                            String valueOf = String.valueOf(b2);
                                            throw new siy(valueOf.length() == 0 ? new String("No map value found for key ") : "No map value found for key ".concat(valueOf));
                                        } else if (m35462j(bufferedReader) == '\"') {
                                            hashMap.put(b2, m35458b(bufferedReader2, this.f44556b, this.f44558d, null));
                                            char j3 = m35462j(bufferedReader);
                                            if (j3 != ',') {
                                                if (j3 == '}') {
                                                    m35456a(1);
                                                } else {
                                                    StringBuilder sb = new StringBuilder(48);
                                                    sb.append("Unexpected character while parsing string map: ");
                                                    sb.append(j3);
                                                    throw new siy(sb.toString());
                                                }
                                            }
                                        } else {
                                            String valueOf2 = String.valueOf(b2);
                                            throw new siy(valueOf2.length() == 0 ? new String("Expected String value for key ") : "Expected String value for key ".concat(valueOf2));
                                        }
                                    } else if (j2 == '}') {
                                        m35456a(1);
                                    }
                                }
                            } else {
                                throw new siy("Expected start of a map object");
                            }
                            if (fastJsonResponse$Field.f30323k != null) {
                                sio2.mo25608a(fastJsonResponse$Field, hashMap);
                                break;
                            } else {
                                sio2.mo17877a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, hashMap);
                                break;
                            }
                        case 11:
                            if (fastJsonResponse$Field.f30315c) {
                                char j4 = m35462j(bufferedReader);
                                if (j4 == 'n') {
                                    m35459b(bufferedReader2, f44541f);
                                    sio2.mo7368a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, (ArrayList) null);
                                    break;
                                } else {
                                    this.f44560l.push(5);
                                    if (j4 == '[') {
                                        sio2.mo7368a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, m35454a(bufferedReader2, fastJsonResponse$Field));
                                        break;
                                    } else {
                                        throw new siy("Expected array start");
                                    }
                                }
                            } else {
                                char j5 = m35462j(bufferedReader);
                                if (j5 == 'n') {
                                    m35459b(bufferedReader2, f44541f);
                                    sio2.mo7369a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, (sio) null);
                                    break;
                                } else {
                                    this.f44560l.push(1);
                                    if (j5 == '{') {
                                        try {
                                            sio c2 = fastJsonResponse$Field.mo17859c();
                                            m35457a(bufferedReader2, c2);
                                            sio2.mo7369a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, c2);
                                            break;
                                        } catch (InstantiationException e2) {
                                            throw new siy("Error instantiating inner object", e2);
                                        } catch (IllegalAccessException e3) {
                                            throw new siy("Error instantiating inner object", e3);
                                        }
                                    } else {
                                        throw new siy("Expected start of object");
                                    }
                                }
                            }
                        default:
                            StringBuilder sb2 = new StringBuilder(30);
                            sb2.append("Invalid field type ");
                            sb2.append(i);
                            throw new siy(sb2.toString());
                    }
                    m35456a(4);
                    m35456a(2);
                    char j6 = m35462j(bufferedReader);
                    if (j6 == ',') {
                        h = m35460h(bufferedReader);
                    } else if (j6 == '}') {
                        h = null;
                    } else {
                        StringBuilder sb3 = new StringBuilder(55);
                        sb3.append("Expected end of object or field separator, but found: ");
                        sb3.append(j6);
                        throw new siy(sb3.toString());
                    }
                }
            }
            m35456a(1);
            return true;
        }
        m35456a(1);
        return false;
    }

    /* renamed from: a */
    public final String mo25624a(BufferedReader bufferedReader) {
        return m35453a(bufferedReader, this.f44556b, this.f44558d, null);
    }

    /* renamed from: a */
    public final void mo25625a(InputStream inputStream, sio sio) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.f44560l.push(0);
            char j = m35462j(bufferedReader);
            if (j != 0) {
                if (j == '[') {
                    this.f44560l.push(5);
                    Map a = sio.mo7367a();
                    if (a.size() == 1) {
                        FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) ((Map.Entry) a.entrySet().iterator().next()).getValue();
                        sio.mo7368a(fastJsonResponse$Field, fastJsonResponse$Field.f30318f, m35454a(bufferedReader, fastJsonResponse$Field));
                    } else {
                        throw new siy("Object array response class must have a single Field");
                    }
                } else if (j == '{') {
                    this.f44560l.push(1);
                    m35457a(bufferedReader, sio);
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(j);
                    throw new siy(sb.toString());
                }
                m35456a(0);
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } else {
                throw new siy("No data to parse");
            }
        } catch (IOException e2) {
            throw new siy(e2);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo25626a(String str, sio sio) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        try {
            mo25625a(byteArrayInputStream, sio);
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                Log.w("FastParser", "Failed to close the input stream while parsing.");
            }
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (IOException e2) {
                Log.w("FastParser", "Failed to close the input stream while parsing.");
            }
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sja.a(java.io.BufferedReader, boolean):boolean
     arg types: [java.io.BufferedReader, int]
     candidates:
      sja.a(java.io.BufferedReader, char[]):int
      sja.a(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse$Field):java.util.ArrayList
      sja.a(java.io.BufferedReader, siz):java.util.ArrayList
      sja.a(java.io.BufferedReader, sio):boolean
      sja.a(java.io.InputStream, sio):void
      sja.a(java.lang.String, sio):void
      sja.a(java.io.BufferedReader, boolean):boolean */
    /* renamed from: a */
    public final boolean mo25627a(BufferedReader bufferedReader, boolean z) {
        char[] cArr;
        char[] cArr2;
        char j = m35462j(bufferedReader);
        if (j != '\"') {
            if (j == 'f') {
                if (!z) {
                    cArr = f44544i;
                } else {
                    cArr = f44545j;
                }
                m35459b(bufferedReader, cArr);
                return false;
            } else if (j == 'n') {
                m35459b(bufferedReader, f44541f);
                return false;
            } else if (j == 't') {
                if (!z) {
                    cArr2 = f44542g;
                } else {
                    cArr2 = f44543h;
                }
                m35459b(bufferedReader, cArr2);
                return true;
            } else {
                StringBuilder sb = new StringBuilder(19);
                sb.append("Unexpected token: ");
                sb.append(j);
                throw new siy(sb.toString());
            }
        } else if (!z) {
            return mo25627a(bufferedReader, true);
        } else {
            throw new siy("No boolean value found in string");
        }
    }
}
