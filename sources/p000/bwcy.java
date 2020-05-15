package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;

/* renamed from: bwcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwcy extends bwdg {

    /* renamed from: f */
    private final String f158872f;

    /* renamed from: g */
    private final String f158873g;

    /* renamed from: h */
    private byte[] f158874h;

    public bwcy(String str, String str2, String str3, String str4, String str5) {
        this.f158873g = str + ',' + str2 + ',' + str3 + ',' + str4 + ",en_US";
        this.f158872f = str5;
    }

    /* renamed from: e */
    private final synchronized byte[] m121810e() {
        if (this.f158874h == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(2);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeUTF(this.f158873g);
            dataOutputStream.writeLong(0);
            dataOutputStream.writeUTF(this.f158872f);
            dataOutputStream.close();
            byteArrayOutputStream.close();
            this.f158874h = byteArrayOutputStream.toByteArray();
        }
        return this.f158874h;
    }

    /* renamed from: a */
    public final int mo73458a() {
        return m121810e().length;
    }

    /* renamed from: b */
    public final InputStream mo73459b() {
        return new ByteArrayInputStream(m121810e());
    }

    /* renamed from: d */
    public final void mo73500d() {
    }
}
