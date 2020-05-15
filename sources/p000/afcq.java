package p000;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: afcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afcq {

    /* renamed from: a */
    public final ViewGroup f64183a;

    /* renamed from: b */
    public final afes f64184b;

    /* renamed from: c */
    public View f64185c;

    public afcq(ViewGroup viewGroup, afes afes) {
        sdo.m34959a(afes);
        this.f64184b = afes;
        sdo.m34959a(viewGroup);
        this.f64183a = viewGroup;
    }

    /* renamed from: a */
    public final void mo34762a(afcs afcs) {
        try {
            this.f64184b.mo34817a(new affr(afcs));
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}
