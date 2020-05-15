package android.support.wearable.complications;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ComplicationText implements Parcelable, TimeDependentText {
    public static final Parcelable.Creator CREATOR = new aeq();

    /* renamed from: a */
    private final CharSequence f1371a;

    /* renamed from: b */
    private final TimeDependentText f1372b;

    /* renamed from: c */
    private final CharSequence[] f1373c = {"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};

    /* renamed from: d */
    private long f1374d;

    /* renamed from: e */
    private CharSequence f1375e;

    public ComplicationText(Parcel parcel) {
        TimeUnit timeUnit;
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f1371a = readBundle.getCharSequence("surrounding_string");
        TimeZone timeZone = null;
        if (readBundle.containsKey("difference_style") && readBundle.containsKey("difference_period_start") && readBundle.containsKey("difference_period_end")) {
            long j = readBundle.getLong("difference_period_start");
            long j2 = readBundle.getLong("difference_period_end");
            int i = readBundle.getInt("difference_style");
            boolean z = readBundle.getBoolean("show_now_text", true);
            String string = readBundle.getString("minimum_unit");
            if (string != null) {
                try {
                    timeUnit = TimeUnit.valueOf(string);
                } catch (IllegalArgumentException e) {
                }
                this.f1372b = new TimeDifferenceText(j, j2, i, z, timeUnit);
            }
            timeUnit = null;
            this.f1372b = new TimeDifferenceText(j, j2, i, z, timeUnit);
        } else if (!readBundle.containsKey("format_format_string") || !readBundle.containsKey("format_style")) {
            this.f1372b = null;
        } else {
            this.f1372b = new TimeFormatText(readBundle.getString("format_format_string"), readBundle.getInt("format_style"), readBundle.containsKey("format_time_zone") ? TimeZone.getTimeZone(readBundle.getString("format_time_zone")) : timeZone);
        }
        m1415a();
    }

    /* renamed from: a */
    private final void m1415a() {
        if (this.f1371a == null && this.f1372b == null) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("surrounding_string", this.f1371a);
        TimeDependentText timeDependentText = this.f1372b;
        if (timeDependentText instanceof TimeDifferenceText) {
            TimeDifferenceText timeDifferenceText = (TimeDifferenceText) timeDependentText;
            bundle.putLong("difference_period_start", timeDifferenceText.f1376a);
            bundle.putLong("difference_period_end", timeDifferenceText.f1377b);
            bundle.putInt("difference_style", timeDifferenceText.f1378c);
            bundle.putBoolean("show_now_text", timeDifferenceText.f1379d);
            TimeUnit timeUnit = timeDifferenceText.f1380e;
            if (timeUnit != null) {
                bundle.putString("minimum_unit", timeUnit.name());
            }
        } else if (timeDependentText instanceof TimeFormatText) {
            TimeFormatText timeFormatText = (TimeFormatText) timeDependentText;
            bundle.putString("format_format_string", timeFormatText.f1383a.toPattern());
            bundle.putInt("format_style", timeFormatText.f1384b);
            TimeZone timeZone = timeFormatText.f1385c;
            if (timeZone != null) {
                bundle.putString("format_time_zone", timeZone.getID());
            }
        }
        parcel.writeBundle(bundle);
    }

    /* renamed from: a */
    public final CharSequence mo1734a(Context context, long j) {
        CharSequence charSequence;
        TimeDependentText timeDependentText = this.f1372b;
        if (timeDependentText == null) {
            return this.f1371a;
        }
        if (this.f1375e != null && timeDependentText.mo1735a(this.f1374d, j)) {
            charSequence = this.f1375e;
        } else {
            charSequence = this.f1372b.mo1734a(context, j);
            this.f1374d = j;
            this.f1375e = charSequence;
        }
        CharSequence charSequence2 = this.f1371a;
        if (charSequence2 == null) {
            return charSequence;
        }
        CharSequence[] charSequenceArr = this.f1373c;
        charSequenceArr[0] = charSequence;
        return TextUtils.expandTemplate(charSequence2, charSequenceArr);
    }

    /* renamed from: a */
    public final boolean mo1735a(long j, long j2) {
        TimeDependentText timeDependentText = this.f1372b;
        if (timeDependentText != null) {
            return timeDependentText.mo1735a(j, j2);
        }
        return true;
    }

    public ComplicationText(CharSequence charSequence) {
        this.f1371a = charSequence;
        this.f1372b = null;
        m1415a();
    }
}
