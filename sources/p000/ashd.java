package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.util.StatsLog;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ashd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ashd {

    /* renamed from: a */
    public static final qxf f88962a = new qxf(1000);

    /* renamed from: b */
    private static final int[] f88963b = new int[0];

    /* renamed from: a */
    public static int m74114a(String str, asem asem, Context context) {
        qxq qxq = new qxq(new qws(context, null, null), "PLATFORM_STATS_COUNTERS", 1024);
        String valueOf = String.valueOf(str);
        qxq.mo24383c(valueOf.length() == 0 ? new String("PeriodicSingleTaskCountFor") : "PeriodicSingleTaskCountFor".concat(valueOf)).mo24359a();
        if (asem.mo49093b()) {
            return m74122b(str, asem, context);
        }
        String valueOf2 = String.valueOf(str);
        qxq.mo24383c(valueOf2.length() == 0 ? new String("PeriodicSingleTaskNotEnabledForTag") : "PeriodicSingleTaskNotEnabledForTag".concat(valueOf2)).mo24359a();
        qxq.mo24388e();
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d5 A[RETURN] */
    /* renamed from: b */
    public static int m74122b(String str, asem asem, Context context) {
        boolean z;
        Context context2 = context;
        qws qws = new qws(context2, null, null);
        qxq qxq = new qxq(qws, "PLATFORM_STATS_COUNTERS", 1024);
        if (cgtv.m147055b()) {
            if (m74121a(m74123b(), f88963b)) {
                new ashb(context2).mo25219a("");
            }
            rjx a = avtz.m79336a(context2, new avty());
            aucb k = a.mo24755k(asem.f88780b);
            try {
                aucu.m76783a(k, 10000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException e) {
                qxq.mo24383c("ConsentApiCanLogException").mo24359a();
            } catch (InterruptedException e2) {
                qxq.mo24383c("ConsentApiCanLogException").mo24359a();
                Thread.currentThread().interrupt();
            }
            if (!k.mo50384b() || !((Boolean) k.mo50386d()).booleanValue()) {
                Log.i("PlatformStatsUtil", "canLog says can't log");
                String valueOf = String.valueOf(str);
                qxq.mo24383c(valueOf.length() == 0 ? new String("ConsentApiOptedOut") : "ConsentApiOptedOut".concat(valueOf)).mo24359a();
                qxq.mo24388e();
                return 0;
            }
            m74120a(a, str, asem, context, qws, qxq, false, false, false, null, false);
            return 0;
        }
        new aseq();
        boolean b = cgsu.m146907b();
        boolean z2 = b && asem.mo49097f();
        boolean c = m74124c();
        List a2 = aseq.m73886a(context);
        if (cgrz.m146803c() && a2 == null) {
            String valueOf2 = String.valueOf(str);
            qxq.mo24383c(valueOf2.length() == 0 ? new String("PeriodicTaskSwaaDiCheckFailedFor") : "PeriodicTaskSwaaDiCheckFailedFor".concat(valueOf2)).mo24359a();
            return 2;
        }
        if (cguz.m147112c() && !a2.isEmpty()) {
            if (!cgsl.m146894b()) {
                z = true;
            } else if (c) {
                z = true;
            }
            if (!z2 || c || z) {
                if (!c && z) {
                    String valueOf3 = String.valueOf(str);
                    qxq.mo24383c(valueOf3.length() == 0 ? new String("PeriodicTaskOptCheckboxAndLockboxFor") : "PeriodicTaskOptCheckboxAndLockboxFor".concat(valueOf3)).mo24359a();
                } else if (!c) {
                    String valueOf4 = String.valueOf(str);
                    qxq.mo24383c(valueOf4.length() == 0 ? new String("PeriodicTaskOnlyOptCheckboxFor") : "PeriodicTaskOnlyOptCheckboxFor".concat(valueOf4)).mo24359a();
                } else if (z) {
                    String valueOf5 = String.valueOf(str);
                    qxq.mo24383c(valueOf5.length() == 0 ? new String("PeriodicTaskOnlyOptLockboxFor") : "PeriodicTaskOnlyOptLockboxFor".concat(valueOf5)).mo24359a();
                }
                if (z2) {
                    String valueOf6 = String.valueOf(str);
                    qxq.mo24383c(valueOf6.length() == 0 ? new String("PeriodicTaskOptDogfooderFor") : "PeriodicTaskOptDogfooderFor".concat(valueOf6)).mo24359a();
                }
                if (m74121a(m74123b(), f88963b)) {
                    new ashb(context2).mo25219a("");
                }
                if (!m74120a(null, str, asem, context, qws, qxq, b, z2, c, a2, z)) {
                    return 0;
                }
                return 2;
            }
            String valueOf7 = String.valueOf(str);
            qxq.mo24383c(valueOf7.length() == 0 ? new String("PeriodicTaskOptedOutFor") : "PeriodicTaskOptedOutFor".concat(valueOf7)).mo24359a();
            qxq.mo24388e();
            return 0;
        }
        z = false;
        if (!z2) {
        }
        if (!c) {
        }
        if (!c) {
        }
        if (z2) {
        }
        if (m74121a(m74123b(), f88963b)) {
        }
        if (!m74120a(null, str, asem, context, qws, qxq, b, z2, c, a2, z)) {
        }
    }

    /* renamed from: c */
    public static boolean m74124c() {
        if (cgso.f187676a.mo6606a().mo84425a() && ashc.m74113a(rpr.m34216b())) {
            return false;
        }
        try {
            rkj rkj = (rkj) aucu.m76783a(avtz.m79338b(rpr.m34216b()).mo24673E(), cgrz.m146802b(), TimeUnit.SECONDS);
            if (rkj != null) {
                return rkj.mo24824r();
            }
            return false;
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* renamed from: a */
    private static void m74115a(int i) {
        int i2 = Build.VERSION.SDK_INT;
        StatsLog.logEvent(i);
    }

    /* renamed from: a */
    private static void m74116a(qxq qxq, String str, long j, boolean z) {
        String str2 = !z ? "_without_upload_account" : "_with_upload_account";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + str2.length());
        sb.append(str);
        sb.append("_log_event");
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 9 + str2.length());
        sb3.append(str);
        sb3.append("_log_size");
        sb3.append(str2);
        String sb4 = sb3.toString();
        qxq.mo24383c(sb2).mo24359a();
        qxq.mo24380b(sb4, f88962a).mo24368a(j);
    }

    /* renamed from: a */
    public static void m74117a(rjx rjx, qws qws, qxq qxq, calu calu, boolean z, List list, boolean z2, boolean z3, boolean z4, String str, String str2, int i) {
        aucb aucb;
        rjx rjx2 = rjx;
        qws qws2 = qws;
        qxq qxq2 = qxq;
        calu calu2 = calu;
        List list2 = list;
        boolean z5 = z2;
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        if (rjx2 != null) {
            if (m74119a(str4, qxq2)) {
                aucb = rjx2.mo24696a(str4, ((calx) calu.mo74062i()).mo73642k(), ashe.m74125a(qxq), i2);
            } else {
                aucb = rjx2.mo24695a(str4, ((calx) calu.mo74062i()).mo73642k(), new asha(), i2);
            }
            try {
                aucu.m76783a(aucb, 15000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException e) {
                qxq2.mo24383c("ConsentApiUploadException").mo24359a();
            } catch (InterruptedException e2) {
                qxq2.mo24383c("ConsentApiUploadException").mo24359a();
                Thread.currentThread().interrupt();
            }
        } else if (!z && !z5 && !z3) {
            qxq2.mo24383c("REQUEST_UPLOAD_WITHOUG_CONSENT").mo24359a();
        } else if (z && (list2 == null || list.isEmpty())) {
            qxq2.mo24383c("LOCKBOX_OPTED_IN_WITH_EMPTY_ACCOUNTS").mo24359a();
        } else {
            calx calx = (calx) calu.mo74062i();
            int i3 = calx.f164961ai;
            if (i3 == -1) {
                i3 = bxxm.f165037a.mo74228a(calx).mo74223b(calx);
                calx.f164961ai = i3;
            }
            long j = (long) i3;
            boolean z6 = false;
            if (calu2.f164950c) {
                calu.mo74035c();
                calu2.f164950c = false;
            }
            calx calx2 = (calx) calu2.f164949b;
            calx calx3 = calx.f175201v;
            int i4 = calx2.f175203a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            calx2.f175203a = i4;
            calx2.f175216n = z4;
            calx2.f175203a = i4 | 1048576;
            calx2.f175217o = z5;
            boolean b = cgub.m147064b();
            if (calu2.f164950c) {
                calu.mo74035c();
                calu2.f164950c = false;
            }
            calx calx4 = (calx) calu2.f164949b;
            calx4.f175203a |= 67108864;
            calx4.f175223u = b;
            if (z) {
                bxvd da = bosx.f134741g.mo74144da();
                int size = list.size();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bosx bosx = (bosx) da.f164949b;
                int i5 = bosx.f134743a | 1;
                bosx.f134743a = i5;
                bosx.f134744b = size;
                bosx.f134743a = i5 | 2;
                bosx.f134745c = z5;
                if (calu2.f164950c) {
                    calu.mo74035c();
                    calu2.f164950c = false;
                }
                calx calx5 = (calx) calu2.f164949b;
                bosx bosx2 = (bosx) da.mo74062i();
                bosx2.getClass();
                calx5.f175214l = bosx2;
                calx5.f175203a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            }
            if (!z) {
                qwo a = qws2.mo24335a(((calx) calu.mo74062i()).mo73642k());
                a.f42322f = cagz.m126622a(i);
                a.f42320d = str4;
                if (m74119a(str4, qxq2)) {
                    a.mo24326a(ashe.m74125a(qxq));
                }
                a.mo24327b();
                m74116a(qxq2, str3, j, false);
                m74115a(str2.hashCode());
                return;
            }
            m74115a(str2.hashCode());
            for (int i6 = 0; i6 < list.size(); i6++) {
                aeyi aeyi = (aeyi) list2.get(i6);
                calu calu3 = (calu) calu.clone();
                if (!cgsl.m146894b()) {
                    bosx bosx3 = ((calx) calu2.f164949b).f175214l;
                    if (bosx3 == null) {
                        bosx3 = bosx.f134741g;
                    }
                    bxvd bxvd = (bxvd) bosx3.mo74142c(5);
                    bxvd.mo73625a((bxvk) bosx3);
                    boolean d = aeyi.mo34652d();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = z6;
                    }
                    bosx bosx4 = (bosx) bxvd.f164949b;
                    int i7 = bosx4.f134743a | 8;
                    bosx4.f134743a = i7;
                    bosx4.f134747e = d;
                    bosx4.f134743a = i7 | 4;
                    bosx4.f134746d = i6;
                    if (calu3.f164950c) {
                        calu3.mo74035c();
                        calu3.f164950c = false;
                    }
                    calx calx6 = (calx) calu3.f164949b;
                    bosx bosx5 = (bosx) bxvd.mo74062i();
                    bosx5.getClass();
                    calx6.f175214l = bosx5;
                    calx6.f175203a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    z6 = false;
                } else {
                    bosx bosx6 = ((calx) calu2.f164949b).f175214l;
                    if (bosx6 == null) {
                        bosx6 = bosx.f134741g;
                    }
                    bxvd bxvd2 = (bxvd) bosx6.mo74142c(5);
                    bxvd2.mo73625a((bxvk) bosx6);
                    boolean c = aeyi.mo34651c();
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bosx bosx7 = (bosx) bxvd2.f164949b;
                    int i8 = bosx7.f134743a | 32;
                    bosx7.f134743a = i8;
                    bosx7.f134748f = c;
                    bosx7.f134743a = i8 | 4;
                    bosx7.f134746d = i6;
                    if (!calu3.f164950c) {
                        z6 = false;
                    } else {
                        calu3.mo74035c();
                        z6 = false;
                        calu3.f164950c = false;
                    }
                    calx calx7 = (calx) calu3.f164949b;
                    bosx bosx8 = (bosx) bxvd2.mo74062i();
                    bosx8.getClass();
                    calx7.f175214l = bosx8;
                    calx7.f175203a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                }
                qwo a2 = qws2.mo24335a(((calx) calu3.mo74062i()).mo73642k());
                a2.mo24330c(aeyi.mo34650b());
                a2.f42322f = cagz.m126622a(i);
                a2.f42320d = str4;
                if (m74119a(str4, qxq2)) {
                    a2.mo24326a(ashe.m74125a(qxq));
                }
                a2.mo24327b();
                m74116a(qxq2, str3, j, true);
            }
        }
    }

    /* renamed from: b */
    public static String[] m74123b() {
        try {
            return cguk.f187775a.mo6606a().mo84508a().split(",");
        } catch (Exception e) {
            Log.e("PlatformStatsUtil", "Failed to parse phenotype log source flags", e);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m74118a() {
        int i = Build.VERSION.SDK_INT;
        return Process.myUserHandle().isOwner();
    }

    /* renamed from: a */
    public static boolean m74119a(String str, qxq qxq) {
        if (!cguh.f187772a.mo6606a().mo84506a()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        SharedPreferences sharedPreferences = rpr.m34216b().getSharedPreferences("com.google.android.metrics", 0);
        String valueOf = String.valueOf(str);
        try {
            return sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("clearcut_add_external_ids_log_source_") : "clearcut_add_external_ids_log_source_".concat(valueOf), false);
        } catch (ClassCastException e) {
            qxq.mo24383c("StatsClassCastException").mo24359a();
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m74120a(rjx rjx, String str, asem asem, Context context, qws qws, qxq qxq, boolean z, boolean z2, boolean z3, List list, boolean z4) {
        long convert = TimeUnit.MILLISECONDS.convert(asem.mo49094c(), TimeUnit.SECONDS);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        long j = sharedPreferences.getLong(":lastRunMsec", -1);
        long currentTimeMillis = System.currentTimeMillis() - asem.mo49095d();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(":lastRunMsec", currentTimeMillis);
        edit.apply();
        long j2 = currentTimeMillis - j;
        long j3 = (j2 >= 0 && j2 <= convert + convert) ? j : currentTimeMillis - convert;
        try {
            calx a = asem.mo49090a(context, j3, currentTimeMillis, qxq);
            if (a != null) {
                bxvd bxvd = (bxvd) a.mo74142c(5);
                bxvd.mo73625a((bxvk) a);
                asem.mo49091a(rjx, qws, qxq, (calu) bxvd, z4, list, z3, z2, z);
            }
            qxq.mo24388e();
            return true;
        } catch (asel e) {
            qxq.mo24383c(String.valueOf(str).concat("CollectionException")).mo24359a();
            if (cguz.f187794a.mo6606a().mo84527f()) {
                try {
                    calu calu = (calu) calx.f175201v.mo74144da();
                    if (calu.f164950c) {
                        calu.mo74035c();
                        calu.f164950c = false;
                    }
                    calx calx = (calx) calu.f164949b;
                    int i = 1 | calx.f175203a;
                    calx.f175203a = i;
                    calx.f175206d = j3;
                    calx.f175203a = i | 2;
                    calx.f175207e = currentTimeMillis;
                    String d = bmzo.m108692d(e);
                    String substring = d.substring(0, Math.min((int) cguz.f187794a.mo6606a().mo84526e(), d.length()));
                    bxvd da = calv.f175180j.mo74144da();
                    bxtx a2 = bxtx.m123261a(substring.getBytes("UTF-8"));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    calv calv = (calv) da.f164949b;
                    a2.getClass();
                    calv.f175182a |= 2;
                    calv.f175184c = a2;
                    calu.mo74660a((calv) da.mo74062i());
                    m74117a(rjx, qws, qxq, calu, z4, list, z3, z2, z, "collectionExceptions", "AM_COLLECTION_EXCEPTIONS", (int) cguz.m147111b());
                    calx calx2 = (calx) calu.mo74062i();
                } catch (UnsupportedEncodingException e2) {
                    Log.w("PlatformStatsUtil", "UTF-8 charset is unsupported. Skip uploading.");
                }
            }
            qxq.mo24388e();
            return false;
        } catch (Throwable th) {
            th = th;
            qxq.mo24388e();
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m74121a(String[] strArr, int[] iArr) {
        aucb a = anef.m64089a(rpr.m34216b()).mo25235a("com.google.android.metrics", 1, strArr, iArr);
        try {
            aucu.m76783a(a, cgrz.m146802b(), TimeUnit.SECONDS);
            return a.mo50384b();
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
