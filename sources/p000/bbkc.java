package p000;

import java.util.concurrent.CancellationException;

/* renamed from: bbkc */
final /* synthetic */ class bbkc implements bqeh {

    /* renamed from: a */
    private final bbkh f102801a;

    /* renamed from: b */
    private final String f102802b;

    public bbkc(bbkh bbkh, String str) {
        this.f102801a = bbkh;
        this.f102802b = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg a;
        bbkh bbkh = this.f102801a;
        String str = this.f102802b;
        if (!((Boolean) obj).booleanValue()) {
            return bqga.m112777a((Throwable) new Exception("Failed to add file group!"));
        }
        bbkg bbkg = new bbkg();
        bavw bavw = bbkh.f102810b;
        baur baur = new baur(null);
        baur.f101837g = 0;
        baur.f101832b = bmxv.m108566b(bbkh.f102809a);
        String a2 = bbkh.m88124a(str);
        if (a2 != null) {
            baur.f101831a = a2;
            bxvd da = baul.f101779d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            baul baul = (baul) da.f164949b;
            baul.f101783c = 1;
            int i = baul.f101781a | 2;
            baul.f101781a = i;
            baul.f101782b = 2;
            baul.f101781a = i | 1;
            baur.f101835e = bmxv.m108566b((baul) da.mo74062i());
            baur.f101836f = bmxv.m108566b(new bbke(bbkg));
            String str2 = baur.f101831a == null ? " groupName" : "";
            if (baur.f101837g == null) {
                str2 = str2.concat(" groupSizeBytes");
            }
            if (!str2.isEmpty()) {
                String valueOf = String.valueOf(str2);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            bqgg a3 = bavw.mo55994a(new bauc(baur.f101831a, baur.f101832b, baur.f101833c, baur.f101834d, baur.f101835e, baur.f101836f, baur.f101837g.intValue()));
            synchronized (bbkg.f102806a) {
                bbkg.f102808c = a3;
                if (bbkg.f102807b) {
                    a3.cancel(true);
                }
            }
            synchronized (bbkg.f102806a) {
                bmxy.m108581a(bbkg.f102808c);
                a = bqdf.m112620a(bbkg.f102808c, CancellationException.class, new bbkf(bbkg), bqfb.INSTANCE);
            }
            return a;
        }
        throw new NullPointerException("Null groupName");
    }
}
