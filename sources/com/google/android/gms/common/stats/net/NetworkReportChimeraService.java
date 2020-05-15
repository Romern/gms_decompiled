package com.google.android.gms.common.stats.net;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkReportChimeraService extends aeah {

    /* renamed from: a */
    private SharedPreferences f30372a;

    /* renamed from: b */
    private SharedPreferences.Editor f30373b;

    /* renamed from: a */
    private final int m22729a(Future future) {
        try {
            Boolean bool = (Boolean) future.get();
            this.f30373b.putInt("rescheduleCount", 0);
            this.f30373b.apply();
            if (bool == null || !bool.booleanValue()) {
                return 2;
            }
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            Log.i("NetworkReportService", "Task failed", e);
            return 2;
        }
    }

    /* renamed from: a */
    private static final boolean m22730a(long j, long j2) {
        return j == 0 || j < j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0142, code lost:
        return r2;
     */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        Future future;
        long j;
        long j2;
        synchronized (this) {
            int i = 0;
            SharedPreferences sharedPreferences = aytw.m84817d(this).getSharedPreferences("NetworkReportServicePrefs", 0);
            this.f30372a = sharedPreferences;
            this.f30373b = sharedPreferences.edit();
            Boolean bool = (Boolean) skj.f44624g.mo58455c();
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 2;
            if (!bool.booleanValue()) {
                return 2;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (!bool.booleanValue()) {
                int i5 = this.f30372a.getInt("rescheduleCount", 0);
                if (new File("/proc/net/xt_qtaguid/stats").canRead()) {
                    i3 = m22729a(smb.m35631a().mo25735a(getContentResolver(), Process.myUid()));
                } else {
                    int i6 = i5 + 1;
                    this.f30373b.putInt("rescheduleCount", i6);
                    this.f30373b.apply();
                    if (i6 < 10) {
                        i3 = 1;
                    }
                }
            } else {
                String str = aecc.f63128a;
                long j3 = this.f30372a.getLong("lastDailyReportTaskEndTimestamp", 0);
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = smh.m35657b(currentTimeMillis).longValue();
                long longValue2 = smh.m35658c(currentTimeMillis).longValue();
                if ("NetworkReportServiceOneoff".equals(str)) {
                    if (!m22730a(j3, longValue2)) {
                        j = longValue2;
                    } else {
                        j = longValue;
                    }
                    future = smb.m35631a().mo25736a(this, Process.myUid(), j, Long.MAX_VALUE, false, true);
                } else if ("NetworkReportServicePartialReportsForToday".equals(str)) {
                    long j4 = this.f30372a.getLong("lastPartialReportTaskEndTimestamp", 0);
                    long j5 = currentTimeMillis - j4;
                    if (j4 != 0) {
                        if (j5 < ((Long) skj.f44623f.mo58455c()).longValue()) {
                            i = 1;
                        }
                    }
                    if (longValue2 > j4) {
                        j2 = longValue2;
                    } else {
                        j2 = j4;
                    }
                    future = smb.m35631a().mo25736a(this, Process.myUid(), j2, currentTimeMillis, false, false);
                    this.f30373b.putLong("lastPartialReportTaskEndTimestamp", currentTimeMillis);
                    this.f30373b.apply();
                } else if (!"NetworkReportServiceYesterdaysReport".equals(str)) {
                    i = 2;
                } else if (m22730a(j3, longValue2)) {
                    i = m22729a(smb.m35631a().mo25736a(this, Process.myUid(), longValue, longValue2, true, true));
                    if (i == 0) {
                        this.f30373b.putLong("lastDailyReportTaskEndTimestamp", currentTimeMillis);
                        this.f30373b.apply();
                    }
                }
                i = m22729a(future);
            }
        }
    }
}
