package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: igx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igx {

    /* renamed from: a */
    private final Context f20987a;

    public igx(Context context) {
        this.f20987a = context;
    }

    /* renamed from: a */
    public final ihk mo13002a() {
        ihj ihj = new ihj();
        ihj.mo13014a((long) Build.VERSION.SDK_INT);
        ihj.mo13015a(this.f20987a.getPackageName());
        ihj.mo13016b();
        ihj.mo13017b("android");
        return ihj.mo13013a();
    }
}
