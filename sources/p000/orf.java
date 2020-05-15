package p000;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import java.io.Closeable;

/* renamed from: orf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class orf extends ord implements Closeable {
    public orf(Context context) {
        super(context);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                mo22533a();
                this.f38270b.mo22642a();
            } catch (RemoteException e) {
                mo22534b();
                throw new ore(e.getMessage());
            }
        } else {
            throw new ore("Cannot instantiate on main thread");
        }
    }

    public final void close() {
        try {
            this.f38270b.mo22647c();
        } catch (RemoteException e) {
        }
        mo22534b();
    }
}
