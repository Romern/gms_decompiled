package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;

/* renamed from: azgg */
public final /* synthetic */ class azgg implements Runnable {

    /* renamed from: a */
    private final Context f99269a;

    public azgg(Context context) {
        this.f99269a = context;
    }

    public final void run() {
        azqf a = azqf.m86130a(this.f99269a);
        try {
            bnre i = ((bngx) azbj.m85193a(a.f99879a).mo54563c().mo56338a().get()).listIterator();
            while (i.hasNext()) {
                bcoh bcoh = (bcoh) i.next();
                azbj.m85193a(a.f99879a).mo54564d().mo56308a(bcoh, 0, -1).mo57830c(new azqc(a, bcoh));
            }
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85933c("LighterUtils", "Unable to get accounts to post unread notifications", new Object[0]);
            azph.m85998a(a.f99879a).mo55126a(1711, 59);
        }
    }
}
