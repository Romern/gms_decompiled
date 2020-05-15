package p000;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: advi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class advi {

    /* renamed from: a */
    public final double f62806a;

    /* renamed from: b */
    private final bnmu f62807b;

    private advi(double d, bnmu bnmu) {
        this.f62806a = d;
        this.f62807b = bnmu;
    }

    /* renamed from: a */
    public static advi m51235a(int i, List list) {
        int i2;
        float f;
        advx advx;
        int i3;
        int i4 = i;
        bnkd a = bnnc.m109833b().mo68102b().mo68101a();
        int size = list.size();
        double d = 0.0d;
        int i5 = 0;
        while (i5 < size) {
            bsjd bsjd = (bsjd) list.get(i5);
            if (i4 != 2) {
                bmxv f2 = bnjd.m109599f(bsjd.f144781b, new adve(i4));
                if (f2.mo66813a()) {
                    f = ((bsji) f2.mo66814b()).f144798b;
                } else {
                    i2 = size;
                    i5++;
                    i4 = i;
                    size = i2;
                }
            } else {
                f = 0.0f;
            }
            HashMap b = bnmt.m109803b(bnmt.m109799a(Collections.unmodifiableMap(bsjd.f144783d), advf.f62799a));
            if (b.containsKey(ceqz.m138033b())) {
                advx = (advx) b.get(ceqz.m138033b());
            } else if (TextUtils.equals(bsjd.f144780a, ceqz.m138034c()) || bmxx.m108578b(bsjd.f144780a).startsWith(cere.m138103d())) {
                advx = new advy(1.0f);
            } else {
                advx = advx.m51257a();
            }
            advg advg = new advg(b, advx);
            bxwc bxwc = bsjd.f144782c;
            int size2 = bxwc.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size2) {
                bsjc bsjc = (bsjc) bxwc.get(i6);
                Locale a2 = adwl.m51283a(bsjc.f144776a);
                if (a2 != null) {
                    int i8 = bsjc.f144777b;
                    i7 += i8;
                    i3 = size;
                    a.mo67268a(a2, new advh(bsjd.f144780a, i8, f, (advx) advg.apply(a2)));
                } else {
                    i3 = size;
                }
                i6++;
                size = i3;
            }
            i2 = size;
            double d2 = (double) (((float) i7) * f);
            Double.isNaN(d2);
            d += d2;
            i5++;
            i4 = i;
            size = i2;
        }
        return new advi(d, a);
    }

    /* renamed from: a */
    public final Collection mo33854a(Locale locale) {
        return this.f62807b.mo67127c(locale);
    }

    /* renamed from: a */
    public final Set mo33855a() {
        return this.f62807b.mo67316o();
    }
}
