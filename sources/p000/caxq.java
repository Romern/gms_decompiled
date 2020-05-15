package p000;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: caxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caxq extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(caxr.f176347a);
        return simpleDateFormat;
    }
}
