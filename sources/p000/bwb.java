package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: bwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwb extends bwz {

    /* renamed from: a */
    public static final byte[] f5847a = {-65, 80};

    /* renamed from: b */
    public static final bzu f5848b;

    /* renamed from: c */
    public static final int f5849c = 3;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "EMV Data";
        bzv.f6287b = "Full EMV Payment Data";
        bzv.f6293h = f5849c;
        bzv.f6288c = f5847a;
        f5848b = bzv.mo3629a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bwb(bxz bxz, bxp bxp, bxt bxt, bwc bwc, bzz bzz, cah cah, cai cai, caj caj) {
        super(r0.toByteArray(), f5848b);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (bxz.mo3564j().mo3358e().length + bxp.mo3564j().mo3358e().length + bxt.mo3564j().mo3358e().length + bwc.mo3564j().mo3358e().length + bzz.mo3564j().mo3358e().length + cah.mo3564j().mo3358e().length + cai.mo3564j().mo3358e().length + caj.mo3564j().mo3358e().length == 64) {
                byteArrayOutputStream.write(bxz.mo3564j().mo3358e());
                byteArrayOutputStream.write(bxp.mo3564j().mo3358e());
                byteArrayOutputStream.write(bxt.mo3564j().mo3358e());
                byteArrayOutputStream.write(bwc.mo3564j().mo3358e());
                byteArrayOutputStream.write(bzz.mo3564j().mo3358e());
                byteArrayOutputStream.write(cah.mo3564j().mo3358e());
                byteArrayOutputStream.write(cai.mo3564j().mo3358e());
                byteArrayOutputStream.write(caj.mo3564j().mo3358e());
                return;
            }
            throw new bon(bop.f5263c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
