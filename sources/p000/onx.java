package p000;

import android.os.Bundle;

/* renamed from: onx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class onx {

    /* renamed from: a */
    static final onx f38055a = m29277i().mo22369a();

    /* renamed from: a */
    public static onx m29276a(Bundle bundle) {
        boolean z = bundle.getBoolean("connected");
        boolean z2 = bundle.getBoolean("configured");
        onw i = m29277i();
        i.mo22370a(z2);
        i.mo22371b(z);
        i.mo22372c(bundle.getBoolean("unlocked"));
        if (z && z2) {
            i.mo22373d(bundle.getBoolean("accessory"));
            i.mo22374e(bundle.getBoolean("adb"));
            i.mo22375f(bundle.getBoolean("audio_source"));
            i.mo22376g(bundle.getBoolean("mtp"));
            i.mo22377h(bundle.getBoolean("ptp"));
        }
        return i.mo22369a();
    }

    /* renamed from: i */
    static onw m29277i() {
        onw onw = new onw();
        onw.mo22371b(false);
        onw.mo22370a(false);
        onw.mo22372c(false);
        onw.mo22373d(false);
        onw.mo22374e(false);
        onw.mo22375f(false);
        onw.mo22376g(false);
        onw.mo22377h(false);
        return onw;
    }

    /* renamed from: a */
    public abstract boolean mo22331a();

    /* renamed from: b */
    public abstract boolean mo22332b();

    /* renamed from: c */
    public abstract boolean mo22333c();

    /* renamed from: d */
    public abstract boolean mo22334d();

    /* renamed from: e */
    public abstract boolean mo22335e();

    /* renamed from: f */
    public abstract boolean mo22337f();

    /* renamed from: g */
    public abstract boolean mo22338g();

    /* renamed from: h */
    public abstract boolean mo22339h();
}
