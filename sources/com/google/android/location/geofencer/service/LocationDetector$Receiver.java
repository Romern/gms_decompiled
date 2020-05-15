package com.google.android.location.geofencer.service;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class LocationDetector$Receiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ bfzw f150782a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationDetector$Receiver(bfzw bfzw) {
        super("location");
        this.f150782a = bfzw;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfzt.a(android.location.Location, java.util.Map, boolean):void
     arg types: [android.location.Location, ?[OBJECT, ARRAY], int]
     candidates:
      bfzt.a(java.util.List, int, android.location.Location):void
      bfzt.a(android.location.Location, java.util.Map, boolean):void */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        LocationAvailability b;
        String action = intent.getAction();
        if (action.equals("com.google.android.location.intent.action.END_LOCATION_BURST")) {
            synchronized (this.f150782a.f115827c) {
                bfzw bfzw = this.f150782a;
                if (bfzw.f115833i) {
                    bfzw.mo62521a(false);
                    bfzw bfzw2 = this.f150782a;
                    bfzw2.mo62520a(60, false, bfzw2.f115831g, false);
                }
            }
        } else if (action.equals(bvpm.m121348a("com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT"))) {
            try {
                Location location = (Location) intent.getParcelableExtra("com.google.android.location.LOCATION");
                if (location != null) {
                    bfzw bfzw3 = this.f150782a;
                    boolean z = bfzw3.f115825a;
                    bfww bfww = bfzw3.f115834j;
                    if (bfww != null) {
                        bfww.mo62397a();
                        bxvd bxvd = bfww.f115555n;
                        int i = ((bpmm) bxvd.f164949b).f138298c + 1;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bpmm bpmm = (bpmm) bxvd.f164949b;
                        bpmm bpmm2 = bpmm.f138294h;
                        bpmm.f138296a |= 2;
                        bpmm.f138298c = i;
                    }
                    bfzw3.f115826b.mo62509a(location, (Map) null, false);
                }
                if (LocationAvailability.m66851a(intent) && (b = LocationAvailability.m66852b(intent)) != null) {
                    this.f150782a.f115826b.mo62512a(b);
                }
            } catch (RuntimeException e) {
                if (Log.isLoggable("LocationDetector", 6)) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Malformed Parcelable in Intent: ");
                    sb.append(valueOf);
                    bfxc.m98133b("LocationDetector", sb.toString());
                }
            }
        }
    }
}
