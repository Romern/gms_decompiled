package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.Role;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecureChannelSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new jqg();

    /* renamed from: a */
    public final PendingIntent f11178a;

    /* renamed from: b */
    public final String f11179b;

    /* renamed from: c */
    public final int f11180c;

    /* renamed from: d */
    public final List f11181d;

    /* renamed from: e */
    public final String f11182e;

    public SecureChannelSubscription(PendingIntent pendingIntent, String str, int i, List list, String str2) {
        sdo.m34959a(pendingIntent);
        this.f11178a = pendingIntent;
        sdo.m34959a((Object) str);
        this.f11179b = str;
        sdo.m34974b(!str.isEmpty());
        sdo.m34974b(Role.m6770a(i));
        this.f11180c = i;
        sdo.m34959a(list);
        this.f11181d = list;
        sdo.m34974b(!list.isEmpty());
        sdo.m34959a((Object) str2);
        this.f11182e = str2;
        sdo.m34974b(!str2.isEmpty());
    }

    /* renamed from: a */
    public final PendingIntent mo7801a() {
        return this.f11178a;
    }

    /* renamed from: b */
    public final List mo7802b() {
        ArrayList arrayList = new ArrayList();
        List list = this.f11181d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                JSONObject jSONObject = new JSONObject((String) list.get(i));
                String string = jSONObject.getString("i");
                jnd jnd = new jnd();
                jnd.f22866d = sqd.m35969b(string);
                jnd.f22863a = string;
                jnd.f22864b = jSONObject.getString("n");
                jnd.f22865c = jSONObject.getString("a");
                jnd.f22867e = jSONObject.getString("t");
                arrayList.add(jnd.mo13895a());
            } catch (JSONException e) {
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo7803c() {
        return this.f11182e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SecureChannelSubscription secureChannelSubscription = (SecureChannelSubscription) obj;
            return this.f11178a.equals(secureChannelSubscription.f11178a) && this.f11179b.equals(secureChannelSubscription.f11179b) && this.f11180c == secureChannelSubscription.f11180c && this.f11181d.equals(secureChannelSubscription.f11181d) && this.f11182e.equals(secureChannelSubscription.f11182e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11178a, this.f11179b, Integer.valueOf(this.f11180c), this.f11181d, this.f11182e});
    }

    public final String toString() {
        return String.format(Locale.US, "SecureChannelSubscription{mCallbackIntent=%s, mFeatureName=%s, mConnectionMode=%d, mSerializedDevices=%s, mPackageName=%s}", this.f11178a, this.f11179b, Integer.valueOf(this.f11180c), this.f11181d, this.f11182e);
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
        see.m35040a(parcel, 1, this.f11178a, i, false);
        see.m35046a(parcel, 2, this.f11179b, false);
        see.m35063b(parcel, 3, this.f11180c);
        see.m35065b(parcel, 4, this.f11181d, false);
        see.m35046a(parcel, 5, this.f11182e, false);
        see.m35062b(parcel, a);
    }
}
