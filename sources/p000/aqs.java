package p000;

import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqs {

    /* renamed from: a */
    public ArrayList f2016a = new ArrayList();

    /* renamed from: b */
    public int f2017b;

    /* renamed from: c */
    public boolean f2018c;

    /* renamed from: d */
    public int f2019d = -1;

    /* renamed from: e */
    public SliceItem f2020e;

    public aqs(SliceItem sliceItem) {
        String str = sliceItem.f1657b;
        if (sliceItem.mo2049a("shortcut") || (!"slice".equals(str) && !"action".equals(str))) {
            String str2 = sliceItem.f1657b;
            if (!"content_description".equals(sliceItem.f1658c)) {
                if (!sliceItem.mo2050a("keywords", "ttl", "last_updated") && ("text".equals(str2) || "long".equals(str2) || "image".equals(str2))) {
                    this.f2016a.add(sliceItem);
                }
            }
        } else {
            List b = sliceItem.mo2056f().mo2045b();
            if (b.size() == 1 && ("action".equals(((SliceItem) b.get(0)).f1657b) || "slice".equals(((SliceItem) b.get(0)).f1657b))) {
                SliceItem sliceItem2 = (SliceItem) b.get(0);
                b = ((SliceItem) b.get(0)).mo2056f().mo2045b();
            }
            "action".equals(str);
            this.f2017b = 0;
            char c = 0;
            for (int i = 0; i < b.size(); i++) {
                SliceItem sliceItem3 = (SliceItem) b.get(i);
                String str3 = sliceItem3.f1657b;
                if (!"content_description".equals(sliceItem3.f1658c)) {
                    if (this.f2017b < 2 && ("text".equals(str3) || "long".equals(str3))) {
                        this.f2017b++;
                        this.f2016a.add(sliceItem3);
                        SliceItem sliceItem4 = this.f2020e;
                        if (sliceItem4 == null || (!sliceItem4.mo2049a("title") && sliceItem3.mo2049a("title"))) {
                            this.f2020e = sliceItem3;
                        }
                    } else if (c <= 0 && "image".equals(sliceItem3.f1657b)) {
                        this.f2019d = aqi.m1856a(sliceItem3);
                        this.f2018c = true;
                        this.f2016a.add(sliceItem3);
                        c = 1;
                    }
                }
            }
        }
        mo2304a();
    }

    /* renamed from: a */
    public final boolean mo2304a() {
        return this.f2016a.size() > 0 && this.f2016a.size() <= 3;
    }
}
