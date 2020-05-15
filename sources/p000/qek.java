package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: qek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qek implements qeo {

    /* renamed from: a */
    private final HashSet f41076a = new HashSet();

    /* renamed from: a */
    public final void mo23984a(Object obj) {
        try {
            HashSet hashSet = this.f41076a;
            sek sek = qeq.f41085a;
            if (obj instanceof Number) {
                hashSet.add(Integer.valueOf(((Number) obj).intValue()));
                return;
            }
            throw new IllegalArgumentException("number expected");
        } catch (IllegalArgumentException e) {
            qeq.f41085a.mo25418e(e.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo23985a(StringBuilder sb, Context context) {
        String[] packagesForUid;
        FileInputStream fileInputStream;
        PackageManager packageManager = context.getPackageManager();
        Iterator it = this.f41076a.iterator();
        loop0:
        while (it.hasNext() && (packagesForUid = packageManager.getPackagesForUid(((Integer) it.next()).intValue())) != null) {
            int length = packagesForUid.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String str = packagesForUid[i];
                    try {
                        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
                        File file = new File(applicationInfo.sourceDir);
                        MessageDigest instance = MessageDigest.getInstance("SHA-256");
                        try {
                            fileInputStream = new FileInputStream(file);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    instance.update(bArr, 0, read);
                                }
                                fileInputStream.close();
                                String a = srv.m36160a(instance.digest());
                                String num = Integer.toString(packageInfo.versionCode);
                                sb.append('|');
                                sb.append(str);
                                sb.append(':');
                                sb.append(a);
                                sb.append(':');
                                sb.append(num);
                                sb.append(':');
                                Signature[] signatureArr = packageInfo.signatures;
                                MessageDigest instance2 = MessageDigest.getInstance("SHA-256");
                                int i2 = 0;
                                while (true) {
                                    int length2 = signatureArr.length;
                                    if (i2 >= length2) {
                                        break;
                                    }
                                    sb.append(srv.m36160a(instance2.digest(signatureArr[i2].toByteArray())));
                                    if (i2 != length2 - 1) {
                                        sb.append(",");
                                    }
                                    i2++;
                                }
                                sb.append('|');
                                i++;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = null;
                            if (fileInputStream == null) {
                                break loop0;
                            }
                            fileInputStream.close();
                            break loop0;
                            throw th;
                        }
                    } catch (PackageManager.NameNotFoundException | IOException | NoSuchAlgorithmException e) {
                        qeq.f41085a.mo25418e(e.toString(), new Object[0]);
                    }
                }
            }
            throw th;
        }
    }
}
