package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: bwdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bwdb implements bwcg {

    /* renamed from: a */
    private byte[] f158880a;

    /* renamed from: b */
    private byte[] f158881b = null;

    public bwdb(byte[] bArr) {
        this.f158880a = bArr;
    }

    /* renamed from: c */
    private final synchronized void m121816c() {
        if (this.f158881b == null) {
            byte[] bArr = this.f158880a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            this.f158880a = null;
            this.f158881b = byteArrayOutputStream.toByteArray();
            this.f158880a = null;
        }
    }

    /* renamed from: a */
    public final synchronized int mo73458a() {
        m121816c();
        return this.f158881b.length;
    }

    /* renamed from: b */
    public final synchronized InputStream mo73459b() {
        m121816c();
        return new ByteArrayInputStream(this.f158881b);
    }
}
