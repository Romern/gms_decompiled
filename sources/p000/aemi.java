package p000;

import java.util.Arrays;
import java.util.Locale;

@Deprecated
/* renamed from: aemi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aemi implements rjh, rjj {

    /* renamed from: a */
    public final String f63519a;

    /* renamed from: b */
    public final String f63520b;

    /* renamed from: c */
    public final int f63521c;

    /* renamed from: d */
    public final String f63522d;

    /* renamed from: e */
    public final Locale f63523e = null;

    public aemi(aemh aemh) {
        this.f63519a = aemh.f63515a;
        this.f63520b = aemh.f63516b;
        this.f63521c = aemh.f63517c;
        this.f63522d = aemh.f63518d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aemi) {
            aemi aemi = (aemi) obj;
            if (sdg.m34949a(this.f63519a, aemi.f63519a) && sdg.m34949a(this.f63520b, aemi.f63520b) && sdg.m34949a(Integer.valueOf(this.f63521c), Integer.valueOf(aemi.f63521c)) && sdg.m34949a(this.f63522d, aemi.f63522d)) {
                Locale locale = aemi.f63523e;
                if (sdg.m34949a(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f63519a, this.f63520b, Integer.valueOf(this.f63521c), this.f63522d, null});
    }
}
