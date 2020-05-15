package p000;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

/* renamed from: blku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class blku implements Closeable {
    /* renamed from: a */
    public static blku m107310a(File file) {
        return new blky(file);
    }

    /* renamed from: a */
    public abstract long mo66624a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract InputStream mo66625a(long j, long j2);

    /* renamed from: b */
    public final synchronized InputStream mo66626b() {
        return mo66625a(0, mo66624a());
    }
}
