package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* renamed from: aekl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aekl extends aejc {

    /* renamed from: b */
    public final aeki f63471b;

    public aekl(Context context, Looper looper, rjz rjz, rka rka, String str, sat sat) {
        super(context, looper, rjz, rka, str, sat);
        this.f63471b = new aeki(context, ((aejc) this).f63443a);
    }

    /* renamed from: a */
    public final Location mo34247a(String str) {
        if (!sqc.m35963b(mo25305t(), aegm.f63356c)) {
            aeki aeki = this.f63471b;
            aeki.f63468e.mo34195a();
            return aeki.f63468e.mo34196b().mo34206a();
        }
        aeki aeki2 = this.f63471b;
        aeki2.f63468e.mo34195a();
        return aeki2.f63468e.mo34196b().mo34235b(str);
    }

    /* renamed from: b */
    public final void mo34257b(LocationRequestInternal locationRequestInternal, rod rod, aejv aejv) {
        aehs aehs;
        aehs aehs2;
        synchronized (this.f63471b) {
            aeki aeki = this.f63471b;
            aeki.mo34246a(locationRequestInternal);
            aeki.f63468e.mo34195a();
            rob rob = rod.f43429b;
            if (rob != null) {
                synchronized (aeki.f63467d) {
                    aehs2 = (aehs) aeki.f63467d.get(rob);
                    if (aehs2 == null) {
                        aehs2 = new aehs(rod);
                    }
                    aeki.f63467d.put(rob, aehs2);
                }
                aehs = aehs2;
            } else {
                aehs = null;
            }
            if (aehs != null) {
                aekb b = aeki.f63468e.mo34196b();
                aehs.asBinder();
                b.mo34229a(new LocationRequestUpdateData(1, locationRequestInternal, null, null, aehs, aejv.asBinder()));
            }
        }
    }

    /* renamed from: j */
    public final void mo14032j() {
        synchronized (this.f63471b) {
            if (mo25301p()) {
                try {
                    aeki aeki = this.f63471b;
                    synchronized (aeki.f63465b) {
                        for (aehv aehv : aeki.f63465b.values()) {
                            if (aehv != null) {
                                aeki.f63468e.mo34196b().mo34229a(LocationRequestUpdateData.m66896a(aehv, (aejv) null));
                            }
                        }
                        aeki.f63465b.clear();
                    }
                    synchronized (aeki.f63467d) {
                        for (aehs aehs : aeki.f63467d.values()) {
                            if (aehs != null) {
                                aeki.f63468e.mo34196b().mo34229a(LocationRequestUpdateData.m66895a(aehs, (aejv) null));
                            }
                        }
                        aeki.f63467d.clear();
                    }
                    synchronized (aeki.f63466c) {
                        for (aehp aehp : aeki.f63466c.values()) {
                            if (aehp != null) {
                                aeki.f63468e.mo34196b().mo34226a(new DeviceOrientationRequestUpdateData(2, null, aehp, null));
                            }
                        }
                        aeki.f63466c.clear();
                    }
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo14032j();
        }
    }

    /* renamed from: n */
    public final ActivityRecognitionResult mo34259n() {
        mo25288A();
        return ((aekb) mo25289B()).mo34207a(this.f43948r.getPackageName());
    }

    /* renamed from: o */
    public final LocationAvailability mo34260o() {
        aeki aeki = this.f63471b;
        aeki.f63468e.mo34195a();
        return aeki.f63468e.mo34196b().mo34239c(aeki.f63464a.getPackageName());
    }

    /* renamed from: a */
    public final void mo34248a(aejv aejv) {
        aeki aeki = this.f63471b;
        aeki.f63468e.mo34195a();
        aeki.f63468e.mo34196b().mo34210a(aejv);
    }

    /* renamed from: b */
    public final void mo34258b(rob rob, aejv aejv) {
        aeki aeki = this.f63471b;
        aeki.f63468e.mo34195a();
        sdo.m34966a(rob, "Invalid null listener key");
        synchronized (aeki.f63467d) {
            aehs aehs = (aehs) aeki.f63467d.remove(rob);
            if (aehs != null) {
                aehs.mo34159a();
                aeki.f63468e.mo34196b().mo34229a(LocationRequestUpdateData.m66895a(aehs, aejv));
            }
        }
    }

    /* renamed from: a */
    public final void mo34249a(PendingIntent pendingIntent) {
        mo25288A();
        sdo.m34959a(pendingIntent);
        ((aekb) mo25289B()).mo34212a(pendingIntent);
    }

    /* renamed from: a */
    public final void mo34250a(PendingIntent pendingIntent, aejv aejv) {
        aeki aeki = this.f63471b;
        aeki.f63468e.mo34195a();
        aeki.f63468e.mo34196b().mo34229a(new LocationRequestUpdateData(2, null, null, pendingIntent, null, aejv.asBinder()));
    }

    /* renamed from: a */
    public final void mo34251a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, rlf rlf) {
        mo25288A();
        sdo.m34966a(activityRecognitionRequest, "ActivityRecognitionRequest can't be null.");
        sdo.m34966a(pendingIntent, "PendingIntent must be specified.");
        sdo.m34966a(rlf, "ResultHolder not provided.");
        ((aekb) mo25289B()).mo34218a(activityRecognitionRequest, pendingIntent, new ros(rlf));
    }

    /* renamed from: a */
    public final void mo34252a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, rlf rlf) {
        mo25288A();
        sdo.m34966a(geofencingRequest, "geofencingRequest can't be null.");
        sdo.m34966a(pendingIntent, "PendingIntent must be specified.");
        sdo.m34966a(rlf, "ResultHolder not provided.");
        ((aekb) mo25289B()).mo34220a(geofencingRequest, pendingIntent, new aekj(rlf));
    }

    /* renamed from: a */
    public final void mo34253a(LocationSettingsRequest locationSettingsRequest, rlf rlf, String str) {
        mo25288A();
        boolean z = true;
        sdo.m34975b(true, "locationSettingsRequest can't be null nor empty.");
        if (rlf == null) {
            z = false;
        }
        sdo.m34975b(z, "listener can't be null.");
        ((aekb) mo25289B()).mo34224a(locationSettingsRequest, new aekd(rlf), str);
    }

    /* renamed from: a */
    public final void mo34254a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent, aejv aejv) {
        aeki aeki = this.f63471b;
        aeki.mo34246a(locationRequestInternal);
        aeki.f63468e.mo34195a();
        aeki.f63468e.mo34196b().mo34229a(new LocationRequestUpdateData(1, locationRequestInternal, null, pendingIntent, null, aejv.asBinder()));
    }

    /* renamed from: a */
    public final void mo34255a(LocationRequestInternal locationRequestInternal, rod rod, aejv aejv) {
        aehv aehv;
        aehv aehv2;
        synchronized (this.f63471b) {
            aeki aeki = this.f63471b;
            aeki.mo34246a(locationRequestInternal);
            aeki.f63468e.mo34195a();
            rob rob = rod.f43429b;
            if (rob != null) {
                synchronized (aeki.f63465b) {
                    aehv2 = (aehv) aeki.f63465b.get(rob);
                    if (aehv2 == null) {
                        aehv2 = new aehv(rod);
                    }
                    aeki.f63465b.put(rob, aehv2);
                }
                aehv = aehv2;
            } else {
                aehv = null;
            }
            if (aehv != null) {
                aekb b = aeki.f63468e.mo34196b();
                aehv.asBinder();
                b.mo34229a(new LocationRequestUpdateData(1, locationRequestInternal, aehv, null, null, aejv.asBinder()));
            }
        }
    }

    /* renamed from: a */
    public final void mo34256a(rob rob, aejv aejv) {
        aeki aeki = this.f63471b;
        aeki.f63468e.mo34195a();
        sdo.m34966a(rob, "Invalid null listener key");
        synchronized (aeki.f63465b) {
            aehv aehv = (aehv) aeki.f63465b.remove(rob);
            if (aehv != null) {
                aehv.mo34161a();
                aeki.f63468e.mo34196b().mo34229a(LocationRequestUpdateData.m66896a(aehv, aejv));
            }
        }
    }
}
