package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

/* renamed from: ybd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ybd extends dcj implements ybf {
    public ybd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
    }

    /* renamed from: a */
    public final void mo30340a(rnt rnt, StateUpdate stateUpdate) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, stateUpdate);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo30341a(rnt rnt, BrowserRegisterRequestParams browserRegisterRequestParams, xxc xxc) {
        throw null;
    }

    /* renamed from: a */
    public final void mo30342a(rnt rnt, BrowserSignRequestParams browserSignRequestParams, xxf xxf) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, browserSignRequestParams);
        dcl.m8164a(bj, xxf);
        mo8528b(1, bj);
    }
}
