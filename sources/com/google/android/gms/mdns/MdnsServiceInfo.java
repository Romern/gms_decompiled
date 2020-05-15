package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdnsServiceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agbc();

    /* renamed from: a */
    public final String f80071a;

    /* renamed from: b */
    public final String[] f80072b;

    /* renamed from: c */
    public final List f80073c;

    /* renamed from: d */
    public final String[] f80074d;

    /* renamed from: e */
    public final int f80075e;

    /* renamed from: f */
    public final String f80076f;

    /* renamed from: g */
    public final String f80077g;

    /* renamed from: h */
    List f80078h;

    /* renamed from: i */
    public final Map f80079i = new HashMap();

    public MdnsServiceInfo(String str, String[] strArr, List list, String[] strArr2, int i, String str2, String str3, List list2) {
        this.f80071a = str;
        this.f80072b = strArr;
        ArrayList arrayList = new ArrayList();
        this.f80073c = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f80074d = strArr2;
        this.f80075e = i;
        this.f80076f = str2;
        this.f80077g = str3;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                int indexOf = str4.indexOf(61);
                if (indexOf > 0) {
                    this.f80079i.put(str4.substring(0, indexOf).toLowerCase(Locale.ENGLISH), str4.substring(indexOf + 1));
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo43969a(String str) {
        return (String) this.f80079i.get(str.toLowerCase(Locale.ENGLISH));
    }

    public final String toString() {
        return String.format(Locale.ROOT, "Name: %s, subtypes: %s, ip: %s, port: %d", this.f80071a, TextUtils.join(",", this.f80073c), this.f80076f, Integer.valueOf(this.f80075e));
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String[], boolean):void
     arg types: [android.os.Parcel, int, java.lang.String[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f80078h == null) {
            this.f80078h = new ArrayList(this.f80079i.size());
            for (Map.Entry entry : this.f80079i.entrySet()) {
                this.f80078h.add(String.format(Locale.ROOT, "%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f80071a, false);
        see.m35058a(parcel, 3, this.f80072b, false);
        see.m35065b(parcel, 4, mo43970a(), false);
        see.m35058a(parcel, 5, this.f80074d, false);
        see.m35063b(parcel, 6, this.f80075e);
        see.m35046a(parcel, 7, this.f80076f, false);
        see.m35046a(parcel, 8, this.f80077g, false);
        see.m35065b(parcel, 9, this.f80078h, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final List mo43970a() {
        return new ArrayList(this.f80073c);
    }
}
