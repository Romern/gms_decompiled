package p000;

import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: fgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgt {

    /* renamed from: a */
    public final C1231nx f16524a;

    /* renamed from: b */
    public final DiskBasedCache f16525b;

    /* renamed from: c */
    private final ImageLoader f16526c;

    public fgt(ImageLoader imageLoader, C1231nx nxVar, DiskBasedCache diskBasedCache) {
        this.f16526c = imageLoader;
        this.f16524a = nxVar;
        this.f16525b = diskBasedCache;
    }

    /* renamed from: a */
    public final void mo10805a(String str, fgn fgn) {
        this.f16526c.get(str, new fgs(fgn));
    }
}
