package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlaceIdCollection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aemm();

    /* renamed from: a */
    public final List f79506a;

    public PlaceIdCollection(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = (String) list.get(i);
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            if (hashSet.isEmpty()) {
                throw new IllegalArgumentException("Empty list of Place IDs is not valid.");
            } else if (hashSet.size() <= 10) {
                this.f79506a = Collections.unmodifiableList(new ArrayList(hashSet));
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "No more than %d place IDs are permitted in a single PlaceIdCollection, but %d were specified.", 10, Integer.valueOf(hashSet.size())));
            }
        } else {
            throw new NullPointerException("Null list of place IDs is not valid.");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35065b(parcel, 1, this.f79506a, false);
        see.m35062b(parcel, a);
    }
}
