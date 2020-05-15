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
public final class UpgradeAccountEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, aoil {
    public static final Parcelable.Creator CREATOR = new aoim();

    /* renamed from: f */
    private static final HashMap f83064f;

    /* renamed from: a */
    final Set f83065a;

    /* renamed from: b */
    final int f83066b;

    /* renamed from: c */
    public DescriptionEntity f83067c;

    /* renamed from: d */
    public FormEntity f83068d;

    /* renamed from: e */
    public String f83069e;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class DescriptionEntity extends FastSafeParcelableJsonResponse implements ReflectedParcelable, rty {
        public static final Parcelable.Creator CREATOR = new aoin();

        /* renamed from: f */
        private static final HashMap f83070f;

        /* renamed from: a */
        public final Set f83071a;

        /* renamed from: b */
        final int f83072b;

        /* renamed from: c */
        public String f83073c;

        /* renamed from: d */
        public List f83074d;

        /* renamed from: e */
        public String f83075e;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class ReferencesEntity extends FastSafeParcelableJsonResponse implements aoii {
            public static final Parcelable.Creator CREATOR = new aoio();

            /* renamed from: f */
            private static final HashMap f83076f;

            /* renamed from: a */
            final Set f83077a;

            /* renamed from: b */
            final int f83078b;

            /* renamed from: c */
            String f83079c;

            /* renamed from: d */
            String f83080d;

            /* renamed from: e */
            String f83081e;

            static {
                HashMap hashMap = new HashMap();
                f83076f = hashMap;
                hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
                f83076f.put("text", FastJsonResponse$Field.m22666f("text", 3));
                f83076f.put("title", FastJsonResponse$Field.m22666f("title", 4));
            }

            public ReferencesEntity() {
                this.f83078b = 1;
                this.f83077a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f83076f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return this.f83079c;
                }
                if (i == 3) {
                    return this.f83080d;
                }
                if (i == 4) {
                    return this.f83081e;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            /* renamed from: b */
            public final String mo42806b() {
                return this.f83079c;
            }

            /* renamed from: bF */
            public final /* bridge */ /* synthetic */ Object mo7556bF() {
                return this;
            }

            /* renamed from: c */
            public final boolean mo42807c() {
                return this.f83077a.contains(2);
            }

            /* renamed from: d */
            public final String mo42808d() {
                return this.f83080d;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof ReferencesEntity)) {
                    return false;
                }
                if (this != obj) {
                    ReferencesEntity referencesEntity = (ReferencesEntity) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83076f.values()) {
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
            public final boolean mo42809f() {
                return this.f83077a.contains(3);
            }

            /* renamed from: g */
            public final String mo42810g() {
                return this.f83081e;
            }

            /* renamed from: h */
            public final boolean mo42811h() {
                return this.f83077a.contains(4);
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83076f.values()) {
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
                    this.f83079c = str2;
                } else if (i == 3) {
                    this.f83080d = str2;
                } else if (i == 4) {
                    this.f83081e = str2;
                } else {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f83077a.add(Integer.valueOf(i));
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
                Set set = this.f83077a;
                if (set.contains(1)) {
                    see.m35063b(parcel, 1, this.f83078b);
                }
                if (set.contains(2)) {
                    see.m35046a(parcel, 2, this.f83079c, true);
                }
                if (set.contains(3)) {
                    see.m35046a(parcel, 3, this.f83080d, true);
                }
                if (set.contains(4)) {
                    see.m35046a(parcel, 4, this.f83081e, true);
                }
                see.m35062b(parcel, a);
            }

            public ReferencesEntity(Set set, int i, String str, String str2, String str3) {
                this.f83077a = set;
                this.f83078b = i;
                this.f83079c = str;
                this.f83080d = str2;
                this.f83081e = str3;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f83077a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f83070f = hashMap;
            hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
            f83070f.put("references", FastJsonResponse$Field.m22657b("references", 3, ReferencesEntity.class));
            f83070f.put("text", FastJsonResponse$Field.m22666f("text", 4));
        }

        public DescriptionEntity() {
            this.f83072b = 1;
            this.f83071a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83070f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83073c;
            }
            if (i == 3) {
                return this.f83074d;
            }
            if (i == 4) {
                return this.f83075e;
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
            if (!(obj instanceof DescriptionEntity)) {
                return false;
            }
            if (this != obj) {
                DescriptionEntity descriptionEntity = (DescriptionEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83070f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!descriptionEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(descriptionEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (descriptionEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83070f.values()) {
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
                this.f83073c = str2;
            } else if (i == 4) {
                this.f83075e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83071a.add(Integer.valueOf(i));
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
            Set set = this.f83071a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f83072b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83073c, true);
            }
            if (set.contains(3)) {
                see.m35066c(parcel, 3, this.f83074d, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83075e, true);
            }
            see.m35062b(parcel, a);
        }

        public DescriptionEntity(Set set, int i, String str, List list, String str2) {
            this.f83071a = set;
            this.f83072b = i;
            this.f83073c = str;
            this.f83074d = list;
            this.f83075e = str2;
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83074d = arrayList;
                this.f83071a.add(Integer.valueOf(i));
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
            return this.f83071a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class FormEntity extends FastSafeParcelableJsonResponse implements aoik {
        public static final Parcelable.Creator CREATOR = new aoip();

        /* renamed from: d */
        private static final HashMap f83082d;

        /* renamed from: a */
        final Set f83083a;

        /* renamed from: b */
        final int f83084b;

        /* renamed from: c */
        public List f83085c;

        static {
            HashMap hashMap = new HashMap();
            f83082d = hashMap;
            hashMap.put("fields", FastJsonResponse$Field.m22657b("fields", 2, AccountField.class));
        }

        public FormEntity() {
            this.f83084b = 1;
            this.f83083a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83082d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83085c;
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
            if (!(obj instanceof FormEntity)) {
                return false;
            }
            if (this != obj) {
                FormEntity formEntity = (FormEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83082d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!formEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(formEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (formEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83082d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83085c = arrayList;
                this.f83083a.add(Integer.valueOf(i));
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

        /* renamed from: b */
        public final boolean mo42812b() {
            return this.f83083a.contains(2);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f83083a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f83084b);
            }
            if (set.contains(2)) {
                see.m35066c(parcel, 2, this.f83085c, true);
            }
            see.m35062b(parcel, a);
        }

        public FormEntity(Set set, int i, List list) {
            this.f83083a = set;
            this.f83084b = i;
            this.f83085c = list;
        }

        public FormEntity(Set set, List list) {
            this.f83083a = set;
            this.f83084b = 1;
            this.f83085c = list;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83083a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f83064f = hashMap;
        hashMap.put("description", FastJsonResponse$Field.m22653a("description", 2, DescriptionEntity.class));
        f83064f.put("form", FastJsonResponse$Field.m22653a("form", 4, FormEntity.class));
        f83064f.put("state", FastJsonResponse$Field.m22666f("state", 6));
    }

    public UpgradeAccountEntity() {
        this.f83066b = 1;
        this.f83065a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83064f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f83067c;
        }
        if (i == 4) {
            return this.f83068d;
        }
        if (i == 6) {
            return this.f83069e;
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

    /* renamed from: c */
    public final boolean mo42814c() {
        return this.f83065a.contains(6);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UpgradeAccountEntity)) {
            return false;
        }
        if (this != obj) {
            UpgradeAccountEntity upgradeAccountEntity = (UpgradeAccountEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83064f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!upgradeAccountEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(upgradeAccountEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (upgradeAccountEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83064f.values()) {
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
        if (i == 6) {
            this.f83069e = str2;
            this.f83065a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a String.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo42813b() {
        return this.f83065a.contains(4);
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
        Set set = this.f83065a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f83066b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f83067c, i, true);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f83068d, i, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f83069e, true);
        }
        see.m35062b(parcel, a);
    }

    public UpgradeAccountEntity(Set set, int i, DescriptionEntity descriptionEntity, FormEntity formEntity, String str) {
        this.f83065a = set;
        this.f83066b = i;
        this.f83067c = descriptionEntity;
        this.f83068d = formEntity;
        this.f83069e = str;
    }

    public UpgradeAccountEntity(Set set, FormEntity formEntity, String str) {
        this.f83065a = set;
        this.f83066b = 1;
        this.f83067c = null;
        this.f83068d = formEntity;
        this.f83069e = str;
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f83067c = (DescriptionEntity) sio;
        } else if (i == 4) {
            this.f83068d = (FormEntity) sio;
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
        this.f83065a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83065a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
