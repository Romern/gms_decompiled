package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* renamed from: rkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rkv extends rkr {

    /* renamed from: a */
    private final rpa f43195a;

    /* renamed from: b */
    private final aucf f43196b;

    /* renamed from: d */
    private final rot f43197d;

    public rkv(int i, rpa rpa, aucf aucf, rot rot) {
        super(i);
        this.f43196b = aucf;
        this.f43195a = rpa;
        this.f43197d = rot;
        if (i == 2 && rpa.f43475h) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final void mo24834a(Status status) {
        this.f43196b.mo50392b(this.f43197d.mo24839a(status));
    }

    /* renamed from: b */
    public final void mo24837b(rni rni) {
        try {
            this.f43195a.mo11798a(rni.f43369b, this.f43196b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo24834a(rkx.m33899a(e2));
        } catch (RuntimeException e3) {
            mo24835a(e3);
        }
    }

    /* renamed from: a */
    public final void mo24835a(Exception exc) {
        this.f43196b.mo50392b(exc);
    }

    /* renamed from: a */
    public final void mo24836a(rmc rmc, boolean z) {
        aucf aucf = this.f43196b;
        rmc.f43272b.put(aucf, Boolean.valueOf(z));
        aucf.f91388a.mo50371a((aubq) new rmb(rmc, aucf));
    }

    /* renamed from: a */
    public final Feature[] mo24833a(rni rni) {
        return this.f43195a.mo13163a();
    }
}
