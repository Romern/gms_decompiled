package p000;

import android.content.Context;
import android.content.pm.InstantAppResolveInfo;
import android.util.ArrayMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: adjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjo implements adjn {

    /* renamed from: a */
    private final adfs f61927a = new adfs("HashPrefixFilterImpl");

    /* renamed from: b */
    private final Context f61928b;

    /* renamed from: c */
    private final adjm f61929c;

    /* renamed from: d */
    private final adfm f61930d;

    /* renamed from: e */
    private final adik f61931e;

    /* renamed from: f */
    private final adfp f61932f;

    /* renamed from: g */
    private final adje f61933g;

    /* renamed from: h */
    private final adfd f61934h;

    public adjo(Context context, adjm adjm, adfm adfm, adik adik, adfp adfp, adje adje, adfd adfd) {
        this.f61928b = context;
        this.f61929c = adjm;
        this.f61930d = adfm;
        this.f61931e = adik;
        this.f61932f = adfp;
        this.f61933g = adje;
        this.f61934h = adfd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182  */
    /* renamed from: a */
    public final List mo33569a(int[] iArr) {
        int i;
        Iterator it;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int[] iArr2 = iArr;
        if (this.f61933g != null) {
            adfb a = this.f61934h.mo33411a();
            int length = iArr2.length;
            ArrayList arrayList = new ArrayList(length);
            C1225nr nrVar = new C1225nr();
            C1225nr nrVar2 = new C1225nr();
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            boolean a2 = this.f61932f.mo33420a();
            boolean c = cepr.f183236a.mo6606a().mo79568c();
            int i2 = 0;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                try {
                    bmxv a3 = this.f61929c.mo33587a(i4);
                    if (a3.mo66813a()) {
                        if (((Set) a3.mo66814b()).isEmpty()) {
                            nrVar.add(Integer.valueOf(i4));
                        } else {
                            nrVar2.add(Integer.valueOf(i4));
                            Iterator it2 = ((Set) a3.mo66814b()).iterator();
                            while (it2.hasNext()) {
                                String str = (String) it2.next();
                                adip a4 = this.f61933g.mo33559a(str);
                                if (a4 == null) {
                                    i = i2;
                                    this.f61927a.mo33426b("Domain entry missing for hash prefix match", new Object[0]);
                                } else {
                                    i = i2;
                                    if (c) {
                                        try {
                                            Iterator it3 = a4.f61829b.iterator();
                                            while (it3.hasNext()) {
                                                Iterator it4 = it3;
                                                adiy adiy = (adiy) it3.next();
                                                if (!arrayMap.containsKey(adiy.f61856a)) {
                                                    String str2 = adiy.f61856a;
                                                    arrayMap.put(str2, this.f61933g.mo33566b(str2));
                                                    it3 = it4;
                                                } else {
                                                    it3 = it4;
                                                }
                                            }
                                        } catch (IOException e) {
                                            this.f61927a.mo33425a(e, "Couldn't fetch domain filter metadata, aborting!", new Object[0]);
                                            this.f61930d.mo26009a(14);
                                            return bngx.m109376e();
                                        }
                                    }
                                    String b = adjk.m50643b(str);
                                    List a5 = adjp.m50665a(b, a4, arrayMap, a2);
                                    if (a5 == null) {
                                        this.f61927a.mo33426b("Found domain with no filters!", new Object[0]);
                                    } else {
                                        int size = a5.size();
                                        int i5 = length;
                                        int i6 = 0;
                                        while (i6 < size) {
                                            List list = a5;
                                            InstantAppResolveInfo instantAppResolveInfo = (InstantAppResolveInfo) a5.get(i6);
                                            ArrayMap arrayMap3 = arrayMap;
                                            String packageName = instantAppResolveInfo.getPackageName();
                                            if (arrayMap2.containsKey(packageName)) {
                                                z3 = ((Boolean) arrayMap2.get(packageName)).booleanValue();
                                                z2 = a2;
                                                z = c;
                                                it = it2;
                                            } else {
                                                try {
                                                    z4 = this.f61931e.mo33539g(packageName);
                                                    if (z4) {
                                                        z2 = a2;
                                                        try {
                                                            new Object[1][0] = packageName;
                                                        } catch (IOException e2) {
                                                            e = e2;
                                                        }
                                                    } else {
                                                        z2 = a2;
                                                    }
                                                    z = c;
                                                    it = it2;
                                                    z3 = z4;
                                                } catch (IOException e3) {
                                                    e = e3;
                                                    z2 = a2;
                                                    z4 = false;
                                                    z = c;
                                                    it = it2;
                                                    this.f61927a.mo33425a(e, "getUserPrefersBrowser", new Object[0]);
                                                    z3 = z4;
                                                    arrayMap2.put(packageName, Boolean.valueOf(z3));
                                                    if (!z3) {
                                                    }
                                                    i6++;
                                                    a5 = list;
                                                    arrayMap = arrayMap3;
                                                    a2 = z2;
                                                    c = z;
                                                    it2 = it;
                                                }
                                                arrayMap2.put(packageName, Boolean.valueOf(z3));
                                            }
                                            if (!z3) {
                                                a.mo33409a("HashPrefixFilter.excludedUserPrefersBrowser");
                                            } else if (!cepr.f183236a.mo6606a().mo79567b() || "instant.app".equals(b) || !adjk.m50642a(this.f61928b.getPackageManager(), packageName)) {
                                                i++;
                                                arrayList.add(instantAppResolveInfo);
                                            } else {
                                                a.mo33409a("HashPrefixFilter.excludedPersistentAppInstalled");
                                            }
                                            i6++;
                                            a5 = list;
                                            arrayMap = arrayMap3;
                                            a2 = z2;
                                            c = z;
                                            it2 = it;
                                        }
                                        i2 = i;
                                        length = i5;
                                    }
                                }
                                i2 = i;
                            }
                        }
                    }
                    i3++;
                    iArr2 = iArr;
                    length = length;
                    arrayMap = arrayMap;
                    a2 = a2;
                    c = c;
                } catch (IOException e4) {
                    this.f61927a.mo33425a(e4, "Couldn't fetch domains, aborting!", new Object[0]);
                    this.f61930d.mo26009a(14);
                    return bngx.m109376e();
                }
            }
            if (!nrVar.isEmpty() || !nrVar2.isEmpty()) {
                adjz.m50680a(nrVar, nrVar2, this.f61933g);
            }
            this.f61930d.mo33419b(i2, nrVar.f26758b);
            new Object[1][0] = Integer.valueOf(arrayList.size());
            if (arrayList.isEmpty() && nrVar.isEmpty()) {
                a.mo33409a("HashPrefixFilter.noMatch");
            } else if (!arrayList.isEmpty()) {
                a.mo33409a("HashPrefixFilter.firstPhaseMatch");
            }
            if (!nrVar.isEmpty()) {
                a.mo33409a("HashPrefixFilter.secondPhaseMatch");
            }
            return bngx.m109368a((Collection) arrayList);
        }
        this.f61927a.mo33426b("Not registered for domain filter, getDomainsForPrefixes skipped", new Object[0]);
        this.f61930d.mo26009a(15);
        return bngx.m109376e();
    }
}
