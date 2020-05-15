package p000;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: nd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1211nd {

    /* renamed from: a */
    static final C1213nf f26731a = C1220nm.f26746c;

    /* renamed from: b */
    static final C1211nd f26732b = new C1211nd(false, 2, f26731a);

    /* renamed from: c */
    static final C1211nd f26733c = new C1211nd(true, 2, f26731a);

    /* renamed from: d */
    private static final String f26734d = Character.toString(8206);

    /* renamed from: e */
    private static final String f26735e = Character.toString(8207);

    /* renamed from: f */
    private final boolean f26736f;

    /* renamed from: g */
    private final int f26737g;

    /* renamed from: h */
    private final C1213nf f26738h;

    public C1211nd(boolean z, int i, C1213nf nfVar) {
        this.f26736f = z;
        this.f26737g = i;
        this.f26738h = nfVar;
    }

    /* renamed from: a */
    private static int m19660a(CharSequence charSequence) {
        C1210nc ncVar = new C1210nc(charSequence);
        ncVar.f26729c = ncVar.f26728b;
        int i = 0;
        int i2 = 0;
        while (ncVar.f26729c > 0) {
            byte a = ncVar.mo15490a();
            if (a != 0) {
                if (a == 1 || a == 2) {
                    if (i != 0) {
                        if (i2 != 0) {
                        }
                        i2 = i;
                    }
                } else if (a != 9) {
                    switch (a) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                break;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                break;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            }
                            i2 = i;
                            break;
                    }
                } else {
                    continue;
                }
                return 1;
            } else if (i != 0) {
                if (i2 != 0) {
                }
                i2 = i;
            }
            return -1;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    private static int m19663b(CharSequence charSequence) {
        byte b;
        C1210nc ncVar = new C1210nc(charSequence);
        ncVar.f26729c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = ncVar.f26729c;
            if (i4 < ncVar.f26728b && i == 0) {
                char charAt = ncVar.f26727a.charAt(i4);
                ncVar.f26730d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(ncVar.f26727a, ncVar.f26729c);
                    ncVar.f26729c += Character.charCount(codePointAt);
                    b = Character.getDirectionality(codePointAt);
                } else {
                    ncVar.f26729c++;
                    b = C1210nc.m19658a(ncVar.f26730d);
                }
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            } else if (i != 0) {
                return 0;
            } else {
                if (i2 != 0) {
                    return i2;
                }
                while (ncVar.f26729c > 0) {
                    switch (ncVar.mo15490a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            break;
                        case 18:
                            i3++;
                            continue;
                    }
                    i3--;
                }
                return 0;
            }
        }
        if (i != 0) {
        }
    }

    /* renamed from: a */
    public static C1211nd m19661a() {
        return new C1209nb().mo15489a();
    }

    /* renamed from: a */
    public static C1211nd m19662a(Locale locale) {
        return new C1209nb(locale).mo15489a();
    }

    /* renamed from: b */
    static boolean m19664b(Locale locale) {
        return C1221nn.m19678a(locale) == 1;
    }

    /* renamed from: a */
    public final String mo15491a(String str) {
        return mo15492a(str, this.f26738h);
    }

    /* renamed from: a */
    public final String mo15492a(String str, C1213nf nfVar) {
        char c;
        String str2;
        if (str == null) {
            return null;
        }
        boolean a = nfVar.mo15493a(str, str.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str3 = "";
        if ((this.f26737g & 2) != 0) {
            boolean a2 = (!a ? C1220nm.f26744a : C1220nm.f26745b).mo15493a(str, str.length());
            if (!this.f26736f && (a2 || m19663b(str) == 1)) {
                str2 = f26734d;
            } else if (this.f26736f && (!a2 || m19663b(str) == -1)) {
                str2 = f26735e;
            } else {
                str2 = str3;
            }
            spannableStringBuilder.append((CharSequence) str2);
        }
        if (a != this.f26736f) {
            if (!a) {
                c = 8234;
            } else {
                c = 8235;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        boolean a3 = (!a ? C1220nm.f26744a : C1220nm.f26745b).mo15493a(str, str.length());
        if (!this.f26736f && (a3 || m19660a((CharSequence) str) == 1)) {
            str3 = f26734d;
        } else if (this.f26736f && (!a3 || m19660a((CharSequence) str) == -1)) {
            str3 = f26735e;
        }
        spannableStringBuilder.append((CharSequence) str3);
        return spannableStringBuilder.toString();
    }
}
