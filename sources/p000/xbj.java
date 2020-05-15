package p000;

import android.content.pm.PackageManager;
import java.nio.ByteBuffer;

/* renamed from: xbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbj {
    /* renamed from: a */
    public static bmxv m42600a(String str) {
        byte[] c = spn.m35875c(rpr.m34216b(), str, "SHA-256");
        return c != null ? bmxv.m108566b(ByteBuffer.wrap(c)) : bmvz.f131120a;
    }

    /* renamed from: b */
    public static bmxv m42601b(String str) {
        try {
            return m42600a(str);
        } catch (PackageManager.NameNotFoundException e) {
            return bmvz.f131120a;
        }
    }
}
