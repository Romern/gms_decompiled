package com.google.android.location.places;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.places.Subscription;
import java.util.Collections;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NearbyAlertSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new bglu();

    /* renamed from: a */
    public static final UserLocationNearbyAlertRequest f150835a = UserLocationNearbyAlertRequest.m93775a(0, UserLocationNearbyAlertFilter.m93774a(Collections.singleton(1001)), -1, false, 0, 110);

    /* renamed from: b */
    public final UserLocationNearbyAlertRequest f150836b;

    /* renamed from: c */
    public final PlacesParams f150837c;

    /* renamed from: d */
    public final PendingIntent f150838d;

    /* renamed from: e */
    public final PendingIntent f150839e;

    public NearbyAlertSubscription(UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        sdo.m34959a(userLocationNearbyAlertRequest);
        this.f150836b = userLocationNearbyAlertRequest;
        this.f150837c = placesParams;
        this.f150838d = pendingIntent;
        this.f150839e = pendingIntent2;
    }

    /* renamed from: a */
    public final bhqe mo70889a(Context context, bhrd bhrd, bhpw bhpw) {
        boolean z;
        String str = this.f150837c.f79572b;
        int i = spn.m35897i(context, str);
        bglt bglt = new bglt(this, context, bhrd);
        if (this.f150836b.f109595d) {
            PendingIntent pendingIntent = this.f150839e;
            int i2 = Build.VERSION.SDK_INT;
            if (rfz.m33557a(context).mo24610b(pendingIntent.getCreatorPackage())) {
                z = true;
                return new bhxn(bhpw.f119279a, i, str, bglt, this.f150836b, z);
            }
        }
        z = false;
        return new bhxn(bhpw.f119279a, i, str, bglt, this.f150836b, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyAlertSubscription) {
            return this.f150839e.equals(((NearbyAlertSubscription) obj).f150839e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f150839e.hashCode();
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("nearbyAlertRequest", this.f150836b);
        a.mo25396a("params", this.f150837c);
        a.mo25396a("callbackIntent", this.f150838d);
        a.mo25396a("keyIntent", this.f150839e);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f150836b, i, false);
        see.m35040a(parcel, 2, this.f150837c, i, false);
        see.m35040a(parcel, 3, this.f150838d, i, false);
        see.m35040a(parcel, 6, this.f150839e, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final Status mo70890a(int i) {
        int B = (int) cgfr.f186745a.mo6606a().mo83614B();
        if (i < B) {
            return aemj.m52157b(0);
        }
        String format = String.format(Locale.US, "%d subscriptions already added for package %s, max is %d", Integer.valueOf(i), this.f150837c.f79572b, Integer.valueOf(B));
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", format);
        }
        return aemj.m52158b(9000, format);
    }

    /* renamed from: a */
    public final String mo70891a() {
        int i = Build.VERSION.SDK_INT;
        return this.f150839e.getCreatorPackage();
    }

    /* renamed from: a */
    public final boolean mo70892a(Subscription subscription) {
        if (this == subscription) {
            return true;
        }
        if (subscription instanceof NearbyAlertSubscription) {
            NearbyAlertSubscription nearbyAlertSubscription = (NearbyAlertSubscription) subscription;
            return sdg.m34949a(this.f150839e, nearbyAlertSubscription.f150839e) && sdg.m34949a(this.f150836b, nearbyAlertSubscription.f150836b) && sdg.m34949a(this.f150837c, nearbyAlertSubscription.f150837c);
        }
    }
}
