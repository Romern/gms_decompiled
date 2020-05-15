package p000;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bgst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgst {

    /* renamed from: a */
    private final List f117458a = new ArrayList();

    /* renamed from: b */
    private final boolean f117459b;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public bgst(String str, boolean z) {
        this.f117459b = z;
        for (String str2 : bmyx.m108640a(';').mo66918a((CharSequence) str)) {
            String trim = str2.trim();
            if (!trim.isEmpty()) {
                List c = bmyx.m108640a(',').mo66925c((CharSequence) trim);
                if (c.size() == 4) {
                    this.f117458a.add(new bgss(Integer.parseInt((String) c.get(0)), Double.parseDouble((String) c.get(1)), Double.parseDouble((String) c.get(2)), Double.parseDouble((String) c.get(3))));
                }
            }
        }
    }

    /* renamed from: b */
    private static final long m99871b(Location location, long j) {
        return ayvd.m84899a(ayvd.m84895a(location.getLatitude(), location.getLongitude()), (int) j);
    }

    /* renamed from: a */
    public final bgsr mo63138a(Location location, long j) {
        int i = 0;
        if (this.f117459b) {
            return new bgsr(true, 0, m99871b(location, j));
        }
        this.f117458a.size();
        List list = this.f117458a;
        int size = list.size();
        while (i < size) {
            bgss bgss = (bgss) list.get(i);
            Location location2 = bgss.f117456b;
            double d = bgss.f117457c;
            float distanceTo = location2.distanceTo(location);
            double d2 = bgss.f117457c;
            bgss.f117456b.getLatitude();
            bgss.f117456b.getLongitude();
            i++;
            if (((double) distanceTo) <= d2) {
                return new bgsr(true, bgss.f117455a, m99871b(location, j));
            }
        }
        return bgsr.f117451a;
    }
}
