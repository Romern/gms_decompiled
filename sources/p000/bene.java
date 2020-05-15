package p000;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.util.concurrent.CancellationException;

/* renamed from: bene */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bene extends benf implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    private final CancellationSignal f111868a = new CancellationSignal();

    /* access modifiers changed from: protected */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    public final void mo60813a(bemj bemj) {
        boolean z;
        try {
            this.f111868a.setOnCancelListener(this);
            CancellationSignal cancellationSignal = this.f111868a;
            bemv bemv = bemj.f111828c.f111832d;
            synchronized (bemv.f111843a.f111857k) {
                int i = bemv.f111843a.f111860n;
                if (i != 0) {
                    if (i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmxy.m108602b(z, "Refcount went negative!", i);
                    bemv.f111843a.f111860n++;
                } else {
                    throw new CancellationException("database is closed");
                }
            }
            Cursor rawQueryWithFactory = bemj.f111828c.f111829a.rawQueryWithFactory(new benq(bemj.f111826a), bemj.f111827b, null, null, cancellationSignal);
            bemj.f111828c.f111832d.mo60805a();
            try {
                if (!isCancelled()) {
                    if (rawQueryWithFactory != null) {
                        rawQueryWithFactory.getCount();
                    }
                }
                if (!mo69138b(rawQueryWithFactory)) {
                    beej.m91850a(rawQueryWithFactory);
                }
            } catch (Throwable th) {
                if (!mo69138b(rawQueryWithFactory)) {
                    beej.m91850a(rawQueryWithFactory);
                }
                throw th;
            }
        } catch (OperationCanceledException e) {
            super.cancel(true);
        } catch (Throwable th2) {
            bemj.f111828c.f111832d.mo60805a();
            throw th2;
        }
    }

    public final boolean cancel(boolean z) {
        this.f111868a.cancel();
        return super.cancel(z);
    }

    public final void onCancel() {
        super.cancel(true);
    }

    public bene(bemj bemj) {
        super(bemj);
    }
}
