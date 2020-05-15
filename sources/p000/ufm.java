package p000;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SyncFailedException;

/* renamed from: ufm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufm {

    /* renamed from: a */
    private static final sbw f47443a = new sbw("PendingContent", "");

    /* renamed from: b */
    private final uhj f47444b;

    /* renamed from: c */
    private final uhn f47445c;

    /* renamed from: d */
    private final uff f47446d;

    /* renamed from: e */
    private final String f47447e;

    /* renamed from: f */
    private final ParcelFileDescriptor f47448f;

    /* renamed from: g */
    private volatile boolean f47449g;

    /* renamed from: h */
    private volatile boolean f47450h;

    /* renamed from: i */
    private boolean f47451i = false;

    /* renamed from: j */
    private ufk f47452j;

    public ufm(uhj uhj, uhn uhn, sqv sqv, uff uff, String str, int i) {
        sdo.m34959a(uhj);
        this.f47444b = uhj;
        sdo.m34959a(uhn);
        this.f47445c = uhn;
        sdo.m34959a(sqv);
        sdo.m34959a(uff);
        this.f47446d = uff;
        sdo.m34977c(str);
        this.f47447e = str;
        this.f47448f = ParcelFileDescriptor.open(mo27298d(), i);
    }

    /* renamed from: f */
    private final synchronized ufl m38279f() {
        if (!this.f47451i) {
            ufk ufk = this.f47452j;
            if (ufk != null) {
                ufk.flush();
                ufk.close();
                return new ufl(srv.m36164d(ufk.f47439a.digest()), this.f47452j.f47440b);
            }
        }
        bobc bobc = new bobc(new FileInputStream(mo27298d()));
        try {
            return new ufl(vpc.m40992a(bobc), bobc.f132489a);
        } finally {
            srz.m36171a((Closeable) bobc);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final synchronized ParcelFileDescriptor mo27294a() {
        boolean z = false;
        if (!this.f47449g && !this.f47450h) {
            z = true;
        }
        sdo.m34971a(z, (Object) "Cannot get the file descriptor for committed or abandoned content.");
        this.f47451i = true;
        return this.f47448f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    public final synchronized ufk mo27296b() {
        boolean z = false;
        if (!this.f47449g && !this.f47450h) {
            z = true;
        }
        sdo.m34971a(z, (Object) "Cannot get an OutputStream for committed or abandoned content.");
        if (this.f47452j == null) {
            this.f47452j = new ufk(new FileOutputStream(this.f47448f.getFileDescriptor()));
        }
        return this.f47452j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r6.f47448f.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        p000.ufm.f47443a.mo25373b("PendingContent", java.lang.String.format("Ignored IOException while closing abandoned content: %s", r6.f47447e), r2);
     */
    /* renamed from: c */
    public final void mo27297c() {
        synchronized (this) {
            if (!this.f47450h && !this.f47449g) {
                this.f47450h = true;
            } else {
                return;
            }
        }
        this.f47445c.mo27443f(this.f47447e);
        try {
            mo27298d().delete();
        } catch (IOException e) {
            f47443a.mo25367a("PendingContent", String.format("Unable to delete abandoned content; will be garbage collected later: %s", this.f47447e), e);
        }
    }

    /* renamed from: d */
    public final File mo27298d() {
        return this.f47446d.mo27280a(this.f47447e, 0);
    }

    /* renamed from: e */
    public final long mo27299e() {
        return mo27298d().length();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final Object mo27295a(ufg ufg) {
        boolean z;
        String str;
        synchronized (this) {
            sdo.m34971a(!this.f47449g, (Object) "Content has already been committed.");
            sdo.m34971a(!this.f47450h, (Object) "Cannot commit content that has already been abandoned.");
            this.f47449g = true;
        }
        FileDescriptor fileDescriptor = this.f47448f.getFileDescriptor();
        if (!fileDescriptor.valid()) {
            f47443a.mo25377c("PendingContent", "File FileDescriptor invalid");
        }
        try {
            fileDescriptor.sync();
        } catch (SyncFailedException e) {
            f47443a.mo25373b("PendingContent", "Unable to sync file descriptor, ignoring as best effort", e);
        }
        this.f47448f.close();
        ufl f = m38279f();
        long e2 = mo27299e();
        if (f.f47442b != e2) {
            f47443a.mo25374b("PendingContent", "Inconsistent file length! viaHash=%d, viaLength=%d", Long.valueOf(f.f47442b), Long.valueOf(e2));
        }
        this.f47445c.mo27435d();
        try {
            ukp d = this.f47445c.mo27434d(f.f47441a);
            if (d == null) {
                uko a = ukp.m38865a(this.f47444b, f.f47441a, System.currentTimeMillis(), f.f47442b);
                a.f48027c = this.f47447e;
                new ukp(a, false).mo27725t();
            } else {
                if (d.f48038f != f.f47442b) {
                    f47443a.mo25374b("PendingContent", "Matching hash but different fileSize! viaHash=%d, inDB=%d", Long.valueOf(f.f47442b), Long.valueOf(d.f48038f));
                }
                d.f48037e = System.currentTimeMillis();
                String str2 = d.f48034b;
                if (str2 == null) {
                    d.mo27661a(this.f47447e);
                } else if (!this.f47446d.mo27280a(str2, 0).exists()) {
                    f47443a.mo25374b("PendingContent", "Content file %s was deleted outside of the content manager; using identical new file %s instead.", str2, this.f47447e);
                    d.mo27661a(this.f47447e);
                } else {
                    try {
                        z = mo27298d().delete();
                    } catch (Exception e3) {
                        z = false;
                    }
                    sbw sbw = f47443a;
                    if (!z) {
                        str = "Unable to delete redundant content; will be garbage collected later: %s";
                    } else {
                        str = "Deleted duplicate successfully: %s";
                    }
                    sbw.mo25368a("PendingContent", str, this.f47447e);
                }
                d.mo27725t();
            }
            Object a2 = ufg.mo27273a(f.f47441a);
            if (a2 != null) {
                this.f47445c.mo27442f();
            }
            return a2;
        } finally {
            this.f47445c.mo27439e();
            this.f47445c.mo27443f(this.f47447e);
        }
    }
}
