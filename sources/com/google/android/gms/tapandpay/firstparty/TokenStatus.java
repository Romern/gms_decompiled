package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aspa();

    /* renamed from: a */
    public TokenReference f108458a;

    /* renamed from: b */
    public int f108459b;

    /* renamed from: c */
    public boolean f108460c;

    public TokenStatus(TokenReference tokenReference, int i, boolean z) {
        this.f108458a = tokenReference;
        this.f108459b = i;
        this.f108460c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            return sdg.m34949a(this.f108458a, tokenStatus.f108458a) && this.f108459b == tokenStatus.f108459b && this.f108460c == tokenStatus.f108460c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108458a, Integer.valueOf(this.f108459b), Boolean.valueOf(this.f108460c)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("tokenReference", this.f108458a);
        a.mo25396a("tokenState", Integer.valueOf(this.f108459b));
        a.mo25396a("isSelected", Boolean.valueOf(this.f108460c));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f108458a, i, false);
        see.m35063b(parcel, 3, this.f108459b);
        see.m35051a(parcel, 4, this.f108460c);
        see.m35062b(parcel, a);
    }
}
