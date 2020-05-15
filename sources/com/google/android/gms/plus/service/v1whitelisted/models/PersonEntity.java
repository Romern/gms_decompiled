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
public final class PersonEntity extends FastSafeParcelableJsonResponse implements aohu {
    public static final Parcelable.Creator CREATOR = new aohv();

    /* renamed from: m */
    private static final HashMap f83010m;

    /* renamed from: a */
    final Set f83011a;

    /* renamed from: b */
    final int f83012b;

    /* renamed from: c */
    public String f83013c;

    /* renamed from: d */
    List f83014d;

    /* renamed from: e */
    String f83015e;

    /* renamed from: f */
    public String f83016f;

    /* renamed from: g */
    public ImageEntity f83017g;

    /* renamed from: h */
    NameEntity f83018h;

    /* renamed from: i */
    String f83019i;

    /* renamed from: j */
    StatusForViewerEntity f83020j;

    /* renamed from: k */
    String f83021k;

    /* renamed from: l */
    public String f83022l;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class EmailsEntity extends FastSafeParcelableJsonResponse implements aohr {
        public static final Parcelable.Creator CREATOR = new aohw();

        /* renamed from: e */
        private static final HashMap f83023e;

        /* renamed from: a */
        final Set f83024a;

        /* renamed from: b */
        final int f83025b;

        /* renamed from: c */
        String f83026c;

        /* renamed from: d */
        String f83027d;

        static {
            HashMap hashMap = new HashMap();
            f83023e = hashMap;
            hashMap.put("type", FastJsonResponse$Field.m22666f("type", 2));
            f83023e.put("value", FastJsonResponse$Field.m22666f("value", 3));
        }

        public EmailsEntity() {
            this.f83025b = 1;
            this.f83024a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83023e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83026c;
            }
            if (i == 3) {
                return this.f83027d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: b */
        public final String mo42762b() {
            return this.f83027d;
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof EmailsEntity)) {
                return false;
            }
            if (this != obj) {
                EmailsEntity emailsEntity = (EmailsEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83023e.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!emailsEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(emailsEntity.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (emailsEntity.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83023e.values()) {
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
                this.f83026c = str2;
            } else if (i == 3) {
                this.f83027d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83024a.add(Integer.valueOf(i));
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
            Set set = this.f83024a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f83025b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83026c, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f83027d, true);
            }
            see.m35062b(parcel, a);
        }

        public EmailsEntity(Set set, int i, String str, String str2) {
            this.f83024a = set;
            this.f83025b = i;
            this.f83026c = str;
            this.f83027d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83024a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class ImageEntity extends FastSafeParcelableJsonResponse implements aohs {
        public static final Parcelable.Creator CREATOR = new aohx();

        /* renamed from: e */
        private static final HashMap f83028e;

        /* renamed from: a */
        final Set f83029a;

        /* renamed from: b */
        final int f83030b;

        /* renamed from: c */
        String f83031c;

        /* renamed from: d */
        public String f83032d;

        static {
            HashMap hashMap = new HashMap();
            f83028e = hashMap;
            hashMap.put("id", FastJsonResponse$Field.m22666f("id", 2));
            f83028e.put("url", FastJsonResponse$Field.m22666f("url", 4));
        }

        public ImageEntity() {
            this.f83030b = 1;
            this.f83029a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83028e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f83031c;
            }
            if (i == 4) {
                return this.f83032d;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: b */
        public final String mo42763b() {
            return this.f83032d;
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
                for (FastJsonResponse$Field fastJsonResponse$Field : f83028e.values()) {
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
            for (FastJsonResponse$Field fastJsonResponse$Field : f83028e.values()) {
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
                this.f83031c = str2;
            } else if (i == 4) {
                this.f83032d = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f83029a.add(Integer.valueOf(i));
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
            Set set = this.f83029a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f83030b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f83031c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f83032d, true);
            }
            see.m35062b(parcel, a);
        }

        public ImageEntity(Set set, int i, String str, String str2) {
            this.f83029a = set;
            this.f83030b = i;
            this.f83031c = str;
            this.f83032d = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83029a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class NameEntity extends FastSafeParcelableJsonResponse implements rty {
        public static final Parcelable.Creator CREATOR = new aohy();

        /* renamed from: c */
        private static final HashMap f83033c = new HashMap();

        /* renamed from: a */
        final Set f83034a;

        /* renamed from: b */
        final int f83035b;

        public NameEntity() {
            this.f83035b = 1;
            this.f83034a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83033c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
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
            if (!(obj instanceof NameEntity)) {
                return false;
            }
            if (this != obj) {
                NameEntity nameEntity = (NameEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83033c.values()) {
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
            for (FastJsonResponse$Field fastJsonResponse$Field : f83033c.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83034a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            if (this.f83034a.contains(1)) {
                see.m35063b(parcel, 1, this.f83035b);
            }
            see.m35062b(parcel, a);
        }

        public NameEntity(Set set, int i) {
            this.f83034a = set;
            this.f83035b = i;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class StatusForViewerEntity extends FastSafeParcelableJsonResponse implements aoht {
        public static final Parcelable.Creator CREATOR = new aohz();

        /* renamed from: d */
        private static final HashMap f83036d;

        /* renamed from: a */
        final Set f83037a;

        /* renamed from: b */
        final int f83038b;

        /* renamed from: c */
        boolean f83039c;

        static {
            HashMap hashMap = new HashMap();
            f83036d = hashMap;
            hashMap.put("isCircled", FastJsonResponse$Field.m22664e("isCircled", 4));
        }

        public StatusForViewerEntity() {
            this.f83038b = 1;
            this.f83037a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83036d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 4) {
                return Boolean.valueOf(this.f83039c);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: b */
        public final boolean mo42764b() {
            return this.f83039c;
        }

        /* renamed from: bF */
        public final /* bridge */ /* synthetic */ Object mo7556bF() {
            return this;
        }

        /* renamed from: c */
        public final boolean mo42765c() {
            return this.f83037a.contains(4);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof StatusForViewerEntity)) {
                return false;
            }
            if (this != obj) {
                StatusForViewerEntity statusForViewerEntity = (StatusForViewerEntity) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83036d.values()) {
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
            for (FastJsonResponse$Field fastJsonResponse$Field : f83036d.values()) {
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
            if (i == 4) {
                this.f83039c = z;
                this.f83037a.add(Integer.valueOf(i));
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
            Set set = this.f83037a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f83038b);
            }
            if (set.contains(4)) {
                see.m35051a(parcel, 4, this.f83039c);
            }
            see.m35062b(parcel, a);
        }

        public StatusForViewerEntity(Set set, int i, boolean z) {
            this.f83037a = set;
            this.f83038b = i;
            this.f83039c = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83037a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f83010m = hashMap;
        hashMap.put("displayName", FastJsonResponse$Field.m22666f("displayName", 9));
        f83010m.put("emails", FastJsonResponse$Field.m22657b("emails", 11, EmailsEntity.class));
        f83010m.put("etag", FastJsonResponse$Field.m22666f("etag", 12));
        f83010m.put("id", FastJsonResponse$Field.m22666f("id", 15));
        f83010m.put("image", FastJsonResponse$Field.m22653a("image", 16, ImageEntity.class));
        f83010m.put("name", FastJsonResponse$Field.m22653a("name", 20, NameEntity.class));
        f83010m.put("objectType", FastJsonResponse$Field.m22666f("objectType", 22));
        f83010m.put("statusForViewer", FastJsonResponse$Field.m22653a("statusForViewer", 29, StatusForViewerEntity.class));
        f83010m.put("suggestionId", FastJsonResponse$Field.m22666f("suggestionId", 30));
        f83010m.put("url", FastJsonResponse$Field.m22666f("url", 32));
    }

    public PersonEntity() {
        this.f83012b = 1;
        this.f83011a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83010m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 9) {
            return this.f83013c;
        }
        if (i == 20) {
            return this.f83018h;
        }
        if (i == 22) {
            return this.f83019i;
        }
        if (i == 32) {
            return this.f83022l;
        }
        if (i == 11) {
            return this.f83014d;
        }
        if (i == 12) {
            return this.f83015e;
        }
        if (i == 15) {
            return this.f83016f;
        }
        if (i == 16) {
            return this.f83017g;
        }
        if (i == 29) {
            return this.f83020j;
        }
        if (i == 30) {
            return this.f83021k;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final String mo42766b() {
        return this.f83013c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final List mo42767c() {
        return this.f83014d;
    }

    /* renamed from: d */
    public final String mo42768d() {
        return this.f83016f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonEntity)) {
            return false;
        }
        if (this != obj) {
            PersonEntity personEntity = (PersonEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83010m.values()) {
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
    public final aohs mo42769f() {
        return this.f83017g;
    }

    /* renamed from: g */
    public final boolean mo42770g() {
        return this.f83011a.contains(16);
    }

    /* renamed from: h */
    public final String mo42771h() {
        return this.f83019i;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83010m.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo42772i() {
        return this.f83011a.contains(22);
    }

    /* renamed from: j */
    public final aoht mo42773j() {
        return this.f83020j;
    }

    /* renamed from: k */
    public final boolean mo42774k() {
        return this.f83011a.contains(29);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 9) {
            this.f83013c = str2;
        } else if (i == 12) {
            this.f83015e = str2;
        } else if (i == 15) {
            this.f83016f = str2;
        } else if (i == 22) {
            this.f83019i = str2;
        } else if (i == 30) {
            this.f83021k = str2;
        } else if (i == 32) {
            this.f83022l = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83011a.add(Integer.valueOf(i));
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
        Set set = this.f83011a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f83012b);
        }
        if (set.contains(9)) {
            see.m35046a(parcel, 9, this.f83013c, true);
        }
        if (set.contains(11)) {
            see.m35066c(parcel, 11, this.f83014d, true);
        }
        if (set.contains(12)) {
            see.m35046a(parcel, 12, this.f83015e, true);
        }
        if (set.contains(15)) {
            see.m35046a(parcel, 15, this.f83016f, true);
        }
        if (set.contains(16)) {
            see.m35040a(parcel, 16, this.f83017g, i, true);
        }
        if (set.contains(20)) {
            see.m35040a(parcel, 20, this.f83018h, i, true);
        }
        if (set.contains(22)) {
            see.m35046a(parcel, 22, this.f83019i, true);
        }
        if (set.contains(29)) {
            see.m35040a(parcel, 29, this.f83020j, i, true);
        }
        if (set.contains(30)) {
            see.m35046a(parcel, 30, this.f83021k, true);
        }
        if (set.contains(32)) {
            see.m35046a(parcel, 32, this.f83022l, true);
        }
        see.m35062b(parcel, a);
    }

    public PersonEntity(Set set, int i, String str, List list, String str2, String str3, ImageEntity imageEntity, NameEntity nameEntity, String str4, StatusForViewerEntity statusForViewerEntity, String str5, String str6) {
        this.f83011a = set;
        this.f83012b = i;
        this.f83013c = str;
        this.f83014d = list;
        this.f83015e = str2;
        this.f83016f = str3;
        this.f83017g = imageEntity;
        this.f83018h = nameEntity;
        this.f83019i = str4;
        this.f83020j = statusForViewerEntity;
        this.f83021k = str5;
        this.f83022l = str6;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 11) {
            this.f83014d = arrayList;
            this.f83011a.add(Integer.valueOf(i));
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
        if (i == 16) {
            this.f83017g = (ImageEntity) sio;
        } else if (i == 20) {
            this.f83018h = (NameEntity) sio;
        } else if (i == 29) {
            this.f83020j = (StatusForViewerEntity) sio;
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
        this.f83011a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83011a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
