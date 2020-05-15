package p000;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.chimera.Activity;

/* renamed from: bilr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bilr {

    /* renamed from: a */
    private final Activity f120856a;

    public bilr(Activity activity) {
        this.f120856a = activity;
    }

    /* renamed from: a */
    public final BitmapDrawable mo64747a(String str, int i) {
        BitmapDrawable bitmapDrawable;
        PackageManager packageManager = this.f120856a.getPackageManager();
        String str2 = null;
        if (packageManager == null) {
            str2 = "No PackageManager";
            bitmapDrawable = null;
        } else {
            try {
                Resources resourcesForApplication = packageManager.getResourcesForApplication(str);
                if (resourcesForApplication == null) {
                    String valueOf = String.valueOf(str);
                    str2 = valueOf.length() == 0 ? new String("No Resources for package: ") : "No Resources for package: ".concat(valueOf);
                    bitmapDrawable = null;
                } else {
                    Drawable drawable = resourcesForApplication.getDrawable(i);
                    if (!(drawable instanceof BitmapDrawable)) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append("Invalid Drawable for resourceId: ");
                        sb.append(i);
                        str2 = sb.toString();
                        bitmapDrawable = null;
                    } else {
                        bitmapDrawable = (BitmapDrawable) drawable;
                    }
                }
            } catch (PackageManager.NameNotFoundException | Resources.NotFoundException e) {
                str2 = e.toString();
                bitmapDrawable = null;
            }
        }
        if (str2 != null) {
            String valueOf2 = String.valueOf(str2);
            bioi.m102658a("Places", valueOf2.length() == 0 ? new String("Unable to get Drawable from resources: ") : "Unable to get Drawable from resources: ".concat(valueOf2));
        }
        return bitmapDrawable;
    }
}
