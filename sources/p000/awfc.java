package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Messenger;
import java.util.concurrent.CountDownLatch;

/* renamed from: awfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awfc extends aeaa {

    /* renamed from: a */
    final /* synthetic */ awfe f94256a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awfc(awfe awfe, String str) {
        super(str);
        this.f94256a = awfe;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        synchronized (this.f94256a) {
            awfe awfe = this.f94256a;
            awfe.f94268j = null;
            if (awfe.f94267i == null) {
                awfe.f94267i = new CountDownLatch(1);
            }
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f94256a) {
            this.f94256a.f94268j = new Messenger(iBinder);
            this.f94256a.f94267i.countDown();
            this.f94256a.f94267i = null;
        }
    }
}
