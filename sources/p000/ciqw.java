package p000;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* renamed from: ciqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqw extends ahl {

    /* renamed from: b */
    private final WeakReference f191267b;

    public ciqw(ciqx ciqx) {
        this.f191267b = new WeakReference(ciqx);
    }

    /* renamed from: a */
    public final void mo707a(ahi ahi) {
        ciqx ciqx = (ciqx) this.f191267b.get();
        if (ciqx != null) {
            ciqx.mo65399a(ahi);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        ciqx ciqx = (ciqx) this.f191267b.get();
        if (ciqx != null) {
            ciqx.mo65398G();
        }
    }
}
