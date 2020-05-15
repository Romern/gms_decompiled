package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: ckb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ckb implements cjr {

    /* renamed from: a */
    private final Resources f6973a;

    public ckb(Resources resources) {
        this.f6973a = resources;
    }

    /* renamed from: a */
    public final cjq mo3929a(cjz cjz) {
        return new cke(this.f6973a, cjz.mo3954a(Uri.class, ParcelFileDescriptor.class));
    }
}
