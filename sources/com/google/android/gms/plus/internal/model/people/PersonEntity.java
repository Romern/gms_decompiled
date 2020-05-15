package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PersonEntity extends FastSafeParcelableJsonResponse implements anxo {

    /* renamed from: A */
    private static final HashMap f82456A;
    public static final Parcelable.Creator CREATOR = new anwy();

    /* renamed from: a */
    final Set f82457a;

    /* renamed from: b */
    final int f82458b;

    /* renamed from: c */
    String f82459c;

    /* renamed from: d */
    AgeRangeEntity f82460d;

    /* renamed from: e */
    String f82461e;

    /* renamed from: f */
    String f82462f;

    /* renamed from: g */
    int f82463g;

    /* renamed from: h */
    CoverEntity f82464h;

    /* renamed from: i */
    String f82465i;

    /* renamed from: j */
    String f82466j;

    /* renamed from: k */
    int f82467k;

    /* renamed from: l */
    String f82468l;

    /* renamed from: m */
    ImageEntity f82469m;

    /* renamed from: n */
    boolean f82470n;

    /* renamed from: o */
    String f82471o;

    /* renamed from: p */
    NameEntity f82472p;

    /* renamed from: q */
    String f82473q;

    /* renamed from: r */
    int f82474r;

    /* renamed from: s */
    List f82475s;

    /* renamed from: t */
    List f82476t;

    /* renamed from: u */
    int f82477u;

    /* renamed from: v */
    int f82478v;

    /* renamed from: w */
    String f82479w;

    /* renamed from: x */
    String f82480x;

    /* renamed from: y */
    List f82481y;

    /* renamed from: z */
    boolean f82482z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class AgeRangeEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new anwz();

        /* renamed from: e */
        private static final HashMap f82483e;

        /* renamed from: a */
        final Set f82484a;

        /* renamed from: b */
        final int f82485b;

        /* renamed from: c */
        int f82486c;

        /* renamed from: d */
        int f82487d;

        static {
            HashMap hashMap = new HashMap();
            f82483e = hashMap;
            hashMap.put("max", FastJsonResponse$Field.m22651a("max", 2));
            f82483e.put("min", FastJsonResponse$Field.m22651a("min", 3));
        }

        public AgeRangeEntity() {
            this.f82485b = 1;
            this.f82484a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82483e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Integer.valueOf(this.f82486c);
            }
            if (i == 3) {
                return Integer.valueOf(this.f82487d);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof AgeRangeEntity)) {
                return false;
            }
            if (this != obj) {
                AgeRangeEntity ageRangeEntity = (AgeRangeEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82483e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!ageRangeEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(ageRangeEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (ageRangeEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82483e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.f30319g;
            if (i2 == 2) {
                this.f82486c = i;
            } else if (i2 == 3) {
                this.f82487d = i;
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Field with id=");
                sb.append(i2);
                sb.append(" is not known to be an int.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82484a.add(Integer.valueOf(i2));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f82484a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82485b);
            }
            if (set.contains(2)) {
                see.m35063b(parcel, 2, this.f82486c);
            }
            if (set.contains(3)) {
                see.m35063b(parcel, 3, this.f82487d);
            }
            see.m35062b(parcel, a);
        }

        public AgeRangeEntity(Set set, int i, int i2, int i3) {
            this.f82484a = set;
            this.f82485b = i;
            this.f82486c = i2;
            this.f82487d = i3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82484a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class CoverEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new anxa();

        /* renamed from: f */
        private static final HashMap f82488f;

        /* renamed from: a */
        final Set f82489a;

        /* renamed from: b */
        final int f82490b;

        /* renamed from: c */
        CoverInfoEntity f82491c;

        /* renamed from: d */
        CoverPhotoEntity f82492d;

        /* renamed from: e */
        int f82493e;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class CoverInfoEntity extends FastSafeParcelableJsonResponse implements rty {
            public static final Parcelable.Creator CREATOR = new anxb();

            /* renamed from: e */
            private static final HashMap f82494e;

            /* renamed from: a */
            final Set f82495a;

            /* renamed from: b */
            final int f82496b;

            /* renamed from: c */
            int f82497c;

            /* renamed from: d */
            int f82498d;

            static {
                HashMap hashMap = new HashMap();
                f82494e = hashMap;
                hashMap.put("leftImageOffset", FastJsonResponse$Field.m22651a("leftImageOffset", 2));
                f82494e.put("topImageOffset", FastJsonResponse$Field.m22651a("topImageOffset", 3));
            }

            public CoverInfoEntity() {
                this.f82496b = 1;
                this.f82495a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82494e;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return Integer.valueOf(this.f82497c);
                }
                if (i == 3) {
                    return Integer.valueOf(this.f82498d);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof CoverInfoEntity)) {
                    return false;
                }
                if (this != obj) {
                    CoverInfoEntity coverInfoEntity = (CoverInfoEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82494e.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!coverInfoEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(coverInfoEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (coverInfoEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82494e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
                int i2 = fastJsonResponse$Field.f30319g;
                if (i2 == 2) {
                    this.f82497c = i;
                } else if (i2 == 3) {
                    this.f82498d = i;
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be an int.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f82495a.add(Integer.valueOf(i2));
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = see.m35030a(parcel);
                Set set = this.f82495a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82496b);
                }
                if (set.contains(2)) {
                    see.m35063b(parcel, 2, this.f82497c);
                }
                if (set.contains(3)) {
                    see.m35063b(parcel, 3, this.f82498d);
                }
                see.m35062b(parcel, a);
            }

            public CoverInfoEntity(Set set, int i, int i2, int i3) {
                this.f82495a = set;
                this.f82496b = i;
                this.f82497c = i2;
                this.f82498d = i3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f82495a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class CoverPhotoEntity extends FastSafeParcelableJsonResponse implements rty {
            public static final Parcelable.Creator CREATOR = new anxc();

            /* renamed from: f */
            private static final HashMap f82499f;

            /* renamed from: a */
            final Set f82500a;

            /* renamed from: b */
            final int f82501b;

            /* renamed from: c */
            int f82502c;

            /* renamed from: d */
            String f82503d;

            /* renamed from: e */
            int f82504e;

            static {
                HashMap hashMap = new HashMap();
                f82499f = hashMap;
                hashMap.put("height", FastJsonResponse$Field.m22651a("height", 2));
                f82499f.put("url", FastJsonResponse$Field.m22666f("url", 3));
                f82499f.put("width", FastJsonResponse$Field.m22651a("width", 4));
            }

            public CoverPhotoEntity() {
                this.f82501b = 1;
                this.f82500a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82499f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return Integer.valueOf(this.f82502c);
                }
                if (i == 3) {
                    return this.f82503d;
                }
                if (i == 4) {
                    return Integer.valueOf(this.f82504e);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof CoverPhotoEntity)) {
                    return false;
                }
                if (this != obj) {
                    CoverPhotoEntity coverPhotoEntity = (CoverPhotoEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82499f.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!coverPhotoEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(coverPhotoEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (coverPhotoEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82499f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
                int i2 = fastJsonResponse$Field.f30319g;
                if (i2 == 2) {
                    this.f82502c = i;
                } else if (i2 == 4) {
                    this.f82504e = i;
                } else {
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Field with id=");
                    sb.append(i2);
                    sb.append(" is not known to be an int.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f82500a.add(Integer.valueOf(i2));
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
                Set set = this.f82500a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82501b);
                }
                if (set.contains(2)) {
                    see.m35063b(parcel, 2, this.f82502c);
                }
                if (set.contains(3)) {
                    see.m35046a(parcel, 3, this.f82503d, true);
                }
                if (set.contains(4)) {
                    see.m35063b(parcel, 4, this.f82504e);
                }
                see.m35062b(parcel, a);
            }

            public CoverPhotoEntity(Set set, int i, int i2, String str, int i3) {
                this.f82500a = set;
                this.f82501b = i;
                this.f82502c = i2;
                this.f82503d = str;
                this.f82504e = i3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 3) {
                    this.f82503d = str2;
                    this.f82500a.add(Integer.valueOf(i));
                    return;
                }
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f82500a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f82488f = hashMap;
            hashMap.put("coverInfo", FastJsonResponse$Field.m22653a("coverInfo", 2, CoverInfoEntity.class));
            f82488f.put("coverPhoto", FastJsonResponse$Field.m22653a("coverPhoto", 3, CoverPhotoEntity.class));
            HashMap hashMap2 = f82488f;
            StringToIntConverter stringToIntConverter = new StringToIntConverter();
            stringToIntConverter.mo17854a("banner", 0);
            hashMap2.put("layout", FastJsonResponse$Field.m22652a("layout", 4, stringToIntConverter));
        }

        public CoverEntity() {
            this.f82490b = 1;
            this.f82489a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82488f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82491c;
            }
            if (i == 3) {
                return this.f82492d;
            }
            if (i == 4) {
                return Integer.valueOf(this.f82493e);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CoverEntity)) {
                return false;
            }
            if (this != obj) {
                CoverEntity coverEntity = (CoverEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82488f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!coverEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(coverEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (coverEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82488f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.f30319g;
            if (i2 == 4) {
                this.f82493e = i;
                this.f82489a.add(Integer.valueOf(i2));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f82489a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82490b);
            }
            if (set.contains(2)) {
                see.m35040a(parcel, 2, this.f82491c, i, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f82492d, i, true);
            }
            if (set.contains(4)) {
                see.m35063b(parcel, 4, this.f82493e);
            }
            see.m35062b(parcel, a);
        }

        public CoverEntity(Set set, int i, CoverInfoEntity coverInfoEntity, CoverPhotoEntity coverPhotoEntity, int i2) {
            this.f82489a = set;
            this.f82490b = i;
            this.f82491c = coverInfoEntity;
            this.f82492d = coverPhotoEntity;
            this.f82493e = i2;
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f82491c = (CoverInfoEntity) sio;
            } else if (i == 3) {
                this.f82492d = (CoverPhotoEntity) sio;
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
            this.f82489a.add(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82489a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ImageEntity extends FastSafeParcelableJsonResponse implements anxn {
        public static final Parcelable.Creator CREATOR = new anxd();

        /* renamed from: d */
        private static final HashMap f82505d;

        /* renamed from: a */
        final Set f82506a;

        /* renamed from: b */
        final int f82507b;

        /* renamed from: c */
        String f82508c;

        static {
            HashMap hashMap = new HashMap();
            f82505d = hashMap;
            hashMap.put("url", FastJsonResponse$Field.m22666f("url", 2));
        }

        public ImageEntity() {
            this.f82507b = 1;
            this.f82506a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82505d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82508c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: b */
        public final String mo42386b() {
            return this.f82508c;
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ImageEntity)) {
                return false;
            }
            if (this != obj) {
                ImageEntity imageEntity = (ImageEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82505d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!imageEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(imageEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (imageEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82505d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f82508c = str2;
                this.f82506a.add(Integer.valueOf(i));
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
            Set set = this.f82506a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82507b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82508c, true);
            }
            see.m35062b(parcel, a);
        }

        public ImageEntity(String str) {
            HashSet hashSet = new HashSet();
            this.f82506a = hashSet;
            this.f82507b = 1;
            this.f82508c = str;
            hashSet.add(2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82506a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }

        public ImageEntity(Set set, int i, String str) {
            this.f82506a = set;
            this.f82507b = i;
            this.f82508c = str;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class NameEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new anxe();

        /* renamed from: i */
        private static final HashMap f82509i;

        /* renamed from: a */
        final Set f82510a;

        /* renamed from: b */
        final int f82511b;

        /* renamed from: c */
        String f82512c;

        /* renamed from: d */
        String f82513d;

        /* renamed from: e */
        String f82514e;

        /* renamed from: f */
        String f82515f;

        /* renamed from: g */
        String f82516g;

        /* renamed from: h */
        String f82517h;

        static {
            HashMap hashMap = new HashMap();
            f82509i = hashMap;
            hashMap.put("familyName", FastJsonResponse$Field.m22666f("familyName", 2));
            f82509i.put("formatted", FastJsonResponse$Field.m22666f("formatted", 3));
            f82509i.put("givenName", FastJsonResponse$Field.m22666f("givenName", 4));
            f82509i.put("honorificPrefix", FastJsonResponse$Field.m22666f("honorificPrefix", 5));
            f82509i.put("honorificSuffix", FastJsonResponse$Field.m22666f("honorificSuffix", 6));
            f82509i.put("middleName", FastJsonResponse$Field.m22666f("middleName", 7));
        }

        public NameEntity() {
            this.f82511b = 1;
            this.f82510a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82509i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    return this.f82512c;
                case 3:
                    return this.f82513d;
                case 4:
                    return this.f82514e;
                case 5:
                    return this.f82515f;
                case 6:
                    return this.f82516g;
                case 7:
                    return this.f82517h;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof NameEntity)) {
                return false;
            }
            if (this != obj) {
                NameEntity nameEntity = (NameEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82509i.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!nameEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(nameEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (nameEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82509i.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    this.f82512c = str2;
                    break;
                case 3:
                    this.f82513d = str2;
                    break;
                case 4:
                    this.f82514e = str2;
                    break;
                case 5:
                    this.f82515f = str2;
                    break;
                case 6:
                    this.f82516g = str2;
                    break;
                case 7:
                    this.f82517h = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
            this.f82510a.add(Integer.valueOf(i));
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
            Set set = this.f82510a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82511b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82512c, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f82513d, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f82514e, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f82515f, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f82516g, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f82517h, true);
            }
            see.m35062b(parcel, a);
        }

        public NameEntity(Set set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f82510a = set;
            this.f82511b = i;
            this.f82512c = str;
            this.f82513d = str2;
            this.f82514e = str3;
            this.f82515f = str4;
            this.f82516g = str5;
            this.f82517h = str6;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82510a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class OrganizationsEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new anxf();

        /* renamed from: l */
        private static final HashMap f82518l;

        /* renamed from: a */
        final Set f82519a;

        /* renamed from: b */
        final int f82520b;

        /* renamed from: c */
        String f82521c;

        /* renamed from: d */
        String f82522d;

        /* renamed from: e */
        String f82523e;

        /* renamed from: f */
        String f82524f;

        /* renamed from: g */
        String f82525g;

        /* renamed from: h */
        boolean f82526h;

        /* renamed from: i */
        String f82527i;

        /* renamed from: j */
        String f82528j;

        /* renamed from: k */
        int f82529k;

        static {
            HashMap hashMap = new HashMap();
            f82518l = hashMap;
            hashMap.put("department", FastJsonResponse$Field.m22666f("department", 2));
            f82518l.put("description", FastJsonResponse$Field.m22666f("description", 3));
            f82518l.put("endDate", FastJsonResponse$Field.m22666f("endDate", 4));
            f82518l.put("location", FastJsonResponse$Field.m22666f("location", 5));
            f82518l.put("name", FastJsonResponse$Field.m22666f("name", 6));
            f82518l.put("primary", FastJsonResponse$Field.m22664e("primary", 7));
            f82518l.put("startDate", FastJsonResponse$Field.m22666f("startDate", 8));
            f82518l.put("title", FastJsonResponse$Field.m22666f("title", 9));
            HashMap hashMap2 = f82518l;
            StringToIntConverter stringToIntConverter = new StringToIntConverter();
            stringToIntConverter.mo17854a("work", 0);
            stringToIntConverter.mo17854a("school", 1);
            hashMap2.put("type", FastJsonResponse$Field.m22652a("type", 10, stringToIntConverter));
        }

        public OrganizationsEntity() {
            this.f82520b = 1;
            this.f82519a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82518l;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    return this.f82521c;
                case 3:
                    return this.f82522d;
                case 4:
                    return this.f82523e;
                case 5:
                    return this.f82524f;
                case 6:
                    return this.f82525g;
                case 7:
                    return Boolean.valueOf(this.f82526h);
                case 8:
                    return this.f82527i;
                case 9:
                    return this.f82528j;
                case 10:
                    return Integer.valueOf(this.f82529k);
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OrganizationsEntity)) {
                return false;
            }
            if (this != obj) {
                OrganizationsEntity organizationsEntity = (OrganizationsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82518l.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!organizationsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(organizationsEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (organizationsEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82518l.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.f30319g;
            if (i2 == 10) {
                this.f82529k = i;
                this.f82519a.add(Integer.valueOf(i2));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
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
            Set set = this.f82519a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82520b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82521c, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f82522d, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f82523e, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f82524f, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f82525g, true);
            }
            if (set.contains(7)) {
                see.m35051a(parcel, 7, this.f82526h);
            }
            if (set.contains(8)) {
                see.m35046a(parcel, 8, this.f82527i, true);
            }
            if (set.contains(9)) {
                see.m35046a(parcel, 9, this.f82528j, true);
            }
            if (set.contains(10)) {
                see.m35063b(parcel, 10, this.f82529k);
            }
            see.m35062b(parcel, a);
        }

        public OrganizationsEntity(Set set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.f82519a = set;
            this.f82520b = i;
            this.f82521c = str;
            this.f82522d = str2;
            this.f82523e = str3;
            this.f82524f = str4;
            this.f82525g = str5;
            this.f82526h = z;
            this.f82527i = str6;
            this.f82528j = str7;
            this.f82529k = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    this.f82521c = str2;
                    break;
                case 3:
                    this.f82522d = str2;
                    break;
                case 4:
                    this.f82523e = str2;
                    break;
                case 5:
                    this.f82524f = str2;
                    break;
                case 6:
                    this.f82525g = str2;
                    break;
                case 7:
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                case 8:
                    this.f82527i = str2;
                    break;
                case 9:
                    this.f82528j = str2;
                    break;
            }
            this.f82519a.add(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 7) {
                this.f82526h = z;
                this.f82519a.add(Integer.valueOf(i));
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
            return this.f82519a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class PlacesLivedEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new anxg();

        /* renamed from: e */
        private static final HashMap f82530e;

        /* renamed from: a */
        final Set f82531a;

        /* renamed from: b */
        final int f82532b;

        /* renamed from: c */
        boolean f82533c;

        /* renamed from: d */
        String f82534d;

        static {
            HashMap hashMap = new HashMap();
            f82530e = hashMap;
            hashMap.put("primary", FastJsonResponse$Field.m22664e("primary", 2));
            f82530e.put("value", FastJsonResponse$Field.m22666f("value", 3));
        }

        public PlacesLivedEntity() {
            this.f82532b = 1;
            this.f82531a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82530e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Boolean.valueOf(this.f82533c);
            }
            if (i == 3) {
                return this.f82534d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PlacesLivedEntity)) {
                return false;
            }
            if (this != obj) {
                PlacesLivedEntity placesLivedEntity = (PlacesLivedEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82530e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!placesLivedEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(placesLivedEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (placesLivedEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82530e.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f82534d = str2;
                this.f82531a.add(Integer.valueOf(i));
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
            Set set = this.f82531a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82532b);
            }
            if (set.contains(2)) {
                see.m35051a(parcel, 2, this.f82533c);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f82534d, true);
            }
            see.m35062b(parcel, a);
        }

        public PlacesLivedEntity(Set set, int i, boolean z, String str) {
            this.f82531a = set;
            this.f82532b = i;
            this.f82533c = z;
            this.f82534d = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f82533c = z;
                this.f82531a.add(Integer.valueOf(i));
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
            return this.f82531a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class UrlsEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new anxh();

        /* renamed from: f */
        private static final HashMap f82535f;

        /* renamed from: a */
        final Set f82536a;

        /* renamed from: b */
        final int f82537b;

        /* renamed from: c */
        String f82538c;

        /* renamed from: d */
        int f82539d;

        /* renamed from: e */
        String f82540e;

        static {
            HashMap hashMap = new HashMap();
            f82535f = hashMap;
            hashMap.put("label", FastJsonResponse$Field.m22666f("label", 5));
            HashMap hashMap2 = f82535f;
            StringToIntConverter stringToIntConverter = new StringToIntConverter();
            stringToIntConverter.mo17854a("home", 0);
            stringToIntConverter.mo17854a("work", 1);
            stringToIntConverter.mo17854a("blog", 2);
            stringToIntConverter.mo17854a("profile", 3);
            stringToIntConverter.mo17854a("other", 4);
            stringToIntConverter.mo17854a("otherProfile", 5);
            stringToIntConverter.mo17854a("contributor", 6);
            stringToIntConverter.mo17854a("website", 7);
            hashMap2.put("type", FastJsonResponse$Field.m22652a("type", 6, stringToIntConverter));
            f82535f.put("value", FastJsonResponse$Field.m22666f("value", 4));
        }

        public UrlsEntity() {
            this.f82537b = 1;
            this.f82536a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82535f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                return this.f82540e;
            }
            if (i == 5) {
                return this.f82538c;
            }
            if (i == 6) {
                return Integer.valueOf(this.f82539d);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof UrlsEntity)) {
                return false;
            }
            if (this != obj) {
                UrlsEntity urlsEntity = (UrlsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82535f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!urlsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(urlsEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (urlsEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82535f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.f30319g;
            if (i2 == 6) {
                this.f82539d = i;
                this.f82536a.add(Integer.valueOf(i2));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
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
            Set set = this.f82536a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82537b);
            }
            if (set.contains(3)) {
                see.m35063b(parcel, 3, 4);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f82540e, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f82538c, true);
            }
            if (set.contains(6)) {
                see.m35063b(parcel, 6, this.f82539d);
            }
            see.m35062b(parcel, a);
        }

        public UrlsEntity(Set set, int i, String str, int i2, String str2) {
            this.f82536a = set;
            this.f82537b = i;
            this.f82538c = str;
            this.f82539d = i2;
            this.f82540e = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f82540e = str2;
            } else if (i == 5) {
                this.f82538c = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82536a.add(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82536a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f82456A = hashMap;
        hashMap.put("aboutMe", FastJsonResponse$Field.m22666f("aboutMe", 2));
        f82456A.put("ageRange", FastJsonResponse$Field.m22653a("ageRange", 3, AgeRangeEntity.class));
        f82456A.put("birthday", FastJsonResponse$Field.m22666f("birthday", 4));
        f82456A.put("braggingRights", FastJsonResponse$Field.m22666f("braggingRights", 5));
        f82456A.put("circledByCount", FastJsonResponse$Field.m22651a("circledByCount", 6));
        f82456A.put("cover", FastJsonResponse$Field.m22653a("cover", 7, CoverEntity.class));
        f82456A.put("currentLocation", FastJsonResponse$Field.m22666f("currentLocation", 8));
        f82456A.put("displayName", FastJsonResponse$Field.m22666f("displayName", 9));
        HashMap hashMap2 = f82456A;
        StringToIntConverter stringToIntConverter = new StringToIntConverter();
        stringToIntConverter.mo17854a("male", 0);
        stringToIntConverter.mo17854a("female", 1);
        stringToIntConverter.mo17854a("other", 2);
        hashMap2.put("gender", FastJsonResponse$Field.m22652a("gender", 12, stringToIntConverter));
        f82456A.put("id", FastJsonResponse$Field.m22666f("id", 14));
        f82456A.put("image", FastJsonResponse$Field.m22653a("image", 15, ImageEntity.class));
        f82456A.put("isPlusUser", FastJsonResponse$Field.m22664e("isPlusUser", 16));
        f82456A.put("language", FastJsonResponse$Field.m22666f("language", 18));
        f82456A.put("name", FastJsonResponse$Field.m22653a("name", 19, NameEntity.class));
        f82456A.put("nickname", FastJsonResponse$Field.m22666f("nickname", 20));
        HashMap hashMap3 = f82456A;
        StringToIntConverter stringToIntConverter2 = new StringToIntConverter();
        stringToIntConverter2.mo17854a("person", 0);
        stringToIntConverter2.mo17854a("page", 1);
        hashMap3.put("objectType", FastJsonResponse$Field.m22652a("objectType", 21, stringToIntConverter2));
        f82456A.put("organizations", FastJsonResponse$Field.m22657b("organizations", 22, OrganizationsEntity.class));
        f82456A.put("placesLived", FastJsonResponse$Field.m22657b("placesLived", 23, PlacesLivedEntity.class));
        f82456A.put("plusOneCount", FastJsonResponse$Field.m22651a("plusOneCount", 24));
        HashMap hashMap4 = f82456A;
        StringToIntConverter stringToIntConverter3 = new StringToIntConverter();
        stringToIntConverter3.mo17854a("single", 0);
        stringToIntConverter3.mo17854a("in_a_relationship", 1);
        stringToIntConverter3.mo17854a("engaged", 2);
        stringToIntConverter3.mo17854a("married", 3);
        stringToIntConverter3.mo17854a("its_complicated", 4);
        stringToIntConverter3.mo17854a("open_relationship", 5);
        stringToIntConverter3.mo17854a("widowed", 6);
        stringToIntConverter3.mo17854a("in_domestic_partnership", 7);
        stringToIntConverter3.mo17854a("in_civil_union", 8);
        hashMap4.put("relationshipStatus", FastJsonResponse$Field.m22652a("relationshipStatus", 25, stringToIntConverter3));
        f82456A.put("tagline", FastJsonResponse$Field.m22666f("tagline", 26));
        f82456A.put("url", FastJsonResponse$Field.m22666f("url", 27));
        f82456A.put("urls", FastJsonResponse$Field.m22657b("urls", 28, UrlsEntity.class));
        f82456A.put("verified", FastJsonResponse$Field.m22664e("verified", 29));
    }

    public PersonEntity() {
        this.f82458b = 1;
        this.f82457a = new HashSet();
    }

    /* renamed from: c */
    public static void m68452c(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        PersonEntity personEntity = (PersonEntity) CREATOR.createFromParcel(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82456A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f82459c;
            case 3:
                return this.f82460d;
            case 4:
                return this.f82461e;
            case 5:
                return this.f82462f;
            case 6:
                return Integer.valueOf(this.f82463g);
            case 7:
                return this.f82464h;
            case 8:
                return this.f82465i;
            case 9:
                return this.f82466j;
            case 10:
            case 11:
            case 13:
            case 17:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 12:
                return Integer.valueOf(this.f82467k);
            case 14:
                return this.f82468l;
            case 15:
                return this.f82469m;
            case 16:
                return Boolean.valueOf(this.f82470n);
            case 18:
                return this.f82471o;
            case 19:
                return this.f82472p;
            case 20:
                return this.f82473q;
            case 21:
                return Integer.valueOf(this.f82474r);
            case 22:
                return this.f82475s;
            case 23:
                return this.f82476t;
            case 24:
                return Integer.valueOf(this.f82477u);
            case 25:
                return Integer.valueOf(this.f82478v);
            case 26:
                return this.f82479w;
            case 27:
                return this.f82480x;
            case 28:
                return this.f82481y;
            case 29:
                return Boolean.valueOf(this.f82482z);
        }
    }

    /* renamed from: b */
    public final String mo42387b() {
        return this.f82466j;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo42388c() {
        return this.f82468l;
    }

    /* renamed from: d */
    public final anxn mo42389d() {
        return this.f82469m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity)) {
            return false;
        }
        if (this != obj) {
            PersonEntity personEntity = (PersonEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82456A.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!personEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(personEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (personEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int mo42390f() {
        return this.f82474r;
    }

    /* renamed from: g */
    public final String mo42391g() {
        return this.f82480x;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82456A.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 6) {
            this.f82463g = i;
        } else if (i2 == 12) {
            this.f82467k = i;
        } else if (i2 == 21) {
            this.f82474r = i;
        } else if (i2 == 24) {
            this.f82477u = i;
        } else if (i2 == 25) {
            this.f82478v = i;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82457a.add(Integer.valueOf(i2));
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
        Set set = this.f82457a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82458b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82459c, true);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f82460d, i, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f82461e, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82462f, true);
        }
        if (set.contains(6)) {
            see.m35063b(parcel, 6, this.f82463g);
        }
        if (set.contains(7)) {
            see.m35040a(parcel, 7, this.f82464h, i, true);
        }
        if (set.contains(8)) {
            see.m35046a(parcel, 8, this.f82465i, true);
        }
        if (set.contains(9)) {
            see.m35046a(parcel, 9, this.f82466j, true);
        }
        if (set.contains(12)) {
            see.m35063b(parcel, 12, this.f82467k);
        }
        if (set.contains(14)) {
            see.m35046a(parcel, 14, this.f82468l, true);
        }
        if (set.contains(15)) {
            see.m35040a(parcel, 15, this.f82469m, i, true);
        }
        if (set.contains(16)) {
            see.m35051a(parcel, 16, this.f82470n);
        }
        if (set.contains(18)) {
            see.m35046a(parcel, 18, this.f82471o, true);
        }
        if (set.contains(19)) {
            see.m35040a(parcel, 19, this.f82472p, i, true);
        }
        if (set.contains(20)) {
            see.m35046a(parcel, 20, this.f82473q, true);
        }
        if (set.contains(21)) {
            see.m35063b(parcel, 21, this.f82474r);
        }
        if (set.contains(22)) {
            see.m35066c(parcel, 22, this.f82475s, true);
        }
        if (set.contains(23)) {
            see.m35066c(parcel, 23, this.f82476t, true);
        }
        if (set.contains(24)) {
            see.m35063b(parcel, 24, this.f82477u);
        }
        if (set.contains(25)) {
            see.m35063b(parcel, 25, this.f82478v);
        }
        if (set.contains(26)) {
            see.m35046a(parcel, 26, this.f82479w, true);
        }
        if (set.contains(27)) {
            see.m35046a(parcel, 27, this.f82480x, true);
        }
        if (set.contains(28)) {
            see.m35066c(parcel, 28, this.f82481y, true);
        }
        if (set.contains(29)) {
            see.m35051a(parcel, 29, this.f82482z);
        }
        see.m35062b(parcel, a);
    }

    public PersonEntity(String str, String str2, ImageEntity imageEntity, String str3) {
        this.f82458b = 1;
        HashSet hashSet = new HashSet();
        this.f82457a = hashSet;
        this.f82466j = str;
        hashSet.add(9);
        this.f82468l = str2;
        this.f82457a.add(14);
        this.f82469m = imageEntity;
        this.f82457a.add(15);
        this.f82474r = 0;
        this.f82457a.add(21);
        this.f82480x = str3;
        this.f82457a.add(27);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82459c = str2;
        } else if (i == 14) {
            this.f82468l = str2;
        } else if (i == 18) {
            this.f82471o = str2;
        } else if (i == 20) {
            this.f82473q = str2;
        } else if (i == 4) {
            this.f82461e = str2;
        } else if (i == 5) {
            this.f82462f = str2;
        } else if (i == 8) {
            this.f82465i = str2;
        } else if (i == 9) {
            this.f82466j = str2;
        } else if (i == 26) {
            this.f82479w = str2;
        } else if (i == 27) {
            this.f82480x = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82457a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 22) {
            this.f82475s = arrayList;
        } else if (i == 23) {
            this.f82476t = arrayList;
        } else if (i == 28) {
            this.f82481y = arrayList;
        } else {
            String canonicalName = arrayList.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not a known array of custom type.  Found ");
            sb.append(canonicalName);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82457a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82460d = (AgeRangeEntity) sio;
        } else if (i == 7) {
            this.f82464h = (CoverEntity) sio;
        } else if (i == 15) {
            this.f82469m = (ImageEntity) sio;
        } else if (i == 19) {
            this.f82472p = (NameEntity) sio;
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
        this.f82457a.add(Integer.valueOf(i));
    }

    public PersonEntity(Set set, int i, String str, AgeRangeEntity ageRangeEntity, String str2, String str3, int i2, CoverEntity coverEntity, String str4, String str5, int i3, String str6, ImageEntity imageEntity, boolean z, String str7, NameEntity nameEntity, String str8, int i4, List list, List list2, int i5, int i6, String str9, String str10, List list3, boolean z2) {
        this.f82457a = set;
        this.f82458b = i;
        this.f82459c = str;
        this.f82460d = ageRangeEntity;
        this.f82461e = str2;
        this.f82462f = str3;
        this.f82463g = i2;
        this.f82464h = coverEntity;
        this.f82465i = str4;
        this.f82466j = str5;
        this.f82467k = i3;
        this.f82468l = str6;
        this.f82469m = imageEntity;
        this.f82470n = z;
        this.f82471o = str7;
        this.f82472p = nameEntity;
        this.f82473q = str8;
        this.f82474r = i4;
        this.f82475s = list;
        this.f82476t = list2;
        this.f82477u = i5;
        this.f82478v = i6;
        this.f82479w = str9;
        this.f82480x = str10;
        this.f82481y = list3;
        this.f82482z = z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 16) {
            this.f82470n = z;
        } else if (i == 29) {
            this.f82482z = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82457a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82457a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
