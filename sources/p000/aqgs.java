package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.security.verifier.ApkUploadEntry;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;
import java.io.File;
import java.util.Iterator;

/* renamed from: aqgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgs extends adzt {

    /* renamed from: a */
    final /* synthetic */ InternalApkUploadChimeraService f86082a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqgs(InternalApkUploadChimeraService internalApkUploadChimeraService, Looper looper) {
        super(looper);
        this.f86082a = internalApkUploadChimeraService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x003e A[SYNTHETIC] */
    public final void handleMessage(Message message) {
        PackageInfo packageInfo;
        int i = message.arg1;
        Object[] objArr = {Integer.valueOf(message.what), Integer.valueOf(i)};
        int i2 = message.what;
        if (i2 == 0) {
            InternalApkUploadChimeraService internalApkUploadChimeraService = this.f86082a;
            Iterator it = internalApkUploadChimeraService.f107615f.iterator();
            while (it.hasNext()) {
                ApkUploadEntry apkUploadEntry = (ApkUploadEntry) it.next();
                new Object[1][0] = apkUploadEntry.toString();
                try {
                    packageInfo = internalApkUploadChimeraService.getPackageManager().getPackageInfo(apkUploadEntry.f107599b, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    int i3 = apkUploadEntry.f107604g;
                    if (i3 == 0) {
                        if (apkUploadEntry.f107600c == packageInfo.versionCode && apkUploadEntry.f107605h != packageInfo.lastUpdateTime) {
                            if (internalApkUploadChimeraService.mo58952a(packageInfo, apkUploadEntry.f107601d)) {
                                internalApkUploadChimeraService.f107615f.mo47871b(apkUploadEntry, packageInfo.lastUpdateTime);
                            } else {
                                internalApkUploadChimeraService.f107615f.mo47868a(apkUploadEntry, packageInfo.lastUpdateTime);
                            }
                        }
                        if (InternalApkUploadChimeraService.m92445a(apkUploadEntry)) {
                            aqgy.m71602b("Upload for package %s has expired, removing from upload queue", apkUploadEntry.f107599b);
                            internalApkUploadChimeraService.f107615f.mo47867a(apkUploadEntry);
                        }
                    } else if (i3 != 1) {
                        aqgy.m71600a("Invalid entry state for id=%d: %d", Long.valueOf(apkUploadEntry.f107598a), Integer.valueOf(apkUploadEntry.f107604g));
                        if (InternalApkUploadChimeraService.m92445a(apkUploadEntry)) {
                        }
                    } else if (apkUploadEntry.f107600c != packageInfo.versionCode) {
                        internalApkUploadChimeraService.f107615f.mo47867a(apkUploadEntry);
                    } else if (apkUploadEntry.f107605h != packageInfo.lastUpdateTime) {
                        if (!internalApkUploadChimeraService.mo58952a(packageInfo, apkUploadEntry.f107601d)) {
                            internalApkUploadChimeraService.f107615f.mo47867a(apkUploadEntry);
                        } else {
                            internalApkUploadChimeraService.f107615f.mo47868a(apkUploadEntry, packageInfo.lastUpdateTime);
                        }
                    }
                    if (internalApkUploadChimeraService.mo58953b()) {
                        aqgy.m71602b("Starting upload for package %s", apkUploadEntry.f107599b);
                        if (internalApkUploadChimeraService.mo58948a(new File(packageInfo.applicationInfo.sourceDir), apkUploadEntry.f107601d, apkUploadEntry.f107602e, apkUploadEntry.f107607j) == 1) {
                            aqgy.m71602b("Upload for package %s was successful, removing from upload queue", apkUploadEntry.f107599b);
                            internalApkUploadChimeraService.f107615f.mo47867a(apkUploadEntry);
                        } else if (apkUploadEntry.f107606i + 1 < 3) {
                            internalApkUploadChimeraService.f107615f.mo47872c(apkUploadEntry);
                            aqgy.m71602b("Upload for package %s was not successful", apkUploadEntry.f107599b);
                        } else {
                            aqgy.m71602b("Retry attempts for package %s exceeded, removing upload", apkUploadEntry.f107599b);
                            internalApkUploadChimeraService.f107615f.mo47867a(apkUploadEntry);
                        }
                    }
                    if (InternalApkUploadChimeraService.m92445a(apkUploadEntry)) {
                    }
                } else {
                    if (apkUploadEntry.f107604g == 1) {
                        aqgy.m71602b("Package %s is no longer installed, removing from upload queue", apkUploadEntry.f107599b);
                        internalApkUploadChimeraService.f107615f.mo47867a(apkUploadEntry);
                    }
                    if (InternalApkUploadChimeraService.m92445a(apkUploadEntry)) {
                        aqgy.m71602b("Upload for package %s has expired, removing from upload queue", apkUploadEntry.f107599b);
                        internalApkUploadChimeraService.f107615f.mo47867a(apkUploadEntry);
                    }
                }
            }
            InternalApkUploadChimeraService internalApkUploadChimeraService2 = this.f86082a;
            int i4 = InternalApkUploadChimeraService.f107608a;
            internalApkUploadChimeraService2.mo58951a(i);
        } else if (i2 == 1) {
            InternalApkUploadChimeraService internalApkUploadChimeraService3 = this.f86082a;
            int i5 = InternalApkUploadChimeraService.f107608a;
            if (!internalApkUploadChimeraService3.mo58951a(i)) {
                this.f86082a.mo58949a(true);
            }
        } else if (i2 == 2) {
            InternalApkUploadChimeraService internalApkUploadChimeraService4 = this.f86082a;
            int i6 = InternalApkUploadChimeraService.f107608a;
            internalApkUploadChimeraService4.mo58951a(i);
        }
    }
}
