package p000;

import android.content.Context;
import android.location.GnssStatus;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: bhbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhbu extends bhbs {

    /* renamed from: e */
    protected final GnssStatus.Callback f118276e = new bhbt(this);

    public bhbu(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63536a(Executor executor) {
        if (Looper.myLooper() != null) {
            this.f118271a.registerGnssStatusCallback(this.f118276e);
        } else {
            this.f118271a.registerGnssStatusCallback(this.f118276e, new adzt(Looper.getMainLooper()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63538b() {
        this.f118271a.unregisterGnssStatusCallback(this.f118276e);
    }
}
