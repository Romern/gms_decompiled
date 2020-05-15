package p000;

import android.content.Context;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;

/* renamed from: boi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boi implements DiskBasedCache.FileSupplier {

    /* renamed from: a */
    final /* synthetic */ Context f5239a;

    /* renamed from: b */
    private File f5240b = null;

    public boi(Context context) {
        this.f5239a = context;
    }

    public final File get() {
        if (this.f5240b == null) {
            this.f5240b = new File(this.f5239a.getCacheDir(), "volley");
        }
        return this.f5240b;
    }
}
