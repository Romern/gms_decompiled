package p000;

import android.os.Handler;
import com.google.android.gms.constellation.RefreshGcmTaskChimeraService;
import java.util.Map;
import java.util.UUID;

/* renamed from: syb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syb extends tdl {

    /* renamed from: a */
    final /* synthetic */ UUID f45411a;

    /* renamed from: b */
    final /* synthetic */ boolean f45412b;

    /* renamed from: c */
    final /* synthetic */ RefreshGcmTaskChimeraService f45413c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public syb(RefreshGcmTaskChimeraService refreshGcmTaskChimeraService, Handler handler, UUID uuid, boolean z) {
        super(handler);
        this.f45413c = refreshGcmTaskChimeraService;
        this.f45411a = uuid;
        this.f45412b = z;
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        int i;
        RefreshGcmTaskChimeraService refreshGcmTaskChimeraService = this.f45413c;
        Logger Logger = RefreshGcmTaskChimeraService.f30484a;
        tds tds = refreshGcmTaskChimeraService.f30485b;
        UUID uuid = this.f45411a;
        if (!this.f45412b) {
            i = 7;
        } else {
            i = 12;
        }
        tds.mo26404a(uuid, i, tdw);
        RefreshGcmTaskChimeraService.f30484a.mo25417e("Couldn't sync with the server due to ", tdw, new Object[0]);
    }

    /* renamed from: a */
    public final void mo11625a(boolean z, Map map) {
        int i;
        RefreshGcmTaskChimeraService refreshGcmTaskChimeraService = this.f45413c;
        Logger Logger = RefreshGcmTaskChimeraService.f30484a;
        tds tds = refreshGcmTaskChimeraService.f30485b;
        UUID uuid = this.f45411a;
        if (!this.f45412b) {
            i = 7;
        } else {
            i = 12;
        }
        tds.mo26405a(uuid, i, z);
        RefreshGcmTaskChimeraService.f30484a.mo25414c("Successfully completed sync", new Object[0]);
    }
}
