package p000;

import android.content.Context;

/* renamed from: zpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zpj {

    /* renamed from: a */
    public static final srn f55652a = zvt.m46581a();

    /* renamed from: b */
    public final Context f55653b;

    /* renamed from: c */
    public final yst f55654c;

    /* renamed from: d */
    private zpk f55655d;

    public zpj(Context context, yst yst) {
        this.f55654c = yst;
        bmxy.m108581a(context);
        this.f55653b = context;
    }

    /* renamed from: a */
    public final synchronized zpk mo31312a() {
        if (this.f55655d == null) {
            this.f55655d = new zpk(new shj(this.f55653b, (String) ((bmzm) rsv.f43624m).f131273a, (String) rsv.f43625n.mo25081c(), cdyo.f181926a.mo6606a().mo78463b(), cdyo.f181926a.mo6606a().mo78465d(), cdyo.m135313b(), "", 3329));
        }
        return this.f55655d;
    }
}
