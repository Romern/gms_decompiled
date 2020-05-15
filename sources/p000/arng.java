package p000;

import android.os.Handler;

/* renamed from: arng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arng extends ahia {

    /* renamed from: a */
    public final ahia f87958a;

    /* renamed from: b */
    private final Handler f87959b;

    public arng(Handler handler, ahia ahia) {
        this.f87959b = handler;
        this.f87958a = ahia;
    }

    /* renamed from: a */
    public final void mo20142a(String str) {
        this.f87959b.post(new arne(this, str));
    }

    /* renamed from: a */
    public final void mo20143a(String str, ahhx ahhx) {
        this.f87959b.post(new arnf(this, str, ahhx));
    }

    /* renamed from: a */
    public final void mo20144a(String str, ahhz ahhz) {
        this.f87959b.post(new arnc(this, str, ahhz));
    }

    /* renamed from: a */
    public final void mo20145a(String str, ahid ahid) {
        this.f87959b.post(new arnd(this, str, ahid));
    }
}
