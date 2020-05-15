package com.google.android.gms.backup.transport.stats;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupStatsChimeraService extends Service {

    /* renamed from: a */
    public static final lvn f29251a = new lvn("BackupStatsService");

    /* renamed from: a */
    public final List mo17287a(bxvd bxvd) {
        ArrayList arrayList = new ArrayList();
        try {
            ltq a = lzu.m24733a(this).mo19791a(bxvd);
            int a2 = ltp.m24383a(a.f32974b);
            if (a2 != 0) {
                int i = 1;
                if (a2 != 1) {
                    adyd.m51363a(this).mo33921b("com.google", ((lth) bxvd.f164949b).f32920e);
                    int a3 = ltp.m24383a(a.f32974b);
                    if (a3 != 0) {
                        i = a3;
                    }
                    throw new mbc("Authentication failure on server.", i);
                }
            }
            bxwc bxwc = a.f32979g;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                lti lti = (lti) bxwc.get(i2);
                arrayList.add(new ApplicationBackupStats(lti.f32935a, lti.f32936b, lti.f32937c, lti.f32938d));
            }
            return arrayList;
        } catch (mbf e) {
            lvn lvn = f29251a;
            int i3 = e.f33375a;
            StringBuilder sb = new StringBuilder(46);
            sb.append("Got backup stats response status : ");
            sb.append(i3);
            lvn.mo25418e(sb.toString(), new Object[0]);
            throw new mbn();
        } catch (IOException e2) {
            f29251a.mo25417e("Network exception sending backup stats request.", e2, new Object[0]);
            throw new mbn();
        }
    }

    public final IBinder onBind(Intent intent) {
        return new lui(this);
    }

    /* renamed from: a */
    public final boolean mo17288a(BackupStatsRequestConfig backupStatsRequestConfig) {
        if (!rfz.m33557a(this).mo24608b(Binder.getCallingUid())) {
            f29251a.mo25416d("API call is not from Google signed package.", new Object[0]);
            return false;
        } else if (backupStatsRequestConfig.f28988a || backupStatsRequestConfig.f28989b) {
            return true;
        } else {
            f29251a.mo25416d("Client should request either backup data size or backup timestamp", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public final ApplicationBackupStats[] mo17289a(long j, BackupStatsRequestConfig backupStatsRequestConfig) {
        try {
            return mo17290a(j, may.m24782a(this, "android"), backupStatsRequestConfig);
        } catch (mbh e) {
            f29251a.mo25416d("There is no backup account.", new Object[0]);
            return null;
        } catch (mbb e2) {
            f29251a.mo25417e("Failed to get auth token for backup account.", e2, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final ApplicationBackupStats[] mo17290a(long j, String str, BackupStatsRequestConfig backupStatsRequestConfig) {
        String str2;
        bxvd da = lth.f32914q.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lth lth = (lth) da.f164949b;
        int i = lth.f32916a | 1;
        lth.f32916a = i;
        lth.f32917b = j;
        str.getClass();
        lth.f32916a = i | 16;
        lth.f32920e = str;
        bxvd da2 = ltc.f32888e.mo74144da();
        boolean z = backupStatsRequestConfig.f28988a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ltc ltc = (ltc) da2.f164949b;
        int i2 = ltc.f32890a | 1;
        ltc.f32890a = i2;
        ltc.f32892c = z;
        boolean z2 = backupStatsRequestConfig.f28989b;
        ltc.f32890a = i2 | 2;
        ltc.f32893d = z2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lth lth2 = (lth) da.f164949b;
        ltc ltc2 = (ltc) da2.mo74062i();
        ltc2.getClass();
        lth2.f32929n = ltc2;
        lth2.f32916a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        if (cckq.m130234b()) {
            long a = spn.m35843a(this);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lth lth3 = (lth) da.f164949b;
            lth3.f32916a |= 2;
            lth3.f32918c = a;
        }
        try {
            return (ApplicationBackupStats[]) mo17287a(da).toArray(new ApplicationBackupStats[0]);
        } catch (mbc e) {
            lvn lvn = f29251a;
            String message = e.getMessage();
            int i3 = e.f33374a;
            if (i3 != 0) {
                str2 = ltp.m24384b(i3);
            } else {
                str2 = "null";
            }
            String valueOf = String.valueOf(str2);
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9 + String.valueOf(valueOf).length());
            sb.append(message);
            sb.append(", code : ");
            sb.append(valueOf);
            lvn.mo25418e(sb.toString(), new Object[0]);
            return null;
        } catch (mbn e2) {
            lvn lvn2 = f29251a;
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 46);
            sb2.append("Transfer exception while getting backup stats ");
            sb2.append(valueOf2);
            lvn2.mo25418e(sb2.toString(), new Object[0]);
            return null;
        }
    }
}
