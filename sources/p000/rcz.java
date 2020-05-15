package p000;

import java.io.File;
import java.util.Iterator;

/* renamed from: rcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rcz implements Iterable {

    /* renamed from: a */
    public final File f42687a;

    /* renamed from: b */
    public final String[] f42688b;

    /* renamed from: c */
    private boolean f42689c = false;

    private rcz(String[] strArr, File file) {
        this.f42688b = strArr;
        this.f42687a = file;
    }

    /* renamed from: a */
    static rcz m33351a(File file) {
        return new rcz(file.list(), file);
    }

    public final Iterator iterator() {
        if (!this.f42689c) {
            this.f42689c = true;
            return new rcy(this);
        }
        throw new IllegalStateException("Already consumed this FileIterable");
    }
}
