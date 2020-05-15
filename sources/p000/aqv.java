package p000;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqv extends aqz {

    /* renamed from: a */
    public aqh f2028a;

    /* renamed from: b */
    public aqx f2029b;

    /* renamed from: c */
    public List f2030c;

    /* renamed from: d */
    private ArrayList f2031d = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a3, code lost:
        if (p000.aqq.m1880b(r4, "text", (java.lang.String) null) != null) goto L_0x00a7;
     */
    public aqv(Slice slice) {
        super(slice);
        List list;
        ArrayList arrayList;
        SliceItem sliceItem;
        aqi aqi;
        aqi aqi2;
        Slice slice2 = slice;
        if (this.f2043f != null) {
            SliceItem b = aqq.m1879b(slice2, "slice", "actions");
            String[] strArr = {"actions", "shortcut"};
            if (b != null) {
                list = aqq.m1876a(b, "slice", strArr, (String[]) null);
            } else {
                list = null;
            }
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(new aqi((SliceItem) list.get(i)));
                }
            } else {
                arrayList = null;
            }
            this.f2030c = arrayList;
            SliceItem a = aqq.m1870a(slice2, "slice", (String[]) null, new String[]{"list_item", "shortcut", "actions", "keywords", "ttl", "last_updated", "horizontal", "selection_option"});
            if (a != null && "slice".equals(a.f1657b)) {
                if (!a.mo2050a("actions", "keywords", "see_more")) {
                }
            }
            a = null;
            if (a != null) {
                aqx aqx = new aqx(a);
                this.f2029b = aqx;
                this.f2031d.add(aqx);
            }
            SliceItem a2 = aqq.m1869a(slice2, (String) null, (String) null, new String[]{"see_more"});
            if (a2 == null || !"slice".equals(a2.f1657b)) {
                a2 = null;
            } else {
                List b2 = a2.mo2056f().mo2045b();
                if (b2.size() == 1 && "action".equals(((SliceItem) b2.get(0)).f1657b)) {
                    a2 = (SliceItem) b2.get(0);
                }
            }
            if (a2 != null) {
                new aqx(a2);
            }
            List b3 = slice.mo2045b();
            int i2 = 0;
            while (i2 < b3.size()) {
                SliceItem sliceItem2 = (SliceItem) b3.get(i2);
                String str = sliceItem2.f1657b;
                List list2 = b3;
                if (!sliceItem2.mo2050a("actions", "see_more", "keywords", "ttl", "last_updated") && ("action".equals(str) || "slice".equals(str))) {
                    if (this.f2029b == null && !sliceItem2.mo2049a("list_item")) {
                        aqx aqx2 = new aqx(sliceItem2);
                        this.f2029b = aqx2;
                        this.f2031d.add(0, aqx2);
                    } else if (sliceItem2.mo2049a("list_item")) {
                        if (sliceItem2.mo2049a("horizontal")) {
                            this.f2031d.add(new aqt(sliceItem2));
                        } else {
                            this.f2031d.add(new aqx(sliceItem2));
                        }
                    }
                }
                i2++;
                b3 = list2;
            }
            if (this.f2029b == null && this.f2031d.size() > 0) {
                this.f2029b = (aqx) this.f2031d.get(0);
            }
            if (this.f2031d.size() > 0) {
                ArrayList arrayList2 = this.f2031d;
                if (arrayList2.get(arrayList2.size() - 1) instanceof aqt) {
                    ArrayList arrayList3 = this.f2031d;
                    aqt aqt = (aqt) arrayList3.get(arrayList3.size() - 1);
                }
            }
            aqx aqx3 = this.f2029b;
            if (aqx3 != null) {
                sliceItem = aqx3.f2033a;
            } else {
                sliceItem = null;
            }
            if (sliceItem == null) {
                aqi = null;
                sliceItem = aqq.m1881b(this.f2043f, "action", new String[]{"shortcut", "title"}, null);
            } else {
                aqi = null;
            }
            sliceItem = sliceItem == null ? aqq.m1880b(this.f2043f, "action", (String) aqi) : sliceItem;
            if (sliceItem != null) {
                aqi2 = new aqi(sliceItem);
            } else {
                aqi2 = aqi;
            }
            this.f2028a = aqi2;
        }
    }

    /* renamed from: a */
    public final boolean mo2306a() {
        return super.mo2306a() && this.f2031d.size() > 0;
    }
}
