package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.photos.autobackup.service.AutoBackupChimeraService;
import java.util.Set;

/* renamed from: ankg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankg extends rzt {

    /* renamed from: a */
    final /* synthetic */ AutoBackupChimeraService f77008a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ankg(AutoBackupChimeraService autoBackupChimeraService, Context context) {
        super(context, 31, new int[0]);
        this.f77008a = autoBackupChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return AutoBackupChimeraService.f82205a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        try {
            sbj.mo16678a(0, new anju(this.f77008a), (Bundle) null);
        } catch (RemoteException e) {
            Log.w("AutoBackupService", "Client died while brokering service.");
        }
    }
}
