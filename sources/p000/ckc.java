package p000;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: ckc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ckc implements cjr {

    /* renamed from: a */
    private final Resources f6974a;

    public ckc(Resources resources) {
        this.f6974a = resources;
    }

    /* renamed from: a */
    public final cjq mo3929a(cjz cjz) {
        return new cke(this.f6974a, cjz.mo3954a(Uri.class, InputStream.class));
    }
}
