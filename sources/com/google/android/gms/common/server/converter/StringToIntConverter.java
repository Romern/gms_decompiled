package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StringToIntConverter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sih();

    /* renamed from: a */
    final int f30307a;

    /* renamed from: b */
    public final HashMap f30308b;

    /* renamed from: c */
    public final SparseArray f30309c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new sii();

        /* renamed from: a */
        final int f30310a;

        /* renamed from: b */
        final String f30311b;

        /* renamed from: c */
        final int f30312c;

        public Entry(int i, String str, int i2) {
            this.f30310a = i;
            this.f30311b = str;
            this.f30312c = i2;
        }

        public Entry(String str, int i) {
            this.f30310a = 1;
            this.f30311b = str;
            this.f30312c = i;
        }

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
         arg types: [android.os.Parcel, int, java.lang.String, int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 1, this.f30310a);
            see.m35046a(parcel, 2, this.f30311b, false);
            see.m35063b(parcel, 3, this.f30312c);
            see.m35062b(parcel, a);
        }
    }

    public StringToIntConverter() {
        this.f30307a = 1;
        this.f30308b = new HashMap();
        this.f30309c = new SparseArray();
    }

    /* renamed from: a */
    public final void mo17854a(String str, int i) {
        this.f30308b.put(str, Integer.valueOf(i));
        this.f30309c.put(i, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30307a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f30308b.keySet()) {
            arrayList.add(new Entry(str, ((Integer) this.f30308b.get(str)).intValue()));
        }
        see.m35066c(parcel, 2, arrayList, false);
        see.m35062b(parcel, a);
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.f30307a = i;
        this.f30308b = new HashMap();
        this.f30309c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            mo17854a(entry.f30311b, entry.f30312c);
        }
    }
}
