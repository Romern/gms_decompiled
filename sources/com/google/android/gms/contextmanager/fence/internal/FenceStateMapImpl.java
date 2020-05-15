package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FenceStateMapImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tko();

    /* renamed from: a */
    public final Map f30658a;

    public FenceStateMapImpl(Bundle bundle) {
        this.f30658a = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f30658a.put(str, (FenceStateImpl) sef.m35069a(bundle.getByteArray(str), FenceStateImpl.CREATOR));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int a = see.m35030a(parcel);
        if (this.f30658a != null) {
            bundle = new Bundle();
            for (Map.Entry entry : this.f30658a.entrySet()) {
                bundle.putByteArray((String) entry.getKey(), sef.m35074a((FenceStateImpl) entry.getValue()));
            }
        } else {
            bundle = null;
        }
        see.m35037a(parcel, 2, bundle, false);
        see.m35062b(parcel, a);
    }

    public FenceStateMapImpl(Map map) {
        this.f30658a = map;
    }
}
