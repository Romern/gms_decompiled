package com.google.android.gms.plus.model.posts;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.Audience;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Post extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anxs();

    /* renamed from: a */
    public final int f82551a;

    /* renamed from: b */
    public final String f82552b;

    /* renamed from: c */
    public final List f82553c;

    /* renamed from: d */
    public final Uri f82554d;

    /* renamed from: e */
    public final String f82555e;

    /* renamed from: f */
    public final String f82556f;

    /* renamed from: g */
    public final String f82557g;

    /* renamed from: h */
    public final Bundle f82558h;

    /* renamed from: i */
    public final Bundle f82559i;

    /* renamed from: j */
    public final String f82560j;

    /* renamed from: k */
    public final String f82561k;

    /* renamed from: l */
    public final Audience f82562l;

    /* renamed from: m */
    private final Boolean f82563m;

    public Post(int i, String str, List list, Uri uri, String str2, String str3, String str4, Bundle bundle, Bundle bundle2, String str5, boolean z, String str6, Audience audience) {
        this.f82551a = i;
        this.f82552b = str;
        this.f82553c = list;
        this.f82554d = uri;
        this.f82555e = str2;
        this.f82556f = str3;
        this.f82557g = str4;
        this.f82558h = bundle;
        this.f82559i = bundle2;
        this.f82560j = str5;
        this.f82563m = Boolean.valueOf(z);
        this.f82561k = str6;
        this.f82562l = audience;
    }

    /* renamed from: a */
    public final boolean mo46615a() {
        Uri uri = this.f82554d;
        return uri != null && !TextUtils.isEmpty(uri.toString());
    }

    /* renamed from: b */
    public final boolean mo46616b() {
        return !TextUtils.isEmpty(this.f82555e);
    }

    /* renamed from: c */
    public final boolean mo46617c() {
        Bundle bundle = this.f82558h;
        return bundle != null && !bundle.isEmpty();
    }

    /* renamed from: d */
    public final boolean mo46618d() {
        return this.f82563m.booleanValue();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Post) {
            Post post = (Post) obj;
            if (this.f82551a == post.f82551a && sdg.m34949a(this.f82562l, post.f82562l) && sdg.m34949a(this.f82553c, post.f82553c) && sdg.m34949a(this.f82554d, post.f82554d) && sdg.m34949a(this.f82555e, post.f82555e) && sdg.m34949a(this.f82556f, post.f82556f) && sdg.m34949a(this.f82557g, post.f82557g) && sdg.m34949a(this.f82560j, post.f82560j)) {
                Boolean bool = this.f82563m;
                if (!post.f82563m.booleanValue() || !sdg.m34949a(this.f82561k, post.f82561k)) {
                    z = false;
                } else {
                    z = true;
                }
                if (sdg.m34949a(bool, Boolean.valueOf(z))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82551a), this.f82562l, this.f82553c, this.f82554d, this.f82555e, this.f82556f, this.f82557g, this.f82560j, this.f82563m, this.f82561k});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
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
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
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
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f82552b, false);
        see.m35066c(parcel, 3, this.f82553c, false);
        see.m35040a(parcel, 4, this.f82554d, i, false);
        see.m35046a(parcel, 5, this.f82555e, false);
        see.m35046a(parcel, 6, this.f82556f, false);
        see.m35046a(parcel, 7, this.f82557g, false);
        see.m35037a(parcel, 8, this.f82558h, false);
        see.m35037a(parcel, 9, this.f82559i, false);
        see.m35046a(parcel, 10, this.f82560j, false);
        see.m35041a(parcel, 11, Boolean.valueOf(mo46618d()));
        see.m35046a(parcel, 12, this.f82561k, false);
        see.m35040a(parcel, 13, this.f82562l, i, false);
        see.m35063b(parcel, 1000, this.f82551a);
        see.m35062b(parcel, a);
    }

    public Post(String str, List list, Uri uri, String str2, String str3, String str4, Bundle bundle, Bundle bundle2, String str5, Boolean bool, String str6, Audience audience) {
        this(1, str, list, uri, str2, str3, str4, bundle, bundle2, str5, bool.booleanValue(), str6, audience);
    }
}
