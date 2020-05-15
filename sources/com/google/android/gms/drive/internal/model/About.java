package com.google.android.gms.drive.internal.model;

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
public final class About extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvd();

    /* renamed from: f */
    private static final HashMap f30934f;

    /* renamed from: a */
    public final Set f30935a;

    /* renamed from: b */
    public List f30936b;

    /* renamed from: c */
    public long f30937c;

    /* renamed from: d */
    public List f30938d;

    /* renamed from: e */
    public long f30939e;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class MaxUploadSizes extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new uve();

        /* renamed from: d */
        private static final HashMap f30940d;

        /* renamed from: a */
        final Set f30941a;

        /* renamed from: b */
        public long f30942b;

        /* renamed from: c */
        public String f30943c;

        static {
            HashMap hashMap = new HashMap();
            f30940d = hashMap;
            hashMap.put("size", FastJsonResponse$Field.m22656b("size", 2));
            f30940d.put("type", FastJsonResponse$Field.m22666f("type", 3));
        }

        public MaxUploadSizes() {
            this.f30941a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f30940d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return Long.valueOf(this.f30942b);
            }
            if (i == 3) {
                return this.f30943c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof MaxUploadSizes)) {
                return false;
            }
            if (this != obj) {
                MaxUploadSizes maxUploadSizes = (MaxUploadSizes) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f30940d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!maxUploadSizes.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(maxUploadSizes.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (maxUploadSizes.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30940d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public MaxUploadSizes(Set set, long j, String str) {
            this.f30941a = set;
            this.f30942b = j;
            this.f30943c = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f30942b = j;
                this.f30941a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a long.");
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
            Set set = this.f30941a;
            if (set.contains(2)) {
                see.m35036a(parcel, 2, this.f30942b);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f30943c, true);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f30943c = str2;
                this.f30941a.add(Integer.valueOf(i));
                return;
            }
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a String.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f30941a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f30934f = hashMap;
        hashMap.put("folderColorPalette", FastJsonResponse$Field.m22668g("folderColorPalette", 8));
        f30934f.put("largestChangeId", FastJsonResponse$Field.m22656b("largestChangeId", 13));
        f30934f.put("maxUploadSizes", FastJsonResponse$Field.m22657b("maxUploadSizes", 14, MaxUploadSizes.class));
        f30934f.put("remainingChangeIds", FastJsonResponse$Field.m22656b("remainingChangeIds", 24));
    }

    public About() {
        this.f30935a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f30934f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 8) {
            return this.f30936b;
        }
        if (i == 24) {
            return Long.valueOf(this.f30939e);
        }
        if (i == 13) {
            return Long.valueOf(this.f30937c);
        }
        if (i == 14) {
            return this.f30938d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unknown safe parcelable id=");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof About)) {
            return false;
        }
        if (this != obj) {
            About about = (About) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30934f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!about.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(about.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (about.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f30934f.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public About(Set set, List list, long j, List list2, long j2) {
        this.f30935a = set;
        this.f30936b = list;
        this.f30937c = j;
        this.f30938d = list2;
        this.f30939e = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 13) {
            this.f30937c = j;
        } else if (i == 24) {
            this.f30939e = j;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f30935a.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f30935a;
        if (set.contains(8)) {
            see.m35065b(parcel, 8, this.f30936b, true);
        }
        if (set.contains(13)) {
            see.m35036a(parcel, 13, this.f30937c);
        }
        if (set.contains(14)) {
            see.m35066c(parcel, 14, this.f30938d, true);
        }
        if (set.contains(24)) {
            see.m35036a(parcel, 24, this.f30939e);
        }
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 14) {
            this.f30938d = arrayList;
            this.f30935a.add(Integer.valueOf(i));
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
        if (i == 8) {
            this.f30936b = arrayList;
            this.f30935a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be an array of String.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f30935a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
