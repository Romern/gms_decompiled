package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: nba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nba implements ncf {

    /* renamed from: a */
    private final File f35164a;

    /* renamed from: b */
    private final MessageDigest f35165b;

    /* renamed from: c */
    private FileOutputStream f35166c;

    /* renamed from: d */
    private boolean f35167d;

    /* renamed from: e */
    private byte[] f35168e;

    public nba(File file) {
        this.f35164a = file;
        try {
            this.f35165b = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new lwh("Unable to use SHA-256", e);
        }
    }

    /* renamed from: a */
    public final void mo20426a(byte[] bArr, int i) {
        bmxy.m108601b(this.f35166c != null, "Must open before processing chunks");
        this.f35166c.write(bArr, 0, i);
        this.f35165b.update(bArr, 0, i);
    }

    /* renamed from: b */
    public final void mo20428b() {
        bmxy.m108601b(this.f35166c == null, "Cannot open twice");
        this.f35166c = new FileOutputStream(this.f35164a);
    }

    public final void close() {
        this.f35166c.close();
        this.f35167d = true;
    }

    /* renamed from: a */
    public final byte[] mo20427a() {
        bmxy.m108601b(this.f35167d, "Must close before getting digest");
        if (this.f35168e == null) {
            this.f35168e = this.f35165b.digest();
        }
        return this.f35168e;
    }
}
