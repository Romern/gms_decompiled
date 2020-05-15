package p000;

import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: bedh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bedh extends aysv {

    /* renamed from: a */
    final /* synthetic */ bedj f106951a;

    public bedh(bedj bedj) {
        this.f106951a = bedj;
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
        aytb aytb = this.f106951a.f106968b;
        aysz aysz = new aysz(bedi.SCAN);
        String valueOf = String.valueOf(str);
        aytb.mo54413a(aysz, new BluetoothException(valueOf.length() == 0 ? new String("Scan failed: ") : "Scan failed: ".concat(valueOf)));
    }

    /* renamed from: a */
    public final void mo54334a(aysw aysw) {
        this.f106951a.f106968b.mo54413a(new aysz(bedi.SCAN), aysw.mo54399a());
    }
}
