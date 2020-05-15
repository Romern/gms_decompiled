package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: amrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amrq implements rkl {

    /* renamed from: a */
    final /* synthetic */ amrv f75817a;

    public amrq(amrv amrv) {
        this.f75817a = amrv;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        String str;
        allo allo = (allo) rkk;
        Bundle b = allo.mo40490b();
        if (b != null) {
            str = b.getString("log_text");
        } else {
            str = null;
        }
        amrv amrv = this.f75817a;
        Status bo = allo.mo7183bo();
        if (!bo.mo17710c()) {
            String valueOf = String.valueOf(bo);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Failed to load log.  result=");
            sb.append(valueOf);
            amrv.mo41287a(sb.toString());
            return;
        }
        amrv.mo41287a(str);
    }
}
