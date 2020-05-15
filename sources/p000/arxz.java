package p000;

import com.google.android.gms.smartdevice.d2d.metrics.SourceLogManager;
import com.google.android.gms.smartdevice.setup.p066ui.D2DSetupChimeraActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: arxz */
public final /* synthetic */ class arxz implements Runnable {

    /* renamed from: a */
    private final SourceLogManager f88440a;

    /* renamed from: b */
    private final long f88441b;

    public arxz(SourceLogManager sourceLogManager, long j) {
        this.f88440a = sourceLogManager;
        this.f88441b = j;
    }

    public final void run() {
        SourceLogManager sourceLogManager = this.f88440a;
        long j = this.f88441b;
        Logger Logger = D2DSetupChimeraActivity.f108197b;
        qws qws = sourceLogManager.f108007e;
        if (qws != null) {
            qws.mo24336a(j, TimeUnit.MILLISECONDS);
        }
    }
}
