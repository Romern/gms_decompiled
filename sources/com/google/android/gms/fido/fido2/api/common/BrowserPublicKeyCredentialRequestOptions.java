package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR = new xpm();

    /* renamed from: a */
    public final PublicKeyCredentialRequestOptions f31734a;

    /* renamed from: b */
    public final Uri f31735b;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri) {
        sdo.m34959a(publicKeyCredentialRequestOptions);
        this.f31734a = publicKeyCredentialRequestOptions;
        m23463a(uri);
        this.f31735b = uri;
    }

    /* renamed from: a */
    public static void m23463a(Uri uri) {
        boolean z;
        sdo.m34959a(uri);
        boolean z2 = true;
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "origin scheme must be non-empty");
        if (uri.getAuthority() == null) {
            z2 = false;
        }
        sdo.m34975b(z2, "origin authority must be non-empty");
    }

    /* renamed from: a */
    public final byte[] mo18682a() {
        return this.f31734a.f31781a;
    }

    /* renamed from: b */
    public final Double mo18683b() {
        return this.f31734a.f31782b;
    }

    /* renamed from: c */
    public final Integer mo18684c() {
        return this.f31734a.f31785e;
    }

    /* renamed from: d */
    public final TokenBinding mo18685d() {
        return this.f31734a.f31786f;
    }

    /* renamed from: e */
    public final AuthenticationExtensions mo18686e() {
        return this.f31734a.f31788h;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BrowserPublicKeyCredentialRequestOptions) {
            BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
            if (!sdg.m34949a(this.f31734a, browserPublicKeyCredentialRequestOptions.f31734a) || !sdg.m34949a(this.f31735b, browserPublicKeyCredentialRequestOptions.f31735b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Uri mo18688f() {
        return this.f31735b;
    }

    /* renamed from: g */
    public final byte[] mo18689g() {
        return sef.m35074a(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31734a, this.f31735b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31734a, i, false);
        see.m35040a(parcel, 3, this.f31735b, i, false);
        see.m35062b(parcel, a);
    }
}
