package com.google.android.gms.common.lso;

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
public final class AuthApps extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new sel();

    /* renamed from: d */
    private static final HashMap f30254d;

    /* renamed from: a */
    public final Set f30255a;

    /* renamed from: b */
    public List f30256b;

    /* renamed from: c */
    public List f30257c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Api_scopes extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new sem();

        /* renamed from: f */
        private static final HashMap f30258f;

        /* renamed from: a */
        final Set f30259a;

        /* renamed from: b */
        public String f30260b;

        /* renamed from: c */
        String f30261c;

        /* renamed from: d */
        public int f30262d;

        /* renamed from: e */
        String f30263e;

        static {
            HashMap hashMap = new HashMap();
            f30258f = hashMap;
            hashMap.put("description", FastJsonResponse$Field.m22666f("description", 2));
            f30258f.put("detail", FastJsonResponse$Field.m22666f("detail", 3));
            f30258f.put("scope_id", FastJsonResponse$Field.m22651a("scope_id", 4));
            f30258f.put("summary", FastJsonResponse$Field.m22666f("summary", 5));
        }

        public Api_scopes() {
            this.f30259a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f30258f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f30260b;
            }
            if (i == 3) {
                return this.f30261c;
            }
            if (i == 4) {
                return Integer.valueOf(this.f30262d);
            }
            if (i == 5) {
                return this.f30263e;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Api_scopes)) {
                return false;
            }
            if (this != obj) {
                Api_scopes api_scopes = (Api_scopes) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f30258f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!api_scopes.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(api_scopes.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (api_scopes.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30258f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Api_scopes(Set set, String str, String str2, int i, String str3) {
            this.f30259a = set;
            this.f30260b = str;
            this.f30261c = str2;
            this.f30262d = i;
            this.f30263e = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.f30319g;
            if (i2 == 4) {
                this.f30262d = i;
                this.f30259a.add(Integer.valueOf(i2));
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
            Set set = this.f30259a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f30260b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f30261c, true);
            }
            if (set.contains(4)) {
                see.m35063b(parcel, 4, this.f30262d);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f30263e, true);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f30260b = str2;
            } else if (i == 3) {
                this.f30261c = str2;
            } else if (i == 5) {
                this.f30263e = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f30259a.add(Integer.valueOf(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f30259a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Apps extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new sen();

        /* renamed from: i */
        private static final HashMap f30264i;

        /* renamed from: a */
        public final Set f30265a;

        /* renamed from: b */
        public List f30266b;

        /* renamed from: c */
        public String f30267c;

        /* renamed from: d */
        public String f30268d;

        /* renamed from: e */
        public String f30269e;

        /* renamed from: f */
        public String f30270f;

        /* renamed from: g */
        public String f30271g;

        /* renamed from: h */
        public List f30272h;

        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public final class Clients extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new seo();

            /* renamed from: h */
            private static final HashMap f30273h;

            /* renamed from: a */
            final Set f30274a;

            /* renamed from: b */
            public String f30275b;

            /* renamed from: c */
            public String f30276c;

            /* renamed from: d */
            String f30277d;

            /* renamed from: e */
            String f30278e;

            /* renamed from: f */
            String f30279f;

            /* renamed from: g */
            String f30280g;

            static {
                HashMap hashMap = new HashMap();
                f30273h = hashMap;
                hashMap.put("android_package_name", FastJsonResponse$Field.m22666f("android_package_name", 2));
                f30273h.put("certificate", FastJsonResponse$Field.m22666f("certificate", 3));
                f30273h.put("client_id", FastJsonResponse$Field.m22666f("client_id", 4));
                f30273h.put("ios_app_store_id", FastJsonResponse$Field.m22666f("ios_app_store_id", 5));
                f30273h.put("ios_bundle_name", FastJsonResponse$Field.m22666f("ios_bundle_name", 6));
                f30273h.put("type", FastJsonResponse$Field.m22666f("type", 7));
            }

            public Clients() {
                this.f30274a = new HashSet();
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Map mo7367a() {
                return f30273h;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.f30319g;
                switch (i) {
                    case 2:
                        return this.f30275b;
                    case 3:
                        return this.f30276c;
                    case 4:
                        return this.f30277d;
                    case 5:
                        return this.f30278e;
                    case 6:
                        return this.f30279f;
                    case 7:
                        return this.f30280g;
                    default:
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unknown safe parcelable id=");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                }
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Clients)) {
                    return false;
                }
                if (this != obj) {
                    Clients clients = (Clients) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : f30273h.values()) {
                        if (mo7370a(fastJsonResponse$Field)) {
                            if (!clients.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(clients.mo7371b(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (clients.mo7370a(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f30273h.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            public Clients(Set set, String str, String str2, String str3, String str4, String str5, String str6) {
                this.f30274a = set;
                this.f30275b = str;
                this.f30276c = str2;
                this.f30277d = str3;
                this.f30278e = str4;
                this.f30279f = str5;
                this.f30280g = str6;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                int i = fastJsonResponse$Field.f30319g;
                switch (i) {
                    case 2:
                        this.f30275b = str2;
                        break;
                    case 3:
                        this.f30276c = str2;
                        break;
                    case 4:
                        this.f30277d = str2;
                        break;
                    case 5:
                        this.f30278e = str2;
                        break;
                    case 6:
                        this.f30279f = str2;
                        break;
                    case 7:
                        this.f30280g = str2;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(54);
                        sb.append("Field with id=");
                        sb.append(i);
                        sb.append(" is not known to be a String.");
                        throw new IllegalArgumentException(sb.toString());
                }
                this.f30274a.add(Integer.valueOf(i));
            }

            /* renamed from: b */
            public final boolean mo17836b() {
                return this.f30274a.contains(2);
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
                Set set = this.f30274a;
                if (set.contains(2)) {
                    see.m35046a(parcel, 2, this.f30275b, true);
                }
                if (set.contains(3)) {
                    see.m35046a(parcel, 3, this.f30276c, true);
                }
                if (set.contains(4)) {
                    see.m35046a(parcel, 4, this.f30277d, true);
                }
                if (set.contains(5)) {
                    see.m35046a(parcel, 5, this.f30278e, true);
                }
                if (set.contains(6)) {
                    see.m35046a(parcel, 6, this.f30279f, true);
                }
                if (set.contains(7)) {
                    see.m35046a(parcel, 7, this.f30280g, true);
                }
                see.m35062b(parcel, a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.f30274a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f30264i = hashMap;
            hashMap.put("clients", FastJsonResponse$Field.m22657b("clients", 2, Clients.class));
            f30264i.put("display_name", FastJsonResponse$Field.m22666f("display_name", 3));
            f30264i.put("icon_url", FastJsonResponse$Field.m22666f("icon_url", 4));
            f30264i.put("project_id", FastJsonResponse$Field.m22666f("project_id", 5));
            f30264i.put("revocation_handle", FastJsonResponse$Field.m22666f("revocation_handle", 6));
            f30264i.put("revocation_message", FastJsonResponse$Field.m22666f("revocation_message", 7));
            f30264i.put("scope_ids", new FastJsonResponse$Field(0, true, 0, true, "scope_ids", 8, null, null));
        }

        public Apps() {
            this.f30265a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f30264i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            switch (i) {
                case 2:
                    return this.f30266b;
                case 3:
                    return this.f30267c;
                case 4:
                    return this.f30268d;
                case 5:
                    return this.f30269e;
                case 6:
                    return this.f30270f;
                case 7:
                    return this.f30271g;
                case 8:
                    return this.f30272h;
                default:
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown safe parcelable id=");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo17834c(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 8) {
                this.f30272h = arrayList;
                this.f30265a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an array of ints.");
            throw new IllegalArgumentException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Apps)) {
                return false;
            }
            if (this != obj) {
                Apps apps = (Apps) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f30264i.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!apps.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(apps.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (apps.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30264i.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Apps(Set set, List list, String str, String str2, String str3, String str4, String str5, List list2) {
            this.f30265a = set;
            this.f30266b = list;
            this.f30267c = str;
            this.f30268d = str2;
            this.f30269e = str3;
            this.f30270f = str4;
            this.f30271g = str5;
            this.f30272h = list2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f30267c = str2;
            } else if (i == 4) {
                this.f30268d = str2;
            } else if (i == 5) {
                this.f30269e = str2;
            } else if (i == 6) {
                this.f30270f = str2;
            } else if (i == 7) {
                this.f30271g = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f30265a.add(Integer.valueOf(i));
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
        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: see.a(android.os.Parcel, int, java.util.List, boolean):void
         arg types: [android.os.Parcel, int, java.util.List, int]
         candidates:
          see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
          see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
          see.a(android.os.Parcel, int, java.lang.String, boolean):void
          see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
          see.a(android.os.Parcel, int, byte[], boolean):void
          see.a(android.os.Parcel, int, double[], boolean):void
          see.a(android.os.Parcel, int, float[], boolean):void
          see.a(android.os.Parcel, int, int[], boolean):void
          see.a(android.os.Parcel, int, long[], boolean):void
          see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
          see.a(android.os.Parcel, int, java.lang.String[], boolean):void
          see.a(android.os.Parcel, int, boolean[], boolean):void
          see.a(android.os.Parcel, int, java.util.List, boolean):void */
        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f30265a;
            if (set.contains(2)) {
                see.m35066c(parcel, 2, this.f30266b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f30267c, true);
            }
            if (set.contains(4)) {
                see.m35046a(parcel, 4, this.f30268d, true);
            }
            if (set.contains(5)) {
                see.m35046a(parcel, 5, this.f30269e, true);
            }
            if (set.contains(6)) {
                see.m35046a(parcel, 6, this.f30270f, true);
            }
            if (set.contains(7)) {
                see.m35046a(parcel, 7, this.f30271g, true);
            }
            if (set.contains(8)) {
                see.m35049a(parcel, 8, this.f30272h, true);
            }
            see.m35062b(parcel, a);
        }

        /* renamed from: a */
        public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f30266b = arrayList;
                this.f30265a.add(Integer.valueOf(i));
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
            return this.f30265a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f30254d = hashMap;
        hashMap.put("api_scopes", FastJsonResponse$Field.m22657b("api_scopes", 2, Api_scopes.class));
        f30254d.put("apps", FastJsonResponse$Field.m22657b("apps", 3, Apps.class));
    }

    public AuthApps() {
        this.f30255a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f30254d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            return this.f30256b;
        }
        if (i == 3) {
            return this.f30257c;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthApps)) {
            return false;
        }
        if (this != obj) {
            AuthApps authApps = (AuthApps) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30254d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!authApps.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(authApps.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (authApps.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f30254d.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public AuthApps(Set set, List list, List list2) {
        this.f30255a = set;
        this.f30256b = list;
        this.f30257c = list2;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f30256b = arrayList;
        } else if (i == 3) {
            this.f30257c = arrayList;
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
        this.f30255a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f30255a;
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f30256b, true);
        }
        if (set.contains(3)) {
            see.m35066c(parcel, 3, this.f30257c, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f30255a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
