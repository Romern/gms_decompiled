package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: men */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class men {

    /* renamed from: a */
    public final File f33520a;

    /* renamed from: b */
    public final meo f33521b;

    /* renamed from: c */
    private final InputStream f33522c;

    /* renamed from: d */
    private final FileOutputStream f33523d;

    public men(File file, InputStream inputStream) {
        this.f33520a = file;
        this.f33522c = inputStream;
        this.f33523d = new FileOutputStream(file);
        this.f33521b = new meo(inputStream, this.f33523d);
    }

    /* renamed from: a */
    public final void mo19881a() {
        srz.m36171a((Closeable) this.f33522c);
        srz.m36171a(this.f33523d);
    }
}
