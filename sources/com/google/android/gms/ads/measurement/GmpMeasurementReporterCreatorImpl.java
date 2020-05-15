package com.google.android.gms.ads.measurement;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.measurement.internal.C0741b;
import com.google.android.gms.ads.measurement.internal.C0742c;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmpMeasurementReporterCreatorImpl extends C0741b {
    public IBinder newGmpMeasurementReporter(vzr vzr) {
        C0742c asInterface = C0741b.asInterface((IBinder) fhs.m11712a((Context) vzs.m41641a(vzr)).mo10839a("com.google.android.gms.ads.measurement.ChimeraGmpMeasurementReporterCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newGmpMeasurementReporter(vzr);
            } catch (RemoteException e) {
                C0633h.m5665a("Failed to create using dynamite package", e);
            }
        }
        C0633h.m5664a("Chimera is not available.");
        return null;
    }
}
