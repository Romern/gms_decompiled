package p000;

import java.nio.ByteBuffer;

/* renamed from: coh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class coh implements coi {
    /* renamed from: a */
    public final cgj mo4032a(cgj cgj, cdk cdk) {
        byte[] bArr;
        ByteBuffer c = ((cnu) cgj.mo3842b()).mo4010c();
        int i = cqp.f11856a;
        cqo cqo = null;
        if (!c.isReadOnly() && c.hasArray()) {
            cqo = new cqo(c.array(), c.arrayOffset(), c.limit());
        }
        if (cqo != null && cqo.f11853a == 0 && cqo.f11854b == cqo.f11855c.length) {
            bArr = c.array();
        } else {
            ByteBuffer asReadOnlyBuffer = c.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
            asReadOnlyBuffer.position(0);
            asReadOnlyBuffer.get(bArr2);
            bArr = bArr2;
        }
        return new cnj(bArr);
    }
}
