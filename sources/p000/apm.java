package p000;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apm {

    /* renamed from: a */
    private Slice f1931a;

    /* renamed from: b */
    private aqv f1932b;

    /* renamed from: c */
    private aqx f1933c;

    /* renamed from: d */
    private List f1934d;

    private apm(Slice slice) {
        aqx aqx;
        SliceItem sliceItem;
        SliceItem sliceItem2;
        SliceItem sliceItem3;
        int i;
        aqi aqi;
        this.f1931a = slice;
        SliceItem b = aqq.m1879b(slice, "long", "ttl");
        if (b != null) {
            b.mo2057g();
        }
        SliceItem b2 = aqq.m1879b(slice, "long", "last_updated");
        if (b2 != null) {
            b2.mo2057g();
        }
        aqv aqv = new aqv(slice);
        this.f1932b = aqv;
        this.f1933c = aqv.f2029b;
        aqx aqx2 = aqv.f2029b;
        List list = aqv.f2030c;
        if (aqx2 != null) {
            SliceItem sliceItem4 = aqx2.f2033a;
            if (sliceItem4 != null) {
                aqi = new aqi(sliceItem4);
            } else {
                aqi = null;
            }
            SliceItem sliceItem5 = aqx2.f2036d;
            if (sliceItem5 != null) {
                "action".equals(sliceItem5.f1657b);
            } else if (aqx2.f2037e == null && (aqi == null || !aqi.f1993d)) {
                if (list == null) {
                    aqx2.f2035c.size();
                } else {
                    int i2 = 0;
                    while (i2 < list.size() && !((aqh) list.get(i2)).mo2289c()) {
                        i2++;
                    }
                }
            }
        }
        aqv aqv2 = this.f1932b;
        if (aqv2.f2028a == null && (sliceItem = aqv2.f2043f) != null) {
            SliceItem b3 = aqq.m1881b(sliceItem, "action", new String[]{"title", "shortcut"}, null);
            if (b3 != null) {
                sliceItem3 = aqq.m1880b(b3, "image", "title");
                sliceItem2 = aqq.m1880b(b3, "text", (String) null);
            } else {
                sliceItem3 = null;
                sliceItem2 = null;
            }
            b3 = b3 == null ? aqq.m1880b(aqv2.f2043f, "action", (String) null) : b3;
            sliceItem3 = sliceItem3 == null ? aqq.m1880b(aqv2.f2043f, "image", "title") : sliceItem3;
            sliceItem2 = sliceItem2 == null ? aqq.m1880b(aqv2.f2043f, "text", "title") : sliceItem2;
            sliceItem3 = sliceItem3 == null ? aqq.m1880b(aqv2.f2043f, "image", (String) null) : sliceItem3;
            sliceItem2 = sliceItem2 == null ? aqq.m1880b(aqv2.f2043f, "text", (String) null) : sliceItem2;
            if (sliceItem3 != null) {
                i = aqi.m1856a(sliceItem3);
            } else {
                i = 5;
            }
            if (!(sliceItem3 == null || b3 == null || sliceItem2 == null)) {
                new aqi(b3.mo2054d(), sliceItem3.mo2053c(), i, sliceItem2.mo2051b());
            }
        }
        List list2 = this.f1932b.f2030c;
        this.f1934d = list2;
        if (list2 == null && (aqx = this.f1933c) != null) {
            if (aqq.m1883b(aqx.f2043f, "list_item")) {
                ArrayList arrayList = this.f1933c.f2034b;
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (aqq.m1871a((SliceItem) arrayList.get(i3), "action") != null) {
                        arrayList2.add(new aqi((SliceItem) arrayList.get(i3)));
                    }
                }
                if (arrayList2.size() > 0) {
                    this.f1934d = arrayList2;
                }
            }
        }
    }

    /* renamed from: a */
    public static apm m1814a(Slice slice) {
        return new apm(slice);
    }

    /* renamed from: a */
    public final int mo2271a() {
        SliceItem b = aqq.m1879b(this.f1931a, (String) null, "partial");
        if (this.f1932b.mo2306a()) {
            return b == null ? 2 : 1;
        }
        return 0;
    }
}
