package com.google.android.userlocation;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.places.Subscription;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LegacySemanticLocationEventSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new bjdc();

    /* renamed from: a */
    public static final SemanticLocationEventRequest f151708a;

    /* renamed from: b */
    public final SemanticLocationEventRequest f151709b;

    /* renamed from: c */
    public final PlacesParams f151710c;

    /* renamed from: d */
    public final PendingIntent f151711d;

    /* renamed from: e */
    public final PendingIntent f151712e;

    static {
        avwg avwg = new avwg();
        avwg.mo51669a("unused");
        avwg.mo51668a(1);
        avwg.mo51668a(2);
        f151708a = avwg.mo51667a();
    }

    public LegacySemanticLocationEventSubscription(SemanticLocationEventRequest semanticLocationEventRequest, PlacesParams placesParams, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.f151709b = semanticLocationEventRequest;
        this.f151710c = placesParams;
        this.f151711d = pendingIntent;
        this.f151712e = pendingIntent2;
    }

    /* renamed from: a */
    private static String m118331a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        String creatorPackage = pendingIntent.getCreatorPackage();
        StringBuilder sb = new StringBuilder(String.valueOf(creatorPackage).length() + 30);
        sb.append("PendingIntent{creatorPackage=");
        sb.append(creatorPackage);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacySemanticLocationEventSubscription) {
            return this.f151712e.equals(((LegacySemanticLocationEventSubscription) obj).f151712e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f151712e});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("request", this.f151709b);
        a.mo25396a("params", this.f151710c);
        a.mo25396a("callbackIntent", m118331a(this.f151711d));
        a.mo25396a("keyIntent", m118331a(this.f151712e));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f151709b, i, false);
        see.m35040a(parcel, 2, this.f151710c, i, false);
        see.m35040a(parcel, 3, this.f151711d, i, false);
        see.m35040a(parcel, 4, this.f151712e, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final bhqe mo70889a(Context context, bhrd bhrd, bhpw bhpw) {
        String str = this.f151710c.f79572b;
        return new bjdg(bhpw.f119280b, spn.m35897i(context, str), str, this.f151710c.f79574d, bjdk.m103237a(this.f151709b.f109580b), cggy.m145391b(), new bidb(new bjdb(this, context, bhrd), this.f151709b));
    }

    /* renamed from: a */
    public final Status mo70890a(int i) {
        if (i < ((int) cggm.m145260f())) {
            return rjs.m33682h(0);
        }
        if (Log.isLoggable("Places", 6)) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Too many subscription added: ");
            sb.append(i);
            Log.e("Places", sb.toString());
        }
        return rjs.m33682h(26002);
    }

    /* renamed from: a */
    public final String mo70891a() {
        int i = Build.VERSION.SDK_INT;
        return this.f151712e.getCreatorPackage();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71739a(Context context, bhrd bhrd, bhqz bhqz) {
        Intent a = avwf.m79457a(null, bjdk.m103242a(bhqz, this.f151709b.f109581c.f109561b)).mo51666a();
        a.putExtra("com.google.android.gms.userlocation.SemanticLocationEvent.LEGACY_CALL_INTENT_EXTRA", this.f151712e);
        a.putExtra("com.google.android.gms.userlocation.SemanticLocationEvent.LEGACY_CALL_USE_HIERARCHIES_EXTRA", this.f151709b.f109581c.f109561b);
        try {
            bidk.m102023a(context, a, this.f151711d);
        } catch (PendingIntent.CanceledException e) {
            ((bhri) bhrd).mo64183a((Subscription) this);
        }
    }

    /* renamed from: a */
    public final boolean mo70892a(Subscription subscription) {
        if (this == subscription) {
            return true;
        }
        if (subscription instanceof LegacySemanticLocationEventSubscription) {
            LegacySemanticLocationEventSubscription legacySemanticLocationEventSubscription = (LegacySemanticLocationEventSubscription) subscription;
            return sdg.m34949a(this.f151712e, legacySemanticLocationEventSubscription.f151712e) && sdg.m34949a(this.f151709b.f109581c, legacySemanticLocationEventSubscription.f151709b.f109581c) && sdg.m34949a(Integer.valueOf(this.f151709b.f109580b), Integer.valueOf(legacySemanticLocationEventSubscription.f151709b.f109580b)) && sdg.m34949a(Integer.valueOf(this.f151709b.f109582d), Integer.valueOf(legacySemanticLocationEventSubscription.f151709b.f109582d)) && sdg.m34949a(this.f151710c, legacySemanticLocationEventSubscription.f151710c);
        }
    }
}
