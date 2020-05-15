package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ufr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufr {

    /* renamed from: a */
    public final Map f47466a = new HashMap();

    /* renamed from: b */
    final /* synthetic */ ufu f47467b;

    public ufr(ufu ufu) {
        this.f47467b = ufu;
    }

    /* renamed from: a */
    public final uga mo27301a(Object obj, ufs ufs) {
        uga uga;
        synchronized (this.f47466a) {
            ugb ugb = (ugb) this.f47466a.get(obj);
            if (ugb == null) {
                ugb = ufs.mo27300a(new ufv(new ufq(this, obj)));
                ufu.f47470a.mo25368a("ContentDownloadManager", "Queueing new download for: %s", ugb);
                this.f47466a.put(obj, ugb);
                ufu ufu = this.f47467b;
                ((soc) ufu.f47480j).submit(new uft(ufu, ugb));
            } else {
                ufu.f47470a.mo25368a("ContentDownloadManager", "Joining existing download task for: %s", ugb);
            }
            ugb.f47495a.incrementAndGet();
            uga = new uga(ugb);
        }
        return uga;
    }
}
