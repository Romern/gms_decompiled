package com.google.android.gms.walletp2p.internal.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class CheckRecipientEligibilityRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axms();

    /* renamed from: a */
    public final ArrayList f110777a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f110778b = new ArrayList();

    public CheckRecipientEligibilityRequest(List list, List list2) {
        if (list.size() == list2.size()) {
            this.f110777a.addAll(list);
            this.f110778b.addAll(list2);
            return;
        }
        throw new InvalidParameterException();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 1, this.f110777a, false);
        see.m35065b(parcel, 2, this.f110778b, false);
        see.m35062b(parcel, a);
    }
}
