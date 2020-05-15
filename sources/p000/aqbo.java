package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.google.android.gms.security.snet.SafetyNetClientChimeraService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import org.json.JSONObject;

/* renamed from: aqbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbo {

    /* renamed from: a */
    public static final bnic f85574a = bnic.m109490a((Object) 1, (Object) 12);

    /* renamed from: b */
    public static final bnic f85575b = bnic.m109489a((Object) 12);

    /* renamed from: c */
    public static final long f85576c = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: d */
    static final long f85577d = TimeUnit.DAYS.toMillis(1);

    /* renamed from: e */
    public static final long f85578e = TimeUnit.MINUTES.toMillis(4);

    /* renamed from: l */
    static final SparseArray f85579l = new SparseArray();

    /* renamed from: f */
    public final Context f85580f;

    /* renamed from: g */
    public aqby f85581g;

    /* renamed from: h */
    public aqbp f85582h;

    /* renamed from: i */
    public aqbw f85583i;

    /* renamed from: j */
    SparseArray f85584j;

    /* renamed from: k */
    public SparseArray f85585k;

    /* renamed from: m */
    public final aqbs f85586m;

    /* renamed from: n */
    public final aqdk f85587n;

    /* renamed from: o */
    public final AtomicBoolean f85588o;

    /* renamed from: p */
    public long f85589p;

    /* renamed from: q */
    public long f85590q;

    /* renamed from: r */
    private final ExecutorService f85591r;

    /* renamed from: s */
    private final ExecutorService f85592s = new soc(5, 10);

    /* renamed from: t */
    private final AtomicBoolean f85593t;

    /* renamed from: u */
    private final aqbz f85594u;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnic.a(java.lang.Object, java.lang.Object):bnic
     arg types: [int, int]
     candidates:
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bnic.a(java.lang.Object, java.lang.Object):bnic */
    static {
        aqbo.class.getSimpleName();
    }

    public aqbo(Context context, aqbz aqbz, ExecutorService executorService) {
        this.f85580f = context;
        this.f85591r = executorService;
        this.f85594u = aqbz;
        this.f85587n = aqdk.m71388a(context);
        this.f85586m = new aqbs(context);
        this.f85593t = new AtomicBoolean(true);
        this.f85588o = new AtomicBoolean(true);
        this.f85591r.execute(new aqbl(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    private final void m71309a(apyk apyk) {
        int i = apyk.f85143a.getInt("snet_safe_browsing_num_consecutive_update_errors", 0) + 1;
        long currentTimeMillis = System.currentTimeMillis() + Math.min((long) (Math.pow(2.0d, (double) (i - 1)) * 900000.0d * (new Random().nextDouble() + 1.0d)), 86400000L);
        this.f85590q = currentTimeMillis;
        apyk.mo47699a(currentTimeMillis);
        apyk.mo47706c(i);
    }

    /* renamed from: c */
    private final boolean m71310c() {
        return System.currentTimeMillis() >= this.f85590q;
    }

    /* renamed from: b */
    public final boolean mo47738b() {
        return (this.f85581g == null || this.f85584j == null || this.f85585k == null || this.f85582h == null || this.f85583i == null || this.f85594u == null) ? false : true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aqbw.a(aqbv, boolean):aqbv
     arg types: [aqbv, int]
     candidates:
      aqbw.a(long, long):boolean
      aqbw.a(aqbv, boolean):aqbv */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0178  */
    /* renamed from: a */
    public final JSONObject mo47735a(List list, List list2, String str, String str2) {
        aqcr aqcr;
        aqbv aqbv;
        ReadWriteLock readWriteLock;
        ReadWriteLock readWriteLock2;
        Iterator it;
        String str3 = str2;
        HashSet hashSet = new HashSet();
        Set a = this.f85587n.mo47759a();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Integer valueOf = Integer.valueOf(((Integer) it2.next()).intValue());
            if (a.contains(valueOf)) {
                hashSet.add(valueOf);
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (mo47738b()) {
            if (mo47738b() && m71310c()) {
                SafetyNetClientChimeraService.m92416a(this.f85580f);
            }
            HashMap hashMap = new HashMap();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                int intValue = ((Integer) it3.next()).intValue();
                aqbt aqbt = (aqbt) this.f85584j.get(intValue);
                if (aqbt != null) {
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        apgr apgr = (apgr) it4.next();
                        aqbt.f85608c.readLock().lock();
                        try {
                            apgr b = apgr.mo47194b();
                            Map map = aqbt.f85606a;
                            if (map == null || !map.containsKey(b)) {
                                apgv apgv = aqbt.f85607b;
                                if (apgv != null) {
                                    byte[] bArr = b.f84346a;
                                    if (apgv.f84350a != null) {
                                        long a2 = apgv.m70256a(bArr);
                                        int[] iArr = apgv.f84350a;
                                        int length = iArr.length - 1;
                                        int i = 3;
                                        while (true) {
                                            if (i > length) {
                                                break;
                                            }
                                            int i2 = i + ((length - i) / 2);
                                            it = it3;
                                            apgr apgr2 = b;
                                            int i3 = length;
                                            long a3 = apgv.m70255a((long) iArr[i2]);
                                            if (a3 != a2) {
                                                if (a3 >= a2) {
                                                    length = i2 - 1;
                                                } else {
                                                    i = i2 + 1;
                                                    length = i3;
                                                }
                                                it3 = it;
                                                b = apgr2;
                                            } else {
                                                b = i2 == -1 ? null : apgr2;
                                            }
                                        }
                                        aqbt.f85608c.readLock().unlock();
                                        if (b == null) {
                                            hashMap.put(b, apgr);
                                            it3 = it;
                                        } else if (f85574a.contains(Integer.valueOf(intValue))) {
                                            aqbk aqbk = (aqbk) this.f85585k.get(intValue);
                                            if (aqbk != null) {
                                                apgr b2 = apgr.mo47194b();
                                                if (aqbk.mo47730a(b2)) {
                                                    hashMap.put(b2, apgr);
                                                    it3 = it;
                                                } else {
                                                    it3 = it;
                                                }
                                            } else {
                                                it3 = it;
                                            }
                                        } else {
                                            it3 = it;
                                        }
                                    }
                                    it = it3;
                                    b = null;
                                    aqbt.f85608c.readLock().unlock();
                                    if (b == null) {
                                    }
                                }
                            } else {
                                List list3 = (List) aqbt.f85606a.get(b);
                                if (list3 != null) {
                                    if (!list3.isEmpty()) {
                                        Iterator it5 = list3.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                break;
                                            }
                                            apgr apgr3 = (apgr) it5.next();
                                            if (apgr.mo47193a(apgr3)) {
                                                aqbt.f85608c.readLock().unlock();
                                                it = it3;
                                                b = apgr3;
                                                break;
                                            }
                                        }
                                    }
                                }
                                aqbt.f85608c.readLock().unlock();
                                it = it3;
                                if (b == null) {
                                }
                            }
                            aqbt.f85608c.readLock().unlock();
                            it = it3;
                            b = null;
                            if (b == null) {
                            }
                        } catch (Throwable th) {
                            aqbt.f85608c.readLock().unlock();
                            throw th;
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    apgr apgr4 = (apgr) entry.getKey();
                    apgr apgr5 = (apgr) entry.getValue();
                    aqbw aqbw = this.f85583i;
                    apgr b3 = apgr5.mo47194b();
                    aqbw.f85617b.readLock().lock();
                    try {
                        if (aqbw.f85616a.containsKey(b3)) {
                            aqbu aqbu = (aqbu) aqbw.f85616a.get(b3);
                            if (aqbu == null) {
                                readWriteLock = aqbw.f85617b;
                            } else {
                                Map map2 = aqbu.f85613b;
                                if (map2 != null && map2.containsKey(apgr5)) {
                                    aqbv = (aqbv) aqbu.f85613b.get(apgr5);
                                    if (aqbv != null) {
                                        if (aqbw.m71328a(aqbv, false) == null) {
                                            aqbv = null;
                                        }
                                        readWriteLock2 = aqbw.f85617b;
                                        readWriteLock2.readLock().unlock();
                                        if (aqbv != null) {
                                            hashMap2.put(apgr4, apgr5);
                                        } else if (aqde.m71378a(aqbv.f85614a)) {
                                            JSONObject a4 = aqde.m71377a(hashSet, aqbv.f85614a.f85696b, Collections.singleton(apgr5));
                                            if (a4.length() != 0) {
                                                return a4;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                Map map3 = aqbu.f85612a;
                                if (map3 != null) {
                                    for (Map.Entry entry2 : map3.entrySet()) {
                                        if (apgr5.mo47193a((apgr) entry2.getKey())) {
                                            aqbv = aqbw.m71327a((aqbv) entry2.getValue());
                                            readWriteLock2 = aqbw.f85617b;
                                            readWriteLock2.readLock().unlock();
                                            break;
                                        }
                                    }
                                }
                                readWriteLock = aqbw.f85617b;
                            }
                        } else {
                            readWriteLock = aqbw.f85617b;
                        }
                        readWriteLock.readLock().unlock();
                        aqbv = null;
                        if (aqbv != null) {
                        }
                    } catch (Throwable th2) {
                        aqbw.f85617b.readLock().unlock();
                        throw th2;
                    }
                }
                if (!hashMap2.isEmpty()) {
                    SharedPreferences sharedPreferences = new apyk(this.f85580f).f85143a;
                    String valueOf2 = String.valueOf(str);
                    if (System.currentTimeMillis() < sharedPreferences.getLong(valueOf2.length() == 0 ? new String("snet_safe_browsing_next_allowed_time_to_query_ms_") : "snet_safe_browsing_next_allowed_time_to_query_ms_".concat(valueOf2), 0)) {
                        return jSONObject;
                    }
                    Set<apgr> keySet = hashMap2.keySet();
                    aqbz aqbz = this.f85594u;
                    Set<Integer> a5 = aqdk.m71388a(aqbz.f85623a).mo47759a();
                    bxvd da = aqcp.f85687e.mo74144da();
                    aqcd a6 = aqbz.mo47751a();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aqcp aqcp = (aqcp) da.f164949b;
                    a6.getClass();
                    aqcp.f85690b = a6;
                    aqcp.f85689a |= 1;
                    if (str3 != null) {
                        bxvd da2 = aqcd.f85638d.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        aqcd aqcd = (aqcd) da2.f164949b;
                        str2.getClass();
                        aqcd.f85640a |= 1;
                        aqcd.f85641b = str3;
                        aqcd aqcd2 = (aqcd) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aqcp aqcp2 = (aqcp) da.f164949b;
                        aqcd2.getClass();
                        aqcp2.f85692d = aqcd2;
                        aqcp2.f85689a |= 4;
                    }
                    bxvd da3 = aqdb.f85741e.mo74144da();
                    for (Integer num : a5) {
                        int intValue2 = num.intValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        aqdb aqdb = (aqdb) da3.f164949b;
                        if (!aqdb.f85743a.mo73666a()) {
                            aqdb.f85743a = bxvk.m124019a(aqdb.f85743a);
                        }
                        aqdb.f85743a.mo74153d(intValue2);
                    }
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    aqdb aqdb2 = (aqdb) da3.f164949b;
                    if (!aqdb2.f85744b.mo73666a()) {
                        aqdb2.f85744b = bxvk.m124019a(aqdb2.f85744b);
                    }
                    aqdb2.f85744b.mo74153d(3);
                    for (apgr apgr6 : keySet) {
                        bxvd da4 = aqcv.f85714c.mo74144da();
                        bxtx a7 = bxtx.m123261a(apgr6.f84346a);
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        aqcv aqcv = (aqcv) da4.f164949b;
                        a7.getClass();
                        aqcv.f85716a |= 1;
                        aqcv.f85717b = a7;
                        aqcv aqcv2 = (aqcv) da4.mo74062i();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        aqdb aqdb3 = (aqdb) da3.f164949b;
                        aqcv2.getClass();
                        if (!aqdb3.f85746d.mo73666a()) {
                            aqdb3.f85746d = bxvk.m124021a(aqdb3.f85746d);
                        }
                        aqdb3.f85746d.add(aqcv2);
                    }
                    aqda aqda = aqda.URL_EXPRESSION;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    aqdb aqdb4 = (aqdb) da3.f164949b;
                    aqda.getClass();
                    if (!aqdb4.f85745c.mo73666a()) {
                        aqdb4.f85745c = bxvk.m124019a(aqdb4.f85745c);
                    }
                    aqdb4.f85745c.mo74153d(aqda.f85740e);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    aqcp aqcp3 = (aqcp) da.f164949b;
                    aqdb aqdb5 = (aqdb) da3.mo74062i();
                    aqdb5.getClass();
                    aqcp3.f85691c = aqdb5;
                    aqcp3.f85689a |= 2;
                    byte[] a8 = aqbz.mo47752a(2, ((aqcp) da.mo74062i()).mo73642k(), str);
                    if (a8 == null || a8.length == 0) {
                        aqcr = null;
                    } else {
                        try {
                            aqcr = (aqcr) bxvk.m124016a(aqcr.f85693e, a8, bxus.m123744c());
                        } catch (bxwf e) {
                            aqcr = null;
                        }
                    }
                    if (aqcr == null) {
                        return jSONObject;
                    }
                    Context context = this.f85580f;
                    if ((aqcr.f85695a & 1) != 0) {
                        aqcg aqcg = aqcr.f85697c;
                        if (aqcg == null) {
                            aqcg = aqcg.f85649b;
                        }
                        if (aqcg.f85651a > 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            aqcg aqcg2 = aqcr.f85697c;
                            if (aqcg2 == null) {
                                aqcg2 = aqcg.f85649b;
                            }
                            long j = aqcg2.f85651a;
                            apyk apyk = new apyk(context);
                            long j2 = currentTimeMillis + (j * 1000);
                            String valueOf3 = String.valueOf(str);
                            apyk.mo47701a(valueOf3.length() == 0 ? new String("snet_safe_browsing_next_allowed_time_to_query_ms_") : "snet_safe_browsing_next_allowed_time_to_query_ms_".concat(valueOf3), j2);
                        }
                    }
                    this.f85592s.execute(new aqbm(this, hashMap2, aqcr));
                    return aqde.m71378a(aqcr) ? aqde.m71377a(hashSet, aqcr.f85696b, new HashSet(hashMap2.values())) : jSONObject;
                }
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ef, code lost:
        if (r23 == null) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f2, code lost:
        r23.mo47734a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f5, code lost:
        r0 = r1.f85593t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0330, code lost:
        if (r23 == null) goto L_0x01f5;
     */
    /* renamed from: a */
    public final void mo47736a(aqbn aqbn) {
        apyk apyk;
        AtomicBoolean atomicBoolean;
        aqbk aqbk;
        List c;
        aqda aqda;
        int i = 1;
        if (this.f85593t.compareAndSet(true, false)) {
            try {
                apyk = new apyk(this.f85580f);
                if (m71310c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SparseArray sparseArray = new SparseArray();
                    for (Integer num : this.f85587n.mo47759a()) {
                        int intValue = num.intValue();
                        if (!f85574a.contains(Integer.valueOf(intValue)) || apyk.mo47697a(intValue) + f85577d <= currentTimeMillis) {
                            aqbt aqbt = (aqbt) this.f85584j.get(intValue);
                            if (aqbt != null) {
                                sparseArray.put(intValue, aqbt.mo47747a());
                            } else {
                                sparseArray.put(intValue, null);
                            }
                        }
                    }
                    if (sparseArray.size() != 0) {
                        aqbz aqbz = this.f85594u;
                        bxvd da = aqck.f85667d.mo74144da();
                        aqcd a = aqbz.mo47751a();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        aqck aqck = (aqck) da.f164949b;
                        a.getClass();
                        aqck.f85670b = a;
                        aqck.f85669a |= 1;
                        aqdk a2 = aqdk.m71388a(aqbz.f85623a);
                        int i2 = 0;
                        while (i2 < sparseArray.size()) {
                            bxvd da2 = aqcj.f85659g.mo74144da();
                            int keyAt = sparseArray.keyAt(i2);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            aqcj aqcj = (aqcj) da2.f164949b;
                            int i3 = aqcj.f85661a | 1;
                            aqcj.f85661a = i3;
                            aqcj.f85662b = keyAt;
                            aqcj.f85661a = i3 | 2;
                            aqcj.f85663c = 3;
                            if (keyAt == 12) {
                                aqda = aqda.BINARY_DIGEST;
                            } else {
                                aqda = aqda.URL_EXPRESSION;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            aqcj aqcj2 = (aqcj) da2.f164949b;
                            aqcj2.f85664d = aqda.f85740e;
                            aqcj2.f85661a |= 4;
                            byte[] bArr = (byte[]) sparseArray.valueAt(i2);
                            if (bArr != null) {
                                if (bArr.length > 0) {
                                    bxtx a3 = bxtx.m123261a(bArr);
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    aqcj aqcj3 = (aqcj) da2.f164949b;
                                    a3.getClass();
                                    aqcj3.f85661a |= 8;
                                    aqcj3.f85665e = a3;
                                }
                            }
                            aqch aqch = (aqch) aqci.f85653e.mo74144da();
                            int a4 = a2.mo47758a(keyAt);
                            if (aqch.f164950c) {
                                aqch.mo74035c();
                                aqch.f164950c = false;
                            }
                            aqci aqci = (aqci) aqch.f164949b;
                            aqci.f85655a |= 1;
                            aqci.f85656b = a4;
                            int a5 = a2.mo47758a(keyAt);
                            if (aqch.f164950c) {
                                aqch.mo74035c();
                                aqch.f164950c = false;
                            }
                            aqci aqci2 = (aqci) aqch.f164949b;
                            aqci2.f85655a |= 2;
                            aqci2.f85657c = a5;
                            aqch.mo47754a(aqcf.RAW);
                            aqch.mo47754a(aqcf.RICE);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            aqcj aqcj4 = (aqcj) da2.f164949b;
                            aqci aqci3 = (aqci) aqch.mo74062i();
                            aqci3.getClass();
                            aqcj4.f85666f = aqci3;
                            aqcj4.f85661a |= 16;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            aqck aqck2 = (aqck) da.f164949b;
                            aqcj aqcj5 = (aqcj) da2.mo74062i();
                            aqcj5.getClass();
                            if (!aqck2.f85671c.mo73666a()) {
                                aqck2.f85671c = bxvk.m124021a(aqck2.f85671c);
                            }
                            aqck2.f85671c.add(aqcj5);
                            i2++;
                            i = 1;
                        }
                        byte[] a6 = aqbz.mo47752a(i, ((aqck) da.mo74062i()).mo73642k(), "AIzaSyBOOWlOhte3AhpCUZaoGoHa1yjYRI1dIww");
                        if (a6 != null) {
                            aqco aqco = (aqco) bxvk.m124016a(aqco.f85682d, a6, bxus.m123744c());
                            apyk.mo47701a("snet_safe_browsing_last_update_time_ms", currentTimeMillis);
                            apyk.mo47706c(0);
                            if ((aqco.f85684a & i) != 0) {
                                aqcg aqcg = aqco.f85686c;
                                if (aqcg == null) {
                                    aqcg = aqcg.f85649b;
                                }
                                if (aqcg.f85651a > 0) {
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    aqcg aqcg2 = aqco.f85686c;
                                    if (aqcg2 == null) {
                                        aqcg2 = aqcg.f85649b;
                                    }
                                    long j = currentTimeMillis2 + (aqcg2.f85651a * 1000);
                                    this.f85590q = j;
                                    apyk.mo47699a(j);
                                }
                            }
                            try {
                                SparseArray a7 = aqde.m71374a(aqco);
                                if (a7 != null) {
                                    for (int i4 = 0; i4 < a7.size(); i4++) {
                                        int keyAt2 = a7.keyAt(i4);
                                        aqdd aqdd = (aqdd) a7.get(keyAt2);
                                        try {
                                            List list = aqdd.f85754a;
                                            Queue queue = aqdd.f85755b;
                                            byte[] bArr2 = aqdd.f85756c;
                                            byte[] bArr3 = aqdd.f85757d;
                                            boolean z = aqdd.f85758e;
                                            Set a8 = this.f85587n.mo47759a();
                                            Integer valueOf = Integer.valueOf(keyAt2);
                                            if (a8.contains(valueOf)) {
                                                if (mo47738b()) {
                                                    if (apum.m71048a(list)) {
                                                        if (!apum.m71048a(queue)) {
                                                        }
                                                        apyk.mo47701a(apyk.m71180b(keyAt2), currentTimeMillis);
                                                    }
                                                    aqbt aqbt2 = (aqbt) this.f85584j.get(keyAt2);
                                                    if (!z && f85574a.contains(valueOf) && (aqbk = (aqbk) this.f85585k.get(keyAt2)) != null && (c = aqbk.mo47731c()) != null && !c.isEmpty()) {
                                                        aqbt2 = new aqbt(keyAt2);
                                                        aqbx a9 = this.f85581g.mo47750a(keyAt2);
                                                        if (a9 != null) {
                                                            aqbt2.mo47746a(c, null, a9.f85618a, a9.f85619b, true);
                                                        }
                                                    }
                                                    aqbt aqbt3 = aqbt2;
                                                    if (aqbt3 == null) {
                                                        aqbt3 = new aqbt(keyAt2);
                                                        if (aqbt3.mo47746a(list, null, bArr2, bArr3, z)) {
                                                            this.f85584j.put(keyAt2, aqbt3);
                                                        }
                                                    } else if (!aqbt3.mo47746a(list, queue, bArr2, bArr3, z)) {
                                                    }
                                                    aqbk aqbk2 = (aqbk) this.f85585k.get(keyAt2);
                                                    if (aqbk2 == null) {
                                                        aqbk aqbk3 = new aqbk(this.f85580f, keyAt2, this.f85586m);
                                                        aqbk3.mo47729a(aqbt3, this.f85581g);
                                                        this.f85585k.put(keyAt2, aqbk3);
                                                    } else {
                                                        aqbk2.mo47729a(aqbt3, this.f85581g);
                                                    }
                                                    if (f85574a.contains(valueOf)) {
                                                        aqbt3.mo47748b();
                                                        if (!z) {
                                                            this.f85584j.put(keyAt2, aqbt3);
                                                        }
                                                    }
                                                    apyk.mo47701a(apyk.m71180b(keyAt2), currentTimeMillis);
                                                }
                                            }
                                        } catch (OutOfMemoryError e) {
                                        }
                                    }
                                    if (aqbn != null) {
                                        aqbn.mo47734a();
                                    }
                                    atomicBoolean = this.f85593t;
                                }
                            } catch (OutOfMemoryError e2) {
                                if (aqbn != null) {
                                    aqbn.mo47734a();
                                }
                                atomicBoolean = this.f85593t;
                            }
                        } else {
                            m71309a(apyk);
                            if (aqbn != null) {
                                aqbn.mo47734a();
                            }
                            atomicBoolean = this.f85593t;
                        }
                    } else {
                        if (aqbn != null) {
                            aqbn.mo47734a();
                        }
                        atomicBoolean = this.f85593t;
                    }
                }
            } catch (bxwf | OutOfMemoryError e3) {
                m71309a(apyk);
                if (aqbn != null) {
                    aqbn.mo47734a();
                }
                atomicBoolean = this.f85593t;
            } catch (Throwable th) {
                if (aqbn != null) {
                    aqbn.mo47734a();
                }
                this.f85593t.set(true);
                throw th;
            }
            atomicBoolean.set(true);
        } else if (aqbn != null) {
            aqbn.mo47734a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo47737a() {
        aqbt aqbt;
        byte[] bArr;
        int length;
        if (mo47738b()) {
            try {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < this.f85584j.size(); i2++) {
                    aqbt = (aqbt) this.f85584j.valueAt(i2);
                    if (!f85574a.contains(Integer.valueOf(this.f85584j.keyAt(i2)))) {
                        aqbt.f85608c.readLock().lock();
                        int[] iArr = aqbt.f85607b.f84350a;
                        if (iArr == null || (length = iArr.length) == 0) {
                            bArr = null;
                        } else {
                            bArr = new byte[(length * 4)];
                            for (int i3 = 0; i3 < iArr.length; i3++) {
                                long j = ((long) iArr[i3]) & 4294967295L;
                                int i4 = i3 * 4;
                                bArr[i4 + 3] = (byte) ((int) (255 & j));
                                bArr[i4 + 2] = (byte) ((int) ((65280 & j) >>> 8));
                                bArr[i4 + 1] = (byte) ((int) ((16711680 & j) >>> 16));
                                bArr[i4] = (byte) ((int) ((j & -16777216) >>> 24));
                            }
                        }
                        aqbt.f85608c.readLock().unlock();
                        arrayList.add(bArr);
                        i += bArr.length;
                    }
                }
                return apgt.m70254a(arrayList, i);
            } catch (OutOfMemoryError e) {
            } catch (Throwable th) {
                aqbt.f85608c.readLock().unlock();
                throw th;
            }
        }
        return null;
    }
}
