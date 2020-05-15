package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AccountField extends FastSafeParcelableJsonResponse implements aoed {
    public static final Parcelable.Creator CREATOR = new aods();

    /* renamed from: l */
    private static final HashMap f82665l;

    /* renamed from: a */
    final Set f82666a;

    /* renamed from: b */
    final int f82667b;

    /* renamed from: c */
    List f82668c;

    /* renamed from: d */
    boolean f82669d;

    /* renamed from: e */
    String f82670e;

    /* renamed from: f */
    LabelEntity f82671f;

    /* renamed from: g */
    boolean f82672g;

    /* renamed from: h */
    List f82673h;

    /* renamed from: i */
    String f82674i;

    /* renamed from: j */
    ValueEntity f82675j;

    /* renamed from: k */
    String f82676k;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ErrorsEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, aodv {
        public static final Parcelable.Creator CREATOR = new aoee();

        /* renamed from: f */
        private static final HashMap f82677f;

        /* renamed from: a */
        final Set f82678a;

        /* renamed from: b */
        final int f82679b;

        /* renamed from: c */
        public String f82680c;

        /* renamed from: d */
        public List f82681d;

        /* renamed from: e */
        public String f82682e;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class ReferencesEntity extends FastSafeParcelableJsonResponse implements aodu {
            public static final Parcelable.Creator CREATOR = new aoef();

            /* renamed from: f */
            private static final HashMap f82683f;

            /* renamed from: a */
            final Set f82684a;

            /* renamed from: b */
            final int f82685b;

            /* renamed from: c */
            String f82686c;

            /* renamed from: d */
            String f82687d;

            /* renamed from: e */
            String f82688e;

            static {
                HashMap hashMap = new HashMap();
                f82683f = hashMap;
                hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
                f82683f.put("text", FastJsonResponse$Field.m22666f("text", 3));
                f82683f.put("title", FastJsonResponse$Field.m22666f("title", 4));
            }

            public ReferencesEntity() {
                this.f82685b = 1;
                this.f82684a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82683f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return this.f82686c;
                }
                if (i == 3) {
                    return this.f82687d;
                }
                if (i == 4) {
                    return this.f82688e;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: b */
            public final String mo42559b() {
                return this.f82686c;
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            /* renamed from: c */
            public final boolean mo42560c() {
                return this.f82684a.contains(2);
            }

            /* renamed from: d */
            public final String mo42561d() {
                return this.f82687d;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof ReferencesEntity)) {
                    return false;
                }
                if (this != obj) {
                    ReferencesEntity referencesEntity = (ReferencesEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82683f.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!referencesEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(referencesEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (referencesEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            /* renamed from: f */
            public final boolean mo42562f() {
                return this.f82684a.contains(3);
            }

            /* renamed from: g */
            public final String mo42563g() {
                return this.f82688e;
            }

            /* renamed from: h */
            public final boolean mo42564h() {
                return this.f82684a.contains(4);
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82683f.values()) {
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
                    this.f82686c = str2;
                } else if (i == 3) {
                    this.f82687d = str2;
                } else if (i == 4) {
                    this.f82688e = str2;
                } else {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f82684a.add(Integer.valueOf(i));
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
                Set set = this.f82684a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82685b);
                }
                if (set.contains(2)) {
                    see.m35046a(parcel, 2, this.f82686c, true);
                }
                if (set.contains(3)) {
                    see.m35046a(parcel, 3, this.f82687d, true);
                }
                if (set.contains(4)) {
                    see.m35046a(parcel, 4, this.f82688e, true);
                }
                see.m35062b(parcel, a);
            }

            public ReferencesEntity(Set set, int i, String str, String str2, String str3) {
                this.f82684a = set;
                this.f82685b = i;
                this.f82686c = str;
                this.f82687d = str2;
                this.f82688e = str3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f82684a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f82677f = hashMap;
            hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
            f82677f.put("references", FastJsonResponse$Field.m22657b("references", 3, ReferencesEntity.class));
            f82677f.put("text", FastJsonResponse$Field.m22666f("text", 4));
        }

        public ErrorsEntity() {
            this.f82679b = 1;
            this.f82678a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82677f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82680c;
            }
            if (i == 3) {
                return this.f82681d;
            }
            if (i == 4) {
                return this.f82682e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: b */
        public final String mo42565b() {
            return this.f82680c;
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        /* renamed from: c */
        public final boolean mo42566c() {
            return this.f82678a.contains(2);
        }

        /* renamed from: d */
        public final List mo42567d() {
            return this.f82681d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ErrorsEntity)) {
                return false;
            }
            if (this != obj) {
                ErrorsEntity errorsEntity = (ErrorsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82677f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!errorsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(errorsEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (errorsEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo42568f() {
            return this.f82678a.contains(3);
        }

        /* renamed from: g */
        public final String mo42569g() {
            return this.f82682e;
        }

        /* renamed from: h */
        public final boolean mo42570h() {
            return this.f82678a.contains(4);
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82677f.values()) {
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
                this.f82680c = str2;
            } else if (i == 4) {
                this.f82682e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82678a.add(Integer.valueOf(i));
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
            Set set = this.f82678a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82679b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82680c, true);
            }
            if (set.contains(3)) {
                see.m35066c(parcel, 3, this.f82681d, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f82682e, true);
            }
            see.m35062b(parcel, a);
        }

        public ErrorsEntity(Set set, int i, String str, List list, String str2) {
            this.f82678a = set;
            this.f82679b = i;
            this.f82680c = str;
            this.f82681d = list;
            this.f82682e = str2;
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f82681d = arrayList;
                this.f82678a.add(Integer.valueOf(i));
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
            return this.f82678a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class LabelEntity extends FastSafeParcelableJsonResponse implements aodx {
        public static final Parcelable.Creator CREATOR = new aoeg();

        /* renamed from: e */
        private static final HashMap f82689e;

        /* renamed from: a */
        final Set f82690a;

        /* renamed from: b */
        final int f82691b;

        /* renamed from: c */
        List f82692c;

        /* renamed from: d */
        String f82693d;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class ReferencesEntity extends FastSafeParcelableJsonResponse implements aodw {
            public static final Parcelable.Creator CREATOR = new aoeh();

            /* renamed from: f */
            private static final HashMap f82694f;

            /* renamed from: a */
            final Set f82695a;

            /* renamed from: b */
            final int f82696b;

            /* renamed from: c */
            String f82697c;

            /* renamed from: d */
            String f82698d;

            /* renamed from: e */
            String f82699e;

            static {
                HashMap hashMap = new HashMap();
                f82694f = hashMap;
                hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
                f82694f.put("text", FastJsonResponse$Field.m22666f("text", 3));
                f82694f.put("title", FastJsonResponse$Field.m22666f("title", 4));
            }

            public ReferencesEntity() {
                this.f82696b = 1;
                this.f82695a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82694f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return this.f82697c;
                }
                if (i == 3) {
                    return this.f82698d;
                }
                if (i == 4) {
                    return this.f82699e;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: b */
            public final String mo42571b() {
                return this.f82697c;
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            /* renamed from: c */
            public final boolean mo42572c() {
                return this.f82695a.contains(2);
            }

            /* renamed from: d */
            public final String mo42573d() {
                return this.f82698d;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof ReferencesEntity)) {
                    return false;
                }
                if (this != obj) {
                    ReferencesEntity referencesEntity = (ReferencesEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82694f.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!referencesEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(referencesEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (referencesEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            /* renamed from: f */
            public final boolean mo42574f() {
                return this.f82695a.contains(3);
            }

            /* renamed from: g */
            public final String mo42575g() {
                return this.f82699e;
            }

            /* renamed from: h */
            public final boolean mo42576h() {
                return this.f82695a.contains(4);
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82694f.values()) {
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
                    this.f82697c = str2;
                } else if (i == 3) {
                    this.f82698d = str2;
                } else if (i == 4) {
                    this.f82699e = str2;
                } else {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f82695a.add(Integer.valueOf(i));
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
                Set set = this.f82695a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82696b);
                }
                if (set.contains(2)) {
                    see.m35046a(parcel, 2, this.f82697c, true);
                }
                if (set.contains(3)) {
                    see.m35046a(parcel, 3, this.f82698d, true);
                }
                if (set.contains(4)) {
                    see.m35046a(parcel, 4, this.f82699e, true);
                }
                see.m35062b(parcel, a);
            }

            public ReferencesEntity(Set set, int i, String str, String str2, String str3) {
                this.f82695a = set;
                this.f82696b = i;
                this.f82697c = str;
                this.f82698d = str2;
                this.f82699e = str3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f82695a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f82689e = hashMap;
            hashMap.put("references", FastJsonResponse$Field.m22657b("references", 2, ReferencesEntity.class));
            f82689e.put("text", FastJsonResponse$Field.m22666f("text", 3));
        }

        public LabelEntity() {
            this.f82691b = 1;
            this.f82690a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82689e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82692c;
            }
            if (i == 3) {
                return this.f82693d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: b */
        public final List mo42577b() {
            return this.f82692c;
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        /* renamed from: c */
        public final String mo42578c() {
            return this.f82693d;
        }

        /* renamed from: d */
        public final boolean mo42579d() {
            return this.f82690a.contains(3);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LabelEntity)) {
                return false;
            }
            if (this != obj) {
                LabelEntity labelEntity = (LabelEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82689e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!labelEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(labelEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (labelEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82689e.values()) {
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
                this.f82693d = str2;
                this.f82690a.add(Integer.valueOf(i));
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
            Set set = this.f82690a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82691b);
            }
            if (set.contains(2)) {
                see.m35066c(parcel, 2, this.f82692c, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f82693d, true);
            }
            see.m35062b(parcel, a);
        }

        public LabelEntity(Set set, int i, List list, String str) {
            this.f82690a = set;
            this.f82691b = i;
            this.f82692c = list;
            this.f82693d = str;
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f82692c = arrayList;
                this.f82690a.add(Integer.valueOf(i));
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
            return this.f82690a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class OptionsEntity extends FastSafeParcelableJsonResponse implements aody {
        public static final Parcelable.Creator CREATOR = new aoei();

        /* renamed from: e */
        private static final HashMap f82700e;

        /* renamed from: a */
        final Set f82701a;

        /* renamed from: b */
        final int f82702b;

        /* renamed from: c */
        String f82703c;

        /* renamed from: d */
        String f82704d;

        static {
            HashMap hashMap = new HashMap();
            f82700e = hashMap;
            hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
            f82700e.put("text", FastJsonResponse$Field.m22666f("text", 3));
        }

        public OptionsEntity() {
            this.f82702b = 1;
            this.f82701a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82700e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82703c;
            }
            if (i == 3) {
                return this.f82704d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: b */
        public final String mo42580b() {
            return this.f82703c;
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        /* renamed from: c */
        public final String mo42581c() {
            return this.f82704d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OptionsEntity)) {
                return false;
            }
            if (this != obj) {
                OptionsEntity optionsEntity = (OptionsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82700e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!optionsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(optionsEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (optionsEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82700e.values()) {
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
                this.f82703c = str2;
            } else if (i == 3) {
                this.f82704d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82701a.add(Integer.valueOf(i));
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
            Set set = this.f82701a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82702b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82703c, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f82704d, true);
            }
            see.m35062b(parcel, a);
        }

        public OptionsEntity(Set set, int i, String str, String str2) {
            this.f82701a = set;
            this.f82702b = i;
            this.f82703c = str;
            this.f82704d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82701a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ValueEntity extends FastSafeParcelableJsonResponse implements aoec {
        public static final Parcelable.Creator CREATOR = new aoej();

        /* renamed from: h */
        private static final HashMap f82705h;

        /* renamed from: a */
        final Set f82706a;

        /* renamed from: b */
        final int f82707b;

        /* renamed from: c */
        boolean f82708c;

        /* renamed from: d */
        String f82709d;

        /* renamed from: e */
        NameEntity f82710e;

        /* renamed from: f */
        String f82711f;

        /* renamed from: g */
        String f82712g;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class NameEntity extends FastSafeParcelableJsonResponse implements aoeb {
            public static final Parcelable.Creator CREATOR = new aoek();

            /* renamed from: f */
            private static final HashMap f82713f;

            /* renamed from: a */
            final Set f82714a;

            /* renamed from: b */
            final int f82715b;

            /* renamed from: c */
            String f82716c;

            /* renamed from: d */
            String f82717d;

            /* renamed from: e */
            boolean f82718e;

            static {
                HashMap hashMap = new HashMap();
                f82713f = hashMap;
                hashMap.put("family", FastJsonResponse$Field.m22666f("family", 2));
                f82713f.put("given", FastJsonResponse$Field.m22666f("given", 3));
                f82713f.put("readOnly", FastJsonResponse$Field.m22664e("readOnly", 4));
            }

            public NameEntity() {
                this.f82715b = 1;
                this.f82714a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82713f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return this.f82716c;
                }
                if (i == 3) {
                    return this.f82717d;
                }
                if (i == 4) {
                    return Boolean.valueOf(this.f82718e);
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: b */
            public final String mo42585b() {
                return this.f82716c;
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            /* renamed from: c */
            public final String mo42586c() {
                return this.f82717d;
            }

            /* renamed from: d */
            public final boolean mo42587d() {
                return this.f82718e;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof NameEntity)) {
                    return false;
                }
                if (this != obj) {
                    NameEntity nameEntity = (NameEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82713f.values()) {
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
                for (FastJsonResponse$Field fastJsonResponse$Field : f82713f.values()) {
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
                    this.f82716c = str2;
                } else if (i == 3) {
                    this.f82717d = str2;
                } else {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f82714a.add(Integer.valueOf(i));
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
                Set set = this.f82714a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82715b);
                }
                if (set.contains(2)) {
                    see.m35046a(parcel, 2, this.f82716c, true);
                }
                if (set.contains(3)) {
                    see.m35046a(parcel, 3, this.f82717d, true);
                }
                if (set.contains(4)) {
                    see.m35051a(parcel, 4, this.f82718e);
                }
                see.m35062b(parcel, a);
            }

            public NameEntity(Set set, int i, String str, String str2, boolean z) {
                this.f82714a = set;
                this.f82715b = i;
                this.f82716c = str;
                this.f82717d = str2;
                this.f82718e = z;
            }

            public NameEntity(Set set, String str, String str2) {
                this.f82714a = set;
                this.f82715b = 1;
                this.f82716c = str;
                this.f82717d = str2;
                this.f82718e = false;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 4) {
                    this.f82718e = z;
                    this.f82714a.add(Integer.valueOf(i));
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
                return this.f82714a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f82705h = hashMap;
            hashMap.put("check", FastJsonResponse$Field.m22664e("check", 2));
            f82705h.put("date", FastJsonResponse$Field.m22666f("date", 3));
            f82705h.put("name", FastJsonResponse$Field.m22653a("name", 4, NameEntity.class));
            f82705h.put("option", FastJsonResponse$Field.m22666f("option", 5));
            f82705h.put("string", FastJsonResponse$Field.m22666f("string", 6));
        }

        public ValueEntity() {
            this.f82707b = 1;
            this.f82706a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82705h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Boolean.valueOf(this.f82708c);
            }
            if (i == 3) {
                return this.f82709d;
            }
            if (i == 4) {
                return this.f82710e;
            }
            if (i == 5) {
                return this.f82711f;
            }
            if (i == 6) {
                return this.f82712g;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: b */
        public final boolean mo42588b() {
            return this.f82708c;
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        /* renamed from: c */
        public final boolean mo42589c() {
            return this.f82706a.contains(2);
        }

        /* renamed from: d */
        public final String mo42590d() {
            return this.f82709d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ValueEntity)) {
                return false;
            }
            if (this != obj) {
                ValueEntity valueEntity = (ValueEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82705h.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!valueEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(valueEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (valueEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: f */
        public final aoeb mo42591f() {
            return this.f82710e;
        }

        /* renamed from: g */
        public final boolean mo42592g() {
            return this.f82706a.contains(4);
        }

        /* renamed from: h */
        public final String mo42593h() {
            return this.f82711f;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82705h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* renamed from: i */
        public final String mo42594i() {
            return this.f82712g;
        }

        /* renamed from: j */
        public final boolean mo42595j() {
            return this.f82706a.contains(6);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f82709d = str2;
            } else if (i == 5) {
                this.f82711f = str2;
            } else if (i == 6) {
                this.f82712g = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82706a.add(Integer.valueOf(i));
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
            Set set = this.f82706a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82707b);
            }
            if (set.contains(2)) {
                see.m35051a(parcel, 2, this.f82708c);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f82709d, true);
            }
            if (set.contains(4)) {
                see.m35040a(parcel, 4, this.f82710e, i, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f82711f, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f82712g, true);
            }
            see.m35062b(parcel, a);
        }

        public ValueEntity(Set set, int i, boolean z, String str, NameEntity nameEntity, String str2, String str3) {
            this.f82706a = set;
            this.f82707b = i;
            this.f82708c = z;
            this.f82709d = str;
            this.f82710e = nameEntity;
            this.f82711f = str2;
            this.f82712g = str3;
        }

        public ValueEntity(Set set, boolean z, String str, NameEntity nameEntity, String str2, String str3) {
            this.f82706a = set;
            this.f82707b = 1;
            this.f82708c = z;
            this.f82709d = str;
            this.f82710e = nameEntity;
            this.f82711f = str2;
            this.f82712g = str3;
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f82710e = (NameEntity) sio;
                this.f82706a.add(Integer.valueOf(i));
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
                this.f82708c = z;
                this.f82706a.add(Integer.valueOf(i));
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
            return this.f82706a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f82665l = hashMap;
        hashMap.put("errors", FastJsonResponse$Field.m22657b("errors", 2, ErrorsEntity.class));
        f82665l.put("hidden", FastJsonResponse$Field.m22664e("hidden", 3));
        f82665l.put("id", FastJsonResponse$Field.m22666f("id", 4));
        f82665l.put("label", FastJsonResponse$Field.m22653a("label", 6, LabelEntity.class));
        f82665l.put("mandatory", FastJsonResponse$Field.m22664e("mandatory", 7));
        f82665l.put("options", FastJsonResponse$Field.m22657b("options", 8, OptionsEntity.class));
        f82665l.put("type", FastJsonResponse$Field.m22666f("type", 9));
        f82665l.put("value", FastJsonResponse$Field.m22653a("value", 10, ValueEntity.class));
        f82665l.put("version", FastJsonResponse$Field.m22666f("version", 11));
    }

    public AccountField() {
        this.f82667b = 1;
        this.f82666a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82665l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f82668c;
            case 3:
                return Boolean.valueOf(this.f82669d);
            case 4:
                return this.f82670e;
            case 5:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 6:
                return this.f82671f;
            case 7:
                return Boolean.valueOf(this.f82672g);
            case 8:
                return this.f82673h;
            case 9:
                return this.f82674i;
            case 10:
                return this.f82675j;
            case 11:
                return this.f82676k;
        }
    }

    /* renamed from: b */
    public final List mo42596b() {
        return this.f82668c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final boolean mo42597c() {
        return this.f82666a.contains(2);
    }

    /* renamed from: d */
    public final boolean mo42598d() {
        return this.f82669d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountField)) {
            return false;
        }
        if (this != obj) {
            AccountField accountField = (AccountField) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82665l.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!accountField.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(accountField.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (accountField.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo42599f() {
        return this.f82666a.contains(3);
    }

    /* renamed from: g */
    public final String mo42600g() {
        return this.f82670e;
    }

    /* renamed from: h */
    public final boolean mo42601h() {
        return this.f82666a.contains(4);
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82665l.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final aodx mo42602i() {
        return this.f82671f;
    }

    /* renamed from: j */
    public final boolean mo42603j() {
        return this.f82666a.contains(6);
    }

    /* renamed from: k */
    public final boolean mo42604k() {
        return this.f82672g;
    }

    /* renamed from: l */
    public final boolean mo42605l() {
        return this.f82666a.contains(7);
    }

    /* renamed from: m */
    public final List mo42606m() {
        return this.f82673h;
    }

    /* renamed from: n */
    public final boolean mo42607n() {
        return this.f82666a.contains(8);
    }

    /* renamed from: o */
    public final String mo42608o() {
        return this.f82674i;
    }

    /* renamed from: p */
    public final aoec mo42609p() {
        return this.f82675j;
    }

    /* renamed from: q */
    public final boolean mo42610q() {
        return this.f82666a.contains(10);
    }

    /* renamed from: r */
    public final String mo42611r() {
        return this.f82676k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f82670e = str2;
        } else if (i == 9) {
            this.f82674i = str2;
        } else if (i == 11) {
            this.f82676k = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82666a.add(Integer.valueOf(i));
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
        Set set = this.f82666a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82667b);
        }
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f82668c, true);
        }
        if (set.contains(3)) {
            see.m35051a(parcel, 3, this.f82669d);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f82670e, true);
        }
        if (set.contains(6)) {
            see.m35040a(parcel, 6, this.f82671f, i, true);
        }
        if (set.contains(7)) {
            see.m35051a(parcel, 7, this.f82672g);
        }
        if (set.contains(8)) {
            see.m35066c(parcel, 8, this.f82673h, true);
        }
        if (set.contains(9)) {
            see.m35046a(parcel, 9, this.f82674i, true);
        }
        if (set.contains(10)) {
            see.m35040a(parcel, 10, this.f82675j, i, true);
        }
        if (set.contains(11)) {
            see.m35046a(parcel, 11, this.f82676k, true);
        }
        see.m35062b(parcel, a);
    }

    public AccountField(Set set, int i, List list, boolean z, String str, LabelEntity labelEntity, boolean z2, List list2, String str2, ValueEntity valueEntity, String str3) {
        this.f82666a = set;
        this.f82667b = i;
        this.f82668c = list;
        this.f82669d = z;
        this.f82670e = str;
        this.f82671f = labelEntity;
        this.f82672g = z2;
        this.f82673h = list2;
        this.f82674i = str2;
        this.f82675j = valueEntity;
        this.f82676k = str3;
    }

    public AccountField(Set set, String str, String str2, ValueEntity valueEntity, String str3) {
        this.f82666a = set;
        this.f82667b = 1;
        this.f82668c = null;
        this.f82669d = false;
        this.f82670e = str;
        this.f82671f = null;
        this.f82672g = false;
        this.f82673h = null;
        this.f82674i = str2;
        this.f82675j = valueEntity;
        this.f82676k = str3;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82668c = arrayList;
        } else if (i == 8) {
            this.f82673h = arrayList;
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
        this.f82666a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 6) {
            this.f82671f = (LabelEntity) sio;
        } else if (i == 10) {
            this.f82675j = (ValueEntity) sio;
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
        this.f82666a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82669d = z;
        } else if (i == 7) {
            this.f82672g = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82666a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82666a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
