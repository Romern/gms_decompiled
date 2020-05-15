package p000;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: ncj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ncj implements mzc {

    /* renamed from: a */
    private final ncp f35270a;

    /* renamed from: b */
    private final ncb f35271b;

    /* renamed from: c */
    private final File f35272c;

    /* renamed from: d */
    private final File f35273d;

    /* renamed from: e */
    private InputStream f35274e;

    public ncj(File file, mze mze, ncb ncb) {
        bmxy.m108589a(file.isDirectory(), "Temporary folder must be existing directory");
        this.f35272c = new File(file, "encrypted_restore");
        this.f35273d = new File(file, "decrypted_restore");
        this.f35270a = new ncp(mze);
        this.f35271b = ncb;
    }

    /* renamed from: a */
    public final int mo20345a(byte[] bArr) {
        if (this.f35274e == null) {
            this.f35270a.mo20455a(this.f35272c);
            this.f35271b.mo20448a(this.f35272c, new nba(this.f35273d));
            this.f35272c.delete();
            this.f35274e = new BufferedInputStream(new FileInputStream(this.f35273d));
        }
        return this.f35274e.read(bArr);
    }

    /* renamed from: a */
    public final void mo20346a(int i) {
        srz.m36171a((Closeable) this.f35274e);
        this.f35272c.delete();
        this.f35273d.delete();
    }
}
