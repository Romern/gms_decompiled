package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: puw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class puw extends akz implements pmw {

    /* renamed from: i */
    private static final String f40314i = cdaa.m132383b();

    /* renamed from: j */
    private final qav f40315j = new qav("CastMediaRouteProvider");

    /* renamed from: k */
    private final pmh f40316k;

    /* renamed from: l */
    private final pmx f40317l;

    /* renamed from: m */
    private final pvv f40318m;

    /* renamed from: n */
    private final phy f40319n;

    /* renamed from: o */
    private final ScheduledExecutorService f40320o;

    /* renamed from: a */
    private static final akn m31425a(pnt pnt) {
        boolean z;
        int i = pnt.f39884g;
        int i2 = 0;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        CastDevice castDevice = pnt.f39878a;
        double b = qaf.m31749b(castDevice);
        int round = (int) Math.round(pnt.f39885h * b);
        if (i == 2 && !castDevice.mo17496a(6144)) {
            i2 = 1;
        }
        String str = castDevice.f29716d;
        String str2 = pnt.f39879b;
        int i3 = pnt.f39886i;
        if (castDevice.mo17500e() && (castDevice.f29721i == 0 || TextUtils.isEmpty(str2))) {
            str2 = castDevice.f29717e;
        }
        Bundle bundle = new Bundle();
        castDevice.mo17495a(bundle);
        int a = qaf.m31745a(castDevice);
        if (!castDevice.mo17500e() && i == 0) {
            i = 2;
        }
        akn akn = new akn(castDevice.mo17494a(), str);
        akn.mo888b(str2);
        akn.mo886b();
        akn.mo885a(z);
        akn.mo881a(i);
        akn.mo887b(a);
        akn.mo894g(i2);
        akn.mo893f(round);
        akn.mo895h((int) b);
        akn.mo891d(1);
        akn.mo884a(pnt.f39882e);
        akn.mo892e(i3);
        akn.mo882a(bundle);
        return akn;
    }

    /* renamed from: c */
    private static final String m31426c(String str) {
        return String.valueOf(str).concat("-member");
    }

    /* renamed from: b */
    public final void mo951b(akp akp) {
        int i;
        this.f40315j.mo23856a("in onDiscoveryRequestChanged: request=%s", akp);
        if (akp == null) {
            this.f40316k.mo23412a(null, Collections.emptyMap(), 0);
            return;
        }
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        if (!akp.mo920b()) {
            i = 2;
        } else {
            i = 0;
        }
        for (String str : akp.mo919a().mo974a()) {
            if (pwc.m31501c(str)) {
                boolean z = pie.f39205a;
            }
            if (((Set) hashMap.get(str)) == null && !pwc.m31501c(str)) {
                try {
                    C1240of a = pwc.m31497a(str);
                    i |= ((Integer) a.f26798a).intValue();
                    try {
                        Set set = (Set) a.f26799b;
                        if (set != null && !set.isEmpty()) {
                            hashMap.put(str, set);
                            hashSet.addAll(set);
                        }
                    } catch (IllegalArgumentException e) {
                        this.f40315j.mo23675c("Not a Cast compatible category: %s", str);
                    }
                } catch (IllegalArgumentException e2) {
                    this.f40315j.mo23675c("Not a Cast compatible category: %s", str);
                }
            }
        }
        this.f40316k.mo23412a(hashSet, hashMap, i);
    }

    public puw(Context context, ScheduledExecutorService scheduledExecutorService, pmx pmx, pvv pvv, pmh pmh, phy phy) {
        super(context, null);
        this.f40317l = pmx;
        this.f40318m = pvv;
        this.f40316k = pmh;
        this.f40319n = phy;
        this.f40320o = scheduledExecutorService;
    }

    /* renamed from: a */
    public final aky mo945a(String str) {
        sdo.m34967a("onCreateRouteController must be called on the main thread");
        CastDevice a = this.f40317l.mo23451a(str);
        if (a == null) {
            this.f40315j.mo23856a("onCreateRouteController: Unknown routeId: %s", str);
            return null;
        }
        this.f40315j.mo23673b("onCreateRouteController: %s", str);
        return new puu(this.f802a, a, this.f40320o, this.f40318m, this.f40317l, f40314i);
    }

    /* renamed from: a */
    public final aky mo946a(String str, String str2) {
        sdo.m34967a("onCreateRouteController must be called on the main thread");
        if (str.endsWith("-member")) {
            str = str.substring(0, str.length() - 7);
        }
        return new pwi(str, str2, this.f40318m, this.f40320o);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: a */
    public final void mo23283a(Collection collection, Collection collection2) {
        String str;
        String str2;
        String str3;
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            pnt pnt = (pnt) it.next();
            if (pnt.f39878a.mo17500e()) {
                arrayList.add(pnt);
            } else {
                arrayList2.add(pnt);
            }
        }
        if (arrayList.isEmpty()) {
            this.f40315j.mo23856a("No local devices found. Publishing GuestMode routes (%d)", Integer.valueOf(arrayList2.size()));
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pnt pnt2 = (pnt) arrayList.get(i2);
            CastDevice castDevice = pnt2.f39878a;
            akn a = m31425a(pnt2);
            ArrayList arrayList4 = new ArrayList();
            if (!cdaa.f180362a.mo6606a().mo77156e() || !castDevice.mo17496a(32)) {
                arrayList4.add(a.mo880a());
            } else {
                a.mo890c(1);
                ako a2 = a.mo880a();
                arrayList4.add(a2);
                akn akn = new akn(a2);
                akn.mo887b(0);
                akn.mo889c();
                akn.mo890c(Integer.MAX_VALUE);
                Set set = pnt2.f39883f;
                if (set.isEmpty()) {
                    akn.mo883a(String.valueOf(castDevice.mo17494a()).concat("-fakeMember"));
                } else {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        prc prc = (prc) it2.next();
                        akn.mo883a(m31426c(prc.f40101a));
                        double b = qaf.m31749b(castDevice);
                        Iterator it3 = it2;
                        int round = (int) Math.round(prc.f40104d * b);
                        if ((prc.f40103c & 6144) == 6144) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        akn akn2 = new akn(m31426c(prc.f40101a), prc.f40102b);
                        akn2.mo886b();
                        akn2.mo885a(false);
                        akn2.mo881a(2);
                        akn2.mo894g(i ^ 1);
                        akn2.mo893f(round);
                        akn2.mo895h((int) b);
                        akn2.mo891d(1);
                        akn2.mo884a(Collections.emptyList());
                        akn2.mo889c();
                        akn2.mo888b("Google Cast Multizone Member");
                        arrayList4.add(akn2.mo880a());
                        it2 = it3;
                    }
                }
                arrayList4.add(akn.mo880a());
            }
            arrayList3.addAll(arrayList4);
        }
        Iterator it4 = collection2.iterator();
        while (it4.hasNext()) {
            pnu pnu = (pnu) it4.next();
            String str4 = pnu.f39887j;
            akn a3 = m31425a(pnu);
            Bundle bundle = new Bundle();
            pnu.f39878a.mo17495a(bundle);
            bundle.putString("com.google.android.gms.cast.EXTRA_SESSION_ID", str4);
            a3.mo882a(bundle);
            arrayList3.add(a3.mo880a());
        }
        this.f40315j.mo23857a("onDevicesPublished with %d Cast devices and %d Dynamic Session devices", Integer.valueOf(collection.size()), Integer.valueOf(collection2.size()));
        this.f40319n.mo23129a(arrayList);
        this.f804c.post(new puv(this, arrayList3));
        this.f40315j.mo23856a("Published %d routes", Integer.valueOf(arrayList3.size()));
        StringBuilder sb = new StringBuilder();
        int size2 = arrayList3.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            ako ako = (ako) arrayList3.get(i4);
            sb.setLength(0);
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[6];
            i3++;
            objArr[0] = Integer.valueOf(i3);
            objArr[1] = ako.mo898c();
            objArr[2] = ako.mo896a();
            int n = ako.mo909n();
            if (n == 0) {
                str = "Unknown device";
            } else if (n == 1) {
                str = "TV";
            } else if (n == 2) {
                str = "Speaker";
            } else if (n != 3) {
                str = String.format(Locale.ROOT, "Unknown device type(%d)", Integer.valueOf(n));
            } else {
                str = "Bluetooth";
            }
            objArr[3] = str;
            int g = ako.mo902g();
            if (g == 0) {
                str2 = "Disconnected";
            } else if (g == 1) {
                str2 = "Connecting";
            } else if (g != 2) {
                str2 = String.format(Locale.ROOT, "Unknown connection state(%d)", Integer.valueOf(g));
            } else {
                str2 = "Connected";
            }
            objArr[4] = str2;
            objArr[5] = ako.mo899d();
            sb.append(String.format(locale, "No. %d Route: %s (%s) [%s] [%s] [%s]", objArr));
            boolean z = false;
            for (IntentFilter intentFilter : ako.mo905j()) {
                Iterator<String> categoriesIterator = intentFilter.categoriesIterator();
                while (categoriesIterator.hasNext()) {
                    String next = categoriesIterator.next();
                    if (pwc.m31498a(next, "android.media.intent.category.REMOTE_PLAYBACK")) {
                        if (next.startsWith("android.media.intent.category.REMOTE_PLAYBACK/")) {
                            sb.append((CharSequence) next, 45, next.length());
                        }
                        z = true;
                    } else if (pwc.m31498a(next, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK")) {
                        if (next.startsWith("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK/")) {
                            sb.append((CharSequence) next, 57, next.length());
                        }
                        z = true;
                    } else if (next.startsWith("com.google.android.gms.cast.CATEGORY_CAST")) {
                        String substring = next.substring(41);
                        if (TextUtils.isEmpty(substring)) {
                            str3 = "/Cast";
                        } else {
                            str3 = substring;
                        }
                        sb.append(str3);
                        if (pwc.m31501c(substring)) {
                            sb.append("/DynamicSession");
                        }
                    } else {
                        sb.append(next);
                    }
                }
            }
            if (z) {
                sb.append("/Media Filters");
            }
            this.f40315j.mo23856a("%s", sb.toString());
        }
    }
}
