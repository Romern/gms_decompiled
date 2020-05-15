package p000;

import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;

/* renamed from: ajfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajfs implements ssr {

    /* renamed from: a */
    final /* synthetic */ NearbyMessagesChimeraService f70536a;

    public ajfs(NearbyMessagesChimeraService nearbyMessagesChimeraService) {
        this.f70536a = nearbyMessagesChimeraService;
    }

    /* renamed from: b */
    public final void mo25991b(int i) {
        String[] packagesForUid = this.f70536a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null) {
            this.f70536a.f80810i.mo72987c(new ajfr(this, "PermissionsChanged", packagesForUid));
        }
    }
}
