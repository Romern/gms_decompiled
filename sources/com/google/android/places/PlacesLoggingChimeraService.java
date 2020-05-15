package com.google.android.places;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlacesLoggingChimeraService extends IntentOperation {

    /* renamed from: a */
    private final bhqo f151355a = new bhqo(this);

    /* renamed from: a */
    public static void m117712a(Context context, bpqk bpqk) {
        sdo.m34959a(context);
        sdo.m34959a(bpqk);
        context.startService(IntentOperation.getStartIntent(context, PlacesLoggingChimeraService.class, "com.google.android.places.LOG_PLACES_EVENT").putExtra("extra_places_event", bpqk.mo73642k()));
    }

    public final void onCreate() {
        bhqo bhqo = this.f151355a;
        if (bhqo.f119335b == null) {
            bhqo.f119336c = bhqp.m101339a(bhqo.f119334a.getApplicationContext()).mo64167a();
            bhqo.f119335b = new qws(bhqo.f119334a, "LE", null);
        }
        if (bhqo.f119337d == null) {
            bhqo.f119337d = new aesh(bhqo.f119334a);
            bhqo.f119337d.mo34501a();
        }
    }

    public final void onDestroy() {
        bhqo bhqo = this.f151355a;
        aehy aehy = bhqo.f119338e;
        if (aehy != null) {
            bhqo.f119337d.mo34502a(aehy);
        }
        bhqo.f119337d.mo34507b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        if (r12 != 4) goto L_0x007a;
     */
    public final void onHandleIntent(Intent intent) {
        int a;
        bhqo bhqo = this.f151355a;
        if (cgfl.f186724a.mo6606a().mo83599f() && intent != null) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("extra_places_event");
            if (byteArrayExtra != null) {
                try {
                    bxvd da = bpqk.f138732w.mo74144da();
                    da.mo73635b(byteArrayExtra, bxus.m123744c());
                    if (aeri.m52435a(bhqo.f119334a, "network")) {
                        int a2 = bpqj.m112178a(((bpqk) da.f164949b).f138736c);
                        if ((a2 == 0 || a2 != 3) && ((a = bpqj.m112178a(((bpqk) da.f164949b).f138736c)) == 0 || a != 4)) {
                            int a3 = bpqj.m112178a(((bpqk) da.f164949b).f138736c);
                            if (a3 == 0 || a3 == 1) {
                                bprg bprg = ((bpqk) da.f164949b).f138742i;
                                if (bprg == null) {
                                    bprg = bprg.f138829s;
                                }
                                int a4 = bprf.m112200a(bprg.f138832b);
                                if (a4 != 0) {
                                }
                            }
                            bhqo.mo64166a((bpqk) da.mo74062i());
                            return;
                        }
                        if (cgfl.f186724a.mo6606a().mo83598e()) {
                            long k = cgfl.f186724a.mo6606a().mo83604k();
                            LocationRequest a5 = LocationRequest.m66854a();
                            a5.mo43553c(102);
                            a5.mo43551b(1);
                            a5.mo43549a(k);
                            a5.mo43554c(cgfl.f186724a.mo6606a().mo83605l());
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            AtomicReference atomicReference = new AtomicReference();
                            bhqo.f119338e = new bhqn(atomicReference, countDownLatch);
                            bhqo.f119337d.mo34505a(LocationRequestInternal.m66889a("places_logging_service", a5), bhqo.f119338e, Looper.getMainLooper());
                            try {
                                countDownLatch.await(k, TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e) {
                                if (Log.isLoggable("Places", 5)) {
                                    bioi.m102662c("Places", "Thread interrupted waiting for location");
                                }
                                Thread.currentThread().interrupt();
                            }
                            WifiScan wifiScan = null;
                            bhqo.f119338e = null;
                            Location location = (Location) atomicReference.get();
                            if (location != null) {
                                if (cgfl.f186724a.mo6606a().mo83600g()) {
                                    wifiScan = WifiScan.m66875a(location);
                                }
                                bhqq.m101361a(da, location, wifiScan);
                            }
                            bhqo.mo64166a((bpqk) da.mo74062i());
                            return;
                        }
                        bhqo.mo64166a((bpqk) da.mo74062i());
                        return;
                    }
                    bhqo.mo64166a((bpqk) da.mo74062i());
                } catch (bxwf e2) {
                    if (Log.isLoggable("Places", 5)) {
                        bioi.m102662c("Places", "Invalid contents of extra extra_places_event");
                    }
                }
            } else if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "Missing intent extra extra_places_event");
            }
        }
    }
}
