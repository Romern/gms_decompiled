package p000;

import android.util.Pair;
import java.io.File;

/* renamed from: baxl */
final /* synthetic */ class baxl implements aie {

    /* renamed from: a */
    private final baxn f102037a;

    /* renamed from: b */
    private final baxh f102038b;

    /* renamed from: c */
    private final File f102039c;

    /* renamed from: d */
    private final String f102040d;

    /* renamed from: e */
    private final bdch f102041e;

    public baxl(baxn baxn, baxh baxh, File file, String str, bdch bdch) {
        this.f102037a = baxn;
        this.f102038b = baxh;
        this.f102039c = file;
        this.f102040d = str;
        this.f102041e = bdch;
    }

    /* renamed from: a */
    public final Object mo753a(aic aic) {
        baxn baxn = this.f102037a;
        baxh baxh = this.f102038b;
        File file = this.f102039c;
        String str = this.f102040d;
        baxc baxc = (baxc) baxh;
        bdbv bdbv = new bdbv(baxn.f102045a, baxc.f102017b, file, str, new baxk(aic), this.f102041e);
        bdbv.f105304k = baxn.f102046b;
        if (baxf.f102030b == baxc.f102018c) {
            bdbv.mo57855a(bdbu.WIFI_OR_CELLULAR);
        } else {
            bdbv.mo57855a(bdbu.WIFI_ONLY);
        }
        int i = baxc.f102019d;
        if (i > 0) {
            bdbv.f105303j = i;
        }
        bnre i2 = baxc.f102020e.listIterator();
        while (i2.hasNext()) {
            Pair pair = (Pair) i2.next();
            bdbv.f105299f.mo67268a((String) pair.first, (String) pair.second);
        }
        baxm baxm = new baxm(baxn, file, str);
        bqfb bqfb = bqfb.INSTANCE;
        aii aii = aic.f587c;
        if (aii != null) {
            aii.mo741a(baxm, bqfb);
        }
        bdbv.mo57857c();
        String valueOf = String.valueOf(baxc.f102017b);
        return valueOf.length() == 0 ? new String("Data download scheduled for file ") : "Data download scheduled for file ".concat(valueOf);
    }
}
