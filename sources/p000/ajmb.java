package p000;

import android.os.IBinder;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

/* renamed from: ajmb */
final /* synthetic */ class ajmb implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final ajmt f70894a;

    /* renamed from: b */
    private final ajyk f70895b;

    public ajmb(ajmt ajmt, ajyk ajyk) {
        this.f70894a = ajmt;
        this.f70895b = ajyk;
    }

    public final void binderDied() {
        ajmt ajmt = this.f70894a;
        ajyk ajyk = this.f70895b;
        UnregisterSharingProviderParams unregisterSharingProviderParams = new akbq().f71559a;
        unregisterSharingProviderParams.f81139b = ajyk;
        unregisterSharingProviderParams.f81138a = ajmt.f70934b;
        ajmt.mo38661a(unregisterSharingProviderParams);
    }
}
