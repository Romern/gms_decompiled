package com.google.android.places.placefencing;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.Subscription;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlacefencingSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new bicq();

    /* renamed from: a */
    public final PlacefencingRequest f151358a;

    /* renamed from: b */
    public final PlacesParams f151359b;

    /* renamed from: c */
    public final PendingIntent f151360c;

    public PlacefencingSubscription(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent) {
        this.f151358a = placefencingRequest;
        this.f151359b = placesParams;
        this.f151360c = pendingIntent;
    }

    /* renamed from: a */
    public static PlacefencingSubscription m117719a(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent) {
        return new PlacefencingSubscription(placefencingRequest, placesParams, pendingIntent);
    }

    /* renamed from: a */
    public final boolean mo70892a(Subscription subscription) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlacefencingSubscription) {
            PlacefencingSubscription placefencingSubscription = (PlacefencingSubscription) obj;
            return this.f151358a.f79510a.equals(placefencingSubscription.f151358a.f79510a) && this.f151359b.f79572b.equals(placefencingSubscription.f151359b.f79572b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f151358a.f79510a, this.f151359b.f79572b});
    }

    /* renamed from: a */
    public final bhqe mo70889a(Context context, bhrd bhrd, bhpw bhpw) {
        return new bico(bhpw, spn.m35897i(context, this.f151359b.f79572b), this.f151360c.getTargetPackage(), new bicp(this, context, bhrd), this.f151358a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f151358a, i, false);
        see.m35040a(parcel, 2, this.f151359b, i, false);
        see.m35040a(parcel, 3, this.f151360c, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final Status mo70890a(int i) {
        int f = (int) cggm.m145260f();
        if (i < f) {
            return aemj.m52157b(0);
        }
        String format = String.format(Locale.US, "%d subscriptions already added for package %s, max is %d", Integer.valueOf(i), this.f151359b.f79572b, Integer.valueOf(f));
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", format);
        }
        return aemj.m52158b(9000, format);
    }

    /* renamed from: a */
    public final String mo70891a() {
        return this.f151359b.f79572b;
    }
}
