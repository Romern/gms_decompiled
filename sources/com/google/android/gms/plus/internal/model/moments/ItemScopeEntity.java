package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ItemScopeEntity extends FastSafeParcelableJsonResponse implements rty {
    public static final Parcelable.Creator CREATOR = new anww();

    /* renamed from: ae */
    private static final HashMap f82391ae;

    /* renamed from: A */
    String f82392A;

    /* renamed from: B */
    String f82393B;

    /* renamed from: C */
    String f82394C;

    /* renamed from: D */
    ItemScopeEntity f82395D;

    /* renamed from: E */
    String f82396E;

    /* renamed from: F */
    String f82397F;

    /* renamed from: G */
    String f82398G;

    /* renamed from: H */
    String f82399H;

    /* renamed from: I */
    ItemScopeEntity f82400I;

    /* renamed from: J */
    double f82401J;

    /* renamed from: K */
    ItemScopeEntity f82402K;

    /* renamed from: L */
    double f82403L;

    /* renamed from: M */
    String f82404M;

    /* renamed from: N */
    ItemScopeEntity f82405N;

    /* renamed from: O */
    List f82406O;

    /* renamed from: P */
    String f82407P;

    /* renamed from: Q */
    String f82408Q;

    /* renamed from: R */
    String f82409R;

    /* renamed from: S */
    String f82410S;

    /* renamed from: T */
    ItemScopeEntity f82411T;

    /* renamed from: U */
    String f82412U;

    /* renamed from: V */
    String f82413V;

    /* renamed from: W */
    String f82414W;

    /* renamed from: X */
    ItemScopeEntity f82415X;

    /* renamed from: Y */
    String f82416Y;

    /* renamed from: Z */
    String f82417Z;

    /* renamed from: a */
    final Set f82418a;

    /* renamed from: aa */
    String f82419aa;

    /* renamed from: ab */
    String f82420ab;

    /* renamed from: ac */
    String f82421ac;

    /* renamed from: ad */
    String f82422ad;

    /* renamed from: b */
    final int f82423b;

    /* renamed from: c */
    ItemScopeEntity f82424c;

    /* renamed from: d */
    List f82425d;

    /* renamed from: e */
    ItemScopeEntity f82426e;

    /* renamed from: f */
    String f82427f;

    /* renamed from: g */
    String f82428g;

    /* renamed from: h */
    String f82429h;

    /* renamed from: i */
    List f82430i;

    /* renamed from: j */
    int f82431j;

    /* renamed from: k */
    List f82432k;

    /* renamed from: l */
    ItemScopeEntity f82433l;

    /* renamed from: m */
    List f82434m;

    /* renamed from: n */
    String f82435n;

    /* renamed from: o */
    String f82436o;

    /* renamed from: p */
    ItemScopeEntity f82437p;

    /* renamed from: q */
    String f82438q;

    /* renamed from: r */
    String f82439r;

    /* renamed from: s */
    String f82440s;

    /* renamed from: t */
    List f82441t;

    /* renamed from: u */
    String f82442u;

    /* renamed from: v */
    String f82443v;

    /* renamed from: w */
    String f82444w;

    /* renamed from: x */
    String f82445x;

    /* renamed from: y */
    String f82446y;

    /* renamed from: z */
    String f82447z;

    static {
        HashMap hashMap = new HashMap();
        f82391ae = hashMap;
        hashMap.put("about", FastJsonResponse$Field.m22653a("about", 2, ItemScopeEntity.class));
        f82391ae.put("additionalName", FastJsonResponse$Field.m22668g("additionalName", 3));
        f82391ae.put("address", FastJsonResponse$Field.m22653a("address", 4, ItemScopeEntity.class));
        f82391ae.put("addressCountry", FastJsonResponse$Field.m22666f("addressCountry", 5));
        f82391ae.put("addressLocality", FastJsonResponse$Field.m22666f("addressLocality", 6));
        f82391ae.put("addressRegion", FastJsonResponse$Field.m22666f("addressRegion", 7));
        f82391ae.put("associated_media", FastJsonResponse$Field.m22657b("associated_media", 8, ItemScopeEntity.class));
        f82391ae.put("attendeeCount", FastJsonResponse$Field.m22651a("attendeeCount", 9));
        f82391ae.put("attendees", FastJsonResponse$Field.m22657b("attendees", 10, ItemScopeEntity.class));
        f82391ae.put("audio", FastJsonResponse$Field.m22653a("audio", 11, ItemScopeEntity.class));
        f82391ae.put("author", FastJsonResponse$Field.m22657b("author", 12, ItemScopeEntity.class));
        f82391ae.put("bestRating", FastJsonResponse$Field.m22666f("bestRating", 13));
        f82391ae.put("birthDate", FastJsonResponse$Field.m22666f("birthDate", 14));
        f82391ae.put("byArtist", FastJsonResponse$Field.m22653a("byArtist", 15, ItemScopeEntity.class));
        f82391ae.put("caption", FastJsonResponse$Field.m22666f("caption", 16));
        f82391ae.put("contentSize", FastJsonResponse$Field.m22666f("contentSize", 17));
        f82391ae.put("contentUrl", FastJsonResponse$Field.m22666f("contentUrl", 18));
        f82391ae.put("contributor", FastJsonResponse$Field.m22657b("contributor", 19, ItemScopeEntity.class));
        f82391ae.put("dateCreated", FastJsonResponse$Field.m22666f("dateCreated", 20));
        f82391ae.put("dateModified", FastJsonResponse$Field.m22666f("dateModified", 21));
        f82391ae.put("datePublished", FastJsonResponse$Field.m22666f("datePublished", 22));
        f82391ae.put("description", FastJsonResponse$Field.m22666f("description", 23));
        f82391ae.put("duration", FastJsonResponse$Field.m22666f("duration", 24));
        f82391ae.put("embedUrl", FastJsonResponse$Field.m22666f("embedUrl", 25));
        f82391ae.put("endDate", FastJsonResponse$Field.m22666f("endDate", 26));
        f82391ae.put("familyName", FastJsonResponse$Field.m22666f("familyName", 27));
        f82391ae.put("gender", FastJsonResponse$Field.m22666f("gender", 28));
        f82391ae.put("geo", FastJsonResponse$Field.m22653a("geo", 29, ItemScopeEntity.class));
        f82391ae.put("givenName", FastJsonResponse$Field.m22666f("givenName", 30));
        f82391ae.put("height", FastJsonResponse$Field.m22666f("height", 31));
        f82391ae.put("id", FastJsonResponse$Field.m22666f("id", 32));
        f82391ae.put("image", FastJsonResponse$Field.m22666f("image", 33));
        f82391ae.put("inAlbum", FastJsonResponse$Field.m22653a("inAlbum", 34, ItemScopeEntity.class));
        f82391ae.put("latitude", FastJsonResponse$Field.m22662d("latitude", 36));
        f82391ae.put("location", FastJsonResponse$Field.m22653a("location", 37, ItemScopeEntity.class));
        f82391ae.put("longitude", FastJsonResponse$Field.m22662d("longitude", 38));
        f82391ae.put("name", FastJsonResponse$Field.m22666f("name", 39));
        f82391ae.put("partOfTVSeries", FastJsonResponse$Field.m22653a("partOfTVSeries", 40, ItemScopeEntity.class));
        f82391ae.put("performers", FastJsonResponse$Field.m22657b("performers", 41, ItemScopeEntity.class));
        f82391ae.put("playerType", FastJsonResponse$Field.m22666f("playerType", 42));
        f82391ae.put("postOfficeBoxNumber", FastJsonResponse$Field.m22666f("postOfficeBoxNumber", 43));
        f82391ae.put("postalCode", FastJsonResponse$Field.m22666f("postalCode", 44));
        f82391ae.put("ratingValue", FastJsonResponse$Field.m22666f("ratingValue", 45));
        f82391ae.put("reviewRating", FastJsonResponse$Field.m22653a("reviewRating", 46, ItemScopeEntity.class));
        f82391ae.put("startDate", FastJsonResponse$Field.m22666f("startDate", 47));
        f82391ae.put("streetAddress", FastJsonResponse$Field.m22666f("streetAddress", 48));
        f82391ae.put("text", FastJsonResponse$Field.m22666f("text", 49));
        f82391ae.put("thumbnail", FastJsonResponse$Field.m22653a("thumbnail", 50, ItemScopeEntity.class));
        f82391ae.put("thumbnailUrl", FastJsonResponse$Field.m22666f("thumbnailUrl", 51));
        f82391ae.put("tickerSymbol", FastJsonResponse$Field.m22666f("tickerSymbol", 52));
        f82391ae.put("type", FastJsonResponse$Field.m22666f("type", 53));
        f82391ae.put("url", FastJsonResponse$Field.m22666f("url", 54));
        f82391ae.put("width", FastJsonResponse$Field.m22666f("width", 55));
        f82391ae.put("worstRating", FastJsonResponse$Field.m22666f("worstRating", 56));
    }

    public ItemScopeEntity() {
        this.f82423b = 1;
        this.f82418a = new HashSet();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f82391ae;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 2:
                return this.f82424c;
            case 3:
                return this.f82425d;
            case 4:
                return this.f82426e;
            case 5:
                return this.f82427f;
            case 6:
                return this.f82428g;
            case 7:
                return this.f82429h;
            case 8:
                return this.f82430i;
            case 9:
                return Integer.valueOf(this.f82431j);
            case 10:
                return this.f82432k;
            case 11:
                return this.f82433l;
            case 12:
                return this.f82434m;
            case 13:
                return this.f82435n;
            case 14:
                return this.f82436o;
            case 15:
                return this.f82437p;
            case 16:
                return this.f82438q;
            case 17:
                return this.f82439r;
            case 18:
                return this.f82440s;
            case 19:
                return this.f82441t;
            case 20:
                return this.f82442u;
            case 21:
                return this.f82443v;
            case 22:
                return this.f82444w;
            case 23:
                return this.f82445x;
            case 24:
                return this.f82446y;
            case 25:
                return this.f82447z;
            case 26:
                return this.f82392A;
            case 27:
                return this.f82393B;
            case 28:
                return this.f82394C;
            case 29:
                return this.f82395D;
            case 30:
                return this.f82396E;
            case 31:
                return this.f82397F;
            case 32:
                return this.f82398G;
            case 33:
                return this.f82399H;
            case 34:
                return this.f82400I;
            case 35:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown safe parcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 36:
                return Double.valueOf(this.f82401J);
            case FelicaException.TYPE_NOT_CLOSED:
                return this.f82402K;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return Double.valueOf(this.f82403L);
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return this.f82404M;
            case FelicaException.TYPE_PUSH_FAILED:
                return this.f82405N;
            case 41:
                return this.f82406O;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return this.f82407P;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return this.f82408Q;
            case FelicaException.TYPE_RESET_FAILED:
                return this.f82409R;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return this.f82410S;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return this.f82411T;
            case 47:
                return this.f82412U;
            case 48:
                return this.f82413V;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return this.f82414W;
            case 50:
                return this.f82415X;
            case 51:
                return this.f82416Y;
            case 52:
                return this.f82417Z;
            case 53:
                return this.f82419aa;
            case 54:
                return this.f82420ab;
            case 55:
                return this.f82421ac;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return this.f82422ad;
        }
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ItemScopeEntity)) {
            return false;
        }
        if (this != obj) {
            ItemScopeEntity itemScopeEntity = (ItemScopeEntity) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f82391ae.values()) {
                if (mo7370a(fastJsonResponse$Field)) {
                    if (!itemScopeEntity.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(itemScopeEntity.mo7371b(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (itemScopeEntity.mo7370a(fastJsonResponse$Field)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : f82391ae.values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.f30319g + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17873a(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 36) {
            this.f82401J = d;
        } else if (i == 38) {
            this.f82403L = d;
        } else {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Field with id=");
            sb.append(i);
            sb.append(" is not known to be a double.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f82418a.add(Integer.valueOf(i));
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
        Set set = this.f82418a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f82423b);
        }
        if (set.contains(2)) {
            see.m35040a(parcel, 2, this.f82424c, i, true);
        }
        if (set.contains(3)) {
            see.m35065b(parcel, 3, this.f82425d, true);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f82426e, i, true);
        }
        if (set.contains(5)) {
            see.m35046a(parcel, 5, this.f82427f, true);
        }
        if (set.contains(6)) {
            see.m35046a(parcel, 6, this.f82428g, true);
        }
        if (set.contains(7)) {
            see.m35046a(parcel, 7, this.f82429h, true);
        }
        if (set.contains(8)) {
            see.m35066c(parcel, 8, this.f82430i, true);
        }
        if (set.contains(9)) {
            see.m35063b(parcel, 9, this.f82431j);
        }
        if (set.contains(10)) {
            see.m35066c(parcel, 10, this.f82432k, true);
        }
        if (set.contains(11)) {
            see.m35040a(parcel, 11, this.f82433l, i, true);
        }
        if (set.contains(12)) {
            see.m35066c(parcel, 12, this.f82434m, true);
        }
        if (set.contains(13)) {
            see.m35046a(parcel, 13, this.f82435n, true);
        }
        if (set.contains(14)) {
            see.m35046a(parcel, 14, this.f82436o, true);
        }
        if (set.contains(15)) {
            see.m35040a(parcel, 15, this.f82437p, i, true);
        }
        if (set.contains(16)) {
            see.m35046a(parcel, 16, this.f82438q, true);
        }
        if (set.contains(17)) {
            see.m35046a(parcel, 17, this.f82439r, true);
        }
        if (set.contains(18)) {
            see.m35046a(parcel, 18, this.f82440s, true);
        }
        if (set.contains(19)) {
            see.m35066c(parcel, 19, this.f82441t, true);
        }
        if (set.contains(20)) {
            see.m35046a(parcel, 20, this.f82442u, true);
        }
        if (set.contains(21)) {
            see.m35046a(parcel, 21, this.f82443v, true);
        }
        if (set.contains(22)) {
            see.m35046a(parcel, 22, this.f82444w, true);
        }
        if (set.contains(23)) {
            see.m35046a(parcel, 23, this.f82445x, true);
        }
        if (set.contains(24)) {
            see.m35046a(parcel, 24, this.f82446y, true);
        }
        if (set.contains(25)) {
            see.m35046a(parcel, 25, this.f82447z, true);
        }
        if (set.contains(26)) {
            see.m35046a(parcel, 26, this.f82392A, true);
        }
        if (set.contains(27)) {
            see.m35046a(parcel, 27, this.f82393B, true);
        }
        if (set.contains(28)) {
            see.m35046a(parcel, 28, this.f82394C, true);
        }
        if (set.contains(29)) {
            see.m35040a(parcel, 29, this.f82395D, i, true);
        }
        if (set.contains(30)) {
            see.m35046a(parcel, 30, this.f82396E, true);
        }
        if (set.contains(31)) {
            see.m35046a(parcel, 31, this.f82397F, true);
        }
        if (set.contains(32)) {
            see.m35046a(parcel, 32, this.f82398G, true);
        }
        if (set.contains(33)) {
            see.m35046a(parcel, 33, this.f82399H, true);
        }
        if (set.contains(34)) {
            see.m35040a(parcel, 34, this.f82400I, i, true);
        }
        if (set.contains(36)) {
            see.m35033a(parcel, 36, this.f82401J);
        }
        if (set.contains(37)) {
            see.m35040a(parcel, 37, this.f82402K, i, true);
        }
        if (set.contains(38)) {
            see.m35033a(parcel, 38, this.f82403L);
        }
        if (set.contains(39)) {
            see.m35046a(parcel, 39, this.f82404M, true);
        }
        if (set.contains(40)) {
            see.m35040a(parcel, 40, this.f82405N, i, true);
        }
        if (set.contains(41)) {
            see.m35066c(parcel, 41, this.f82406O, true);
        }
        if (set.contains(42)) {
            see.m35046a(parcel, 42, this.f82407P, true);
        }
        if (set.contains(43)) {
            see.m35046a(parcel, 43, this.f82408Q, true);
        }
        if (set.contains(44)) {
            see.m35046a(parcel, 44, this.f82409R, true);
        }
        if (set.contains(45)) {
            see.m35046a(parcel, 45, this.f82410S, true);
        }
        if (set.contains(46)) {
            see.m35040a(parcel, 46, this.f82411T, i, true);
        }
        if (set.contains(47)) {
            see.m35046a(parcel, 47, this.f82412U, true);
        }
        if (set.contains(48)) {
            see.m35046a(parcel, 48, this.f82413V, true);
        }
        if (set.contains(49)) {
            see.m35046a(parcel, 49, this.f82414W, true);
        }
        if (set.contains(50)) {
            see.m35040a(parcel, 50, this.f82415X, i, true);
        }
        if (set.contains(51)) {
            see.m35046a(parcel, 51, this.f82416Y, true);
        }
        if (set.contains(52)) {
            see.m35046a(parcel, 52, this.f82417Z, true);
        }
        if (set.contains(53)) {
            see.m35046a(parcel, 53, this.f82419aa, true);
        }
        if (set.contains(54)) {
            see.m35046a(parcel, 54, this.f82420ab, true);
        }
        if (set.contains(55)) {
            see.m35046a(parcel, 55, this.f82421ac, true);
        }
        if (set.contains(56)) {
            see.m35046a(parcel, 56, this.f82422ad, true);
        }
        see.m35062b(parcel, a);
    }

    public ItemScopeEntity(Set set, int i, ItemScopeEntity itemScopeEntity, List list, ItemScopeEntity itemScopeEntity2, String str, String str2, String str3, List list2, int i2, List list3, ItemScopeEntity itemScopeEntity3, List list4, String str4, String str5, ItemScopeEntity itemScopeEntity4, String str6, String str7, String str8, List list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ItemScopeEntity itemScopeEntity5, String str18, String str19, String str20, String str21, ItemScopeEntity itemScopeEntity6, double d, ItemScopeEntity itemScopeEntity7, double d2, String str22, ItemScopeEntity itemScopeEntity8, List list6, String str23, String str24, String str25, String str26, ItemScopeEntity itemScopeEntity9, String str27, String str28, String str29, ItemScopeEntity itemScopeEntity10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.f82418a = set;
        this.f82423b = i;
        this.f82424c = itemScopeEntity;
        this.f82425d = list;
        this.f82426e = itemScopeEntity2;
        this.f82427f = str;
        this.f82428g = str2;
        this.f82429h = str3;
        this.f82430i = list2;
        this.f82431j = i2;
        this.f82432k = list3;
        this.f82433l = itemScopeEntity3;
        this.f82434m = list4;
        this.f82435n = str4;
        this.f82436o = str5;
        this.f82437p = itemScopeEntity4;
        this.f82438q = str6;
        this.f82439r = str7;
        this.f82440s = str8;
        this.f82441t = list5;
        this.f82442u = str9;
        this.f82443v = str10;
        this.f82444w = str11;
        this.f82445x = str12;
        this.f82446y = str13;
        this.f82447z = str14;
        this.f82392A = str15;
        this.f82393B = str16;
        this.f82394C = str17;
        this.f82395D = itemScopeEntity5;
        this.f82396E = str18;
        this.f82397F = str19;
        this.f82398G = str20;
        this.f82399H = str21;
        this.f82400I = itemScopeEntity6;
        this.f82401J = d;
        this.f82402K = itemScopeEntity7;
        this.f82403L = d2;
        this.f82404M = str22;
        this.f82405N = itemScopeEntity8;
        this.f82406O = list6;
        this.f82407P = str23;
        this.f82408Q = str24;
        this.f82409R = str25;
        this.f82410S = str26;
        this.f82411T = itemScopeEntity9;
        this.f82412U = str27;
        this.f82413V = str28;
        this.f82414W = str29;
        this.f82415X = itemScopeEntity10;
        this.f82416Y = str30;
        this.f82417Z = str31;
        this.f82419aa = str32;
        this.f82420ab = str33;
        this.f82421ac = str34;
        this.f82422ad = str35;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 9) {
            this.f82431j = i;
            this.f82418a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 3) {
            this.f82425d = arrayList;
            this.f82418a.add(Integer.valueOf(i));
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
    public final void mo7376a(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 5:
                this.f82427f = str2;
                break;
            case 6:
                this.f82428g = str2;
                break;
            case 7:
                this.f82429h = str2;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 19:
            case 29:
            case 34:
            case 35:
            case 36:
            case FelicaException.TYPE_NOT_CLOSED:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
            case FelicaException.TYPE_PUSH_FAILED:
            case 41:
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
            case 50:
            default:
                StringBuilder sb = new StringBuilder(54);
                sb.append("Field with id=");
                sb.append(i);
                sb.append(" is not known to be a String.");
                throw new IllegalArgumentException(sb.toString());
            case 13:
                this.f82435n = str2;
                break;
            case 14:
                this.f82436o = str2;
                break;
            case 16:
                this.f82438q = str2;
                break;
            case 17:
                this.f82439r = str2;
                break;
            case 18:
                this.f82440s = str2;
                break;
            case 20:
                this.f82442u = str2;
                break;
            case 21:
                this.f82443v = str2;
                break;
            case 22:
                this.f82444w = str2;
                break;
            case 23:
                this.f82445x = str2;
                break;
            case 24:
                this.f82446y = str2;
                break;
            case 25:
                this.f82447z = str2;
                break;
            case 26:
                this.f82392A = str2;
                break;
            case 27:
                this.f82393B = str2;
                break;
            case 28:
                this.f82394C = str2;
                break;
            case 30:
                this.f82396E = str2;
                break;
            case 31:
                this.f82397F = str2;
                break;
            case 32:
                this.f82398G = str2;
                break;
            case 33:
                this.f82399H = str2;
                break;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                this.f82404M = str2;
                break;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                this.f82407P = str2;
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                this.f82408Q = str2;
                break;
            case FelicaException.TYPE_RESET_FAILED:
                this.f82409R = str2;
                break;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                this.f82410S = str2;
                break;
            case 47:
                this.f82412U = str2;
                break;
            case 48:
                this.f82413V = str2;
                break;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                this.f82414W = str2;
                break;
            case 51:
                this.f82416Y = str2;
                break;
            case 52:
                this.f82417Z = str2;
                break;
            case 53:
                this.f82419aa = str2;
                break;
            case 54:
                this.f82420ab = str2;
                break;
            case 55:
                this.f82421ac = str2;
                break;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                this.f82422ad = str2;
                break;
        }
        this.f82418a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 8) {
            this.f82430i = arrayList;
        } else if (i == 10) {
            this.f82432k = arrayList;
        } else if (i == 12) {
            this.f82434m = arrayList;
        } else if (i == 19) {
            this.f82441t = arrayList;
        } else if (i == 41) {
            this.f82406O = arrayList;
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
        this.f82418a.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f82424c = (ItemScopeEntity) sio;
        } else if (i == 4) {
            this.f82426e = (ItemScopeEntity) sio;
        } else if (i == 11) {
            this.f82433l = (ItemScopeEntity) sio;
        } else if (i == 15) {
            this.f82437p = (ItemScopeEntity) sio;
        } else if (i == 29) {
            this.f82395D = (ItemScopeEntity) sio;
        } else if (i == 34) {
            this.f82400I = (ItemScopeEntity) sio;
        } else if (i == 37) {
            this.f82402K = (ItemScopeEntity) sio;
        } else if (i == 40) {
            this.f82405N = (ItemScopeEntity) sio;
        } else if (i == 46) {
            this.f82411T = (ItemScopeEntity) sio;
        } else if (i == 50) {
            this.f82415X = (ItemScopeEntity) sio;
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
        this.f82418a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f82418a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
