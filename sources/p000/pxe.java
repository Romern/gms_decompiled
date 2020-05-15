package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: pxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pxe {

    /* renamed from: a */
    public final /* synthetic */ pxf f40555a;

    public pxe(pxf pxf) {
        this.f40555a = pxf;
    }

    /* renamed from: a */
    public final void mo23797a(int i) {
        try {
            rnt rnt = (rnt) this.f40555a.f40556a.get();
            if (rnt == null) {
                return;
            }
            if (i == 9 || i == 11) {
                rnt.mo11797a(new Status(3002));
            } else {
                rnt.mo11797a(new Status(3003));
            }
        } catch (RemoteException e) {
        }
    }
}
