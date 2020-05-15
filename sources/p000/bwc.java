package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: bwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwc extends bxs {

    /* renamed from: a */
    public static final bzu f5850a;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Issuer Application Data";
        bzv.f6287b = "Contains proprietary application data for transmission to the Issuer in an online transaction.";
        bzv.f6293h = bxs.f6025d;
        bzv.f6294i = bxs.f6026e;
        bzv.f6290e = bxs.f6024c;
        bzv.f6288c = bxs.f6023b;
        bzv.f6291f = 32;
        bzv.f6295j = bxs.f6027f;
        bzv.f6296k = bxs.f6028g;
        bzv.f6298m = bxs.f6029h;
        f5850a = bzv.mo3629a();
    }

    /* renamed from: c */
    public final bya mo3455c() {
        throw new bon(bop.f5263c);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bwz mo3456d() {
        byte[] bArr = new byte[4];
        System.arraycopy(mo3563i(), 3, bArr, 0, 4);
        return new buj(bArr);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bwc(bye bye, bvw bvw, buj buj, buh buh, bui bui, bul bul, bud bud) {
        super(r0.toByteArray(), f5850a);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(16);
            byteArrayOutputStream.write(bye.mo3563i());
            byteArrayOutputStream.write(bvw.mo3563i()[0]);
            byteArrayOutputStream.write(buj.mo3563i().length);
            byteArrayOutputStream.write(buj.mo3563i());
            byteArrayOutputStream.write(buh.mo3563i());
            byteArrayOutputStream.write(bui.mo3563i());
            byteArrayOutputStream.write(bul.mo3563i());
            byteArrayOutputStream.write(bud.mo3563i());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public bwc(byte[] bArr) {
        super(bArr, f5850a);
    }
}
