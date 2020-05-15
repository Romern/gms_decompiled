package com.google.android.userlocation;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.places.Subscription;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SemanticLocationEventSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new bjdf();

    /* renamed from: a */
    public final SemanticLocationEventRequest f151713a;

    /* renamed from: b */
    public final PlacesParams f151714b;

    /* renamed from: c */
    public final PendingIntent f151715c;

    public SemanticLocationEventSubscription(SemanticLocationEventRequest semanticLocationEventRequest, PlacesParams placesParams, PendingIntent pendingIntent) {
        this.f151713a = semanticLocationEventRequest;
        this.f151714b = placesParams;
        this.f151715c = pendingIntent;
    }

    /* renamed from: a */
    public final bhqe mo70889a(Context context, bhrd bhrd, bhpw bhpw) {
        String str = this.f151714b.f79572b;
        return new bjdg(bhpw.f119280b, spn.m35897i(context, str), str, this.f151714b.f79574d, bjdk.m103237a(this.f151713a.f109580b), cggy.m145391b(), new bhsg(new bjdd(this.f151715c, this.f151713a, new bjde(this, bhrd), context), this.f151713a.f109582d, cggy.f186915a.mo6606a().mo83773b()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticLocationEventSubscription) {
            SemanticLocationEventSubscription semanticLocationEventSubscription = (SemanticLocationEventSubscription) obj;
            return this.f151713a.f109579a.equals(semanticLocationEventSubscription.f151713a.f109579a) && this.f151714b.f79572b.equals(semanticLocationEventSubscription.f151714b.f79572b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f151713a.f109579a, this.f151714b.f79572b});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("request", this.f151713a);
        a.mo25396a("params", this.f151714b);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f151713a, i, false);
        see.m35040a(parcel, 2, this.f151714b, i, false);
        see.m35040a(parcel, 3, this.f151715c, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final Status mo70890a(int i) {
        if (i < 10) {
            return rjs.m33682h(0);
        }
        String format = String.format(Locale.US, "%d subscriptions already added for package %s, max is %d", Integer.valueOf(i), this.f151714b.f79572b, 10);
        if (Log.isLoggable("Places", 6)) {
            Log.e("Places", format);
        }
        return rjs.m33676a(26002, format);
    }

    /* renamed from: a */
    public final String mo70891a() {
        return this.f151714b.f79572b;
    }

    /* renamed from: a */
    public final boolean mo70892a(Subscription subscription) {
        if (this == subscription) {
            return true;
        }
        if (subscription instanceof SemanticLocationEventSubscription) {
            SemanticLocationEventSubscription semanticLocationEventSubscription = (SemanticLocationEventSubscription) subscription;
            return sdg.m34949a(this.f151715c, semanticLocationEventSubscription.f151715c) && sdg.m34949a(this.f151714b, semanticLocationEventSubscription.f151714b) && sdg.m34949a(this.f151713a.f109581c, semanticLocationEventSubscription.f151713a.f109581c) && sdg.m34949a(Integer.valueOf(this.f151713a.f109582d), Integer.valueOf(semanticLocationEventSubscription.f151713a.f109582d)) && sdg.m34949a(Integer.valueOf(this.f151713a.f109580b), Integer.valueOf(semanticLocationEventSubscription.f151713a.f109580b));
        }
    }
}
