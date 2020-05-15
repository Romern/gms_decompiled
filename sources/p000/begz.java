package p000;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* renamed from: begz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begz extends behd implements bege, begd, begw {

    /* renamed from: a */
    private final FileInputStream f111551a;

    /* renamed from: b */
    private final File f111552b;

    public begz(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f111551a = fileInputStream;
        this.f111552b = file;
    }

    /* renamed from: a */
    public final Long mo36254a() {
        return Long.valueOf(this.f111551a.getChannel().size());
    }

    /* renamed from: b */
    public final FileChannel mo36255b() {
        return this.f111551a.getChannel();
    }

    /* renamed from: c */
    public final File mo60682c() {
        return this.f111552b;
    }
}
