package com.google.android.userlocation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.places.Subscription;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SemanticLocationUpdateSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new bjdi();

    /* renamed from: a */
    public final SemanticLocationUpdateRequest f151716a;

    /* renamed from: b */
    public final PlacesParams f151717b;

    /* renamed from: c */
    private bhrd f151718c = null;

    /* renamed from: d */
    private final avxh f151719d;

    public SemanticLocationUpdateSubscription(SemanticLocationUpdateRequest semanticLocationUpdateRequest, PlacesParams placesParams, avxh avxh) {
        this.f151716a = semanticLocationUpdateRequest;
        this.f151717b = placesParams;
        this.f151719d = avxh;
    }

    /* renamed from: a */
    public final bhqe mo70889a(Context context, bhrd bhrd, bhpw bhpw) {
        this.f151718c = bhrd;
        String str = this.f151717b.f79572b;
        return new bjdg(bhpw.f119280b, spn.m35897i(context, str), str, this.f151717b.f79574d, bjdk.m103237a(this.f151716a.f109584b), cggy.f186915a.mo6606a().mo83776e(), new bjdh(this.f151719d, this.f151716a, this));
    }

    /* renamed from: b */
    public final void mo71748b() {
        bhrd bhrd = this.f151718c;
        if (bhrd != null) {
            ((bhri) bhrd).mo64183a((Subscription) this);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticLocationUpdateSubscription) {
            SemanticLocationUpdateSubscription semanticLocationUpdateSubscription = (SemanticLocationUpdateSubscription) obj;
            return this.f151716a.f109583a.equals(semanticLocationUpdateSubscription.f151716a.f109583a) && this.f151717b.f79572b.equals(semanticLocationUpdateSubscription.f151717b.f79572b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f151716a.f109583a, this.f151717b.f79572b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f151716a, i, false);
        see.m35040a(parcel, 2, this.f151717b, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final Status mo70890a(int i) {
        if (i < 10) {
            return rjs.m33682h(0);
        }
        String format = String.format(Locale.US, "%d subscriptions already added for package %s, max is %d", Integer.valueOf(i), this.f151717b.f79572b, 10);
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", format);
        }
        return rjs.m33676a(26002, format);
    }

    /* renamed from: a */
    public final String mo70891a() {
        return this.f151717b.f79572b;
    }

    /* renamed from: a */
    public final boolean mo70892a(Subscription subscription) {
        if (this == subscription) {
            return true;
        }
        if (subscription instanceof SemanticLocationUpdateSubscription) {
            SemanticLocationUpdateSubscription semanticLocationUpdateSubscription = (SemanticLocationUpdateSubscription) subscription;
            return sdg.m34949a(this.f151719d, semanticLocationUpdateSubscription.f151719d) && sdg.m34949a(this.f151717b, semanticLocationUpdateSubscription.f151717b) && sdg.m34949a(this.f151716a.f109585c, semanticLocationUpdateSubscription.f151716a.f109585c) && sdg.m34949a(Integer.valueOf(this.f151716a.f109584b), Integer.valueOf(semanticLocationUpdateSubscription.f151716a.f109584b));
        }
    }
}
