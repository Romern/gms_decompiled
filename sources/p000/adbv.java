package p000;

import android.util.Base64;
import java.util.Random;

/* renamed from: adbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adbv {

    /* renamed from: a */
    private static final Random f61358a = new Random();

    /* renamed from: a */
    public static String m50143a() {
        byte[] bArr = new byte[16];
        f61358a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
