package android.support.wearable.complications;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ComplicationData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aen();

    /* renamed from: a */
    public static final String[][] f1367a = {null, new String[0], new String[0], new String[]{"SHORT_TEXT"}, new String[]{"LONG_TEXT"}, new String[]{"VALUE", "MIN_VALUE", "MAX_VALUE"}, new String[]{"ICON"}, new String[]{"SMALL_IMAGE", "IMAGE_STYLE"}, new String[]{"LARGE_IMAGE"}, new String[0], new String[0]};

    /* renamed from: d */
    private static final String[][] f1368d = {null, new String[0], new String[0], new String[]{"SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"LONG_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "SMALL_IMAGE", "SMALL_IMAGE_BURN_IN_PROTECTION", "IMAGE_STYLE", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "SMALL_IMAGE_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[0]};

    /* renamed from: b */
    public final int f1369b;

    /* renamed from: c */
    public final Bundle f1370c;

    public ComplicationData(aeo aeo) {
        this.f1369b = aeo.f346a;
        this.f1370c = aeo.f347b;
    }

    /* renamed from: a */
    public static void m1402a(String str, int i) {
        if (!m1403a(i)) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Type ");
            sb.append(i);
            sb.append(" can not be recognized");
            Log.w("ComplicationData", sb.toString());
            return;
        }
        m1405c(str, i);
    }

    /* renamed from: a */
    private static boolean m1403a(int i) {
        return i > 0 && i <= f1367a.length;
    }

    /* renamed from: b */
    public static void m1404b(String str, int i) {
        if (!m1403a(i)) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Type ");
            sb.append(i);
            sb.append(" can not be recognized");
            throw new IllegalStateException(sb.toString());
        } else if (!m1405c(str, i)) {
            StringBuilder sb2 = new StringBuilder(str.length() + 44);
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" is not supported for type ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: c */
    private static boolean m1405c(String str, int i) {
        for (String str2 : f1367a[i]) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : f1368d[i]) {
            if (str3.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final ComplicationText mo1726d() {
        m1402a("LONG_TEXT", this.f1369b);
        return (ComplicationText) mo1722a("LONG_TEXT");
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Icon mo1728e() {
        m1402a("ICON", this.f1369b);
        return (Icon) mo1722a("ICON");
    }

    /* renamed from: f */
    public final Icon mo1729f() {
        m1402a("SMALL_IMAGE", this.f1369b);
        return (Icon) mo1722a("SMALL_IMAGE");
    }

    /* renamed from: g */
    public final int mo1730g() {
        m1402a("IMAGE_STYLE", this.f1369b);
        return this.f1370c.getInt("IMAGE_STYLE");
    }

    /* renamed from: h */
    public final PendingIntent mo1731h() {
        m1402a("TAP_ACTION", this.f1369b);
        return (PendingIntent) mo1722a("TAP_ACTION");
    }

    public final String toString() {
        int i = this.f1369b;
        String valueOf = String.valueOf(this.f1370c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("ComplicationData{mType=");
        sb.append(i);
        sb.append(", mFields=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1369b);
        parcel.writeBundle(this.f1370c);
    }

    public ComplicationData(Parcel parcel) {
        this.f1369b = parcel.readInt();
        this.f1370c = parcel.readBundle(getClass().getClassLoader());
    }

    /* renamed from: b */
    public final ComplicationText mo1724b() {
        m1402a("SHORT_TEXT", this.f1369b);
        return (ComplicationText) mo1722a("SHORT_TEXT");
    }

    /* renamed from: c */
    public final ComplicationText mo1725c() {
        m1402a("LONG_TITLE", this.f1369b);
        return (ComplicationText) mo1722a("LONG_TITLE");
    }

    /* renamed from: a */
    public final Parcelable mo1722a(String str) {
        try {
            return this.f1370c.getParcelable(str);
        } catch (BadParcelableException e) {
            Log.w("ComplicationData", "Could not unparcel ComplicationData. Provider apps must exclude wearable support complication classes from proguard.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final ComplicationText mo1723a() {
        m1402a("SHORT_TITLE", this.f1369b);
        return (ComplicationText) mo1722a("SHORT_TITLE");
    }
}
