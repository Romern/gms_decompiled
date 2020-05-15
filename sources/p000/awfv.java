package p000;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: awfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfv {

    /* renamed from: a */
    private static final char f94282a = "|".charAt(0);

    /* renamed from: b */
    private final ArrayList f94283b = new ArrayList();

    public awfv(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            char c = f94282a;
            if (charAt == c) {
                int i2 = i + 1;
                int indexOf = str.indexOf(c, i2);
                if (indexOf != -1) {
                    try {
                        int parseInt = Integer.parseInt(str.substring(i2, indexOf));
                        int i3 = indexOf + 1;
                        i = parseInt + i3;
                        if (i <= length) {
                            this.f94283b.add(str.substring(i3, i));
                        } else {
                            throw new IllegalArgumentException(String.format(Locale.US, "Part length overflow in storageKey %s", str));
                        }
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Non integer part length in storageKey %s", str), e);
                    }
                } else {
                    throw new IllegalArgumentException(String.format(Locale.US, "Missing part length end in storageKey %s", str));
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Missing part start in storageKey %s", str));
            }
        }
    }

    /* renamed from: a */
    public final String mo52111a() {
        return (String) this.f94283b.get(1);
    }
}
