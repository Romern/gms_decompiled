package com.google.android.gms.feedback;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wyn();

    /* renamed from: a */
    public int f31623a;

    /* renamed from: b */
    public int f31624b;

    public ThemeSettings() {
        this(3, 0);
    }

    public ThemeSettings(int i, int i2) {
        this.f31623a = i;
        this.f31624b = i2;
    }

    /* renamed from: a */
    public static int m23410a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return m23411a(context, "android:colorPrimary");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 2, this.f31623a);
        see.m35063b(parcel, 3, this.f31624b);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static int m23411a(Context context, String str) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{context.getResources().getIdentifier(str, "attr", context.getPackageName())});
        try {
            i = obtainStyledAttributes.getColor(0, 0);
        } catch (Exception e) {
            String valueOf = String.valueOf(context);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + str.length());
            sb.append("Could not get theme color for [context: ");
            sb.append(valueOf);
            sb.append(", attr: ");
            sb.append(str);
            Log.w("ThemeSettings", sb.toString());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
        return i;
    }
}
