package p000;

import android.util.Log;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;

/* renamed from: arrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arrz implements bqfp {

    /* renamed from: a */
    final /* synthetic */ arsb f88211a;

    public arrz(arsb arsb) {
        this.f88211a = arsb;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Assertion assertion = (Assertion) obj;
        arsb.f88212a.mo25412b("onSuccess", new Object[0]);
        if (assertion != null) {
            arsb arsb = this.f88211a;
            arsa arsa = arsb.f88217f;
            if (arsa == null) {
                arsb.f88219h = true;
            } else {
                arsa.mo48784a();
            }
        } else {
            arsb arsb2 = this.f88211a;
            arsa arsa2 = arsb2.f88217f;
            if (arsa2 == null) {
                arsb2.f88221j = true;
            } else {
                arsa2.mo48785b();
            }
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        arsb.f88212a.mo25412b("onFailure", new Object[0]);
        Logger Logger = arsb.f88212a;
        Object[] objArr = new Object[0];
        if (Logger.mo19637a(3) || !asco.m73782a()) {
            asco asco = (asco) Logger;
            Log.d(asco.f88711b, asco.mo49046h("Error: ", objArr), th);
        }
        arsb arsb = this.f88211a;
        arsa arsa = arsb.f88217f;
        if (arsa != null) {
            arsa.mo48785b();
        } else {
            arsb.f88221j = true;
        }
    }
}
