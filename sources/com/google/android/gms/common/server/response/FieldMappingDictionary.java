package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FieldMappingDictionary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new sjd();

    /* renamed from: a */
    final int f30324a;

    /* renamed from: b */
    public final HashMap f30325b;

    /* renamed from: c */
    public final String f30326c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new sje();

        /* renamed from: a */
        final int f30327a;

        /* renamed from: b */
        final String f30328b;

        /* renamed from: c */
        final ArrayList f30329c;

        public Entry(int i, String str, ArrayList arrayList) {
            this.f30327a = i;
            this.f30328b = str;
            this.f30329c = arrayList;
        }

        public Entry(String str, Map map) {
            ArrayList arrayList;
            this.f30327a = 1;
            this.f30328b = str;
            if (map != null) {
                arrayList = new ArrayList();
                for (String str2 : map.keySet()) {
                    arrayList.add(new FieldMapPair(str2, (FastJsonResponse$Field) map.get(str2)));
                }
            } else {
                arrayList = null;
            }
            this.f30329c = arrayList;
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
            see.m35063b(parcel, 1, this.f30327a);
            see.m35046a(parcel, 2, this.f30328b, false);
            see.m35066c(parcel, 3, this.f30329c, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FieldMapPair extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new sjc();

        /* renamed from: a */
        final int f30330a;

        /* renamed from: b */
        final String f30331b;

        /* renamed from: c */
        final FastJsonResponse$Field f30332c;

        public FieldMapPair(int i, String str, FastJsonResponse$Field fastJsonResponse$Field) {
            this.f30330a = i;
            this.f30331b = str;
            this.f30332c = fastJsonResponse$Field;
        }

        public FieldMapPair(String str, FastJsonResponse$Field fastJsonResponse$Field) {
            this.f30330a = 1;
            this.f30331b = str;
            this.f30332c = fastJsonResponse$Field;
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
            see.m35063b(parcel, 1, this.f30330a);
            see.m35046a(parcel, 2, this.f30331b, false);
            see.m35040a(parcel, 3, this.f30332c, i, false);
            see.m35062b(parcel, a);
        }
    }

    public FieldMappingDictionary(int i, ArrayList arrayList, String str) {
        this.f30324a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            String str2 = entry.f30328b;
            HashMap hashMap2 = new HashMap();
            int size2 = entry.f30329c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                FieldMapPair fieldMapPair = (FieldMapPair) entry.f30329c.get(i3);
                hashMap2.put(fieldMapPair.f30331b, fieldMapPair.f30332c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f30325b = hashMap;
        sdo.m34959a((Object) str);
        this.f30326c = str;
        mo17867a();
    }

    /* renamed from: a */
    public final Map mo17866a(String str) {
        return (Map) this.f30325b.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f30325b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f30325b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo17867a() {
        for (String str : this.f30325b.keySet()) {
            Map map = (Map) this.f30325b.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse$Field) map.get(str2)).f30322j = this;
            }
        }
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
        see.m35063b(parcel, 1, this.f30324a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f30325b.keySet()) {
            arrayList.add(new Entry(str, (Map) this.f30325b.get(str)));
        }
        see.m35066c(parcel, 2, arrayList, false);
        see.m35046a(parcel, 3, this.f30326c, false);
        see.m35062b(parcel, a);
    }

    public FieldMappingDictionary(Class cls) {
        this.f30324a = 1;
        this.f30325b = new HashMap();
        this.f30326c = cls.getCanonicalName();
    }
}
