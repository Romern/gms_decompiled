package com.google.android.gms.westworld;

import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FetchOperation extends IntentOperation {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        return r5;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0041=Splitter:B:15:0x0041, B:71:0x0109=Splitter:B:71:0x0109} */
    /* renamed from: a */
    static synchronized Set m94462a(Context context, Intent intent, int i) {
        Set set;
        Set set2;
        synchronized (FetchOperation.class) {
            SharedPreferences d = aykk.m84183d(context);
            int i2 = Build.VERSION.SDK_INT;
            if (!d.contains("SENT_CONFIGS")) {
                if (chpz.m149332i()) {
                    if (i != 3) {
                        bnon bnon = bnon.f131923a;
                        return bnon;
                    }
                }
                bnic a = bnic.m109489a(Long.valueOf(chpw.m149307f()));
                return a;
            } else if (intent.hasExtra("FETCH_CONFIG_ID")) {
                long longExtra = intent.getLongExtra("FETCH_CONFIG_ID", chpw.m149307f());
                if (intent.getAction() != null) {
                    if (intent.getAction().equals("com.google.android.gms.westworld.action.DEACTIVATE")) {
                        bnic a2 = bnic.m109489a(Long.valueOf(longExtra));
                        return a2;
                    }
                }
                if (!aykk.m84183d(context).getStringSet("ACTIVE_CONFIGS", bnon.f131923a).contains(String.valueOf(longExtra))) {
                    set2 = bnon.f131923a;
                } else if (chpz.m149332i()) {
                    Set a3 = aykk.m84173a(longExtra, i) ? bnic.m109489a(Long.valueOf(longExtra)) : bnon.f131923a;
                } else {
                    set2 = bnic.m109489a(Long.valueOf(longExtra));
                }
            } else if (intent.hasExtra("FETCH_PERIOD_EXTRA")) {
                SharedPreferences d2 = aykk.m84183d(context);
                d2.getStringSet("SENT_CONFIGS", null);
                int i3 = Build.VERSION.SDK_INT;
                Set<String> stringSet = d2.getStringSet("ACTIVE_CONFIGS", null);
                if (stringSet != null) {
                    if (!stringSet.isEmpty()) {
                        bkn a4 = bkn.m3261a(intent.getIntExtra("FETCH_PERIOD_EXTRA", -1));
                        bnia j = bnic.m109500j();
                        for (String str : stringSet) {
                            long parseLong = Long.parseLong(str);
                            if ((!chpz.m149332i() || aykk.m84173a(parseLong, i)) && a4 != null && aykk.m84162a(parseLong) == a4) {
                                j.mo67629b(Long.valueOf(parseLong));
                            }
                        }
                        set = j.mo67751a();
                    }
                }
                set = bnon.f131923a;
            } else if (i == 3) {
                bnic a5 = bnic.m109489a(Long.valueOf(chpw.m149307f()));
                return a5;
            } else {
                bnon bnon2 = bnon.f131923a;
                return bnon2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ec, code lost:
        if (r17 == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ef, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* renamed from: b */
    public static synchronized void m94465b(Context context, rjx rjx, bymq bymq, qxq qxq, Intent intent) {
        int i;
        char c;
        Context context2 = context;
        rjx rjx2 = rjx;
        bymq bymq2 = bymq;
        Intent intent2 = intent;
        synchronized (FetchOperation.class) {
            StatsManager statsManager = (StatsManager) context2.getSystemService("stats");
            if (statsManager == null) {
                qxq.mo24383c("FetchDataFailsStatsManager").mo24359a();
                return;
            }
            int i2 = 3;
            boolean z = false;
            if (!chpt.m149298b() || intent.getAction() == null) {
                i = 1;
            } else {
                String action = intent.getAction();
                int hashCode = action.hashCode();
                if (hashCode != -320798471) {
                    if (hashCode != -18818161) {
                        if (hashCode == 447397516) {
                            if (action.equals("com.google.android.gms.westworld.action.ALARM")) {
                                c = 1;
                                i = c == 0 ? c != 1 ? c != 2 ? 1 : 4 : 2 : 3;
                            }
                        }
                    } else if (action.equals("com.android.server.stats.action.TRIGGER_COLLECTION")) {
                        c = 0;
                        if (c == 0) {
                        }
                    }
                } else if (action.equals("com.google.android.gms.westworld.action.DEACTIVATE")) {
                    c = 2;
                    if (c == 0) {
                    }
                }
                c = 65535;
                if (c == 0) {
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            if (chpz.m149332i()) {
                for (Long l : m94462a(context2, intent2, 2)) {
                    m94463a(context, rjx, bymq, qxq, statsManager, l.longValue(), i);
                }
                if (rjx2 != null) {
                    if (aykk.m84177a(rjx2, chpz.m149337n())) {
                    }
                } else if (bymq2 != null) {
                    if (bymq2.f167054c) {
                        if (!chob.m149222b()) {
                            if (!bymq2.f167055d) {
                            }
                            z = true;
                        }
                        if (chob.m149222b() && bymq2.f167053b) {
                            z = true;
                        }
                    }
                    if (!bymq2.f167056e) {
                        if (!bymq2.f167053b) {
                        }
                    }
                } else {
                    return;
                }
            }
            if (chob.m149222b()) {
                i2 = 4;
            }
            for (Long l2 : m94462a(context2, intent2, i2)) {
                m94463a(context, rjx, bymq, qxq, statsManager, l2.longValue(), i);
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        rjx rjx;
        if (!aykg.m84157a()) {
            rpr b = rpr.m34216b();
            qxq f = aykk.m84185f(b);
            bymq bymq = null;
            if (choh.m149231b()) {
                rjx = avtz.m79336a(rpr.m34216b(), new avty());
            } else {
                bymq = aykk.m84163a(rpr.m34216b());
                rjx = null;
            }
            try {
                f.mo24383c("FetchOperationEntered").mo24359a();
                if (aykk.m84174a(bymq, rjx)) {
                    f.mo24383c("FetchOperationCanCollect").mo24359a();
                    m94464a(b, rjx, bymq, f, intent);
                    int i = Build.VERSION.SDK_INT;
                }
            } finally {
                f.mo24388e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r14.mo24383c("FetchDataFailsStatsUnavailable").mo24359a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019b, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0190 A[ExcHandler: StatsUnavailableException (e android.app.StatsManager$StatsUnavailableException), Splitter:B:2:0x0004] */
    /* renamed from: a */
    static synchronized void m94463a(Context context, rjx rjx, bymq bymq, qxq qxq, StatsManager statsManager, long j, int i) {
        qws qws;
        synchronized (FetchOperation.class) {
            try {
                byte[] reports = statsManager.getReports(j);
                if (chny.m149217b()) {
                    if (!aykk.m84183d(context).getStringSet("KEEP_UID_MAP_CONFIGS", bnon.f131923a).contains(String.valueOf(j))) {
                        bxus c = bxus.m123744c();
                        bxvd da = byml.f167033b.mo74144da();
                        for (bymm bymm : ((byml) GeneratedMessageLite.m124016a(byml.f167033b, reports, c)).f167035a) {
                            bxvd bxvd = (bxvd) bymm.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) bymm);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bymm bymm2 = (bymm) bxvd.f164949b;
                            bymm bymm3 = bymm.f167036c;
                            bymm2.f167038a &= -2;
                            bymm2.f167039b = bymm.f167036c.f167039b;
                            bymm bymm4 = (bymm) bxvd.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byml byml = (byml) da.f164949b;
                            bymm4.getClass();
                            if (!byml.f167035a.mo73666a()) {
                                byml.f167035a = GeneratedMessageLite.m124021a(byml.f167035a);
                            }
                            byml.f167035a.add(bymm4);
                        }
                        reports = ((byml) da.mo74062i()).mo73642k();
                    }
                }
                if (reports != null) {
                    bxvd da2 = byms.f167065g.mo74144da();
                    bxtx a = bxtx.m123261a(reports);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    byms byms = (byms) da2.f164949b;
                    a.getClass();
                    byms.f167068b = 1;
                    byms.f167069c = a;
                    if (chpt.m149298b()) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        byms byms2 = (byms) da2.f164949b;
                        byms2.f167072f = i - 1;
                        byms2.f167067a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                    qws e = aykk.m84184e(context);
                    if (chpz.m149332i()) {
                        if (aykk.m84179b(j) == 2) {
                            if (aykk.f97844c == null) {
                                aykk.f97844c = new qws(context, chpz.m149338o(), null);
                            }
                            e = aykk.f97844c;
                        }
                    }
                    qxq.mo24383c("DataUploaded").mo24359a();
                    cagz a2 = cagz.m126622a((int) (((j - chpw.m149307f()) >> 4) & 15));
                    cagz a3 = a2 == null ? cagz.m126622a((int) chpd.m149265b()) : a2;
                    if (!chnm.m149193b() || ((j - chpw.m149307f()) & 8192) <= 0) {
                        qws = e;
                    } else {
                        if (aykk.f97843b == null) {
                            aykk.f97843b = qws.m33019a(context.getApplicationContext(), chpz.m149325b());
                        }
                        qws qws2 = aykk.f97843b;
                        if (rjx == null) {
                            qws = qws2;
                        } else {
                            aykk.m84168a(da2, a3);
                            return;
                        }
                    }
                    aykk.m84172a(rjx, qws, bymq, qxq, da2, a3);
                    return;
                }
                qxq.mo24383c("FetchDataFailsStatsUnavailable").mo24359a();
            } catch (StatsManager.StatsUnavailableException e2) {
            } catch (bxwf e3) {
                qxq.mo24383c("InvalidMetricsReportProto").mo24359a();
            }
        }
    }

    /* renamed from: a */
    static synchronized void m94464a(Context context, rjx rjx, bymq bymq, qxq qxq, Intent intent) {
        synchronized (FetchOperation.class) {
            long longExtra = intent.getLongExtra("android.app.extra.LAST_REPORT_TIME", 0);
            qxq.mo24383c("FetchData").mo24359a();
            SharedPreferences d = aykk.m84183d(context);
            if (longExtra == d.getLong("LAST_REPORT_TIME", 0)) {
                qxq.mo24383c("FetchDataSameRequest").mo24359a();
                return;
            }
            d.edit().putLong("LAST_REPORT_TIME", longExtra).apply();
            m94465b(context, rjx, bymq, qxq, intent);
        }
    }
}
