package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserSignRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator CREATOR = new xxw();

    /* renamed from: a */
    public final SignRequestParams f31889a;

    /* renamed from: b */
    public final Uri f31890b;

    public BrowserSignRequestParams(SignRequestParams signRequestParams, Uri uri) {
        boolean z;
        sdo.m34959a(signRequestParams);
        this.f31889a = signRequestParams;
        sdo.m34959a(uri);
        boolean z2 = true;
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "origin scheme must be non-empty");
        sdo.m34975b(uri.getAuthority() == null ? false : z2, "origin authority must be non-empty");
        this.f31890b = uri;
    }

    /* renamed from: a */
    public final Integer mo18800a() {
        return this.f31889a.f31937a;
    }

    /* renamed from: b */
    public final Double mo18801b() {
        return this.f31889a.f31938b;
    }

    /* renamed from: c */
    public final Set mo18802c() {
        return this.f31889a.f31944h;
    }

    /* renamed from: d */
    public final ChannelIdValue mo18803d() {
        return this.f31889a.f31942f;
    }

    /* renamed from: e */
    public final Uri mo18804e() {
        return this.f31890b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserSignRequestParams) {
            BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) obj;
            return sdg.m34949a(this.f31889a, browserSignRequestParams.f31889a) && sdg.m34949a(this.f31890b, browserSignRequestParams.f31890b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31889a, this.f31890b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31889a, i, false);
        see.m35040a(parcel, 3, this.f31890b, i, false);
        see.m35062b(parcel, a);
    }
}
