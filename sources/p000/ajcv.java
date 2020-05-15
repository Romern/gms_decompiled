package p000;

import android.os.IBinder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: ajcv */
final /* synthetic */ class ajcv implements ajdf {

    /* renamed from: a */
    private final rod f70365a;

    public ajcv(rod rod) {
        this.f70365a = rod;
    }

    /* renamed from: a */
    public final void mo38504a(ajct ajct, rod rod) {
        rod rod2 = this.f70365a;
        int i = ajdi.f70382b;
        rob rob = rod2.f43429b;
        if (rob != null) {
            ajcf ajcf = new ajcf(rod);
            if (ajct.f70358a.mo38536a(rob)) {
                ((ajcj) ajct.mo25289B()).mo38488a(new UnsubscribeRequest((IBinder) ajct.f70358a.mo38537b(rob), ajcf, null));
                ajct.f70358a.f70409a.remove(rob);
                return;
            }
            ajcf.mo38481a(new Status(0));
        }
    }
}
