package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: cna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cna implements cdi {

    /* renamed from: a */
    private final ByteBuffer f7096a = ByteBuffer.allocate(4);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3735a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.f7096a) {
                this.f7096a.position(0);
                messageDigest.update(this.f7096a.putInt(num.intValue()).array());
            }
        }
    }
}
