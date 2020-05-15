package p000;

import android.content.res.Resources;
import android.util.TypedValue;
import java.util.Locale;

/* renamed from: bjkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkl {
    /* renamed from: a */
    static int m103777a(float f) {
        return (int) TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: a */
    public static int m103778a(bjka bjka, int i, int i2) {
        return m103780a((bwya) bjka.mo65324a(i, i2, bwya.class));
    }

    /* renamed from: a */
    static int m103779a(bjka bjka, int i, int i2, int i3) {
        if (!bjka.mo65327a(i, i2)) {
            return i3;
        }
        bwxy bwxy = (bwxy) bjka.mo65324a(i, i2, bwxy.class);
        int a = bwxx.m122418a(bwxy.f161430b);
        int i4 = 1;
        if (a == 0) {
            a = 1;
        }
        int i5 = a - 1;
        if (i5 == 1) {
            bwya bwya = bwxy.f161431c;
            if (bwya == null) {
                bwya = bwya.f161433d;
            }
            return m103780a(bwya);
        } else if (i5 == 2) {
            return -1;
        } else {
            if (i5 == 3) {
                return -2;
            }
            if (i5 != 4) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bwxx.m122418a(bwxy.f161430b);
                if (a2 != 0) {
                    i4 = a2;
                }
                objArr[0] = Integer.valueOf(i4 - 1);
                throw new IllegalArgumentException(String.format(locale, "Unknown size type: %s", objArr));
            }
            throw new IllegalArgumentException("Contextual Auto not yet supported");
        }
    }

    /* renamed from: a */
    public static int m103780a(bwya bwya) {
        return m103777a(bwya.f161437c);
    }
}
