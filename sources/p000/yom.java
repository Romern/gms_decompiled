package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: yom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yom extends yll {

    /* renamed from: c */
    private final boolean f54275c;

    /* renamed from: d */
    private final yfr f54276d;

    public yom(yok yok) {
        super(yok);
        String str = yok.f54273a;
        this.f54275c = yok.f54274b;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b("com.google.internal.goal");
        a.mo30420a(yfl.f53726a);
        a.mo30419a(str);
        this.f54276d = a.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        return "MergeAliveGoals";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54276d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0174, code lost:
        if (r4.mo30509a(0).mo30438e().length <= 0) goto L_0x0176;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x017d A[SYNTHETIC] */
    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        bmxy.m108581a(list);
        ArrayList arrayList = new ArrayList();
        if (this.f54275c) {
            HashMap hashMap = new HashMap();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ygx ygx = (ygx) list.get(i);
                String f = ygx.mo30474b().mo30427f();
                yol a = yol.m44495a(ygx.mo30474b().mo30422b().mo30409a(), f);
                if (f.endsWith(".sample")) {
                    yoi yoi = (yoi) a;
                    List c = bmyx.m108640a('.').mo66925c((CharSequence) yoi.f54271b);
                    int size2 = c.size() - 2;
                    while (size2 >= 0 && ((String) c.get(size2)).isEmpty()) {
                        size2--;
                    }
                    hashMap.put(yol.m44495a(yoi.f54270a, bmxr.m108543a('.').mo66874a((Iterable) c.subList(0, size2 + 1))), ygx);
                } else if (!hashMap.containsKey(a)) {
                    hashMap.put(a, ygx);
                }
            }
            Collection<ygx> values = hashMap.values();
            HashMap hashMap2 = new HashMap();
            for (ygx ygx2 : values) {
                String f2 = ygx2.mo30474b().mo30427f();
                if (hashMap2.containsKey(f2)) {
                    ygx ygx3 = (ygx) hashMap2.get(f2);
                    yhu yhu = (yhu) bnjd.m109591c(ygx2.mo30473a(), (Object) null);
                    yhu yhu2 = (yhu) bnjd.m109591c(ygx3.mo30473a(), (Object) null);
                    if (yhu == null || (yhu2 != null && yhu.mo30385a() <= yhu2.mo30385a())) {
                        ygx2 = ygx3;
                    }
                    hashMap2.put(f2, ygx2);
                } else {
                    hashMap2.put(f2, ygx2);
                }
            }
            list = bngx.m109368a(hashMap2.values());
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            yhu yhu3 = (yhu) bnjd.m109591c(((ygx) list.get(i2)).mo30473a(), (Object) null);
            if (yhu3 != null) {
                if (yhu3.mo30385a() != yhu3.mo30387b()) {
                    yfw yfw = (yfw) yhg;
                    long j = yfw.f53737a;
                    if (j < yfw.f53738b) {
                        if (yhu3.mo30385a() > yfw.f53737a || yhu3.mo30387b() < yfw.f53738b) {
                            yhu3 = null;
                        }
                    } else if (yhu3.mo30385a() > j || yhu3.mo30387b() <= j) {
                        yhu3 = null;
                    }
                }
                if (yhu3 == null) {
                    arrayList.add(yhu3);
                }
            }
            yhu3 = null;
            if (yhu3 == null) {
            }
        }
        Collections.sort(arrayList, yfp.f53730a);
        yhx a2 = yhy.m44167a(this.f54276d);
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            yfp.m43965a(a2, (yhu) arrayList.get(i3));
        }
        return a2.mo30520b();
    }
}
