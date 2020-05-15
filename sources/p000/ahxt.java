package p000;

import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: ahxt */
final /* synthetic */ class ahxt implements Runnable {

    /* renamed from: a */
    private final ahye f68306a;

    /* renamed from: b */
    private final int f68307b;

    /* renamed from: c */
    private final int f68308c;

    /* renamed from: d */
    private final byte[] f68309d;

    public ahxt(ahye ahye, int i, int i2, byte[] bArr) {
        this.f68306a = ahye;
        this.f68307b = i;
        this.f68308c = i2;
        this.f68309d = bArr;
    }

    public final void run() {
        ahye ahye = this.f68306a;
        int i = this.f68307b;
        int i2 = this.f68308c;
        byte[] bArr = this.f68309d;
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(ahye.f68334d.getOutputStream());
            dataOutputStream.writeByte(i);
            dataOutputStream.writeByte(i2);
            int length = bArr.length;
            dataOutputStream.writeShort(length);
            if (length > 0) {
                dataOutputStream.write(bArr);
            }
            dataOutputStream.flush();
            ((bnsl) ahsd.f67925a.mo68390d()).mo68426a("RfcommEventStreamMedium: [%s] Send message: %d, %d, %s", ahye.f68333c.getAddress(), Integer.valueOf(i), Integer.valueOf(i2), boan.f132472f.mo68794a(bArr));
        } catch (IOException | NullPointerException e) {
            bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68426a("RfcommEventStreamMedium: [%s] Failed to send message: %d, %d, %s", ahye.f68333c.getAddress(), Integer.valueOf(i), Integer.valueOf(i2), boan.f132472f.mo68794a(bArr));
        }
    }
}
