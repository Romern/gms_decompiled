package p000;

import android.content.Context;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: anbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class anbm extends Loader {

    /* renamed from: a */
    private final ArrayList f76569a = new ArrayList();

    /* renamed from: e */
    public rkb f76570e;

    /* renamed from: f */
    public Status f76571f;

    /* renamed from: g */
    public rtp f76572g;

    protected anbm(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract rkb mo41654a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41655a(Status status, rtp rtp) {
        this.f76571f = status;
        deliverResult(rtp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11510a(rkb rkb);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anbm.a(rtp, boolean):void
     arg types: [rtp, int]
     candidates:
      anbm.a(com.google.android.gms.common.api.Status, rtp):void
      anbm.a(rtp, boolean):void */
    /* renamed from: b */
    public final void mo41658b(Status status, rtp rtp) {
        this.f76571f = status;
        mo41657a(rtp, false);
    }

    /* renamed from: c */
    public final void mo41659c() {
        int size = this.f76569a.size();
        for (int i = 0; i < size; i++) {
            ((rtp) this.f76569a.get(i)).mo12460c();
        }
        this.f76569a.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo41660d() {
        rkb rkb = this.f76570e;
        return rkb != null && rkb.mo24805i();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        super.onForceLoad();
        if (this.f76570e.mo24805i()) {
            mo11510a(this.f76570e);
        } else {
            this.f76570e.mo24801e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        rtp rtp = this.f76572g;
        if (rtp != null) {
            rtp.mo12460c();
            mo41659c();
        }
        this.f76572g = null;
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        if (this.f76570e == null) {
            rkb a = mo41654a(getContext());
            this.f76570e = a;
            a.mo24790a((rjz) new anbk(this));
            this.f76570e.mo24791a((rka) new anbl(this));
        }
        rtp rtp = this.f76572g;
        if (rtp != null) {
            deliverResult(rtp);
        }
        if (takeContentChanged() || this.f76572g == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        rkb rkb = this.f76570e;
        if (rkb != null && rkb.mo24805i()) {
            this.f76570e.mo24803g();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anbm.a(rtp, boolean):void
     arg types: [rtp, int]
     candidates:
      anbm.a(com.google.android.gms.common.api.Status, rtp):void
      anbm.a(rtp, boolean):void */
    /* renamed from: a */
    public final void deliverResult(rtp rtp) {
        mo41657a(rtp, true);
    }

    /* renamed from: a */
    public final void mo41657a(rtp rtp, boolean z) {
        if (!isReset()) {
            rtp rtp2 = this.f76572g;
            this.f76572g = rtp;
            if (isStarted()) {
                super.deliverResult(rtp);
            }
            if (rtp2 != null && rtp2 != rtp) {
                this.f76569a.add(rtp2);
                if (z) {
                    mo41659c();
                }
            }
        } else if (rtp != null && z) {
            rtp.mo12460c();
        }
    }
}
