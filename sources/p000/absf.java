package p000;

import java.io.File;
import java.util.Iterator;

/* renamed from: absf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class absf implements Iterable {

    /* renamed from: a */
    public final File f58098a;

    /* renamed from: b */
    public final String[] f58099b;

    /* renamed from: c */
    private boolean f58100c = false;

    public absf(String[] strArr, File file) {
        this.f58099b = strArr;
        this.f58098a = file;
    }

    public final Iterator iterator() {
        if (!this.f58100c) {
            this.f58100c = true;
            return new abse(this);
        }
        throw new IllegalStateException("Already consumed this LazyFileIterable");
    }
}
