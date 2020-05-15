package p000;

import android.os.Build;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: bqqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqg {
    public bqqg() {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static final bqng m113239a(String str) {
        try {
            return new bqqf(bqwl.m113525a("android-keystore://", str));
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
