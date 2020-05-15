package p000;

import android.os.Binder;
import android.os.Parcel;
import java.io.Closeable;

/* renamed from: dfr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dfr extends Binder implements Closeable {

    /* renamed from: a */
    private volatile Binder f13019a;

    public dfr(Binder binder, String str) {
        this.f13019a = binder;
        attachInterface(binder.queryLocalInterface(str), str);
    }

    public final void close() {
        this.f13019a = null;
        attachInterface(null, "");
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Binder binder = this.f13019a;
        if (binder != null) {
            return binder.transact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        parcel2.writeException(new IllegalStateException("IBinder used after unbindService"));
        return false;
    }
}
