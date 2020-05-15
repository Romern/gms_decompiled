package p000;

import android.accounts.Account;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.gms.westworld.FetchOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aykk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykk {

    /* renamed from: a */
    protected static qws f97842a;

    /* renamed from: b */
    public static qws f97843b;

    /* renamed from: c */
    public static qws f97844c;

    /* renamed from: d */
    public static qws f97845d;

    /* renamed from: e */
    protected static qws f97846e;

    /* renamed from: f */
    protected static qws f97847f;

    /* renamed from: g */
    protected static qws f97848g;

    /* renamed from: h */
    protected static qxq f97849h;

    /* renamed from: i */
    protected static bdtr f97850i;

    /* renamed from: j */
    private static avua f97851j = null;

    /* renamed from: a */
    static long m84160a(bkq bkq) {
        long j;
        long j2 = 1;
        if (chnm.m149193b()) {
            j = !bkq.f5023f ? 0 : 1;
        } else {
            j = 0;
        }
        long j3 = j + j;
        if (chpj.m149279b()) {
            if (!bkq.f5022e) {
                j2 = 0;
            }
            j3 += j2;
        }
        bkn a = bkn.m3261a(bkq.f5021d);
        if (a == null) {
            a = bkn.UNKNOWN_PERIOD;
        }
        int i = a.f5001g;
        cagz a2 = cagz.m126622a(bkq.f5020c);
        if (a2 == null) {
            a2 = cagz.DEFAULT;
        }
        int i2 = a2.f174516f;
        int a3 = bkh.m3255a(bkq.f5019b);
        if (a3 == 0) {
            a3 = 1;
        }
        return chpw.m149307f() + (((((j3 << 4) + ((long) i)) << 4) + ((long) i2)) << 4) + ((long) (a3 - 1));
    }

    /* renamed from: b */
    public static int m84179b(long j) {
        int a = bkh.m3255a((int) ((j - chpw.m149307f()) & 15));
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: c */
    static SharedPreferences m84182c(Context context) {
        return context.getSharedPreferences("com.google.android.westworld", 0);
    }

    /* renamed from: d */
    public static SharedPreferences m84183d(Context context) {
        return context.getSharedPreferences("westworld.statsd", 0);
    }

    /* renamed from: e */
    public static qws m84184e(Context context) {
        if (f97842a == null) {
            f97842a = new qws(context, chpz.m149337n(), null);
        }
        return f97842a;
    }

    /* renamed from: f */
    public static qxq m84185f(Context context) {
        qxq qxq = f97849h;
        if (qxq != null) {
            return qxq;
        }
        qxq qxq2 = new qxq(m84184e(context), chpz.m149329f(), 100);
        f97849h = qxq2;
        return qxq2;
    }

    /* renamed from: g */
    public static synchronized void m84186g(Context context) {
        synchronized (aykk.class) {
            aney a = anef.m64089a(context);
            aucb a2 = a.mo25235a("com.google.android.westworld", 1, new String[]{chpz.m149337n(), chpz.m149336m(), chou.m149250b(), chpz.m149339p(), chpz.m149329f()}, new int[0]);
            try {
                aucu.m76783a(a2, chpz.f188967a.mo6606a().mo85522q(), TimeUnit.MILLISECONDS);
                if (a2.mo50384b()) {
                    new aykh(a, "com.google.android.westworld", context).mo25219a("");
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            }
        }
    }

    /* renamed from: b */
    static boolean m84180b(Context context) {
        try {
            aucb E = avtz.m79338b(context).mo24673E();
            rkj rkj = (rkj) aucu.m76783a(E, chpz.m149326c(), TimeUnit.MILLISECONDS);
            if (!E.mo50384b() || rkj == null) {
                return false;
            }
            if (choo.f188919a.mo6606a().mo85471a()) {
                if (aykj.m84159a(context)) {
                    return false;
                }
            }
            return rkj.mo24824r();
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* renamed from: a */
    public static avua m84161a() {
        if (f97851j == null) {
            f97851j = new ayki();
        }
        return f97851j;
    }

    /* renamed from: a */
    public static bkn m84162a(long j) {
        return bkn.m3261a((int) (((j - chpw.m149307f()) >> 8) & 15));
    }

    /* renamed from: a */
    public static bymq m84163a(Context context) {
        bymq bymq;
        bymq bymq2;
        bxvd da = bymq.f167050h.mo74144da();
        bymo bymo = (bymo) bymp.f167047b.mo74144da();
        if (chpz.f188967a.mo6606a().mo85524s() && choe.f188909a.mo6606a().mo85465a()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bymq bymq3 = (bymq) da.f164949b;
            bymq3.f167052a |= 16;
            bymq3.f167056e = true;
        }
        if (chns.f188895a.mo6606a().mo85455a() && aykj.m84159a(context)) {
            return (bymq) da.mo74062i();
        }
        boolean b = m84180b(context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bymq bymq4 = (bymq) da.f164949b;
        bymq4.f167052a |= 2;
        bymq4.f167053b = b;
        List<Account> d = soz.m35801d(context, context.getPackageName());
        if (!chob.m149222b()) {
            int i = Build.VERSION.SDK_INT;
            if (!chpz.m149332i()) {
                if (d != null) {
                    boolean b2 = chpm.m149284b();
                    for (Account account : d) {
                        if (b2) {
                            bymq2 = m84164a(context, account);
                        } else {
                            bymq2 = m84165a(context, account.name);
                        }
                        if (bymq2.f167054c && bymq2.f167055d) {
                            if (!chor.m149245b() || !aykj.m84159a(context)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bymq bymq5 = (bymq) da.f164949b;
                                int i2 = bymq5.f167052a | 4;
                                bymq5.f167052a = i2;
                                bymq5.f167054c = true;
                                bymq5.f167052a = i2 | 8;
                                bymq5.f167055d = true;
                            }
                            bymo.mo74393a(account.name);
                        }
                    }
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bymq bymq6 = (bymq) da.f164949b;
                bymp bymp = (bymp) bymo.mo74062i();
                bymp.getClass();
                bymq6.f167058g = bymp;
                bymq6.f167052a |= 64;
                return (bymq) da.mo74062i();
            }
        }
        ArrayList arrayList = new ArrayList();
        boolean b3 = chpm.m149284b();
        if (d != null) {
            for (Account account2 : d) {
                if (b3) {
                    bymq = m84164a(context, account2);
                } else {
                    bymq = m84165a(context, account2.name);
                }
                if (bymq.f167054c && (!chor.m149245b() || !aykj.m84159a(context))) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bymq bymq7 = (bymq) da.f164949b;
                    bymq7.f167052a |= 4;
                    bymq7.f167054c = true;
                    if (!bymq.f167055d || chob.m149222b()) {
                        arrayList.add(account2.name);
                    } else {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bymq bymq8 = (bymq) da.f164949b;
                        bymq8.f167052a |= 8;
                        bymq8.f167055d = true;
                        bymo.mo74393a(account2.name);
                    }
                }
            }
        }
        if (((bymp) bymo.f164949b).f167049a.size() == 0 && !arrayList.isEmpty()) {
            if (bymo.f164950c) {
                bymo.mo74035c();
                bymo.f164950c = false;
            }
            bymp bymp2 = (bymp) bymo.f164949b;
            bymp2.mo74394c();
            bxsy.m123078a(arrayList, bymp2.f167049a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bymq bymq9 = (bymq) da.f164949b;
            bymq9.f167052a |= 8;
            bymq9.f167055d = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bymq bymq10 = (bymq) da.f164949b;
        bymp bymp3 = (bymp) bymo.mo74062i();
        bymp3.getClass();
        bymq10.f167058g = bymp3;
        bymq10.f167052a |= 64;
        return (bymq) da.mo74062i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r3.f167055d != false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* renamed from: b */
    public static boolean m84181b(bymq bymq, rjx rjx) {
        boolean z;
        if (rjx == null) {
            if (bymq.f167054c) {
                if (!chob.m149222b() || !bymq.f167053b) {
                    if (chpz.m149332i()) {
                        int i = Build.VERSION.SDK_INT;
                        z = true;
                        return !bymq.f167056e || bymq.f167053b || z;
                    } else if (!chob.m149222b()) {
                    }
                }
                z = true;
                if (!bymq.f167056e) {
                }
            }
            z = false;
            if (!bymq.f167056e) {
            }
        } else if (!chpz.m149332i()) {
            return m84177a(rjx, chpz.m149337n());
        } else {
            int i2 = Build.VERSION.SDK_INT;
            return m84177a(rjx, chpz.m149338o());
        }
    }

    /* renamed from: a */
    private static bymq m84164a(Context context, Account account) {
        if (f97850i == null) {
            bdtt bdtt = new bdtt();
            bdtt.mo58364a(context);
            bdtt.mo58366b("gmscorewestworldfacsid");
            f97850i = bdtt.mo58363a();
        }
        bdtq b = f97850i.mo58362b(account);
        try {
            boolean booleanValue = ((Boolean) b.mo58355a(4).get(15, TimeUnit.SECONDS)).booleanValue();
            boolean booleanValue2 = ((Boolean) b.mo58355a(5).get(15, TimeUnit.SECONDS)).booleanValue();
            bxvd da = bymq.f167050h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bymq bymq = (bymq) da.f164949b;
            int i = 4 | bymq.f167052a;
            bymq.f167052a = i;
            bymq.f167054c = booleanValue;
            bymq.f167052a = i | 8;
            bymq.f167055d = booleanValue2;
            return (bymq) da.mo74062i();
        } catch (ExecutionException | TimeoutException e) {
            return bymq.f167050h;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return bymq.f167050h;
        }
    }

    /* renamed from: a */
    static bymq m84165a(Context context, String str) {
        int[] iArr;
        if (chob.m149222b()) {
            iArr = new int[]{8, 10};
        } else {
            iArr = new int[]{7, 8, 10, 9};
        }
        try {
            aucb a = auzz.m78131a(context, new auzy(str)).mo24689a(new UdcCacheRequest(iArr));
            UdcCacheResponse udcCacheResponse = (UdcCacheResponse) aucu.m76783a(a, chpz.m149326c(), TimeUnit.MILLISECONDS);
            if (a.mo50384b()) {
                if (udcCacheResponse != null) {
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.f109350a) {
                        int i = udcSetting.f109354a;
                        if (i == 8) {
                            z3 = udcSetting.f109355b == 2;
                        }
                        if (i == 10) {
                            z4 = udcSetting.f109355b == 2;
                        }
                        if (i == 7) {
                            z = udcSetting.f109355b == 2;
                        }
                        if (i == 9) {
                            z2 = udcSetting.f109355b == 2;
                        }
                    }
                    bxvd da = bymq.f167050h.mo74144da();
                    if (z && z2) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bymq bymq = (bymq) da.f164949b;
                        bymq.f167052a |= 8;
                        bymq.f167055d = true;
                    }
                    if (z3) {
                        if (z4) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bymq bymq2 = (bymq) da.f164949b;
                            bymq2.f167052a = 4 | bymq2.f167052a;
                            bymq2.f167054c = true;
                        }
                    }
                    return (bymq) da.mo74062i();
                }
            }
        } catch (ExecutionException | TimeoutException e) {
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
        return bymq.f167050h;
    }

    /* renamed from: a */
    public static void m84166a(long j, Context context) {
        StatsManager statsManager = (StatsManager) context.getSystemService("stats");
        if (statsManager != null) {
            m84167a(statsManager, j, context);
        }
    }

    /* renamed from: a */
    static synchronized void m84167a(StatsManager statsManager, long j, Context context) {
        int i;
        synchronized (aykk.class) {
            Intent intent = new Intent("com.android.server.stats.action.TRIGGER_COLLECTION");
            int i2 = Build.VERSION.SDK_INT;
            intent.putExtra("FETCH_CONFIG_ID", j);
            if (j != chpw.m149307f()) {
                i = (int) (j % 2147483647L);
            } else {
                i = 0;
            }
            try {
                statsManager.setFetchReportsOperation(IntentOperation.getPendingIntent(context, FetchOperation.class, intent, i, 134217728), j);
            } catch (StatsManager.StatsUnavailableException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m84168a(bxvd bxvd, cagz cagz) {
        rjx a = avtz.m79336a(rpr.m34216b(), new avty());
        aucb k = a.mo24755k(chpz.m149325b());
        try {
            aucu.m76783a(k, chpz.m149326c(), TimeUnit.MILLISECONDS);
            if (k.mo50384b() && k.mo50386d() != null && ((Boolean) k.mo50386d()).booleanValue()) {
                a.mo24695a(chpz.m149325b(), ((byms) bxvd.mo74062i()).mo73642k(), m84161a(), cagz.f174516f);
            }
        } catch (ExecutionException | TimeoutException e) {
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    private static void m84169a(bxvd bxvd, boolean z, int i) {
        bxtx bxtx;
        SharedPreferences d = m84183d(rpr.m34216b());
        try {
            bli bli = (bli) bxvk.m124014a(bli.f5101b, Base64.decode(d.getString("log_metadata", ""), 0));
            bxvd bxvd2 = (bxvd) bli.mo74142c(5);
            bxvd2.mo73625a((bxvk) bli);
            bxvd da = blh.f5093g.mo74144da();
            byms byms = (byms) bxvd.f164949b;
            if (byms.f167068b == 1) {
                bxtx = (bxtx) byms.f167069c;
            } else {
                bxtx = bxtx.f164797b;
            }
            int a = bxtx.mo73744a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blh blh = (blh) da.f164949b;
            int i2 = blh.f5095a | 4;
            blh.f5095a = i2;
            blh.f5098d = a;
            int i3 = i2 | 8;
            blh.f5095a = i3;
            blh.f5099e = z;
            blh.f5095a = i3 | 16;
            blh.f5100f = i;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blh blh2 = (blh) da.f164949b;
            blh2.f5095a |= 1;
            blh2.f5096b = elapsedRealtime;
            long currentTimeMillis = System.currentTimeMillis();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blh blh3 = (blh) da.f164949b;
            blh3.f5095a |= 2;
            blh3.f5097c = currentTimeMillis;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bli bli2 = (bli) bxvd2.f164949b;
            blh blh4 = (blh) da.mo74062i();
            blh4.getClass();
            bli2.mo3222a();
            bli2.f5103a.add(0, blh4);
            if (((bli) bxvd2.f164949b).f5103a.size() > ((int) chpz.m149335l())) {
                int l = (int) chpz.m149335l();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bli bli3 = (bli) bxvd2.f164949b;
                bli3.mo3222a();
                bli3.f5103a.remove(l);
            }
            bli bli4 = (bli) bxvd2.mo74062i();
            d.edit().putString("log_metadata", Base64.encodeToString(bli4.mo73642k(), 0)).apply();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            byms byms2 = (byms) bxvd.f164949b;
            byms byms3 = byms.f167065g;
            bli4.getClass();
            byms2.f167071e = bli4;
            byms2.f167067a |= 128;
        } catch (bxwf e) {
        }
    }

    /* renamed from: a */
    static void m84170a(qws qws, qwo qwo, qxq qxq) {
        if (m84176a(qws.f42340g, qxq)) {
            qwo.mo24326a(m84178a(qxq));
        }
    }

    /* renamed from: a */
    public static void m84171a(rjx rjx, qws qws, bymq bymq, qxq qxq, bxvd bxvd) {
        m84172a(rjx, qws, bymq, qxq, bxvd, cagz.m126622a((int) chpd.m149265b()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aykk.a(bxvd, boolean, int):void
     arg types: [bxvd, int, int]
     candidates:
      aykk.a(android.app.StatsManager, long, android.content.Context):void
      aykk.a(qws, qwo, qxq):void
      aykk.a(bymq, rjx, java.lang.String):boolean
      aykk.a(bxvd, boolean, int):void */
    /* renamed from: a */
    public static void m84172a(rjx rjx, qws qws, bymq bymq, qxq qxq, bxvd bxvd, cagz cagz) {
        if (rjx == null) {
            bxvd a = bymq.f167050h.mo74141a(bymq);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bymq bymq2 = (bymq) a.f164949b;
            bymq2.f167058g = null;
            bymq2.f167052a &= -65;
            if (chnm.m149193b() && qws.f42344k) {
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bymq bymq3 = (bymq) a.f164949b;
                bymq3.f167052a |= 32;
                bymq3.f167057f = 0;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                byms byms = (byms) bxvd.f164949b;
                bymq bymq4 = (bymq) a.mo74062i();
                byms byms2 = byms.f167065g;
                bymq4.getClass();
                byms.f167070d = bymq4;
                byms.f167067a |= 64;
                qwo a2 = qws.mo24335a(((byms) bxvd.mo74062i()).mo73642k());
                a2.f42322f = cagz;
                a2.mo24327b();
                return;
            }
            bymp bymp = bymq.f167058g;
            if (bymp == null) {
                bymp = bymp.f167047b;
            }
            if (bymp.f167049a.size() <= 0 || !bymq.f167054c || ((chob.m149222b() || !bymq.f167055d) && ((!chob.m149222b() || !bymq.f167053b) && (!chpz.m149332i() || !chpz.m149338o().equals(qws.f42340g))))) {
                qxq.mo24383c("UploadByZwieback").mo24359a();
                if (chpz.m149334k() && ((byms) bxvd.f164949b).f167068b == 1) {
                    m84169a(bxvd, true, 0);
                }
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bymq bymq5 = (bymq) a.f164949b;
                bymq5.f167052a |= 32;
                bymq5.f167057f = 0;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                byms byms3 = (byms) bxvd.f164949b;
                bymq bymq6 = (bymq) a.mo74062i();
                byms byms4 = byms.f167065g;
                bymq6.getClass();
                byms3.f167070d = bymq6;
                byms3.f167067a |= 64;
                qwo a3 = qws.mo24335a(((byms) bxvd.mo74062i()).mo73642k());
                a3.f42322f = cagz;
                m84170a(qws, a3, qxq);
                a3.mo24327b();
                return;
            }
            qxq.mo24383c("UploadbyAccount").mo24359a();
            bymp bymp2 = bymq.f167058g;
            if (bymp2 == null) {
                bymp2 = bymp.f167047b;
            }
            ArrayList arrayList = new ArrayList(bymp2.f167049a);
            Collections.sort(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                if (chpz.m149334k() && ((byms) bxvd.f164949b).f167068b == 1) {
                    m84169a(bxvd, false, i);
                }
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bymq bymq7 = (bymq) a.f164949b;
                bymq7.f167052a |= 32;
                bymq7.f167057f = i;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                byms byms5 = (byms) bxvd.f164949b;
                bymq bymq8 = (bymq) a.mo74062i();
                byms byms6 = byms.f167065g;
                bymq8.getClass();
                byms5.f167070d = bymq8;
                byms5.f167067a |= 64;
                qwo a4 = qws.mo24335a(((byms) bxvd.mo74062i()).mo73642k());
                a4.mo24330c((String) arrayList.get(i));
                a4.f42322f = cagz;
                m84170a(qws, a4, qxq);
                a4.mo24327b();
            }
        } else if (m84176a(qws.f42340g, qxq)) {
            rjx.mo24696a(qws.f42340g, ((byms) bxvd.mo74062i()).mo73642k(), m84178a(qxq), cagz.f174516f);
        } else {
            rjx.mo24695a(qws.f42340g, ((byms) bxvd.mo74062i()).mo73642k(), m84161a(), cagz.f174516f);
        }
    }

    /* renamed from: a */
    public static boolean m84173a(long j, int i) {
        int b = m84179b(j);
        boolean z = i == 3 || (chob.m149222b() && i == 4);
        if (b != i && (b != 1 || !z)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m84174a(bymq bymq, rjx rjx) {
        return chpz.m149333j() && chns.f188895a.mo6606a().mo85457c() && m84181b(bymq, rjx);
    }

    /* renamed from: a */
    public static boolean m84175a(bymq bymq, rjx rjx, String str) {
        if (rjx != null) {
            return m84177a(rjx, str);
        }
        return bymq.f167056e || (!chob.m149222b() ? !(!bymq.f167054c || !bymq.f167055d) : !(!bymq.f167054c || !bymq.f167053b));
    }

    /* renamed from: a */
    static boolean m84176a(String str, qxq qxq) {
        int i = Build.VERSION.SDK_INT;
        SharedPreferences c = m84182c(rpr.m34216b());
        String valueOf = String.valueOf(str);
        try {
            return c.getBoolean(valueOf.length() == 0 ? new String("clearcut_add_external_ids_log_source_") : "clearcut_add_external_ids_log_source_".concat(valueOf), false);
        } catch (ClassCastException e) {
            qxq.mo24383c("ClassCastException").mo24359a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m84177a(rjx rjx, String str) {
        aucb k = rjx.mo24755k(str);
        try {
            aucu.m76783a(k, chpz.m149326c(), TimeUnit.MILLISECONDS);
            if (!k.mo50384b() || k.mo50386d() == null || !((Boolean) k.mo50386d()).booleanValue()) {
                return false;
            }
            return true;
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* renamed from: a */
    static int[] m84178a(qxq qxq) {
        try {
            long[] registeredExperimentIds = ((StatsManager) rpr.m34216b().getSystemService("stats")).getRegisteredExperimentIds();
            if (registeredExperimentIds == null) {
                qxq.mo24383c("NullExperimentsList").mo24359a();
                return new int[0];
            }
            int length = registeredExperimentIds.length;
            if (length != 0) {
                qxq.mo24383c("NonEmptyExperimentsList").mo24359a();
            } else {
                qxq.mo24383c("EmptyExperimentsList").mo24359a();
            }
            int[] iArr = new int[length];
            for (int i = 0; i < registeredExperimentIds.length; i++) {
                iArr[i] = (int) registeredExperimentIds[i];
            }
            return iArr;
        } catch (StatsManager.StatsUnavailableException e) {
            qxq.mo24383c("StatsManagerError").mo24359a();
            return new int[0];
        }
    }
}
