package p000;

/* renamed from: becb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class becb {

    /* renamed from: a */
    private int f106893a;

    /* renamed from: a */
    private static boolean m91757a(char c) {
        return "\\[]?*(|)^$.{}+".indexOf(c) > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo58544a(char[] cArr, StringBuilder sb, boolean z) {
        int length = cArr.length;
        loop0:
        while (true) {
            int i = this.f106893a;
            if (i >= length) {
                return i == length;
            }
            int i2 = i + 1;
            this.f106893a = i2;
            char c = cArr[i];
            if (c == '*') {
                sb.append(".*");
            } else if (c == ',') {
                if (z) {
                    c = '|';
                }
                sb.append(c);
            } else if (c == '?') {
                sb.append('.');
            } else if (c == '{') {
                sb.append('(');
                if (!mo58544a(cArr, sb, true)) {
                    return false;
                }
            } else if (c != '}') {
                if (c == '[') {
                    sb.append(c);
                    int i3 = this.f106893a;
                    if (i3 == length) {
                        break;
                    }
                    this.f106893a = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == '!') {
                        sb.append('^');
                        int i4 = this.f106893a;
                        if (i4 == length) {
                            break;
                        }
                        this.f106893a = i4 + 1;
                        c2 = cArr[i4];
                    }
                    if (c2 == ']') {
                        sb.append(']');
                        int i5 = this.f106893a;
                        if (i5 != length) {
                            this.f106893a = i5 + 1;
                            c2 = cArr[i5];
                        } else {
                            continue;
                        }
                    }
                    while (c2 != ']') {
                        sb.append(c2);
                        int i6 = this.f106893a;
                        if (i6 == length) {
                            break loop0;
                        }
                        this.f106893a = i6 + 1;
                        c2 = cArr[i6];
                    }
                    sb.append(']');
                } else if (c != '\\') {
                    if (m91757a(c)) {
                        sb.append('\\');
                    }
                    sb.append(c);
                } else if (i2 == length) {
                    return false;
                } else {
                    this.f106893a = i2 + 1;
                    char c3 = cArr[i2];
                    if (m91757a(c3)) {
                        sb.append('\\');
                    }
                    sb.append(c3);
                }
            } else if (!z) {
                sb.append("\\}");
            } else {
                sb.append(')');
                return true;
            }
        }
        return false;
    }
}
