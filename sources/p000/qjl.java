package p000;

import android.os.Build;

/* renamed from: qjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qjl implements cayy {

    /* renamed from: a */
    private final cijl f41500a;

    public qjl(cijl cijl) {
        this.f41500a = cijl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        String str;
        Object obj;
        boolean booleanValue = ((Boolean) this.f41500a.mo6445a()).booleanValue();
        int i = Build.VERSION.SDK_INT;
        if (booleanValue) {
            try {
                str = Build.getSerial();
            } catch (SecurityException e) {
                qiv.f41486b.mo25414c("getSerial method - Security Exception %s.", e.getMessage());
            }
            if (!str.equals("unknown")) {
                obj = bmvz.f131120a;
            } else {
                obj = bmxv.m108566b(str);
            }
            cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
            return obj;
        }
        str = Build.SERIAL;
        if (!str.equals("unknown")) {
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
