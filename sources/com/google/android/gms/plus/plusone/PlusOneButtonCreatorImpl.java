package com.google.android.gms.plus.plusone;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.RemoteException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlusOneButtonCreatorImpl extends ants {
    public static final String TAG = "PlusOneButtonCreatorImpl";

    /* renamed from: a */
    private static final Resources m68541a(Context context) {
        try {
            Context createPackageContext = context.createPackageContext("com.google.android.gms", 4);
            if (createPackageContext != null) {
                return createPackageContext.getResources();
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public vzr newPlusOneButton(vzr vzr, int i, int i2, String str, int i3) {
        Context context = (Context) vzs.m41641a(vzr);
        if (m68541a(context) == null) {
            m68542a("Could not load GMS resources!");
        }
        return vzs.m41642a(new anzs(context, i, i2, str));
    }

    public vzr newPlusOneButtonWithPopup(vzr vzr, int i, int i2, String str, String str2) {
        Context context = (Context) vzs.m41641a(vzr);
        if (m68541a(context) == null) {
            m68542a("Could not load GMS resources!");
        }
        return vzs.m41642a(new aoac(context, i, i2, str, str2));
    }

    /* renamed from: a */
    private static void m68542a(String str) {
        int i = Build.VERSION.SDK_INT;
        throw new RemoteException(str);
    }
}
