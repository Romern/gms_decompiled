package p000;

import android.text.TextUtils;

/* renamed from: bjyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjyv {
    /* renamed from: a */
    public static char m104933a(int i, int i2, boolean z, boolean z2) {
        int i3 = i % i2;
        if (z) {
            i3 = i2 - i3;
        }
        if (!z2) {
            i3 %= 10;
        } else if (i3 > 9) {
            i3 = 0;
        }
        return (char) (i3 + 48);
    }

    /* renamed from: a */
    public static int m104934a(String str, int[] iArr, boolean z) {
        if (str.length() != iArr.length) {
            throw new IllegalArgumentException("Length mismatch between digit string and multiplier array");
        } else if (TextUtils.isDigitsOnly(str)) {
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = (str.charAt(i2) - '0') * iArr[i2];
                if (!z) {
                    i += charAt;
                } else {
                    while (charAt > 0) {
                        i += charAt % 10;
                        charAt /= 10;
                    }
                }
            }
            return i;
        } else {
            throw new IllegalArgumentException("Non-digit char is found in string");
        }
    }
}
