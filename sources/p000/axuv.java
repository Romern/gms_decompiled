package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: axuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axuv implements axxc, axxg, ayjm {

    /* renamed from: a */
    public static axuv f96418a;

    /* renamed from: i */
    private static final Charset f96419i = Charset.forName("UTF-8");

    /* renamed from: j */
    private static final Uri f96420j = Uri.parse("wear:/capabilities/");

    /* renamed from: b */
    public final Context f96421b;

    /* renamed from: c */
    public final PackageManager f96422c;

    /* renamed from: d */
    public axxv f96423d;

    /* renamed from: e */
    public axzm f96424e;

    /* renamed from: f */
    public final axyp f96425f = new axyp(null);

    /* renamed from: g */
    public final List f96426g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public final axzt f96427h;

    /* renamed from: k */
    private final axue f96428k;

    /* renamed from: l */
    private final axut f96429l;

    /* renamed from: m */
    private final boolean f96430m;

    /* renamed from: n */
    private final Object f96431n = new Object();

    /* renamed from: o */
    private Map f96432o = new HashMap();

    public axuv(Context context, axue axue, axzt axzt, axut axut, boolean z) {
        bmxy.m108581a(context);
        this.f96421b = context;
        bmxy.m108581a(axue);
        this.f96428k = axue;
        bmxy.m108581a(axzt);
        this.f96427h = axzt;
        bmxy.m108581a(axut);
        this.f96429l = axut;
        this.f96422c = this.f96421b.getPackageManager();
        this.f96430m = z;
    }

    /* renamed from: a */
    static Uri.Builder m83261a(axue axue, String str) {
        Uri.Builder a = m83262a(axue.f96377a, str);
        a.appendPath(axue.f96379c);
        return a;
    }

    /* renamed from: b */
    static Uri.Builder m83267b(axue axue, String str, String str2) {
        Uri.Builder a = m83261a(axue, str);
        a.appendPath(Uri.encode(str2));
        return a;
    }

    /* renamed from: c */
    private static String m83269c(axxi axxi) {
        return axxi.f96647b.f96641c.getHost();
    }

    /* renamed from: a */
    public final void mo53600a(axzf axzf) {
    }

    /* renamed from: a */
    public final void mo53601a(axzf axzf, int i, boolean z) {
    }

    /* renamed from: a */
    static Uri.Builder m83262a(String str, String str2) {
        Uri.Builder buildUpon = f96420j.buildUpon();
        if (str2 != null) {
            buildUpon.authority(str2);
        }
        buildUpon.appendPath(str);
        return buildUpon;
    }

    /* renamed from: b */
    static axue m83268b(axxi axxi) {
        List<String> pathSegments = axxi.f96647b.f96641c.getPathSegments();
        return axue.m83239a(pathSegments.get(1), pathSegments.get(2));
    }

    /* renamed from: c */
    private final void m83270c(axue axue, String str) {
        axxb axxb = new axxb(str, mo53606b(axue, str, 1));
        for (aygp aygp : this.f96426g) {
            axue b = aygp.f97543a.f111030x.mo53996b(axue, axxb.f96636b);
            if (Log.isLoggable("WearableService", 2)) {
                String valueOf = String.valueOf(b);
                String str2 = axxb.f96636b;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(str2).length());
                sb.append("onConnectedCapabilityChanged: ");
                sb.append(valueOf);
                sb.append(", ");
                sb.append(str2);
                Log.v("WearableService", sb.toString());
            }
            aygp.f97543a.mo60325a(b, new aygo("onConnectedCapabilityChanged", new Intent("com.google.android.gms.wearable.CAPABILITY_CHANGED", ayao.m83709a("", axxb.f96636b)).setPackage(b.f96378b), ayfy.m83946a(axxb.f96636b, axxb.f96635a), axxb));
        }
    }

    /* renamed from: b */
    public final Cursor mo53605b(axue axue, String str) {
        return this.f96423d.mo53741b(this.f96428k, m83261a(axue, str).build());
    }

    /* renamed from: b */
    public final Set mo53606b(axue axue, String str, int i) {
        Set set = (Set) mo53598a(axue, str, i).get(str);
        return set == null ? new HashSet() : set;
    }

    /* renamed from: a */
    public static axus m83263a(axxf axxf) {
        byte[] bArr = axxf.f96642d;
        if (bArr == null || bArr.length == 0) {
            return axus.DYNAMIC;
        }
        String str = new String(bArr, 0, 1, f96419i);
        if (axus.STATIC.f96416c.equals(str)) {
            return axus.STATIC;
        }
        if (axus.DYNAMIC.f96416c.equals(str)) {
            return axus.DYNAMIC;
        }
        Log.w("CapabilityService", String.format("Unknown capability type \"%s\". Defaulting to dynamic.", str));
        return axus.DYNAMIC;
    }

    /* renamed from: b */
    public final void mo53607b(String str) {
        if (!TextUtils.isEmpty(str)) {
            axyo a = this.f96425f.mo53771a(str);
            try {
                int i = ((axxp) this.f96423d.mo53742b(this.f96428k, m83262a(str, this.f96427h.mo53808b().f96814a).build(), true).get()).f96670a;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Log.w("CapabilityService", "removePackageCapabilitiesForNode: the request was canceled");
            } catch (ExecutionException e2) {
                Log.w("CapabilityService", "removePackageCapabilitiesForNode: failed with unexpected exception, ", e2);
            } catch (Throwable th) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
                throw th;
            }
            a.close();
        } else if (Log.isLoggable("CapabilityService", 5)) {
            Log.w("CapabilityService", "handlePackageRemoved with empty package name");
        }
    }

    /* renamed from: a */
    private final ayac m83264a(String str, boolean z, boolean z2) {
        ayac a;
        axzm axzm = this.f96424e;
        synchronized (axzm.f96831c) {
            axzm.mo53795c();
            a = axzm.f96833e.mo53825a(str);
        }
        if (a != null) {
            if ((!z || a.f96885b != 0) && (!z2 || a.f96885b != Integer.MAX_VALUE)) {
                return a;
            }
            return null;
        } else if (z2) {
            return null;
        } else {
            ayac ayac = new ayac(new axzf(str, str), false);
            ayac.f96885b = Integer.MAX_VALUE;
            return ayac;
        }
    }

    /* renamed from: c */
    public final Cursor mo53608c(axue axue, String str, String str2) {
        return this.f96423d.mo53726a(this.f96428k, m83267b(axue, str2, str).build());
    }

    /* renamed from: c */
    public final Cursor mo53609c(String str) {
        Uri.Builder buildUpon = f96420j.buildUpon();
        buildUpon.authority(str);
        return this.f96423d.mo53741b(this.f96428k, buildUpon.build());
    }

    /* renamed from: a */
    public static String m83265a(axxi axxi) {
        return Uri.decode(axxi.f96647b.f96641c.getLastPathSegment());
    }

    /* renamed from: a */
    private static final void m83266a(Map map, Map map2, Set set) {
        for (Map.Entry entry : map.entrySet()) {
            ayac ayac = (ayac) map2.get(entry.getKey());
            if (ayac != null) {
                ayac ayac2 = (ayac) entry.getValue();
                if (ayac2.equals(ayac) && ayac2.f96885b == ayac.f96885b) {
                }
            }
            set.add((String) entry.getKey());
        }
    }

    /* renamed from: a */
    public final axue mo53597a(String str) {
        try {
            return axug.m83241a(this.f96421b, str);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Could not generate AppKey for package \"");
            sb.append(str);
            sb.append("\"");
            Log.e("CapabilityService", sb.toString());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25);
            sb2.append("Could not find package \"");
            sb2.append(str);
            sb2.append("\"");
            Log.e("CapabilityService", sb2.toString());
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axuv.a(java.lang.String, boolean, boolean):ayac
     arg types: [java.lang.String, int, boolean]
     candidates:
      axuv.a(java.util.Map, java.util.Map, java.util.Set):void
      axuv.a(axue, java.lang.String, int):java.util.Map
      axuv.a(axzf, int, boolean):void
      axuv.a(ssb, boolean, boolean):void
      axuv.a(axue, java.lang.String, java.lang.String):boolean
      axxc.a(axzf, int, boolean):void
      ayjm.a(ssb, boolean, boolean):void
      axuv.a(java.lang.String, boolean, boolean):ayac */
    /* renamed from: a */
    public final Map mo53598a(axue axue, String str, int i) {
        Cursor cursor;
        boolean z;
        HashMap hashMap = new HashMap();
        if (str != null) {
            cursor = mo53608c(axue, str, null);
        } else {
            cursor = mo53605b(axue, null);
        }
        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                axxi a = axxj.m83472a(cursor);
                String c = m83269c(a);
                if (i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                ayac a2 = m83264a(c, true, z);
                if (a2 != null) {
                    String a3 = m83265a(a);
                    Set set = (Set) hashMap.get(a3);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(a3, set);
                    }
                    set.add(a2);
                }
            }
            return hashMap;
        } finally {
            cursor.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r3.isEmpty() != false) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c A[Catch:{ all -> 0x009c, all -> 0x00a3, all -> 0x00a8 }, LOOP:1: B:27:0x0076->B:29:0x007c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090 A[Catch:{ all -> 0x009c, all -> 0x00a3, all -> 0x00a8 }, LOOP:2: B:31:0x008a->B:33:0x0090, LOOP_END] */
    /* renamed from: a */
    public final void mo53599a(axue axue) {
        Cursor b;
        axyo a = this.f96425f.mo53771a(axue.f96377a);
        try {
            Set a2 = this.f96429l.mo53596a(axue);
            HashSet<String> hashSet = new HashSet(a2);
            HashSet<String> hashSet2 = new HashSet();
            b = mo53605b(axue, this.f96427h.mo53808b().f96814a);
            b.moveToFirst();
            while (!b.isAfterLast()) {
                axxi a3 = axxj.m83472a(b);
                String a4 = m83265a(a3);
                if (m83263a(a3.f96647b) == axus.STATIC) {
                    if (!a2.contains(a4)) {
                        hashSet2.add(a4);
                    } else {
                        hashSet.remove(a4);
                    }
                }
            }
            if (b != null) {
                b.close();
            }
            if (!a2.isEmpty()) {
                String str = this.f96427h.mo53808b().f96814a;
                for (String str2 : hashSet2) {
                    mo53604a(axue, str, str2);
                }
                for (String str3 : hashSet) {
                    mo53603a(axue, str, axus.STATIC, str3);
                }
            } else {
                if (hashSet.isEmpty()) {
                }
                String str4 = this.f96427h.mo53808b().f96814a;
                while (r3.hasNext()) {
                }
                while (r2.hasNext()) {
                }
            }
            a.close();
            return;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo53557a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            axxi axxi = (axxi) arrayList.get(i);
            String c = m83269c(axxi);
            if (this.f96427h.mo53808b().f96814a.equals(c)) {
                if (Log.isLoggable("CapabilityService", 3)) {
                    Log.d("CapabilityService", "onDataItemChanged - local node, skipping");
                }
            } else if (!axxi.f96647b.f96640b.startsWith("/capabilities/")) {
                if (Log.isLoggable("CapabilityService", 3)) {
                    Log.d("CapabilityService", "onDataItemChanged - not capability, skipping");
                }
            } else if (axxi.f96648c || this.f96424e.mo53788b(c)) {
                m83270c(m83268b(axxi), m83265a(axxi));
            } else if (Log.isLoggable("CapabilityService", 3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51);
                sb.append("onDataItemChanged - node not connected (");
                sb.append(c);
                sb.append("), skipping");
                Log.d("CapabilityService", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo53602a(Collection collection) {
        Set<String> set;
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ayac ayac = (ayac) it.next();
            hashMap.put(ayac.f96884a.f96814a, ayac);
        }
        synchronized (this.f96431n) {
            Map map = this.f96432o;
            if (map.isEmpty()) {
                set = hashMap.keySet();
            } else if (!hashMap.isEmpty()) {
                set = new HashSet();
                m83266a(map, hashMap, set);
                m83266a(hashMap, map, set);
            } else {
                set = map.keySet();
            }
            this.f96432o = hashMap;
        }
        if (!set.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (String str : set) {
                Cursor c = mo53609c(str);
                try {
                    c.moveToFirst();
                    while (!c.isAfterLast()) {
                        axxi a = axxj.m83472a(c);
                        axue b = m83268b(a);
                        String a2 = m83265a(a);
                        Set set2 = (Set) hashMap2.get(b);
                        if (set2 == null) {
                            set2 = new HashSet();
                            hashMap2.put(b, set2);
                        }
                        set2.add(a2);
                    }
                    if (c != null) {
                        c.close();
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
            for (Map.Entry entry : hashMap2.entrySet()) {
                axue axue = (axue) entry.getKey();
                for (String str2 : (Set) entry.getValue()) {
                    m83270c(axue, str2);
                }
            }
            return;
        }
        return;
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axuv.a(java.lang.String, boolean, boolean):ayac
     arg types: [java.lang.String, int, int]
     candidates:
      axuv.a(java.util.Map, java.util.Map, java.util.Set):void
      axuv.a(axue, java.lang.String, int):java.util.Map
      axuv.a(axzf, int, boolean):void
      axuv.a(ssb, boolean, boolean):void
      axuv.a(axue, java.lang.String, java.lang.String):boolean
      axxc.a(axzf, int, boolean):void
      ayjm.a(ssb, boolean, boolean):void
      axuv.a(java.lang.String, boolean, boolean):ayac */
    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        ssb.mo26034a();
        ssb.println("Capabilities:");
        ssb.mo26034a();
        TreeMap treeMap = new TreeMap();
        Comparator comparator = axup.f96409a;
        Comparator comparator2 = axuq.f96410a;
        Cursor b = this.f96423d.mo53741b(this.f96428k, f96420j);
        try {
            b.moveToFirst();
            while (!b.isAfterLast()) {
                axxi a = axxj.m83472a(b);
                ayac a2 = m83264a(m83269c(a), false, false);
                String a3 = m83265a(a);
                axus a4 = m83263a(a.f96647b);
                axue b2 = m83268b(a);
                SortedMap sortedMap = (SortedMap) treeMap.get(b2);
                if (sortedMap == null) {
                    sortedMap = new TreeMap(comparator);
                    treeMap.put(b2, sortedMap);
                }
                SortedMap sortedMap2 = (SortedMap) sortedMap.get(a2);
                if (sortedMap2 == null) {
                    sortedMap2 = new TreeMap(comparator2);
                    sortedMap.put(a2, sortedMap2);
                }
                sortedMap2.put(a3, a4);
            }
            if (b != null) {
                b.close();
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                axue axue = (axue) entry.getKey();
                ssb.format("App <%1$s, %2$s>:\n", axue.f96377a, axue.f96379c);
                ssb.mo26034a();
                for (Map.Entry entry2 : ((SortedMap) entry.getValue()).entrySet()) {
                    ayac ayac = (ayac) entry2.getKey();
                    if (axzm.m83605a(this.f96430m, z2, ayac)) {
                        str = String.format("\"%s\" ", ayac.f96884a.f96815b);
                    } else {
                        str = "";
                    }
                    int i = ayac.f96885b;
                    if (i == 0) {
                        str2 = "local";
                    } else if (i != Integer.MAX_VALUE) {
                        str2 = String.format(Locale.US, "%d hops", Integer.valueOf(ayac.f96885b));
                    } else {
                        str2 = "unreachable";
                    }
                    ssb.format("Node %1$s %2$s(%3$s, isWatch: %4$b):\n", ayac.f96884a.f96814a, str, str2, Boolean.valueOf(ayac.f96889f));
                    ssb.mo26034a();
                    for (Map.Entry entry3 : ((SortedMap) entry2.getValue()).entrySet()) {
                        Object[] objArr = new Object[2];
                        if (entry3.getValue() != axus.STATIC) {
                            str3 = "-";
                        } else {
                            str3 = "+";
                        }
                        objArr[0] = str3;
                        objArr[1] = entry3.getKey();
                        ssb.format("%1$s %2$s\n", objArr);
                    }
                    ssb.mo26035b();
                }
                ssb.mo26035b();
            }
            ssb.mo26035b();
            ssb.mo26035b();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final boolean mo53603a(axue axue, String str, axus axus, String str2) {
        Uri build = m83267b(axue, str, str2).build();
        axxf axxf = new axxf(build.getHost(), build.getPath());
        axus axus2 = axus.STATIC;
        axxf.f96642d = axus.f96416c.getBytes(f96419i);
        try {
            if (this.f96423d.mo53728a(this.f96428k, axxf).get() != null) {
                return true;
            }
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.w("CapabilityService", "setCapability: the request was canceled");
            return false;
        } catch (ExecutionException e2) {
            Log.w("CapabilityService", "setCapability: failed with unexpected exception, ", e2);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo53604a(axue axue, String str, String str2) {
        try {
            if (((axxp) this.f96423d.mo53742b(this.f96428k, m83267b(axue, str, str2).build(), false).get()).f96670a > 0) {
                return true;
            }
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.w("CapabilityService", "removeCapability: the request was canceled");
            return false;
        } catch (ExecutionException e2) {
            Log.w("CapabilityService", "removeCapability: failed with unexpected exception, ", e2);
            return false;
        }
    }
}
