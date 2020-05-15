package p000;

import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: uhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uhb extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        return gregorianCalendar;
    }
}
