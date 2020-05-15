package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class User extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvr();

    /* renamed from: g */
    private static final HashMap f31053g;

    /* renamed from: a */
    final Set f31054a;

    /* renamed from: b */
    public String f31055b;

    /* renamed from: c */
    public String f31056c;

    /* renamed from: d */
    public boolean f31057d;

    /* renamed from: e */
    public String f31058e;

    /* renamed from: f */
    public Picture f31059f;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Picture extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new uvs();

        /* renamed from: c */
        private static final HashMap f31060c;

        /* renamed from: a */
        final Set f31061a;

        /* renamed from: b */
        public String f31062b;

        static {
            HashMap hashMap = new HashMap();
            f31060c = hashMap;
            hashMap.put("url", FastJsonResponse$Field.m22666f("url", 2));
        }

        public Picture() {
            this.f31061a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f31060c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f31062b;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Picture)) {
                return false;
            }
            if (this != obj) {
                Picture picture = (Picture) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f31060c.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!picture.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(picture.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (picture.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31060c.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Picture(Set set, String str) {
            this.f31061a = set;
            this.f31062b = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f31062b = str2;
                this.f31061a.add(Integer.valueOf(i));
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
            if (this.f31061a.contains(2)) {
                see.m35046a(parcel, 2, this.f31062b, true);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f31061a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f31053g = hashMap;
        hashMap.put("displayName", FastJsonResponse$Field.m22666f("displayName", 2));
        f31053g.put("emailAddress", FastJsonResponse$Field.m22666f("emailAddress", 5));
        f31053g.put("isAuthenticatedUser", FastJsonResponse$Field.m22664e("isAuthenticatedUser", 7));
        f31053g.put("permissionId", FastJsonResponse$Field.m22666f("permissionId", 9));
        f31053g.put("picture", FastJsonResponse$Field.m22653a("picture", 10, Picture.class));
    }

    public User() {
        this.f31054a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f31053g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f31055b;
        }
        if (i == 5) {
            return this.f31056c;
        }
        if (i == 7) {
            return Boolean.valueOf(this.f31057d);
        }
        if (i == 9) {
            return this.f31058e;
        }
        if (i == 10) {
            return this.f31059f;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }
        if (this != obj) {
            User user = (User) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31053g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!user.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(user.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (user.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f31053g.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public User(Set set, String str, String str2, boolean z, String str3, Picture picture) {
        this.f31054a = set;
        this.f31055b = str;
        this.f31056c = str2;
        this.f31057d = z;
        this.f31058e = str3;
        this.f31059f = picture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f31055b = str2;
        } else if (i == 5) {
            this.f31056c = str2;
        } else if (i == 9) {
            this.f31058e = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f31054a.add(Integer.valueOf(i));
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
        Set set = this.f31054a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f31055b, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f31056c, true);
        }
        if (set.contains(7)) {
            see.m35051a(parcel, 7, this.f31057d);
        }
        if (set.contains(9)) {
            see.m35046a(parcel, 9, this.f31058e, true);
        }
        if (set.contains(10)) {
            see.m35040a(parcel, 10, this.f31059f, i, true);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 10) {
            this.f31059f = (Picture) sio;
            this.f31054a.add(Integer.valueOf(i));
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
        if (i == 7) {
            this.f31057d = z;
            this.f31054a.add(Integer.valueOf(i));
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
        return this.f31054a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
