package p000;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rlj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rlj extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final Handler f43227a = new adzt(Looper.getMainLooper());

    /* renamed from: b */
    public volatile boolean f43228b;

    /* renamed from: c */
    public final AtomicReference f43229c = new AtomicReference(null);

    /* renamed from: d */
    protected final rfi f43230d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected rlj(rnx rnx) {
        super(rnx);
        rfi rfi = rfi.f42868a;
        this.f43230d = rfi;
    }

    /* renamed from: a */
    private static final int m33924a(rlg rlg) {
        if (rlg != null) {
            return rlg.f43221a;
        }
        return -1;
    }

    /* renamed from: a */
    public void mo17722a() {
        this.f43228b = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo24843a(ConnectionResult connectionResult, int i);

    /* renamed from: b */
    public void mo17726b() {
        this.f43228b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo24844c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo24860d() {
        this.f43229c.set(null);
        mo24844c();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo24843a(new ConnectionResult(13, null), m33924a((rlg) this.f43229c.get()));
        mo24860d();
    }

    /* renamed from: b */
    public final void mo17727b(Bundle bundle) {
        rlg rlg = (rlg) this.f43229c.get();
        if (rlg != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", rlg.f43221a);
            bundle.putInt("failed_status", rlg.f43222b.f30065c);
            bundle.putParcelable("failed_resolution", rlg.f43222b.f30066d);
        }
    }

    /* renamed from: a */
    public final void mo17723a(int i, int i2, Intent intent) {
        rlg rlg = (rlg) this.f43229c.get();
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
            } else {
                int b = this.f43230d.mo24590b(mo17729f());
                if (b != 0) {
                    z = false;
                }
                if (rlg == null) {
                    return;
                }
                if (rlg.f43222b.f30065c == 18 && b == 18) {
                    return;
                }
            }
        } else if (i2 != -1) {
            if (i2 != 0) {
                z = false;
            } else if (rlg != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                rlg rlg2 = new rlg(new ConnectionResult(i3, null, rlg.f43222b.toString()), m33924a(rlg));
                this.f43229c.set(rlg2);
                rlg = rlg2;
                z = false;
            } else {
                return;
            }
        }
        if (z) {
            mo24860d();
        } else if (rlg != null) {
            mo24843a(rlg.f43222b, rlg.f43221a);
        }
    }

    /* renamed from: b */
    public final void mo24859b(ConnectionResult connectionResult, int i) {
        rlg rlg = new rlg(connectionResult, i);
        if (this.f43229c.compareAndSet(null, rlg)) {
            this.f43227a.post(new rli(this, rlg));
        }
    }

    /* renamed from: a */
    public final void mo17724a(Bundle bundle) {
        rlg rlg;
        if (bundle != null) {
            AtomicReference atomicReference = this.f43229c;
            if (bundle.getBoolean("resolving_error", false)) {
                rlg = new rlg(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                rlg = null;
            }
            atomicReference.set(rlg);
        }
    }
}
