package p000;

import android.text.TextUtils;
import android.util.Log;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqx extends aqz {

    /* renamed from: a */
    public SliceItem f2033a;

    /* renamed from: b */
    public ArrayList f2034b = new ArrayList();

    /* renamed from: c */
    public ArrayList f2035c = new ArrayList();

    /* renamed from: d */
    public SliceItem f2036d;

    /* renamed from: e */
    public SliceItem f2037e;

    /* renamed from: g */
    private SliceItem f2038g;

    /* renamed from: h */
    private SliceItem f2039h;

    /* renamed from: i */
    private SliceItem f2040i;

    /* renamed from: j */
    private SliceItem f2041j;

    /* renamed from: k */
    private int f2042k;

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0190  */
    public aqx(SliceItem sliceItem) {
        super(sliceItem);
        boolean z;
        boolean z2;
        this.f2042k = 0;
        if (m1890b(sliceItem)) {
            List a = aqq.m1876a(sliceItem, (String) null, new String[]{"title"}, new String[]{null});
            if (a.size() > 0) {
                String str = ((SliceItem) a.get(0)).f1657b;
                if (("action".equals(str) && aqq.m1871a((SliceItem) a.get(0), "image") != null) || "slice".equals(str) || "long".equals(str) || "image".equals(str)) {
                    this.f2038g = (SliceItem) a.get(0);
                }
            }
            String[] strArr = {"shortcut", "title"};
            List a2 = aqq.m1876a(sliceItem, "slice", strArr, (String[]) null);
            a2.addAll(aqq.m1876a(sliceItem, "action", strArr, (String[]) null));
            if (a2.isEmpty() && "action".equals(sliceItem.f1657b) && sliceItem.mo2056f().mo2045b().size() == 1) {
                this.f2033a = sliceItem;
            } else if (this.f2038g != null && a2.size() > 1 && a2.get(0) == this.f2038g) {
                this.f2033a = (SliceItem) a2.get(1);
            } else if (a2.size() > 0) {
                this.f2033a = (SliceItem) a2.get(0);
            }
            ArrayList c = m1891c(sliceItem);
            if (c.size() == 1 && ("action".equals(((SliceItem) c.get(0)).f1657b) || "slice".equals(((SliceItem) c.get(0)).f1657b))) {
                if (!((SliceItem) c.get(0)).mo2050a("shortcut", "title") && m1890b((SliceItem) c.get(0))) {
                    sliceItem = (SliceItem) c.get(0);
                    c = m1891c(sliceItem);
                    z = true;
                    if ("range".equals(sliceItem.f1658c)) {
                        if (aqq.m1872a(sliceItem, "action", "range") != null && !z) {
                            c.remove(this.f2038g);
                            if (c.size() != 1) {
                                SliceItem a3 = aqq.m1872a(sliceItem, "action", "range");
                                this.f2036d = a3;
                                ArrayList c2 = m1891c(a3);
                                c2.remove(mo2308b());
                                c.remove(this.f2036d);
                                c.addAll(c2);
                            } else if (m1890b((SliceItem) c.get(0))) {
                                sliceItem = (SliceItem) c.get(0);
                                c = m1891c(sliceItem);
                                this.f2036d = sliceItem;
                                c.remove(mo2308b());
                            }
                        } else {
                            this.f2036d = sliceItem;
                        }
                    }
                    if ("selection".equals(sliceItem.f1658c)) {
                        this.f2037e = sliceItem;
                    }
                    if (c.size() > 0) {
                        SliceItem sliceItem2 = this.f2038g;
                        if (sliceItem2 != null) {
                            c.remove(sliceItem2);
                        }
                        SliceItem sliceItem3 = this.f2033a;
                        if (sliceItem3 != null) {
                            c.remove(sliceItem3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < c.size(); i++) {
                            SliceItem sliceItem4 = (SliceItem) c.get(i);
                            if ("text".equals(sliceItem4.f1657b)) {
                                SliceItem sliceItem5 = this.f2039h;
                                if ((sliceItem5 == null || !sliceItem5.mo2049a("title")) && sliceItem4.mo2049a("title") && !sliceItem4.mo2049a("summary")) {
                                    this.f2039h = sliceItem4;
                                } else if (this.f2040i == null && !sliceItem4.mo2049a("summary")) {
                                    this.f2040i = sliceItem4;
                                } else if (this.f2041j == null && sliceItem4.mo2049a("summary")) {
                                    this.f2041j = sliceItem4;
                                }
                            } else {
                                arrayList.add(sliceItem4);
                            }
                        }
                        if (m1888a(this.f2039h)) {
                            this.f2042k++;
                        }
                        if (m1888a(this.f2040i)) {
                            this.f2042k++;
                        }
                        SliceItem sliceItem6 = this.f2038g;
                        if (sliceItem6 == null || !"long".equals(sliceItem6.f1657b)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            SliceItem sliceItem7 = (SliceItem) arrayList.get(i2);
                            SliceItem a4 = aqq.m1871a(sliceItem7, "action");
                            if (!"long".equals(sliceItem7.f1657b)) {
                                if (a4 != null) {
                                    aqi aqi = new aqi(sliceItem7);
                                    if (aqi.f1993d) {
                                        this.f2035c.add(aqi);
                                    }
                                }
                                this.f2034b.add(sliceItem7);
                            } else if (!z2) {
                                this.f2034b.add(sliceItem7);
                                z2 = true;
                            }
                        }
                    }
                    if (super.mo2306a() && this.f2038g == null && this.f2033a == null && this.f2039h == null && this.f2040i == null && this.f2034b.size() <= 0 && this.f2036d == null && this.f2037e == null && "action".equals(this.f2043f.f1657b) && apf.m1792a(this.f2043f.mo2056f().f1654e, "see_more")) {
                        this.f2043f.mo2056f().mo2045b().isEmpty();
                        return;
                    }
                    return;
                }
            }
            z = false;
            if ("range".equals(sliceItem.f1658c)) {
            }
            if ("selection".equals(sliceItem.f1658c)) {
            }
            if (c.size() > 0) {
            }
            if (super.mo2306a()) {
                return;
            }
            return;
        }
        Log.w("RowContent", "Provided SliceItem is invalid for RowContent");
    }

    /* renamed from: a */
    private static boolean m1888a(SliceItem sliceItem) {
        return sliceItem != null && (sliceItem.mo2049a("partial") || !TextUtils.isEmpty(sliceItem.mo2051b()));
    }

    /* renamed from: b */
    private static boolean m1890b(SliceItem sliceItem) {
        int i;
        if (sliceItem != null && ("slice".equals(sliceItem.f1657b) || "action".equals(sliceItem.f1657b))) {
            List b = sliceItem.mo2056f().mo2045b();
            if (!sliceItem.mo2049a("see_more")) {
                i = 0;
            } else if (b.isEmpty()) {
                return true;
            } else {
                i = 0;
            }
            while (i < b.size()) {
                if (m1889a(sliceItem, (SliceItem) b.get(i))) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static ArrayList m1891c(SliceItem sliceItem) {
        ArrayList arrayList = new ArrayList();
        for (SliceItem sliceItem2 : sliceItem.mo2056f().mo2045b()) {
            if (m1889a(sliceItem, sliceItem2)) {
                arrayList.add(sliceItem2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m1889a(SliceItem sliceItem, SliceItem sliceItem2) {
        if (sliceItem2.mo2050a("keywords", "ttl", "last_updated", "horizontal") || "content_description".equals(sliceItem2.f1658c) || "selection_option_key".equals(sliceItem2.f1658c) || "selection_option_value".equals(sliceItem2.f1658c)) {
            return false;
        }
        String str = sliceItem2.f1657b;
        if ("image".equals(str) || "text".equals(str) || "long".equals(str) || "action".equals(str) || "input".equals(str) || "slice".equals(str) || ("int".equals(str) && "range".equals(sliceItem.f1658c))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final SliceItem mo2308b() {
        SliceItem sliceItem = this.f2036d;
        if (sliceItem == null) {
            return null;
        }
        List b = sliceItem.mo2056f().mo2045b();
        for (int i = 0; i < b.size(); i++) {
            if ("image".equals(((SliceItem) b.get(i)).f1657b)) {
                return (SliceItem) b.get(i);
            }
        }
        return null;
    }
}
