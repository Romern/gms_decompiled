package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR = new xpk();

    /* renamed from: a */
    public final PublicKeyCredentialCreationOptions f31732a;

    /* renamed from: b */
    public final Uri f31733b;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri) {
        boolean z;
        sdo.m34959a(publicKeyCredentialCreationOptions);
        this.f31732a = publicKeyCredentialCreationOptions;
        sdo.m34959a(uri);
        boolean z2 = true;
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "origin scheme must be non-empty");
        sdo.m34975b(uri.getAuthority() == null ? false : z2, "origin authority must be non-empty");
        this.f31733b = uri;
    }

    /* renamed from: a */
    public final byte[] mo18682a() {
        return this.f31732a.f31766c;
    }

    /* renamed from: b */
    public final Double mo18683b() {
        return this.f31732a.f31768e;
    }

    /* renamed from: c */
    public final Integer mo18684c() {
        return this.f31732a.f31771h;
    }

    /* renamed from: d */
    public final TokenBinding mo18685d() {
        return this.f31732a.f31772i;
    }

    /* renamed from: e */
    public final AuthenticationExtensions mo18686e() {
        return this.f31732a.f31774k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BrowserPublicKeyCredentialCreationOptions) {
            BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
            if (!sdg.m34949a(this.f31732a, browserPublicKeyCredentialCreationOptions.f31732a) || !sdg.m34949a(this.f31733b, browserPublicKeyCredentialCreationOptions.f31733b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Uri mo18688f() {
        return this.f31733b;
    }

    /* renamed from: g */
    public final byte[] mo18689g() {
        return sef.m35074a(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31732a, this.f31733b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f31732a, i, false);
        see.m35040a(parcel, 3, this.f31733b, i, false);
        see.m35062b(parcel, a);
    }
}
