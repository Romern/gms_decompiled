package com.google.android.gms.plus.service.v2whitelisted.models;

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
public final class Mergedpeoplefieldacl extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aois();

    /* renamed from: d */
    private static final HashMap f83091d;

    /* renamed from: a */
    final Set f83092a;

    /* renamed from: b */
    List f83093b;

    /* renamed from: c */
    List f83094c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Entries extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aoit();

        /* renamed from: d */
        private static final HashMap f83095d;

        /* renamed from: a */
        final Set f83096a;

        /* renamed from: b */
        String f83097b;

        /* renamed from: c */
        Scope f83098c;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class Scope extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new aoiu();

            /* renamed from: f */
            private static final HashMap f83099f;

            /* renamed from: a */
            final Set f83100a;

            /* renamed from: b */
            boolean f83101b;

            /* renamed from: c */
            boolean f83102c;

            /* renamed from: d */
            Membership f83103d;

            /* renamed from: e */
            Person f83104e;

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class Membership extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new aoiv();

                /* renamed from: c */
                private static final HashMap f83105c;

                /* renamed from: a */
                final Set f83106a;

                /* renamed from: b */
                Circle f83107b;

                /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
                public final class Circle extends FastSafeParcelableJsonResponse {
                    public static final Parcelable.Creator CREATOR = new aoiw();

                    /* renamed from: d */
                    private static final HashMap f83108d;

                    /* renamed from: a */
                    final Set f83109a;

                    /* renamed from: b */
                    String f83110b;

                    /* renamed from: c */
                    String f83111c;

                    static {
                        HashMap hashMap = new HashMap();
                        f83108d = hashMap;
                        hashMap.put("circleId", FastJsonResponse$Field.m22666f("circleId", 2));
                        f83108d.put("circleSet", FastJsonResponse$Field.m22666f("circleSet", 3));
                    }

                    public Circle() {
                        this.f83109a = new HashSet();
                    }

                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ Map mo7367a() {
                        return f83108d;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: b */
                    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                        int i = fastJsonResponse$Field.f30319g;
                        if (i == 2) {
                            return this.f83110b;
                        }
                        if (i == 3) {
                            return this.f83111c;
                        }
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unknown safe parcelable id=");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Circle)) {
                            return false;
                        }
                        if (this != obj) {
                            Circle circle = (Circle) obj;
                            for (FastJsonResponse$Field fastJsonResponse$Field : f83108d.values()) {
                                if (mo7370a(fastJsonResponse$Field)) {
                                    if (!circle.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(circle.mo7371b(fastJsonResponse$Field))) {
                                        return false;
                                    }
                                } else if (circle.mo7370a(fastJsonResponse$Field)) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }

                    public final int hashCode() {
                        int i = 0;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f83108d.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                            }
                        }
                        return i;
                    }

                    public Circle(Set set, String str, String str2) {
                        this.f83109a = set;
                        this.f83110b = str;
                        this.f83111c = str2;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                        int i = fastJsonResponse$Field.f30319g;
                        if (i == 2) {
                            this.f83110b = str2;
                        } else if (i == 3) {
                            this.f83111c = str2;
                        } else {
                            StringBuilder sb = new StringBuilder(54);
                            sb.append("Field with id=");
                            sb.append(i);
                            sb.append(" is not known to be a String.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f83109a.add(Integer.valueOf(i));
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
                        Set set = this.f83109a;
                        if (set.contains(2)) {
                            see.m35046a(parcel, 2, this.f83110b, true);
                        }
                        if (set.contains(3)) {
                            see.m35046a(parcel, 3, this.f83111c, true);
                        }
                        see.m35062b(parcel, a);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                        return this.f83109a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                    }
                }

                static {
                    HashMap hashMap = new HashMap();
                    f83105c = hashMap;
                    hashMap.put("circle", FastJsonResponse$Field.m22653a("circle", 2, Circle.class));
                }

                public Membership() {
                    this.f83106a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f83105c;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        return this.f83107b;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Membership)) {
                        return false;
                    }
                    if (this != obj) {
                        Membership membership = (Membership) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f83105c.values()) {
                            if (mo7370a(fastJsonResponse$Field)) {
                                if (!membership.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(membership.mo7371b(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (membership.mo7370a(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }

                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83105c.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                public Membership(Set set, Circle circle) {
                    this.f83106a = set;
                    this.f83107b = circle;
                }

                /* renamed from: a */
                public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        this.f83107b = (Circle) sio;
                        this.f83106a.add(Integer.valueOf(i));
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

                public final void writeToParcel(Parcel parcel, int i) {
                    int a = see.m35030a(parcel);
                    if (this.f83106a.contains(2)) {
                        see.m35040a(parcel, 2, this.f83107b, i, true);
                    }
                    see.m35062b(parcel, a);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f83106a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
            public final class Person extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new aoix();

                /* renamed from: c */
                private static final HashMap f83112c;

                /* renamed from: a */
                final Set f83113a;

                /* renamed from: b */
                String f83114b;

                static {
                    HashMap hashMap = new HashMap();
                    f83112c = hashMap;
                    hashMap.put("personId", FastJsonResponse$Field.m22666f("personId", 2));
                }

                public Person() {
                    this.f83113a = new HashSet();
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Map mo7367a() {
                    return f83112c;
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        return this.f83114b;
                    }
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Person)) {
                        return false;
                    }
                    if (this != obj) {
                        Person person = (Person) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : f83112c.values()) {
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
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83112c.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                public Person(Set set, String str) {
                    this.f83113a = set;
                    this.f83114b = str;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.f30319g;
                    if (i == 2) {
                        this.f83114b = str2;
                        this.f83113a.add(Integer.valueOf(i));
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
                    if (this.f83113a.contains(2)) {
                        see.m35046a(parcel, 2, this.f83114b, true);
                    }
                    see.m35062b(parcel, a);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.f83113a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
                }
            }

            static {
                HashMap hashMap = new HashMap();
                f83099f = hashMap;
                hashMap.put("allUsers", FastJsonResponse$Field.m22664e("allUsers", 2));
                f83099f.put("domainUsers", FastJsonResponse$Field.m22664e("domainUsers", 3));
                f83099f.put("membership", FastJsonResponse$Field.m22653a("membership", 4, Membership.class));
                f83099f.put("person", FastJsonResponse$Field.m22653a("person", 5, Person.class));
            }

            public Scope() {
                this.f83100a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f83099f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    return Boolean.valueOf(this.f83101b);
                }
                if (i == 3) {
                    return Boolean.valueOf(this.f83102c);
                }
                if (i == 4) {
                    return this.f83103d;
                }
                if (i == 5) {
                    return this.f83104e;
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Scope)) {
                    return false;
                }
                if (this != obj) {
                    Scope scope = (Scope) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f83099f.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!scope.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(scope.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (scope.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83099f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            public Scope(Set set, boolean z, boolean z2, Membership membership, Person person) {
                this.f83100a = set;
                this.f83101b = z;
                this.f83102c = z2;
                this.f83103d = membership;
                this.f83104e = person;
            }

            /* renamed from: a */
            public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 4) {
                    this.f83103d = (Membership) sio;
                } else if (i == 5) {
                    this.f83104e = (Person) sio;
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
                this.f83100a.add(Integer.valueOf(i));
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int a = see.m35030a(parcel);
                Set set = this.f83100a;
                if (set.contains(2)) {
                    see.m35051a(parcel, 2, this.f83101b);
                }
                if (set.contains(3)) {
                    see.m35051a(parcel, 3, this.f83102c);
                }
                if (set.contains(4)) {
                    see.m35040a(parcel, 4, this.f83103d, i, true);
                }
                if (set.contains(5)) {
                    see.m35040a(parcel, 5, this.f83104e, i, true);
                }
                see.m35062b(parcel, a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                int i = fastJsonResponse$Field.f30319g;
                if (i == 2) {
                    this.f83101b = z;
                } else if (i == 3) {
                    this.f83102c = z;
                } else {
                    StringBuilder sb = new StringBuilder(55);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a boolean.");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f83100a.add(Integer.valueOf(i));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f83100a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f83095d = hashMap;
            hashMap.put("role", FastJsonResponse$Field.m22666f("role", 2));
            f83095d.put("scope", FastJsonResponse$Field.m22653a("scope", 3, Scope.class));
        }

        public Entries() {
            this.f83096a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83095d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83097b;
            }
            if (i == 3) {
                return this.f83098c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Entries)) {
                return false;
            }
            if (this != obj) {
                Entries entries = (Entries) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83095d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!entries.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(entries.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (entries.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83095d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Entries(Set set, String str, Scope scope) {
            this.f83096a = set;
            this.f83097b = str;
            this.f83098c = scope;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f83097b = str2;
                this.f83096a.add(Integer.valueOf(i));
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
            Set set = this.f83096a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83097b, true);
            }
            if (set.contains(3)) {
                see.m35040a(parcel, 3, this.f83098c, i, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f83098c = (Scope) sio;
                this.f83096a.add(Integer.valueOf(i));
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
            return this.f83096a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f83091d = hashMap;
        hashMap.put("entries", FastJsonResponse$Field.m22657b("entries", 2, Entries.class));
        f83091d.put("predefinedEntries", FastJsonResponse$Field.m22668g("predefinedEntries", 3));
    }

    public Mergedpeoplefieldacl() {
        this.f83092a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83091d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f83093b;
        }
        if (i == 3) {
            return this.f83094c;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Mergedpeoplefieldacl)) {
            return false;
        }
        if (this != obj) {
            Mergedpeoplefieldacl mergedpeoplefieldacl = (Mergedpeoplefieldacl) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83091d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!mergedpeoplefieldacl.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(mergedpeoplefieldacl.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (mergedpeoplefieldacl.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83091d.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public Mergedpeoplefieldacl(Set set, List list, List list2) {
        this.f83092a = set;
        this.f83093b = list;
        this.f83094c = list2;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f83093b = arrayList;
            this.f83092a.add(Integer.valueOf(i));
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
            this.f83094c = arrayList;
            this.f83092a.add(Integer.valueOf(i));
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
        Set set = this.f83092a;
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f83093b, true);
        }
        if (set.contains(3)) {
            see.m35065b(parcel, 3, this.f83094c, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83092a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
