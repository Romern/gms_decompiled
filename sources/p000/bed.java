package p000;

import java.io.IOException;

/* renamed from: bed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bed {

    /* renamed from: a */
    final String[] f3063a;

    /* renamed from: b */
    final ciqi f3064b;

    private bed(String[] strArr, ciqi ciqi) {
        this.f3063a = strArr;
        this.f3064b = ciqi;
    }

    /* renamed from: a */
    public static bed m2754a(String... strArr) {
        String str;
        try {
            cipx[] cipxArr = new cipx[strArr.length];
            cipu cipu = new cipu();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = bef.f3065a;
                cipu.mo86316h(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str2.charAt(i3);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                    } else if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i2 < i3) {
                        cipu.mo86288a(str2, i2, i3);
                    }
                    cipu.mo86293b(str);
                    i2 = i3 + 1;
                }
                if (i2 < length) {
                    cipu.mo86288a(str2, i2, length);
                }
                cipu.mo86316h(34);
                cipu.mo86305e();
                cipxArr[i] = cipu.mo86322j();
            }
            return new bed((String[]) strArr.clone(), ciqi.m150841a(cipxArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
