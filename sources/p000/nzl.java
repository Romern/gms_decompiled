package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Pair;

/* renamed from: nzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzl {

    /* renamed from: a */
    public static final bnsn f37012a = odk.m28481a("CAR.CAM.THEME");

    /* renamed from: a */
    public final int mo21868a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getInt("com.google.android.projection.gearhead.WINDOW_ANIMATION_STYLE", 0);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            bnsi b = f37012a.mo68387b();
            b.mo68432a("nzl", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("Could not get windowAnimationStyle for package %s", context.getPackageName());
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo21869a(Context context, ComponentName componentName) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
            if (bundle != null) {
                return bundle.getInt("com.google.android.projection.gearhead.WINDOW_ANIMATION_STYLE", mo21868a(context));
            }
            return mo21868a(context);
        } catch (PackageManager.NameNotFoundException e) {
            bnsi b = f37012a.mo68387b();
            b.mo68432a("nzl", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("Could not get windowAnimationStyle for component %s", componentName);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Pair mo21870a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{16842940, 16842941});
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
            return Pair.create(Integer.valueOf(resourceId), Integer.valueOf(resourceId2));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
