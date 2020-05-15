package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppVisibleCustomProperties extends AbstractSafeParcelable implements Iterable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new uyq();

    /* renamed from: a */
    public static final AppVisibleCustomProperties f31066a = new uyp().mo28111a();

    /* renamed from: b */
    public final List f31067b;

    public AppVisibleCustomProperties(Collection collection) {
        sdo.m34959a(collection);
        this.f31067b = new ArrayList(collection);
    }

    /* renamed from: a */
    public final Map mo18261a() {
        HashMap hashMap = new HashMap(this.f31067b.size());
        List list = this.f31067b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CustomProperty customProperty = (CustomProperty) list.get(i);
            hashMap.put(customProperty.f31068a, customProperty.f31069b);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return mo18261a().equals(((AppVisibleCustomProperties) obj).mo18261a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31067b});
    }

    public final Iterator iterator() {
        return this.f31067b.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35066c(parcel, 2, this.f31067b, false);
        see.m35062b(parcel, a);
    }
}
