package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.util.List;

/* renamed from: ajje */
public final /* synthetic */ class ajje implements Runnable {

    /* renamed from: a */
    private final NearbySharingChimeraService f70740a;

    /* renamed from: b */
    private final bqgy f70741b;

    /* renamed from: c */
    private final ajke f70742c;

    public ajje(NearbySharingChimeraService nearbySharingChimeraService, ajke ajke, bqgy bqgy) {
        this.f70740a = nearbySharingChimeraService;
        this.f70742c = ajke;
        this.f70741b = bqgy;
    }

    public final void run() {
        NearbySharingChimeraService nearbySharingChimeraService = this.f70740a;
        ajke ajke = this.f70742c;
        bqgy bqgy = this.f70741b;
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Files not ready yet, started to download attachment");
        List list = (List) ahhf.m55778c("getAttachments", bqgy, cfov.m142028D());
        if (list == null || list.isEmpty()) {
            ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Download in progress.");
            ajke.f70786c.mo44433b(ajke.f70784a, new ajub(12).mo38916a());
            List list2 = (List) ahhf.m55778c("getAttachments", bqgy, cfov.f185185a.mo6606a().mo82340aw() - cfov.m142028D());
            if (list2 == null || list2.isEmpty()) {
                ajke.f70785b.mo69136a((Throwable) new IllegalStateException("Failed to download attachments"));
                nearbySharingChimeraService.f80910v = null;
                return;
            }
            ajke.mo38720a(list2);
            nearbySharingChimeraService.f80910v = null;
            return;
        }
        ajke.mo38720a(list);
    }
}
