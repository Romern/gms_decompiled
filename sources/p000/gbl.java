package p000;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: gbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gbl extends tdl {

    /* renamed from: a */
    final /* synthetic */ gbm f17835a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gbl(gbm gbm, Handler handler) {
        super(handler);
        this.f17835a = gbm;
    }

    /* renamed from: a */
    public final void mo11623a(int i) {
        gbm gbm = this.f17835a;
        Logger Logger = gbm.f17836a;
        gbm.f17839d.mo26402a(gbm.f17840e, 57, 7);
        int i2 = i - 2;
        int i3 = 2;
        if (i2 == 1) {
            i3 = 1;
        } else if (i2 != 2) {
            i3 = 0;
        }
        gbf gbf = new gbf();
        gbm gbm2 = this.f17835a;
        gbf.f17817a = gbm2.f17838c;
        gbf.f17818b = i3;
        try {
            gbm2.f17837b.mo11626a(Status.f30107a, gbf.mo11614a());
        } catch (RemoteException e) {
            gbm.f17836a.mo25415d("Remote exception:", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo11624a(tdw tdw) {
        gbm gbm = this.f17835a;
        Logger Logger = gbm.f17836a;
        gbm.f17839d.mo26403a(gbm.f17840e, 57, 70, tdw.getMessage());
        gbf gbf = new gbf();
        gbm gbm2 = this.f17835a;
        gbf.f17817a = gbm2.f17838c;
        gbf.f17818b = 0;
        try {
            gbm2.f17837b.mo11626a(Status.f30109c, gbf.mo11614a());
        } catch (RemoteException e) {
            gbm.f17836a.mo25415d("Remote exception:", e, new Object[0]);
        }
    }
}
