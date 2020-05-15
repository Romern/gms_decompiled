package android.support.wearable.complications;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeFormatText implements TimeDependentText {
    public static final Parcelable.Creator CREATOR = new aet();

    /* renamed from: d */
    private static final String[][] f1381d = {new String[]{"S", "s"}, new String[]{"m"}, new String[]{"H", "K", "h", "k", "j", "J", "C"}, new String[]{"a", "b", "B"}};

    /* renamed from: e */
    private static final long[] f1382e = {TimeUnit.SECONDS.toMillis(1), TimeUnit.MINUTES.toMillis(1), TimeUnit.HOURS.toMillis(1), TimeUnit.HOURS.toMillis(12)};

    /* renamed from: a */
    public final SimpleDateFormat f1383a;

    /* renamed from: b */
    public final int f1384b;

    /* renamed from: c */
    public final TimeZone f1385c;

    /* renamed from: f */
    private final Date f1386f;

    /* renamed from: g */
    private long f1387g;

    public TimeFormatText(Parcel parcel) {
        this.f1383a = (SimpleDateFormat) parcel.readSerializable();
        this.f1384b = parcel.readInt();
        this.f1385c = (TimeZone) parcel.readSerializable();
        this.f1387g = -1;
        this.f1386f = new Date();
    }

    /* renamed from: a */
    private final long m1436a(long j) {
        this.f1386f.setTime(j);
        if (this.f1385c.inDaylightTime(this.f1386f)) {
            return ((long) this.f1385c.getRawOffset()) + ((long) this.f1385c.getDSTSavings());
        }
        return (long) this.f1385c.getRawOffset();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f1383a);
        parcel.writeInt(this.f1384b);
        parcel.writeSerializable(this.f1385c);
    }

    public TimeFormatText(String str, int i, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.f1383a = simpleDateFormat;
        this.f1384b = i;
        this.f1387g = -1;
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
            this.f1385c = timeZone;
        } else {
            this.f1385c = simpleDateFormat.getTimeZone();
        }
        this.f1386f = new Date();
    }

    /* renamed from: a */
    public final CharSequence mo1734a(Context context, long j) {
        String format = this.f1383a.format(new Date(j));
        int i = this.f1384b;
        if (i == 2) {
            return format.toUpperCase();
        }
        if (i != 3) {
            return format;
        }
        return format.toLowerCase();
    }

    /* renamed from: a */
    public final boolean mo1735a(long j, long j2) {
        long j3 = this.f1387g;
        if (j3 == -1) {
            String pattern = this.f1383a.toPattern();
            String str = "";
            int i = 0;
            boolean z = false;
            while (i < pattern.length()) {
                if (pattern.charAt(i) == '\'') {
                    int i2 = i + 1;
                    if (i2 >= pattern.length() || pattern.charAt(i2) != '\'') {
                        i = i2;
                        z = !z;
                    } else {
                        i += 2;
                    }
                } else {
                    if (!z) {
                        String valueOf = String.valueOf(str);
                        char charAt = pattern.charAt(i);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
                        sb.append(valueOf);
                        sb.append(charAt);
                        str = sb.toString();
                    }
                    i++;
                }
            }
            for (int i3 = 0; i3 < f1381d.length && this.f1387g == -1; i3++) {
                int i4 = 0;
                while (true) {
                    String[][] strArr = f1381d;
                    if (i4 < strArr[i3].length) {
                        if (str.contains(strArr[i3][i4])) {
                            this.f1387g = f1382e[i3];
                            break;
                        }
                        i4++;
                    } else {
                        break;
                    }
                }
            }
            j3 = this.f1387g;
            if (j3 == -1) {
                j3 = TimeUnit.DAYS.toMillis(1);
                this.f1387g = j3;
            }
        }
        return (j + m1436a(j)) / j3 == (j2 + m1436a(j2)) / j3;
    }
}
