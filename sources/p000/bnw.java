package p000;

import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;

/* renamed from: bnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnw implements DiskBasedCache.FileSupplier {

    /* renamed from: a */
    final /* synthetic */ File f5211a;

    public bnw(File file) {
        this.f5211a = file;
    }

    public final File get() {
        return this.f5211a;
    }
}
