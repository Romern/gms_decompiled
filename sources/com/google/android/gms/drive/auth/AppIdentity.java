package com.google.android.gms.drive.auth;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppIdentity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uer();

    /* renamed from: a */
    public static final AppIdentity f30763a = new AppIdentity("com.google.android.gms", true, "");

    /* renamed from: b */
    public final String f30764b;

    /* renamed from: c */
    public final String f30765c;

    /* renamed from: d */
    private final boolean f30766d;

    private AppIdentity(String str, boolean z, String str2) {
        sdo.m34959a((Object) str);
        this.f30764b = str;
        this.f30766d = z;
        String str3 = "";
        if (!z && !str3.equals(str2)) {
            str3 = vpc.m40994a(str2, 40);
        }
        this.f30765c = str3;
    }

    /* renamed from: a */
    public static AppIdentity m22942a(String str, String str2) {
        return new AppIdentity(str, false, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            AppIdentity appIdentity = (AppIdentity) obj;
            return this.f30764b.equals(appIdentity.f30764b) && this.f30765c.equals(appIdentity.f30765c);
        }
    }

    public final int hashCode() {
        return (this.f30765c.hashCode() * 31) + this.f30764b.hashCode();
    }

    public final String toString() {
        String str = this.f30764b;
        String str2 = this.f30765c;
        StringBuilder sb = new StringBuilder(str.length() + 33 + String.valueOf(str2).length());
        sb.append("AppIdentity [packageName=");
        sb.append(str);
        sb.append(", hash=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f30766d ? (byte) 1 : 0);
        if (!this.f30766d) {
            parcel.writeString(this.f30764b);
            parcel.writeString(this.f30765c);
        }
    }

    /* renamed from: a */
    public static AppIdentity m22943a(JSONObject jSONObject) {
        return !jSONObject.getBoolean("isSuperuser") ? m22942a(jSONObject.getString("packageName"), jSONObject.getString("hash")) : f30763a;
    }

    /* renamed from: a */
    public final JSONObject mo18134a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isSuperuser", this.f30766d);
        if (!this.f30766d) {
            jSONObject.put("packageName", this.f30764b);
            jSONObject.put("hash", this.f30765c);
        }
        return jSONObject;
    }
}
