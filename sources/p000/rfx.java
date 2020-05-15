package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;

/* renamed from: rfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rfx extends rfy {
    @Deprecated

    /* renamed from: a */
    public static final int f42891a = rfy.f42893b;

    /* renamed from: c */
    public static Context m33539c(Context context) {
        return rfy.m33552i(context);
    }

    /* renamed from: e */
    public static boolean m33541e(Context context) {
        return rfy.m33554k(context);
    }

    @Deprecated
    /* renamed from: a */
    public static Dialog m33532a(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (rfy.m33548b(activity, i)) {
            i = 18;
        }
        return rfi.f42868a.mo24580a(activity, i, i2, onCancelListener);
    }

    /* renamed from: b */
    public static Resources m33538b(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m33540d(Context context) {
        return sre.m36080a(context);
    }

    @Deprecated
    /* renamed from: a */
    public static void m33533a(int i, Context context) {
        rfi rfi = rfi.f42868a;
        if (rfy.m33548b(context, i) || (i == 9 && rfy.m33546a(context, "com.android.vending"))) {
            rfi.mo24585a(context);
        } else {
            rfi.mo24586a(context, i);
        }
    }

    /* renamed from: a */
    public static void m33534a(int i, com.google.android.chimera.Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        m33536a(i, activity.getContainerActivity(), null, 6000, onCancelListener);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m33535a(int i, Activity activity, int i2) {
        return m33536a(i, activity, null, i2, null);
    }

    /* renamed from: a */
    public static boolean m33536a(int i, Activity activity, C1018gh ghVar, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (rfy.m33548b(activity, i)) {
            i = 18;
        }
        rfi rfi = rfi.f42868a;
        if (ghVar == null) {
            return rfi.mo24589b(activity, i, i2, onCancelListener);
        }
        Dialog a = rfi.mo24581a(activity, i, new sax(rfi.f42868a.mo24591b(activity, i, "d"), ghVar, i2), onCancelListener);
        if (a == null) {
            return false;
        }
        rfi.mo24584a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: a */
    public static boolean m33537a(Context context) {
        return rfy.m33550g(context);
    }
}
