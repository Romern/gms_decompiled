package p000;

import android.content.Context;
import android.net.Uri;
import android.service.notification.ConditionProviderService;

/* renamed from: ded */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ded extends ConditionProviderService {

    /* renamed from: a */
    final /* synthetic */ com.google.android.chimera.ConditionProviderService f12972a;

    public ded(com.google.android.chimera.ConditionProviderService conditionProviderService) {
        this.f12972a = conditionProviderService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onConnected() {
        this.f12972a.onConnected();
    }

    public final void onRequestConditions(int i) {
        this.f12972a.onRequestConditions(i);
    }

    public final void onSubscribe(Uri uri) {
        this.f12972a.onSubscribe(uri);
    }

    public final void onUnsubscribe(Uri uri) {
        this.f12972a.onUnsubscribe(uri);
    }
}
