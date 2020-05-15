package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: aemf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aemf extends aenq {

    /* renamed from: a */
    private static final String f63510a = aemf.class.getSimpleName();

    /* renamed from: b */
    private final aemd f63511b;

    /* renamed from: c */
    private final aemb f63512c;

    /* renamed from: d */
    private final aeme f63513d;

    /* renamed from: e */
    private final aemc f63514e;

    public aemf(aemb aemb) {
        this.f63511b = null;
        this.f63512c = aemb;
        this.f63513d = null;
        this.f63514e = null;
    }

    /* renamed from: a */
    public final void mo34321a(Status status) {
        this.f63513d.mo17716a((rkk) status);
    }

    /* renamed from: b */
    public final void mo34323b(DataHolder dataHolder) {
        if (dataHolder == null) {
            if (Log.isLoggable(f63510a, 6)) {
                Log.e(f63510a, "onAutocompletePrediction received null DataHolder", new Throwable());
            }
            this.f63512c.mo9481a(Status.f30109c);
            return;
        }
        this.f63512c.mo17716a((rkk) new aekx(dataHolder));
    }

    /* renamed from: c */
    public final void mo34324c(DataHolder dataHolder) {
        if (dataHolder == null) {
            if (Log.isLoggable(f63510a, 6)) {
                Log.e(f63510a, "onPlaceUserDataFetched received null DataHolder", new Throwable());
            }
            Status status = Status.f30107a;
            throw null;
        }
        new aeox(dataHolder);
        throw null;
    }

    /* renamed from: d */
    public final void mo34325d(DataHolder dataHolder) {
        this.f63514e.mo17716a((rkk) new aeli(dataHolder));
    }

    public aemf(aemc aemc) {
        this.f63511b = null;
        this.f63512c = null;
        this.f63513d = null;
        this.f63514e = aemc;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo34322a(DataHolder dataHolder) {
        boolean z;
        int i;
        if (this.f63511b != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34971a(z, (Object) "placeEstimator cannot be null");
        if (dataHolder == null) {
            if (Log.isLoggable(f63510a, 6)) {
                Log.e(f63510a, "onPlaceEstimated received null DataHolder", new Throwable());
            }
            this.f63511b.mo9481a(Status.f30109c);
            return;
        }
        Bundle bundle = dataHolder.f30166f;
        if (bundle != null) {
            i = bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
        } else {
            i = 100;
        }
        this.f63511b.mo17716a((rkk) new aelr(dataHolder, i));
    }

    public aemf(aemd aemd) {
        this.f63511b = aemd;
        this.f63512c = null;
        this.f63513d = null;
        this.f63514e = null;
    }

    public aemf(aeme aeme) {
        this.f63511b = null;
        this.f63512c = null;
        this.f63513d = aeme;
        this.f63514e = null;
    }
}
