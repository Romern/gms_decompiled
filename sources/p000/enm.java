package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: enm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class enm extends FilterOutputStream {

    /* renamed from: a */
    public final MessageDigest f15327a;

    /* renamed from: b */
    public long f15328b;

    /* renamed from: c */
    private final OutputStream f15329c;

    public enm(OutputStream outputStream) {
        super(outputStream);
        this.f15329c = outputStream;
        try {
            this.f15327a = MessageDigest.getInstance("SHA-256");
            this.f15328b = 0;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final void write(int i) {
        this.f15327a.update((byte) i);
        this.f15328b++;
        this.f15329c.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f15327a.update(bArr, i, i2);
        this.f15328b += (long) i2;
        this.f15329c.write(bArr, i, i2);
    }
}
