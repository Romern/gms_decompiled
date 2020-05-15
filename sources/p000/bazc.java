package p000;

/* renamed from: bazc */
final /* synthetic */ class bazc implements bqeh {

    /* renamed from: a */
    private final bbav f102142a;

    /* renamed from: b */
    private final bavr f102143b;

    public bazc(bbav bbav, bavr bavr) {
        this.f102142a = bbav;
        this.f102143b = bavr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbav bbav = this.f102142a;
        bavr bavr = this.f102143b;
        bavd bavd = (bavd) obj;
        if (bavd == null) {
            return bqga.m112775a((Object) null);
        }
        bxwc bxwc = bavd.f101880j;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bauy bauy = (bauy) bxwc.get(i);
            int a = bavb.m87594a(bavd.f101876f);
            if (a == 0) {
                a = 1;
            }
            try {
                bbav.f102248e.mo56072a(bbdd.m87829a(bauy, a));
                i++;
            } catch (bbdb e) {
                bbev.m87904a("Found missing file. Logging and deleting file group.");
                bbav.f102245b.mo34980a(1062, bavd.f101873c, bavd.f101875e);
                if (ceni.f183073a.mo6606a().mo79427d()) {
                    return bqdx.m112673a(bbav.f102247d.mo56056b(bavr), bazf.f102148a, bbav.f102251h);
                }
            }
        }
        return bqga.m112775a((Object) null);
    }
}
