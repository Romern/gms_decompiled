package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StringList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brri();

    /* renamed from: a */
    public final int f152554a;

    /* renamed from: b */
    public List f152555b;

    public StringList() {
        this(null);
    }

    /* renamed from: a */
    public static StringList m118907a() {
        return new StringList(null);
    }

    public StringList(int i, List list) {
        this.f152554a = i;
        if (list == null || list.isEmpty()) {
            this.f152555b = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, stm.m36300b((String) list.get(i2)));
        }
        this.f152555b = Collections.unmodifiableList(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f152554a);
        see.m35065b(parcel, 2, this.f152555b, false);
        see.m35062b(parcel, a);
    }

    public StringList(List list) {
        this.f152554a = 1;
        this.f152555b = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.f152555b.addAll(list);
        }
    }
}
