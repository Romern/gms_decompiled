package com.google.android.gms.plus.service.pos;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlusonesEntity extends FastSafeParcelableJsonResponse implements aocu {
    public static final Parcelable.Creator CREATOR = new aocw();

    /* renamed from: h */
    private static final HashMap f82618h;

    /* renamed from: a */
    public final Set f82619a;

    /* renamed from: b */
    public final int f82620b;

    /* renamed from: c */
    public String f82621c;

    /* renamed from: d */
    public String f82622d;

    /* renamed from: e */
    public String f82623e;

    /* renamed from: f */
    public boolean f82624f;

    /* renamed from: g */
    public MetadataEntity f82625g;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class MetadataEntity extends FastSafeParcelableJsonResponse implements aoct {
        public static final Parcelable.Creator CREATOR = new aocx();

        /* renamed from: h */
        private static final HashMap f82626h;

        /* renamed from: a */
        public final Set f82627a;

        /* renamed from: b */
        public final int f82628b;

        /* renamed from: c */
        public long f82629c;

        /* renamed from: d */
        public long f82630d;

        /* renamed from: e */
        public GlobalCountsEntity f82631e;

        /* renamed from: f */
        public String f82632f;

        /* renamed from: g */
        public String f82633g;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class GlobalCountsEntity extends FastSafeParcelableJsonResponse implements aocs {
            public static final Parcelable.Creator CREATOR = new aocy();

            /* renamed from: e */
            private static final HashMap f82634e;

            /* renamed from: a */
            public final Set f82635a;

            /* renamed from: b */
            public final int f82636b;

            /* renamed from: c */
            public double f82637c;

            /* renamed from: d */
            public List f82638d;

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class PersonEntity extends FastSafeParcelableJsonResponse implements aocr {
                public static final Parcelable.Creator CREATOR = new aocz();

                /* renamed from: g */
                private static final HashMap f82639g;

                /* renamed from: a */
                public final Set f82640a;

                /* renamed from: b */
                public final int f82641b;

                /* renamed from: c */
                public String f82642c;

                /* renamed from: d */
                public String f82643d;

                /* renamed from: e */
                public String f82644e;

                /* renamed from: f */
                public String f82645f;

                static {
                    HashMap hashMap = new HashMap();
                    f82639g = hashMap;
                    hashMap.put("displayName", FastJsonResponse$Field.m22666f("displayName", 2));
                    f82639g.put("id", FastJsonResponse$Field.m22666f("id", 3));
                    f82639g.put("profileUrl", FastJsonResponse$Field.m22666f("profileUrl", 4));
                    f82639g.put("thumbnailUrl", FastJsonResponse$Field.m22666f("thumbnailUrl", 5));
                }

                public PersonEntity() {
                    this.f82641b = 1;
                    this.f82640a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f82639g;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        return this.f82642c;
                    }
                    if (i == 3) {
                        return this.f82643d;
                    }
                    if (i == 4) {
                        return this.f82644e;
                    }
                    if (i == 5) {
                        return this.f82645f;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                /* renamed from: b */
                public final String mo42527b() {
                    return this.f82642c;
                }

                /* renamed from: bF */
                public final /* bridge */ /* synthetic */ Object mo7556bF() {
                    return this;
                }

                /* renamed from: c */
                public final String mo42528c() {
                    return this.f82645f;
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof PersonEntity)) {
                        return false;
                    }
                    if (this != obj) {
                        PersonEntity personEntity = (PersonEntity) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f82639g.values()) {
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

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82639g.values()) {
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
                        this.f82642c = str2;
                    } else if (i == 3) {
                        this.f82643d = str2;
                    } else if (i == 4) {
                        this.f82644e = str2;
                    } else if (i == 5) {
                        this.f82645f = str2;
                    } else {
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f82640a.add(Integer.valueOf(i));
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
                    Set set = this.f82640a;
                    if (set.contains(1)) {
                        see.m35063b(parcel, 1, this.f82641b);
                    }
                    if (set.contains(2)) {
                        see.m35046a(parcel, 2, this.f82642c, true);
                    }
                    if (set.contains(3)) {
                        see.m35046a(parcel, 3, this.f82643d, true);
                    }
                    if (set.contains(4)) {
                        see.m35046a(parcel, 4, this.f82644e, true);
                    }
                    if (set.contains(5)) {
                        see.m35046a(parcel, 5, this.f82645f, true);
                    }
                    see.m35062b(parcel, a);
                }

                public PersonEntity(Set set, int i, String str, String str2, String str3, String str4) {
                    this.f82640a = set;
                    this.f82641b = i;
                    this.f82642c = str;
                    this.f82643d = str2;
                    this.f82644e = str3;
                    this.f82645f = str4;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f82640a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                f82634e = hashMap;
                hashMap.put("count", FastJsonResponse$Field.m22662d("count", 2));
                f82634e.put("person", FastJsonResponse$Field.m22657b("person", 3, PersonEntity.class));
            }

            public GlobalCountsEntity() {
                this.f82636b = 1;
                this.f82635a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f82634e;
            }

            /* renamed from: b */
            public final double mo42529b() {
                return this.f82637c;
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            /* renamed from: c */
            public final List mo42530c() {
                return this.f82638d;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof GlobalCountsEntity)) {
                    return false;
                }
                if (this != obj) {
                    GlobalCountsEntity globalCountsEntity = (GlobalCountsEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f82634e.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!globalCountsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(globalCountsEntity.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (globalCountsEntity.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82634e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo17873a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    this.f82637c = d;
                    this.f82635a.add(Integer.valueOf(i));
                    return;
                }
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a double.");
                throw new IllegalArgumentException(sb.toString());
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return Double.valueOf(this.f82637c);
                }
                if (i == 3) {
                    return this.f82638d;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = see.m35030a(parcel);
                Set set = this.f82635a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f82636b);
                }
                if (set.contains(2)) {
                    see.m35033a(parcel, 2, this.f82637c);
                }
                if (set.contains(3)) {
                    see.m35066c(parcel, 3, this.f82638d, true);
                }
                see.m35062b(parcel, a);
            }

            public GlobalCountsEntity(Set set, int i, double d, List list) {
                this.f82635a = set;
                this.f82636b = i;
                this.f82637c = d;
                this.f82638d = list;
            }

            /* renamed from: a */
            public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 3) {
                    this.f82638d = arrayList;
                    this.f82635a.add(Integer.valueOf(i));
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
                return this.f82635a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f82626h = hashMap;
            hashMap.put("adgroupId", FastJsonResponse$Field.m22656b("adgroupId", 2));
            f82626h.put("creativeId", FastJsonResponse$Field.m22656b("creativeId", 3));
            f82626h.put("globalCounts", FastJsonResponse$Field.m22653a("globalCounts", 4, GlobalCountsEntity.class));
            f82626h.put("title", FastJsonResponse$Field.m22666f("title", 5));
            f82626h.put("type", FastJsonResponse$Field.m22666f("type", 6));
        }

        public MetadataEntity() {
            this.f82628b = 1;
            this.f82627a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82626h;
        }

        /* renamed from: b */
        public final aocs mo42531b() {
            return this.f82631e;
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof MetadataEntity)) {
                return false;
            }
            if (this != obj) {
                MetadataEntity metadataEntity = (MetadataEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82626h.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!metadataEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(metadataEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (metadataEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82626h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f82629c = j;
            } else if (i == 3) {
                this.f82630d = j;
            } else {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a long.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82627a.add(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Long.valueOf(this.f82629c);
            }
            if (i == 3) {
                return Long.valueOf(this.f82630d);
            }
            if (i == 4) {
                return this.f82631e;
            }
            if (i == 5) {
                return this.f82632f;
            }
            if (i == 6) {
                return this.f82633g;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
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
            Set set = this.f82627a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82628b);
            }
            if (set.contains(2)) {
                see.m35036a(parcel, 2, this.f82629c);
            }
            if (set.contains(3)) {
                see.m35036a(parcel, 3, this.f82630d);
            }
            if (set.contains(4)) {
                see.m35040a(parcel, 4, this.f82631e, i, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f82632f, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f82633g, true);
            }
            see.m35062b(parcel, a);
        }

        public MetadataEntity(Set set, int i, long j, long j2, GlobalCountsEntity globalCountsEntity, String str, String str2) {
            this.f82627a = set;
            this.f82628b = i;
            this.f82629c = j;
            this.f82630d = j2;
            this.f82631e = globalCountsEntity;
            this.f82632f = str;
            this.f82633g = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 5) {
                this.f82632f = str2;
            } else if (i == 6) {
                this.f82633g = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82627a.add(Integer.valueOf(i));
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                this.f82631e = (GlobalCountsEntity) sio;
                this.f82627a.add(Integer.valueOf(i));
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
            return this.f82627a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f82618h = hashMap;
        hashMap.put("abtk", FastJsonResponse$Field.m22666f("abtk", 2));
        f82618h.put("aclJson", FastJsonResponse$Field.m22666f("aclJson", 3));
        f82618h.put("id", FastJsonResponse$Field.m22666f("id", 4));
        f82618h.put("isSetByViewer", FastJsonResponse$Field.m22664e("isSetByViewer", 5));
        f82618h.put("metadata", FastJsonResponse$Field.m22653a("metadata", 7, MetadataEntity.class));
    }

    public PlusonesEntity() {
        this.f82620b = 1;
        this.f82619a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82618h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82621c;
        }
        if (i == 3) {
            return this.f82622d;
        }
        if (i == 4) {
            return this.f82623e;
        }
        if (i == 5) {
            return Boolean.valueOf(this.f82624f);
        }
        if (i == 7) {
            return this.f82625g;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final String mo42532b() {
        return this.f82621c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final boolean mo42533c() {
        return this.f82624f;
    }

    /* renamed from: d */
    public final boolean mo42534d() {
        return this.f82619a.contains(5);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlusonesEntity)) {
            return false;
        }
        if (this != obj) {
            PlusonesEntity plusonesEntity = (PlusonesEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82618h.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!plusonesEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(plusonesEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (plusonesEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final aoct mo42535f() {
        return this.f82625g;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82618h.values()) {
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
            this.f82621c = str2;
        } else if (i == 3) {
            this.f82622d = str2;
        } else if (i == 4) {
            this.f82623e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82619a.add(Integer.valueOf(i));
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
        Set set = this.f82619a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82620b);
        }
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f82621c, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f82622d, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f82623e, true);
        }
        if (set.contains(5)) {
            see.m35051a(parcel, 5, this.f82624f);
        }
        if (set.contains(7)) {
            see.m35040a(parcel, 7, this.f82625g, i, true);
        }
        see.m35062b(parcel, a);
    }

    public PlusonesEntity(Set set, int i, String str, String str2, String str3, boolean z, MetadataEntity metadataEntity) {
        this.f82619a = set;
        this.f82620b = i;
        this.f82621c = str;
        this.f82622d = str2;
        this.f82623e = str3;
        this.f82624f = z;
        this.f82625g = metadataEntity;
    }

    public PlusonesEntity(Set set, String str, String str2, boolean z) {
        this.f82619a = set;
        this.f82620b = 1;
        this.f82621c = str;
        this.f82622d = null;
        this.f82623e = str2;
        this.f82624f = z;
        this.f82625g = null;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 7) {
            this.f82625g = (MetadataEntity) sio;
            this.f82619a.add(Integer.valueOf(i));
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
            this.f82624f = z;
            this.f82619a.add(Integer.valueOf(i));
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
        return this.f82619a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
