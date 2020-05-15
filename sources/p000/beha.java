package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: beha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beha extends behe implements bege, begd, begx {

    /* renamed from: a */
    private final FileOutputStream f111553a;

    /* renamed from: b */
    private final File f111554b;

    public beha(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f111553a = fileOutputStream;
        this.f111554b = file;
    }

    /* renamed from: a */
    public final void mo36257a() {
        this.f111553a.getFD().sync();
    }

    /* renamed from: b */
    public final FileChannel mo36255b() {
        return this.f111553a.getChannel();
    }

    /* renamed from: c */
    public final File mo60682c() {
        return this.f111554b;
    }
}
