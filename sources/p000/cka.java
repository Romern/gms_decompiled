package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: cka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cka implements cjr {

    /* renamed from: a */
    private final Resources f6972a;

    public cka(Resources resources) {
        this.f6972a = resources;
    }

    /* renamed from: a */
    public final cjq mo3929a(cjz cjz) {
        return new cke(this.f6972a, cjz.mo3954a(Uri.class, AssetFileDescriptor.class));
    }
}
