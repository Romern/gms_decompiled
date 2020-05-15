package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: bvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvx extends bwz {

    /* renamed from: a */
    public static final byte[] f5827a = {-122};

    /* renamed from: b */
    public static final bzu f5828b;

    /* renamed from: c */
    public static final int f5829c = 3;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Data 86";
        bzv.f6287b = "DPAN+Data is given in the next table";
        bzv.f6293h = f5829c;
        bzv.f6288c = f5827a;
        f5828b = bzv.mo3629a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bvx(byl byl, bxv bxv, cag cag, bzy bzy, byb byb, bvz bvz, bwz bwz) {
        super(r0.toByteArray(), f5828b);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(byl.mo3564j().mo3358e());
            byteArrayOutputStream.write(bxv.mo3564j().mo3358e());
            byteArrayOutputStream.write(cag.mo3564j().mo3358e());
            byteArrayOutputStream.write(bzy.mo3564j().mo3358e());
            byteArrayOutputStream.write(byb.mo3564j().mo3358e());
            byteArrayOutputStream.write(bvz.mo3564j().mo3358e());
            byteArrayOutputStream.write(bwz.mo3564j().mo3358e());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
