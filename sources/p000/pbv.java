package p000;

import android.content.Context;

/* renamed from: pbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pbv {

    /* renamed from: a */
    private final npd f38798a;

    /* renamed from: b */
    private final pbu f38799b;

    public pbv(Context context, pbu pbu) {
        this.f38798a = npd.m27127a(context);
        this.f38799b = pbu;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: npd.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      npd.a(java.lang.String, int):int
      npd.a(java.lang.String, java.lang.String):java.lang.String
      npd.a(java.lang.String, java.util.Set):java.util.Set
      npd.a(java.lang.String, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: npd.b(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      npd.b(java.lang.String, int):void
      npd.b(java.lang.String, java.util.Set):void
      npd.b(java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo22891a(bpeb bpeb) {
        if (ccuo.f179996a.mo6606a().mo76847a() && !this.f38798a.mo21386a("frx_activation_logged", false)) {
            this.f38799b.mo22740a(bpeb, bpea.FRX_ACTIVATION);
            this.f38798a.mo21391b("frx_activation_logged", true);
        }
    }
}
