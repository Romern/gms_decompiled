package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ztu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ztu implements zre {

    /* renamed from: d */
    public static final /* synthetic */ int f55900d = 0;

    /* renamed from: e */
    private static final srn f55901e = zvt.m46581a();

    /* renamed from: b */
    public final ztl f55902b;

    /* renamed from: c */
    public final caaq f55903c;

    /* renamed from: f */
    private final zrq f55904f = new zrq(new ztt(this));

    /* renamed from: g */
    private final zrp f55905g = new zrp(new zts(this));

    /* renamed from: h */
    private final sqv f55906h;

    public ztu(ztl ztl, sqv sqv, caaq caaq) {
        this.f55902b = ztl;
        this.f55903c = caaq;
        this.f55906h = sqv;
    }

    /* renamed from: a */
    private static int m46312a(ztk ztk, caae caae, long j, Long l) {
        ztk.mo31499c();
        long a = m46314a(ztk, caae);
        if (a == -1) {
            return -1;
        }
        return ztk.mo31489a("DataPointRows", String.format("%s = ? AND %s BETWEEN ? AND ?", "data_source_id", "end_time"), new String[]{Long.toString(a), Long.toString(j), l.toString()});
    }

    /* renamed from: a */
    private static boolean m46343a(int i, int i2) {
        return (i & i2) > 0;
    }

    /* renamed from: b */
    private final long m46346b(ztk ztk, String str) {
        zsu a = ztk.mo31492a("ChangeLog", new String[]{String.format("max(%s) as %s", "timestamp", "maxTimestamp")}, String.format("%s = ?", "source_table"), new String[]{str});
        try {
            bmxy.m108601b(a.mo31474b(), "Couldn't find max(timestamp) in Changelog");
            long d = a.mo31479d("maxTimestamp");
            if (a != null) {
                a.close();
            }
            return Math.max(d + 1, this.f55906h.mo20505a());
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    private final int m46351c(String str) {
        zsu a;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            int i = 0;
            a = b.mo31492a("ChangeLog", new String[]{"COUNT(*)"}, String.format("%s LIKE ?", "source_table"), new String[]{str});
            if (a.mo31474b()) {
                i = a.mo31470a(0);
            }
            b.mo31498b();
            if (a != null) {
                a.close();
            }
            b.close();
            return i;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: d */
    private static boolean m46353d(Collection collection) {
        caae caae = ((cadn) collection.iterator().next()).f172705e;
        if (caae == null) {
            caae = caae.f172323i;
        }
        bnic bnic = (bnic) yvm.f54688a.mo30787a();
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        return bnic.contains(caah.f172336b);
    }

    /* renamed from: l */
    private final boolean m46354l() {
        caap caap = caap.WATCH;
        caap a = caap.m126421a(this.f55903c.f172360c);
        if (a == null) {
            a = caap.UNKNOWN;
        }
        return !caap.equals(a) && ((int) cdzv.m135697e()) > 0;
    }

    /* renamed from: m */
    private final C1230nw m46355m() {
        Map map = (Map) this.f55905g.mo31412a();
        C1230nw nwVar = new C1230nw(map.size());
        for (Map.Entry entry : map.entrySet()) {
            nwVar.mo15540b(((Long) entry.getValue()).longValue(), (caae) entry.getKey());
        }
        return nwVar;
    }

    /* renamed from: e */
    public final bngx mo31357e(long j) {
        return m46317a("Sessions", 100, j, zrv.f55761a, "timestamp");
    }

    /* renamed from: f */
    public final boolean mo31378f() {
        return this.f55902b.mo31502a();
    }

    /* renamed from: g */
    public final boolean mo31379g() {
        this.f55904f.mo31414c();
        this.f55905g.mo31414c();
        ztl ztl = this.f55902b;
        return ztl.f55886b.deleteDatabase(ztl.f55887c.getDatabaseName());
    }

    /* renamed from: h */
    public final Set mo31388h() {
        return mo31390j().keySet();
    }

    /* renamed from: i */
    public final Map mo31389i() {
        return (Map) this.f55904f.mo31412a();
    }

    /* renamed from: j */
    public final Map mo31390j() {
        return (Map) this.f55905g.mo31412a();
    }

    /* renamed from: k */
    public final Map mo31391k() {
        zsu a;
        Throwable th;
        String str = "sync_token";
        Map j = mo31390j();
        if (j.isEmpty()) {
            return new HashMap();
        }
        C1230nw nwVar = new C1230nw(j.size());
        for (Map.Entry entry : j.entrySet()) {
            nwVar.mo15540b(((Long) entry.getValue()).longValue(), (caae) entry.getKey());
        }
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            HashMap hashMap = new HashMap();
            a = b.mo31491a("SyncStatus", new String[]{"data_source_id", "last_synced_time", "min_local_timestamp", str});
            while (a.mo31476c()) {
                caae caae = (caae) nwVar.mo15534a(a.mo31479d("data_source_id"));
                if (caae != null) {
                    String str2 = str;
                    hashMap.put(caae, new yqi(caae, a.mo31479d("last_synced_time"), a.mo31479d("min_local_timestamp"), a.mo31480e(str)));
                    str = str2;
                }
            }
            if (a != null) {
                a.close();
            }
            b.close();
            return hashMap;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            try {
                b.close();
            } catch (Throwable th4) {
                bqye.m113761a(th3, th4);
            }
            throw th3;
        }
        throw th;
    }

    /* renamed from: e */
    public final ydh mo31376e() {
        zsu a;
        ydh ydh;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            a = b.mo31491a("DataPointSyncStateTable", new String[]{"content"});
            if (a.mo31474b()) {
                ydh = (ydh) GeneratedMessageLite.m124016a(ydh.f53653d, a.mo31482g("content"), bxus.m123744c());
            } else {
                ydh = ydh.f53653d;
            }
            if (a != null) {
                a.close();
            }
            b.mo31498b();
            b.close();
            return ydh;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    private static long m46313a(ztk ztk, long j) {
        long j2;
        ztk.mo31499c();
        zsu a = ztk.mo31492a("SyncStatus", new String[]{"_id"}, String.format("%s = ?", "data_source_id"), new String[]{Long.toString(j)});
        try {
            if (a.mo31474b()) {
                j2 = a.mo31479d("_id");
            } else {
                j2 = -1;
            }
            if (a != null) {
                a.close();
            }
            return j2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final int mo31355d() {
        return m46351c(String.format("%%%s", "TempHost"));
    }

    /* renamed from: c */
    static String[] m46352c(List list) {
        String[] strArr = new String[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = ((Long) it.next()).toString();
            i++;
        }
        return strArr;
    }

    /* renamed from: d */
    public final int mo31356d(long j) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            int a = b.mo31489a("ChangeLog", String.format("%s < ? AND %s IN (?, ?, ?)", "timestamp", "source_table"), new String[]{Long.toString(j), "DataSourcesTempHost", "DataPointsTempHost", "SessionsTempHost"});
            b.mo31498b();
            b.close();
            return a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final int mo31352c() {
        return m46351c("%");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
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
    /* renamed from: b */
    private final bngx m46347b(yfz yfz, boolean z) {
        int i;
        zsu a;
        Throwable th;
        String str;
        bngx bngx;
        long j;
        zsu a2;
        Throwable th2;
        String str2 = "data_point";
        Set a3 = yfz.mo30454a();
        if (a3.isEmpty()) {
            return bngx.m109376e();
        }
        bnrv.m110182a(new ztq(a3));
        bngs b = bngx.m109371b(a3.size());
        C1230nw m = m46355m();
        ztk b2 = this.f55902b.mo31503b();
        try {
            b2.mo31497a();
            Map map = (Map) this.f55905g.mo31412a();
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                caae caae = (caae) it.next();
                yhe a4 = yfz.mo30455a(caae);
                Long l = (Long) map.get(caae);
                if (l != null) {
                    long longValue = l.longValue();
                    b2.mo31499c();
                    Iterator it2 = it;
                    String[] strArr = {"data_source_id", "origin_data_source_id", str2};
                    String format = String.format("%s = ? AND %s BETWEEN ? AND ?", "data_source_id", "end_time");
                    caae caae2 = caae;
                    String[] strArr2 = {Long.toString(longValue), Long.toString(a4.mo30494b()), Long.toString(a4.mo30495c())};
                    if (a4.mo30496d()) {
                        i = a4.f53820b;
                    } else {
                        i = -1;
                    }
                    yhe yhe = a4;
                    caae caae3 = caae2;
                    Map map2 = map;
                    a = b2.mo31494a("DataPointRows", strArr, format, strArr2, "end_time DESC", i);
                    bngx a5 = m46319a(a, m);
                    if (a != null) {
                        a.close();
                    }
                    bngx e = bngx.m109376e();
                    if (!yhe.mo30497e()) {
                        str = str2;
                        bngx = a5;
                    } else {
                        if (!a5.isEmpty()) {
                            j = ((cadn) bnjd.m109595d(a5)).f172702b;
                        } else {
                            j = yhe.mo30494b();
                        }
                        long longValue2 = l.longValue();
                        int i2 = yhe.f53821c;
                        b2.mo31499c();
                        str = str2;
                        bngx = a5;
                        a2 = b2.mo31494a("DataPointRows", new String[]{"data_source_id", "origin_data_source_id", str2}, String.format("%s = ? AND %s < ?", "data_source_id", "end_time"), new String[]{Long.toString(longValue2), Long.toString(j)}, "end_time DESC", i2);
                        e = m46319a(a2, m);
                        if (a2 != null) {
                            a2.close();
                        }
                    }
                    List a6 = bnkn.m109666a((List) bngx.m109355a((Iterable) bnfi.m109236a(bngx, e)));
                    cado b3 = yyl.m45033b(caae3);
                    if (z) {
                        b3.mo74618b(bnjd.m109575a((Iterable) a6, ztr.f55897a));
                    } else {
                        b3.mo74617a(a6);
                    }
                    b.mo67668c((cadp) b3.mo74062i());
                    str2 = str;
                    it = it2;
                    map = map2;
                } else {
                    b.mo67668c(yyl.m45028a(caae));
                    str2 = str2;
                    it = it;
                    map = map;
                }
            }
            b2.mo31498b();
            bngx a7 = b.mo67664a();
            b2.close();
            return a7;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            try {
                b2.close();
            } catch (Throwable th5) {
                bqye.m113761a(th4, th5);
            }
            throw th4;
        }
        throw th;
        throw th2;
    }

    /* renamed from: c */
    public final int mo31353c(long j) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            int a = b.mo31489a("ChangeLog", String.format("%s <= ?", "timestamp"), new String[]{Long.toString(j)});
            b.mo31498b();
            b.close();
            return a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private static long m46314a(ztk ztk, caae caae) {
        if (caae != null) {
            Map b = m46348b(ztk, bnic.m109489a(caae));
            if (b.containsKey(caae)) {
                return ((Long) b.get(caae)).longValue();
            }
        }
        return -1;
    }

    /* renamed from: a */
    static long m46315a(ztk ztk, caah caah) {
        bmxy.m108581a(caah);
        ztk.mo31499c();
        zsu a = m46335a(ztk, caah.f172336b);
        try {
            if (a.mo31476c()) {
                caah a2 = m46327a(a, "name", "proto");
                if (bzzn.m126363a(a2, caah)) {
                    long b = (long) a.mo31472b("_id");
                    if (a != null) {
                        a.close();
                    }
                    return b;
                }
                throw new zrh(String.format("Conflicting data types!  New: %s, existing: %s", caah.f172336b, a2.f172336b), a2);
            }
            if (a != null) {
                a.close();
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", caah.f172336b);
            contentValues.put("proto", caah.serializeToBytes());
            return ztk.mo31490a("DataTypes", contentValues);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final bnic mo31380a(Collection collection) {
        if (collection.isEmpty()) {
            return bnon.f131923a;
        }
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            Map a = m46330a(b, bnic.m109495a(collection));
            b.mo31498b();
            bnic a2 = bnic.m109495a(a.values());
            b.close();
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final yqi mo31387c(caae caae) {
        zsu a;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            long a2 = m46314a(b, caae);
            a = b.mo31492a("SyncStatus", new String[]{"last_synced_time", "min_local_timestamp", "sync_token"}, String.format("%s = ?", "data_source_id"), new String[]{Long.toString(a2)});
            b.mo31498b();
            if (a.mo31474b()) {
                yqi yqi = new yqi(caae, a.mo31479d("last_synced_time"), a.mo31479d("min_local_timestamp"), a.mo31480e("sync_token"));
                if (a != null) {
                    a.close();
                }
                b.close();
                return yqi;
            }
            if (a != null) {
                a.close();
            }
            b.close();
            return null;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    private static ContentValues m46316a(cadz cadz) {
        String a = yym.m45036a(cadz);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_package", a);
        contentValues.put("start_time", Long.valueOf(cadz.f172779e));
        long j = cadz.f172780f;
        if (j != 0) {
            contentValues.put("end_time", Long.valueOf(j));
        }
        contentValues.put("name", cadz.f172777c);
        if ((cadz.f172775a & 1) != 0) {
            contentValues.put("identifier", cadz.f172776b);
        }
        if ((cadz.f172775a & 4) != 0) {
            contentValues.put("description", cadz.f172778d);
        }
        contentValues.put("activity", Integer.valueOf(cadz.f172782h));
        long j2 = cadz.f172783i;
        if (j2 > 0) {
            contentValues.put("active_time_millis", Long.valueOf(j2));
        }
        return contentValues;
    }

    /* renamed from: c */
    public final zrb mo31354c(int i, long j) {
        return m46333a("DataPointsTempHost", i, j, zrv.f55762b);
    }

    /* renamed from: c */
    public final void mo31375c(caae caae, long j, long j2) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            bxvd da = cabc.f172411k.mo74144da();
            caaa caaa = caaa.f172305j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cabc cabc = (cabc) da.f164949b;
            caaa.getClass();
            cabc.f172417e = caaa;
            int i = cabc.f172413a | 8;
            cabc.f172413a = i;
            cabc.f172414b = 3;
            int i2 = i | 1;
            cabc.f172413a = i2;
            String str = caae.f172326b;
            str.getClass();
            cabc.f172413a = i2 | 4;
            cabc.f172416d = str;
            bxvd da2 = caby.f172491d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            caby caby = (caby) da2.f164949b;
            int i3 = caby.f172493a | 1;
            caby.f172493a = i3;
            caby.f172494b = j;
            caby.f172493a = i3 | 2;
            caby.f172495c = j2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cabc cabc2 = (cabc) da.f164949b;
            caby caby2 = (caby) da2.mo74062i();
            caby2.getClass();
            cabc2.f172421i = caby2;
            cabc2.f172413a |= 128;
            m46350b(b, bngx.m109356a((cabc) da.mo74062i()), false, "DataPoints");
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private final bngx m46317a(String str, int i, long j, zrv zrv, String str2) {
        Throwable th;
        byte[] g;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            bngs j2 = bngx.m109377j();
            zsu a = m46336a(b, str, i, 0, j, str2);
            while (a.mo31476c()) {
                try {
                    long d = a.mo31479d("_id");
                    boolean a2 = a.mo31471a("is_delete");
                    g = a.mo31482g("content");
                    j2.mo67668c((bxxc) zrv.mo31415a(g, d, a2, a.mo31472b("sync_tries"), a.mo31479d("timestamp")));
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) f55901e.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("ztu", "a", 1368, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Ignoring unconvertable bytes %s", g);
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            bngx a3 = j2.mo67664a();
            if (a != null) {
                a.close();
            }
            b.mo31498b();
            b.close();
            return a3;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            try {
                b.close();
            } catch (Throwable th5) {
                bqye.m113761a(th4, th5);
            }
            throw th4;
        }
    }

    /* renamed from: a */
    private final bngx m46318a(yfz yfz, boolean z) {
        zsu zsu;
        Iterator it;
        String str;
        ztu ztu = this;
        Set<caae> a = yfz.mo30454a();
        if (a.isEmpty()) {
            return bngx.m109376e();
        }
        bnrv.m110182a(new ztn(a));
        ztk b = ztu.f55902b.mo31503b();
        try {
            b.mo31497a();
            C1230nw m = m46355m();
            bngs j = bngx.m109377j();
            Iterator it2 = bnjd.m109574a(yfz.mo30454a(), ((int) cdzv.m135696d()) / 10).iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Map map = (Map) ztu.f55905g.mo31412a();
                Iterator it3 = ((List) it2.next()).iterator();
                while (it3.hasNext()) {
                    caae caae = (caae) it3.next();
                    Long l = (Long) map.get(caae);
                    if (l != null) {
                        long longValue = l.longValue();
                        yhe a2 = yfz.mo30455a(caae);
                        Iterator it4 = it2;
                        Object[] objArr = new Object[8];
                        objArr[0] = "end_time";
                        objArr[1] = "data_source_id";
                        objArr[2] = "origin_data_source_id";
                        objArr[3] = "data_point";
                        objArr[4] = "DataPointRows";
                        objArr[5] = "data_source_id";
                        objArr[6] = "end_time";
                        if (a2.mo30496d()) {
                            it = it3;
                            str = String.format("ORDER BY %s DESC LIMIT ?", "end_time");
                        } else {
                            it = it3;
                            str = "";
                        }
                        objArr[7] = str;
                        String format = String.format("SELECT %s, %s, %s, %s FROM %s WHERE %s = ? AND %s BETWEEN ? AND ? %s", objArr);
                        arrayList.add(String.format("SELECT * FROM (%s)", format));
                        arrayList2.add(String.valueOf(longValue));
                        arrayList2.add(String.valueOf(a2.mo30494b()));
                        arrayList2.add(String.valueOf(a2.mo30495c()));
                        if (a2.mo30496d()) {
                            arrayList2.add(String.valueOf(a2.f53820b));
                        }
                        if (!a2.mo30497e()) {
                            it2 = it4;
                            it3 = it;
                        } else if (a2.mo30496d()) {
                            arrayList.add(String.format("SELECT * FROM (SELECT %s, %s, %s, %s FROM %s WHERE %s = ? AND %s < IFNULL((SELECT MIN(%s) FROM (%s)), CAST(? AS INTEGER)) ORDER BY %s DESC LIMIT ?)", "end_time", "data_source_id", "origin_data_source_id", "data_point", "DataPointRows", "data_source_id", "end_time", "end_time", format, "end_time"));
                            arrayList2.add(String.valueOf(longValue));
                            arrayList2.add(String.valueOf(longValue));
                            arrayList2.add(String.valueOf(a2.mo30494b()));
                            arrayList2.add(String.valueOf(a2.mo30495c()));
                            arrayList2.add(String.valueOf(a2.f53820b));
                            arrayList2.add(String.valueOf(a2.mo30494b()));
                            arrayList2.add(String.valueOf(a2.f53821c));
                            it2 = it4;
                            it3 = it;
                        } else {
                            arrayList.add(String.format("SELECT * FROM (SELECT %s, %s, %s, %s FROM %s WHERE %s = ? AND %s < ? ORDER BY %s DESC LIMIT ?)", "end_time", "data_source_id", "origin_data_source_id", "data_point", "DataPointRows", "data_source_id", "end_time", "end_time"));
                            arrayList2.add(String.valueOf(longValue));
                            arrayList2.add(String.valueOf(a2.mo30494b()));
                            arrayList2.add(String.valueOf(a2.f53821c));
                            it2 = it4;
                            it3 = it;
                        }
                    }
                }
                Iterator it5 = it2;
                if (!arrayList.isEmpty()) {
                    String format2 = String.format("SELECT * FROM (%s) ORDER BY %s ASC", bmxr.m108544a(" UNION ALL ").mo66874a((Iterable) arrayList), "end_time");
                    String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                    b.mo31499c();
                    zsu = new zsu(b.f55883a.rawQuery(format2, strArr));
                } else {
                    zsu = null;
                }
                if (zsu != null) {
                    j.mo67666b((Iterable) m46319a(zsu, m));
                    ztu = this;
                    it2 = it5;
                } else {
                    ztu = this;
                    it2 = it5;
                }
            }
            bngx a3 = j.mo67664a();
            b.mo31498b();
            bngs b2 = bngx.m109371b(a.size());
            bnhe bnhe = ((bnht) bnnm.m109864a(a3, zto.f55894a)).f131642b;
            for (caae caae2 : a) {
                Iterable e = bnhe.containsKey(caae2) ? (Collection) bnhe.get(caae2) : bngx.m109376e();
                cado b3 = yyl.m45033b(caae2);
                if (z) {
                    b3.mo74618b(bnjd.m109575a(e, ztp.f55895a));
                } else {
                    b3.mo74617a(e);
                }
                b2.mo67668c((cadp) b3.mo74062i());
            }
            bngx a4 = b2.mo67664a();
            b.close();
            return a4;
        } catch (SQLiteException e2) {
            throw new IOException(e2);
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                b.close();
            } catch (Throwable th3) {
                bqye.m113761a(th2, th3);
            }
            throw th2;
        }
    }

    /* renamed from: b */
    private static Map m46348b(ztk ztk, Set set) {
        HashMap hashMap = new HashMap();
        if (!set.isEmpty()) {
            ztk.mo31499c();
            C1223np npVar = new C1223np();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                caae caae = (caae) it.next();
                npVar.put(caae.f172326b, caae);
            }
            for (List list : bnjd.m109574a(npVar.keySet(), (int) cdzv.m135696d())) {
                zsu a = ztk.mo31492a("DataSources", new String[]{"_id", "identifier"}, String.format("%s IN (%s)", "identifier", m46329a(list.size())), (String[]) list.toArray(new String[0]));
                while (a.mo31476c()) {
                    try {
                        caae caae2 = (caae) npVar.get(a.mo31481f("identifier"));
                        bmzs.m108696a(caae2);
                        hashMap.put(caae2, Long.valueOf(a.mo31479d("_id")));
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
                if (a != null) {
                    a.close();
                }
            }
        }
        return hashMap;
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, cadz, int, boolean):void
     arg types: [ztk, cadz, int, int]
     candidates:
      ztu.a(ztk, caae, long, java.lang.Long):int
      ztu.a(ztk, long, long, long):bnic
      ztu.a(java.lang.String, int, long, zrv):zrb
      ztu.a(ztk, java.util.Collection, boolean, java.lang.String):void
      ztu.a(ztk, boolean, java.util.Collection, boolean):void
      ztu.a(caae, long, long, int):cadp
      ztu.a(long, long, caae, boolean):void
      ztu.a(caae, long, long, cadp):void
      ztu.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      ztu.a(ztk, cadz, int, boolean):void */
    /* renamed from: c */
    public final void mo31395c(cadz cadz, int i) {
        String str;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            ContentValues a = m46316a(cadz);
            String format = String.format("%s = ? AND ((%s IS NOT NULL AND %s = ?) OR (%s IS NULL AND %s = ? AND %s = ?))", "app_package", "identifier", "identifier", "identifier", "start_time", "name");
            String[] strArr = new String[4];
            strArr[0] = yym.m45036a(cadz);
            String str2 = null;
            if ((cadz.f172775a & 1) != 0) {
                str = cadz.f172776b;
            } else {
                str = null;
            }
            strArr[1] = str;
            strArr[2] = Long.toString(cadz.f172779e);
            if ((cadz.f172775a & 2) != 0) {
                str2 = cadz.f172777c;
            }
            strArr[3] = str2;
            if (b.mo31488a("Sessions", a, format, strArr) > 0) {
                m46338a(b, cadz, i, false);
            }
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private final void m46349b(ztk ztk, Collection collection, boolean z) {
        if (m46354l()) {
            m46350b(ztk, collection, z, "DataSourcesTempHost");
        }
    }

    /* renamed from: b */
    private final void m46350b(ztk ztk, Collection collection, boolean z, String str) {
        if (!collection.isEmpty()) {
            long b = m46346b(ztk, str);
            ContentValues contentValues = new ContentValues();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                contentValues.clear();
                contentValues.put("source_table", str);
                contentValues.put("timestamp", Long.valueOf(b));
                contentValues.put("is_delete", Boolean.valueOf(z));
                contentValues.put("content", ((bxxc) it.next()).serializeToBytes());
                ztk.mo31490a("ChangeLog", contentValues);
                b = Math.max(b + 1, this.f55906h.mo20505a());
            }
        }
    }

    /* renamed from: b */
    public final long mo31349b() {
        zsu a;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            a = b.mo31491a("ChangeLog", new String[]{"min(timestamp)"});
            long j = -1;
            if (a.mo31474b() && !a.mo31477c(a.mo31483h("min(timestamp)"))) {
                j = a.mo31473b(a.mo31483h("min(timestamp)"));
            }
            if (a != null) {
                a.close();
            }
            b.close();
            return j;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: b */
    public final long mo31372b(caae caae) {
        zsu a;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            long a2 = m46314a(b, caae);
            long j = -1;
            if (a2 != -1) {
                a = b.mo31492a("DataPointRows", new String[]{String.format("min(%s)", "end_time")}, String.format("%s = ?", "data_source_id"), new String[]{Long.toString(a2)});
                if (a.mo31474b()) {
                    j = a.mo31473b(0);
                }
                b.mo31498b();
                if (a != null) {
                    a.close();
                }
            }
            b.close();
            return j;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: b */
    public final bngx mo31350b(int i, long j) {
        return m46317a("DataPointsBackgroundOnly", i, j, zrv.f55762b, "timestamp");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.b(yfz, boolean):bngx
     arg types: [yfz, int]
     candidates:
      ztu.b(ztk, java.lang.String):long
      ztu.b(ztk, java.util.Set):java.util.Map
      ztu.b(int, long):bngx
      ztu.b(cadz, int):void
      zrj.b(cadz, int):void
      zra.b(int, long):bngx
      ztu.b(yfz, boolean):bngx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(yfz, boolean):bngx
     arg types: [yfz, int]
     candidates:
      ztu.a(ztk, long):long
      ztu.a(ztk, caae):long
      ztu.a(ztk, caah):long
      ztu.a(zsu, nw):bngx
      ztu.a(ztk, java.util.List):bngx
      ztu.a(long, nw):caae
      ztu.a(ztk, java.util.Set):java.util.Map
      ztu.a(ztk, java.lang.String):zsu
      ztu.a(ztk, yqi):void
      ztu.a(int, int):boolean
      ztu.a(caae, long):int
      ztu.a(caae, int):long
      ztu.a(int, long):bngx
      ztu.a(java.util.List, boolean):bngx
      ztu.a(cadp, boolean):cadp
      ztu.a(cadz, int):boolean
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(java.util.List, boolean):bngx
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      ztu.a(yfz, boolean):bngx */
    /* renamed from: b */
    public final bngx mo31373b(yfz yfz) {
        if (cdzv.m135698f()) {
            return m46347b(yfz, true);
        }
        return m46318a(yfz, true);
    }

    /* renamed from: a */
    private static bngx m46319a(zsu zsu, C1230nw nwVar) {
        try {
            bngs b = bngx.m109371b(zsu.mo31469a());
            if (zsu.mo31474b()) {
                cadm cadm = (cadm) cadn.f172699j.mo74144da();
                while (!zsu.f55836a.isAfterLast()) {
                    cadm.f164949b = (GeneratedMessageLite) cadm.f164949b.mo74142c(4);
                    cadm.mo73635b(zsu.mo31482g("data_point"), bxus.m123744c());
                    caae a = m46325a(zsu.mo31479d("data_source_id"), nwVar);
                    if (a != null) {
                        if (cadm.f164950c) {
                            cadm.mo74035c();
                            cadm.f164950c = false;
                        }
                        cadn cadn = (cadn) cadm.f164949b;
                        a.getClass();
                        cadn.f172705e = a;
                        cadn.f172701a |= 4;
                        Long c = zsu.mo31475c("origin_data_source_id");
                        if (c != null) {
                            caae a2 = m46325a(c.longValue(), nwVar);
                            if (a2 != null) {
                                if (cadm.f164950c) {
                                    cadm.mo74035c();
                                    cadm.f164950c = false;
                                }
                                cadn cadn2 = (cadn) cadm.f164949b;
                                a2.getClass();
                                cadn2.f172706f = a2;
                                cadn2.f172701a |= 8;
                            }
                        }
                        b.mo67668c((cadn) cadm.mo74062i());
                        zsu.mo31476c();
                    } else {
                        throw new IOException("Missing data source.");
                    }
                }
            }
            bngx a3 = b.mo67664a();
            zsu.close();
            return a3;
        } catch (SQLiteException e) {
            throw new IOException(e);
        } catch (bxwf e2) {
            bnsl bnsl = (bnsl) f55901e.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68432a("ztu", "a", 2289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Couldn't parse RawDataPoint proto.");
            zsu.mo31476c();
        } catch (Throwable th) {
            zsu.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final caah mo31383b(String str) {
        zsu a;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            a = m46335a(b, str);
            if (a.mo31476c()) {
                b.mo31498b();
                caah a2 = m46327a(a, "name", "proto");
                if (a != null) {
                    a.close();
                }
                b.close();
                return a2;
            }
            if (a != null) {
                a.close();
            }
            b.mo31498b();
            b.close();
            return null;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, java.lang.String, boolean):boolean
     arg types: [ztk, java.lang.String, int]
     candidates:
      ztu.a(zsu, java.lang.String, java.lang.String):caah
      ztu.a(ztk, java.lang.String, java.lang.String[]):nw
      ztu.a(ztk, long, android.content.ContentValues):void
      ztu.a(ztk, java.util.Collection, boolean):void
      ztu.a(ztk, long, cadn):boolean
      ztu.a(caae, long, int):cadp
      ztu.a(caae, long, long):cadp
      ztu.a(caae, java.util.List, boolean):void
      zrc.a(caae, long, int):cadp
      zrc.a(caae, long, long):cadp
      zrc.a(caae, java.util.List, boolean):void
      ztu.a(ztk, java.lang.String, boolean):boolean */
    /* renamed from: b */
    public final Set mo31384b(Set set) {
        if (set.isEmpty()) {
            return bnon.f131923a;
        }
        this.f55904f.mo31414c();
        this.f55905g.mo31414c();
        ztk b = this.f55902b.mo31503b();
        try {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                b.mo31497a();
                try {
                    if (!m46345a(b, str, false)) {
                        hashSet.add(str);
                    } else {
                        b.mo31498b();
                    }
                } catch (Exception e) {
                    bnsl bnsl = (bnsl) f55901e.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("ztu", "b", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("unable to remove: %s", str);
                    hashSet.add(str);
                }
                b.mo31501d();
            }
            b.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final zrb mo31351b(long j) {
        return m46333a("DataSourcesTempHost", -1, j, zrv.f55763c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, java.util.Collection, boolean):void
     arg types: [ztk, bnic, int]
     candidates:
      ztu.a(zsu, java.lang.String, java.lang.String):caah
      ztu.a(ztk, java.lang.String, java.lang.String[]):nw
      ztu.a(ztk, long, android.content.ContentValues):void
      ztu.a(ztk, long, cadn):boolean
      ztu.a(ztk, java.lang.String, boolean):boolean
      ztu.a(caae, long, int):cadp
      ztu.a(caae, long, long):cadp
      ztu.a(caae, java.util.List, boolean):void
      zrc.a(caae, long, int):cadp
      zrc.a(caae, long, long):cadp
      zrc.a(caae, java.util.List, boolean):void
      ztu.a(ztk, java.util.Collection, boolean):void */
    /* renamed from: b */
    public final void mo31374b(caae caae, long j, long j2) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            long a = m46314a(b, caae);
            if (a != -1) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                long nanos2 = TimeUnit.MILLISECONDS.toNanos(j2);
                bnic a2 = m46323a(b, a, nanos, nanos2);
                a2.size();
                m46339a(b, (Collection) a2, false);
                m46312a(b, caae, nanos, Long.valueOf(nanos2));
                b.mo31498b();
            } else {
                bnsl bnsl = (bnsl) f55901e.mo68387b();
                bnsl.mo68432a("ztu", "b", 978, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Invalid data source specified: %s", caae.f172326b);
            }
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, cadz, int, boolean):void
     arg types: [ztk, cadz, int, int]
     candidates:
      ztu.a(ztk, caae, long, java.lang.Long):int
      ztu.a(ztk, long, long, long):bnic
      ztu.a(java.lang.String, int, long, zrv):zrb
      ztu.a(ztk, java.util.Collection, boolean, java.lang.String):void
      ztu.a(ztk, boolean, java.util.Collection, boolean):void
      ztu.a(caae, long, long, int):cadp
      ztu.a(long, long, caae, boolean):void
      ztu.a(caae, long, long, cadp):void
      ztu.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      ztu.a(ztk, cadz, int, boolean):void */
    /* renamed from: b */
    public final void mo31394b(cadz cadz, int i) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            b.mo31490a("Sessions", m46316a(cadz));
            m46338a(b, cadz, i, false);
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private static bngx m46320a(ztk ztk, String str, int i, long j, zrv zrv, String str2) {
        byte[] g;
        bngs j2 = bngx.m109377j();
        zsu a = m46336a(ztk, str, i, 0, j, str2);
        while (a.mo31476c()) {
            try {
                long d = a.mo31479d("_id");
                boolean a2 = a.mo31471a("is_delete");
                g = a.mo31482g("content");
                j2.mo67668c((bxxc) zrv.mo31415a(g, d, a2, a.mo31472b("sync_tries"), a.mo31479d("timestamp")));
            } catch (IOException e) {
                bnsl bnsl = (bnsl) f55901e.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ztu", "a", 1368, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Ignoring unconvertable bytes %s", g);
            } catch (Throwable th) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                }
                throw th;
            }
        }
        bngx a3 = j2.mo67664a();
        if (a != null) {
            a.close();
        }
        return a3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, java.lang.String, boolean):boolean
     arg types: [ztk, java.lang.String, int]
     candidates:
      ztu.a(zsu, java.lang.String, java.lang.String):caah
      ztu.a(ztk, java.lang.String, java.lang.String[]):nw
      ztu.a(ztk, long, android.content.ContentValues):void
      ztu.a(ztk, java.util.Collection, boolean):void
      ztu.a(ztk, long, cadn):boolean
      ztu.a(caae, long, int):cadp
      ztu.a(caae, long, long):cadp
      ztu.a(caae, java.util.List, boolean):void
      zrc.a(caae, long, int):cadp
      zrc.a(caae, long, long):cadp
      zrc.a(caae, java.util.List, boolean):void
      ztu.a(ztk, java.lang.String, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.b(ztk, java.util.Collection, boolean):void
     arg types: [ztk, java.util.HashSet, int]
     candidates:
      ztu.b(caae, long, long):void
      zrc.b(caae, long, long):void
      ztu.b(ztk, java.util.Collection, boolean):void */
    /* renamed from: b */
    public final void mo31385b(Collection collection) {
        if (!collection.isEmpty()) {
            ztk b = this.f55902b.mo31503b();
            try {
                b.mo31497a();
                HashSet hashSet = new HashSet();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C1230nw a = m46332a(b, "identifier = ?", new String[]{str});
                    HashSet a2 = bnpf.m110048a(a.mo15537b());
                    for (int i = 0; i < a.mo15537b(); i++) {
                        a2.add(a.mo15534a(a.mo15533a(i)));
                    }
                    hashSet.addAll(a2);
                    if (!m46345a(b, str, true)) {
                        bnsl bnsl = (bnsl) f55901e.mo68388c();
                        bnsl.mo68432a("ztu", "b", 2754, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Unable to purge data source %s", str);
                    }
                }
                m46349b(b, (Collection) hashSet, true);
                b.mo31498b();
                b.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: a */
    private static bngx m46321a(ztk ztk, String str, String[] strArr, int i, Boolean bool, C1230nw nwVar) {
        String str2;
        String str3;
        if (bool != null) {
            Object[] objArr = new Object[2];
            objArr[0] = "end_time";
            if (!bool.booleanValue()) {
                str3 = "DESC";
            } else {
                str3 = "ASC";
            }
            objArr[1] = str3;
            str2 = String.format("%s %s", objArr);
        } else {
            str2 = null;
        }
        ztk.mo31499c();
        return m46319a(ztk.mo31494a("DataPointRows", new String[]{"data_source_id", "origin_data_source_id", "data_point"}, str, strArr, str2, i), nwVar);
    }

    /* renamed from: a */
    private final bngx m46322a(ztk ztk, List list) {
        boolean z;
        Long l;
        ztk ztk2 = ztk;
        ztk.mo31499c();
        if (list.isEmpty()) {
            return bngx.m109376e();
        }
        ztk.mo31499c();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cadn cadn = (cadn) it.next();
            caae caae = cadn.f172705e;
            if (caae == null) {
                caae = caae.f172323i;
            }
            hashSet.add(caae);
            if ((cadn.f172701a & 8) != 0) {
                caae caae2 = cadn.f172706f;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                hashSet.add(caae2);
            }
        }
        Map a = m46330a(ztk2, hashSet);
        boolean z2 = false;
        int i = 4;
        ztv a2 = ztk2.mo31496a("INSERT INTO %s(%s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?)", "DataPointRows", "start_time", "end_time", "data_source_id", "origin_data_source_id", "data_point");
        long a3 = this.f55906h.mo20505a();
        bngs b = bngx.m109371b(list.size());
        for (cadm cadm : bnkn.m109668a(list, ztm.f55892a)) {
            if ((((cadn) cadm.f164949b).f172701a & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108596a(z, "DataPoint %s has no data source", cadm);
            if (((cadn) cadm.f164949b).f172708h == 0) {
                if (cadm.f164950c) {
                    cadm.mo74035c();
                    cadm.f164950c = z2;
                }
                cadn cadn2 = (cadn) cadm.f164949b;
                cadn cadn3 = cadn.f172699j;
                cadn2.f172701a |= 32;
                cadn2.f172708h = a3;
            }
            caae caae3 = ((cadn) cadm.f164949b).f172705e;
            if (caae3 == null) {
                caae3 = caae.f172323i;
            }
            Long l2 = (Long) a.get(caae3);
            bmzs.m108696a(l2);
            long longValue = l2.longValue();
            cadn cadn4 = (cadn) cadm.f164949b;
            if ((cadn4.f172701a & 8) != 0) {
                caae caae4 = cadn4.f172706f;
                if (caae4 == null) {
                    caae4 = caae.f172323i;
                }
                l = (Long) a.get(caae4);
            } else {
                l = null;
            }
            cadn cadn5 = (cadn) cadm.mo74062i();
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = z2;
            }
            cadn cadn6 = (cadn) cadm.f164949b;
            cadn cadn7 = cadn.f172699j;
            cadn6.f172705e = null;
            int i2 = cadn6.f172701a & -5;
            cadn6.f172701a = i2;
            cadn6.f172706f = null;
            cadn6.f172701a = i2 & -9;
            cadn cadn8 = (cadn) cadm.mo74062i();
            long j = cadn8.f172702b;
            Map map = a;
            long j2 = a3;
            long j3 = cadn8.f172703c;
            if (j3 <= 0) {
                j3 = j;
            }
            a2.mo31511a(1, j3);
            a2.mo31511a(2, j);
            a2.mo31511a(3, longValue);
            if (l != null) {
                a2.mo31511a(4, l.longValue());
            } else {
                a2.f55907a.bindNull(4);
            }
            a2.mo31512a(cadn8.serializeToBytes());
            try {
                a2.f55907a.executeInsert();
                b.mo67668c(cadn5);
                a = map;
                a3 = j2;
                z2 = false;
                i = 4;
            } catch (SQLiteException e) {
                throw new IOException(e);
            }
        }
        bngx a4 = b.mo67664a();
        bnre i3 = a4.listIterator();
        while (i3.hasNext()) {
            cadn cadn9 = (cadn) i3.next();
            zrq zrq = this.f55904f;
            caae caae5 = cadn9.f172705e;
            if (caae5 == null) {
                caae5 = caae.f172323i;
            }
            zrq.mo31410a(caae5, cadn9.f172702b);
        }
        return a4;
    }

    /* renamed from: b */
    public final void mo31386b(List list) {
        if (!list.isEmpty()) {
            ztk b = this.f55902b.mo31503b();
            try {
                b.mo31497a();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m46341a(b, (yqi) it.next());
                }
                b.mo31498b();
                b.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: a */
    private final bnic m46323a(ztk ztk, long j, long j2, long j3) {
        C1230nw m = m46355m();
        return bnic.m109495a((Collection) m46321a(ztk, String.format("%s = ? AND (%s BETWEEN ? AND ?)", "data_source_id", "end_time"), new String[]{Long.toString(j), Long.toString(j2), Long.toString(j3)}, -1, (Boolean) null, m));
    }

    /* renamed from: a */
    public static ByteString m46324a(cadn cadn) {
        bxvd bxvd = (bxvd) cadn.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cadn);
        cadm cadm = (cadm) bxvd;
        if (cadm.f164950c) {
            cadm.mo74035c();
            cadm.f164950c = false;
        }
        cadn cadn2 = (cadn) cadm.f164949b;
        cadn cadn3 = cadn.f172699j;
        cadn2.f172705e = null;
        int i = cadn2.f172701a & -5;
        cadn2.f172701a = i;
        cadn2.f172706f = null;
        cadn2.f172701a = i & -9;
        if ((cadn.f172701a & 8) != 0) {
            caae caae = cadn.f172706f;
            if (caae == null) {
                caae = caae.f172323i;
            }
            caae c = yyd.m44992c(caae.f172326b);
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn4 = (cadn) cadm.f164949b;
            c.getClass();
            cadn4.f172706f = c;
            cadn4.f172701a |= 8;
        }
        return ((cadn) cadm.mo74062i()).mo73639aL();
    }

    /* renamed from: a */
    private static caae m46325a(long j, C1230nw nwVar) {
        if (j <= 0) {
            return null;
        }
        caae caae = (caae) nwVar.mo15534a(j);
        if (caae != null) {
            return caae;
        }
        bnsl bnsl = (bnsl) f55901e.mo68387b();
        bnsl.mo68432a("ztu", "a", 2335, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68415a("Missing data source %d", j);
        StringBuilder sb = new StringBuilder(41);
        sb.append("Missing data source: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static caae m46326a(ztk ztk, zsu zsu, String str, String str2, String str3) {
        try {
            return (caae) GeneratedMessageLite.m124016a(caae.f172323i, zsu.mo31482g(str3), bxus.m123744c());
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) f55901e.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ztu", "a", 649, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Invalid DataSource proto.");
            caae a = yyd.m44984a(zsu.mo31481f(str2));
            ContentValues contentValues = new ContentValues();
            contentValues.put("proto", a.serializeToBytes());
            ztk.mo31488a("DataSources", contentValues, "_id = ?", new String[]{zsu.mo31481f(str)});
            return a;
        }
    }

    /* renamed from: a */
    static caah m46327a(zsu zsu, String str, String str2) {
        String f = zsu.mo31481f(str);
        if (bzzn.m126366b(f)) {
            return bzzn.m126359a(f);
        }
        try {
            return (caah) GeneratedMessageLite.m124016a(caah.f172333d, zsu.mo31482g(str2), bxus.m123744c());
        } catch (bxwf e) {
            throw new IllegalStateException(String.format("Couldn't read data type with name %s", f), e);
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    private final cadp m46328a(caae caae, long j, long j2, int i, boolean z) {
        Throwable th;
        bngx bngx;
        caae caae2 = caae;
        long j3 = j2;
        TimeUnit.NANOSECONDS.toMillis(j);
        TimeUnit.NANOSECONDS.toMillis(j3);
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.f55906h.mo20505a());
        if (j3 == 0) {
            j3 = nanos;
        }
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            long a = m46314a(b, caae2);
            if (a != -1) {
                bngx = m46321a(b, String.format("%s = ? AND %s BETWEEN ? AND ?", "data_source_id", "end_time"), new String[]{Long.toString(a), Long.toString(j), Long.toString(j3)}, i, Boolean.valueOf(z), m46355m());
            } else {
                String str = caae2.f172326b;
                bngx = bngx.m109376e();
            }
            b.mo31498b();
            bngx.size();
            cado b2 = yyl.m45033b(caae);
            b2.mo74617a(z ? bngx : bnkn.m109666a((List) bngx));
            cadp cadp = (cadp) b2.mo74062i();
            b.close();
            return cadp;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    /* renamed from: a */
    static String m46329a(int i) {
        if (i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i + i);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.b(ztk, java.util.Collection, boolean):void
     arg types: [ztk, java.util.ArrayList, int]
     candidates:
      ztu.b(caae, long, long):void
      zrc.b(caae, long, long):void
      ztu.b(ztk, java.util.Collection, boolean):void */
    /* renamed from: a */
    private final Map m46330a(ztk ztk, Set set) {
        ztk.mo31499c();
        Map b = m46348b(ztk, set);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                caae caae = (caae) it.next();
                if (!b.containsKey(caae)) {
                    if ((caae.f172325a & 16) != 0) {
                        z = true;
                    }
                    bmxy.m108588a(z);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("identifier", caae.f172326b);
                    caah caah = caae.f172330f;
                    if (caah == null) {
                        caah = caah.f172333d;
                    }
                    contentValues.put("data_type_id", Long.valueOf(m46315a(ztk, caah)));
                    contentValues.put("proto", caae.serializeToBytes());
                    try {
                        long a = ztk.mo31490a("DataSources", contentValues);
                        b.put(caae, Long.valueOf(a));
                        this.f55905g.mo31410a(caae, a);
                        arrayList.add(caae);
                    } catch (IOException | RuntimeException e) {
                        this.f55904f.mo31414c();
                        this.f55905g.mo31414c();
                        throw e;
                    }
                }
            } else {
                m46349b(ztk, (Collection) arrayList, false);
                return b;
            }
        }
    }

    /* renamed from: a */
    public static C1230nw m46331a(ztk ztk) {
        srn srn = ztl.f55885a;
        return m46332a(ztk, (String) null, (String[]) null);
    }

    /* renamed from: a */
    private static C1230nw m46332a(ztk ztk, String str, String[] strArr) {
        zsu a = ztk.mo31492a("DataSources", new String[]{String.format("%s.%s AS %s", "DataSources", "_id", "DataSource_id"), String.format("%s.%s AS %s", "DataSources", "identifier", "DataSource_identifier"), String.format("%s.%s AS %s", "DataSources", "proto", "DataSource_proto")}, str, strArr);
        try {
            C1230nw nwVar = new C1230nw();
            while (a.mo31476c()) {
                nwVar.mo15540b(a.mo31479d("DataSource_id"), m46326a(ztk, a, "DataSource_id", "DataSource_identifier", "DataSource_proto"));
            }
            if (a != null) {
                a.close();
            }
            return nwVar;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private final zrb m46333a(String str, int i, long j, zrv zrv) {
        byte[] g;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            zsu a = m46336a(b, str, i, j, Long.MAX_VALUE, "timestamp");
            bngs b2 = bngx.m109371b(a.mo31469a());
            long j2 = j;
            while (a.mo31476c()) {
                try {
                    long d = a.mo31479d("_id");
                    boolean a2 = a.mo31471a("is_delete");
                    g = a.mo31482g("content");
                    long d2 = a.mo31479d("timestamp");
                    if (d2 > j2) {
                        j2 = d2;
                    }
                    b2.mo67668c((bxxc) zrv.mo31415a(g, d, a2, 0, d2));
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) f55901e.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("ztu", "a", 1423, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Ignoring unconvertible bytes %s", g);
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
            zrb zrb = new zrb(j2, b2.mo67664a());
            a.close();
            b.mo31498b();
            b.close();
            return zrb;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            try {
                b.close();
            } catch (Throwable th4) {
                bqye.m113761a(th3, th4);
            }
            throw th3;
        }
    }

    /* renamed from: a */
    private static zrb m46334a(ztk ztk, String str, int i, long j, long j2, zrv zrv) {
        long j3;
        byte[] bArr;
        zsu a = m46336a(ztk, str, i, j, j2, "timestamp");
        bngs b = bngx.m109371b(a.mo31469a());
        long j4 = j;
        while (a.mo31476c()) {
            try {
                long d = a.mo31479d("_id");
                boolean a2 = a.mo31471a("is_delete");
                byte[] g = a.mo31482g("content");
                long d2 = a.mo31479d("timestamp");
                if (d2 > j4) {
                    j4 = d2;
                }
                j3 = j4;
                bArr = g;
                b.mo67668c((bxxc) zrv.mo31415a(g, d, a2, 0, d2));
            } catch (IOException e) {
                bnsl bnsl = (bnsl) f55901e.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ztu", "a", 1423, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Ignoring unconvertible bytes %s", bArr);
            } catch (Throwable th) {
                a.close();
                throw th;
            }
            j4 = j3;
        }
        zrb zrb = new zrb(j4, b.mo67664a());
        a.close();
        return zrb;
    }

    /* renamed from: a */
    private static zsu m46335a(ztk ztk, String str) {
        return ztk.mo31492a("DataTypes", new String[]{"_id", "name", "proto"}, String.format("%s = ?", "name"), new String[]{str});
    }

    /* renamed from: a */
    private static zsu m46336a(ztk ztk, String str, int i, long j, long j2, String str2) {
        String concat = String.valueOf(str2).concat(" ASC");
        return ztk.mo31494a("ChangeLog", new String[]{"_id", "timestamp", "is_delete", "content", "sync_tries"}, String.format("%s = ? AND (%s BETWEEN ? AND ?) AND %s <= ? AND %s < ?", "source_table", "timestamp", "last_sync_ms", "sync_tries"), new String[]{str, Long.toString(j), Long.toString(Long.MAX_VALUE), Long.toString(j2), Long.toString(cdzv.f182107a.mo6606a().mo78642k())}, concat, i);
    }

    /* renamed from: a */
    private static void m46337a(ztk ztk, long j, ContentValues contentValues) {
        ztk.mo31499c();
        if (j > 0) {
            ztk.mo31488a("SyncStatus", contentValues, String.format("%s = ?", "_id"), new String[]{Long.toString(j)});
            return;
        }
        ztk.mo31490a("SyncStatus", contentValues);
    }

    /* renamed from: a */
    private final void m46338a(ztk ztk, cadz cadz, int i, boolean z) {
        if (m46354l() && m46343a(i, 16)) {
            m46350b(ztk, bngx.m109356a(cadz), z, "SessionsTempHost");
        }
        if (m46343a(i, 1)) {
            m46350b(ztk, bngx.m109356a(cadz), z, "Sessions");
        }
    }

    /* renamed from: a */
    private final void m46339a(ztk ztk, Collection collection, boolean z) {
        m46340a(ztk, collection, z, "DataPointsBackgroundOnly");
    }

    /* renamed from: a */
    private final void m46340a(ztk ztk, Collection collection, boolean z, String str) {
        ztk ztk2 = ztk;
        String str2 = str;
        if (!collection.isEmpty()) {
            ztv a = ztk2.mo31496a("INSERT INTO %s(%s, %s, %s, %s, %s) VALUES(?, ?, ?, ?, ?)", "ChangeLog", "source_table", "timestamp", "value_timestamp", "is_delete", "content");
            bxvd da = cabc.f172411k.mo74144da();
            long b = m46346b(ztk2, str2);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cadn cadn = (cadn) it.next();
                caae caae = cadn.f172705e;
                if (caae == null) {
                    caae = caae.f172323i;
                }
                String str3 = caae.f172326b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cabc cabc = (cabc) da.f164949b;
                str3.getClass();
                cabc.f172413a |= 4;
                cabc.f172416d = str3;
                caaa a2 = yrj.m44664a(cadn);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cabc cabc2 = (cabc) da.f164949b;
                a2.getClass();
                cabc2.f172417e = a2;
                cabc2.f172413a |= 8;
                byte[] k = ((cabc) da.mo74062i()).serializeToBytes();
                a.f55907a.clearBindings();
                a.f55907a.bindString(1, str2);
                long j = 1;
                long j2 = b + 1;
                a.mo31511a(2, b);
                a.mo31511a(3, cadn.f172702b);
                if (!z) {
                    j = 0;
                }
                a.mo31511a(4, j);
                a.mo31512a(k);
                a.mo31510a();
                b = j2;
            }
        }
    }

    /* renamed from: a */
    private final void m46341a(ztk ztk, yqi yqi) {
        ztk.mo31499c();
        caae caae = yqi.f54390a;
        bmxy.m108581a(caae);
        Long l = (Long) m46330a(ztk, bnic.m109489a(caae)).get(caae);
        bmzs.m108696a(l);
        long longValue = l.longValue();
        long a = m46313a(ztk, longValue);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_source_id", Long.valueOf(longValue));
        long j = yqi.f54391b;
        if (j >= 0) {
            contentValues.put("last_synced_time", Long.valueOf(j));
        }
        String str = yqi.f54393d;
        if (str != null) {
            contentValues.put("sync_token", str);
        }
        long j2 = yqi.f54392c;
        if (j2 >= 0) {
            contentValues.put("min_local_timestamp", Long.valueOf(j2));
        }
        m46337a(ztk, a, contentValues);
    }

    /* renamed from: a */
    private final void m46342a(ztk ztk, boolean z, Collection collection, boolean z2) {
        if (!collection.isEmpty()) {
            if (m46354l() && !m46353d(collection)) {
                m46340a(ztk, collection, z2, "DataPointsTempHost");
            }
            if (!z) {
                return;
            }
            if (m46353d(collection)) {
                m46339a(ztk, collection, z2);
            } else {
                m46340a(ztk, collection, z2, "DataPoints");
            }
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:5:0x004f */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:51:0x0045 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:56:0x0045 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:10:0x0063 */
    /* JADX WARN: Type inference failed for: r18v9, assign insn: ?: MOVE  (r18v9 ?) = (r18v0 long) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011a A[SYNTHETIC, Splitter:B:46:0x011a] */
    /* renamed from: a */
    private static boolean m46344a(ztk ztk, long j, cadn cadn) {
        zsu zsu;
        ztk ztk2 = ztk;
        cadn cadn2 = cadn;
        ztk.mo31499c();
        String format = String.format("%s = ? AND %s = ?", "data_source_id", "end_time");
        String[] strArr = {Long.toString(j), Long.toString(cadn2.f172702b)};
        HashSet<Long> hashSet = new HashSet();
        zsu a = ztk2.mo31492a("DataPointRows", new String[]{"_id", "data_point"}, format, strArr);
        zsu zsu2 = j;
        while (a.mo31476c()) {
            try {
                long d = a.mo31479d("_id");
                try {
                    cadn cadn3 = (cadn) GeneratedMessageLite.m124016a(cadn.f172699j, a.mo31482g("data_point"), bxus.m123744c());
                    zsu2 = a;
                    if (cadn3.f172702b != cadn2.f172702b || cadn3.f172703c != cadn2.f172703c) {
                        a = zsu2;
                    } else if (cadn3.f172704d.equals(cadn2.f172704d)) {
                        hashSet.add(Long.valueOf(d));
                        a = zsu2;
                    } else {
                        a = zsu2;
                    }
                } catch (bxwf e) {
                    zsu2 = a;
                    bnsl bnsl = (bnsl) f55901e.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("ztu", "a", 932, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Couldn't parse proto");
                    hashSet.add(Long.valueOf(d));
                    a = zsu2;
                } catch (Throwable th) {
                    th = th;
                    zsu = zsu2;
                    Throwable th2 = th;
                    if (zsu != null) {
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                zsu = a;
                Throwable th22 = th;
                if (zsu != null) {
                    try {
                        zsu.close();
                    } catch (Throwable th4) {
                        bqye.m113761a(th22, th4);
                    }
                }
                throw th22;
            }
        }
        zsu zsu3 = a;
        if (zsu3 != null) {
            zsu3.close();
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        ztv a2 = ztk2.mo31496a("DELETE FROM %s WHERE %s in (%s)", "DataPointRows", "_id", m46329a(hashSet.size()));
        int i = 1;
        for (Long l : hashSet) {
            a2.mo31511a(i, l.longValue());
            i++;
        }
        try {
            return a2.f55907a.executeUpdateDelete() > 0;
        } catch (SQLiteException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: a */
    private final boolean m46345a(ztk ztk, String str, boolean z) {
        long j;
        ztk.mo31499c();
        this.f55905g.mo31414c();
        this.f55904f.mo31414c();
        ztk.mo31499c();
        zsu a = ztk.mo31492a("DataSources", new String[]{"_id"}, "identifier = ?", new String[]{str});
        try {
            if (a.mo31476c()) {
                j = a.mo31479d("_id");
            } else {
                j = -1;
            }
            if (a != null) {
                a.close();
            }
            if (j == -1) {
                return false;
            }
            String[] strArr = {String.valueOf(j)};
            if (z) {
                ztk.mo31489a("DataPointRows", String.format("%s = ?", "data_source_id"), strArr);
            }
            ztk.mo31489a("SyncStatus", String.format("%s = ?", "data_source_id"), strArr);
            zsu a2 = ztk.mo31492a("Subscriptions", new String[]{"COUNT(*)"}, String.format("%s = ?", "data_source_id"), new String[]{String.valueOf(j)});
            try {
                if (!a2.mo31474b() || a2.mo31470a(0) <= 0) {
                    if (a2 != null) {
                        a2.close();
                    }
                    zsu a3 = ztk.mo31492a("DataPointRows", new String[]{"COUNT(*)"}, String.format("%s = ?", "origin_data_source_id"), new String[]{String.valueOf(j)});
                    try {
                        if (!a3.mo31474b() || a3.mo31470a(0) <= 0) {
                            if (a3 != null) {
                                a3.close();
                            }
                            return ztk.mo31489a("DataSources", String.format("%s = ?", new Object[]{"identifier"}), new String[]{str}) > 0;
                        }
                        if (a3 != null) {
                            a3.close();
                        }
                        return true;
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                } else {
                    if (a2 != null) {
                        a2.close();
                    }
                    return true;
                }
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
            throw th;
            throw th;
        } catch (Throwable th3) {
            bqye.m113761a(th, th3);
        }
    }

    /* renamed from: a */
    public final int mo31358a(caae caae) {
        zsu a;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            long a2 = m46314a(b, caae);
            int i = 0;
            if (a2 != -1) {
                a = b.mo31492a("DataPointRows", new String[]{"COUNT(*)"}, String.format("%s = ?", "data_source_id"), new String[]{String.valueOf(a2)});
                if (a.mo31474b()) {
                    i = a.mo31470a(0);
                }
                b.mo31498b();
                if (a != null) {
                    a.close();
                }
            }
            b.close();
            return i;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final int mo31359a(caae caae, long j) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            int a = m46312a(b, caae, 0, Long.valueOf(-1 + j));
            if (a > 0) {
                long a2 = m46314a(b, caae);
                long a3 = m46313a(b, a2);
                ContentValues contentValues = new ContentValues();
                contentValues.put("data_source_id", Long.valueOf(a2));
                contentValues.put("min_local_timestamp", Long.valueOf(j));
                m46337a(b, a3, contentValues);
            }
            b.mo31498b();
            b.close();
            return a;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final int mo31344a(List list) {
        boolean z;
        if (list.isEmpty()) {
            return 0;
        }
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            int i = 0;
            for (List<Long> list2 : bnjd.m109574a(list, (int) cdzv.m135696d())) {
                if (list2.size() <= ((int) cdzv.m135696d())) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108588a(z);
                String[] strArr = new String[list2.size()];
                int i2 = 0;
                for (Long l : list2) {
                    strArr[i2] = l.toString();
                    i2++;
                }
                i += b.mo31489a("ChangeLog", String.format("%s IN (%s)", "_id", m46329a(list2.size())), strArr);
            }
            b.mo31498b();
            b.close();
            return i;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final long mo31345a() {
        zsu a;
        long j;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            a = b.mo31492a("ChangeLog", new String[]{String.format("MIN(%s)", "timestamp")}, String.format("%s = ?", "source_table"), new String[]{"DataPointsTempHost"});
            if (a.mo31474b()) {
                j = a.mo31473b(0);
            } else {
                j = 0;
            }
            b.mo31498b();
            if (j == 0) {
                j = Long.MAX_VALUE;
            }
            if (a != null) {
                a.close();
            }
            b.close();
            return j;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final long mo31360a(caae caae, int i) {
        zsu a;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            long a2 = m46314a(b, caae);
            long j = -1;
            if (a2 != -1) {
                String format = String.format("%s = ?", "data_source_id");
                ArrayList arrayList = new ArrayList();
                arrayList.add(String.valueOf(a2));
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                String format2 = String.format("%s DESC", "end_time");
                String format3 = String.format("%s,%s", Integer.valueOf(i - 1), 1);
                srn srn = ztl.f55885a;
                a = b.mo31495a("DataPointRows", new String[]{"end_time"}, format, strArr, format2, format3, null);
                if (a.mo31474b()) {
                    j = a.mo31473b(0);
                }
                b.mo31498b();
                a.close();
            }
            b.close();
            return j;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public final bngx mo31346a(int i, long j) {
        return m46317a("DataPoints", i, j, zrv.f55762b, "value_timestamp");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0299, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x029f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:97:0x0283, B:107:0x0295] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[SYNTHETIC, Splitter:B:107:0x0295] */
    /* renamed from: a */
    public final bngx mo31392a(String str, String str2, String str3, long j, long j2) {
        ztk ztk;
        Throwable th;
        String str4;
        String str5;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = "active_time_millis";
        String str10 = "activity";
        String str11 = "description";
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (str6 != null) {
                try {
                    arrayList.add(String.format("%s = ?", "app_package"));
                    arrayList2.add(str6);
                } catch (Throwable th2) {
                    th = th2;
                    ztk = b;
                }
            }
            String str12 = "name";
            if (str7 != null) {
                arrayList.add(String.format("%s = ?", str12));
                arrayList2.add(str7);
            }
            String str13 = "identifier";
            if (str8 != null) {
                arrayList.add(String.format("%s = ?", str13));
                arrayList2.add(str8);
            }
            String str14 = "start_time";
            if (j != -1) {
                arrayList.add(String.format("%s >= ?", str14));
                arrayList2.add(Long.toString(j));
            }
            if (j2 != -1) {
                if (j2 != 0) {
                    arrayList.add(String.format("((%s = 0 AND %s <= ?) OR (%s != 0 AND %s <= ?))", "end_time", str14, "end_time", "end_time"));
                    arrayList2.add(Long.toString(j2));
                    arrayList2.add(Long.toString(j2));
                } else {
                    arrayList.add(String.format("%s <= ?", "end_time"));
                    arrayList2.add(Long.toString(j2));
                }
            }
            String a = bmxr.m108544a(" AND ").mo66874a((Iterable) arrayList);
            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
            String[] strArr2 = {"app_package", str14, "end_time", str12, str13, str11, str10, str9};
            if (a.isEmpty()) {
                srn srn = ztl.f55885a;
                a = null;
            }
            zsu a2 = b.mo31492a("Sessions", strArr2, a, strArr);
            try {
                bngs b2 = bngx.m109371b(a2.mo31469a());
                while (a2.mo31476c()) {
                    String f = a2.mo31481f("app_package");
                    long d = a2.mo31479d(str14);
                    ztk = b;
                    try {
                        long d2 = a2.mo31479d("end_time");
                        String f2 = a2.mo31481f(str12);
                        String str15 = str12;
                        String e = a2.mo31480e(str13);
                        String str16 = str13;
                        String e2 = a2.mo31480e(str11);
                        String str17 = str14;
                        int b3 = a2.mo31472b(str10);
                        Long c = a2.mo31475c(str9);
                        String str18 = str9;
                        bmxy.m108582a(e, "Session identifier is required");
                        bxvd da = cadz.f172773j.mo74144da();
                        if (d != 0) {
                            str5 = str10;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cadz cadz = (cadz) da.f164949b;
                            str4 = str11;
                            cadz.f172775a |= 8;
                            cadz.f172779e = d;
                        } else {
                            str5 = str10;
                            str4 = str11;
                        }
                        if (d2 != 0) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cadz cadz2 = (cadz) da.f164949b;
                            cadz2.f172775a |= 16;
                            cadz2.f172780f = d2;
                        }
                        bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
                        if (bzzy.f164950c) {
                            bzzy.mo74035c();
                            bzzy.f164950c = false;
                        }
                        bzzz bzzz = (bzzz) bzzy.f164949b;
                        f.getClass();
                        bzzz.f172300a |= 1;
                        bzzz.f172301b = f;
                        bzzz bzzz2 = (bzzz) bzzy.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cadz cadz3 = (cadz) da.f164949b;
                        bzzz2.getClass();
                        cadz3.f172781g = bzzz2;
                        cadz3.f172775a |= 64;
                        if (!f2.isEmpty()) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cadz cadz4 = (cadz) da.f164949b;
                            f2.getClass();
                            cadz4.f172775a |= 2;
                            cadz4.f172777c = f2;
                        }
                        if (!bmxx.m108577a(e2)) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cadz cadz5 = (cadz) da.f164949b;
                            e2.getClass();
                            cadz5.f172775a |= 4;
                            cadz5.f172778d = e2;
                        }
                        if (!(c == null || c.longValue() == 0)) {
                            long longValue = c.longValue();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cadz cadz6 = (cadz) da.f164949b;
                            cadz6.f172775a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            cadz6.f172783i = longValue;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cadz cadz7 = (cadz) da.f164949b;
                        e.getClass();
                        int i = cadz7.f172775a | 1;
                        cadz7.f172775a = i;
                        cadz7.f172776b = e;
                        cadz7.f172775a = i | 128;
                        cadz7.f172782h = b3;
                        b2.mo67668c((cadz) da.mo74062i());
                        b = ztk;
                        str12 = str15;
                        str13 = str16;
                        str14 = str17;
                        str9 = str18;
                        str10 = str5;
                        str11 = str4;
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th4 = th;
                        if (a2 != null) {
                            a2.close();
                        }
                        throw th4;
                    }
                }
                ztk = b;
                bngx a3 = b2.mo67664a();
                if (a2 != null) {
                    a2.close();
                }
                ztk.mo31498b();
                ztk.close();
                return a3;
            } catch (Throwable th5) {
                th = th5;
                ztk = b;
                Throwable th42 = th;
                if (a2 != null) {
                }
                throw th42;
            }
        } catch (Throwable th6) {
            th = th6;
            ztk = b;
            th = th;
            try {
                ztk.close();
            } catch (Throwable th7) {
                bqye.m113761a(th, th7);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, boolean, java.util.Collection, boolean):void
     arg types: [ztk, boolean, bngx, int]
     candidates:
      ztu.a(ztk, caae, long, java.lang.Long):int
      ztu.a(ztk, long, long, long):bnic
      ztu.a(java.lang.String, int, long, zrv):zrb
      ztu.a(ztk, cadz, int, boolean):void
      ztu.a(ztk, java.util.Collection, boolean, java.lang.String):void
      ztu.a(caae, long, long, int):cadp
      ztu.a(long, long, caae, boolean):void
      ztu.a(caae, long, long, cadp):void
      ztu.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      ztu.a(ztk, boolean, java.util.Collection, boolean):void */
    /* renamed from: a */
    public final bngx mo31361a(List list, boolean z) {
        bngx bngx;
        bnic bnic;
        zsu a;
        Throwable th;
        if (list.isEmpty()) {
            return bngx.m109376e();
        }
        ztk b = this.f55902b.mo31503b();
        try {
            bngs b2 = bngx.m109371b(list.size());
            b.mo31497a();
            bnrd a2 = yyk.m45021b(list).entrySet().iterator();
            while (a2.hasNext()) {
                Map.Entry entry = (Map.Entry) a2.next();
                caae caae = (caae) entry.getKey();
                bngx<cadn> bngx2 = (bngx) entry.getValue();
                b.mo31499c();
                if (!bngx2.isEmpty()) {
                    long j = Long.MAX_VALUE;
                    long j2 = 0;
                    for (cadn cadn : bngx2) {
                        j = Math.min(cadn.f172702b, j);
                        j2 = Math.max(cadn.f172702b, j2);
                    }
                    b.mo31499c();
                    long a3 = m46314a(b, caae);
                    if (a3 == -1) {
                        bnic = bnon.f131923a;
                    } else {
                        String format = String.format("%s = ? AND (%s BETWEEN ? AND ?)", "data_source_id", "end_time");
                        String[] strArr = {Long.toString(a3), Long.toString(j), Long.toString(j2)};
                        a = b.mo31493a("DataPointRows", new String[]{"end_time"}, format, strArr, String.format("%s ASC", "end_time"));
                        bnia c = bnic.m109499c(a.mo31469a());
                        while (a.mo31476c()) {
                            c.mo67629b(Long.valueOf(a.mo31473b(0)));
                        }
                        bnic a4 = c.mo67751a();
                        if (a != null) {
                            a.close();
                        }
                        bnic = a4;
                    }
                    bngs b3 = bngx.m109371b(bngx2.size());
                    for (cadn cadn2 : bngx2) {
                        if (!bnic.contains(Long.valueOf(cadn2.f172702b))) {
                            b3.mo67668c(cadn2);
                        }
                    }
                    bngx = m46322a(b, b3.mo67664a());
                    m46342a(b, z, (Collection) bngx, false);
                } else {
                    bngx = bngx.m109376e();
                }
                b2.mo67666b((Iterable) bngx);
            }
            b.mo31498b();
            bngx a5 = b2.mo67664a();
            b.close();
            return a5;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            try {
                b.close();
            } catch (Throwable th4) {
                bqye.m113761a(th3, th4);
            }
            throw th3;
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.b(yfz, boolean):bngx
     arg types: [yfz, int]
     candidates:
      ztu.b(ztk, java.lang.String):long
      ztu.b(ztk, java.util.Set):java.util.Map
      ztu.b(int, long):bngx
      ztu.b(cadz, int):void
      zrj.b(cadz, int):void
      zra.b(int, long):bngx
      ztu.b(yfz, boolean):bngx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(yfz, boolean):bngx
     arg types: [yfz, int]
     candidates:
      ztu.a(ztk, long):long
      ztu.a(ztk, caae):long
      ztu.a(ztk, caah):long
      ztu.a(zsu, nw):bngx
      ztu.a(ztk, java.util.List):bngx
      ztu.a(long, nw):caae
      ztu.a(ztk, java.util.Set):java.util.Map
      ztu.a(ztk, java.lang.String):zsu
      ztu.a(ztk, yqi):void
      ztu.a(int, int):boolean
      ztu.a(caae, long):int
      ztu.a(caae, int):long
      ztu.a(int, long):bngx
      ztu.a(java.util.List, boolean):bngx
      ztu.a(cadp, boolean):cadp
      ztu.a(cadz, int):boolean
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(java.util.List, boolean):bngx
      zrc.a(cadp, boolean):cadp
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      ztu.a(yfz, boolean):bngx */
    /* renamed from: a */
    public final bngx mo31362a(yfz yfz) {
        if (cdzv.m135698f()) {
            return m46347b(yfz, false);
        }
        return m46318a(yfz, false);
    }

    /* renamed from: a */
    public final caae mo31377a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            C1230nw a = m46332a(b, "identifier = ?", new String[]{str});
            b.mo31498b();
            if (a.mo15537b() > 0) {
                caae caae = (caae) a.mo15538b(0);
                b.close();
                return caae;
            }
            b.close();
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(caae, long, long, int, boolean):cadp
     arg types: [caae, long, int, int, int]
     candidates:
      ztu.a(java.lang.String, int, long, zrv, java.lang.String):bngx
      ztu.a(ztk, zsu, java.lang.String, java.lang.String, java.lang.String):caae
      ztu.a(java.lang.String, java.lang.String, java.lang.String, long, long):bngx
      zrj.a(java.lang.String, java.lang.String, java.lang.String, long, long):bngx
      ztu.a(caae, long, long, int, boolean):cadp */
    /* renamed from: a */
    public final cadp mo31363a(caae caae, long j, int i) {
        return m46328a(caae, j, Long.MAX_VALUE, i, true);
    }

    /* renamed from: a */
    public final cadp mo31364a(caae caae, long j, long j2) {
        return mo31365a(caae, j, j2, -1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(caae, long, long, int, boolean):cadp
     arg types: [caae, long, long, int, int]
     candidates:
      ztu.a(java.lang.String, int, long, zrv, java.lang.String):bngx
      ztu.a(ztk, zsu, java.lang.String, java.lang.String, java.lang.String):caae
      ztu.a(java.lang.String, java.lang.String, java.lang.String, long, long):bngx
      zrj.a(java.lang.String, java.lang.String, java.lang.String, long, long):bngx
      ztu.a(caae, long, long, int, boolean):cadp */
    /* renamed from: a */
    public final cadp mo31365a(caae caae, long j, long j2, int i) {
        return m46328a(caae, j, j2, i, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, boolean, java.util.Collection, boolean):void
     arg types: [ztk, boolean, bngx, int]
     candidates:
      ztu.a(ztk, caae, long, java.lang.Long):int
      ztu.a(ztk, long, long, long):bnic
      ztu.a(java.lang.String, int, long, zrv):zrb
      ztu.a(ztk, cadz, int, boolean):void
      ztu.a(ztk, java.util.Collection, boolean, java.lang.String):void
      ztu.a(caae, long, long, int):cadp
      ztu.a(long, long, caae, boolean):void
      ztu.a(caae, long, long, cadp):void
      ztu.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      ztu.a(ztk, boolean, java.util.Collection, boolean):void */
    /* renamed from: a */
    public final cadp mo31366a(cadp cadp, boolean z) {
        if (cadp.f172714c.size() == 0) {
            return cadp;
        }
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            bngx a = m46322a(b, cadp.f172714c);
            m46342a(b, z, (Collection) a, false);
            b.mo31498b();
            bxvd bxvd = (bxvd) cadp.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cadp);
            cado cado = (cado) bxvd;
            if (cado.f164950c) {
                cado.mo74035c();
                cado.f164950c = false;
            }
            cadp cadp2 = cadp.f172710f;
            ((cadp) cado.f164949b).f172714c = GeneratedMessageLite.m124030de();
            cado.mo74617a(a);
            cadp cadp3 = (cadp) cado.mo74062i();
            b.close();
            return cadp3;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final zrb mo31347a(long j) {
        return m46333a("SessionsTempHost", -1, j, zrv.f55761a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, boolean, java.util.Collection, boolean):void
     arg types: [ztk, boolean, java.util.ArrayList, int]
     candidates:
      ztu.a(ztk, caae, long, java.lang.Long):int
      ztu.a(ztk, long, long, long):bnic
      ztu.a(java.lang.String, int, long, zrv):zrb
      ztu.a(ztk, cadz, int, boolean):void
      ztu.a(ztk, java.util.Collection, boolean, java.lang.String):void
      ztu.a(caae, long, long, int):cadp
      ztu.a(long, long, caae, boolean):void
      ztu.a(caae, long, long, cadp):void
      ztu.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      ztu.a(ztk, boolean, java.util.Collection, boolean):void */
    /* renamed from: a */
    public final void mo31367a(long j, long j2, caae caae, boolean z) {
        Throwable th;
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            long a = m46314a(b, caae);
            bnic a2 = m46323a(b, a, j, j2);
            ArrayList arrayList = new ArrayList(a2.size());
            bnrd a3 = a2.iterator();
            while (a3.hasNext()) {
                cadn cadn = (cadn) a3.next();
                if (m46344a(b, a, cadn)) {
                    arrayList.add(cadn);
                }
            }
            m46342a(b, z, (Collection) arrayList, true);
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(long, long, caae, boolean):void
     arg types: [long, long, caae, int]
     candidates:
      ztu.a(ztk, caae, long, java.lang.Long):int
      ztu.a(ztk, long, long, long):bnic
      ztu.a(java.lang.String, int, long, zrv):zrb
      ztu.a(ztk, cadz, int, boolean):void
      ztu.a(ztk, java.util.Collection, boolean, java.lang.String):void
      ztu.a(ztk, boolean, java.util.Collection, boolean):void
      ztu.a(caae, long, long, int):cadp
      ztu.a(caae, long, long, cadp):void
      ztu.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      ztu.a(long, long, caae, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(cadp, boolean):cadp
     arg types: [cadp, int]
     candidates:
      ztu.a(ztk, long):long
      ztu.a(ztk, caae):long
      ztu.a(ztk, caah):long
      ztu.a(yfz, boolean):bngx
      ztu.a(zsu, nw):bngx
      ztu.a(ztk, java.util.List):bngx
      ztu.a(long, nw):caae
      ztu.a(ztk, java.util.Set):java.util.Map
      ztu.a(ztk, java.lang.String):zsu
      ztu.a(ztk, yqi):void
      ztu.a(int, int):boolean
      ztu.a(caae, long):int
      ztu.a(caae, int):long
      ztu.a(int, long):bngx
      ztu.a(java.util.List, boolean):bngx
      ztu.a(cadz, int):boolean
      zrc.a(caae, long):int
      zrc.a(caae, int):long
      zrc.a(java.util.List, boolean):bngx
      zrj.a(cadz, int):boolean
      zra.a(int, long):bngx
      ztu.a(cadp, boolean):cadp */
    /* renamed from: a */
    public final void mo31368a(caae caae, long j, long j2, cadp cadp) {
        mo31367a(j, j2, caae, true);
        if (cadp.f172714c.size() > 0) {
            mo31366a(cadp, true);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, boolean, java.util.Collection, boolean):void
     arg types: [ztk, boolean, java.util.ArrayList, int]
     candidates:
      ztu.a(ztk, caae, long, java.lang.Long):int
      ztu.a(ztk, long, long, long):bnic
      ztu.a(java.lang.String, int, long, zrv):zrb
      ztu.a(ztk, cadz, int, boolean):void
      ztu.a(ztk, java.util.Collection, boolean, java.lang.String):void
      ztu.a(caae, long, long, int):cadp
      ztu.a(long, long, caae, boolean):void
      ztu.a(caae, long, long, cadp):void
      ztu.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      ztu.a(ztk, boolean, java.util.Collection, boolean):void */
    /* renamed from: a */
    public final void mo31369a(caae caae, List list, boolean z) {
        if (!list.isEmpty()) {
            ztk b = this.f55902b.mo31503b();
            try {
                b.mo31497a();
                long a = m46314a(b, caae);
                if (a != -1) {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        cadn cadn = (cadn) it.next();
                        if (m46344a(b, a, cadn)) {
                            arrayList.add(cadn);
                        }
                    }
                    m46342a(b, z, (Collection) arrayList, true);
                    b.mo31498b();
                } else {
                    bnsl bnsl = (bnsl) f55901e.mo68387b();
                    bnsl.mo68432a("ztu", "a", 889, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Invalid data source specified: %s", caae.f172326b);
                }
                b.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo31381a(caah caah) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            m46315a(b, caah);
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo31348a(Set set) {
        boolean z;
        if (!set.isEmpty()) {
            long a = this.f55906h.mo20505a();
            ztk b = this.f55902b.mo31503b();
            try {
                b.mo31497a();
                for (List<Long> list : bnjd.m109574a(set, (int) cdzv.m135696d())) {
                    int i = 1;
                    if (list.size() <= ((int) cdzv.m135696d())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmxy.m108588a(z);
                    ztv a2 = b.mo31496a("UPDATE %s set %s = %s + 1, %s = %s where %s in (%s)", "ChangeLog", "sync_tries", "sync_tries", "last_sync_ms", Long.valueOf(a), "_id", m46329a(list.size()));
                    for (Long l : list) {
                        a2.mo31511a(i, l.longValue());
                        i++;
                    }
                    a2.mo31510a();
                }
                b.mo31498b();
                b.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo31370a(Set set, long j, long j2, boolean z) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            for (caae caae : mo31388h()) {
                caah caah = caae.f172330f;
                if (caah == null) {
                    caah = caah.f172333d;
                }
                if (set.contains(caah.f172336b)) {
                    m46312a(b, caae, j, Long.valueOf(j2));
                }
            }
            if (z) {
                bxvd da = cabc.f172411k.mo74144da();
                caaa caaa = caaa.f172305j;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cabc cabc = (cabc) da.f164949b;
                caaa.getClass();
                cabc.f172417e = caaa;
                int i = cabc.f172413a | 8;
                cabc.f172413a = i;
                cabc.f172414b = 3;
                int i2 = i | 1;
                cabc.f172413a = i2;
                "".getClass();
                cabc.f172413a = i2 | 4;
                cabc.f172416d = "";
                if (!cabc.f172422j.mo73666a()) {
                    cabc.f172422j = GeneratedMessageLite.m124021a(cabc.f172422j);
                }
                bxsy.m123078a(set, cabc.f172422j);
                bxvd da2 = caby.f172491d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                caby caby = (caby) da2.f164949b;
                int i3 = caby.f172493a | 1;
                caby.f172493a = i3;
                caby.f172494b = j;
                caby.f172493a = i3 | 2;
                caby.f172495c = j2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cabc cabc2 = (cabc) da.f164949b;
                caby caby2 = (caby) da2.mo74062i();
                caby2.getClass();
                cabc2.f172421i = caby2;
                cabc2.f172413a |= 128;
                m46350b(b, bngx.m109356a((cabc) da.mo74062i()), false, "DataPoints");
            }
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo31371a(ydh ydh) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            b.mo31489a("DataPointSyncStateTable", "", null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("content", ydh.serializeToBytes());
            b.mo31490a("DataPointSyncStateTable", contentValues);
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo31382a(yqi yqi) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            m46341a(b, yqi);
            b.mo31498b();
            b.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ztu.a(ztk, cadz, int, boolean):void
     arg types: [ztk, cadz, int, int]
     candidates:
      ztu.a(ztk, caae, long, java.lang.Long):int
      ztu.a(ztk, long, long, long):bnic
      ztu.a(java.lang.String, int, long, zrv):zrb
      ztu.a(ztk, java.util.Collection, boolean, java.lang.String):void
      ztu.a(ztk, boolean, java.util.Collection, boolean):void
      ztu.a(caae, long, long, int):cadp
      ztu.a(long, long, caae, boolean):void
      ztu.a(caae, long, long, cadp):void
      ztu.a(java.util.Set, long, long, boolean):void
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      ztu.a(ztk, cadz, int, boolean):void */
    /* renamed from: a */
    public final boolean mo31393a(cadz cadz, int i) {
        ztk b = this.f55902b.mo31503b();
        try {
            b.mo31497a();
            boolean z = false;
            int a = b.mo31489a("Sessions", String.format("%s = ? AND %s = ? AND %s = ? AND %s = ?", "app_package", "name", "start_time", "end_time"), new String[]{yym.m45036a(cadz), cadz.f172777c, Long.toString(cadz.f172779e), Long.toString(cadz.f172780f)});
            if (a > 0) {
                m46338a(b, cadz, i, true);
            }
            b.mo31498b();
            if (a > 0) {
                z = true;
            }
            b.close();
            return z;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
