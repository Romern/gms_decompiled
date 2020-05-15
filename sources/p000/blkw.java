package p000;

import java.io.File;

/* renamed from: blkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class blkw extends blku {

    /* renamed from: a */
    public final File f126773a;

    /* renamed from: b */
    public final long f126774b;

    public blkw(File file) {
        this.f126773a = file;
        this.f126774b = file.length();
    }

    /* renamed from: a */
    public final long mo66624a() {
        return this.f126774b;
    }
}
