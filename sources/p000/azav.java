package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: azav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azav implements azau {

    /* renamed from: a */
    private final Context f98884a;

    public azav(Context context) {
        this.f98884a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bngx mo54558a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = this.f98884a.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo.signatures != null) {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                for (Signature signature : packageInfo.signatures) {
                    instance.update(signature.toCharsString().getBytes(bmwy.f131158c));
                    arrayList.add(Base64.encodeToString(instance.digest(), 2));
                }
            }
            return bngx.m109368a((Collection) arrayList);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(str);
            azoj.m85931a("TachystickSigList", e, valueOf.length() == 0 ? new String("Can't find package ") : "Can't find package ".concat(valueOf), new Object[0]);
            return bngx.m109376e();
        } catch (NoSuchAlgorithmException e2) {
            azoj.m85931a("TachystickSigList", e2, "MessageDigest algorithm not found", new Object[0]);
            return bngx.m109376e();
        }
    }
}
