package p000;

import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zym implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zyn f56196a;

    /* renamed from: b */
    private final FontMatchSpec f56197b;

    /* renamed from: c */
    private final String f56198c;

    /* renamed from: d */
    private final bqgy f56199d;

    public zym(zyn zyn, FontMatchSpec fontMatchSpec, String str, bqgy bqgy) {
        this.f56196a = zyn;
        this.f56197b = fontMatchSpec;
        this.f56198c = str;
        this.f56199d = bqgy;
    }

    public final void run() {
        zyn zyn = this.f56196a;
        zyn.mo31603a(zyn.f56209j, this.f56197b, this.f56198c, this.f56199d);
    }
}
