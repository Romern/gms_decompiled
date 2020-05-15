package p000;

import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqt extends aqz {

    /* renamed from: a */
    private ArrayList f2021a = new ArrayList();

    /* renamed from: b */
    private SliceItem f2022b;

    /* renamed from: c */
    private int f2023c;

    /* renamed from: d */
    private boolean f2024d;

    /* renamed from: e */
    private int f2025e = 5;

    /* renamed from: g */
    private SliceItem f2026g;

    public aqt(SliceItem sliceItem) {
        super(sliceItem);
        boolean z;
        List b;
        SliceItem b2 = aqq.m1880b(sliceItem, (String) null, "see_more");
        this.f2022b = b2;
        if (b2 != null && "slice".equals(b2.f1657b) && (b = this.f2022b.mo2056f().mo2045b()) != null && b.size() > 0) {
            this.f2022b = (SliceItem) b.get(0);
        }
        aqq.m1881b(sliceItem, "slice", new String[]{"shortcut", "title"}, new String[]{"actions"});
        if ("slice".equals(sliceItem.f1657b)) {
            List b3 = sliceItem.mo2056f().mo2045b();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < b3.size(); i++) {
                SliceItem sliceItem2 = (SliceItem) b3.get(i);
                if (aqq.m1880b(sliceItem2, (String) null, "see_more") == null) {
                    if (!sliceItem2.mo2050a("shortcut", "see_more", "keywords", "ttl", "last_updated")) {
                        z = false;
                        if (!"content_description".equals(sliceItem2.f1658c) && !z) {
                            arrayList.add(sliceItem2);
                        }
                    }
                }
                z = true;
                arrayList.add(sliceItem2);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                SliceItem sliceItem3 = (SliceItem) arrayList.get(i2);
                if (!"content_description".equals(sliceItem3.f1658c)) {
                    m1886a(new aqs(sliceItem3));
                }
            }
        } else {
            m1886a(new aqs(sliceItem));
        }
        if (super.mo2306a()) {
            this.f2021a.size();
        }
    }

    /* renamed from: a */
    private final void m1886a(aqs aqs) {
        SliceItem sliceItem;
        if (aqs.mo2304a()) {
            if (this.f2026g == null && (sliceItem = aqs.f2020e) != null) {
                this.f2026g = sliceItem;
            }
            this.f2021a.add(aqs);
            if (aqs.f2016a.size() == 1) {
                "image".equals(((SliceItem) aqs.f2016a.get(0)).f1657b);
            }
            this.f2023c = Math.max(this.f2023c, aqs.f2017b);
            this.f2024d |= aqs.f2018c;
            int i = this.f2025e;
            this.f2025e = i != 5 ? Math.max(i, aqs.f2019d) : aqs.f2019d;
        }
    }
}
