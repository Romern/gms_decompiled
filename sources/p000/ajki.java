package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;

/* renamed from: ajki */
final /* synthetic */ class ajki implements Runnable {

    /* renamed from: a */
    private final ajmt f70793a;

    /* renamed from: b */
    private final int f70794b;

    /* renamed from: c */
    private final RegisterSendSurfaceParams f70795c;

    /* renamed from: d */
    private final ajud f70796d;

    /* renamed from: e */
    private final ajsn f70797e;

    public ajki(ajmt ajmt, int i, RegisterSendSurfaceParams registerSendSurfaceParams, ajud ajud, ajsn ajsn) {
        this.f70793a = ajmt;
        this.f70794b = i;
        this.f70795c = registerSendSurfaceParams;
        this.f70796d = ajud;
        this.f70797e = ajsn;
    }

    public final void run() {
        ajmt ajmt = this.f70793a;
        int i = this.f70794b;
        RegisterSendSurfaceParams registerSendSurfaceParams = this.f70795c;
        ajud ajud = this.f70796d;
        ajsn ajsn = this.f70797e;
        if (i != 4) {
            NearbySharingChimeraService.m67474a(ajmt.f70933a, "registerSendSurface", registerSendSurfaceParams.f81114d, new ajlt(ajmt, ajud, ajsn, i));
        } else {
            NearbySharingChimeraService.m67474a(ajmt.f70933a, "registerExternalSendSurface", registerSendSurfaceParams.f81114d, new ajls(ajmt, ajud, ajsn));
        }
    }
}
