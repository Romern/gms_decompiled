package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: aklw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aklw {

    /* renamed from: a */
    public final Context f72226a;

    /* renamed from: b */
    public final Handler f72227b;

    public aklw(Context context, Handler handler) {
        this.f72226a = context;
        this.f72227b = handler;
    }

    /* renamed from: b */
    private static Intent m59984b() {
        Intent intent = new Intent(cfpm.f185392a.mo6606a().mo82475k());
        intent.setPackage(cfpm.m142486b());
        return intent;
    }

    /* renamed from: a */
    public final int mo39548a(aklq aklq) {
        Context context;
        sdo.m34973b("Cannot be called from the main thread.");
        if (!this.f72226a.bindService(m59984b(), aklq, 33)) {
            return 1;
        }
        try {
            if (aklq.f72216a.await(cfpm.m142487c(), TimeUnit.MILLISECONDS)) {
                this.f72226a.unbindService(aklq);
                return 0;
            }
            context = this.f72226a;
            context.unbindService(aklq);
            return 2;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            context = this.f72226a;
        } catch (Throwable th) {
            this.f72226a.unbindService(aklq);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo39549a() {
        return this.f72226a.getPackageManager().resolveService(m59984b(), 0) != null;
    }
}
