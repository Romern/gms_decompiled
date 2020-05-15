package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: bol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bol implements Serializable {

    /* renamed from: a */
    public byte[] f5254a;

    static {
        cbm.m3895a(bom.f5255a.f5256b, false);
    }

    public bol() {
    }

    /* renamed from: a */
    public final byte[] mo3339a() {
        byte[] bArr = this.f5254a;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public final String toString() {
        return cbm.m3895a(this.f5254a, false);
    }

    public bol(byte[] bArr) {
        this.f5254a = bArr;
    }

    public bol(byte[] bArr, byte[] bArr2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(bArr2);
            this.f5254a = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
