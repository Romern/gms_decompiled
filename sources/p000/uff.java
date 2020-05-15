package p000;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* renamed from: uff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uff {

    /* renamed from: a */
    public static final sbw f47420a = new sbw("ContentManager", "");

    /* renamed from: b */
    public final uhj f47421b;

    /* renamed from: c */
    public final uhn f47422c;

    /* renamed from: d */
    public final sqv f47423d;

    /* renamed from: e */
    public final vpa f47424e;

    public uff(uhj uhj, uhn uhn, sqv sqv, vpa vpa) {
        sdo.m34959a(uhj);
        this.f47421b = uhj;
        sdo.m34959a(uhn);
        this.f47422c = uhn;
        sdo.m34959a(sqv);
        this.f47423d = sqv;
        sdo.m34959a(vpa);
        this.f47424e = vpa;
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo27279a(String str) {
        String uuid;
        FileOutputStream fileOutputStream;
        ukp d = this.f47422c.mo27434d(str);
        FileInputStream fileInputStream = null;
        if (d == null) {
            return null;
        }
        try {
            if (d.f48034b == null) {
                uuid = UUID.randomUUID().toString();
                this.f47422c.mo27440e(uuid);
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(mo27280a(d.f48035c, 1));
                    try {
                        fileOutputStream = new FileOutputStream(mo27280a(uuid, 0));
                        try {
                            vos.m40950a(d.f48036d, fileInputStream2, fileOutputStream);
                            srz.m36171a((Closeable) fileInputStream2);
                            srz.m36171a(fileOutputStream);
                            d.mo27661a(uuid);
                            d.mo27725t();
                            this.f47422c.mo27443f(uuid);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            srz.m36171a((Closeable) fileInputStream);
                            srz.m36171a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                        fileInputStream = fileInputStream2;
                        srz.m36171a((Closeable) fileInputStream);
                        srz.m36171a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    srz.m36171a((Closeable) fileInputStream);
                    srz.m36171a(fileOutputStream);
                    throw th;
                }
            }
            d.f48037e = System.currentTimeMillis();
            d.mo27725t();
            return ParcelFileDescriptor.open(mo27280a(d.f48034b, 0), 268435456);
        } catch (vov e) {
            throw new IOException(e);
        } catch (Throwable th4) {
            this.f47422c.mo27443f(uuid);
            throw th4;
        }
    }

    /* renamed from: b */
    public final vpz mo27284b(String str) {
        ukp d = this.f47422c.mo27434d(str);
        if (d == null) {
            return null;
        }
        String str2 = d.f48034b;
        if (str2 != null) {
            return new vpz(new FileInputStream(mo27280a(str2, 0)), d.f48038f);
        }
        try {
            return new vpz(vos.m40948a(d.f48036d, new FileInputStream(mo27280a(d.f48035c, 1))), d.f48038f);
        } catch (vov e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    public final File mo27280a(String str, int i) {
        if (i == 0) {
            return new File(this.f47424e.mo28717e(), str);
        }
        File f = this.f47424e.mo28718f();
        if (f != null) {
            return new File(f, str);
        }
        throw new IOException("Cannot get path for a file on encrypted shared storage because shared storage is not available.");
    }

    /* renamed from: a */
    public final ufm mo27281a() {
        return mo27282a(536870912);
    }

    /* renamed from: a */
    public final ufm mo27282a(int i) {
        boolean z = true;
        if (!(i == 536870912 || i == 805306368)) {
            z = false;
        }
        sdo.m34975b(z, "Invalid file mode provided!");
        String uuid = UUID.randomUUID().toString();
        File a = mo27280a(uuid, 0);
        this.f47422c.mo27440e(uuid);
        if (a.createNewFile()) {
            return new ufm(this.f47421b, this.f47422c, this.f47423d, this, uuid, i);
        }
        boolean exists = a.exists();
        if (!exists) {
            this.f47422c.mo27443f(uuid);
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Failed to create a new file, exists=");
        sb.append(exists);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo27283a(ujx ujx) {
        if (!ujx.mo27577am()) {
            return false;
        }
        f47420a.mo25371b("Entry reports up-to-date content, relying on content existing");
        String q = ujx.mo27633q();
        ukp d = this.f47422c.mo27434d(q);
        if (d == null) {
            f47420a.mo25375b("Content with hash %s missing from database", q);
            return false;
        }
        try {
            String str = d.f48034b;
            if (str != null) {
                return mo27280a(str, 0).exists();
            }
            return mo27280a(d.f48035c, 1).exists();
        } catch (IOException e) {
            f47420a.mo25373b("ContentManager", String.format("Content with hash %s was deleted outside of ContentManager.", q), e);
            return false;
        }
    }
}
