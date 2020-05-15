package p000;

import android.app.PendingIntent;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: ajcx */
final /* synthetic */ class ajcx implements ajdf {

    /* renamed from: a */
    private final PendingIntent f70369a;

    public ajcx(PendingIntent pendingIntent) {
        this.f70369a = pendingIntent;
    }

    /* renamed from: a */
    public final void mo38504a(ajct ajct, rod rod) {
        PendingIntent pendingIntent = this.f70369a;
        int i = ajdi.f70382b;
        ((ajcj) ajct.mo25289B()).mo38488a(new UnsubscribeRequest(null, new ajcf(rod), pendingIntent));
    }
}
