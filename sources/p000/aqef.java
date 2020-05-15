package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* renamed from: aqef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqef {

    /* renamed from: a */
    public final aqfa f85861a;

    /* renamed from: b */
    public final PackageManager f85862b;

    /* renamed from: c */
    private final Context f85863c;

    public aqef(Context context, aqfa aqfa) {
        this.f85863c = context;
        this.f85861a = aqfa;
        this.f85862b = context.getPackageManager();
        new SparseArray();
        mo47768a();
    }

    /* renamed from: a */
    static aqed m71419a(PackageManager packageManager, String str, boolean z) {
        boolean z2;
        ByteArrayInputStream byteArrayInputStream;
        X509Certificate x509Certificate;
        aqed aqed = new aqed();
        aqed.f85847a = str;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 4162);
            File file = new File(applicationInfo.sourceDir);
            aqed.f85848b = aqfy.m71560a(file);
            file.length();
            Signature[] signatureArr = packageInfo.signatures;
            aqed.f85849c = new byte[signatureArr.length][];
            aqed.f85852f = new ArrayList();
            for (int i = 0; i < signatureArr.length; i++) {
                byte[] byteArray = signatureArr[i].toByteArray();
                aqed.f85849c[i] = instance.digest(byteArray);
                try {
                    byteArrayInputStream = new ByteArrayInputStream(byteArray);
                    try {
                        CertificateFactory instance2 = CertificateFactory.getInstance("X509");
                        if (instance2 != null) {
                            x509Certificate = (X509Certificate) instance2.generateCertificate(byteArrayInputStream);
                        } else {
                            x509Certificate = null;
                        }
                        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                        if (issuerX500Principal != null) {
                            aqed.f85852f.add(issuerX500Principal.getName());
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e) {
                        }
                    } catch (CertificateException e2) {
                        try {
                            aqed.f85852f.add("");
                            byteArrayInputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException e3) {
                            }
                            throw th;
                        }
                    }
                } catch (CertificateException e4) {
                    byteArrayInputStream = null;
                    aqed.f85852f.add("");
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = null;
                    byteArrayInputStream.close();
                    throw th;
                }
            }
            aqed.f85851e = packageInfo.versionCode;
            aqed.f85853g = packageInfo.requestedPermissions;
            if (z) {
                if (packageInfo.firstInstallTime < packageInfo.lastUpdateTime) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                aqed.f85856j = z2;
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null && (r9 = activityInfoArr.length) > 0) {
                aqed.f85854h = new ArrayList();
                for (ActivityInfo activityInfo : activityInfoArr) {
                    aqee aqee = new aqee();
                    aqee.f85857a = activityInfo.name;
                    aqee.f85858b = activityInfo.enabled;
                    aqee.f85859c = activityInfo.exported;
                    aqee.f85860d = activityInfo.permission;
                    aqed.f85854h.add(aqee);
                }
            }
            return aqed;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e5) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SparseIntArray mo47768a() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f85863c.getSystemService("activity")).getRunningAppProcesses();
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid != 0) {
                sparseIntArray.put(runningAppProcessInfo.pid, runningAppProcessInfo.uid);
            }
        }
        return sparseIntArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aqed mo47769a(String str) {
        return mo47770a(str, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aqed mo47770a(String str, boolean z) {
        return m71419a(this.f85862b, str, z);
    }
}
