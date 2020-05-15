package p000;

/* renamed from: bfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfl extends bfm {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3084b() {
        bgr bgr = bgs.f3191a;
        bia a = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_EMV_DGI"), bgt.m2993a("ISSUER_COUNTRY_CODE"), true);
        if (a == null) {
            a = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_MS_DGI"), bgt.m2993a("ISSUER_COUNTRY_CODE"), true);
        }
        bgr.mo3121a("ISSUER_COUNTRY_CODE", a.f3270h);
        bgc bgc = new bgc();
        bgc.mo3099a(true);
        bgr.mo3121a("PPSE_RESPONSE", bgc.f3168c);
    }
}
