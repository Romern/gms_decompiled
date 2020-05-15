package p000;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* renamed from: fjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjk extends fkj {

    /* renamed from: a */
    public final fnp f16722a;

    /* renamed from: b */
    public final fjj f16723b;

    /* renamed from: c */
    public fin f16724c;

    /* renamed from: e */
    private final Map f16725e = new HashMap();

    /* renamed from: f */
    private final Map f16726f = new HashMap();

    public fjk(fkm fkm, String str) {
        super(fkm);
        if (str != null) {
            this.f16725e.put("&tid", str);
        }
        this.f16725e.put("useSecure", "1");
        this.f16725e.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f16722a = new fnp("tracking", mo10936e());
        this.f16723b = new fjj(this, fkm);
    }

    /* renamed from: b */
    public final void mo10894b(String str) {
        mo10892a("&an", str);
    }

    /* renamed from: c */
    public final void mo10895c(String str) {
        mo10892a("&av", str);
    }

    /* renamed from: a */
    private static String m11813a(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (!str.startsWith("&") || str.length() < 2) {
            return null;
        }
        return ((String) entry.getKey()).substring(1);
    }

    /* renamed from: a */
    private static void m11814a(Map map, Map map2) {
        sdo.m34959a(map2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String a = m11813a(entry);
                if (a != null) {
                    map2.put(a, (String) entry.getValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo10891a(String str) {
        mo10954t();
        if (!TextUtils.isEmpty(str)) {
            if (this.f16725e.containsKey(str)) {
                return (String) this.f16725e.get(str);
            }
            if (str.equals("&ul")) {
                return fog.m12073a(Locale.getDefault());
            }
            if (str.equals("&cid")) {
                return mo10950o().mo11000b();
            }
            if (str.equals("&sr")) {
                return mo10952q().mo11013c();
            }
            if (str.equals("&aid")) {
                return mo10951p().mo10988b().f16729c;
            }
            if (str.equals("&an")) {
                return mo10951p().mo10988b().f16727a;
            }
            if (str.equals("&av")) {
                return mo10951p().mo10988b().f16728b;
            }
            if (str.equals("&aiid")) {
                return mo10951p().mo10988b().f16730d;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
        this.f16723b.mo10955u();
        String c = mo10948m().mo11063c();
        if (c != null) {
            mo10892a("&an", c);
        }
        String b = mo10948m().mo11062b();
        if (b != null) {
            mo10892a("&av", b);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo10892a(String str, String str2) {
        sdo.m34966a((Object) str, (Object) "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.f16725e.put(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_0x0106;
     */
    /* renamed from: a */
    public final void mo10893a(Map map) {
        boolean z;
        long a = mo10936e().mo20505a();
        mo10945j().mo10857c();
        boolean z2 = mo10945j().f16674e;
        HashMap hashMap = new HashMap();
        m11814a(this.f16725e, hashMap);
        m11814a(map, hashMap);
        String str = (String) this.f16725e.get("useSecure");
        int i = 1;
        if (str == null || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1")) {
            z = true;
        } else {
            z = !str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0");
        }
        Map map2 = this.f16726f;
        sdo.m34959a(hashMap);
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                String a2 = m11813a(entry);
                if (a2 != null && !hashMap.containsKey(a2)) {
                    hashMap.put(a2, (String) entry.getValue());
                }
            }
        }
        this.f16726f.clear();
        String str2 = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str2)) {
            mo10941g().mo11028a(hashMap, "Missing hit type parameter");
            return;
        }
        String str3 = (String) hashMap.get("tid");
        if (!TextUtils.isEmpty(str3)) {
            synchronized (this) {
                if (!"screenview".equalsIgnoreCase(str2)) {
                    if (!"pageview".equalsIgnoreCase(str2)) {
                        if (!"appview".equalsIgnoreCase(str2)) {
                        }
                    }
                }
                int parseInt = Integer.parseInt((String) this.f16725e.get("&a")) + 1;
                if (parseInt < Integer.MAX_VALUE) {
                    i = parseInt;
                }
                this.f16725e.put("&a", Integer.toString(i));
            }
            mo10944i().mo10886a(new fji(this, hashMap, str2, a, z2, z, str3));
            return;
        }
        mo10941g().mo11028a(hashMap, "Missing tracking id parameter");
    }
}
