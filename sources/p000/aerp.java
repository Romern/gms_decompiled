package p000;

import android.content.Context;
import android.provider.Settings;

/* renamed from: aerp */
final /* synthetic */ class aerp implements aerg {

    /* renamed from: a */
    static final aerg f63690a = new aerp();

    private aerp() {
    }

    /* renamed from: a */
    public final Object mo34472a(Context context) {
        int i = aerq.f63691i;
        return Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed");
    }
}
