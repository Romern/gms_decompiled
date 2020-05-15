package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new hvi();

    /* renamed from: a */
    public final PendingIntent f10239a;

    /* renamed from: b */
    public final String f10240b;

    /* renamed from: c */
    public final String f10241c;

    /* renamed from: d */
    public final List f10242d;

    /* renamed from: e */
    public final String f10243e;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3) {
        this.f10239a = pendingIntent;
        this.f10240b = str;
        this.f10241c = str2;
        this.f10242d = list;
        this.f10243e = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SaveAccountLinkingTokenRequest) {
            SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
            if (this.f10242d.size() != saveAccountLinkingTokenRequest.f10242d.size() || !this.f10242d.containsAll(saveAccountLinkingTokenRequest.f10242d) || !sdg.m34949a(this.f10239a, saveAccountLinkingTokenRequest.f10239a) || !sdg.m34949a(this.f10240b, saveAccountLinkingTokenRequest.f10240b) || !sdg.m34949a(this.f10241c, saveAccountLinkingTokenRequest.f10241c) || !sdg.m34949a(this.f10243e, saveAccountLinkingTokenRequest.f10243e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10239a, this.f10240b, this.f10241c, this.f10242d, this.f10243e});
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
        see.m35040a(parcel, 1, this.f10239a, i, false);
        see.m35046a(parcel, 2, this.f10240b, false);
        see.m35046a(parcel, 3, this.f10241c, false);
        see.m35065b(parcel, 4, this.f10242d, false);
        see.m35046a(parcel, 5, this.f10243e, false);
        see.m35062b(parcel, a);
    }
}
