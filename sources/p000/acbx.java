package p000;

import android.content.Context;
import android.os.Looper;

/* renamed from: acbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbx implements cayy {

    /* renamed from: a */
    private final cijl f59553a;

    /* renamed from: b */
    private final cijl f59554b;

    public acbx(cijl cijl, cijl cijl2) {
        this.f59553a = cijl;
        this.f59554b = cijl2;
    }

    /* renamed from: b */
    public final baso mo6445a() {
        Context context = (Context) this.f59553a.mo6445a();
        bqgj bqgj = (bqgj) this.f59554b.mo6445a();
        basl basl = new basl(afky.m53215a(context), bqgj);
        adzt adzt = new adzt(Looper.getMainLooper());
        adzt.getClass();
        afkw afkw = new afkw(adzt);
        adzt.getClass();
        baso baso = new baso(basl, new aflo(context, afkw, new afkx(adzt)), context.getApplicationContext(), bqgj);
        cazf.m127593a(baso, "Cannot return null from a non-@Nullable @Provides method");
        return baso;
    }
}
