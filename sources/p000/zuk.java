package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zuk {

    /* renamed from: c */
    private static final srn f55931c = zvt.m46581a();

    /* renamed from: a */
    public int f55932a;

    /* renamed from: b */
    public int f55933b;

    /* renamed from: d */
    private final SharedPreferences f55934d;

    /* renamed from: e */
    private final sqv f55935e;

    /* renamed from: f */
    private final caaq f55936f;

    public zuk(SharedPreferences sharedPreferences, sqv sqv, caaq caaq) {
        this.f55934d = sharedPreferences;
        this.f55935e = sqv;
        this.f55936f = caaq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.List, boolean):bngx
     arg types: [bngx, int]
     candidates:
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      zrc.a(java.util.List, boolean):bngx */
    /* renamed from: a */
    private static long m46493a(zre zre, zuu zuu, caae caae, long j) {
        long nanos = TimeUnit.MILLISECONDS.toNanos(j - TimeUnit.HOURS.toMillis(cdzd.f182003a.mo6606a().mo78560a()));
        try {
            bngx bngx = (bngx) zuu.mo30701a(caae, nanos, TimeUnit.MILLISECONDS.toNanos(j)).get((long) ((int) ceab.m135732e()), TimeUnit.SECONDS);
            if (bngx.isEmpty()) {
                return -1;
            }
            zre.mo31361a((List) bngx, false);
            String str = caae.f172326b;
            bngx.size();
            return nanos;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zvj.m46564a(zvk.BACKFILL_DATA_SOURCE, e);
            throw yqh.m44583a(e);
        }
    }

    /* renamed from: b */
    private static void m46497b(zre zre, List list) {
        HashSet<String> hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((caae) it.next()).f172326b);
        }
        try {
            for (String str : zre.mo31384b((Set) hashSet)) {
                bnsl bnsl = (bnsl) f55931c.mo68388c();
                bnsl.mo68432a("zuk", "b", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Unable to delete: %s", str);
            }
        } catch (Exception e) {
            bnsl bnsl2 = (bnsl) f55931c.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("zuk", "b", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Unable to delete dataSourceIds");
            for (String str2 : hashSet) {
                bnsl bnsl3 = (bnsl) f55931c.mo68388c();
                bnsl3.mo68432a("zuk", "b", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Unable to delete: %s", str2);
            }
        }
    }

    /* renamed from: c */
    private static Set m46498c(zre zre, List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((caae) it.next()).f172326b);
        }
        try {
            zre.mo31385b((Collection) hashSet);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55931c.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zuk", "c", 237, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unable to purge data sources %s", TextUtils.join(",", hashSet));
        }
        return hashSet;
    }

    /* renamed from: a */
    private final void m46494a(zre zre, List list) {
        ArrayList arrayList = new ArrayList();
        this.f55933b = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new yqi((caae) it.next(), -1, -1, null));
        }
        try {
            zre.mo31386b((List) arrayList);
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f55931c.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zuk", "a", 203, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("unable to save: %s", arrayList);
        }
    }

    /* renamed from: a */
    private final void m46495a(zre zre, zuu zuu, Collection collection, Map map, Set set) {
        yqi yqi;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            caae caae = (caae) it.next();
            if (!set.contains(caae.f172326b) && ((yqi = (yqi) map.get(caae)) == null || yqi.f54391b == 0)) {
                long a = this.f55935e.mo20505a();
                if (zuq.m46516a(caae, this.f55936f)) {
                    arrayList.add(new yqi(caae, a, -1, null));
                } else {
                    arrayList.add(new yqi(caae, a, m46493a(zre, zuu, caae, a), null));
                }
            }
        }
        try {
            zre.mo31386b((List) arrayList);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55931c.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zuk", "a", 280, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("unable to save sync status: %s", map);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.HashSet, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    private final void m46496a(zuu zuu, zre zre, yre yre, Set set, Map map, boolean z) {
        zre zre2 = zre;
        yre yre2 = yre;
        Map map2 = map;
        bnre i = yre2.f54485e.listIterator();
        while (i.hasNext()) {
            bnsl bnsl = (bnsl) f55931c.mo68388c();
            bnsl.mo68432a("zuk", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unable to sync: %s", ((caae) i.next()).f172326b);
        }
        bngx bngx = yre2.f54483c;
        HashSet hashSet = new HashSet();
        int size = bngx.size();
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(((caae) bngx.get(i2)).f172326b);
        }
        try {
            zre2.mo31385b((Collection) hashSet);
        } catch (IOException e) {
            bnsl bnsl2 = (bnsl) f55931c.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("zuk", "c", 237, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Unable to purge data sources %s", TextUtils.join(",", hashSet));
        }
        if (z) {
            bngx bngx2 = yre2.f54481a;
            HashSet hashSet2 = new HashSet();
            for (caae caae : zre.mo31388h()) {
                if (!zuq.m46516a(caae, this.f55936f)) {
                    hashSet2.add(caae);
                }
            }
            hashSet2.removeAll(bngx2);
            zre2.mo31386b((List) bngx.m109355a(bnjd.m109575a((Iterable) hashSet2, zuj.f55930a)));
        }
        m46494a(zre2, yre2.f54481a);
        bngx bngx3 = yre2.f54482b;
        HashSet<String> hashSet3 = new HashSet();
        int size2 = bngx3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            hashSet3.add(((caae) bngx3.get(i3)).f172326b);
        }
        try {
            for (String str : zre2.mo31384b((Set) hashSet3)) {
                bnsl bnsl3 = (bnsl) f55931c.mo68388c();
                bnsl3.mo68432a("zuk", "b", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Unable to delete: %s", str);
            }
        } catch (Exception e2) {
            bnsl bnsl4 = (bnsl) f55931c.mo68388c();
            bnsl4.mo68437a(e2);
            bnsl4.mo68432a("zuk", "b", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Unable to delete dataSourceIds");
            for (String str2 : hashSet3) {
                bnsl bnsl5 = (bnsl) f55931c.mo68388c();
                bnsl5.mo68432a("zuk", "b", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68420a("Unable to delete: %s", str2);
            }
        }
        this.f55934d.edit().putString("SYNC_DATA_SOURCES_PAGE_TOKEN", yre2.f54486f).apply();
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            caae caae2 = (caae) it.next();
            if (!hashSet.contains(caae2.f172326b)) {
                yqi yqi = (yqi) map2.get(caae2);
                if (yqi == null || yqi.f54391b == 0) {
                    long a = this.f55935e.mo20505a();
                    if (zuq.m46516a(caae2, this.f55936f)) {
                        arrayList.add(new yqi(caae2, a, -1, null));
                    } else {
                        arrayList.add(new yqi(caae2, a, m46493a(zre2, zuu, caae2, a), null));
                    }
                }
            }
        }
        try {
            zre2.mo31386b((List) arrayList);
        } catch (IOException e3) {
            bnsl bnsl6 = (bnsl) f55931c.mo68388c();
            bnsl6.mo68437a(e3);
            bnsl6.mo68432a("zuk", "a", 280, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68420a("unable to save sync status: %s", map2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.HashSet, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31525a(Context context, zuu zuu, zre zre) {
        zuu zuu2 = zuu;
        zre zre2 = zre;
        Set<caae> h = zre.mo31388h();
        Map k = zre.mo31391k();
        ArrayList arrayList = new ArrayList();
        for (caae caae : h) {
            yqi yqi = (yqi) k.get(caae);
            if (!yhj.m44108a(caae) && (yqi == null || yqi.f54391b == 0)) {
                arrayList.add(caae);
            }
        }
        String str = null;
        if (this.f55935e.mo20505a() - this.f55934d.getLong("LAST_FULL_DATA_SOURCES_SYNC", 0) < ceab.f182124a.mo6606a().mo78667r() || !yua.m44838c(context)) {
            str = this.f55934d.getString("SYNC_DATA_SOURCES_PAGE_TOKEN", null);
        }
        try {
            yre yre = (yre) zuu2.mo30705a(arrayList, str).get((long) ((int) ceab.m135732e()), TimeUnit.SECONDS);
            if (str == null) {
                this.f55934d.edit().putLong("LAST_FULL_DATA_SOURCES_SYNC", this.f55935e.mo20505a()).commit();
            }
            this.f55932a = arrayList.size();
            bnre i = yre.f54485e.listIterator();
            while (i.hasNext()) {
                bnsl bnsl = (bnsl) f55931c.mo68388c();
                bnsl.mo68432a("zuk", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Unable to sync: %s", ((caae) i.next()).f172326b);
            }
            bngx bngx = yre.f54483c;
            HashSet hashSet = new HashSet();
            int size = bngx.size();
            int i2 = 0;
            while (i2 < size) {
                hashSet.add(((caae) bngx.get(i2)).f172326b);
                i2++;
                bngx = bngx;
            }
            try {
                zre2.mo31385b((Collection) hashSet);
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) f55931c.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("zuk", "c", 237, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Unable to purge data sources %s", TextUtils.join(",", hashSet));
            }
            if (str == null) {
                bngx bngx2 = yre.f54481a;
                HashSet hashSet2 = new HashSet();
                Iterator it = zre.mo31388h().iterator();
                while (it.hasNext()) {
                    caae caae2 = (caae) it.next();
                    Iterator it2 = it;
                    if (!zuq.m46516a(caae2, this.f55936f)) {
                        hashSet2.add(caae2);
                        it = it2;
                    } else {
                        it = it2;
                    }
                }
                hashSet2.removeAll(bngx2);
                zre2.mo31386b((List) bngx.m109355a(bnjd.m109575a((Iterable) hashSet2, zuj.f55930a)));
            }
            m46494a(zre2, yre.f54481a);
            bngx bngx3 = yre.f54482b;
            HashSet<String> hashSet3 = new HashSet();
            int size2 = bngx3.size();
            String str2 = "a";
            int i3 = 0;
            while (i3 < size2) {
                hashSet3.add(((caae) bngx3.get(i3)).f172326b);
                i3++;
                bngx3 = bngx3;
            }
            try {
                Iterator it3 = zre2.mo31384b((Set) hashSet3).iterator();
                while (it3.hasNext()) {
                    bnsl bnsl3 = (bnsl) f55931c.mo68388c();
                    Iterator it4 = it3;
                    bnsl3.mo68432a("zuk", "b", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Unable to delete: %s", (String) it3.next());
                    it3 = it4;
                }
            } catch (Exception e2) {
                bnsl bnsl4 = (bnsl) f55931c.mo68388c();
                bnsl4.mo68437a(e2);
                bnsl4.mo68432a("zuk", "b", 221, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Unable to delete dataSourceIds");
                for (String str3 : hashSet3) {
                    bnsl bnsl5 = (bnsl) f55931c.mo68388c();
                    bnsl5.mo68432a("zuk", "b", 223, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68420a("Unable to delete: %s", str3);
                }
            }
            this.f55934d.edit().putString("SYNC_DATA_SOURCES_PAGE_TOKEN", yre.f54486f).apply();
            ArrayList arrayList2 = new ArrayList();
            for (caae caae3 : h) {
                if (!hashSet.contains(caae3.f172326b)) {
                    yqi yqi2 = (yqi) k.get(caae3);
                    if (yqi2 != null) {
                        if (yqi2.f54391b != 0) {
                        }
                    }
                    long a = this.f55935e.mo20505a();
                    if (zuq.m46516a(caae3, this.f55936f)) {
                        arrayList2.add(new yqi(caae3, a, -1, null));
                    } else {
                        arrayList2.add(new yqi(caae3, a, m46493a(zre2, zuu2, caae3, a), null));
                    }
                }
            }
            try {
                zre2.mo31386b((List) arrayList2);
            } catch (IOException e3) {
                bnsl bnsl6 = (bnsl) f55931c.mo68388c();
                bnsl6.mo68437a(e3);
                bnsl6.mo68432a("zuk", str2, 280, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl6.mo68420a("unable to save sync status: %s", k);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            zvj.m46564a(zvk.UPSERT_DATA_SOURCE, e4);
            if ((e4.getCause() instanceof gid) && "Interrupted".equals(e4.getMessage())) {
                throw new InterruptedException();
            } else if (e4.getCause() instanceof zuv) {
                throw ((zuv) e4.getCause());
            } else {
                throw yqh.m44583a(e4);
            }
        }
    }
}
