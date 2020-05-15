package p000;

import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: ayrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayrn extends aysv {

    /* renamed from: a */
    final /* synthetic */ ayrp f98356a;

    public ayrn(ayrp ayrp) {
        this.f98356a = ayrp;
    }

    /* renamed from: a */
    public final void mo54333a(int i) {
        String str;
        if (i == 1) {
            str = "SCAN_FAILED_ALREADY_STARTED";
        } else if (i == 2) {
            str = "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
        } else if (i == 3) {
            str = "SCAN_FAILED_INTERNAL_ERROR";
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown error code - ");
            sb.append(i);
            str = sb.toString();
        } else {
            str = "SCAN_FAILED_FEATURE_UNSUPPORTED";
        }
        ayrp ayrp = this.f98356a;
        String str2 = ayrp.f98371a;
        aytb aytb = ayrp.f98375e;
        aysz aysz = new aysz(ayro.SCAN);
        String valueOf = String.valueOf(str);
        aytb.mo54413a(aysz, new BluetoothException(valueOf.length() == 0 ? new String("Scan failed: ") : "Scan failed: ".concat(valueOf)));
    }

    /* renamed from: a */
    public final void mo54334a(aysw aysw) {
        ayrp ayrp = this.f98356a;
        String str = ayrp.f98371a;
        ayrp.f98375e.mo54413a(new aysz(ayro.SCAN), aysw.mo54399a());
    }
}
