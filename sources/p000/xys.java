package p000;

import com.google.android.gms.fido.u2f.api.view.BleProcessRequestViewOptions;

/* renamed from: xys */
final /* synthetic */ class xys implements xjf {

    /* renamed from: a */
    private final xyw f53398a;

    public xys(xyw xyw) {
        this.f53398a = xyw;
    }

    /* renamed from: a */
    public final void mo29720a() {
        xyw xyw = this.f53398a;
        Logger Logger = xyx.f53412d;
        xyr xyr = (xyr) xyw;
        xyr.f53380e.mo30186a(xyr.f53376a, xag.TYPE_BLUETOOTH_TUP_NEEDED);
        if (xyr.f53386k != 4) {
            Logger logger2 = xyr.f53375l;
            Object[] objArr = new Object[1];
            int i = xyr.f53386k;
            String a = xyq.m43651a(i);
            if (i != 0) {
                objArr[0] = a;
                logger2.mo25414c(String.format("onTupNeeded: mCurrentState: %s is not PROCESSING_REQUEST", objArr), new Object[0]);
                return;
            }
            throw null;
        }
        xyr.f53375l.mo25414c("onTupNeeded", new Object[0]);
        xyr.f53379d.mo30295a(2, new BleProcessRequestViewOptions(xyr.m43652a(xyr.f53382g), true));
    }
}
