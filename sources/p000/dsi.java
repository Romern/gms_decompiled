package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: dsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dsi extends dqi {

    /* renamed from: a */
    final /* synthetic */ dsl f13937a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dsi(dsl dsl, String str, Object... objArr) {
        super(str, objArr);
        this.f13937a = dsl;
    }

    /* renamed from: a */
    public final void mo9529a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            new Object[1][0] = this.f13937a.f13940c;
            return;
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("dsi", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("[RegisterContextListenerOperation] fetchAliases failed for %s", this.f13937a.f13940c);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dsi", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[RegisterContextListenerOperation] fetchAliases failed for %s", this.f13937a.f13940c);
            return;
        }
        new Object[1][0] = this.f13937a.f13940c;
    }
}
