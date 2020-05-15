package p000;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: azpz */
final /* synthetic */ class azpz implements Runnable {

    /* renamed from: a */
    private final List f99863a;

    /* renamed from: b */
    private final bmxj f99864b;

    public azpz(List list, bmxj bmxj) {
        this.f99863a = list;
        this.f99864b = bmxj;
    }

    public final void run() {
        List<String> list = this.f99863a;
        bmxj bmxj = this.f99864b;
        int i = azqf.f99876b;
        for (String str : list) {
            bqhi.m112839a(cfgs.f183989a.mo6606a().mo81178ag(), TimeUnit.MILLISECONDS);
            bmxj.apply(str);
        }
    }
}
