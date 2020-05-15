package p000;

import android.content.Context;
import android.os.RemoteException;
import java.io.Closeable;

/* renamed from: vsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vsj implements Closeable {

    /* renamed from: a */
    public final vsi f49905a;

    public vsj(Context context) {
        vuk.m41322a();
        vsi f = vuk.m41327f(context);
        this.f49905a = f;
        if (!f.mo28796l()) {
            throw new RemoteException("Unable to synchronously connect to the Driving Mode Manager");
        }
    }

    public final void close() {
        this.f49905a.mo28798n();
    }
}
