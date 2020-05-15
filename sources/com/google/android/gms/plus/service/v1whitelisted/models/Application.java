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
public final class Application extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aofq();

    /* renamed from: g */
    private static final HashMap f82828g;

    /* renamed from: a */
    final Set f82829a;

    /* renamed from: b */
    final int f82830b;

    /* renamed from: c */
    public List f82831c;

    /* renamed from: d */
    public String f82832d;

    /* renamed from: e */
    public Icon f82833e;

    /* renamed from: f */
    public String f82834f;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Icon extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aofr();

        /* renamed from: d */
        private static final HashMap f82835d;

        /* renamed from: a */
        final Set f82836a;

        /* renamed from: b */
        final int f82837b;

        /* renamed from: c */
        public String f82838c;

        static {
            HashMap hashMap = new HashMap();
            f82835d = hashMap;
            hashMap.put("url", FastJsonResponse$Field.m22666f("url", 2));
        }

        public Icon() {
            this.f82837b = 1;
            this.f82836a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f82835d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f82838c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Icon)) {
                return false;
            }
            if (this != obj) {
                Icon icon = (Icon) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f82835d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!icon.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(icon.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (icon.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82835d.values()) {
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
                this.f82838c = str2;
                this.f82836a.add(Integer.valueOf(i));
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
            Set set = this.f82836a;
            if (set.contains(1)) {
                see.m35063b(parcel, 1, this.f82837b);
            }
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f82838c, true);
            }
            see.m35062b(parcel, a);
        }

        public Icon(Set set, int i, String str) {
            this.f82836a = set;
            this.f82837b = i;
            this.f82838c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f82836a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f82828g = hashMap;
        hashMap.put("clients", FastJsonResponse$Field.m22657b("clients", 2, PlusAppClient.class));
        f82828g.put("displayName", FastJsonResponse$Field.m22666f("displayName", 3));
        f82828g.put("icon", FastJsonResponse$Field.m22653a("icon", 5, Icon.class));
        f82828g.put("id", FastJsonResponse$Field.m22666f("id", 6));
    }

    public Application() {
        this.f82830b = 1;
        this.f82829a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82828g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f82831c;
        }
        if (i == 3) {
            return this.f82832d;
        }
        if (i == 5) {
            return this.f82833e;
        }
        if (i == 6) {
            return this.f82834f;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Application)) {
            return false;
        }
        if (this != obj) {
            Application application = (Application) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82828g.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!application.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(application.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (application.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82828g.values()) {
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
            this.f82832d = str2;
        } else if (i == 6) {
            this.f82834f = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82829a.add(Integer.valueOf(i));
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
        Set set = this.f82829a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82830b);
        }
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f82831c, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f82832d, true);
        }
        if (set.contains(5)) {
            see.m35040a(parcel, 5, this.f82833e, i, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f82834f, true);
        }
        see.m35062b(parcel, a);
    }

    public Application(Set set, int i, List list, String str, Icon icon, String str2) {
        this.f82829a = set;
        this.f82830b = i;
        this.f82831c = list;
        this.f82832d = str;
        this.f82833e = icon;
        this.f82834f = str2;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82831c = arrayList;
            this.f82829a.add(Integer.valueOf(i));
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
            this.f82833e = (Icon) sio;
            this.f82829a.add(Integer.valueOf(i));
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
        return this.f82829a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
