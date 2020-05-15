package p000;

import android.os.Build;
import java.io.IOException;
import java.util.List;

/* renamed from: adwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adwk {
    /* renamed from: a */
    public static IOException m51281a(String str, List list) {
        int i = Build.VERSION.SDK_INT;
        IOException iOException = new IOException(str);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            bqye.m113761a(iOException, (Exception) list.get(i2));
        }
        return iOException;
    }
}
