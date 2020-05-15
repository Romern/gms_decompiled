package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: vpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpx {

    /* renamed from: a */
    public final SimpleDateFormat f49780a;

    /* renamed from: b */
    public final Object f49781b;

    public vpx(String str, Locale locale) {
        Object obj = new Object();
        this.f49781b = obj;
        synchronized (obj) {
            this.f49780a = new SimpleDateFormat(str, locale);
        }
    }

    /* renamed from: a */
    public final String mo28731a(Date date) {
        String format;
        synchronized (this.f49781b) {
            format = this.f49780a.format(date);
        }
        return format;
    }

    public final boolean equals(Object obj) {
        boolean z;
        synchronized (this.f49781b) {
            z = false;
            if (obj != null) {
                try {
                    if (obj.getClass() == getClass() && ((vpx) obj).f49780a.equals(this.f49780a)) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f49781b) {
            hashCode = this.f49780a.hashCode();
        }
        return hashCode;
    }

    public final String toString() {
        String obj;
        synchronized (this.f49781b) {
            obj = this.f49780a.toString();
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo28732a(TimeZone timeZone) {
        synchronized (this.f49781b) {
            this.f49780a.setTimeZone(timeZone);
        }
    }
}
