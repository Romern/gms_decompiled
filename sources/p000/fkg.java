package p000;

import java.util.concurrent.Callable;

/* renamed from: fkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fkg implements Callable {

    /* renamed from: a */
    final /* synthetic */ fkh f16777a;

    public fkg(fkh fkh) {
        this.f16777a = fkh;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        flb flb = this.f16777a.f16778a;
        fje.m11804a();
        flb.mo10954t();
        flb.mo10937e("Sync dispatching local hits");
        long j = flb.f16841h;
        flb.mo10943h();
        try {
            flb.mo10997w();
            flb.mo10949n().mo11052d();
            flb.mo10994c();
            if (flb.f16841h == j) {
                return null;
            }
            flb.f16837c.mo11033c();
            return null;
        } catch (Exception e) {
            flb.mo10938e("Sync local dispatch failed", e);
            flb.mo10994c();
            return null;
        }
    }
}
