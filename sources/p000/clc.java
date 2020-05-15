package p000;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* renamed from: clc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class clc implements cjr {

    /* renamed from: a */
    private final Context f7000a;

    /* renamed from: b */
    private final Class f7001b;

    public clc(Context context, Class cls) {
        this.f7000a = context;
        this.f7001b = cls;
    }

    /* renamed from: a */
    public final cjq mo3929a(cjz cjz) {
        return new cle(this.f7000a, cjz.mo3954a(File.class, this.f7001b), cjz.mo3954a(Uri.class, this.f7001b), this.f7001b);
    }
}
