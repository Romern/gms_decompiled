package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avyg();

    /* renamed from: a */
    public int f109607a;

    /* renamed from: b */
    public String f109608b;

    /* renamed from: c */
    public String f109609c;

    /* renamed from: d */
    public int f109610d;

    /* renamed from: e */
    public Point[] f109611e;

    /* renamed from: f */
    public Email f109612f;

    /* renamed from: g */
    public Phone f109613g;

    /* renamed from: h */
    public Sms f109614h;

    /* renamed from: i */
    public WiFi f109615i;

    /* renamed from: j */
    public UrlBookmark f109616j;

    /* renamed from: k */
    public GeoPoint f109617k;

    /* renamed from: l */
    public CalendarEvent f109618l;

    /* renamed from: m */
    public ContactInfo f109619m;

    /* renamed from: n */
    public DriverLicense f109620n;

    /* renamed from: o */
    public byte[] f109621o;

    /* renamed from: p */
    public boolean f109622p;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyf();

        /* renamed from: a */
        public int f109623a;

        /* renamed from: b */
        public String[] f109624b;

        public Address() {
        }

        public Address(int i, String[] strArr) {
            this.f109623a = i;
            this.f109624b = strArr;
        }

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
            int a = see.m35030a(parcel);
            see.m35063b(parcel, 2, this.f109623a);
            see.m35058a(parcel, 3, this.f109624b, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyj();

        /* renamed from: a */
        public int f109625a;

        /* renamed from: b */
        public int f109626b;

        /* renamed from: c */
        public int f109627c;

        /* renamed from: d */
        public int f109628d;

        /* renamed from: e */
        public int f109629e;

        /* renamed from: f */
        public int f109630f;

        /* renamed from: g */
        public boolean f109631g;

        /* renamed from: h */
        public String f109632h;

        public CalendarDateTime() {
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.f109625a = i;
            this.f109626b = i2;
            this.f109627c = i3;
            this.f109628d = i4;
            this.f109629e = i5;
            this.f109630f = i6;
            this.f109631g = z;
            this.f109632h = str;
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
            see.m35063b(parcel, 2, this.f109625a);
            see.m35063b(parcel, 3, this.f109626b);
            see.m35063b(parcel, 4, this.f109627c);
            see.m35063b(parcel, 5, this.f109628d);
            see.m35063b(parcel, 6, this.f109629e);
            see.m35063b(parcel, 7, this.f109630f);
            see.m35051a(parcel, 8, this.f109631g);
            see.m35046a(parcel, 9, this.f109632h, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyk();

        /* renamed from: a */
        public String f109633a;

        /* renamed from: b */
        public String f109634b;

        /* renamed from: c */
        public String f109635c;

        /* renamed from: d */
        public String f109636d;

        /* renamed from: e */
        public String f109637e;

        /* renamed from: f */
        public CalendarDateTime f109638f;

        /* renamed from: g */
        public CalendarDateTime f109639g;

        public CalendarEvent() {
        }

        public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.f109633a = str;
            this.f109634b = str2;
            this.f109635c = str3;
            this.f109636d = str4;
            this.f109637e = str5;
            this.f109638f = calendarDateTime;
            this.f109639g = calendarDateTime2;
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
            see.m35046a(parcel, 2, this.f109633a, false);
            see.m35046a(parcel, 3, this.f109634b, false);
            see.m35046a(parcel, 4, this.f109635c, false);
            see.m35046a(parcel, 5, this.f109636d, false);
            see.m35046a(parcel, 6, this.f109637e, false);
            see.m35040a(parcel, 7, this.f109638f, i, false);
            see.m35040a(parcel, 8, this.f109639g, i, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyl();

        /* renamed from: a */
        public PersonName f109640a;

        /* renamed from: b */
        public String f109641b;

        /* renamed from: c */
        public String f109642c;

        /* renamed from: d */
        public Phone[] f109643d;

        /* renamed from: e */
        public Email[] f109644e;

        /* renamed from: f */
        public String[] f109645f;

        /* renamed from: g */
        public Address[] f109646g;

        public ContactInfo() {
        }

        public ContactInfo(PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.f109640a = personName;
            this.f109641b = str;
            this.f109642c = str2;
            this.f109643d = phoneArr;
            this.f109644e = emailArr;
            this.f109645f = strArr;
            this.f109646g = addressArr;
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
            int a = see.m35030a(parcel);
            see.m35040a(parcel, 2, this.f109640a, i, false);
            see.m35046a(parcel, 3, this.f109641b, false);
            see.m35046a(parcel, 4, this.f109642c, false);
            see.m35057a(parcel, 5, this.f109643d, i);
            see.m35057a(parcel, 6, this.f109644e, i);
            see.m35058a(parcel, 7, this.f109645f, false);
            see.m35057a(parcel, 8, this.f109646g, i);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avym();

        /* renamed from: a */
        public String f109647a;

        /* renamed from: b */
        public String f109648b;

        /* renamed from: c */
        public String f109649c;

        /* renamed from: d */
        public String f109650d;

        /* renamed from: e */
        public String f109651e;

        /* renamed from: f */
        public String f109652f;

        /* renamed from: g */
        public String f109653g;

        /* renamed from: h */
        public String f109654h;

        /* renamed from: i */
        public String f109655i;

        /* renamed from: j */
        public String f109656j;

        /* renamed from: k */
        public String f109657k;

        /* renamed from: l */
        public String f109658l;

        /* renamed from: m */
        public String f109659m;

        /* renamed from: n */
        public String f109660n;

        public DriverLicense() {
        }

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f109647a = str;
            this.f109648b = str2;
            this.f109649c = str3;
            this.f109650d = str4;
            this.f109651e = str5;
            this.f109652f = str6;
            this.f109653g = str7;
            this.f109654h = str8;
            this.f109655i = str9;
            this.f109656j = str10;
            this.f109657k = str11;
            this.f109658l = str12;
            this.f109659m = str13;
            this.f109660n = str14;
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
            see.m35046a(parcel, 2, this.f109647a, false);
            see.m35046a(parcel, 3, this.f109648b, false);
            see.m35046a(parcel, 4, this.f109649c, false);
            see.m35046a(parcel, 5, this.f109650d, false);
            see.m35046a(parcel, 6, this.f109651e, false);
            see.m35046a(parcel, 7, this.f109652f, false);
            see.m35046a(parcel, 8, this.f109653g, false);
            see.m35046a(parcel, 9, this.f109654h, false);
            see.m35046a(parcel, 10, this.f109655i, false);
            see.m35046a(parcel, 11, this.f109656j, false);
            see.m35046a(parcel, 12, this.f109657k, false);
            see.m35046a(parcel, 13, this.f109658l, false);
            see.m35046a(parcel, 14, this.f109659m, false);
            see.m35046a(parcel, 15, this.f109660n, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyn();

        /* renamed from: a */
        public int f109661a;

        /* renamed from: b */
        public String f109662b;

        /* renamed from: c */
        public String f109663c;

        /* renamed from: d */
        public String f109664d;

        public Email() {
        }

        public Email(int i, String str, String str2, String str3) {
            this.f109661a = i;
            this.f109662b = str;
            this.f109663c = str2;
            this.f109664d = str3;
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
            see.m35063b(parcel, 2, this.f109661a);
            see.m35046a(parcel, 3, this.f109662b, false);
            see.m35046a(parcel, 4, this.f109663c, false);
            see.m35046a(parcel, 5, this.f109664d, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyo();

        /* renamed from: a */
        public double f109665a;

        /* renamed from: b */
        public double f109666b;

        public GeoPoint() {
        }

        public GeoPoint(double d, double d2) {
            this.f109665a = d;
            this.f109666b = d2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35033a(parcel, 2, this.f109665a);
            see.m35033a(parcel, 3, this.f109666b);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyp();

        /* renamed from: a */
        public String f109667a;

        /* renamed from: b */
        public String f109668b;

        /* renamed from: c */
        public String f109669c;

        /* renamed from: d */
        public String f109670d;

        /* renamed from: e */
        public String f109671e;

        /* renamed from: f */
        public String f109672f;

        /* renamed from: g */
        public String f109673g;

        public PersonName() {
        }

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f109667a = str;
            this.f109668b = str2;
            this.f109669c = str3;
            this.f109670d = str4;
            this.f109671e = str5;
            this.f109672f = str6;
            this.f109673g = str7;
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
            see.m35046a(parcel, 2, this.f109667a, false);
            see.m35046a(parcel, 3, this.f109668b, false);
            see.m35046a(parcel, 4, this.f109669c, false);
            see.m35046a(parcel, 5, this.f109670d, false);
            see.m35046a(parcel, 6, this.f109671e, false);
            see.m35046a(parcel, 7, this.f109672f, false);
            see.m35046a(parcel, 8, this.f109673g, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyq();

        /* renamed from: a */
        public int f109674a;

        /* renamed from: b */
        public String f109675b;

        public Phone() {
        }

        public Phone(int i, String str) {
            this.f109674a = i;
            this.f109675b = str;
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
            see.m35063b(parcel, 2, this.f109674a);
            see.m35046a(parcel, 3, this.f109675b, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyr();

        /* renamed from: a */
        public String f109676a;

        /* renamed from: b */
        public String f109677b;

        public Sms() {
        }

        public Sms(String str, String str2) {
            this.f109676a = str;
            this.f109677b = str2;
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
            see.m35046a(parcel, 2, this.f109676a, false);
            see.m35046a(parcel, 3, this.f109677b, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avys();

        /* renamed from: a */
        public String f109678a;

        /* renamed from: b */
        public String f109679b;

        public UrlBookmark() {
        }

        public UrlBookmark(String str, String str2) {
            this.f109678a = str;
            this.f109679b = str2;
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
            see.m35046a(parcel, 2, this.f109678a, false);
            see.m35046a(parcel, 3, this.f109679b, false);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avyt();

        /* renamed from: a */
        public String f109680a;

        /* renamed from: b */
        public String f109681b;

        /* renamed from: c */
        public int f109682c;

        public WiFi() {
        }

        public WiFi(String str, String str2, int i) {
            this.f109680a = str;
            this.f109681b = str2;
            this.f109682c = i;
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
            see.m35046a(parcel, 2, this.f109680a, false);
            see.m35046a(parcel, 3, this.f109681b, false);
            see.m35063b(parcel, 4, this.f109682c);
            see.m35062b(parcel, a);
        }
    }

    public Barcode() {
    }

    public Barcode(int i, String str, String str2, int i2, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense, byte[] bArr, boolean z) {
        this.f109607a = i;
        this.f109608b = str;
        this.f109621o = bArr;
        this.f109609c = str2;
        this.f109610d = i2;
        this.f109611e = pointArr;
        this.f109622p = z;
        this.f109612f = email;
        this.f109613g = phone;
        this.f109614h = sms;
        this.f109615i = wiFi;
        this.f109616j = urlBookmark;
        this.f109617k = geoPoint;
        this.f109618l = calendarEvent;
        this.f109619m = contactInfo;
        this.f109620n = driverLicense;
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
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f109607a);
        see.m35046a(parcel, 3, this.f109608b, false);
        see.m35046a(parcel, 4, this.f109609c, false);
        see.m35063b(parcel, 5, this.f109610d);
        see.m35057a(parcel, 6, this.f109611e, i);
        see.m35040a(parcel, 7, this.f109612f, i, false);
        see.m35040a(parcel, 8, this.f109613g, i, false);
        see.m35040a(parcel, 9, this.f109614h, i, false);
        see.m35040a(parcel, 10, this.f109615i, i, false);
        see.m35040a(parcel, 11, this.f109616j, i, false);
        see.m35040a(parcel, 12, this.f109617k, i, false);
        see.m35040a(parcel, 13, this.f109618l, i, false);
        see.m35040a(parcel, 14, this.f109619m, i, false);
        see.m35040a(parcel, 15, this.f109620n, i, false);
        see.m35052a(parcel, 16, this.f109621o, false);
        see.m35051a(parcel, 17, this.f109622p);
        see.m35062b(parcel, a);
    }
}
