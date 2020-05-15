package p000;

import android.os.Build;
import android.os.StrictMode;

/* renamed from: bdoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdoo implements cayy {

    /* renamed from: a */
    private final cijl f106157a;

    public bdoo(cijl cijl) {
        this.f106157a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bmxv b = ((bdfq) this.f106157a).mo6445a();
        int i = Build.VERSION.SDK_INT;
        if (StrictMode.ThreadPolicy.LAX.equals(StrictMode.getThreadPolicy()) && StrictMode.VmPolicy.LAX.equals(StrictMode.getVmPolicy()) && b.mo66813a()) {
            bmxv bmxv = ((bdht) b.mo66814b()).f105674b;
        }
        bnon bnon = bnon.f131923a;
        cazf.m127593a(bnon, "Cannot return null from a non-@Nullable @Provides method");
        return bnon;
    }
}
