package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;

/* renamed from: xgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xgh implements bqfp {

    /* renamed from: a */
    final /* synthetic */ xgi f52187a;

    /* renamed from: b */
    private final bqgg f52188b;

    public xgh(xgi xgi, bqgg bqgg) {
        this.f52187a = xgi;
        this.f52188b = bqgg;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        int intValue = ((Integer) obj).intValue();
        xgj xgj = null;
        if (intValue == 0) {
            xgj = xgk.m42883a();
        } else if (intValue == 1) {
            xgi xgi = this.f52187a;
            xgj = xgl.m42884a(xgi.f52189a, xgi.f52194f, xgi.f52195g);
        } else if (intValue != 2) {
            if (intValue != 3) {
                if (intValue != 4) {
                    String valueOf = String.valueOf(this.f52187a.f52196h);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                    sb.append("Unknown state selected in BleTransportController: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            } else if (this.f52187a.f52197i.mo29718c().intValue() == 2) {
                bmxv bmxv = ((xgg) this.f52187a.f52197i).f52181g;
                if (bmxv.mo66813a()) {
                    xgi xgi2 = this.f52187a;
                    Context context = xgi2.f52189a;
                    xwj xwj = xgi2.f52190b;
                    RequestOptions requestOptions = xgi2.f52191c;
                    xoo xoo = xgi2.f52194f;
                    xhi xhi = xgi2.f52195g;
                    xgj = new xgf(context, xwj, requestOptions, xgi2.f52193e, xgi2.f52192d, xoo, xhi, (BluetoothDevice) bmxv.mo66814b(), new xgm(context));
                }
            }
            if (this.f52187a.f52197i.mo29718c().intValue() == 3) {
                xgi xgi3 = this.f52187a;
                xgi3.f52196h.mo69138b((PublicKeyCredential) ((bmyg) ((xgf) xgi3.f52197i).f52172j).f131198a);
            }
            if (!this.f52187a.f52196h.isDone()) {
                this.f52187a.f52196h.mo69136a((Throwable) adbe.m50106a(34004));
            }
        } else {
            xgi xgi4 = this.f52187a;
            Context context2 = xgi4.f52189a;
            xgj = new xgg(context2, xgi4.f52194f, xgi4.f52195g, BluetoothAdapter.getDefaultAdapter(), new xgn(context2), new xiz());
        }
        if (this.f52187a.f52197i.mo29718c().intValue() == 1) {
            xgi xgi5 = this.f52187a;
            xgl xgl = (xgl) xgi5.f52197i;
            xgi5.f52198j = xgl.f52206b;
            xgi5.f52199k = xgl.f52205a;
        }
        if (xgj != null) {
            this.f52187a.mo29729a(xgj);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (!this.f52188b.isCancelled()) {
            this.f52187a.f52196h.mo69136a(th);
        }
    }
}
