package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: axuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axuu implements axut {

    /* renamed from: a */
    final Context f96417a;

    public axuu(Context context) {
        this.f96417a = context;
    }

    /* renamed from: a */
    public final Set mo53596a(axue axue) {
        String str = axue.f96378b;
        try {
            Resources resourcesForApplication = this.f96417a.getPackageManager().getResourcesForApplication(str);
            String a = ayjp.m84116a(resourcesForApplication, str);
            int identifier = resourcesForApplication.getIdentifier("android_wear_capabilities", "array", a);
            if (identifier != 0) {
                try {
                    String[] stringArray = resourcesForApplication.getStringArray(identifier);
                    if (stringArray != null && stringArray.length > 0) {
                        return new HashSet(Arrays.asList(stringArray));
                    }
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("CapabilityService", 6)) {
                        String message = e.getMessage();
                        int length = String.valueOf(str).length();
                        StringBuilder sb = new StringBuilder(length + 98 + String.valueOf(a).length() + String.valueOf(message).length());
                        sb.append("Attempt to get resource for existing id (");
                        sb.append(identifier);
                        sb.append(") failed in package '");
                        sb.append(str);
                        sb.append("' (resource package '");
                        sb.append(a);
                        sb.append("'): ");
                        sb.append(message);
                        Log.e("CapabilityService", sb.toString());
                    }
                }
            }
            return Collections.emptySet();
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            if (Log.isLoggable("CapabilityService", 6)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 74);
                sb2.append("Could not get resources for package \"");
                sb2.append(str);
                sb2.append("\". Returning an empty capability set.");
                Log.e("CapabilityService", sb2.toString());
            }
            return Collections.emptySet();
        }
    }
}
