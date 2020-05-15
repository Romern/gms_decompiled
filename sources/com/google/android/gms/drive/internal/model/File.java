package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class File extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new uvi();

    /* renamed from: Z */
    private static final HashMap f30957Z;

    /* renamed from: A */
    public String f30958A;

    /* renamed from: B */
    public String f30959B;

    /* renamed from: C */
    public String f30960C;

    /* renamed from: D */
    public String f30961D;

    /* renamed from: E */
    public List f30962E;

    /* renamed from: F */
    List f30963F;

    /* renamed from: G */
    public List f30964G;

    /* renamed from: H */
    public List f30965H;

    /* renamed from: I */
    public List f30966I;

    /* renamed from: J */
    public long f30967J;

    /* renamed from: K */
    public String f30968K;

    /* renamed from: L */
    public String f30969L;

    /* renamed from: M */
    public boolean f30970M;

    /* renamed from: N */
    public String f30971N;

    /* renamed from: O */
    public User f30972O;

    /* renamed from: P */
    public List f30973P;

    /* renamed from: Q */
    public boolean f30974Q;

    /* renamed from: R */
    public Thumbnail f30975R;

    /* renamed from: S */
    public String f30976S;

    /* renamed from: T */
    public String f30977T;

    /* renamed from: U */
    public Permission f30978U;

    /* renamed from: V */
    public long f30979V;

    /* renamed from: W */
    public String f30980W;

    /* renamed from: X */
    public String f30981X;

    /* renamed from: Y */
    public boolean f30982Y;

    /* renamed from: a */
    public final Set f30983a;

    /* renamed from: b */
    public String f30984b;

    /* renamed from: c */
    public boolean f30985c;

    /* renamed from: d */
    public List f30986d;

    /* renamed from: e */
    public boolean f30987e;

    /* renamed from: f */
    public String f30988f;

    /* renamed from: g */
    public String f30989g;

    /* renamed from: h */
    public String f30990h;

    /* renamed from: i */
    public String f30991i;

    /* renamed from: j */
    public boolean f30992j;

    /* renamed from: k */
    public String f30993k;

    /* renamed from: l */
    public String f30994l;

    /* renamed from: m */
    public boolean f30995m;

    /* renamed from: n */
    public String f30996n;

    /* renamed from: o */
    public long f30997o;

    /* renamed from: p */
    public String f30998p;

    /* renamed from: q */
    public List f30999q;

    /* renamed from: r */
    public boolean f31000r;

    /* renamed from: s */
    public String f31001s;

    /* renamed from: t */
    public String f31002t;

    /* renamed from: u */
    public IndexableText f31003u;

    /* renamed from: v */
    public Labels f31004v;

    /* renamed from: w */
    public User f31005w;

    /* renamed from: x */
    public String f31006x;

    /* renamed from: y */
    public FileLocalId f31007y;

    /* renamed from: z */
    public String f31008z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class IndexableText extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new uvl();

        /* renamed from: c */
        private static final HashMap f31009c;

        /* renamed from: a */
        public final Set f31010a;

        /* renamed from: b */
        public String f31011b;

        static {
            HashMap hashMap = new HashMap();
            f31009c = hashMap;
            hashMap.put("text", FastJsonResponse$Field.m22666f("text", 2));
        }

        public IndexableText() {
            this.f31010a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f31009c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f31011b;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof IndexableText)) {
                return false;
            }
            if (this != obj) {
                IndexableText indexableText = (IndexableText) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f31009c.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!indexableText.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(indexableText.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (indexableText.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31009c.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public IndexableText(Set set, String str) {
            this.f31010a = set;
            this.f31011b = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f31011b = str2;
                this.f31010a.add(Integer.valueOf(i));
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
            if (this.f31010a.contains(2)) {
                see.m35046a(parcel, 2, this.f31011b, true);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f31010a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Labels extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new uvm();

        /* renamed from: f */
        private static final HashMap f31012f;

        /* renamed from: a */
        public final Set f31013a;

        /* renamed from: b */
        public boolean f31014b;

        /* renamed from: c */
        public boolean f31015c;

        /* renamed from: d */
        public boolean f31016d;

        /* renamed from: e */
        public boolean f31017e;

        static {
            HashMap hashMap = new HashMap();
            f31012f = hashMap;
            hashMap.put("restricted", FastJsonResponse$Field.m22664e("restricted", 3));
            f31012f.put("starred", FastJsonResponse$Field.m22664e("starred", 4));
            f31012f.put("trashed", FastJsonResponse$Field.m22664e("trashed", 5));
            f31012f.put("viewed", FastJsonResponse$Field.m22664e("viewed", 6));
        }

        public Labels() {
            this.f31013a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f31012f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                return Boolean.valueOf(this.f31014b);
            }
            if (i == 4) {
                return Boolean.valueOf(this.f31015c);
            }
            if (i == 5) {
                return Boolean.valueOf(this.f31016d);
            }
            if (i == 6) {
                return Boolean.valueOf(this.f31017e);
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Labels)) {
                return false;
            }
            if (this != obj) {
                Labels labels = (Labels) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f31012f.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!labels.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(labels.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (labels.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31012f.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Labels(Set set, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f31013a = set;
            this.f31014b = z;
            this.f31015c = z2;
            this.f31016d = z3;
            this.f31017e = z4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 3) {
                this.f31014b = z;
            } else if (i == 4) {
                this.f31015c = z;
            } else if (i == 5) {
                this.f31016d = z;
            } else if (i == 6) {
                this.f31017e = z;
            } else {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a boolean.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f31013a.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            Set set = this.f31013a;
            if (set.contains(3)) {
                see.m35051a(parcel, 3, this.f31014b);
            }
            if (set.contains(4)) {
                see.m35051a(parcel, 4, this.f31015c);
            }
            if (set.contains(5)) {
                see.m35051a(parcel, 5, this.f31016d);
            }
            if (set.contains(6)) {
                see.m35051a(parcel, 6, this.f31017e);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f31013a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class Thumbnail extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new uvn();

        /* renamed from: d */
        private static final HashMap f31018d;

        /* renamed from: a */
        public final Set f31019a;

        /* renamed from: b */
        public String f31020b;

        /* renamed from: c */
        public String f31021c;

        static {
            HashMap hashMap = new HashMap();
            f31018d = hashMap;
            hashMap.put("image", FastJsonResponse$Field.m22666f("image", 2));
            f31018d.put("mimeType", FastJsonResponse$Field.m22666f("mimeType", 3));
        }

        public Thumbnail() {
            this.f31019a = new HashSet();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Map mo7367a() {
            return f31018d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                return this.f31020b;
            }
            if (i == 3) {
                return this.f31021c;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown safe parcelable id=");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Thumbnail)) {
                return false;
            }
            if (this != obj) {
                Thumbnail thumbnail = (Thumbnail) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f31018d.values()) {
                    if (mo7370a(fastJsonResponse$Field)) {
                        if (!thumbnail.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(thumbnail.mo7371b(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (thumbnail.mo7370a(fastJsonResponse$Field)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : f31018d.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        public Thumbnail(Set set, String str, String str2) {
            this.f31019a = set;
            this.f31020b = str;
            this.f31021c = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.f30319g;
            if (i == 2) {
                this.f31020b = str2;
            } else if (i == 3) {
                this.f31021c = str2;
            } else {
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f31019a.add(Integer.valueOf(i));
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
            Set set = this.f31019a;
            if (set.contains(2)) {
                see.m35046a(parcel, 2, this.f31020b, true);
            }
            if (set.contains(3)) {
                see.m35046a(parcel, 3, this.f31021c, true);
            }
            see.m35062b(parcel, a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.f31019a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f30957Z = hashMap;
        hashMap.put("alternateLink", FastJsonResponse$Field.m22666f("alternateLink", 2));
        f30957Z.put("appDataContents", FastJsonResponse$Field.m22664e("appDataContents", 3));
        f30957Z.put("authorizedAppIds", FastJsonResponse$Field.m22668g("authorizedAppIds", 4));
        f30957Z.put("copyable", FastJsonResponse$Field.m22664e("copyable", 6));
        f30957Z.put("createdDate", FastJsonResponse$Field.m22666f("createdDate", 7));
        f30957Z.put("creatorAppId", FastJsonResponse$Field.m22666f("creatorAppId", 8));
        f30957Z.put("description", FastJsonResponse$Field.m22666f("description", 11));
        f30957Z.put("downloadUrl", FastJsonResponse$Field.m22666f("downloadUrl", 12));
        f30957Z.put("editable", FastJsonResponse$Field.m22664e("editable", 14));
        f30957Z.put("embedLink", FastJsonResponse$Field.m22666f("embedLink", 16));
        f30957Z.put("etag", FastJsonResponse$Field.m22666f("etag", 17));
        f30957Z.put("explicitlyTrashed", FastJsonResponse$Field.m22664e("explicitlyTrashed", 18));
        f30957Z.put("fileExtension", FastJsonResponse$Field.m22666f("fileExtension", 20));
        f30957Z.put("fileSize", FastJsonResponse$Field.m22656b("fileSize", 21));
        f30957Z.put("folderColorRgb", FastJsonResponse$Field.m22666f("folderColorRgb", 24));
        f30957Z.put("folderFeatures", FastJsonResponse$Field.m22668g("folderFeatures", 25));
        f30957Z.put("gplusMedia", FastJsonResponse$Field.m22664e("gplusMedia", 26));
        f30957Z.put("headRevisionId", FastJsonResponse$Field.m22666f("headRevisionId", 30));
        f30957Z.put("id", FastJsonResponse$Field.m22666f("id", 32));
        f30957Z.put("indexableText", FastJsonResponse$Field.m22653a("indexableText", 34, IndexableText.class));
        f30957Z.put("labels", FastJsonResponse$Field.m22653a("labels", 36, Labels.class));
        f30957Z.put("lastModifyingUser", FastJsonResponse$Field.m22653a("lastModifyingUser", 37, User.class));
        f30957Z.put("lastViewedByMeDate", FastJsonResponse$Field.m22666f("lastViewedByMeDate", 39));
        f30957Z.put("localId", FastJsonResponse$Field.m22653a("localId", 40, FileLocalId.class));
        f30957Z.put("md5Checksum", FastJsonResponse$Field.m22666f("md5Checksum", 42));
        f30957Z.put("mimeType", FastJsonResponse$Field.m22666f("mimeType", 43));
        f30957Z.put("modifiedByMeDate", FastJsonResponse$Field.m22666f("modifiedByMeDate", 44));
        f30957Z.put("modifiedDate", FastJsonResponse$Field.m22666f("modifiedDate", 45));
        f30957Z.put("originalFilename", FastJsonResponse$Field.m22666f("originalFilename", 47));
        f30957Z.put("ownerNames", FastJsonResponse$Field.m22668g("ownerNames", 49));
        f30957Z.put("owners", FastJsonResponse$Field.m22657b("owners", 50, User.class));
        f30957Z.put("parents", FastJsonResponse$Field.m22657b("parents", 51, ParentReference.class));
        f30957Z.put("permissions", FastJsonResponse$Field.m22657b("permissions", 52, Permission.class));
        f30957Z.put("properties", FastJsonResponse$Field.m22657b("properties", 54, Property.class));
        f30957Z.put("quotaBytesUsed", FastJsonResponse$Field.m22656b("quotaBytesUsed", 55));
        f30957Z.put("recency", FastJsonResponse$Field.m22666f("recency", 57));
        f30957Z.put("recencyReason", FastJsonResponse$Field.m22666f("recencyReason", 58));
        f30957Z.put("shared", FastJsonResponse$Field.m22664e("shared", 63));
        f30957Z.put("sharedWithMeDate", FastJsonResponse$Field.m22666f("sharedWithMeDate", 64));
        f30957Z.put("sharingUser", FastJsonResponse$Field.m22653a("sharingUser", 65, User.class));
        f30957Z.put("spaces", FastJsonResponse$Field.m22668g("spaces", 68));
        f30957Z.put("subscribed", FastJsonResponse$Field.m22664e("subscribed", 69));
        f30957Z.put("thumbnail", FastJsonResponse$Field.m22653a("thumbnail", 71, Thumbnail.class));
        f30957Z.put("thumbnailLink", FastJsonResponse$Field.m22666f("thumbnailLink", 72));
        f30957Z.put("title", FastJsonResponse$Field.m22666f("title", 73));
        f30957Z.put("userPermission", FastJsonResponse$Field.m22653a("userPermission", 74, Permission.class));
        f30957Z.put("version", FastJsonResponse$Field.m22656b("version", 75));
        f30957Z.put("webContentLink", FastJsonResponse$Field.m22666f("webContentLink", 77));
        f30957Z.put("webViewLink", FastJsonResponse$Field.m22666f("webViewLink", 78));
        f30957Z.put("writersCanShare", FastJsonResponse$Field.m22664e("writersCanShare", 79));
    }

    public File() {
        this.f30983a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f30957Z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f30984b;
            case 3:
                return Boolean.valueOf(this.f30985c);
            case 4:
                return this.f30986d;
            case 5:
            case 9:
            case 10:
            case 13:
            case 15:
            case 19:
            case 22:
            case 23:
            case 27:
            case 28:
            case 29:
            case 31:
            case 33:
            case 35:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
            case 41:
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
            case 48:
            case 53:
            case FelicaException.TYPE_ACTIVATE_FAILED:
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
            case FelicaException.TYPE_MFC_NOT_FOUND:
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
            case 62:
            case 66:
            case KeyInformation.AES128_DES112:
            case 70:
            case 76:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 6:
                return Boolean.valueOf(this.f30987e);
            case 7:
                return this.f30988f;
            case 8:
                return this.f30989g;
            case 11:
                return this.f30990h;
            case 12:
                return this.f30991i;
            case 14:
                return Boolean.valueOf(this.f30992j);
            case 16:
                return this.f30993k;
            case 17:
                return this.f30994l;
            case 18:
                return Boolean.valueOf(this.f30995m);
            case 20:
                return this.f30996n;
            case 21:
                return Long.valueOf(this.f30997o);
            case 24:
                return this.f30998p;
            case 25:
                return this.f30999q;
            case 26:
                return Boolean.valueOf(this.f31000r);
            case 30:
                return this.f31001s;
            case 32:
                return this.f31002t;
            case 34:
                return this.f31003u;
            case 36:
                return this.f31004v;
            case FelicaException.TYPE_NOT_CLOSED:
                return this.f31005w;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return this.f31006x;
            case FelicaException.TYPE_PUSH_FAILED:
                return this.f31007y;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return this.f31008z;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return this.f30958A;
            case FelicaException.TYPE_RESET_FAILED:
                return this.f30959B;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return this.f30960C;
            case 47:
                return this.f30961D;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return this.f30962E;
            case 50:
                return this.f30963F;
            case 51:
                return this.f30964G;
            case 52:
                return this.f30965H;
            case 54:
                return this.f30966I;
            case 55:
                return Long.valueOf(this.f30967J);
            case 57:
                return this.f30968K;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return this.f30969L;
            case 63:
                return Boolean.valueOf(this.f30970M);
            case 64:
                return this.f30971N;
            case KeyInformation.AES128_DES56:
                return this.f30972O;
            case 68:
                return this.f30973P;
            case 69:
                return Boolean.valueOf(this.f30974Q);
            case 71:
                return this.f30975R;
            case 72:
                return this.f30976S;
            case 73:
                return this.f30977T;
            case 74:
                return this.f30978U;
            case 75:
                return Long.valueOf(this.f30979V);
            case 77:
                return this.f30980W;
            case 78:
                return this.f30981X;
            case KeyInformation.AES128:
                return Boolean.valueOf(this.f30982Y);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof File)) {
            return false;
        }
        if (this != obj) {
            File file = (File) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f30957Z.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!file.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(file.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (file.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f30957Z.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    public File(Set set, String str, boolean z, List list, boolean z2, String str2, String str3, String str4, String str5, boolean z3, String str6, String str7, boolean z4, String str8, long j, String str9, List list2, boolean z5, String str10, String str11, IndexableText indexableText, Labels labels, User user, String str12, FileLocalId fileLocalId, String str13, String str14, String str15, String str16, String str17, List list3, List list4, List list5, List list6, List list7, long j2, String str18, String str19, boolean z6, String str20, User user2, List list8, boolean z7, Thumbnail thumbnail, String str21, String str22, Permission permission, long j3, String str23, String str24, boolean z8) {
        this.f30983a = set;
        this.f30984b = str;
        this.f30985c = z;
        this.f30986d = list;
        this.f30987e = z2;
        this.f30988f = str2;
        this.f30989g = str3;
        this.f30990h = str4;
        this.f30991i = str5;
        this.f30992j = z3;
        this.f30993k = str6;
        this.f30994l = str7;
        this.f30995m = z4;
        this.f30996n = str8;
        this.f30997o = j;
        this.f30998p = str9;
        this.f30999q = list2;
        this.f31000r = z5;
        this.f31001s = str10;
        this.f31002t = str11;
        this.f31003u = indexableText;
        this.f31004v = labels;
        this.f31005w = user;
        this.f31006x = str12;
        this.f31007y = fileLocalId;
        this.f31008z = str13;
        this.f30958A = str14;
        this.f30959B = str15;
        this.f30960C = str16;
        this.f30961D = str17;
        this.f30962E = list3;
        this.f30963F = list4;
        this.f30964G = list5;
        this.f30965H = list6;
        this.f30966I = list7;
        this.f30967J = j2;
        this.f30968K = str18;
        this.f30969L = str19;
        this.f30970M = z6;
        this.f30971N = str20;
        this.f30972O = user2;
        this.f30973P = list8;
        this.f30974Q = z7;
        this.f30975R = thumbnail;
        this.f30976S = str21;
        this.f30977T = str22;
        this.f30978U = permission;
        this.f30979V = j3;
        this.f30980W = str23;
        this.f30981X = str24;
        this.f30982Y = z8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 21) {
            this.f30997o = j;
        } else if (i == 55) {
            this.f30967J = j;
        } else if (i == 75) {
            this.f30979V = j;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a long.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f30983a.add(Integer.valueOf(i));
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
        Set set = this.f30983a;
        if (set.contains(2)) {
            see.m35046a(parcel, 2, this.f30984b, true);
        }
        if (set.contains(3)) {
            see.m35051a(parcel, 3, this.f30985c);
        }
        if (set.contains(4)) {
            see.m35065b(parcel, 4, this.f30986d, true);
        }
        if (set.contains(6)) {
            see.m35051a(parcel, 6, this.f30987e);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f30988f, true);
        }
        if (set.contains(8)) {
            see.m35046a(parcel, 8, this.f30989g, true);
        }
        if (set.contains(11)) {
            see.m35046a(parcel, 11, this.f30990h, true);
        }
        if (set.contains(12)) {
            see.m35046a(parcel, 12, this.f30991i, true);
        }
        if (set.contains(14)) {
            see.m35051a(parcel, 14, this.f30992j);
        }
        if (set.contains(16)) {
            see.m35046a(parcel, 16, this.f30993k, true);
        }
        if (set.contains(17)) {
            see.m35046a(parcel, 17, this.f30994l, true);
        }
        if (set.contains(18)) {
            see.m35051a(parcel, 18, this.f30995m);
        }
        if (set.contains(20)) {
            see.m35046a(parcel, 20, this.f30996n, true);
        }
        if (set.contains(21)) {
            see.m35036a(parcel, 21, this.f30997o);
        }
        if (set.contains(24)) {
            see.m35046a(parcel, 24, this.f30998p, true);
        }
        if (set.contains(25)) {
            see.m35065b(parcel, 25, this.f30999q, true);
        }
        if (set.contains(26)) {
            see.m35051a(parcel, 26, this.f31000r);
        }
        if (set.contains(30)) {
            see.m35046a(parcel, 30, this.f31001s, true);
        }
        if (set.contains(32)) {
            see.m35046a(parcel, 32, this.f31002t, true);
        }
        if (set.contains(34)) {
            see.m35040a(parcel, 34, this.f31003u, i, true);
        }
        if (set.contains(36)) {
            see.m35040a(parcel, 36, this.f31004v, i, true);
        }
        if (set.contains(37)) {
            see.m35040a(parcel, 37, this.f31005w, i, true);
        }
        if (set.contains(39)) {
            see.m35046a(parcel, 39, this.f31006x, true);
        }
        if (set.contains(40)) {
            see.m35040a(parcel, 40, this.f31007y, i, true);
        }
        if (set.contains(42)) {
            see.m35046a(parcel, 42, this.f31008z, true);
        }
        if (set.contains(43)) {
            see.m35046a(parcel, 43, this.f30958A, true);
        }
        if (set.contains(44)) {
            see.m35046a(parcel, 44, this.f30959B, true);
        }
        if (set.contains(45)) {
            see.m35046a(parcel, 45, this.f30960C, true);
        }
        if (set.contains(47)) {
            see.m35046a(parcel, 47, this.f30961D, true);
        }
        if (set.contains(49)) {
            see.m35065b(parcel, 49, this.f30962E, true);
        }
        if (set.contains(50)) {
            see.m35066c(parcel, 50, this.f30963F, true);
        }
        if (set.contains(51)) {
            see.m35066c(parcel, 51, this.f30964G, true);
        }
        if (set.contains(52)) {
            see.m35066c(parcel, 52, this.f30965H, true);
        }
        if (set.contains(54)) {
            see.m35066c(parcel, 54, this.f30966I, true);
        }
        if (set.contains(55)) {
            see.m35036a(parcel, 55, this.f30967J);
        }
        if (set.contains(57)) {
            see.m35046a(parcel, 57, this.f30968K, true);
        }
        if (set.contains(58)) {
            see.m35046a(parcel, 58, this.f30969L, true);
        }
        if (set.contains(63)) {
            see.m35051a(parcel, 63, this.f30970M);
        }
        if (set.contains(64)) {
            see.m35046a(parcel, 64, this.f30971N, true);
        }
        if (set.contains(65)) {
            see.m35040a(parcel, 65, this.f30972O, i, true);
        }
        if (set.contains(68)) {
            see.m35065b(parcel, 68, this.f30973P, true);
        }
        if (set.contains(69)) {
            see.m35051a(parcel, 69, this.f30974Q);
        }
        if (set.contains(71)) {
            see.m35040a(parcel, 71, this.f30975R, i, true);
        }
        if (set.contains(72)) {
            see.m35046a(parcel, 72, this.f30976S, true);
        }
        if (set.contains(73)) {
            see.m35046a(parcel, 73, this.f30977T, true);
        }
        if (set.contains(74)) {
            see.m35040a(parcel, 74, this.f30978U, i, true);
        }
        if (set.contains(75)) {
            see.m35036a(parcel, 75, this.f30979V);
        }
        if (set.contains(77)) {
            see.m35046a(parcel, 77, this.f30980W, true);
        }
        if (set.contains(78)) {
            see.m35046a(parcel, 78, this.f30981X, true);
        }
        if (set.contains(79)) {
            see.m35051a(parcel, 79, this.f30982Y);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f30984b = str2;
        } else if (i == 20) {
            this.f30996n = str2;
        } else if (i == 24) {
            this.f30998p = str2;
        } else if (i == 30) {
            this.f31001s = str2;
        } else if (i == 32) {
            this.f31002t = str2;
        } else if (i == 39) {
            this.f31006x = str2;
        } else if (i == 47) {
            this.f30961D = str2;
        } else if (i == 64) {
            this.f30971N = str2;
        } else if (i == 7) {
            this.f30988f = str2;
        } else if (i == 8) {
            this.f30989g = str2;
        } else if (i == 11) {
            this.f30990h = str2;
        } else if (i == 12) {
            this.f30991i = str2;
        } else if (i == 16) {
            this.f30993k = str2;
        } else if (i == 17) {
            this.f30994l = str2;
        } else if (i == 57) {
            this.f30968K = str2;
        } else if (i == 58) {
            this.f30969L = str2;
        } else if (i == 72) {
            this.f30976S = str2;
        } else if (i == 73) {
            this.f30977T = str2;
        } else if (i == 77) {
            this.f30980W = str2;
        } else if (i != 78) {
            switch (i) {
                case FelicaException.TYPE_ALREADY_ACTIVATED:
                    this.f31008z = str2;
                    break;
                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                    this.f30958A = str2;
                    break;
                case FelicaException.TYPE_RESET_FAILED:
                    this.f30959B = str2;
                    break;
                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                    this.f30960C = str2;
                    break;
                default:
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Field with id=");
                    sb.append(i);
                    sb.append(" is not known to be a String.");
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.f30981X = str2;
        }
        this.f30983a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 50:
                this.f30963F = arrayList;
                break;
            case 51:
                this.f30964G = arrayList;
                break;
            case 52:
                this.f30965H = arrayList;
                break;
            case 53:
            default:
                String canonicalName = arrayList.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 71);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not a known array of custom type.  Found ");
                sb.append(canonicalName);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            case 54:
                this.f30966I = arrayList;
                break;
        }
        this.f30983a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 34) {
            this.f31003u = (IndexableText) sio;
        } else if (i == 40) {
            this.f31007y = (FileLocalId) sio;
        } else if (i == 65) {
            this.f30972O = (User) sio;
        } else if (i == 71) {
            this.f30975R = (Thumbnail) sio;
        } else if (i == 74) {
            this.f30978U = (Permission) sio;
        } else if (i == 36) {
            this.f31004v = (Labels) sio;
        } else if (i == 37) {
            this.f31005w = (User) sio;
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
        this.f30983a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 4) {
            this.f30986d = arrayList;
        } else if (i == 25) {
            this.f30999q = arrayList;
        } else if (i == 49) {
            this.f30962E = arrayList;
        } else if (i == 68) {
            this.f30973P = arrayList;
        } else {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be an array of String.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f30983a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f30985c = z;
        } else if (i == 6) {
            this.f30987e = z;
        } else if (i == 14) {
            this.f30992j = z;
        } else if (i == 18) {
            this.f30995m = z;
        } else if (i == 26) {
            this.f31000r = z;
        } else if (i == 63) {
            this.f30970M = z;
        } else if (i == 69) {
            this.f30974Q = z;
        } else if (i == 79) {
            this.f30982Y = z;
        } else {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a boolean.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f30983a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo18239a(Labels labels) {
        this.f31004v = labels;
        this.f30983a.add(36);
    }

    /* renamed from: a */
    public final void mo18240a(FileLocalId fileLocalId) {
        this.f31007y = fileLocalId;
        this.f30983a.add(40);
    }

    /* renamed from: a */
    public final void mo18241a(List list) {
        this.f30964G = list;
        this.f30983a.add(51);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f30983a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
