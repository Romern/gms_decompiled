package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: abvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvu implements Closeable {

    /* renamed from: a */
    public final String f58566a;

    /* renamed from: b */
    public final File f58567b;

    /* renamed from: c */
    final InputStream f58568c;

    /* renamed from: d */
    public final bxuc f58569d;

    public abvu(String str, File file) {
        this.f58566a = str;
        this.f58567b = file;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.f58568c = fileInputStream;
        this.f58569d = bxuc.m123416a(fileInputStream);
    }

    public final void close() {
        this.f58568c.close();
    }
}
