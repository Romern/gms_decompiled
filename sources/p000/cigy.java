package p000;

import com.felicanetworks.mfc.FelicaException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import javax.security.auth.x500.X500Principal;

/* renamed from: cigy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cigy {

    /* renamed from: a */
    public final String f190277a;

    /* renamed from: b */
    public final int f190278b;

    /* renamed from: c */
    public int f190279c;

    /* renamed from: d */
    public int f190280d;

    /* renamed from: e */
    public int f190281e;

    /* renamed from: f */
    public int f190282f;

    /* renamed from: g */
    public char[] f190283g;

    public cigy(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f190277a = name;
        this.f190278b = name.length();
    }

    /* renamed from: a */
    public final int mo86097a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f190278b) {
            char[] cArr = this.f190283g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c >= 'A' && c <= 'F') {
                i2 = c - '7';
            } else {
                String valueOf = String.valueOf(this.f190277a);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Malformed DN: ") : "Malformed DN: ".concat(valueOf));
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 >= 'A' && c2 <= 'F') {
                i3 = c2 - '7';
            } else {
                String valueOf2 = String.valueOf(this.f190277a);
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("Malformed DN: ") : "Malformed DN: ".concat(valueOf2));
            }
            return (i2 << 4) + i3;
        }
        String valueOf3 = String.valueOf(this.f190277a);
        throw new IllegalStateException(valueOf3.length() == 0 ? new String("Malformed DN: ") : "Malformed DN: ".concat(valueOf3));
    }

    /* renamed from: b */
    public final char mo86099b() {
        int i;
        int i2;
        int i3 = this.f190279c + 1;
        this.f190279c = i3;
        if (i3 == this.f190278b) {
            String valueOf = String.valueOf(this.f190277a);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Unexpected end of DN: ") : "Unexpected end of DN: ".concat(valueOf));
        }
        char c = this.f190283g[i3];
        if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
            switch (c) {
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                case FelicaException.TYPE_RESET_FAILED:
                    break;
                default:
                    switch (c) {
                        case FelicaException.TYPE_NOW_EXECUTING_FALP:
                        case FelicaException.TYPE_MFC_NOT_FOUND:
                        case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                        case '>':
                            break;
                        default:
                            int a = mo86097a(i3);
                            this.f190279c++;
                            if (a >= 128) {
                                if (a >= 192 && a <= 247) {
                                    if (a <= 223) {
                                        i2 = a & 31;
                                        i = 1;
                                    } else if (a > 239) {
                                        i2 = a & 7;
                                        i = 3;
                                    } else {
                                        i2 = a & 15;
                                        i = 2;
                                    }
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < i) {
                                            int i5 = this.f190279c + 1;
                                            this.f190279c = i5;
                                            if (i5 != this.f190278b && this.f190283g[i5] == '\\') {
                                                int i6 = i5 + 1;
                                                this.f190279c = i6;
                                                int a2 = mo86097a(i6);
                                                this.f190279c++;
                                                if ((a2 & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC) == 128) {
                                                    i2 = (i2 << 6) + (a2 & 63);
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            a = (char) i2;
                                        }
                                    }
                                }
                                a = 63;
                            }
                            return (char) a;
                    }
            }
        }
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ed A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    public final String mo86098a() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        int i5;
        char c4;
        char c5;
        while (true) {
            i = this.f190279c;
            i2 = this.f190278b;
            if (i < i2 && this.f190283g[i] == ' ') {
                this.f190279c = i + 1;
            } else if (i != i2) {
                return null;
            } else {
                this.f190280d = i;
                this.f190279c = i + 1;
                while (true) {
                    i3 = this.f190279c;
                    i4 = this.f190278b;
                    if (i3 < i4 && (c5 = this.f190283g[i3]) != '=' && c5 != ' ') {
                        this.f190279c = i3 + 1;
                    }
                }
                if (i3 >= i4) {
                    String valueOf = String.valueOf(this.f190277a);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Unexpected end of DN: ") : "Unexpected end of DN: ".concat(valueOf));
                }
                this.f190281e = i3;
                if (this.f190283g[i3] == ' ') {
                    while (true) {
                        i3 = this.f190279c;
                        i5 = this.f190278b;
                        if (i3 < i5 && (c4 = this.f190283g[i3]) != '=' && c4 == ' ') {
                            this.f190279c = i3 + 1;
                        }
                    }
                    if (this.f190283g[i3] != '=' || i3 == i5) {
                        String valueOf2 = String.valueOf(this.f190277a);
                        throw new IllegalStateException(valueOf2.length() == 0 ? new String("Unexpected end of DN: ") : "Unexpected end of DN: ".concat(valueOf2));
                    }
                }
                this.f190279c = i3 + 1;
                while (true) {
                    int i6 = this.f190279c;
                    if (i6 < this.f190278b && this.f190283g[i6] == ' ') {
                        this.f190279c = i6 + 1;
                    }
                }
                int i7 = this.f190281e;
                int i8 = this.f190280d;
                if (i7 - i8 > 4) {
                    char[] cArr = this.f190283g;
                    if (cArr[i8 + 3] == '.' && (((c = cArr[i8]) == 'O' || c == 'o') && (((c2 = cArr[i8 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i8 + 2]) == 'D' || c3 == 'd')))) {
                        i8 += 4;
                        this.f190280d = i8;
                    }
                }
                return new String(this.f190283g, i8, i7 - i8);
            }
        }
        if (i != i2) {
        }
    }
}
