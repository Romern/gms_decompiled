package p000;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: gru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gru extends byqe {
    /* renamed from: a */
    public final Mac mo12146a(byte[] bArr) {
        Mac c = spn.m35871c("HMACSHA256");
        c.init(new SecretKeySpec(bArr, ""));
        return c;
    }
}
