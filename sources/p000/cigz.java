package p000;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: cigz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigz implements HostnameVerifier {

    /* renamed from: a */
    public static final cigz f190284a = new cigz();

    /* renamed from: b */
    private static final Pattern f190285b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private cigz() {
    }

    /* renamed from: a */
    private static List m150288a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (!(list == null || list.size() < 2 || (num = (Integer) list.get(0)) == null || num.intValue() != i || (str = (String) list.get(1)) == null)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException e) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r1 = java.lang.String.valueOf(r3.f190277a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x025f, code lost:
        if (r1.length() != 0) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0261, code lost:
        r1 = new java.lang.String("Malformed DN: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0267, code lost:
        r1 = "Malformed DN: ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x026e, code lost:
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r1 = r3.f190280d;
        r7 = new java.lang.String(r8, r1, r3.f190281e - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012c, code lost:
        r1 = r3.f190283g;
        r8 = r3.f190280d;
        r7 = new java.lang.String(r1, r8, r3.f190282f - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019d, code lost:
        r3.f190281e = r7;
     */
    public final boolean verify(String str, SSLSession sSLSession) {
        String str2;
        int i;
        int i2;
        String str3 = str;
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            if (f190285b.matcher(str3).matches()) {
                List a = m150288a(x509Certificate, 7);
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (str3.equalsIgnoreCase((String) a.get(i3))) {
                        return true;
                    }
                }
                return false;
            }
            String lowerCase = str3.toLowerCase(Locale.US);
            List a2 = m150288a(x509Certificate, 2);
            int size2 = a2.size();
            int i4 = 0;
            boolean z = false;
            while (i4 < size2) {
                if (m150289a(lowerCase, (String) a2.get(i4))) {
                    return true;
                }
                i4++;
                z = true;
            }
            if (z) {
                return false;
            }
            cigy cigy = new cigy(x509Certificate.getSubjectX500Principal());
            cigy.f190279c = 0;
            cigy.f190280d = 0;
            cigy.f190281e = 0;
            cigy.f190282f = 0;
            cigy.f190283g = cigy.f190277a.toCharArray();
            String a3 = cigy.mo86098a();
            if (a3 != null) {
                while (true) {
                    String str4 = "";
                    int i5 = cigy.f190279c;
                    int i6 = cigy.f190278b;
                    if (i5 == i6) {
                        break;
                    }
                    char c = cigy.f190283g[i5];
                    if (c != '\"') {
                        if (c == '#') {
                            if (i5 + 4 < i6) {
                                cigy.f190280d = i5;
                                cigy.f190279c = i5 + 1;
                                while (true) {
                                    int i7 = cigy.f190279c;
                                    if (i7 != cigy.f190278b) {
                                        char[] cArr = cigy.f190283g;
                                        char c2 = cArr[i7];
                                        if (c2 != '+') {
                                            if (c2 == ',' || c2 == ';') {
                                                break;
                                            } else if (c2 == ' ') {
                                                cigy.f190281e = i7;
                                                cigy.f190279c = i7 + 1;
                                                while (true) {
                                                    int i8 = cigy.f190279c;
                                                    if (i8 >= cigy.f190278b || cigy.f190283g[i8] != ' ') {
                                                        break;
                                                    }
                                                    cigy.f190279c = i8 + 1;
                                                }
                                            } else {
                                                if (c2 >= 'A' && c2 <= 'F') {
                                                    cArr[i7] = (char) (c2 + ' ');
                                                }
                                                cigy.f190279c = i7 + 1;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                int i9 = cigy.f190281e;
                                int i10 = cigy.f190280d;
                                int i11 = i9 - i10;
                                if (i11 >= 5) {
                                    if ((i11 & 1) == 0) {
                                        break;
                                    }
                                    int i12 = i11 >> 1;
                                    byte[] bArr = new byte[i12];
                                    int i13 = i10 + 1;
                                    for (int i14 = 0; i14 < i12; i14++) {
                                        bArr[i14] = (byte) cigy.mo86097a(i13);
                                        i13 += 2;
                                    }
                                    str4 = new String(cigy.f190283g, cigy.f190280d, i11);
                                } else {
                                    break;
                                }
                            } else {
                                String valueOf = String.valueOf(cigy.f190277a);
                                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unexpected end of DN: ") : "Unexpected end of DN: ".concat(valueOf));
                            }
                        } else if (c != '+' && c != ',' && c != ';') {
                            cigy.f190280d = i5;
                            cigy.f190281e = i5;
                            while (true) {
                                int i15 = cigy.f190279c;
                                if (i15 < cigy.f190278b) {
                                    char[] cArr2 = cigy.f190283g;
                                    char c3 = cArr2[i15];
                                    if (c3 == ' ') {
                                        int i16 = cigy.f190281e;
                                        cigy.f190282f = i16;
                                        cigy.f190279c = i15 + 1;
                                        cigy.f190281e = i16 + 1;
                                        cArr2[i16] = ' ';
                                        while (true) {
                                            i = cigy.f190279c;
                                            i2 = cigy.f190278b;
                                            if (i >= i2) {
                                                break;
                                            }
                                            char[] cArr3 = cigy.f190283g;
                                            if (cArr3[i] != ' ') {
                                                break;
                                            }
                                            int i17 = cigy.f190281e;
                                            cigy.f190281e = i17 + 1;
                                            cArr3[i17] = ' ';
                                            cigy.f190279c = i + 1;
                                        }
                                        if (i != i2) {
                                            char c4 = cigy.f190283g[i];
                                            if (c4 == ',' || c4 == '+' || c4 == ';') {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else if (c3 == ';') {
                                        break;
                                    } else if (c3 != '\\') {
                                        if (c3 == '+' || c3 == ',') {
                                            break;
                                        }
                                        int i18 = cigy.f190281e;
                                        cigy.f190281e = i18 + 1;
                                        cArr2[i18] = c3;
                                        cigy.f190279c = i15 + 1;
                                    } else {
                                        int i19 = cigy.f190281e;
                                        cigy.f190281e = i19 + 1;
                                        cArr2[i19] = cigy.mo86099b();
                                        cigy.f190279c++;
                                    }
                                } else {
                                    char[] cArr4 = cigy.f190283g;
                                    int i20 = cigy.f190280d;
                                    str4 = new String(cArr4, i20, cigy.f190281e - i20);
                                    break;
                                }
                            }
                        }
                    } else {
                        int i21 = i5 + 1;
                        cigy.f190279c = i21;
                        cigy.f190280d = i21;
                        cigy.f190281e = i21;
                        while (true) {
                            int i22 = cigy.f190279c;
                            if (i22 == cigy.f190278b) {
                                String valueOf2 = String.valueOf(cigy.f190277a);
                                throw new IllegalStateException(valueOf2.length() == 0 ? new String("Unexpected end of DN: ") : "Unexpected end of DN: ".concat(valueOf2));
                            }
                            char[] cArr5 = cigy.f190283g;
                            char c5 = cArr5[i22];
                            if (c5 == '\"') {
                                cigy.f190279c = i22 + 1;
                                while (true) {
                                    int i23 = cigy.f190279c;
                                    if (i23 < cigy.f190278b) {
                                        if (cigy.f190283g[i23] != ' ') {
                                            break;
                                        }
                                        cigy.f190279c = i23 + 1;
                                    } else {
                                        break;
                                    }
                                }
                                char[] cArr6 = cigy.f190283g;
                                int i24 = cigy.f190280d;
                                str4 = new String(cArr6, i24, cigy.f190281e - i24);
                            } else {
                                if (c5 == '\\') {
                                    cArr5[cigy.f190281e] = cigy.mo86099b();
                                } else {
                                    cArr5[cigy.f190281e] = c5;
                                }
                                cigy.f190279c++;
                                cigy.f190281e++;
                            }
                        }
                    }
                    if ("cn".equalsIgnoreCase(a3)) {
                        str2 = str4;
                        break;
                    }
                    int i25 = cigy.f190279c;
                    if (i25 >= cigy.f190278b) {
                        str2 = null;
                        break;
                    }
                    char c6 = cigy.f190283g[i25];
                    if (c6 != ',' && c6 != ';' && c6 != '+') {
                        break;
                    }
                    cigy.f190279c = i25 + 1;
                    a3 = cigy.mo86098a();
                    if (a3 == null) {
                        String valueOf3 = String.valueOf(cigy.f190277a);
                        throw new IllegalStateException(valueOf3.length() == 0 ? new String("Malformed DN: ") : "Malformed DN: ".concat(valueOf3));
                    }
                }
                String valueOf4 = String.valueOf(cigy.f190277a);
                throw new IllegalStateException(valueOf4.length() == 0 ? new String("Unexpected end of DN: ") : "Unexpected end of DN: ".concat(valueOf4));
            }
            str2 = null;
            if (str2 != null) {
                return m150289a(lowerCase, str2);
            }
            return false;
        } catch (SSLException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static final boolean m150289a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                StringBuilder sb = new StringBuilder(str.length() + 1);
                sb.append(str);
                sb.append('.');
                str = sb.toString();
            }
            if (!str2.endsWith(".")) {
                StringBuilder sb2 = new StringBuilder(str2.length() + 1);
                sb2.append(str2);
                sb2.append('.');
                str2 = sb2.toString();
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (lowerCase.startsWith("*.") && lowerCase.indexOf(42, 1) == -1 && str.length() >= lowerCase.length() && !"*.".equals(lowerCase)) {
                String substring = lowerCase.substring(1);
                if (str.endsWith(substring)) {
                    int length = str.length() - substring.length();
                    if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
