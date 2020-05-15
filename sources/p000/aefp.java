package p000;

import android.app.PendingIntent;

/* renamed from: aefp */
public final /* synthetic */ class aefp implements roo {

    /* renamed from: a */
    private final long f63333a;

    /* renamed from: b */
    private final PendingIntent f63334b;

    public aefp(long j, PendingIntent pendingIntent) {
        this.f63333a = j;
        this.f63334b = pendingIntent;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aekb.a(long, boolean, android.app.PendingIntent):void
     arg types: [long, int, android.app.PendingIntent]
     candidates:
      aekb.a(android.app.PendingIntent, aejy, java.lang.String):void
      aekb.a(android.app.PendingIntent, com.google.android.gms.location.SleepSegmentRequest, rnt):void
      aekb.a(com.google.android.gms.location.ActivityRecognitionRequest, android.app.PendingIntent, rnt):void
      aekb.a(com.google.android.gms.location.ActivityTransitionRequest, android.app.PendingIntent, rnt):void
      aekb.a(com.google.android.gms.location.GeofencingRequest, android.app.PendingIntent, aejy):void
      aekb.a(com.google.android.gms.location.LocationRequest, aehw, java.lang.String):void
      aekb.a(com.google.android.gms.location.LocationSettingsRequest, aeke, java.lang.String):void
      aekb.a(java.util.List, android.app.PendingIntent, aejy):void
      aekb.a(java.lang.String[], aejy, java.lang.String):void
      aekb.a(long, boolean, android.app.PendingIntent):void */
    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        boolean z;
        long j = this.f63333a;
        PendingIntent pendingIntent = this.f63334b;
        aekl aekl = (aekl) obj;
        aekl.mo25288A();
        sdo.m34959a(pendingIntent);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "detectionIntervalMillis must be >= 0");
        ((aekb) aekl.mo25289B()).mo34208a(j, true, pendingIntent);
        ((aucf) obj2).mo50391a((Object) null);
    }
}
