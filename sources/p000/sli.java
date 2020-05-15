package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.stats.GmsCoreStatsChimeraService;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sli {
    /* renamed from: a */
    protected static final List m35573a(Context context, FilenameFilter filenameFilter, String str) {
        Context d = aytw.m84817d(context);
        File dir = d.getDir("stats", 0);
        ArrayList arrayList = new ArrayList();
        File[] listFiles = dir.listFiles(filenameFilter);
        if (listFiles != null) {
            Collections.addAll(arrayList, listFiles);
        } else {
            String path = dir.getPath();
            StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 52);
            sb.append("Expected ");
            sb.append(path);
            sb.append(" to be a readable directory, but it is not.");
            Log.e("StatsUploadTask", sb.toString());
        }
        File file = new File(d.getFilesDir(), str);
        if (file.exists()) {
            arrayList.add(file);
        }
        return arrayList;
    }

    /* renamed from: a */
    public abstract String mo25683a();

    /* renamed from: a */
    public abstract List mo25684a(Context context);

    /* renamed from: a */
    public abstract boolean mo25685a(bxvd bxvd);

    /* renamed from: b */
    public abstract boolean mo25686b();

    /* renamed from: c */
    public abstract long mo25687c();

    /* renamed from: d */
    public abstract int mo25688d();

    /* renamed from: a */
    public void mo25699a(Application application) {
        int d;
        if (mo25686b() && (d = mo25688d()) != 21 && d != 3) {
            sfb a = sfc.m35143a(rpr.m34216b(), ((Boolean) skm.f44639h.mo58455c()).booleanValue());
            if (!a.mo25464b()) {
                GmsCoreStatsChimeraService.m22711a(application);
                return;
            }
            rpr b = rpr.m34216b();
            Context d2 = aytw.m84817d(b);
            List a2 = a.mo25461a(b);
            String valueOf = String.valueOf(mo25683a());
            Log.i("StatsUploadTask", valueOf.length() == 0 ? new String("Uploading ") : "Uploading ".concat(valueOf));
            try {
                rik.m33637a();
                bpvc a3 = rik.m33636a(d2);
                int i = d - 1;
                if (d != 0) {
                    if (i != 3) {
                        if (i == 4) {
                            int i2 = Build.VERSION.SDK_INT;
                            if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
                                SharedPreferences.Editor edit = d2.getSharedPreferences("NetworkReportServicePrefs", 0).edit();
                                long longValue = ((Long) skj.f44621d.mo58455c()).longValue() + smh.m35658c(System.currentTimeMillis()).longValue();
                                long longValue2 = longValue + ((Long) skj.f44622e.mo58455c()).longValue();
                                smb.m35631a();
                                smb.m35632a(b, Process.myUid(), longValue, longValue2);
                                edit.putLong("lastDailyReportTaskEndTimestamp", longValue2);
                                if (!edit.commit()) {
                                    Log.e("StatsUploadTask", "failed to write the last timestamp to sharedPreferences");
                                }
                            }
                            new slo(d2, d).mo25707a(this, a2, a3);
                        } else if (i != 5) {
                            if (i == 18) {
                                new slo(d2, d).mo25707a(this, a2, a3);
                            } else if (d != 0) {
                                StringBuilder sb = new StringBuilder(25);
                                sb.append("Invalid event ");
                                sb.append(i);
                                throw new sln(sb.toString());
                            } else {
                                throw null;
                            }
                        }
                        String a4 = mo25683a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a4).length() + 20);
                        sb2.append("Uploading ");
                        sb2.append(a4);
                        sb2.append(" completed");
                        Log.i("StatsUploadTask", sb2.toString());
                        return;
                    }
                    List<File> a5 = mo25684a(d2);
                    int i3 = Build.VERSION.SDK_INT;
                    UserManager userManager = (UserManager) rpr.m34216b().getSystemService("user");
                    if (userManager != null && userManager.isUserUnlocked()) {
                        a5.addAll(mo25684a(rpr.m34216b()));
                    }
                    for (File file : a5) {
                        slo.m35585a(d2, d, file).mo25707a(this, a2, a3);
                    }
                    String a42 = mo25683a();
                    StringBuilder sb22 = new StringBuilder(String.valueOf(a42).length() + 20);
                    sb22.append("Uploading ");
                    sb22.append(a42);
                    sb22.append(" completed");
                    Log.i("StatsUploadTask", sb22.toString());
                    return;
                }
                throw null;
            } catch (sln e) {
                String valueOf2 = String.valueOf(e.toString());
                Log.e("StatsUploadTask", valueOf2.length() == 0 ? new String("Failed to upload logs. ") : "Failed to upload logs. ".concat(valueOf2));
            }
        }
    }
}
