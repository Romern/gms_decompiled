package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* renamed from: asfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfx extends asen {

    /* renamed from: h */
    private PackageManager f88880h;

    public asfx() {
        super("Launcherstats", "activity", "LAUNCHER_STATS", false);
    }

    /* renamed from: a */
    public final String[] mo49101a(long j, long j2) {
        return asen.f88783g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final calx mo49102b(Context context, InputStream inputStream, long j, long j2, qxq qxq) {
        return mo49100a(context, inputStream, j, j2, qxq, true);
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgue.f187767a.mo6606a().mo84503b();
    }

    /* renamed from: d */
    public final long mo49095d() {
        return 0;
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        int i = Build.VERSION.SDK_INT;
        return cgue.f187767a.mo6606a().mo84502a();
    }

    /* renamed from: c */
    public final File mo49103c(Context context, long j, long j2, qxq qxq) {
        String[] strArr;
        File fileStreamPath = context.getFileStreamPath(String.valueOf(this.f88779a).concat(".tmp"));
        if (fileStreamPath.exists()) {
            fileStreamPath.delete();
        }
        PackageManager packageManager = context.getPackageManager();
        if (this.f88880h == null) {
            this.f88880h = packageManager;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        List<ResolveInfo> queryIntentActivities = this.f88880h.queryIntentActivities(intent, 1048576);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            String str = "";
            String str2 = str;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                try {
                    ApplicationInfo applicationInfo = this.f88880h.getApplicationInfo(next.activityInfo.packageName, 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || TextUtils.isEmpty(applicationInfo.metaData.getString("com.android.launcher3.launcher_dump_provider")))) {
                        str2 = next.activityInfo.packageName;
                        try {
                            str = applicationInfo.metaData.getString("com.android.launcher3.launcher_dump_provider");
                            break;
                        } catch (PackageManager.NameNotFoundException e) {
                            e = e;
                            Log.e(this.f88779a, "Fail to get package info for Launcher", e);
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    e = e2;
                    Log.e(this.f88779a, "Fail to get package info for Launcher", e);
                }
            }
            if (!str2.isEmpty() && !str.isEmpty()) {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
                sb.append(str2);
                sb.append("/");
                sb.append(str);
                strArr = new String[]{"provider", sb.toString(), "--proto"};
            } else {
                strArr = asen.f88783g;
            }
        } else {
            strArr = asen.f88783g;
        }
        if (strArr.length == 0) {
            qxq.mo24383c("LauncherInvalidCommandFlag").mo24359a();
            return fileStreamPath;
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileStreamPath);
            try {
                if (Debug.dumpService(this.f88784f, fileOutputStream2.getFD(), strArr)) {
                    srz.m36171a(fileOutputStream2);
                    return fileStreamPath;
                }
                Log.w(this.f88779a, "Dumpsys failed.");
                throw new asel(String.valueOf(this.f88779a).concat(" dumpsys failed."));
            } catch (IOException | NullPointerException | SecurityException e3) {
                e = e3;
                fileOutputStream = fileOutputStream2;
                try {
                    qxq.mo24383c("LauncherDumpsysException").mo24359a();
                    throw new asel(e);
                } catch (Throwable th) {
                    th = th;
                    srz.m36171a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                srz.m36171a(fileOutputStream);
                throw th;
            }
        } catch (IOException | NullPointerException | SecurityException e4) {
            e = e4;
            qxq.mo24383c("LauncherDumpsysException").mo24359a();
            throw new asel(e);
        } catch (Throwable th3) {
            th = th3;
            srz.m36171a(fileOutputStream);
            throw th;
        }
    }
}
