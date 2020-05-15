package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: bhcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcl {

    /* renamed from: a */
    private final Context f118302a;

    public bhcl(Context context) {
        this.f118302a = context;
    }

    /* renamed from: a */
    public final int mo63552a(String str) {
        if ("com.google.android.gms".equals(str)) {
            return rfi.f42869b;
        }
        try {
            Bundle bundle = svr.m36484b(this.f118302a).mo26172a(str, 128).metaData;
            if (bundle != null) {
                return bundle.getInt("com.google.android.gms.version", -1);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }
}
