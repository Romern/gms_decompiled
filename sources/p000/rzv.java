package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.beacon.BleChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: rzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rzv extends rzu {

    /* renamed from: a */
    final /* synthetic */ BleChimeraService f43908a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rzv(BleChimeraService bleChimeraService, Context context) {
        super(context, 111, new int[0]);
        this.f43908a = bleChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12163a(String str, int i) {
        if (i != 2) {
            throw new SecurityException("0P-only API");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        nfx nfx = this.f43908a.f29252a;
        if (nfx == null) {
            sbj.mo16678a(8, (IBinder) null, (Bundle) null);
        } else {
            sbj.mo16678a(0, nfx, (Bundle) null);
        }
    }
}
