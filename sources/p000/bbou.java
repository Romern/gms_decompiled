package p000;

import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/* renamed from: bbou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbou {
    /* renamed from: a */
    public static bngx m88297a(byte[] bArr) {
        return bngx.m109368a((Collection) bqce.m112560a(bArr));
    }

    /* renamed from: a */
    public static byte[] m88298a(String str) {
        int i = Build.VERSION.SDK_INT;
        return str.getBytes(StandardCharsets.UTF_8);
    }
}
