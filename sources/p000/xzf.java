package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import java.lang.ref.WeakReference;

/* renamed from: xzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xzf extends adzt {

    /* renamed from: a */
    private final WeakReference f53426a;

    public xzf(xzg xzg) {
        super(Looper.getMainLooper());
        this.f53426a = new WeakReference(xzg);
    }

    public final void handleMessage(Message message) {
        xzg xzg = (xzg) this.f53426a.get();
        if (xzg != null) {
            xzg.f53433f.mo30295a(3, (NfcViewOptions) message.obj);
        }
    }
}
