package p000;

import com.google.android.gms.fonts.FontMatchSpec;
import com.google.android.gms.fonts.service.FontsChimeraService;

/* renamed from: zza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zza extends zyd implements aaai {

    /* renamed from: a */
    private final FontsChimeraService f56235a;

    /* renamed from: b */
    private final aaag f56236b;

    /* renamed from: c */
    private final String f56237c;

    public zza(FontsChimeraService fontsChimeraService, aaag aaag, String str) {
        zyh.m46683c("FontsStub", "ctor; requestingPackage=%s", str);
        this.f56235a = fontsChimeraService;
        this.f56236b = aaag;
        this.f56237c = str;
    }

    /* renamed from: a */
    public final void mo31585a(zyc zyc, FontMatchSpec fontMatchSpec) {
        zyh.m46683c("FontsStub", "getFontFromSpec(%s)", fontMatchSpec);
        this.f56236b.mo16659a(this.f56235a, new zzc(zyc, fontMatchSpec, zzi.f56267a.mo31622a(), this.f56237c));
    }
}
