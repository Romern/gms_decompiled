package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* renamed from: bero */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bero {
    /* renamed from: a */
    public static int m95590a(Context context, int i, String str) {
        if (m95592a()) {
            return spx.m35925a(context).mo25960c(cesb.m138146b(), i, str);
        }
        return 0;
    }

    /* renamed from: b */
    public static void m95594b(Context context, PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            m95590a(context, bhcq.m100641b(pendingIntent), bhcq.m100640a(pendingIntent));
        }
    }

    /* renamed from: a */
    public static void m95591a(Context context, String str) {
        List list;
        int callingPid = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        try {
            ApplicationInfo a = svr.m36484b(context).mo26172a(str, 0);
            if (m95592a() && a.targetSdkVersion > 28) {
                if (!TextUtils.isEmpty(cesb.m138147c())) {
                    list = bmyx.m108640a(';').mo66925c((CharSequence) cesb.m138147c());
                } else {
                    list = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (list != null && list.contains(str)) {
                        return;
                    }
                }
                if (m95596b(context, str)) {
                    return;
                }
                throw new SecurityException("Activity detection usage requires the ACTIVITY_RECOGNITION permission");
            } else if (svr.m36484b(context).mo26170a("com.google.android.gms.permission.ACTIVITY_RECOGNITION", callingPid, callingUid) != 0) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("activity_recognition_permission_whitelist", 0);
                String[] a2 = svr.m36484b(context).mo26175a(callingUid);
                for (String str2 : a2) {
                    if (sharedPreferences.getBoolean(str2, false)) {
                        try {
                            PackageInfo b = svr.m36484b(context).mo26176b(str2, 4096);
                            if (b.requestedPermissions != null) {
                                String[] strArr = b.requestedPermissions;
                                int length = strArr.length;
                                int i = 0;
                                while (i < length) {
                                    if ("com.google.android.gms.permission.ACTIVITY_RECOGNITION".equals(strArr[i])) {
                                        String valueOf = String.valueOf(str2);
                                        if (valueOf.length() == 0) {
                                            new String("Found package in activity recognition white-list: ");
                                            return;
                                        } else {
                                            "Found package in activity recognition white-list: ".concat(valueOf);
                                            return;
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            e.getMessage();
                        }
                        String valueOf2 = String.valueOf(str2);
                        if (valueOf2.length() == 0) {
                            new String("Found whitelisted package that doesn't define the permission in its manifest: ");
                        } else {
                            "Found whitelisted package that doesn't define the permission in its manifest: ".concat(valueOf2);
                        }
                    }
                }
                throw new SecurityException("Activity detection usage requires the ACTIVITY_RECOGNITION permission");
            }
        } catch (PackageManager.NameNotFoundException e2) {
            e2.getMessage();
        }
    }

    /* renamed from: b */
    public static boolean m95595b(Context context, int i, String str) {
        int a = m95590a(context, i, str);
        StringBuilder sb = new StringBuilder(61);
        sb.append("isRunTimetimePermissionAppOpsAllowed appOps mode: ");
        sb.append(a);
        sb.toString();
        return a == 0;
    }

    /* renamed from: b */
    public static boolean m95596b(Context context, String str) {
        return svr.m36484b(context).mo26171a(cesb.f183397a.mo6606a().activityRecognitionRuntimePermission(), str) == 0;
    }

    /* renamed from: a */
    public static boolean m95592a() {
        int i = Build.VERSION.SDK_INT;
        boolean e = cesb.m138149e();
        StringBuilder sb = new StringBuilder(52);
        sb.append("PlatformVersion at least Q true  flag enabled ");
        sb.append(e);
        sb.toString();
        int i2 = Build.VERSION.SDK_INT;
        return cesb.m138149e();
    }

    /* renamed from: a */
    public static boolean m95593a(Context context, PendingIntent pendingIntent) {
        if (!m95592a()) {
            return false;
        }
        int b = bhcq.m100641b(pendingIntent);
        String a = bhcq.m100640a(pendingIntent);
        if (!cesb.f183397a.mo6606a().checkPermissionBeforeNoteopV27()) {
            boolean b2 = m95595b(context, b, a);
            boolean b3 = m95596b(context, a);
            StringBuilder sb = new StringBuilder(80);
            sb.append("isRuntimePermissionGranted check, appOpsAllowed ");
            sb.append(b2);
            sb.append(" hasRuntimePermission ");
            sb.append(b3);
            sb.toString();
            if (b2 && b3) {
                return false;
            }
            return true;
        } else if (!m95596b(context, a) || !m95595b(context, b, a)) {
            return true;
        }
        return false;
    }
}
