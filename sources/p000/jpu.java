package p000;

import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: jpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jpu extends jsf {

    /* renamed from: a */
    final /* synthetic */ List f23007a;

    public jpu(List list) {
        this.f23007a = list;
    }

    /* renamed from: a */
    public final void mo13960a(Status status, SyncedCryptauthDevice syncedCryptauthDevice) {
        this.f23007a.add(syncedCryptauthDevice);
    }
}
