package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: aumg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumg extends AsyncTaskLoader {

    /* renamed from: a */
    public final Bundle f92075a;

    /* renamed from: b */
    private final int f92076b;

    /* renamed from: c */
    private final Object f92077c;

    /* renamed from: d */
    private final bmzi f92078d = bmzn.m108681a(aumd.f92070a);

    /* renamed from: e */
    private aumf f92079e;

    public aumg(Context context, int i, Bundle bundle) {
        super(context);
        this.f92076b = i;
        sdo.m34959a(bundle);
        this.f92075a = bundle;
        this.f92077c = new Object();
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Status status;
        if (((Boolean) this.f92078d.mo6606a()).booleanValue()) {
            try {
                return new aume(Status.f30107a, (Bundle) aucu.m76782a(aula.m77250b(getContext()).mo24675a(this.f92076b, this.f92075a)));
            } catch (InterruptedException | ExecutionException e) {
                if (e.getClass().equals(InterruptedException.class)) {
                    status = Status.f30108b;
                } else {
                    status = Status.f30109c;
                }
                return new aume(status, null);
            }
        } else {
            rjy rjy = new rjy(getContext());
            rjy.mo24779a(aula.f92019b);
            rkb b = rjy.mo24784b();
            ConnectionResult f = b.mo24802f();
            if (!f.mo17671b()) {
                return new aume(new Status(f.f30065c), null);
            }
            rke a = aupy.m77595a(b, this.f92076b, this.f92075a);
            synchronized (this.f92077c) {
                this.f92079e = new aumf(a);
            }
            aupr aupr = (aupr) a.mo9455a();
            synchronized (this.f92077c) {
                this.f92079e.f92074b = aupr;
            }
            b.mo24803g();
            if (a.mo9461c()) {
                return null;
            }
            return new aume(aupr.f92286a, aupr.f92287b);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onCancelLoad() {
        synchronized (this.f92077c) {
            aumf aumf = this.f92079e;
            if (aumf != null) {
                aumf.f92073a.mo9460b();
            }
        }
        return super.onCancelLoad();
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        onCancelLoad();
        super.onReset();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        synchronized (this.f92077c) {
            aumf aumf = this.f92079e;
            if (aumf == null || aumf.f92074b == null || aumf.f92073a.mo9461c()) {
                forceLoad();
            } else {
                aupr aupr = this.f92079e.f92074b;
                deliverResult(new aume(aupr.f92286a, aupr.f92287b));
            }
        }
        super.onStartLoading();
    }
}
