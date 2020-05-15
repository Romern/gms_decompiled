package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: bwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwh extends bwz {

    /* renamed from: a */
    public static final byte[] f5876a = {-65, 73};

    /* renamed from: b */
    public static final bzu f5877b;

    /* renamed from: c */
    public static final int f5878c = 3;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "3D Secure Payment Data";
        bzv.f6287b = "3D Secure Payment Data";
        bzv.f6293h = f5878c;
        bzv.f6288c = f5876a;
        f5877b = bzv.mo3629a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bwh(bwg bwg) {
        super(r0.toByteArray(), f5877b);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (bwg.mo3564j().mo3358e().length == 34) {
                byteArrayOutputStream.write(bwg.mo3564j().mo3358e());
                return;
            }
            throw new bon(bop.f5263c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
