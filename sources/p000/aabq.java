package p000;

import android.content.Intent;

/* renamed from: aabq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabq {
    /* renamed from: a */
    public static int m21067a(Intent intent) {
        String str;
        int i;
        int i2;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        boolean z = false;
        if (str == null) {
            return 0;
        }
        if (!str.startsWith("com.")) {
            i = 0;
        } else {
            i = 4;
        }
        if (str.startsWith("android.", i)) {
            i2 = i + 8;
        } else if (!str.startsWith("google.", i)) {
            return 999;
        } else {
            i2 = i + 7;
        }
        int length = str.length();
        while (i2 < length) {
            char charAt = str.charAt(i2);
            char c = (char) (charAt | ' ');
            if (!((c >= 'a' && c <= 'z') || charAt == '.' || charAt == '_')) {
                if (charAt < '0' || charAt > '9' || z) {
                    return 999;
                }
                z = true;
            }
            i2++;
        }
        return Math.abs(str.hashCode() % 997) + 1;
    }
}
