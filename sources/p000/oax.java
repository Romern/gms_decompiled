package p000;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: oax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oax extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
