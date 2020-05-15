package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* renamed from: vrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vrs {
    /* renamed from: a */
    static final ComponentName m41125a(Context context, String str) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT"), 0)) {
            if (resolveInfo.activityInfo != null) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (str.equals(activityInfo.packageName)) {
                    return new ComponentName(str, activityInfo.name);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    static final Intent m41127b(String str) {
        return new Intent("android.intent.action.APPLICATION_PREFERENCES").setPackage(str);
    }

    /* renamed from: e */
    public static vrs m41128e(Context context) {
        vrs vqj = new vqj();
        if (!vqj.mo28745d(context)) {
            vqj = new vra();
            if (!vqj.mo28745d(context)) {
                return !ccrg.m131342b() ? new vuj() : new vus();
            }
        }
        return vqj;
    }

    /* renamed from: a */
    public abstract CharSequence mo28739a(Context context);

    /* renamed from: a */
    public abstract String mo28740a();

    /* renamed from: b */
    public abstract ComponentName mo28741b(Context context);

    /* renamed from: b */
    public abstract Intent mo28742b();

    /* renamed from: c */
    public abstract int mo28743c();

    /* renamed from: c */
    public abstract boolean mo28744c(Context context);

    /* renamed from: d */
    public abstract boolean mo28745d(Context context);

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static vrs m41126a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1740589862:
                if (str.equals("car_pref_key_driving_mode_behavior_dnd_preference")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -959566904:
                if (str.equals("car_pref_key_driving_mode_behavior_none_preference")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 771689716:
                if (str.equals("car_pref_key_driving_mode_behavior_morris_preference")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1255183367:
                if (str.equals("com.google.android.projection.gearhead")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new vra();
        }
        if (c == 1) {
            return new vuj();
        }
        if (c == 2) {
            return new vqj();
        }
        if (c != 3) {
            return new vrc(str);
        }
        return new vus();
    }
}
