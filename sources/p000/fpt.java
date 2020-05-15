package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: fpt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fpt implements rkl {

    /* renamed from: a */
    final /* synthetic */ txg f17107a;

    /* renamed from: b */
    final /* synthetic */ fpv f17108b;

    public fpt(fpv fpv, txg txg) {
        this.f17108b = fpv;
        this.f17107a = txg;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        if (!status.mo17710c()) {
            fpv fpv = this.f17108b;
            fpv.f17110b = this.f17107a;
            fpv.mo11116e();
            this.f17108b.f17111c.mo26104a(false);
            String valueOf = String.valueOf(status);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Unable to set preferences, result ");
            sb.append(valueOf);
            Log.e("DataManagementActivity", sb.toString());
            this.f17108b.mo11117g();
        }
    }
}
