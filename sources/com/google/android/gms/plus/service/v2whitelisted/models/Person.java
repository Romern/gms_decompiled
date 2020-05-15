package com.google.android.gms.plus.service.v2whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Person extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aojb();

    /* renamed from: M */
    private static final HashMap f83139M;

    /* renamed from: A */
    public List f83140A;

    /* renamed from: B */
    public List f83141B;

    /* renamed from: C */
    List f83142C;

    /* renamed from: D */
    public List f83143D;

    /* renamed from: E */
    public List f83144E;

    /* renamed from: F */
    public String f83145F;

    /* renamed from: G */
    public List f83146G;

    /* renamed from: H */
    List f83147H;

    /* renamed from: I */
    public List f83148I;

    /* renamed from: J */
    public SortKeys f83149J;

    /* renamed from: K */
    public List f83150K;

    /* renamed from: L */
    public List f83151L;

    /* renamed from: a */
    public final Set f83152a;

    /* renamed from: b */
    public List f83153b;

    /* renamed from: c */
    public List f83154c;

    /* renamed from: d */
    public List f83155d;

    /* renamed from: e */
    public List f83156e;

    /* renamed from: f */
    List f83157f;

    /* renamed from: g */
    List f83158g;

    /* renamed from: h */
    public List f83159h;

    /* renamed from: i */
    public List f83160i;

    /* renamed from: j */
    public List f83161j;

    /* renamed from: k */
    public String f83162k;

    /* renamed from: l */
    public List f83163l;

    /* renamed from: m */
    ExtendedData f83164m;

    /* renamed from: n */
    List f83165n;

    /* renamed from: o */
    public List f83166o;

    /* renamed from: p */
    public String f83167p;

    /* renamed from: q */
    public List f83168q;

    /* renamed from: r */
    public List f83169r;

    /* renamed from: s */
    List f83170s;

    /* renamed from: t */
    public String f83171t;

    /* renamed from: u */
    List f83172u;

    /* renamed from: v */
    public LegacyFields f83173v;

    /* renamed from: w */
    public List f83174w;

    /* renamed from: x */
    public Metadata f83175x;

    /* renamed from: y */
    public List f83176y;

    /* renamed from: z */
    public List f83177z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Abouts extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojc();

        /* renamed from: e */
        private static final HashMap f83178e;

        /* renamed from: a */
        public final Set f83179a;

        /* renamed from: b */
        public Mergedpeoplemetadata f83180b;

        /* renamed from: c */
        public String f83181c;

        /* renamed from: d */
        public String f83182d;

        static {
            HashMap hashMap = new HashMap();
            f83178e = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83178e.put("type", FastJsonResponse$Field.m22666f("type", 3));
            f83178e.put("value", FastJsonResponse$Field.m22666f("value", 4));
        }

        public Abouts() {
            this.f83179a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83178e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83180b;
            }
            if (i == 3) {
                return this.f83181c;
            }
            if (i == 4) {
                return this.f83182d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Abouts)) {
                return false;
            }
            if (this != obj) {
                Abouts abouts = (Abouts) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83178e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!abouts.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(abouts.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (abouts.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83178e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Abouts(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.f83179a = set;
            this.f83180b = mergedpeoplemetadata;
            this.f83181c = str;
            this.f83182d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83181c = str2;
            } else if (i == 4) {
                this.f83182d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83179a.add(Integer.valueOf(i));
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
            Set set = this.f83179a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83180b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83181c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83182d, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83180b = (Mergedpeoplemetadata) sio;
                this.f83179a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83179a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Addresses extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojd();

        /* renamed from: l */
        private static final HashMap f83183l;

        /* renamed from: a */
        public final Set f83184a;

        /* renamed from: b */
        public String f83185b;

        /* renamed from: c */
        public String f83186c;

        /* renamed from: d */
        String f83187d;

        /* renamed from: e */
        public Mergedpeoplemetadata f83188e;

        /* renamed from: f */
        public String f83189f;

        /* renamed from: g */
        public String f83190g;

        /* renamed from: h */
        public String f83191h;

        /* renamed from: i */
        public String f83192i;

        /* renamed from: j */
        public String f83193j;

        /* renamed from: k */
        public String f83194k;

        static {
            HashMap hashMap = new HashMap();
            f83183l = hashMap;
            hashMap.put("city", FastJsonResponse$Field.m22666f("city", 2));
            f83183l.put("country", FastJsonResponse$Field.m22666f("country", 3));
            f83183l.put("extendedAddress", FastJsonResponse$Field.m22666f("extendedAddress", 5));
            f83183l.put("metadata", FastJsonResponse$Field.m22653a("metadata", 7, Mergedpeoplemetadata.class));
            f83183l.put("poBox", FastJsonResponse$Field.m22666f("poBox", 8));
            f83183l.put("postalCode", FastJsonResponse$Field.m22666f("postalCode", 9));
            f83183l.put("region", FastJsonResponse$Field.m22666f("region", 10));
            f83183l.put("streetAddress", FastJsonResponse$Field.m22666f("streetAddress", 11));
            f83183l.put("type", FastJsonResponse$Field.m22666f("type", 12));
            f83183l.put("value", FastJsonResponse$Field.m22666f("value", 13));
        }

        public Addresses() {
            this.f83184a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83183l;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    return this.f83185b;
                case 3:
                    return this.f83186c;
                case 4:
                case 6:
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                case 5:
                    return this.f83187d;
                case 7:
                    return this.f83188e;
                case 8:
                    return this.f83189f;
                case 9:
                    return this.f83190g;
                case 10:
                    return this.f83191h;
                case 11:
                    return this.f83192i;
                case 12:
                    return this.f83193j;
                case 13:
                    return this.f83194k;
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Addresses)) {
                return false;
            }
            if (this != obj) {
                Addresses addresses = (Addresses) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83183l.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!addresses.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(addresses.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (addresses.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83183l.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Addresses(Set set, String str, String str2, String str3, Mergedpeoplemetadata mergedpeoplemetadata, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.f83184a = set;
            this.f83185b = str;
            this.f83186c = str2;
            this.f83187d = str3;
            this.f83188e = mergedpeoplemetadata;
            this.f83189f = str4;
            this.f83190g = str5;
            this.f83191h = str6;
            this.f83192i = str7;
            this.f83193j = str8;
            this.f83194k = str9;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83185b = str2;
            } else if (i == 3) {
                this.f83186c = str2;
            } else if (i != 5) {
                switch (i) {
                    case 8:
                        this.f83189f = str2;
                        break;
                    case 9:
                        this.f83190g = str2;
                        break;
                    case 10:
                        this.f83191h = str2;
                        break;
                    case 11:
                        this.f83192i = str2;
                        break;
                    case 12:
                        this.f83193j = str2;
                        break;
                    case 13:
                        this.f83194k = str2;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.f83187d = str2;
            }
            this.f83184a.add(Integer.valueOf(i));
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
            Set set = this.f83184a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83185b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83186c, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83187d, true);
            }
            if (set.contains(7)) {
                see.m35040a(parcel, 7, this.f83188e, i, true);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f83189f, true);
            }
            if (set.contains(9)) {
                see.m35046a(parcel, 9, this.f83190g, true);
            }
            if (set.contains(10)) {
                see.m35046a(parcel, 10, this.f83191h, true);
            }
            if (set.contains(11)) {
                see.m35046a(parcel, 11, this.f83192i, true);
            }
            if (set.contains(12)) {
                see.m35046a(parcel, 12, this.f83193j, true);
            }
            if (set.contains(13)) {
                see.m35046a(parcel, 13, this.f83194k, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 7) {
                this.f83188e = (Mergedpeoplemetadata) sio;
                this.f83184a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83184a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Birthdays extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aoje();

        /* renamed from: d */
        private static final HashMap f83195d;

        /* renamed from: a */
        public final Set f83196a;

        /* renamed from: b */
        public String f83197b;

        /* renamed from: c */
        public Mergedpeoplemetadata f83198c;

        static {
            HashMap hashMap = new HashMap();
            f83195d = hashMap;
            hashMap.put("date", FastJsonResponse$Field.m22666f("date", 2));
            f83195d.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
        }

        public Birthdays() {
            this.f83196a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83195d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83197b;
            }
            if (i == 3) {
                return this.f83198c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Birthdays)) {
                return false;
            }
            if (this != obj) {
                Birthdays birthdays = (Birthdays) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83195d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!birthdays.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(birthdays.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (birthdays.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83195d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Birthdays(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata) {
            this.f83196a = set;
            this.f83197b = str;
            this.f83198c = mergedpeoplemetadata;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83197b = str2;
                this.f83196a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83196a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83197b, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83198c, i, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83198c = (Mergedpeoplemetadata) sio;
                this.f83196a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83196a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class BraggingRights extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojf();

        /* renamed from: d */
        private static final HashMap f83199d;

        /* renamed from: a */
        public final Set f83200a;

        /* renamed from: b */
        public Mergedpeoplemetadata f83201b;

        /* renamed from: c */
        public String f83202c;

        static {
            HashMap hashMap = new HashMap();
            f83199d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83199d.put("value", FastJsonResponse$Field.m22666f("value", 3));
        }

        public BraggingRights() {
            this.f83200a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83199d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83201b;
            }
            if (i == 3) {
                return this.f83202c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof BraggingRights)) {
                return false;
            }
            if (this != obj) {
                BraggingRights braggingRights = (BraggingRights) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83199d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!braggingRights.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(braggingRights.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (braggingRights.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83199d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public BraggingRights(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.f83200a = set;
            this.f83201b = mergedpeoplemetadata;
            this.f83202c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83202c = str2;
                this.f83200a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83200a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83201b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83202c, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83201b = (Mergedpeoplemetadata) sio;
                this.f83200a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83200a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Calendars extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojg();

        /* renamed from: f */
        private static final HashMap f83203f;

        /* renamed from: a */
        final Set f83204a;

        /* renamed from: b */
        String f83205b;

        /* renamed from: c */
        Mergedpeoplemetadata f83206c;

        /* renamed from: d */
        String f83207d;

        /* renamed from: e */
        String f83208e;

        static {
            HashMap hashMap = new HashMap();
            f83203f = hashMap;
            hashMap.put("formattedType", FastJsonResponse$Field.m22666f("formattedType", 2));
            f83203f.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
            f83203f.put("type", FastJsonResponse$Field.m22666f("type", 4));
            f83203f.put("url", FastJsonResponse$Field.m22666f("url", 5));
        }

        public Calendars() {
            this.f83204a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83203f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83205b;
            }
            if (i == 3) {
                return this.f83206c;
            }
            if (i == 4) {
                return this.f83207d;
            }
            if (i == 5) {
                return this.f83208e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Calendars)) {
                return false;
            }
            if (this != obj) {
                Calendars calendars = (Calendars) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83203f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!calendars.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(calendars.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (calendars.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83203f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Calendars(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.f83204a = set;
            this.f83205b = str;
            this.f83206c = mergedpeoplemetadata;
            this.f83207d = str2;
            this.f83208e = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83205b = str2;
            } else if (i == 4) {
                this.f83207d = str2;
            } else if (i == 5) {
                this.f83208e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83204a.add(Integer.valueOf(i));
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
            Set set = this.f83204a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83205b, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83206c, i, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83207d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83208e, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83206c = (Mergedpeoplemetadata) sio;
                this.f83204a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83204a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ClientData extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojh();

        /* renamed from: f */
        private static final HashMap f83209f;

        /* renamed from: a */
        final Set f83210a;

        /* renamed from: b */
        String f83211b;

        /* renamed from: c */
        Mergedpeoplemetadata f83212c;

        /* renamed from: d */
        String f83213d;

        /* renamed from: e */
        String f83214e;

        static {
            HashMap hashMap = new HashMap();
            f83209f = hashMap;
            hashMap.put("key", FastJsonResponse$Field.m22666f("key", 2));
            f83209f.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
            f83209f.put("namespace", FastJsonResponse$Field.m22666f("namespace", 4));
            f83209f.put("value", FastJsonResponse$Field.m22666f("value", 5));
        }

        public ClientData() {
            this.f83210a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83209f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83211b;
            }
            if (i == 3) {
                return this.f83212c;
            }
            if (i == 4) {
                return this.f83213d;
            }
            if (i == 5) {
                return this.f83214e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ClientData)) {
                return false;
            }
            if (this != obj) {
                ClientData clientData = (ClientData) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83209f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!clientData.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clientData.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (clientData.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83209f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public ClientData(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.f83210a = set;
            this.f83211b = str;
            this.f83212c = mergedpeoplemetadata;
            this.f83213d = str2;
            this.f83214e = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83211b = str2;
            } else if (i == 4) {
                this.f83213d = str2;
            } else if (i == 5) {
                this.f83214e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83210a.add(Integer.valueOf(i));
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
            Set set = this.f83210a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83211b, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83212c, i, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83213d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83214e, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83212c = (Mergedpeoplemetadata) sio;
                this.f83210a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83210a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class CoverPhotos extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aoji();

        /* renamed from: h */
        private static final HashMap f83215h;

        /* renamed from: a */
        public final Set f83216a;

        /* renamed from: b */
        public int f83217b;

        /* renamed from: c */
        public String f83218c;

        /* renamed from: d */
        public boolean f83219d;

        /* renamed from: e */
        Mergedpeoplemetadata f83220e;

        /* renamed from: f */
        public String f83221f;

        /* renamed from: g */
        public int f83222g;

        static {
            HashMap hashMap = new HashMap();
            f83215h = hashMap;
            hashMap.put("height", FastJsonResponse$Field.m22651a("height", 2));
            f83215h.put("id", FastJsonResponse$Field.m22666f("id", 3));
            f83215h.put("isDefault", FastJsonResponse$Field.m22664e("isDefault", 5));
            f83215h.put("metadata", FastJsonResponse$Field.m22653a("metadata", 6, Mergedpeoplemetadata.class));
            f83215h.put("url", FastJsonResponse$Field.m22666f("url", 7));
            f83215h.put("width", FastJsonResponse$Field.m22651a("width", 8));
        }

        public CoverPhotos() {
            this.f83216a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83215h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Integer.valueOf(this.f83217b);
            }
            if (i == 3) {
                return this.f83218c;
            }
            if (i == 5) {
                return Boolean.valueOf(this.f83219d);
            }
            if (i == 6) {
                return this.f83220e;
            }
            if (i == 7) {
                return this.f83221f;
            }
            if (i == 8) {
                return Integer.valueOf(this.f83222g);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CoverPhotos)) {
                return false;
            }
            if (this != obj) {
                CoverPhotos coverPhotos = (CoverPhotos) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83215h.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!coverPhotos.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(coverPhotos.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (coverPhotos.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83215h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public CoverPhotos(Set set, int i, String str, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str2, int i2) {
            this.f83216a = set;
            this.f83217b = i;
            this.f83218c = str;
            this.f83219d = z;
            this.f83220e = mergedpeoplemetadata;
            this.f83221f = str2;
            this.f83222g = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.f30319g;
            if (i2 == 2) {
                this.f83217b = i;
            } else if (i2 == 8) {
                this.f83222g = i;
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Field with id=");
                sb.append(i2);
                sb.append(" is not known to be an int.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83216a.add(Integer.valueOf(i2));
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
            Set set = this.f83216a;
            if (set.contains(2)) {
                see.m35063b(parcel, 2, this.f83217b);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83218c, true);
            }
            if (set.contains(5)) {
                see.m35051a(parcel, 5, this.f83219d);
            }
            if (set.contains(6)) {
                see.m35040a(parcel, 6, this.f83220e, i, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f83221f, true);
            }
            if (set.contains(8)) {
                see.m35063b(parcel, 8, this.f83222g);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83218c = str2;
            } else if (i == 7) {
                this.f83221f = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83216a.add(Integer.valueOf(i));
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 6) {
                this.f83220e = (Mergedpeoplemetadata) sio;
                this.f83216a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 5) {
                this.f83219d = z;
                this.f83216a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83216a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class CustomFields extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojj();

        /* renamed from: e */
        private static final HashMap f83223e;

        /* renamed from: a */
        public final Set f83224a;

        /* renamed from: b */
        public String f83225b;

        /* renamed from: c */
        Mergedpeoplemetadata f83226c;

        /* renamed from: d */
        public String f83227d;

        static {
            HashMap hashMap = new HashMap();
            f83223e = hashMap;
            hashMap.put("key", FastJsonResponse$Field.m22666f("key", 2));
            f83223e.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
            f83223e.put("value", FastJsonResponse$Field.m22666f("value", 4));
        }

        public CustomFields() {
            this.f83224a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83223e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83225b;
            }
            if (i == 3) {
                return this.f83226c;
            }
            if (i == 4) {
                return this.f83227d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CustomFields)) {
                return false;
            }
            if (this != obj) {
                CustomFields customFields = (CustomFields) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83223e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!customFields.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(customFields.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (customFields.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83223e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public CustomFields(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2) {
            this.f83224a = set;
            this.f83225b = str;
            this.f83226c = mergedpeoplemetadata;
            this.f83227d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83225b = str2;
            } else if (i == 4) {
                this.f83227d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83224a.add(Integer.valueOf(i));
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
            Set set = this.f83224a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83225b, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83226c, i, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83227d, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83226c = (Mergedpeoplemetadata) sio;
                this.f83224a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83224a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Emails extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojk();

        /* renamed from: g */
        private static final HashMap f83228g;

        /* renamed from: a */
        public final Set f83229a;

        /* renamed from: b */
        public List f83230b;

        /* renamed from: c */
        public String f83231c;

        /* renamed from: d */
        public Mergedpeoplemetadata f83232d;

        /* renamed from: e */
        public String f83233e;

        /* renamed from: f */
        public String f83234f;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class Certificates extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new aojl();

            /* renamed from: d */
            private static final HashMap f83235d;

            /* renamed from: a */
            final Set f83236a;

            /* renamed from: b */
            public Mergedpeoplemetadata f83237b;

            /* renamed from: c */
            public Status f83238c;

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class Status extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new aojm();

                /* renamed from: e */
                private static final HashMap f83239e;

                /* renamed from: a */
                final Set f83240a;

                /* renamed from: b */
                public String f83241b;

                /* renamed from: c */
                String f83242c;

                /* renamed from: d */
                public long f83243d;

                static {
                    HashMap hashMap = new HashMap();
                    f83239e = hashMap;
                    hashMap.put("code", FastJsonResponse$Field.m22666f("code", 2));
                    f83239e.put("expiration", FastJsonResponse$Field.m22666f("expiration", 3));
                    f83239e.put("expirationSeconds", FastJsonResponse$Field.m22656b("expirationSeconds", 4));
                }

                public Status() {
                    this.f83240a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f83239e;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        return this.f83241b;
                    }
                    if (i == 3) {
                        return this.f83242c;
                    }
                    if (i == 4) {
                        return Long.valueOf(this.f83243d);
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Status)) {
                        return false;
                    }
                    if (this != obj) {
                        Status status = (Status) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f83239e.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                if (!status.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(status.mo7371b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (status.mo7370a(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83239e.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                public Status(Set set, String str, String str2, long j) {
                    this.f83240a = set;
                    this.f83241b = str;
                    this.f83242c = str2;
                    this.f83243d = j;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 4) {
                        this.f83243d = j;
                        this.f83240a.add(Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a long.");
                    throw new IllegalArgumentException(sb.toString());
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
                    Set set = this.f83240a;
                    if (set.contains(2)) {
                        see.m35046a(parcel, 2, this.f83241b, true);
                    }
                    if (set.contains(3)) {
                        see.m35046a(parcel, 3, this.f83242c, true);
                    }
                    if (set.contains(4)) {
                        see.m35036a(parcel, 4, this.f83243d);
                    }
                    see.m35062b(parcel, a);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        this.f83241b = str2;
                    } else if (i == 3) {
                        this.f83242c = str2;
                    } else {
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f83240a.add(Integer.valueOf(i));
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f83240a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                f83235d = hashMap;
                hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
                f83235d.put("status", FastJsonResponse$Field.m22653a("status", 4, Status.class));
            }

            public Certificates() {
                this.f83236a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f83235d;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 3) {
                    return this.f83237b;
                }
                if (i == 4) {
                    return this.f83238c;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Certificates)) {
                    return false;
                }
                if (this != obj) {
                    Certificates certificates = (Certificates) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83235d.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!certificates.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(certificates.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (certificates.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83235d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            public Certificates(Set set, Mergedpeoplemetadata mergedpeoplemetadata, Status status) {
                this.f83236a = set;
                this.f83237b = mergedpeoplemetadata;
                this.f83238c = status;
            }

            /* renamed from: a */
            public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 3) {
                    this.f83237b = (Mergedpeoplemetadata) sio;
                } else if (i == 4) {
                    this.f83238c = (Status) sio;
                } else {
                    String canonicalName = sio.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not a known custom type.  Found ");
                    sb.append(canonicalName);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f83236a.add(Integer.valueOf(i));
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = see.m35030a(parcel);
                Set set = this.f83236a;
                if (set.contains(3)) {
                    see.m35040a(parcel, 3, this.f83237b, i, true);
                }
                if (set.contains(4)) {
                    see.m35040a(parcel, 4, this.f83238c, i, true);
                }
                see.m35062b(parcel, a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f83236a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f83228g = hashMap;
            hashMap.put("certificates", FastJsonResponse$Field.m22657b("certificates", 2, Certificates.class));
            f83228g.put("formattedType", FastJsonResponse$Field.m22666f("formattedType", 4));
            f83228g.put("metadata", FastJsonResponse$Field.m22653a("metadata", 5, Mergedpeoplemetadata.class));
            f83228g.put("type", FastJsonResponse$Field.m22666f("type", 6));
            f83228g.put("value", FastJsonResponse$Field.m22666f("value", 7));
        }

        public Emails() {
            this.f83229a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83228g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83230b;
            }
            if (i == 4) {
                return this.f83231c;
            }
            if (i == 5) {
                return this.f83232d;
            }
            if (i == 6) {
                return this.f83233e;
            }
            if (i == 7) {
                return this.f83234f;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Emails)) {
                return false;
            }
            if (this != obj) {
                Emails emails = (Emails) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83228g.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!emails.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(emails.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (emails.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83228g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Emails(Set set, List list, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.f83229a = set;
            this.f83230b = list;
            this.f83231c = str;
            this.f83232d = mergedpeoplemetadata;
            this.f83233e = str2;
            this.f83234f = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f83231c = str2;
            } else if (i == 6) {
                this.f83233e = str2;
            } else if (i == 7) {
                this.f83234f = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83229a.add(Integer.valueOf(i));
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
            Set set = this.f83229a;
            if (set.contains(2)) {
                see.m35066c(parcel, 2, this.f83230b, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83231c, true);
            }
            if (set.contains(5)) {
                see.m35040a(parcel, 5, this.f83232d, i, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f83233e, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f83234f, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83230b = arrayList;
                this.f83229a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 5) {
                this.f83232d = (Mergedpeoplemetadata) sio;
                this.f83229a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83229a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Events extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojn();

        /* renamed from: f */
        private static final HashMap f83244f;

        /* renamed from: a */
        public final Set f83245a;

        /* renamed from: b */
        public String f83246b;

        /* renamed from: c */
        public String f83247c;

        /* renamed from: d */
        public Mergedpeoplemetadata f83248d;

        /* renamed from: e */
        public String f83249e;

        static {
            HashMap hashMap = new HashMap();
            f83244f = hashMap;
            hashMap.put("date", FastJsonResponse$Field.m22666f("date", 2));
            f83244f.put("formattedType", FastJsonResponse$Field.m22666f("formattedType", 3));
            f83244f.put("metadata", FastJsonResponse$Field.m22653a("metadata", 4, Mergedpeoplemetadata.class));
            f83244f.put("type", FastJsonResponse$Field.m22666f("type", 5));
        }

        public Events() {
            this.f83245a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83244f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83246b;
            }
            if (i == 3) {
                return this.f83247c;
            }
            if (i == 4) {
                return this.f83248d;
            }
            if (i == 5) {
                return this.f83249e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Events)) {
                return false;
            }
            if (this != obj) {
                Events events = (Events) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83244f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!events.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(events.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (events.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83244f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Events(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3) {
            this.f83245a = set;
            this.f83246b = str;
            this.f83247c = str2;
            this.f83248d = mergedpeoplemetadata;
            this.f83249e = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83246b = str2;
            } else if (i == 3) {
                this.f83247c = str2;
            } else if (i == 5) {
                this.f83249e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83245a.add(Integer.valueOf(i));
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
            Set set = this.f83245a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83246b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83247c, true);
            }
            if (set.contains(4)) {
                see.m35040a(parcel, 4, this.f83248d, i, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83249e, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f83248d = (Mergedpeoplemetadata) sio;
                this.f83245a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83245a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ExtendedData extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojo();

        /* renamed from: d */
        private static final HashMap f83250d;

        /* renamed from: a */
        final Set f83251a;

        /* renamed from: b */
        HangoutsExtendedData f83252b;

        /* renamed from: c */
        List f83253c;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class HangoutsExtendedData extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new aojp();

            /* renamed from: g */
            private static final HashMap f83254g;

            /* renamed from: a */
            final Set f83255a;

            /* renamed from: b */
            String f83256b;

            /* renamed from: c */
            String f83257c;

            /* renamed from: d */
            boolean f83258d;

            /* renamed from: e */
            boolean f83259e;

            /* renamed from: f */
            boolean f83260f;

            static {
                HashMap hashMap = new HashMap();
                f83254g = hashMap;
                hashMap.put("hadPastHangoutState", FastJsonResponse$Field.m22666f("hadPastHangoutState", 2));
                f83254g.put("invitationStatus", FastJsonResponse$Field.m22666f("invitationStatus", 3));
                f83254g.put("isDismissed", FastJsonResponse$Field.m22664e("isDismissed", 4));
                f83254g.put("isFavorite", FastJsonResponse$Field.m22664e("isFavorite", 5));
                f83254g.put("isPinned", FastJsonResponse$Field.m22664e("isPinned", 6));
            }

            public HangoutsExtendedData() {
                this.f83255a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f83254g;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return this.f83256b;
                }
                if (i == 3) {
                    return this.f83257c;
                }
                if (i == 4) {
                    return Boolean.valueOf(this.f83258d);
                }
                if (i == 5) {
                    return Boolean.valueOf(this.f83259e);
                }
                if (i == 6) {
                    return Boolean.valueOf(this.f83260f);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof HangoutsExtendedData)) {
                    return false;
                }
                if (this != obj) {
                    HangoutsExtendedData hangoutsExtendedData = (HangoutsExtendedData) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83254g.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!hangoutsExtendedData.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(hangoutsExtendedData.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (hangoutsExtendedData.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83254g.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            public HangoutsExtendedData(Set set, String str, String str2, boolean z, boolean z2, boolean z3) {
                this.f83255a = set;
                this.f83256b = str;
                this.f83257c = str2;
                this.f83258d = z;
                this.f83259e = z2;
                this.f83260f = z3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    this.f83256b = str2;
                } else if (i == 3) {
                    this.f83257c = str2;
                } else {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f83255a.add(Integer.valueOf(i));
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
                Set set = this.f83255a;
                if (set.contains(2)) {
                    see.m35046a(parcel, 2, this.f83256b, true);
                }
                if (set.contains(3)) {
                    see.m35046a(parcel, 3, this.f83257c, true);
                }
                if (set.contains(4)) {
                    see.m35051a(parcel, 4, this.f83258d);
                }
                if (set.contains(5)) {
                    see.m35051a(parcel, 5, this.f83259e);
                }
                if (set.contains(6)) {
                    see.m35051a(parcel, 6, this.f83260f);
                }
                see.m35062b(parcel, a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 4) {
                    this.f83258d = z;
                } else if (i == 5) {
                    this.f83259e = z;
                } else if (i == 6) {
                    this.f83260f = z;
                } else {
                    StringBuilder sb = new StringBuilder(55);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a boolean.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f83255a.add(Integer.valueOf(i));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f83255a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f83250d = hashMap;
            hashMap.put("hangoutsExtendedData", FastJsonResponse$Field.m22653a("hangoutsExtendedData", 2, HangoutsExtendedData.class));
            f83250d.put("hd", FastJsonResponse$Field.m22668g("hd", 3));
        }

        public ExtendedData() {
            this.f83251a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83250d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83252b;
            }
            if (i == 3) {
                return this.f83253c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ExtendedData)) {
                return false;
            }
            if (this != obj) {
                ExtendedData extendedData = (ExtendedData) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83250d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!extendedData.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(extendedData.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (extendedData.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83250d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public ExtendedData(Set set, HangoutsExtendedData hangoutsExtendedData, List list) {
            this.f83251a = set;
            this.f83252b = hangoutsExtendedData;
            this.f83253c = list;
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83252b = (HangoutsExtendedData) sio;
                this.f83251a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83253c = arrayList;
                this.f83251a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an array of String.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f83251a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83252b, i, true);
            }
            if (set.contains(3)) {
                see.m35065b(parcel, 3, this.f83253c, true);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83251a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ExternalIds extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojq();

        /* renamed from: f */
        private static final HashMap f83261f;

        /* renamed from: a */
        final Set f83262a;

        /* renamed from: b */
        String f83263b;

        /* renamed from: c */
        Mergedpeoplemetadata f83264c;

        /* renamed from: d */
        String f83265d;

        /* renamed from: e */
        String f83266e;

        static {
            HashMap hashMap = new HashMap();
            f83261f = hashMap;
            hashMap.put("formattedType", FastJsonResponse$Field.m22666f("formattedType", 2));
            f83261f.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
            f83261f.put("type", FastJsonResponse$Field.m22666f("type", 4));
            f83261f.put("value", FastJsonResponse$Field.m22666f("value", 5));
        }

        public ExternalIds() {
            this.f83262a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83261f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83263b;
            }
            if (i == 3) {
                return this.f83264c;
            }
            if (i == 4) {
                return this.f83265d;
            }
            if (i == 5) {
                return this.f83266e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ExternalIds)) {
                return false;
            }
            if (this != obj) {
                ExternalIds externalIds = (ExternalIds) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83261f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!externalIds.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(externalIds.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (externalIds.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83261f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public ExternalIds(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.f83262a = set;
            this.f83263b = str;
            this.f83264c = mergedpeoplemetadata;
            this.f83265d = str2;
            this.f83266e = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83263b = str2;
            } else if (i == 4) {
                this.f83265d = str2;
            } else if (i == 5) {
                this.f83266e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83262a.add(Integer.valueOf(i));
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
            Set set = this.f83262a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83263b, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83264c, i, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83265d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83266e, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83264c = (Mergedpeoplemetadata) sio;
                this.f83262a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83262a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Genders extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojr();

        /* renamed from: e */
        private static final HashMap f83267e;

        /* renamed from: a */
        public final Set f83268a;

        /* renamed from: b */
        public String f83269b;

        /* renamed from: c */
        public Mergedpeoplemetadata f83270c;

        /* renamed from: d */
        public String f83271d;

        static {
            HashMap hashMap = new HashMap();
            f83267e = hashMap;
            hashMap.put("formattedValue", FastJsonResponse$Field.m22666f("formattedValue", 3));
            f83267e.put("metadata", FastJsonResponse$Field.m22653a("metadata", 4, Mergedpeoplemetadata.class));
            f83267e.put("value", FastJsonResponse$Field.m22666f("value", 5));
        }

        public Genders() {
            this.f83268a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83267e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                return this.f83269b;
            }
            if (i == 4) {
                return this.f83270c;
            }
            if (i == 5) {
                return this.f83271d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Genders)) {
                return false;
            }
            if (this != obj) {
                Genders genders = (Genders) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83267e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!genders.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(genders.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (genders.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83267e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Genders(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2) {
            this.f83268a = set;
            this.f83269b = str;
            this.f83270c = mergedpeoplemetadata;
            this.f83271d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83269b = str2;
            } else if (i == 5) {
                this.f83271d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83268a.add(Integer.valueOf(i));
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
            Set set = this.f83268a;
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83269b, true);
            }
            if (set.contains(4)) {
                see.m35040a(parcel, 4, this.f83270c, i, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83271d, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f83270c = (Mergedpeoplemetadata) sio;
                this.f83268a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83268a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Images extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojs();

        /* renamed from: f */
        private static final HashMap f83272f;

        /* renamed from: a */
        public final Set f83273a;

        /* renamed from: b */
        public boolean f83274b;

        /* renamed from: c */
        public Mergedpeoplemetadata f83275c;

        /* renamed from: d */
        String f83276d;

        /* renamed from: e */
        public String f83277e;

        static {
            HashMap hashMap = new HashMap();
            f83272f = hashMap;
            hashMap.put("isDefault", FastJsonResponse$Field.m22664e("isDefault", 2));
            f83272f.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
            f83272f.put("photoToken", FastJsonResponse$Field.m22666f("photoToken", 4));
            f83272f.put("url", FastJsonResponse$Field.m22666f("url", 5));
        }

        public Images() {
            this.f83273a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83272f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Boolean.valueOf(this.f83274b);
            }
            if (i == 3) {
                return this.f83275c;
            }
            if (i == 4) {
                return this.f83276d;
            }
            if (i == 5) {
                return this.f83277e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Images)) {
                return false;
            }
            if (this != obj) {
                Images images = (Images) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83272f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!images.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(images.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (images.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83272f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Images(Set set, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.f83273a = set;
            this.f83274b = z;
            this.f83275c = mergedpeoplemetadata;
            this.f83276d = str;
            this.f83277e = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f83276d = str2;
            } else if (i == 5) {
                this.f83277e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83273a.add(Integer.valueOf(i));
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
            Set set = this.f83273a;
            if (set.contains(2)) {
                see.m35051a(parcel, 2, this.f83274b);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83275c, i, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83276d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83277e, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: b */
        public final boolean mo46740b() {
            return this.f83273a.contains(5);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83275c = (Mergedpeoplemetadata) sio;
                this.f83273a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83274b = z;
                this.f83273a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83273a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class InstantMessaging extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojt();

        /* renamed from: h */
        private static final HashMap f83278h;

        /* renamed from: a */
        public final Set f83279a;

        /* renamed from: b */
        public String f83280b;

        /* renamed from: c */
        public String f83281c;

        /* renamed from: d */
        public Mergedpeoplemetadata f83282d;

        /* renamed from: e */
        public String f83283e;

        /* renamed from: f */
        public String f83284f;

        /* renamed from: g */
        public String f83285g;

        static {
            HashMap hashMap = new HashMap();
            f83278h = hashMap;
            hashMap.put("formattedProtocol", FastJsonResponse$Field.m22666f("formattedProtocol", 2));
            f83278h.put("formattedType", FastJsonResponse$Field.m22666f("formattedType", 3));
            f83278h.put("metadata", FastJsonResponse$Field.m22653a("metadata", 4, Mergedpeoplemetadata.class));
            f83278h.put("protocol", FastJsonResponse$Field.m22666f("protocol", 5));
            f83278h.put("type", FastJsonResponse$Field.m22666f("type", 6));
            f83278h.put("value", FastJsonResponse$Field.m22666f("value", 7));
        }

        public InstantMessaging() {
            this.f83279a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83278h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    return this.f83280b;
                case 3:
                    return this.f83281c;
                case 4:
                    return this.f83282d;
                case 5:
                    return this.f83283e;
                case 6:
                    return this.f83284f;
                case 7:
                    return this.f83285g;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InstantMessaging)) {
                return false;
            }
            if (this != obj) {
                InstantMessaging instantMessaging = (InstantMessaging) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83278h.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!instantMessaging.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(instantMessaging.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (instantMessaging.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83278h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public InstantMessaging(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3, String str4, String str5) {
            this.f83279a = set;
            this.f83280b = str;
            this.f83281c = str2;
            this.f83282d = mergedpeoplemetadata;
            this.f83283e = str3;
            this.f83284f = str4;
            this.f83285g = str5;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83280b = str2;
            } else if (i == 3) {
                this.f83281c = str2;
            } else if (i == 5) {
                this.f83283e = str2;
            } else if (i == 6) {
                this.f83284f = str2;
            } else if (i == 7) {
                this.f83285g = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83279a.add(Integer.valueOf(i));
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
            Set set = this.f83279a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83280b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83281c, true);
            }
            if (set.contains(4)) {
                see.m35040a(parcel, 4, this.f83282d, i, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83283e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f83284f, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f83285g, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f83282d = (Mergedpeoplemetadata) sio;
                this.f83279a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83279a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Interests extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aoju();

        /* renamed from: d */
        private static final HashMap f83286d;

        /* renamed from: a */
        final Set f83287a;

        /* renamed from: b */
        Mergedpeoplemetadata f83288b;

        /* renamed from: c */
        String f83289c;

        static {
            HashMap hashMap = new HashMap();
            f83286d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83286d.put("value", FastJsonResponse$Field.m22666f("value", 3));
        }

        public Interests() {
            this.f83287a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83286d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83288b;
            }
            if (i == 3) {
                return this.f83289c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Interests)) {
                return false;
            }
            if (this != obj) {
                Interests interests = (Interests) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83286d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!interests.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(interests.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (interests.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83286d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Interests(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.f83287a = set;
            this.f83288b = mergedpeoplemetadata;
            this.f83289c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83289c = str2;
                this.f83287a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83287a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83288b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83289c, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83288b = (Mergedpeoplemetadata) sio;
                this.f83287a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83287a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Languages extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojv();

        /* renamed from: d */
        private static final HashMap f83290d;

        /* renamed from: a */
        final Set f83291a;

        /* renamed from: b */
        Mergedpeoplemetadata f83292b;

        /* renamed from: c */
        String f83293c;

        static {
            HashMap hashMap = new HashMap();
            f83290d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83290d.put("value", FastJsonResponse$Field.m22666f("value", 3));
        }

        public Languages() {
            this.f83291a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83290d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83292b;
            }
            if (i == 3) {
                return this.f83293c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Languages)) {
                return false;
            }
            if (this != obj) {
                Languages languages = (Languages) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83290d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!languages.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(languages.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (languages.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83290d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Languages(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.f83291a = set;
            this.f83292b = mergedpeoplemetadata;
            this.f83293c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83293c = str2;
                this.f83291a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83291a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83292b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83293c, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83292b = (Mergedpeoplemetadata) sio;
                this.f83291a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83291a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class LegacyFields extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojw();

        /* renamed from: c */
        private static final HashMap f83294c;

        /* renamed from: a */
        public final Set f83295a;

        /* renamed from: b */
        public String f83296b;

        static {
            HashMap hashMap = new HashMap();
            f83294c = hashMap;
            hashMap.put("mobileOwnerId", FastJsonResponse$Field.m22666f("mobileOwnerId", 2));
        }

        public LegacyFields() {
            this.f83295a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83294c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83296b;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LegacyFields)) {
                return false;
            }
            if (this != obj) {
                LegacyFields legacyFields = (LegacyFields) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83294c.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!legacyFields.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(legacyFields.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (legacyFields.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83294c.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public LegacyFields(Set set, String str) {
            this.f83295a = set;
            this.f83296b = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83296b = str2;
                this.f83295a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            if (this.f83295a.contains(2)) {
                see.m35046a(parcel, 2, this.f83296b, true);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83295a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Memberships extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojx();

        /* renamed from: f */
        private static final HashMap f83297f;

        /* renamed from: a */
        public final Set f83298a;

        /* renamed from: b */
        public String f83299b;

        /* renamed from: c */
        public String f83300c;

        /* renamed from: d */
        public Mergedpeoplemetadata f83301d;

        /* renamed from: e */
        public String f83302e;

        static {
            HashMap hashMap = new HashMap();
            f83297f = hashMap;
            hashMap.put("circle", FastJsonResponse$Field.m22666f("circle", 2));
            f83297f.put("contactGroup", FastJsonResponse$Field.m22666f("contactGroup", 3));
            f83297f.put("metadata", FastJsonResponse$Field.m22653a("metadata", 4, Mergedpeoplemetadata.class));
            f83297f.put("systemContactGroup", FastJsonResponse$Field.m22666f("systemContactGroup", 5));
        }

        public Memberships() {
            this.f83298a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83297f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83299b;
            }
            if (i == 3) {
                return this.f83300c;
            }
            if (i == 4) {
                return this.f83301d;
            }
            if (i == 5) {
                return this.f83302e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Memberships)) {
                return false;
            }
            if (this != obj) {
                Memberships memberships = (Memberships) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83297f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!memberships.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(memberships.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (memberships.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83297f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Memberships(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3) {
            this.f83298a = set;
            this.f83299b = str;
            this.f83300c = str2;
            this.f83301d = mergedpeoplemetadata;
            this.f83302e = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83299b = str2;
            } else if (i == 3) {
                this.f83300c = str2;
            } else if (i == 5) {
                this.f83302e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83298a.add(Integer.valueOf(i));
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
            Set set = this.f83298a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83299b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83300c, true);
            }
            if (set.contains(4)) {
                see.m35040a(parcel, 4, this.f83301d, i, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83302e, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f83301d = (Mergedpeoplemetadata) sio;
                this.f83298a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83298a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Metadata extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aojy();

        /* renamed from: t */
        private static final HashMap f83303t;

        /* renamed from: a */
        public final Set f83304a;

        /* renamed from: b */
        public List f83305b;

        /* renamed from: c */
        public List f83306c;

        /* renamed from: d */
        public List f83307d;

        /* renamed from: e */
        public boolean f83308e;

        /* renamed from: f */
        public List f83309f;

        /* renamed from: g */
        public List f83310g;

        /* renamed from: h */
        public String f83311h;

        /* renamed from: i */
        public boolean f83312i;

        /* renamed from: j */
        public List f83313j;

        /* renamed from: k */
        IdentityInfo f83314k;

        /* renamed from: l */
        public boolean f83315l;

        /* renamed from: m */
        public List f83316m;

        /* renamed from: n */
        public long f83317n;

        /* renamed from: o */
        public String f83318o;

        /* renamed from: p */
        public String f83319p;

        /* renamed from: q */
        public List f83320q;

        /* renamed from: r */
        public String f83321r;

        /* renamed from: s */
        public ProfileOwnerStats f83322s;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class IdentityInfo extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new aojz();

            /* renamed from: d */
            private static final HashMap f83323d;

            /* renamed from: a */
            final Set f83324a;

            /* renamed from: b */
            List f83325b;

            /* renamed from: c */
            List f83326c;

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class SourceIds extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new aoka();

                /* renamed from: h */
                private static final HashMap f83327h;

                /* renamed from: a */
                final Set f83328a;

                /* renamed from: b */
                String f83329b;

                /* renamed from: c */
                boolean f83330c;

                /* renamed from: d */
                String f83331d;

                /* renamed from: e */
                String f83332e;

                /* renamed from: f */
                String f83333f;

                /* renamed from: g */
                long f83334g;

                static {
                    HashMap hashMap = new HashMap();
                    f83327h = hashMap;
                    hashMap.put("container", FastJsonResponse$Field.m22666f("container", 2));
                    f83327h.put("deleted", FastJsonResponse$Field.m22664e("deleted", 3));
                    f83327h.put("etag", FastJsonResponse$Field.m22666f("etag", 4));
                    f83327h.put("id", FastJsonResponse$Field.m22666f("id", 5));
                    f83327h.put("lastUpdated", FastJsonResponse$Field.m22666f("lastUpdated", 6));
                    f83327h.put("lastUpdatedMicros", FastJsonResponse$Field.m22656b("lastUpdatedMicros", 7));
                }

                public SourceIds() {
                    this.f83328a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f83327h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    switch (i) {
                        case 2:
                            return this.f83329b;
                        case 3:
                            return Boolean.valueOf(this.f83330c);
                        case 4:
                            return this.f83331d;
                        case 5:
                            return this.f83332e;
                        case 6:
                            return this.f83333f;
                        case 7:
                            return Long.valueOf(this.f83334g);
                        default:
                            StringBuilder sb = new StringBuilder(38);
                            sb.append("Unknown safe parcelable id=");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                    }
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof SourceIds)) {
                        return false;
                    }
                    if (this != obj) {
                        SourceIds sourceIds = (SourceIds) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f83327h.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                if (!sourceIds.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(sourceIds.mo7371b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (sourceIds.mo7370a(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83327h.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                public SourceIds(Set set, String str, boolean z, String str2, String str3, String str4, long j) {
                    this.f83328a = set;
                    this.f83329b = str;
                    this.f83330c = z;
                    this.f83331d = str2;
                    this.f83332e = str3;
                    this.f83333f = str4;
                    this.f83334g = j;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 7) {
                        this.f83334g = j;
                        this.f83328a.add(Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a long.");
                    throw new IllegalArgumentException(sb.toString());
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
                    Set set = this.f83328a;
                    if (set.contains(2)) {
                        see.m35046a(parcel, 2, this.f83329b, true);
                    }
                    if (set.contains(3)) {
                        see.m35051a(parcel, 3, this.f83330c);
                    }
                    if (set.contains(4)) {
                        see.m35046a(parcel, 4, this.f83331d, true);
                    }
                    if (set.contains(5)) {
                        see.m35046a(parcel, 5, this.f83332e, true);
                    }
                    if (set.contains(6)) {
                        see.m35046a(parcel, 6, this.f83333f, true);
                    }
                    if (set.contains(7)) {
                        see.m35036a(parcel, 7, this.f83334g);
                    }
                    see.m35062b(parcel, a);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        this.f83329b = str2;
                    } else if (i == 4) {
                        this.f83331d = str2;
                    } else if (i == 5) {
                        this.f83332e = str2;
                    } else if (i == 6) {
                        this.f83333f = str2;
                    } else {
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f83328a.add(Integer.valueOf(i));
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 3) {
                        this.f83330c = z;
                        this.f83328a.add(Integer.valueOf(i));
                        return;
                    }
                    StringBuilder sb = new StringBuilder(55);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a boolean.");
                    throw new IllegalArgumentException(sb.toString());
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f83328a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                f83323d = hashMap;
                hashMap.put("originalLookupToken", FastJsonResponse$Field.m22668g("originalLookupToken", 2));
                f83323d.put("sourceIds", FastJsonResponse$Field.m22657b("sourceIds", 3, SourceIds.class));
            }

            public IdentityInfo() {
                this.f83324a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f83323d;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return this.f83325b;
                }
                if (i == 3) {
                    return this.f83326c;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof IdentityInfo)) {
                    return false;
                }
                if (this != obj) {
                    IdentityInfo identityInfo = (IdentityInfo) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83323d.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!identityInfo.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(identityInfo.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (identityInfo.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83323d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            public IdentityInfo(Set set, List list, List list2) {
                this.f83324a = set;
                this.f83325b = list;
                this.f83326c = list2;
            }

            /* renamed from: a */
            public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 3) {
                    this.f83326c = arrayList;
                    this.f83324a.add(Integer.valueOf(i));
                    return;
                }
                String canonicalName = arrayList.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not a known array of custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    this.f83325b = arrayList;
                    this.f83324a.add(Integer.valueOf(i));
                    return;
                }
                StringBuilder sb = new StringBuilder(64);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be an array of String.");
                throw new IllegalArgumentException(sb.toString());
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = see.m35030a(parcel);
                Set set = this.f83324a;
                if (set.contains(2)) {
                    see.m35065b(parcel, 2, this.f83325b, true);
                }
                if (set.contains(3)) {
                    see.m35066c(parcel, 3, this.f83326c, true);
                }
                see.m35062b(parcel, a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f83324a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class ProfileOwnerStats extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new aokb();

            /* renamed from: d */
            private static final HashMap f83335d;

            /* renamed from: a */
            public final Set f83336a;

            /* renamed from: b */
            public long f83337b;

            /* renamed from: c */
            public long f83338c;

            static {
                HashMap hashMap = new HashMap();
                f83335d = hashMap;
                hashMap.put("incomingAnyCircleCount", FastJsonResponse$Field.m22656b("incomingAnyCircleCount", 2));
                f83335d.put("viewCount", FastJsonResponse$Field.m22656b("viewCount", 3));
            }

            public ProfileOwnerStats() {
                this.f83336a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f83335d;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return Long.valueOf(this.f83337b);
                }
                if (i == 3) {
                    return Long.valueOf(this.f83338c);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof ProfileOwnerStats)) {
                    return false;
                }
                if (this != obj) {
                    ProfileOwnerStats profileOwnerStats = (ProfileOwnerStats) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83335d.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!profileOwnerStats.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(profileOwnerStats.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (profileOwnerStats.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83335d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            public ProfileOwnerStats(Set set, long j, long j2) {
                this.f83336a = set;
                this.f83337b = j;
                this.f83338c = j2;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    this.f83337b = j;
                } else if (i == 3) {
                    this.f83338c = j;
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a long.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f83336a.add(Integer.valueOf(i));
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = see.m35030a(parcel);
                Set set = this.f83336a;
                if (set.contains(2)) {
                    see.m35036a(parcel, 2, this.f83337b);
                }
                if (set.contains(3)) {
                    see.m35036a(parcel, 3, this.f83338c);
                }
                see.m35062b(parcel, a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f83336a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f83303t = hashMap;
            hashMap.put("affinities", FastJsonResponse$Field.m22657b("affinities", 2, Mergedpeopleaffinities.class));
            f83303t.put("attributions", FastJsonResponse$Field.m22668g("attributions", 3));
            f83303t.put("blockTypes", FastJsonResponse$Field.m22668g("blockTypes", 4));
            f83303t.put("blocked", FastJsonResponse$Field.m22664e("blocked", 5));
            f83303t.put("circles", FastJsonResponse$Field.m22668g("circles", 6));
            f83303t.put("contacts", FastJsonResponse$Field.m22668g("contacts", 7));
            f83303t.put("customResponseMaskingType", FastJsonResponse$Field.m22666f("customResponseMaskingType", 8));
            f83303t.put("deleted", FastJsonResponse$Field.m22664e("deleted", 9));
            f83303t.put("groups", FastJsonResponse$Field.m22668g("groups", 10));
            f83303t.put("identityInfo", FastJsonResponse$Field.m22653a("identityInfo", 11, IdentityInfo.class));
            f83303t.put("inViewerDomain", FastJsonResponse$Field.m22664e("inViewerDomain", 12));
            f83303t.put("incomingBlockTypes", FastJsonResponse$Field.m22668g("incomingBlockTypes", 13));
            f83303t.put("lastUpdateTimeMicros", FastJsonResponse$Field.m22656b("lastUpdateTimeMicros", 14));
            f83303t.put("objectType", FastJsonResponse$Field.m22666f("objectType", 15));
            f83303t.put("ownerId", FastJsonResponse$Field.m22666f("ownerId", 16));
            f83303t.put("ownerUserTypes", FastJsonResponse$Field.m22668g("ownerUserTypes", 17));
            f83303t.put("plusPageType", FastJsonResponse$Field.m22666f("plusPageType", 18));
            f83303t.put("profileOwnerStats", FastJsonResponse$Field.m22653a("profileOwnerStats", 19, ProfileOwnerStats.class));
        }

        public Metadata() {
            this.f83304a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83303t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    return this.f83305b;
                case 3:
                    return this.f83306c;
                case 4:
                    return this.f83307d;
                case 5:
                    return Boolean.valueOf(this.f83308e);
                case 6:
                    return this.f83309f;
                case 7:
                    return this.f83310g;
                case 8:
                    return this.f83311h;
                case 9:
                    return Boolean.valueOf(this.f83312i);
                case 10:
                    return this.f83313j;
                case 11:
                    return this.f83314k;
                case 12:
                    return Boolean.valueOf(this.f83315l);
                case 13:
                    return this.f83316m;
                case 14:
                    return Long.valueOf(this.f83317n);
                case 15:
                    return this.f83318o;
                case 16:
                    return this.f83319p;
                case 17:
                    return this.f83320q;
                case 18:
                    return this.f83321r;
                case 19:
                    return this.f83322s;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Metadata)) {
                return false;
            }
            if (this != obj) {
                Metadata metadata = (Metadata) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83303t.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!metadata.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(metadata.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (metadata.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83303t.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Metadata(Set set, List list, List list2, List list3, boolean z, List list4, List list5, String str, boolean z2, List list6, IdentityInfo identityInfo, boolean z3, List list7, long j, String str2, String str3, List list8, String str4, ProfileOwnerStats profileOwnerStats) {
            this.f83304a = set;
            this.f83305b = list;
            this.f83306c = list2;
            this.f83307d = list3;
            this.f83308e = z;
            this.f83309f = list4;
            this.f83310g = list5;
            this.f83311h = str;
            this.f83312i = z2;
            this.f83313j = list6;
            this.f83314k = identityInfo;
            this.f83315l = z3;
            this.f83316m = list7;
            this.f83317n = j;
            this.f83318o = str2;
            this.f83319p = str3;
            this.f83320q = list8;
            this.f83321r = str4;
            this.f83322s = profileOwnerStats;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 14) {
                this.f83317n = j;
                this.f83304a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83304a;
            if (set.contains(2)) {
                see.m35066c(parcel, 2, this.f83305b, true);
            }
            if (set.contains(3)) {
                see.m35065b(parcel, 3, this.f83306c, true);
            }
            if (set.contains(4)) {
                see.m35065b(parcel, 4, this.f83307d, true);
            }
            if (set.contains(5)) {
                see.m35051a(parcel, 5, this.f83308e);
            }
            if (set.contains(6)) {
                see.m35065b(parcel, 6, this.f83309f, true);
            }
            if (set.contains(7)) {
                see.m35065b(parcel, 7, this.f83310g, true);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f83311h, true);
            }
            if (set.contains(9)) {
                see.m35051a(parcel, 9, this.f83312i);
            }
            if (set.contains(10)) {
                see.m35065b(parcel, 10, this.f83313j, true);
            }
            if (set.contains(11)) {
                see.m35040a(parcel, 11, this.f83314k, i, true);
            }
            if (set.contains(12)) {
                see.m35051a(parcel, 12, this.f83315l);
            }
            if (set.contains(13)) {
                see.m35065b(parcel, 13, this.f83316m, true);
            }
            if (set.contains(14)) {
                see.m35036a(parcel, 14, this.f83317n);
            }
            if (set.contains(15)) {
                see.m35046a(parcel, 15, this.f83318o, true);
            }
            if (set.contains(16)) {
                see.m35046a(parcel, 16, this.f83319p, true);
            }
            if (set.contains(17)) {
                see.m35065b(parcel, 17, this.f83320q, true);
            }
            if (set.contains(18)) {
                see.m35046a(parcel, 18, this.f83321r, true);
            }
            if (set.contains(19)) {
                see.m35040a(parcel, 19, this.f83322s, i, true);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 8) {
                this.f83311h = str2;
            } else if (i == 18) {
                this.f83321r = str2;
            } else if (i == 15) {
                this.f83318o = str2;
            } else if (i == 16) {
                this.f83319p = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83304a.add(Integer.valueOf(i));
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83305b = arrayList;
                this.f83304a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83306c = arrayList;
            } else if (i == 4) {
                this.f83307d = arrayList;
            } else if (i == 6) {
                this.f83309f = arrayList;
            } else if (i == 7) {
                this.f83310g = arrayList;
            } else if (i == 10) {
                this.f83313j = arrayList;
            } else if (i == 13) {
                this.f83316m = arrayList;
            } else if (i == 17) {
                this.f83320q = arrayList;
            } else {
                StringBuilder sb = new StringBuilder(64);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be an array of String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83304a.add(Integer.valueOf(i));
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 11) {
                this.f83314k = (IdentityInfo) sio;
            } else if (i == 19) {
                this.f83322s = (ProfileOwnerStats) sio;
            } else {
                String canonicalName = sio.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not a known custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83304a.add(Integer.valueOf(i));
        }

        /* renamed from: b */
        public final boolean mo46747b() {
            return this.f83304a.contains(17);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 5) {
                this.f83308e = z;
            } else if (i == 9) {
                this.f83312i = z;
            } else if (i == 12) {
                this.f83315l = z;
            } else {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a boolean.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83304a.add(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83304a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Names extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokc();

        /* renamed from: o */
        private static final HashMap f83339o;

        /* renamed from: a */
        public final Set f83340a;

        /* renamed from: b */
        public String f83341b;

        /* renamed from: c */
        public String f83342c;

        /* renamed from: d */
        public String f83343d;

        /* renamed from: e */
        public String f83344e;

        /* renamed from: f */
        public String f83345f;

        /* renamed from: g */
        public String f83346g;

        /* renamed from: h */
        public Mergedpeoplemetadata f83347h;

        /* renamed from: i */
        public String f83348i;

        /* renamed from: j */
        public String f83349j;

        /* renamed from: k */
        public String f83350k;

        /* renamed from: l */
        public String f83351l;

        /* renamed from: m */
        public String f83352m;

        /* renamed from: n */
        String f83353n;

        static {
            HashMap hashMap = new HashMap();
            f83339o = hashMap;
            hashMap.put("displayName", FastJsonResponse$Field.m22666f("displayName", 2));
            f83339o.put("familyName", FastJsonResponse$Field.m22666f("familyName", 3));
            f83339o.put("formatted", FastJsonResponse$Field.m22666f("formatted", 4));
            f83339o.put("givenName", FastJsonResponse$Field.m22666f("givenName", 5));
            f83339o.put("honorificPrefix", FastJsonResponse$Field.m22666f("honorificPrefix", 6));
            f83339o.put("honorificSuffix", FastJsonResponse$Field.m22666f("honorificSuffix", 7));
            f83339o.put("metadata", FastJsonResponse$Field.m22653a("metadata", 8, Mergedpeoplemetadata.class));
            f83339o.put("middleName", FastJsonResponse$Field.m22666f("middleName", 9));
            f83339o.put("phoneticFamilyName", FastJsonResponse$Field.m22666f("phoneticFamilyName", 10));
            f83339o.put("phoneticGivenName", FastJsonResponse$Field.m22666f("phoneticGivenName", 11));
            f83339o.put("phoneticHonorificPrefix", FastJsonResponse$Field.m22666f("phoneticHonorificPrefix", 12));
            f83339o.put("phoneticHonorificSuffix", FastJsonResponse$Field.m22666f("phoneticHonorificSuffix", 13));
            f83339o.put("phoneticMiddleName", FastJsonResponse$Field.m22666f("phoneticMiddleName", 14));
        }

        public Names() {
            this.f83340a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83339o;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    return this.f83341b;
                case 3:
                    return this.f83342c;
                case 4:
                    return this.f83343d;
                case 5:
                    return this.f83344e;
                case 6:
                    return this.f83345f;
                case 7:
                    return this.f83346g;
                case 8:
                    return this.f83347h;
                case 9:
                    return this.f83348i;
                case 10:
                    return this.f83349j;
                case 11:
                    return this.f83350k;
                case 12:
                    return this.f83351l;
                case 13:
                    return this.f83352m;
                case 14:
                    return this.f83353n;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Names)) {
                return false;
            }
            if (this != obj) {
                Names names = (Names) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83339o.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!names.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(names.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (names.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83339o.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Names(Set set, String str, String str2, String str3, String str4, String str5, String str6, Mergedpeoplemetadata mergedpeoplemetadata, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.f83340a = set;
            this.f83341b = str;
            this.f83342c = str2;
            this.f83343d = str3;
            this.f83344e = str4;
            this.f83345f = str5;
            this.f83346g = str6;
            this.f83347h = mergedpeoplemetadata;
            this.f83348i = str7;
            this.f83349j = str8;
            this.f83350k = str9;
            this.f83351l = str10;
            this.f83352m = str11;
            this.f83353n = str12;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    this.f83341b = str2;
                    break;
                case 3:
                    this.f83342c = str2;
                    break;
                case 4:
                    this.f83343d = str2;
                    break;
                case 5:
                    this.f83344e = str2;
                    break;
                case 6:
                    this.f83345f = str2;
                    break;
                case 7:
                    this.f83346g = str2;
                    break;
                case 8:
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                case 9:
                    this.f83348i = str2;
                    break;
                case 10:
                    this.f83349j = str2;
                    break;
                case 11:
                    this.f83350k = str2;
                    break;
                case 12:
                    this.f83351l = str2;
                    break;
                case 13:
                    this.f83352m = str2;
                    break;
                case 14:
                    this.f83353n = str2;
                    break;
            }
            this.f83340a.add(Integer.valueOf(i));
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
            Set set = this.f83340a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83341b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83342c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83343d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83344e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f83345f, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f83346g, true);
            }
            if (set.contains(8)) {
                see.m35040a(parcel, 8, this.f83347h, i, true);
            }
            if (set.contains(9)) {
                see.m35046a(parcel, 9, this.f83348i, true);
            }
            if (set.contains(10)) {
                see.m35046a(parcel, 10, this.f83349j, true);
            }
            if (set.contains(11)) {
                see.m35046a(parcel, 11, this.f83350k, true);
            }
            if (set.contains(12)) {
                see.m35046a(parcel, 12, this.f83351l, true);
            }
            if (set.contains(13)) {
                see.m35046a(parcel, 13, this.f83352m, true);
            }
            if (set.contains(14)) {
                see.m35046a(parcel, 14, this.f83353n, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 8) {
                this.f83347h = (Mergedpeoplemetadata) sio;
                this.f83340a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83340a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Nicknames extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokd();

        /* renamed from: e */
        private static final HashMap f83354e;

        /* renamed from: a */
        public final Set f83355a;

        /* renamed from: b */
        public Mergedpeoplemetadata f83356b;

        /* renamed from: c */
        public String f83357c;

        /* renamed from: d */
        public String f83358d;

        static {
            HashMap hashMap = new HashMap();
            f83354e = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83354e.put("type", FastJsonResponse$Field.m22666f("type", 3));
            f83354e.put("value", FastJsonResponse$Field.m22666f("value", 4));
        }

        public Nicknames() {
            this.f83355a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83354e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83356b;
            }
            if (i == 3) {
                return this.f83357c;
            }
            if (i == 4) {
                return this.f83358d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Nicknames)) {
                return false;
            }
            if (this != obj) {
                Nicknames nicknames = (Nicknames) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83354e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!nicknames.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(nicknames.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (nicknames.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83354e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Nicknames(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.f83355a = set;
            this.f83356b = mergedpeoplemetadata;
            this.f83357c = str;
            this.f83358d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83357c = str2;
            } else if (i == 4) {
                this.f83358d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83355a.add(Integer.valueOf(i));
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
            Set set = this.f83355a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83356b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83357c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83358d, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83356b = (Mergedpeoplemetadata) sio;
                this.f83355a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83355a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Occupations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aoke();

        /* renamed from: d */
        private static final HashMap f83359d;

        /* renamed from: a */
        public final Set f83360a;

        /* renamed from: b */
        public Mergedpeoplemetadata f83361b;

        /* renamed from: c */
        public String f83362c;

        static {
            HashMap hashMap = new HashMap();
            f83359d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83359d.put("value", FastJsonResponse$Field.m22666f("value", 3));
        }

        public Occupations() {
            this.f83360a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83359d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83361b;
            }
            if (i == 3) {
                return this.f83362c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Occupations)) {
                return false;
            }
            if (this != obj) {
                Occupations occupations = (Occupations) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83359d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!occupations.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(occupations.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (occupations.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83359d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Occupations(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.f83360a = set;
            this.f83361b = mergedpeoplemetadata;
            this.f83362c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83362c = str2;
                this.f83360a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83360a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83361b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83362c, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83361b = (Mergedpeoplemetadata) sio;
                this.f83360a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83360a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Organizations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokf();

        /* renamed from: o */
        private static final HashMap f83363o;

        /* renamed from: a */
        public final Set f83364a;

        /* renamed from: b */
        public boolean f83365b;

        /* renamed from: c */
        public String f83366c;

        /* renamed from: d */
        public String f83367d;

        /* renamed from: e */
        public String f83368e;

        /* renamed from: f */
        public String f83369f;

        /* renamed from: g */
        public String f83370g;

        /* renamed from: h */
        public Mergedpeoplemetadata f83371h;

        /* renamed from: i */
        public String f83372i;

        /* renamed from: j */
        public String f83373j;

        /* renamed from: k */
        public String f83374k;

        /* renamed from: l */
        public String f83375l;

        /* renamed from: m */
        public String f83376m;

        /* renamed from: n */
        public String f83377n;

        static {
            HashMap hashMap = new HashMap();
            f83363o = hashMap;
            hashMap.put("current", FastJsonResponse$Field.m22664e("current", 2));
            f83363o.put("department", FastJsonResponse$Field.m22666f("department", 3));
            f83363o.put("description", FastJsonResponse$Field.m22666f("description", 4));
            f83363o.put("domain", FastJsonResponse$Field.m22666f("domain", 5));
            f83363o.put("endDate", FastJsonResponse$Field.m22666f("endDate", 6));
            f83363o.put("location", FastJsonResponse$Field.m22666f("location", 8));
            f83363o.put("metadata", FastJsonResponse$Field.m22653a("metadata", 9, Mergedpeoplemetadata.class));
            f83363o.put("name", FastJsonResponse$Field.m22666f("name", 10));
            f83363o.put("phoneticName", FastJsonResponse$Field.m22666f("phoneticName", 11));
            f83363o.put("startDate", FastJsonResponse$Field.m22666f("startDate", 12));
            f83363o.put("symbol", FastJsonResponse$Field.m22666f("symbol", 14));
            f83363o.put("title", FastJsonResponse$Field.m22666f("title", 15));
            f83363o.put("type", FastJsonResponse$Field.m22666f("type", 16));
        }

        public Organizations() {
            this.f83364a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83363o;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    return Boolean.valueOf(this.f83365b);
                case 3:
                    return this.f83366c;
                case 4:
                    return this.f83367d;
                case 5:
                    return this.f83368e;
                case 6:
                    return this.f83369f;
                case 7:
                case 13:
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                case 8:
                    return this.f83370g;
                case 9:
                    return this.f83371h;
                case 10:
                    return this.f83372i;
                case 11:
                    return this.f83373j;
                case 12:
                    return this.f83374k;
                case 14:
                    return this.f83375l;
                case 15:
                    return this.f83376m;
                case 16:
                    return this.f83377n;
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Organizations)) {
                return false;
            }
            if (this != obj) {
                Organizations organizations = (Organizations) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83363o.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!organizations.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(organizations.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (organizations.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83363o.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Organizations(Set set, boolean z, String str, String str2, String str3, String str4, String str5, Mergedpeoplemetadata mergedpeoplemetadata, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.f83364a = set;
            this.f83365b = z;
            this.f83366c = str;
            this.f83367d = str2;
            this.f83368e = str3;
            this.f83369f = str4;
            this.f83370g = str5;
            this.f83371h = mergedpeoplemetadata;
            this.f83372i = str6;
            this.f83373j = str7;
            this.f83374k = str8;
            this.f83375l = str9;
            this.f83376m = str10;
            this.f83377n = str11;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 3:
                    this.f83366c = str2;
                    break;
                case 4:
                    this.f83367d = str2;
                    break;
                case 5:
                    this.f83368e = str2;
                    break;
                case 6:
                    this.f83369f = str2;
                    break;
                case 7:
                case 9:
                case 13:
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                case 8:
                    this.f83370g = str2;
                    break;
                case 10:
                    this.f83372i = str2;
                    break;
                case 11:
                    this.f83373j = str2;
                    break;
                case 12:
                    this.f83374k = str2;
                    break;
                case 14:
                    this.f83375l = str2;
                    break;
                case 15:
                    this.f83376m = str2;
                    break;
                case 16:
                    this.f83377n = str2;
                    break;
            }
            this.f83364a.add(Integer.valueOf(i));
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
            Set set = this.f83364a;
            if (set.contains(2)) {
                see.m35051a(parcel, 2, this.f83365b);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83366c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83367d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83368e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f83369f, true);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f83370g, true);
            }
            if (set.contains(9)) {
                see.m35040a(parcel, 9, this.f83371h, i, true);
            }
            if (set.contains(10)) {
                see.m35046a(parcel, 10, this.f83372i, true);
            }
            if (set.contains(11)) {
                see.m35046a(parcel, 11, this.f83373j, true);
            }
            if (set.contains(12)) {
                see.m35046a(parcel, 12, this.f83374k, true);
            }
            if (set.contains(14)) {
                see.m35046a(parcel, 14, this.f83375l, true);
            }
            if (set.contains(15)) {
                see.m35046a(parcel, 15, this.f83376m, true);
            }
            if (set.contains(16)) {
                see.m35046a(parcel, 16, this.f83377n, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 9) {
                this.f83371h = (Mergedpeoplemetadata) sio;
                this.f83364a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83365b = z;
                this.f83364a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83364a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class OtherKeywords extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokg();

        /* renamed from: e */
        private static final HashMap f83378e;

        /* renamed from: a */
        final Set f83379a;

        /* renamed from: b */
        Mergedpeoplemetadata f83380b;

        /* renamed from: c */
        String f83381c;

        /* renamed from: d */
        String f83382d;

        static {
            HashMap hashMap = new HashMap();
            f83378e = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83378e.put("type", FastJsonResponse$Field.m22666f("type", 3));
            f83378e.put("value", FastJsonResponse$Field.m22666f("value", 4));
        }

        public OtherKeywords() {
            this.f83379a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83378e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83380b;
            }
            if (i == 3) {
                return this.f83381c;
            }
            if (i == 4) {
                return this.f83382d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OtherKeywords)) {
                return false;
            }
            if (this != obj) {
                OtherKeywords otherKeywords = (OtherKeywords) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83378e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!otherKeywords.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(otherKeywords.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (otherKeywords.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83378e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public OtherKeywords(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.f83379a = set;
            this.f83380b = mergedpeoplemetadata;
            this.f83381c = str;
            this.f83382d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83381c = str2;
            } else if (i == 4) {
                this.f83382d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83379a.add(Integer.valueOf(i));
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
            Set set = this.f83379a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83380b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83381c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83382d, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83380b = (Mergedpeoplemetadata) sio;
                this.f83379a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83379a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class PhoneNumbers extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokh();

        /* renamed from: g */
        private static final HashMap f83383g;

        /* renamed from: a */
        public final Set f83384a;

        /* renamed from: b */
        public String f83385b;

        /* renamed from: c */
        public String f83386c;

        /* renamed from: d */
        public Mergedpeoplemetadata f83387d;

        /* renamed from: e */
        public String f83388e;

        /* renamed from: f */
        public String f83389f;

        static {
            HashMap hashMap = new HashMap();
            f83383g = hashMap;
            hashMap.put("canonicalizedForm", FastJsonResponse$Field.m22666f("canonicalizedForm", 2));
            f83383g.put("formattedType", FastJsonResponse$Field.m22666f("formattedType", 4));
            f83383g.put("metadata", FastJsonResponse$Field.m22653a("metadata", 5, Mergedpeoplemetadata.class));
            f83383g.put("type", FastJsonResponse$Field.m22666f("type", 6));
            f83383g.put("value", FastJsonResponse$Field.m22666f("value", 8));
        }

        public PhoneNumbers() {
            this.f83384a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83383g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83385b;
            }
            if (i == 8) {
                return this.f83389f;
            }
            if (i == 4) {
                return this.f83386c;
            }
            if (i == 5) {
                return this.f83387d;
            }
            if (i == 6) {
                return this.f83388e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PhoneNumbers)) {
                return false;
            }
            if (this != obj) {
                PhoneNumbers phoneNumbers = (PhoneNumbers) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83383g.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!phoneNumbers.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(phoneNumbers.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (phoneNumbers.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83383g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public PhoneNumbers(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3, String str4) {
            this.f83384a = set;
            this.f83385b = str;
            this.f83386c = str2;
            this.f83387d = mergedpeoplemetadata;
            this.f83388e = str3;
            this.f83389f = str4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83385b = str2;
            } else if (i == 4) {
                this.f83386c = str2;
            } else if (i == 6) {
                this.f83388e = str2;
            } else if (i == 8) {
                this.f83389f = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83384a.add(Integer.valueOf(i));
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
            Set set = this.f83384a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83385b, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83386c, true);
            }
            if (set.contains(5)) {
                see.m35040a(parcel, 5, this.f83387d, i, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f83388e, true);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f83389f, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 5) {
                this.f83387d = (Mergedpeoplemetadata) sio;
                this.f83384a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83384a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class PlacesLived extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aoki();

        /* renamed from: e */
        private static final HashMap f83390e;

        /* renamed from: a */
        public final Set f83391a;

        /* renamed from: b */
        public boolean f83392b;

        /* renamed from: c */
        public Mergedpeoplemetadata f83393c;

        /* renamed from: d */
        public String f83394d;

        static {
            HashMap hashMap = new HashMap();
            f83390e = hashMap;
            hashMap.put("current", FastJsonResponse$Field.m22664e("current", 2));
            f83390e.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
            f83390e.put("value", FastJsonResponse$Field.m22666f("value", 4));
        }

        public PlacesLived() {
            this.f83391a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83390e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Boolean.valueOf(this.f83392b);
            }
            if (i == 3) {
                return this.f83393c;
            }
            if (i == 4) {
                return this.f83394d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PlacesLived)) {
                return false;
            }
            if (this != obj) {
                PlacesLived placesLived = (PlacesLived) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83390e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!placesLived.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(placesLived.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (placesLived.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83390e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public PlacesLived(Set set, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.f83391a = set;
            this.f83392b = z;
            this.f83393c = mergedpeoplemetadata;
            this.f83394d = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f83394d = str2;
                this.f83391a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83391a;
            if (set.contains(2)) {
                see.m35051a(parcel, 2, this.f83392b);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83393c, i, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83394d, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83393c = (Mergedpeoplemetadata) sio;
                this.f83391a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83392b = z;
                this.f83391a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83391a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Relations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokj();

        /* renamed from: f */
        private static final HashMap f83395f;

        /* renamed from: a */
        public final Set f83396a;

        /* renamed from: b */
        public String f83397b;

        /* renamed from: c */
        public Mergedpeoplemetadata f83398c;

        /* renamed from: d */
        public String f83399d;

        /* renamed from: e */
        public String f83400e;

        static {
            HashMap hashMap = new HashMap();
            f83395f = hashMap;
            hashMap.put("formattedType", FastJsonResponse$Field.m22666f("formattedType", 2));
            f83395f.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
            f83395f.put("type", FastJsonResponse$Field.m22666f("type", 4));
            f83395f.put("value", FastJsonResponse$Field.m22666f("value", 5));
        }

        public Relations() {
            this.f83396a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83395f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83397b;
            }
            if (i == 3) {
                return this.f83398c;
            }
            if (i == 4) {
                return this.f83399d;
            }
            if (i == 5) {
                return this.f83400e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Relations)) {
                return false;
            }
            if (this != obj) {
                Relations relations = (Relations) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83395f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!relations.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(relations.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (relations.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83395f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Relations(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.f83396a = set;
            this.f83397b = str;
            this.f83398c = mergedpeoplemetadata;
            this.f83399d = str2;
            this.f83400e = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83397b = str2;
            } else if (i == 4) {
                this.f83399d = str2;
            } else if (i == 5) {
                this.f83400e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83396a.add(Integer.valueOf(i));
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
            Set set = this.f83396a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83397b, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83398c, i, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83399d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83400e, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83398c = (Mergedpeoplemetadata) sio;
                this.f83396a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83396a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SipAddress extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokk();

        /* renamed from: e */
        private static final HashMap f83401e;

        /* renamed from: a */
        final Set f83402a;

        /* renamed from: b */
        Mergedpeoplemetadata f83403b;

        /* renamed from: c */
        String f83404c;

        /* renamed from: d */
        String f83405d;

        static {
            HashMap hashMap = new HashMap();
            f83401e = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83401e.put("type", FastJsonResponse$Field.m22666f("type", 3));
            f83401e.put("value", FastJsonResponse$Field.m22666f("value", 4));
        }

        public SipAddress() {
            this.f83402a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83401e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83403b;
            }
            if (i == 3) {
                return this.f83404c;
            }
            if (i == 4) {
                return this.f83405d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SipAddress)) {
                return false;
            }
            if (this != obj) {
                SipAddress sipAddress = (SipAddress) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83401e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!sipAddress.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(sipAddress.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (sipAddress.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83401e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public SipAddress(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.f83402a = set;
            this.f83403b = mergedpeoplemetadata;
            this.f83404c = str;
            this.f83405d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83404c = str2;
            } else if (i == 4) {
                this.f83405d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83402a.add(Integer.valueOf(i));
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
            Set set = this.f83402a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83403b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83404c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83405d, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83403b = (Mergedpeoplemetadata) sio;
                this.f83402a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83402a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Skills extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokl();

        /* renamed from: d */
        private static final HashMap f83406d;

        /* renamed from: a */
        public final Set f83407a;

        /* renamed from: b */
        public Mergedpeoplemetadata f83408b;

        /* renamed from: c */
        public String f83409c;

        static {
            HashMap hashMap = new HashMap();
            f83406d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83406d.put("value", FastJsonResponse$Field.m22666f("value", 3));
        }

        public Skills() {
            this.f83407a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83406d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83408b;
            }
            if (i == 3) {
                return this.f83409c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Skills)) {
                return false;
            }
            if (this != obj) {
                Skills skills = (Skills) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83406d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!skills.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(skills.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (skills.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83406d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Skills(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.f83407a = set;
            this.f83408b = mergedpeoplemetadata;
            this.f83409c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83409c = str2;
                this.f83407a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83407a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83408b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83409c, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83408b = (Mergedpeoplemetadata) sio;
                this.f83407a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83407a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class SortKeys extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokm();

        /* renamed from: g */
        private static final HashMap f83410g;

        /* renamed from: a */
        public final Set f83411a;

        /* renamed from: b */
        List f83412b;

        /* renamed from: c */
        String f83413c;

        /* renamed from: d */
        public String f83414d;

        /* renamed from: e */
        String f83415e;

        /* renamed from: f */
        public String f83416f;

        static {
            HashMap hashMap = new HashMap();
            f83410g = hashMap;
            hashMap.put("affinities", FastJsonResponse$Field.m22657b("affinities", 2, Mergedpeopleaffinities.class));
            f83410g.put("firstName", FastJsonResponse$Field.m22666f("firstName", 3));
            f83410g.put("interactionRank", FastJsonResponse$Field.m22666f("interactionRank", 4));
            f83410g.put("lastName", FastJsonResponse$Field.m22666f("lastName", 5));
            f83410g.put("name", FastJsonResponse$Field.m22666f("name", 6));
        }

        public SortKeys() {
            this.f83411a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83410g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83412b;
            }
            if (i == 3) {
                return this.f83413c;
            }
            if (i == 4) {
                return this.f83414d;
            }
            if (i == 5) {
                return this.f83415e;
            }
            if (i == 6) {
                return this.f83416f;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SortKeys)) {
                return false;
            }
            if (this != obj) {
                SortKeys sortKeys = (SortKeys) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83410g.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!sortKeys.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(sortKeys.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (sortKeys.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83410g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public SortKeys(Set set, List list, String str, String str2, String str3, String str4) {
            this.f83411a = set;
            this.f83412b = list;
            this.f83413c = str;
            this.f83414d = str2;
            this.f83415e = str3;
            this.f83416f = str4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83413c = str2;
            } else if (i == 4) {
                this.f83414d = str2;
            } else if (i == 5) {
                this.f83415e = str2;
            } else if (i == 6) {
                this.f83416f = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83411a.add(Integer.valueOf(i));
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
            Set set = this.f83411a;
            if (set.contains(2)) {
                see.m35066c(parcel, 2, this.f83412b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83413c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83414d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83415e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f83416f, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83412b = arrayList;
                this.f83411a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83411a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Taglines extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aokn();

        /* renamed from: d */
        private static final HashMap f83417d;

        /* renamed from: a */
        public final Set f83418a;

        /* renamed from: b */
        public Mergedpeoplemetadata f83419b;

        /* renamed from: c */
        public String f83420c;

        static {
            HashMap hashMap = new HashMap();
            f83417d = hashMap;
            hashMap.put("metadata", FastJsonResponse$Field.m22653a("metadata", 2, Mergedpeoplemetadata.class));
            f83417d.put("value", FastJsonResponse$Field.m22666f("value", 3));
        }

        public Taglines() {
            this.f83418a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83417d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83419b;
            }
            if (i == 3) {
                return this.f83420c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Taglines)) {
                return false;
            }
            if (this != obj) {
                Taglines taglines = (Taglines) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83417d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!taglines.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(taglines.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (taglines.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83417d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Taglines(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.f83418a = set;
            this.f83419b = mergedpeoplemetadata;
            this.f83420c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83420c = str2;
                this.f83418a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
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
            Set set = this.f83418a;
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f83419b, i, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83420c, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83419b = (Mergedpeoplemetadata) sio;
                this.f83418a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83418a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Urls extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aoko();

        /* renamed from: f */
        private static final HashMap f83421f;

        /* renamed from: a */
        public final Set f83422a;

        /* renamed from: b */
        public String f83423b;

        /* renamed from: c */
        public Mergedpeoplemetadata f83424c;

        /* renamed from: d */
        public String f83425d;

        /* renamed from: e */
        public String f83426e;

        static {
            HashMap hashMap = new HashMap();
            f83421f = hashMap;
            hashMap.put("formattedType", FastJsonResponse$Field.m22666f("formattedType", 2));
            f83421f.put("metadata", FastJsonResponse$Field.m22653a("metadata", 3, Mergedpeoplemetadata.class));
            f83421f.put("type", FastJsonResponse$Field.m22666f("type", 5));
            f83421f.put("value", FastJsonResponse$Field.m22666f("value", 6));
        }

        public Urls() {
            this.f83422a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83421f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83423b;
            }
            if (i == 3) {
                return this.f83424c;
            }
            if (i == 5) {
                return this.f83425d;
            }
            if (i == 6) {
                return this.f83426e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Urls)) {
                return false;
            }
            if (this != obj) {
                Urls urls = (Urls) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83421f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!urls.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(urls.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (urls.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83421f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Urls(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.f83422a = set;
            this.f83423b = str;
            this.f83424c = mergedpeoplemetadata;
            this.f83425d = str2;
            this.f83426e = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83423b = str2;
            } else if (i == 5) {
                this.f83425d = str2;
            } else if (i == 6) {
                this.f83426e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83422a.add(Integer.valueOf(i));
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
            Set set = this.f83422a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83423b, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83424c, i, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f83425d, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f83426e, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83424c = (Mergedpeoplemetadata) sio;
                this.f83422a.add(Integer.valueOf(i));
                return;
            }
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83422a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f83139M = hashMap;
        hashMap.put("abouts", FastJsonResponse$Field.m22657b("abouts", 2, Abouts.class));
        f83139M.put("addresses", FastJsonResponse$Field.m22657b("addresses", 3, Addresses.class));
        f83139M.put("birthdays", FastJsonResponse$Field.m22657b("birthdays", 5, Birthdays.class));
        f83139M.put("braggingRights", FastJsonResponse$Field.m22657b("braggingRights", 6, BraggingRights.class));
        f83139M.put("calendars", FastJsonResponse$Field.m22657b("calendars", 7, Calendars.class));
        f83139M.put("clientData", FastJsonResponse$Field.m22657b("clientData", 8, ClientData.class));
        f83139M.put("coverPhotos", FastJsonResponse$Field.m22657b("coverPhotos", 9, CoverPhotos.class));
        f83139M.put("customFields", FastJsonResponse$Field.m22657b("customFields", 10, CustomFields.class));
        f83139M.put("emails", FastJsonResponse$Field.m22657b("emails", 11, Emails.class));
        f83139M.put("etag", FastJsonResponse$Field.m22666f("etag", 12));
        f83139M.put("events", FastJsonResponse$Field.m22657b("events", 13, Events.class));
        f83139M.put("extendedData", FastJsonResponse$Field.m22653a("extendedData", 14, ExtendedData.class));
        f83139M.put("externalIds", FastJsonResponse$Field.m22657b("externalIds", 15, ExternalIds.class));
        f83139M.put("genders", FastJsonResponse$Field.m22657b("genders", 17, Genders.class));
        f83139M.put("id", FastJsonResponse$Field.m22666f("id", 18));
        f83139M.put("images", FastJsonResponse$Field.m22657b("images", 19, Images.class));
        f83139M.put("instantMessaging", FastJsonResponse$Field.m22657b("instantMessaging", 21, InstantMessaging.class));
        f83139M.put("interests", FastJsonResponse$Field.m22657b("interests", 22, Interests.class));
        f83139M.put("language", FastJsonResponse$Field.m22666f("language", 24));
        f83139M.put("languages", FastJsonResponse$Field.m22657b("languages", 25, Languages.class));
        f83139M.put("legacyFields", FastJsonResponse$Field.m22653a("legacyFields", 26, LegacyFields.class));
        f83139M.put("memberships", FastJsonResponse$Field.m22657b("memberships", 28, Memberships.class));
        f83139M.put("metadata", FastJsonResponse$Field.m22653a("metadata", 29, Metadata.class));
        f83139M.put("names", FastJsonResponse$Field.m22657b("names", 30, Names.class));
        f83139M.put("nicknames", FastJsonResponse$Field.m22657b("nicknames", 31, Nicknames.class));
        f83139M.put("occupations", FastJsonResponse$Field.m22657b("occupations", 32, Occupations.class));
        f83139M.put("organizations", FastJsonResponse$Field.m22657b("organizations", 33, Organizations.class));
        f83139M.put("otherKeywords", FastJsonResponse$Field.m22657b("otherKeywords", 34, OtherKeywords.class));
        f83139M.put("phoneNumbers", FastJsonResponse$Field.m22657b("phoneNumbers", 36, PhoneNumbers.class));
        f83139M.put("placesLived", FastJsonResponse$Field.m22657b("placesLived", 38, PlacesLived.class));
        f83139M.put("profileUrl", FastJsonResponse$Field.m22666f("profileUrl", 39));
        f83139M.put("relations", FastJsonResponse$Field.m22657b("relations", 40, Relations.class));
        f83139M.put("sipAddress", FastJsonResponse$Field.m22657b("sipAddress", 43, SipAddress.class));
        f83139M.put("skills", FastJsonResponse$Field.m22657b("skills", 44, Skills.class));
        f83139M.put("sortKeys", FastJsonResponse$Field.m22653a("sortKeys", 45, SortKeys.class));
        f83139M.put("taglines", FastJsonResponse$Field.m22657b("taglines", 46, Taglines.class));
        f83139M.put("urls", FastJsonResponse$Field.m22657b("urls", 47, Urls.class));
    }

    public Person() {
        this.f83152a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83139M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f83153b;
            case 3:
                return this.f83154c;
            case 4:
            case 16:
            case 20:
            case 23:
            case 27:
            case 35:
            case FelicaException.TYPE_NOT_CLOSED:
            case 41:
            case FelicaException.TYPE_ALREADY_ACTIVATED:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 5:
                return this.f83155d;
            case 6:
                return this.f83156e;
            case 7:
                return this.f83157f;
            case 8:
                return this.f83158g;
            case 9:
                return this.f83159h;
            case 10:
                return this.f83160i;
            case 11:
                return this.f83161j;
            case 12:
                return this.f83162k;
            case 13:
                return this.f83163l;
            case 14:
                return this.f83164m;
            case 15:
                return this.f83165n;
            case 17:
                return this.f83166o;
            case 18:
                return this.f83167p;
            case 19:
                return this.f83168q;
            case 21:
                return this.f83169r;
            case 22:
                return this.f83170s;
            case 24:
                return this.f83171t;
            case 25:
                return this.f83172u;
            case 26:
                return this.f83173v;
            case 28:
                return this.f83174w;
            case 29:
                return this.f83175x;
            case 30:
                return this.f83176y;
            case 31:
                return this.f83177z;
            case 32:
                return this.f83140A;
            case 33:
                return this.f83141B;
            case 34:
                return this.f83142C;
            case 36:
                return this.f83143D;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return this.f83144E;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return this.f83145F;
            case FelicaException.TYPE_PUSH_FAILED:
                return this.f83146G;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return this.f83147H;
            case FelicaException.TYPE_RESET_FAILED:
                return this.f83148I;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return this.f83149J;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return this.f83150K;
            case 47:
                return this.f83151L;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this != obj) {
            Person person = (Person) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83139M.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!person.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(person.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (person.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83139M.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public Person(Set set, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, String str, List list10, ExtendedData extendedData, List list11, List list12, String str2, List list13, List list14, List list15, String str3, List list16, LegacyFields legacyFields, List list17, Metadata metadata, List list18, List list19, List list20, List list21, List list22, List list23, List list24, String str4, List list25, List list26, List list27, SortKeys sortKeys, List list28, List list29) {
        this.f83152a = set;
        this.f83153b = list;
        this.f83154c = list2;
        this.f83155d = list3;
        this.f83156e = list4;
        this.f83157f = list5;
        this.f83158g = list6;
        this.f83159h = list7;
        this.f83160i = list8;
        this.f83161j = list9;
        this.f83162k = str;
        this.f83163l = list10;
        this.f83164m = extendedData;
        this.f83165n = list11;
        this.f83166o = list12;
        this.f83167p = str2;
        this.f83168q = list13;
        this.f83169r = list14;
        this.f83170s = list15;
        this.f83171t = str3;
        this.f83172u = list16;
        this.f83173v = legacyFields;
        this.f83174w = list17;
        this.f83175x = metadata;
        this.f83176y = list18;
        this.f83177z = list19;
        this.f83140A = list20;
        this.f83141B = list21;
        this.f83142C = list22;
        this.f83143D = list23;
        this.f83144E = list24;
        this.f83145F = str4;
        this.f83146G = list25;
        this.f83147H = list26;
        this.f83148I = list27;
        this.f83149J = sortKeys;
        this.f83150K = list28;
        this.f83151L = list29;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 12) {
            this.f83162k = str2;
        } else if (i == 18) {
            this.f83167p = str2;
        } else if (i == 24) {
            this.f83171t = str2;
        } else if (i == 39) {
            this.f83145F = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83152a.add(Integer.valueOf(i));
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
        Set set = this.f83152a;
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f83153b, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f83154c, true);
        }
        if (set.contains(5)) {
            see.m35066c(parcel, 5, this.f83155d, true);
        }
        if (set.contains(6)) {
            see.m35066c(parcel, 6, this.f83156e, true);
        }
        if (set.contains(7)) {
            see.m35066c(parcel, 7, this.f83157f, true);
        }
        if (set.contains(8)) {
            see.m35066c(parcel, 8, this.f83158g, true);
        }
        if (set.contains(9)) {
            see.m35066c(parcel, 9, this.f83159h, true);
        }
        if (set.contains(10)) {
            see.m35066c(parcel, 10, this.f83160i, true);
        }
        if (set.contains(11)) {
            see.m35066c(parcel, 11, this.f83161j, true);
        }
        if (set.contains(12)) {
            see.m35046a(parcel, 12, this.f83162k, true);
        }
        if (set.contains(13)) {
            see.m35066c(parcel, 13, this.f83163l, true);
        }
        if (set.contains(14)) {
            see.m35040a(parcel, 14, this.f83164m, i, true);
        }
        if (set.contains(15)) {
            see.m35066c(parcel, 15, this.f83165n, true);
        }
        if (set.contains(17)) {
            see.m35066c(parcel, 17, this.f83166o, true);
        }
        if (set.contains(18)) {
            see.m35046a(parcel, 18, this.f83167p, true);
        }
        if (set.contains(19)) {
            see.m35066c(parcel, 19, this.f83168q, true);
        }
        if (set.contains(21)) {
            see.m35066c(parcel, 21, this.f83169r, true);
        }
        if (set.contains(22)) {
            see.m35066c(parcel, 22, this.f83170s, true);
        }
        if (set.contains(24)) {
            see.m35046a(parcel, 24, this.f83171t, true);
        }
        if (set.contains(25)) {
            see.m35066c(parcel, 25, this.f83172u, true);
        }
        if (set.contains(26)) {
            see.m35040a(parcel, 26, this.f83173v, i, true);
        }
        if (set.contains(28)) {
            see.m35066c(parcel, 28, this.f83174w, true);
        }
        if (set.contains(29)) {
            see.m35040a(parcel, 29, this.f83175x, i, true);
        }
        if (set.contains(30)) {
            see.m35066c(parcel, 30, this.f83176y, true);
        }
        if (set.contains(31)) {
            see.m35066c(parcel, 31, this.f83177z, true);
        }
        if (set.contains(32)) {
            see.m35066c(parcel, 32, this.f83140A, true);
        }
        if (set.contains(33)) {
            see.m35066c(parcel, 33, this.f83141B, true);
        }
        if (set.contains(34)) {
            see.m35066c(parcel, 34, this.f83142C, true);
        }
        if (set.contains(36)) {
            see.m35066c(parcel, 36, this.f83143D, true);
        }
        if (set.contains(38)) {
            see.m35066c(parcel, 38, this.f83144E, true);
        }
        if (set.contains(39)) {
            see.m35046a(parcel, 39, this.f83145F, true);
        }
        if (set.contains(40)) {
            see.m35066c(parcel, 40, this.f83146G, true);
        }
        if (set.contains(43)) {
            see.m35066c(parcel, 43, this.f83147H, true);
        }
        if (set.contains(44)) {
            see.m35066c(parcel, 44, this.f83148I, true);
        }
        if (set.contains(45)) {
            see.m35040a(parcel, 45, this.f83149J, i, true);
        }
        if (set.contains(46)) {
            see.m35066c(parcel, 46, this.f83150K, true);
        }
        if (set.contains(47)) {
            see.m35066c(parcel, 47, this.f83151L, true);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                this.f83153b = arrayList;
                break;
            case 3:
                this.f83154c = arrayList;
                break;
            case 4:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:
            case 23:
            case 24:
            case 26:
            case 27:
            case 29:
            case 35:
            case FelicaException.TYPE_NOT_CLOSED:
            case FelicaException.TYPE_USED_BY_OTHER_APP:
            case 41:
            case FelicaException.TYPE_ALREADY_ACTIVATED:
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
            default:
                String canonicalName = arrayList.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not a known array of custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            case 5:
                this.f83155d = arrayList;
                break;
            case 6:
                this.f83156e = arrayList;
                break;
            case 7:
                this.f83157f = arrayList;
                break;
            case 8:
                this.f83158g = arrayList;
                break;
            case 9:
                this.f83159h = arrayList;
                break;
            case 10:
                this.f83160i = arrayList;
                break;
            case 11:
                this.f83161j = arrayList;
                break;
            case 13:
                this.f83163l = arrayList;
                break;
            case 15:
                this.f83165n = arrayList;
                break;
            case 17:
                this.f83166o = arrayList;
                break;
            case 19:
                this.f83168q = arrayList;
                break;
            case 21:
                this.f83169r = arrayList;
                break;
            case 22:
                this.f83170s = arrayList;
                break;
            case 25:
                this.f83172u = arrayList;
                break;
            case 28:
                this.f83174w = arrayList;
                break;
            case 30:
                this.f83176y = arrayList;
                break;
            case 31:
                this.f83177z = arrayList;
                break;
            case 32:
                this.f83140A = arrayList;
                break;
            case 33:
                this.f83141B = arrayList;
                break;
            case 34:
                this.f83142C = arrayList;
                break;
            case 36:
                this.f83143D = arrayList;
                break;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                this.f83144E = arrayList;
                break;
            case FelicaException.TYPE_PUSH_FAILED:
                this.f83146G = arrayList;
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                this.f83147H = arrayList;
                break;
            case FelicaException.TYPE_RESET_FAILED:
                this.f83148I = arrayList;
                break;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                this.f83150K = arrayList;
                break;
            case 47:
                this.f83151L = arrayList;
                break;
        }
        this.f83152a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 14) {
            this.f83164m = (ExtendedData) sio;
        } else if (i == 26) {
            this.f83173v = (LegacyFields) sio;
        } else if (i == 29) {
            this.f83175x = (Metadata) sio;
        } else if (i == 45) {
            this.f83149J = (SortKeys) sio;
        } else {
            String canonicalName = sio.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83152a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83152a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
