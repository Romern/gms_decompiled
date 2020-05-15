package p000;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgv {

    /* renamed from: a */
    protected final Map f86089a = new HashMap();

    /* renamed from: a */
    public final byte[] mo47881a(String str, long j, File file) {
        aqgu aqgu = new aqgu(str, j);
        byte[] bArr = (byte[]) this.f86089a.get(aqgu);
        if (bArr != null) {
            return bArr;
        }
        try {
            byte[] a = apuh.m71026a(file);
            this.f86089a.put(aqgu, a);
            return a;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
