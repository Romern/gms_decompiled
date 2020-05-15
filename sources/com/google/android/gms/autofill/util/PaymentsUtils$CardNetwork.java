package com.google.android.gms.autofill.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class PaymentsUtils$CardNetwork implements Parcelable {
    public static final Parcelable.Creator CREATOR = new lqz();

    /* renamed from: a */
    public static PaymentsUtils$CardNetwork m7183a(int i, String str) {
        return new AutoValue_PaymentsUtils_CardNetwork(i, str);
    }

    /* renamed from: a */
    public abstract int mo7997a();

    /* renamed from: b */
    public abstract String mo7998b();

    /* renamed from: c */
    public Pattern mo8002c() {
        try {
            return Pattern.compile(String.valueOf(mo7998b()).concat(".*"));
        } catch (PatternSyntaxException e) {
            return null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo7997a());
        parcel.writeString(mo7998b());
    }
}
