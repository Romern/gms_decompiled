package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.places.internal.PlaceEntity;

/* renamed from: aepf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepf {
    /* renamed from: a */
    public static aelh m52337a(Context context, Intent intent) {
        sdo.checkIfNull(intent, "intent must not be null");
        sdo.checkIfNull(context, "context must not be null");
        return (aelh) sef.m35067a(intent, "selected_place", PlaceEntity.CREATOR);
    }
}
