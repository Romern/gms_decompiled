package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: abvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abvv implements Closeable {

    /* renamed from: a */
    final OutputStream f58570a;

    /* renamed from: b */
    final bxuk f58571b;

    /* renamed from: c */
    int f58572c;

    public abvv(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f58570a = fileOutputStream;
        this.f58571b = bxuk.m123634a(fileOutputStream);
    }

    public final void close() {
        this.f58570a.close();
    }
}
