package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Set;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserRegisterRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator CREATOR = new xxu();

    /* renamed from: a */
    public final RegisterRequestParams f31887a;

    /* renamed from: b */
    public final Uri f31888b;

    public BrowserRegisterRequestParams(RegisterRequestParams registerRequestParams, Uri uri) {
        boolean z;
        sdo.m34959a(registerRequestParams);
        this.f31887a = registerRequestParams;
        sdo.m34959a(uri);
        boolean z2 = true;
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "origin scheme must be non-empty");
        sdo.m34975b(uri.getAuthority() == null ? false : z2, "origin authority must be non-empty");
        this.f31888b = uri;
    }

    /* renamed from: a */
    public final Integer mo18800a() {
        return this.f31887a.f31923a;
    }

    /* renamed from: b */
    public final Double mo18801b() {
        return this.f31887a.f31924b;
    }

    /* renamed from: c */
    public final Set mo18802c() {
        return this.f31887a.f31930h;
    }

    /* renamed from: d */
    public final ChannelIdValue mo18803d() {
        return this.f31887a.f31928f;
    }

    /* renamed from: e */
    public final Uri mo18804e() {
        return this.f31888b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserRegisterRequestParams) {
            BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) obj;
            return sdg.m34949a(this.f31887a, browserRegisterRequestParams.f31887a) && sdg.m34949a(this.f31888b, browserRegisterRequestParams.f31888b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31887a, this.f31888b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31887a, i, false);
        see.m35040a(parcel, 3, this.f31888b, i, false);
        see.m35062b(parcel, a);
    }
}
