package p000;

import android.util.Log;

/* renamed from: blvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blvt {

    /* renamed from: a */
    static final blvt f127894a = new blvt("BleSocket");

    /* renamed from: c */
    public static final /* synthetic */ int f127895c = 0;

    /* renamed from: b */
    public final String f127896b;

    private blvt(String str) {
        this.f127896b = str;
    }

    /* renamed from: a */
    public final void mo66761a(String str) {
        if (Log.isLoggable(this.f127896b, 5)) {
            Log.w(this.f127896b, str);
        }
    }

    /* renamed from: a */
    public final void mo66762a(String str, Object... objArr) {
        if (Log.isLoggable(this.f127896b, 5)) {
            Log.w(this.f127896b, String.format(str, objArr));
        }
    }
}
