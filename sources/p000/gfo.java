package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.audiomodem.service.AudioModemChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.List;

/* renamed from: gfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gfo extends rzu {

    /* renamed from: a */
    final /* synthetic */ AudioModemChimeraService f18081a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gfo(AudioModemChimeraService audioModemChimeraService, Context context) {
        super(context, 48, new int[0]);
        this.f18081a = audioModemChimeraService;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (p000.ahgv.m55731b(r4.f18081a, r6) == false) goto L_0x0053;
     */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        if (!spn.m35869b()) {
            spn.m35872c(this.f18081a, str);
            if (!rfz.m33557a(this.f18081a).mo24610b(str)) {
                if (!cfos.m141992f()) {
                    List c = bmyx.m108640a(',').mo66925c((CharSequence) cfnp.f184595a.mo6606a().mo81709w());
                    int i = 0;
                    while (i < c.size()) {
                        if (!((String) c.get(i)).equals(str)) {
                            i++;
                        }
                    }
                }
                String valueOf = String.valueOf(str);
                throw new SecurityException(valueOf.length() == 0 ? new String("Not allowed: ") : "Not allowed: ".concat(valueOf));
            }
        }
        synchronized (this.f18081a) {
            gfx e = this.f18081a.mo7343e();
            if (e == null) {
                sbj.mo16678a(8, (IBinder) null, (Bundle) null);
            } else {
                sbj.mo16678a(0, e, (Bundle) null);
            }
        }
    }
}
