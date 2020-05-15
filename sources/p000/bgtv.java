package p000;

import android.content.Context;

/* renamed from: bgtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgtv {

    /* renamed from: a */
    public final Context f117530a;

    /* renamed from: b */
    public bgty f117531b;

    /* renamed from: c */
    public final C1245ok f117532c = new C1245ok();

    public bgtv(Context context) {
        sdo.m34959a(context);
        this.f117530a = context;
    }

    /* renamed from: a */
    public final void mo63166a() {
        mo63167b();
        mo63168c();
    }

    /* renamed from: b */
    public final void mo63167b() {
        bgty bgty = this.f117531b;
        if (bgty != null) {
            bgty.mo63170b();
            this.f117531b = null;
        }
    }

    /* renamed from: c */
    public final void mo63168c() {
        int i = 0;
        while (true) {
            C1245ok okVar = this.f117532c;
            if (i < okVar.f26809h) {
                ((bgty) okVar.mo15621c(i)).mo63170b();
                i++;
            } else {
                okVar.clear();
                return;
            }
        }
    }
}
