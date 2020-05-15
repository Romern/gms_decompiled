package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;

/* renamed from: ajkl */
final /* synthetic */ class ajkl implements Runnable {

    /* renamed from: a */
    private final ajmt f70803a;

    /* renamed from: b */
    private final RegisterReceiveSurfaceParams f70804b;

    /* renamed from: c */
    private final ajud f70805c;

    /* renamed from: d */
    private final int f70806d;

    public ajkl(ajmt ajmt, RegisterReceiveSurfaceParams registerReceiveSurfaceParams, ajud ajud, int i) {
        this.f70803a = ajmt;
        this.f70804b = registerReceiveSurfaceParams;
        this.f70805c = ajud;
        this.f70806d = i;
    }

    public final void run() {
        ajmt ajmt = this.f70803a;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "registerReceiveSurface", this.f70804b.f81110c, new ajlq(ajmt, this.f70805c, this.f70806d));
    }
}
