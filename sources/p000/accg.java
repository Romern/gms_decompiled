package p000;

import android.content.Context;
import java.io.File;

/* renamed from: accg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class accg implements cayy {

    /* renamed from: a */
    private final cijl f59561a;

    public accg(cijl cijl) {
        this.f59561a = cijl;
    }

    /* renamed from: b */
    public final File mo6445a() {
        File file = new File(((Context) this.f59561a.mo6445a()).getFilesDir(), "mdh");
        cazf.m127593a(file, "Cannot return null from a non-@Nullable @Provides method");
        return file;
    }
}
