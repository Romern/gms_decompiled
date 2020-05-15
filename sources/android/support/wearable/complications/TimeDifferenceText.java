package android.support.wearable.complications;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TimeDifferenceText implements TimeDependentText {
    public static final Parcelable.Creator CREATOR = new aer();

    /* renamed from: a */
    public final long f1376a;

    /* renamed from: b */
    public final long f1377b;

    /* renamed from: c */
    public final int f1378c;

    /* renamed from: d */
    public final boolean f1379d;

    /* renamed from: e */
    public final TimeUnit f1380e;

    public TimeDifferenceText(long j, long j2, int i, boolean z, TimeUnit timeUnit) {
        this.f1376a = j;
        this.f1377b = j2;
        this.f1378c = i;
        this.f1379d = z;
        this.f1380e = timeUnit;
    }

    /* renamed from: a */
    private final long m1420a(long j) {
        long j2 = this.f1376a;
        if (j < j2) {
            return j2 - j;
        }
        long j3 = this.f1377b;
        if (j <= j3) {
            return 0;
        }
        return j - j3;
    }

    /* renamed from: b */
    private static int m1425b(long j) {
        return m1426b(j, TimeUnit.DAYS);
    }

    /* renamed from: c */
    private static int m1430c(long j) {
        return m1426b(j, TimeUnit.HOURS);
    }

    /* renamed from: d */
    private static int m1433d(long j) {
        return m1426b(j, TimeUnit.MINUTES);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeLong(this.f1376a);
        parcel.writeLong(this.f1377b);
        parcel.writeInt(this.f1378c);
        parcel.writeByte(this.f1379d ? (byte) 1 : 0);
        TimeUnit timeUnit = this.f1380e;
        if (timeUnit != null) {
            i2 = timeUnit.ordinal();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
    }

    public TimeDifferenceText(Parcel parcel) {
        boolean z;
        this.f1376a = parcel.readLong();
        this.f1377b = parcel.readLong();
        this.f1378c = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1379d = z;
        int readInt = parcel.readInt();
        this.f1380e = readInt != -1 ? TimeUnit.values()[readInt] : null;
    }

    /* renamed from: a */
    private static long m1421a(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(1);
        return m1427b(j, millis) * millis;
    }

    /* renamed from: b */
    private static int m1426b(long j, TimeUnit timeUnit) {
        long millis = j / timeUnit.toMillis(1);
        int i = aes.f351a[timeUnit.ordinal()];
        int i2 = 60;
        if (i == 1) {
            i2 = 1000;
        } else if (!(i == 2 || i == 3)) {
            if (i == 4) {
                i2 = 24;
            } else if (i == 5) {
                i2 = Integer.MAX_VALUE;
            } else {
                String valueOf = String.valueOf(timeUnit);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("Unit not supported: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (int) (millis % ((long) i2));
    }

    /* renamed from: c */
    private static String m1431c(int i, Resources resources) {
        return resources.getQuantityString(C0126R.plurals.time_difference_short_minutes, i, Integer.valueOf(i));
    }

    /* renamed from: a */
    private static String m1422a(int i, Resources resources) {
        return resources.getQuantityString(C0126R.plurals.time_difference_short_days, i, Integer.valueOf(i));
    }

    /* renamed from: c */
    private final String m1432c(long j, Resources resources) {
        long a = m1421a(j, TimeUnit.HOURS);
        if (m1424a(this.f1380e, TimeUnit.DAYS) || m1425b(a) > 0) {
            int b = m1425b(m1421a(j, TimeUnit.DAYS));
            return resources.getQuantityString(C0126R.plurals.time_difference_words_days, b, Integer.valueOf(b));
        }
        long a2 = m1421a(j, TimeUnit.MINUTES);
        if (m1424a(this.f1380e, TimeUnit.HOURS) || m1430c(a2) > 0) {
            int c = m1430c(a);
            return resources.getQuantityString(C0126R.plurals.time_difference_words_hours, c, Integer.valueOf(c));
        }
        int d = m1433d(a2);
        return resources.getQuantityString(C0126R.plurals.time_difference_words_minutes, d, Integer.valueOf(d));
    }

    /* renamed from: a */
    private final String m1423a(long j, Resources resources) {
        long a = m1421a(j, TimeUnit.HOURS);
        if (m1424a(this.f1380e, TimeUnit.DAYS) || m1425b(a) > 0) {
            return m1422a(m1425b(m1421a(j, TimeUnit.DAYS)), resources);
        }
        long a2 = m1421a(j, TimeUnit.MINUTES);
        if (m1424a(this.f1380e, TimeUnit.HOURS) || m1430c(a2) > 0) {
            return m1428b(m1430c(a), resources);
        }
        return m1431c(m1433d(a2), resources);
    }

    /* renamed from: b */
    private static long m1427b(long j, long j2) {
        return (j / j2) + ((long) (j % j2 == 0 ? 0 : 1));
    }

    /* renamed from: b */
    private static String m1428b(int i, Resources resources) {
        return resources.getQuantityString(C0126R.plurals.time_difference_short_hours, i, Integer.valueOf(i));
    }

    /* renamed from: b */
    private final String m1429b(long j, Resources resources) {
        long a = m1421a(j, TimeUnit.HOURS);
        if (m1424a(this.f1380e, TimeUnit.DAYS) || m1425b(a) >= 10) {
            return m1422a(m1425b(m1421a(j, TimeUnit.DAYS)), resources);
        }
        long a2 = m1421a(j, TimeUnit.MINUTES);
        if (m1425b(a2) > 0) {
            int c = m1430c(a);
            if (c <= 0) {
                return m1422a(m1425b(a), resources);
            }
            return resources.getString(C0126R.string.time_difference_short_days_and_hours, m1422a(m1425b(a), resources), m1428b(c, resources));
        } else if (m1424a(this.f1380e, TimeUnit.HOURS)) {
            return m1428b(m1430c(a), resources);
        } else {
            int c2 = m1430c(a2);
            int d = m1433d(a2);
            if (c2 <= 0) {
                return m1431c(m1433d(a2), resources);
            }
            if (d <= 0) {
                return m1428b(c2, resources);
            }
            return resources.getString(C0126R.string.time_difference_short_hours_and_minutes, m1428b(c2, resources), m1431c(d, resources));
        }
    }

    /* renamed from: a */
    private static boolean m1424a(TimeUnit timeUnit, TimeUnit timeUnit2) {
        return timeUnit != null && timeUnit.toMillis(1) >= timeUnit2.toMillis(1);
    }

    /* renamed from: a */
    public final CharSequence mo1734a(Context context, long j) {
        Resources resources = context.getResources();
        long a = m1420a(j);
        if (a == 0 && this.f1379d) {
            return resources.getString(C0126R.string.time_difference_now);
        }
        int i = this.f1378c;
        if (i != 1) {
            if (i == 2) {
                return m1423a(a, resources);
            }
            if (i == 3) {
                String b = m1429b(a, resources);
                return b.length() > 7 ? m1423a(a, resources) : b;
            } else if (i == 4) {
                return m1432c(a, resources);
            } else {
                if (i != 5) {
                    return m1423a(a, resources);
                }
                String c = m1432c(a, resources);
                return c.length() > 7 ? m1423a(a, resources) : c;
            }
        } else if (m1424a(this.f1380e, TimeUnit.DAYS)) {
            return m1422a(m1425b(m1421a(a, TimeUnit.DAYS)), resources);
        } else {
            long a2 = m1421a(a, TimeUnit.MINUTES);
            if (m1424a(this.f1380e, TimeUnit.HOURS) || m1425b(a2) > 0) {
                return m1429b(a, resources);
            }
            long a3 = m1421a(a, TimeUnit.SECONDS);
            if (m1424a(this.f1380e, TimeUnit.MINUTES) || m1430c(a3) > 0) {
                return String.format(Locale.US, "%d:%02d", Integer.valueOf(m1430c(a2)), Integer.valueOf(m1433d(a2)));
            }
            return String.format(Locale.US, "%02d:%02d", Integer.valueOf(m1433d(a3)), Integer.valueOf(m1426b(a3, TimeUnit.SECONDS)));
        }
    }

    /* renamed from: a */
    public final boolean mo1735a(long j, long j2) {
        long j3;
        if (this.f1378c != 1) {
            j3 = TimeUnit.MINUTES.toMillis(1);
        } else {
            j3 = TimeUnit.SECONDS.toMillis(1);
        }
        TimeUnit timeUnit = this.f1380e;
        if (timeUnit != null) {
            j3 = Math.max(j3, timeUnit.toMillis(1));
        }
        if (m1427b(m1420a(j), j3) == m1427b(m1420a(j2), j3)) {
            return true;
        }
        return false;
    }
}
