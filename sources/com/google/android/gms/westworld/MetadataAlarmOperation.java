package com.google.android.gms.westworld;

import android.app.PendingIntent;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MetadataAlarmOperation extends IntentOperation {
    /* renamed from: a */
    static synchronized void m94467a(Context context, qxq qxq) {
        synchronized (MetadataAlarmOperation.class) {
            qxq.mo24383c("MetadataAlarmSet").mo24359a();
            skc skc = new skc(context);
            PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, MetadataAlarmOperation.class, new Intent("com.google.android.gms.westworld.action.METADATA_ALARM"), 0, 134217728);
            long c = chpg.f188938a.mo6606a().mo85486c();
            skc.mo25671a("WestworldPoll", 3, SystemClock.elapsedRealtime() + c, c, pendingIntent, "com.google.android.gms.westworld");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r1.f167055d != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008f, code lost:
        if (p000.aykk.m84181b(r1, r3) != false) goto L_0x0091;
     */
    public final void onHandleIntent(Intent intent) {
        rjx rjx;
        bymq bymq;
        if (!aykg.m84157a()) {
            rpr b = rpr.m34216b();
            qxq f = aykk.m84185f(b);
            try {
                f.mo24383c("MetadataAlarmOperation").mo24359a();
                if (choh.m149231b()) {
                    rjx = avtz.m79336a(rpr.m34216b(), new avty());
                    bymq = null;
                } else {
                    bymq = aykk.m84163a(rpr.m34216b());
                    rjx = null;
                }
                if (chpz.m149332i()) {
                    if (chpz.m149333j()) {
                        if (chns.m149203b()) {
                            if (rjx == null) {
                                boolean z = true;
                                if (chob.m149222b()) {
                                    if (bymq.f167054c && bymq.f167053b) {
                                    }
                                    z = false;
                                    if (!bymq.f167056e && !bymq.f167053b && !z) {
                                    }
                                } else {
                                    if (bymq.f167054c) {
                                    }
                                    z = false;
                                }
                            } else if (aykk.m84177a(rjx, chpz.m149336m())) {
                            }
                        }
                    }
                    m94467a(b, f);
                    f.mo24388e();
                }
                if (chpz.m149333j()) {
                    if (chns.m149203b()) {
                    }
                }
                m94467a(b, f);
                f.mo24388e();
                f.mo24383c("MetadataCanCollect").mo24359a();
                StatsManager statsManager = (StatsManager) b.getSystemService("stats");
                if (statsManager == null) {
                    f.mo24383c("MetadataFailedStatsmanager").mo24359a();
                } else {
                    byte[] statsMetadata = statsManager.getStatsMetadata();
                    if (statsMetadata != null) {
                        if (statsMetadata.length != 0) {
                            bxvd da = byms.f167065g.mo74144da();
                            bxtx a = bxtx.m123261a(statsMetadata);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byms byms = (byms) da.f164949b;
                            a.getClass();
                            byms.f167068b = 2;
                            byms.f167069c = a;
                            f.mo24383c("MetadataUploaded").mo24359a();
                            if (rjx != null) {
                                rjx.mo24695a(chpz.m149336m(), ((byms) da.mo74062i()).mo73642k(), aykk.m84161a(), (int) chpd.m149265b());
                            } else {
                                if (aykk.f97845d == null) {
                                    aykk.f97845d = new qws(b, chpz.m149336m(), null);
                                }
                                aykk.m84171a(rjx, aykk.f97845d, bymq, f, da);
                            }
                            m94467a(b, f);
                        }
                    }
                    f.mo24383c("MetadataEmpty").mo24359a();
                }
            } catch (StatsManager.StatsUnavailableException e) {
                f.mo24383c("MetadataFailedUnavailable").mo24359a();
            } catch (Throwable th) {
                f.mo24388e();
                throw th;
            }
            f.mo24388e();
        }
    }
}
