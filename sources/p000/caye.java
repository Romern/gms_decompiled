package p000;

import java.net.ProtocolException;

/* renamed from: caye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caye {

    /* renamed from: a */
    public final caui f176387a;

    /* renamed from: b */
    public final int f176388b;

    /* renamed from: c */
    public final String f176389c;

    public caye(caui caui, int i, String str) {
        this.f176387a = caui;
        this.f176388b = i;
        this.f176389c = str;
    }

    /* renamed from: a */
    public static caye m127533a(caun caun) {
        return new caye(caun.f176056b, caun.f176057c, caun.f176058d);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f176387a != caui.HTTP_1_0) {
            str = "HTTP/1.1";
        } else {
            str = "HTTP/1.0";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f176388b);
        if (this.f176389c != null) {
            sb.append(' ');
            sb.append(this.f176389c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static caye m127534a(String str) {
        caui caui;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                String valueOf = String.valueOf(str);
                throw new ProtocolException(valueOf.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                caui = caui.HTTP_1_0;
            } else if (charAt != 1) {
                String valueOf2 = String.valueOf(str);
                throw new ProtocolException(valueOf2.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf2));
            } else {
                caui = caui.HTTP_1_1;
            }
        } else if (str.startsWith("ICY ")) {
            caui = caui.HTTP_1_0;
            i = 4;
        } else {
            String valueOf3 = String.valueOf(str);
            throw new ProtocolException(valueOf3.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf3));
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            String valueOf4 = String.valueOf(str);
            throw new ProtocolException(valueOf4.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf4));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else if (str.charAt(i2) != ' ') {
                String valueOf5 = String.valueOf(str);
                throw new ProtocolException(valueOf5.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf5));
            } else {
                str2 = str.substring(i + 4);
            }
            return new caye(caui, parseInt, str2);
        } catch (NumberFormatException e) {
            String valueOf6 = String.valueOf(str);
            throw new ProtocolException(valueOf6.length() == 0 ? new String("Unexpected status line: ") : "Unexpected status line: ".concat(valueOf6));
        }
    }
}
