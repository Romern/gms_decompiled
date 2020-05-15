package p000;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: szl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class szl extends PhoneStateListener {

    /* renamed from: a */
    public final int f45507a;

    /* renamed from: b */
    final /* synthetic */ szm f45508b;

    public szl(szm szm, int i) {
        this.f45508b = szm;
        this.f45507a = i;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        if (szn.m36659a(serviceState) == 4 && szn.m36662b(serviceState) == 4) {
            szm szm = this.f45508b;
            int i = this.f45507a;
            Logger Logger = szm.f45509a;
            TelephonyManager a = szm.m36649a(i);
            szm.f45509a.mo25412b("Registering signal strength listener for subId %s.", Integer.valueOf(i));
            szj szj = new szj(szm, a, serviceState, i);
            szm.m36653d();
            a.listen(szj, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            return;
        }
        snp.m35702a(10).execute(new szk(this, serviceState));
    }
}
