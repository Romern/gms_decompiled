package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: apug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apug {

    /* renamed from: a */
    private final Context f84916a;

    /* renamed from: b */
    private final PackageManager f84917b;

    public apug(Context context) {
        this.f84916a = context;
        this.f84917b = context.getPackageManager();
    }

    /* renamed from: a */
    public final apuf mo47623a(String str) {
        apuf apuf = new apuf();
        try {
            apuf.f84912a = apuh.m71026a(new File(this.f84917b.getApplicationInfo(str, 0).sourceDir));
            apuf.f84914c = this.f84917b.getInstallerPackageName(str);
            apuf.f84915d = this.f84917b.getPackageInfo(str, 0).sharedUserId;
            Signature[] signatureArr = this.f84917b.getPackageInfo(str, 64).signatures;
            apuf.f84913b = new byte[signatureArr.length][];
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            for (int i = 0; i < signatureArr.length; i++) {
                apuf.f84913b[i] = instance.digest(signatureArr[i].toByteArray());
            }
            return apuf;
        } catch (PackageManager.NameNotFoundException | IOException | NoSuchAlgorithmException e) {
            return null;
        }
    }
}
