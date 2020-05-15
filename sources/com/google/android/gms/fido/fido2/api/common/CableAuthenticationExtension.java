package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CableAuthenticationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xpq();

    /* renamed from: a */
    public final List f31741a;

    public CableAuthenticationExtension(List list) {
        sdo.m34959a(list);
        this.f31741a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CableAuthenticationExtension) {
            CableAuthenticationExtension cableAuthenticationExtension = (CableAuthenticationExtension) obj;
            if (!this.f31741a.containsAll(cableAuthenticationExtension.f31741a) || !cableAuthenticationExtension.f31741a.containsAll(this.f31741a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f31741a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 1, this.f31741a, false);
        see.m35062b(parcel, a);
    }
}
