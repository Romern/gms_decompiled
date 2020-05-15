package p000;

import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ResponseData;

/* renamed from: xyt */
final /* synthetic */ class xyt implements Runnable {

    /* renamed from: a */
    private final xyv f53399a;

    /* renamed from: b */
    private final ResponseData f53400b;

    public xyt(xyv xyv, ResponseData responseData) {
        this.f53399a = xyv;
        this.f53400b = responseData;
    }

    public final void run() {
        xyv xyv = this.f53399a;
        ResponseData responseData = this.f53400b;
        xyw xyw = xyv.f53402a;
        Logger Logger = xyr.f53375l;
        Object[] objArr = new Object[2];
        objArr[0] = responseData;
        xyr xyr = (xyr) xyw;
        int i = xyr.f53386k;
        String a = xyq.m43651a(i);
        if (i != 0) {
            objArr[1] = a;
            Logger.mo25414c("onRequestProcessed, result: %s, mCurrentState: %s", objArr);
            xyr.f53377b.mo30061a(Transport.BLUETOOTH_LOW_ENERGY, responseData);
            return;
        }
        throw null;
    }
}
