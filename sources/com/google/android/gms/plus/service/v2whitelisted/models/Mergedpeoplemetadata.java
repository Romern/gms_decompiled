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
public final class Mergedpeoplemetadata extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new aoiy();

    /* renamed from: n */
    private static final HashMap f83115n;

    /* renamed from: a */
    final Set f83116a;

    /* renamed from: b */
    public List f83117b;

    /* renamed from: c */
    public String f83118c;

    /* renamed from: d */
    public String f83119d;

    /* renamed from: e */
    public String f83120e;

    /* renamed from: f */
    boolean f83121f;

    /* renamed from: g */
    public boolean f83122g;

    /* renamed from: h */
    List f83123h;

    /* renamed from: i */
    Mergedpeoplefieldacl f83124i;

    /* renamed from: j */
    public boolean f83125j;

    /* renamed from: k */
    boolean f83126k;

    /* renamed from: l */
    String f83127l;

    /* renamed from: m */
    boolean f83128m;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class EdgeKeyInfo extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new aoiz();

        /* renamed from: b */
        private static final HashMap f83129b = new HashMap();

        /* renamed from: a */
        final Set f83130a;

        public EdgeKeyInfo() {
            this.f83130a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f83129b;
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

        public final boolean equals(Object obj) {
            if (!(obj instanceof EdgeKeyInfo)) {
                return false;
            }
            if (this != obj) {
                EdgeKeyInfo edgeKeyInfo = (EdgeKeyInfo) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f83129b.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!edgeKeyInfo.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(edgeKeyInfo.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (edgeKeyInfo.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83129b.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public EdgeKeyInfo(Set set) {
            this.f83130a = set;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f83130a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            see.m35062b(parcel, see.m35030a(parcel));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f83115n = hashMap;
        hashMap.put("affinities", FastJsonResponse$Field.m22657b("affinities", 2, Mergedpeopleaffinities.class));
        f83115n.put("container", FastJsonResponse$Field.m22666f("container", 3));
        f83115n.put("containerContactId", FastJsonResponse$Field.m22666f("containerContactId", 4));
        f83115n.put("containerId", FastJsonResponse$Field.m22666f("containerId", 5));
        f83115n.put("container_primary", FastJsonResponse$Field.m22664e("container_primary", 6));
        f83115n.put("edgeKey", FastJsonResponse$Field.m22664e("edgeKey", 7));
        f83115n.put("edgeKeyInfo", FastJsonResponse$Field.m22657b("edgeKeyInfo", 8, EdgeKeyInfo.class));
        f83115n.put("fieldAcl", FastJsonResponse$Field.m22653a("fieldAcl", 9, Mergedpeoplefieldacl.class));
        f83115n.put("primary", FastJsonResponse$Field.m22664e("primary", 10));
        f83115n.put("verified", FastJsonResponse$Field.m22664e("verified", 11));
        f83115n.put("visibility", FastJsonResponse$Field.m22666f("visibility", 12));
        f83115n.put("writeable", FastJsonResponse$Field.m22664e("writeable", 13));
    }

    public Mergedpeoplemetadata() {
        this.f83116a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f83115n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f83117b;
            case 3:
                return this.f83118c;
            case 4:
                return this.f83119d;
            case 5:
                return this.f83120e;
            case 6:
                return Boolean.valueOf(this.f83121f);
            case 7:
                return Boolean.valueOf(this.f83122g);
            case 8:
                return this.f83123h;
            case 9:
                return this.f83124i;
            case 10:
                return Boolean.valueOf(this.f83125j);
            case 11:
                return Boolean.valueOf(this.f83126k);
            case 12:
                return this.f83127l;
            case 13:
                return Boolean.valueOf(this.f83128m);
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Mergedpeoplemetadata)) {
            return false;
        }
        if (this != obj) {
            Mergedpeoplemetadata mergedpeoplemetadata = (Mergedpeoplemetadata) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f83115n.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!mergedpeoplemetadata.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(mergedpeoplemetadata.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (mergedpeoplemetadata.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f83115n.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public Mergedpeoplemetadata(Set set, List list, String str, String str2, String str3, boolean z, boolean z2, List list2, Mergedpeoplefieldacl mergedpeoplefieldacl, boolean z3, boolean z4, String str4, boolean z5) {
        this.f83116a = set;
        this.f83117b = list;
        this.f83118c = str;
        this.f83119d = str2;
        this.f83120e = str3;
        this.f83121f = z;
        this.f83122g = z2;
        this.f83123h = list2;
        this.f83124i = mergedpeoplefieldacl;
        this.f83125j = z3;
        this.f83126k = z4;
        this.f83127l = str4;
        this.f83128m = z5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f83118c = str2;
        } else if (i == 4) {
            this.f83119d = str2;
        } else if (i == 5) {
            this.f83120e = str2;
        } else if (i == 12) {
            this.f83127l = str2;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83116a.add(Integer.valueOf(i));
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
        Set set = this.f83116a;
        if (set.contains(2)) {
            see.m35066c(parcel, 2, this.f83117b, true);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f83118c, true);
        }
        if (set.contains(4)) {
            see.m35046a(parcel, 4, this.f83119d, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f83120e, true);
        }
        if (set.contains(6)) {
            see.m35051a(parcel, 6, this.f83121f);
        }
        if (set.contains(7)) {
            see.m35051a(parcel, 7, this.f83122g);
        }
        if (set.contains(8)) {
            see.m35066c(parcel, 8, this.f83123h, true);
        }
        if (set.contains(9)) {
            see.m35040a(parcel, 9, this.f83124i, i, true);
        }
        if (set.contains(10)) {
            see.m35051a(parcel, 10, this.f83125j);
        }
        if (set.contains(11)) {
            see.m35051a(parcel, 11, this.f83126k);
        }
        if (set.contains(12)) {
            see.m35046a(parcel, 12, this.f83127l, true);
        }
        if (set.contains(13)) {
            see.m35051a(parcel, 13, this.f83128m);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f83117b = arrayList;
        } else if (i == 8) {
            this.f83123h = arrayList;
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
        this.f83116a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 9) {
            this.f83124i = (Mergedpeoplefieldacl) sio;
            this.f83116a.add(Integer.valueOf(i));
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
        if (i == 6) {
            this.f83121f = z;
        } else if (i == 7) {
            this.f83122g = z;
        } else if (i == 10) {
            this.f83125j = z;
        } else if (i == 11) {
            this.f83126k = z;
        } else if (i == 13) {
            this.f83128m = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f83116a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f83116a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
