package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;

/* renamed from: qlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qlr extends ContextWrapper {

    /* renamed from: a */
    private final Context f41669a;

    /* renamed from: b */
    private final qlr f41670b;

    private qlr(Context context, Context context2, qlr qlr) {
        super(context);
        this.f41669a = context2;
        this.f41670b = qlr;
    }

    /* renamed from: a */
    private final qlr m32401a() {
        qlr qlr = this.f41670b;
        return qlr != null ? qlr : this;
    }

    public final Context createCredentialProtectedStorageContext() {
        return new qlr(super.createCredentialProtectedStorageContext(), this.f41669a.createCredentialProtectedStorageContext(), m32401a());
    }

    public final Context createDeviceProtectedStorageContext() {
        return new qlr(super.createDeviceProtectedStorageContext(), this.f41669a.createDeviceProtectedStorageContext(), m32401a());
    }

    public final Context getApplicationContext() {
        return m32401a();
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.f41669a.getApplicationInfo();
    }

    public final File getDir(String str, int i) {
        if ("chimera".equals(str)) {
            return this.f41669a.getDir(str, i);
        }
        return super.getDir(str, i);
    }

    public final String getPackageName() {
        return this.f41669a.getPackageName();
    }

    /* renamed from: a */
    public static qlr m32402a(Context context) {
        qlr qlr = null;
        try {
            Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext == null || applicationContext == context)) {
                qlr = new qlr(applicationContext, createPackageContext, null);
            }
            return new qlr(context, createPackageContext, qlr);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("DynamiteCtx", valueOf.length() == 0 ? new String("Couldn't get GmsCore context: ") : "Couldn't get GmsCore context: ".concat(valueOf));
            return null;
        }
    }
}
