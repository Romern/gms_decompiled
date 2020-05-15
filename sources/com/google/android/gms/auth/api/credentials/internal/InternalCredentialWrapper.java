package com.google.android.gms.auth.api.credentials.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InternalCredentialWrapper extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new hiq();

    /* renamed from: a */
    public final Credential f10139a;

    /* renamed from: b */
    public final Account f10140b;

    public InternalCredentialWrapper(Credential credential, Account account) {
        sdo.m34959a(credential);
        this.f10139a = credential;
        this.f10140b = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InternalCredentialWrapper) {
            InternalCredentialWrapper internalCredentialWrapper = (InternalCredentialWrapper) obj;
            return sdg.m34949a(this.f10139a, internalCredentialWrapper.f10139a) && sdg.m34949a(this.f10140b, internalCredentialWrapper.f10140b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10139a, this.f10140b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f10139a, i, false);
        see.m35040a(parcel, 2, this.f10140b, i, false);
        see.m35062b(parcel, a);
    }
}
