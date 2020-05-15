package p000;

import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockChimeraActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: jvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jvt implements aubw {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10462a(Object obj) {
        Status status = ((KeyRegistrationResult) obj).f10542b;
        int i = status.f30115i;
        if (i == -25501 || i == -25502) {
            DmSetScreenlockChimeraActivity.f11365a.mo25414c("Successfully synced data to Cryptauth server", new Object[0]);
            return;
        }
        DmSetScreenlockChimeraActivity.f11365a.mo25416d("Failed to sync data to Cryptauth server. StatusCode=[%s]", status.mo17711d());
    }
}
