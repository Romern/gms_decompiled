package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.places.Subscription;

/* renamed from: bjdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjdd implements bhsf {

    /* renamed from: a */
    private final SemanticLocationEventRequest f122532a;

    /* renamed from: b */
    private final PendingIntent f122533b;

    /* renamed from: c */
    private final Context f122534c;

    /* renamed from: d */
    private final bjde f122535d;

    public bjdd(PendingIntent pendingIntent, SemanticLocationEventRequest semanticLocationEventRequest, bjde bjde, Context context) {
        this.f122535d = bjde;
        this.f122533b = pendingIntent;
        this.f122532a = semanticLocationEventRequest;
        this.f122534c = context;
    }

    /* renamed from: a */
    public final void mo64216a(bhqz bhqz, long j, bhqz bhqz2, long j2) {
        if (!cggy.m145393d()) {
            Intent a = avwf.m79457a(bjdk.m103241a(bhqz, j, this.f122532a.f109581c.f109561b), bjdk.m103241a(bhqz2, j2, this.f122532a.f109581c.f109561b)).mo51666a();
            int i = Build.VERSION.SDK_INT;
            spx.m35925a(this.f122534c).mo25960c("android:fine_location", this.f122533b.getCreatorUid(), this.f122533b.getCreatorPackage());
            try {
                int i2 = Build.VERSION.SDK_INT;
                this.f122533b.send(this.f122534c, 0, a, null, null, "android.permission.ACCESS_FINE_LOCATION");
            } catch (PendingIntent.CanceledException e) {
                bjde bjde = this.f122535d;
                ((bhri) bjde.f122536a).mo64183a((Subscription) bjde.f122537b);
            }
        }
    }
}
