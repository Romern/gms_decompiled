package p000;

import java.util.Map;

/* renamed from: bknb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bknb extends bkoi {

    /* renamed from: a */
    final /* synthetic */ bknk f124916a;

    public bknb(bknk bknk) {
        this.f124916a = bknk;
    }

    /* renamed from: a */
    public final void mo66124a(Map map) {
        bknk bknk = this.f124916a;
        try {
            ((vgx) bknk).f49239d = new sie(((vgx) bknk).f49237b.mo27262a(((vgx) bknk).f49238c)).mo25586b(((vgx) bknk).f49238c);
        } catch (Exception e) {
            vgx.f49236a.mo25378c("AuthorizedAppOAuthToken", String.format("Failed to get OAuth token; using old token: %s", ((vgx) bknk).f49239d), e);
        }
        String str = ((vgx) bknk).f49239d;
        if (str != null) {
            map.put("access_token", str);
        }
    }
}
