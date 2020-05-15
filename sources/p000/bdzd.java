package p000;

import java.util.Map;

/* renamed from: bdzd */
final /* synthetic */ class bdzd implements bdzw {

    /* renamed from: a */
    private final bdzj f106670a;

    public bdzd(bdzj bdzj) {
        this.f106670a = bdzj;
    }

    /* renamed from: a */
    public final void mo58458a() {
        String str;
        bdzj bdzj = this.f106670a;
        if (bdzj.f106693h.f106713a != null) {
            Map map = bdzj.f106693h.f106713a;
            if (map != null) {
                str = (String) map.get("__phenotype_snapshot_token");
            } else {
                str = null;
            }
            anef.m64089a(bdzj.f106690e.f106636d).mo25236a(bdzj.f106691f, "", str).mo50378a(bdzj.f106690e.mo58441a(), bdzu.m91646a(new bdzi(bdzj, map)));
        }
    }
}
