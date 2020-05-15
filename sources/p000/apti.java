package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: apti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apti {

    /* renamed from: a */
    private final Context f84850a;

    /* renamed from: b */
    private final PackageManager f84851b;

    public apti(Context context) {
        this.f84850a = context;
        this.f84851b = context.getPackageManager();
    }

    /* renamed from: a */
    public final apth mo47592a(String str) {
        apth apth = new apth();
        try {
            apth.f84846a = aptj.m70973a(new File(this.f84851b.getApplicationInfo(str, 0).sourceDir));
            apth.f84848c = this.f84851b.getInstallerPackageName(str);
            apth.f84849d = this.f84851b.getPackageInfo(str, 0).sharedUserId;
            Signature[] signatureArr = this.f84851b.getPackageInfo(str, 64).signatures;
            apth.f84847b = new byte[signatureArr.length][];
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < signatureArr.length; i++) {
                apth.f84847b[i] = instance.digest(signatureArr[i].toByteArray());
            }
            return apth;
        } catch (PackageManager.NameNotFoundException | IOException | NoSuchAlgorithmException e) {
            return null;
        }
    }
}
