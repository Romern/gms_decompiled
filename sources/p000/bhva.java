package p000;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: bhva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhva {

    /* renamed from: a */
    private TimeZone f119677a;

    /* renamed from: b */
    private Locale f119678b;

    /* renamed from: c */
    private Calendar f119679c;

    /* renamed from: a */
    public final Calendar mo64341a() {
        Locale locale = Locale.getDefault();
        TimeZone timeZone = TimeZone.getDefault();
        if (this.f119679c == null || !locale.equals(this.f119678b) || !timeZone.equals(this.f119677a)) {
            this.f119677a = timeZone;
            this.f119678b = locale;
            Calendar instance = Calendar.getInstance(timeZone, locale);
            this.f119679c = instance;
            instance.setLenient(false);
        }
        this.f119679c.clear();
        return this.f119679c;
    }
}
