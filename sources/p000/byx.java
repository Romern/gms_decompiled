package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: byx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class byx extends bys implements bxi {

    /* renamed from: f */
    public bpl f6231f = null;

    public byx(bze bze, byte[] bArr, bzc bzc) {
        super(bze, bArr, bzc);
        this.f6231f = bpk.m3439b(bArr);
    }

    /* renamed from: a */
    public final boolean mo3615a(bpo bpo) {
        return bxk.m3776c(this.f6231f, bpo);
    }

    /* renamed from: b */
    public final boolean mo3583b(byte[] bArr) {
        return bxk.m3774b(this.f6231f, bArr);
    }

    /* renamed from: c */
    public final byte[] mo3619c(bpo bpo) {
        return bxk.m3772a(this.f6231f, bpo);
    }

    /* renamed from: j */
    public final byte[] mo3616j() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.f6228d.mo3622a());
            byte[] a = this.f6231f.mo3368a();
            byteArrayOutputStream.write(bys.m3810a(a.length));
            byteArrayOutputStream.write(a);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    public final byte[] mo3617k() {
        return this.f6231f.mo3368a();
    }

    public final String toString() {
        return this.f6231f.toString();
    }

    /* renamed from: a */
    public final byte[] mo3582a(byte[] bArr) {
        byte[] a = bxk.m3773a(this.f6231f, bArr);
        if (a != null) {
            return a;
        }
        String valueOf = String.valueOf(cbm.m3893a(bArr));
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No such tag ") : "No such tag ".concat(valueOf));
    }

    /* renamed from: b */
    public final byte[] mo3618b(bpo bpo) {
        return bxk.m3775b(this.f6231f, bpo);
    }
}
