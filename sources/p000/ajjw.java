package p000;

import android.content.Context;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.nio.charset.Charset;

/* renamed from: ajjw */
public final /* synthetic */ class ajjw implements Runnable {

    /* renamed from: a */
    private final NearbySharingChimeraService.C16133 f70771a;

    /* renamed from: b */
    private final Context f70772b;

    public ajjw(NearbySharingChimeraService.C16133 r1, Context context) {
        this.f70771a = r1;
        this.f70772b = context;
    }

    public final void run() {
        NearbySharingChimeraService.C16133 r0 = this.f70771a;
        Context context = this.f70772b;
        NearbySharingChimeraService nearbySharingChimeraService = NearbySharingChimeraService.this;
        boolean a = akij.m59823a(context);
        Charset charset = NearbySharingChimeraService.f80888a;
        nearbySharingChimeraService.mo44434b(a);
    }
}
