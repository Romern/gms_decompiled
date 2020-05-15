package p000;

import android.support.p001v4.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqe extends aqf implements aqb {

    /* renamed from: a */
    private boolean f1984a;

    /* renamed from: b */
    private boolean f1985b;

    /* renamed from: c */
    private boolean f1986c;

    public aqe(apg apg, SliceSpec sliceSpec) {
        super(apg, sliceSpec, null);
    }

    /* renamed from: a */
    private final void m1846a(boolean z) {
        if (!this.f1984a) {
            this.f1984a = true;
            this.f1985b = true;
            this.f1986c = z;
        }
    }

    /* renamed from: b */
    public final void mo2294b() {
        this.f1988f.mo2268b(-1, "millis", "ttl");
    }

    /* renamed from: c */
    public final Slice mo2297c() {
        Slice c = super.mo2297c();
        SliceItem b = aqq.m1879b(c, (String) null, "partial");
        SliceItem b2 = aqq.m1879b(c, "slice", "list_item");
        String[] strArr = {"shortcut", "title"};
        SliceItem a = aqq.m1870a(c, "action", strArr, (String[]) null);
        ArrayList arrayList = new ArrayList();
        aqq.m1877a(aqq.m1874a(c), new aqj("slice", strArr), arrayList);
        if (b == null && b2 != null && a == null && arrayList.isEmpty()) {
            throw new IllegalStateException("A slice requires a primary action; ensure one of your builders has called #setPrimaryAction with a valid SliceAction.");
        }
        if (this.f1984a) {
            if (!this.f1985b) {
                throw new IllegalStateException("A slice cannot have the first row be constructed from a GridRowBuilder, consider using #setHeader.");
            } else if (!this.f1986c) {
                throw new IllegalStateException("A slice requires the first row to have some text.");
            }
        }
        return c;
    }

    /* renamed from: a */
    public final void mo2292a() {
        this.f1988f.mo2258a(-1, "color", new String[0]);
    }

    /* renamed from: a */
    public final void mo2295a(apg apg) {
        apg.mo2259a(System.currentTimeMillis(), "millis", "last_updated");
    }

    /* renamed from: a */
    public final void mo2293a(apx apx) {
        aqd aqd = new aqd(new apg(this.f1988f));
        aqd.f1979a = apx.f1963c;
        IconCompat iconCompat = apx.f1962b;
        if (iconCompat != null) {
            int i = apx.f1961a;
            apg apg = new apg(aqd.f1988f);
            apg.mo2261a(iconCompat, (String) null, aqf.m1852a(i, false));
            apg.mo2267a("title");
            aqd.f1982d = apg.mo2257a();
        }
        CharSequence charSequence = apx.f1964d;
        if (charSequence != null) {
            aqd.f1980b = new SliceItem(charSequence, "text", null, new String[]{"title"});
        }
        CharSequence charSequence2 = apx.f1965e;
        if (charSequence2 != null) {
            aqd.f1981c = new SliceItem(charSequence2, "text", null, new String[0]);
        }
        List list = apx.f1966f;
        List list2 = apx.f1967g;
        List list3 = apx.f1968h;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int intValue = ((Integer) list2.get(i2)).intValue();
            if (intValue == 0) {
                long longValue = ((Long) list.get(i2)).longValue();
                ArrayList arrayList = aqd.f1983e;
                apg apg2 = new apg(aqd.f1988f);
                apg2.mo2268b(longValue, null, new String[0]);
                arrayList.add(apg2.mo2257a());
            } else if (intValue == 1) {
                C1240of ofVar = (C1240of) list.get(i2);
                int intValue2 = ((Integer) ofVar.f26799b).intValue();
                boolean booleanValue = ((Boolean) list3.get(i2)).booleanValue();
                apg apg3 = new apg(aqd.f1988f);
                apg3.mo2261a((IconCompat) ofVar.f26798a, (String) null, aqf.m1852a(intValue2, booleanValue));
                if (booleanValue) {
                    apg3.mo2267a("partial");
                }
                aqd.f1983e.add(apg3.mo2257a());
            } else if (intValue == 2) {
                apz apz = (apz) list.get(i2);
                boolean booleanValue2 = ((Boolean) list3.get(i2)).booleanValue();
                apg apg4 = new apg(aqd.f1988f);
                if (booleanValue2) {
                    apg4.mo2267a("partial");
                }
                ArrayList arrayList2 = aqd.f1983e;
                aqi aqi = apz.f1970a;
                apg4.mo2267a("shortcut");
                apg4.mo2260a(aqi.f1990a, aqi.mo2300a(apg4).mo2257a(), aqi.mo2301b());
                arrayList2.add(apg4.mo2257a());
            }
        }
        m1846a(aqd.mo2296a());
        m1846a(aqd.mo2296a());
        aqd.f1988f.mo2267a("list_item");
        this.f1988f.mo2263a(aqd.mo2297c());
    }
}
