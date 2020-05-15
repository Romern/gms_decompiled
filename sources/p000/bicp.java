package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.places.Subscription;
import com.google.android.places.placefencing.PlacefencingSubscription;
import java.util.List;

/* renamed from: bicp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicp implements bicn {

    /* renamed from: a */
    final /* synthetic */ Context f120233a;

    /* renamed from: b */
    final /* synthetic */ bhrd f120234b;

    /* renamed from: c */
    final /* synthetic */ PlacefencingSubscription f120235c;

    public bicp(PlacefencingSubscription placefencingSubscription, Context context, bhrd bhrd) {
        this.f120235c = placefencingSubscription;
        this.f120233a = context;
        this.f120234b = bhrd;
    }

    /* renamed from: a */
    public final void mo64521a(int i, int i2, String str, List list) {
        Intent intent = new Intent();
        sdo.m34959a(intent);
        intent.putExtra("com.google.android.places.intent.extra.placefencing_status", i);
        intent.putExtra("com.google.android.places.intent.extra.placefencing_transition", i2);
        intent.putExtra("com.google.android.places.intent.extra.request_id", str);
        intent.putExtra("com.google.android.places.intent.extra.placefencing_ids", (String[]) list.toArray(new String[list.size()]));
        int i3 = Build.VERSION.SDK_INT;
        spx.m35925a(this.f120233a).mo25960c("android:fine_location", this.f120235c.f151360c.getCreatorUid(), this.f120235c.f151360c.getCreatorPackage());
        try {
            int i4 = Build.VERSION.SDK_INT;
            this.f120235c.f151360c.send(this.f120233a, 0, intent, null, null, "android.permission.ACCESS_FINE_LOCATION");
        } catch (PendingIntent.CanceledException e) {
            ((bhri) this.f120234b).mo64183a((Subscription) this.f120235c);
        }
    }
}
