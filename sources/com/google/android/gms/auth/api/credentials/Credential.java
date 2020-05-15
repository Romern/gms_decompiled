package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gvm();

    /* renamed from: a */
    public final String f10092a;

    /* renamed from: b */
    public final String f10093b;

    /* renamed from: c */
    public final Uri f10094c;

    /* renamed from: d */
    public final List f10095d;

    /* renamed from: e */
    public final String f10096e;

    /* renamed from: f */
    public final String f10097f;

    /* renamed from: g */
    public final String f10098g;

    /* renamed from: h */
    public final String f10099h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List list2;
        Boolean bool;
        sdo.checkIfNull((Object) str, (Object) "credential identifier cannot be null");
        String trim = str.trim();
        sdo.m34969a(trim, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (TextUtils.isEmpty(str4)) {
                    bool = false;
                } else {
                    Uri parse = Uri.parse(str4);
                    if (!parse.isAbsolute() || !parse.isHierarchical() || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority())) {
                        bool = false;
                    } else {
                        if ("http".equalsIgnoreCase(parse.getScheme())) {
                            z = true;
                        } else if ("https".equalsIgnoreCase(parse.getScheme())) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                if (!bool.booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f10093b = str2;
                this.f10094c = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f10095d = list2;
                this.f10092a = trim;
                this.f10096e = str3;
                this.f10097f = str4;
                this.f10098g = str5;
                this.f10099h = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    /* renamed from: a */
    public final int mo7403a() {
        int i = !bmxx.m108577a(this.f10093b) ? 2 : 1;
        if (this.f10094c != null) {
            i++;
        }
        if (!bmxx.m108577a(this.f10098g)) {
            i++;
        }
        return !bmxx.m108577a(this.f10099h) ? i + 1 : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Credential) {
            Credential credential = (Credential) obj;
            return TextUtils.equals(this.f10092a, credential.f10092a) && TextUtils.equals(this.f10093b, credential.f10093b) && sdg.m34949a(this.f10094c, credential.f10094c) && TextUtils.equals(this.f10096e, credential.f10096e) && TextUtils.equals(this.f10097f, credential.f10097f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10092a, this.f10093b, this.f10094c, this.f10096e, this.f10097f});
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
        see.m35046a(parcel, 1, this.f10092a, false);
        see.m35046a(parcel, 2, this.f10093b, false);
        see.m35040a(parcel, 3, this.f10094c, i, false);
        see.m35066c(parcel, 4, this.f10095d, false);
        see.m35046a(parcel, 5, this.f10096e, false);
        see.m35046a(parcel, 6, this.f10097f, false);
        see.m35046a(parcel, 9, this.f10098g, false);
        see.m35046a(parcel, 10, this.f10099h, false);
        see.m35062b(parcel, a);
    }
}
