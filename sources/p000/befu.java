package p000;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: befu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befu implements behy {

    /* renamed from: a */
    private final begs f111516a;

    public befu() {
        this(new begs());
    }

    /* renamed from: a */
    public final String mo36259a() {
        return "file";
    }

    /* renamed from: a */
    public final void mo36261a(Uri uri, begn begn) {
        behx.m95075a(this);
    }

    /* renamed from: b */
    public final begs mo36263b() {
        return this.f111516a;
    }

    /* renamed from: c */
    public final OutputStream mo36265c(Uri uri) {
        File a = befs.m94980a(uri);
        bobi.m111042c(a);
        return new beha(new FileOutputStream(a), a);
    }

    /* renamed from: d */
    public final void mo36266d(Uri uri) {
        File a = befs.m94980a(uri);
        if (a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        } else if (a.delete()) {
        } else {
            if (!a.exists()) {
                throw new FileNotFoundException(String.format("%s does not exist", uri));
            } else {
                throw new IOException(String.format("%s could not be deleted", uri));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* renamed from: e */
    public final OutputStream mo36267e(Uri uri) {
        File a = befs.m94980a(uri);
        bobi.m111042c(a);
        return new beha(new FileOutputStream(a, true), a);
    }

    /* renamed from: f */
    public final void mo36268f(Uri uri) {
        File a = befs.m94980a(uri);
        if (!a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        } else if (!a.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    /* renamed from: g */
    public final boolean mo36269g(Uri uri) {
        return befs.m94980a(uri).isDirectory();
    }

    /* renamed from: h */
    public final void mo36270h(Uri uri) {
        if (!befs.m94980a(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", uri));
        }
    }

    /* renamed from: i */
    public final long mo36271i(Uri uri) {
        File a = befs.m94980a(uri);
        if (!a.isDirectory()) {
            return a.length();
        }
        return 0;
    }

    /* renamed from: j */
    public final Iterable mo36272j(Uri uri) {
        File a = befs.m94980a(uri);
        if (a.isDirectory()) {
            File[] listFiles = a.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String absolutePath = file.getAbsolutePath();
                    if (file.isDirectory() && !absolutePath.endsWith("/")) {
                        absolutePath = String.valueOf(absolutePath).concat("/");
                    }
                    befq a2 = befr.m94979a();
                    a2.mo60673b(absolutePath);
                    arrayList.add(a2.mo60670a());
                }
                return arrayList;
            }
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        throw new FileNotFoundException(String.format("%s is not a directory", uri));
    }

    /* renamed from: k */
    public final File mo36273k(Uri uri) {
        return befs.m94980a(uri);
    }

    public befu(begs begs) {
        this.f111516a = begs;
    }

    /* renamed from: a */
    public final void mo36260a(Uri uri, Uri uri2) {
        File a = befs.m94980a(uri);
        File a2 = befs.m94980a(uri2);
        bobi.m111042c(a2);
        if (!a.renameTo(a2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    /* renamed from: b */
    public final InputStream mo36264b(Uri uri) {
        File a = befs.m94980a(uri);
        return new begz(new FileInputStream(a), a);
    }

    /* renamed from: a */
    public final boolean mo36262a(Uri uri) {
        return befs.m94980a(uri).exists();
    }
}
