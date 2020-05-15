package p000;

import android.content.res.AssetManager;
import java.io.File;

/* renamed from: dgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dgs extends dgr {

    /* renamed from: a */
    private final AssetManager f13081a;

    /* renamed from: b */
    private final String f13082b;

    public dgs(AssetManager assetManager, String str) {
        this.f13081a = assetManager;
        this.f13082b = str;
    }

    /* renamed from: a */
    public final String mo8971a() {
        return this.f13082b;
    }

    /* renamed from: a */
    public final String mo8972a(File file) {
        String valueOf = String.valueOf(this.f13082b);
        return dha.m8462a(this.f13081a, valueOf.length() == 0 ? new String("chimera-modules/") : "chimera-modules/".concat(valueOf), file);
    }
}
