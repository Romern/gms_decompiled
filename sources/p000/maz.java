package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: maz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class maz {

    /* renamed from: a */
    public static final lvn f33373a = new lvn("BackupCommands");

    /* renamed from: a */
    public static boolean m24783a(ApplicationInfo applicationInfo) {
        if ((applicationInfo.flags & 2097152) != 0) {
            f33373a.mo25409a("Rejecting %s because stopped.", applicationInfo.packageName);
            return false;
        } else if ((applicationInfo.flags & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) == 0) {
            f33373a.mo25409a("Rejecting %s because allowBackup is false.", applicationInfo.packageName);
            return false;
        } else if (applicationInfo.uid < 10000 && applicationInfo.backupAgentName == null) {
            f33373a.mo25409a("Rejecting %s because system-level UID, but doesn't have backup agent.", applicationInfo.packageName);
            return false;
        } else if (!applicationInfo.packageName.equals("com.android.sharedstoragebackup")) {
            return true;
        } else {
            f33373a.mo25409a("Rejecting %s because it is shared-storage backup package used for adb backup.", applicationInfo.packageName);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m24784a(PackageInfo packageInfo) {
        if (packageInfo.applicationInfo.backupAgentName == null || (packageInfo.applicationInfo.flags & 67108864) != 0) {
            return true;
        }
        return false;
    }
}
