package com.google.android.gms.plus.service.v1whitelisted.models;

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
public final class CommentEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new aogt();

    /* renamed from: k */
    private static final HashMap f82901k;

    /* renamed from: a */
    final Set f82902a;

    /* renamed from: b */
    final int f82903b;

    /* renamed from: c */
    ActorEntity f82904c;

    /* renamed from: d */
    public String f82905d;

    /* renamed from: e */
    List f82906e;

    /* renamed from: f */
    ObjectEntity f82907f;

    /* renamed from: g */
    PlusonersEntity f82908g;

    /* renamed from: h */
    String f82909h;

    /* renamed from: i */
    StatusForViewerEntity f82910i;

    /* renamed from: j */
    String f82911j;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ActorEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new aogu();

        /* renamed from: d */
        private static final HashMap f82912d;

        /* renamed from: a */
        final Set f82913a;

        /* renamed from: b */
        final int f82914b;

        /* renamed from: c */
        String f82915c;

        static {
            HashMap hashMap = new HashMap();
            f82912d = hashMap;
            hashMap.put("displayName", FastJsonResponse$Field.m22666f("displayName", 2));
        }

        public ActorEntity() {
            this.f82914b = 1;
            this.f82913a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82912d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82915c;
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
            if (!(obj instanceof ActorEntity)) {
                return false;
            }
            if (this != obj) {
                ActorEntity actorEntity = (ActorEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82912d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!actorEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(actorEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (actorEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82912d.values()) {
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
                this.f82915c = str2;
                this.f82913a.add(Integer.valueOf(i));
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
            Set set = this.f82913a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82914b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82915c, true);
            }
            see.m35062b(parcel, a);
        }

        public ActorEntity(Set set, int i, String str) {
            this.f82913a = set;
            this.f82914b = i;
            this.f82915c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82913a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class InReplyToEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new aogv();

        /* renamed from: e */
        private static final HashMap f82916e;

        /* renamed from: a */
        final Set f82917a;

        /* renamed from: b */
        final int f82918b;

        /* renamed from: c */
        String f82919c;

        /* renamed from: d */
        String f82920d;

        static {
            HashMap hashMap = new HashMap();
            f82916e = hashMap;
            hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
            f82916e.put("url", FastJsonResponse$Field.m22666f("url", 3));
        }

        public InReplyToEntity() {
            this.f82918b = 1;
            this.f82917a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82916e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82919c;
            }
            if (i == 3) {
                return this.f82920d;
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
            if (!(obj instanceof InReplyToEntity)) {
                return false;
            }
            if (this != obj) {
                InReplyToEntity inReplyToEntity = (InReplyToEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82916e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!inReplyToEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(inReplyToEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (inReplyToEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82916e.values()) {
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
                this.f82919c = str2;
            } else if (i == 3) {
                this.f82920d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f82917a.add(Integer.valueOf(i));
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
            Set set = this.f82917a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82918b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82919c, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f82920d, true);
            }
            see.m35062b(parcel, a);
        }

        public InReplyToEntity(Set set, int i, String str, String str2) {
            this.f82917a = set;
            this.f82918b = i;
            this.f82919c = str;
            this.f82920d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82917a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ObjectEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new aogw();

        /* renamed from: d */
        private static final HashMap f82921d;

        /* renamed from: a */
        final Set f82922a;

        /* renamed from: b */
        final int f82923b;

        /* renamed from: c */
        String f82924c;

        static {
            HashMap hashMap = new HashMap();
            f82921d = hashMap;
            hashMap.put("content", FastJsonResponse$Field.m22666f("content", 2));
        }

        public ObjectEntity() {
            this.f82923b = 1;
            this.f82922a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82921d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82924c;
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
            if (!(obj instanceof ObjectEntity)) {
                return false;
            }
            if (this != obj) {
                ObjectEntity objectEntity = (ObjectEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82921d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!objectEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(objectEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (objectEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82921d.values()) {
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
                this.f82924c = str2;
                this.f82922a.add(Integer.valueOf(i));
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
            Set set = this.f82922a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82923b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82924c, true);
            }
            see.m35062b(parcel, a);
        }

        public ObjectEntity(Set set, int i, String str) {
            this.f82922a = set;
            this.f82923b = i;
            this.f82924c = str;
        }

        public ObjectEntity(Set set, String str) {
            this.f82922a = set;
            this.f82923b = 1;
            this.f82924c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82922a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class PlusonersEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new aogx();

        /* renamed from: d */
        private static final HashMap f82925d;

        /* renamed from: a */
        final Set f82926a;

        /* renamed from: b */
        final int f82927b;

        /* renamed from: c */
        int f82928c;

        static {
            HashMap hashMap = new HashMap();
            f82925d = hashMap;
            hashMap.put("totalItems", FastJsonResponse$Field.m22651a("totalItems", 2));
        }

        public PlusonersEntity() {
            this.f82927b = 1;
            this.f82926a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82925d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Integer.valueOf(this.f82928c);
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
            if (!(obj instanceof PlusonersEntity)) {
                return false;
            }
            if (this != obj) {
                PlusonersEntity plusonersEntity = (PlusonersEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82925d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!plusonersEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(plusonersEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (plusonersEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82925d.values()) {
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
                this.f82928c = i;
                this.f82926a.add(Integer.valueOf(i2));
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
            Set set = this.f82926a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82927b);
            }
            if (set.contains(2)) {
                see.m35063b(parcel, 2, this.f82928c);
            }
            see.m35062b(parcel, a);
        }

        public PlusonersEntity(Set set, int i, int i2) {
            this.f82926a = set;
            this.f82927b = i;
            this.f82928c = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82926a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class StatusForViewerEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new aogy();

        /* renamed from: d */
        private static final HashMap f82929d;

        /* renamed from: a */
        final Set f82930a;

        /* renamed from: b */
        final int f82931b;

        /* renamed from: c */
        boolean f82932c;

        static {
            HashMap hashMap = new HashMap();
            f82929d = hashMap;
            hashMap.put("isPlusOned", FastJsonResponse$Field.m22664e("isPlusOned", 3));
        }

        public StatusForViewerEntity() {
            this.f82931b = 1;
            this.f82930a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82929d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                return Boolean.valueOf(this.f82932c);
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
            if (!(obj instanceof StatusForViewerEntity)) {
                return false;
            }
            if (this != obj) {
                StatusForViewerEntity statusForViewerEntity = (StatusForViewerEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82929d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!statusForViewerEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(statusForViewerEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (statusForViewerEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82929d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f82932c = z;
                this.f82930a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f82930a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82931b);
            }
            if (set.contains(3)) {
                see.m35051a(parcel, 3, this.f82932c);
            }
            see.m35062b(parcel, a);
        }

        public StatusForViewerEntity(Set set, int i, boolean z) {
            this.f82930a = set;
            this.f82931b = i;
            this.f82932c = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82930a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f82901k = hashMap;
        hashMap.put("actor", FastJsonResponse$Field.m22653a("actor", 2, ActorEntity.class));
        f82901k.put("id", FastJsonResponse$Field.m22666f("id", 4));
        f82901k.put("inReplyTo", FastJsonResponse$Field.m22657b("inReplyTo", 5, InReplyToEntity.class));
        f82901k.put("object", FastJsonResponse$Field.m22653a("object", 7, ObjectEntity.class));
        f82901k.put("plusoners", FastJsonResponse$Field.m22653a("plusoners", 8, PlusonersEntity.class));
        f82901k.put("published", FastJsonResponse$Field.m22666f("published", 9));
        f82901k.put("statusForViewer", FastJsonResponse$Field.m22653a("statusForViewer", 11, StatusForViewerEntity.class));
        f82901k.put("updated", FastJsonResponse$Field.m22666f("updated", 12));
    }

    public CommentEntity() {
        this.f82903b = 1;
        this.f82902a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82901k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f82904c;
            case 3:
            case 6:
            case 10:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 4:
                return this.f82905d;
            case 5:
                return this.f82906e;
            case 7:
                return this.f82907f;
            case 8:
                return this.f82908g;
            case 9:
                return this.f82909h;
            case 11:
                return this.f82910i;
            case 12:
                return this.f82911j;
        }
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CommentEntity)) {
            return false;
        }
        if (this != obj) {
            CommentEntity commentEntity = (CommentEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82901k.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!commentEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(commentEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (commentEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82901k.values()) {
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
        if (i == 4) {
            this.f82905d = str2;
        } else if (i == 9) {
            this.f82909h = str2;
        } else if (i == 12) {
            this.f82911j = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82902a.add(Integer.valueOf(i));
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
        Set set = this.f82902a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82903b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f82904c, i, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f82905d, true);
        }
        if (set.contains(5)) {
            see.m35066c(parcel, 5, this.f82906e, true);
        }
        if (set.contains(7)) {
            see.m35040a(parcel, 7, this.f82907f, i, true);
        }
        if (set.contains(8)) {
            see.m35040a(parcel, 8, this.f82908g, i, true);
        }
        if (set.contains(9)) {
            see.m35046a(parcel, 9, this.f82909h, true);
        }
        if (set.contains(11)) {
            see.m35040a(parcel, 11, this.f82910i, i, true);
        }
        if (set.contains(12)) {
            see.m35046a(parcel, 12, this.f82911j, true);
        }
        see.m35062b(parcel, a);
    }

    public CommentEntity(Set set, int i, ActorEntity actorEntity, String str, List list, ObjectEntity objectEntity, PlusonersEntity plusonersEntity, String str2, StatusForViewerEntity statusForViewerEntity, String str3) {
        this.f82902a = set;
        this.f82903b = i;
        this.f82904c = actorEntity;
        this.f82905d = str;
        this.f82906e = list;
        this.f82907f = objectEntity;
        this.f82908g = plusonersEntity;
        this.f82909h = str2;
        this.f82910i = statusForViewerEntity;
        this.f82911j = str3;
    }

    public CommentEntity(Set set, ObjectEntity objectEntity) {
        this.f82902a = set;
        this.f82903b = 1;
        this.f82904c = null;
        this.f82905d = null;
        this.f82906e = null;
        this.f82907f = objectEntity;
        this.f82908g = null;
        this.f82909h = null;
        this.f82910i = null;
        this.f82911j = null;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 5) {
            this.f82906e = arrayList;
            this.f82902a.add(Integer.valueOf(i));
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
        if (i == 2) {
            this.f82904c = (ActorEntity) sio;
        } else if (i == 11) {
            this.f82910i = (StatusForViewerEntity) sio;
        } else if (i == 7) {
            this.f82907f = (ObjectEntity) sio;
        } else if (i == 8) {
            this.f82908g = (PlusonersEntity) sio;
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
        this.f82902a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82902a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
