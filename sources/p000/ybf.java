package p000;

import android.os.IInterface;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

/* renamed from: ybf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ybf extends IInterface {
    /* renamed from: a */
    void mo30340a(rnt rnt, StateUpdate stateUpdate);

    /* renamed from: a */
    void mo30341a(rnt rnt, BrowserRegisterRequestParams browserRegisterRequestParams, xxc xxc);

    /* renamed from: a */
    void mo30342a(rnt rnt, BrowserSignRequestParams browserSignRequestParams, xxf xxf);
}
