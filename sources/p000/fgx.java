package p000;

import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;

/* renamed from: fgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgx implements cayy {

    /* renamed from: a */
    private final cijl f16530a;

    public fgx(cijl cijl) {
        this.f16530a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        DiskBasedCache diskBasedCache = new DiskBasedCache(new File(((epb) this.f16530a).mo6445a().getCacheDir(), "mg_volley"), 10485760);
        cazf.m127593a(diskBasedCache, "Cannot return null from a non-@Nullable @Provides method");
        return diskBasedCache;
    }
}
