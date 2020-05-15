package p000;

import android.util.Log;

/* renamed from: bdrf */
final /* synthetic */ class bdrf implements bmxj {

    /* renamed from: a */
    private final String f106298a;

    public bdrf(String str) {
        this.f106298a = str;
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        Log.w(this.f106298a, "Swallowed exception");
        return null;
    }
}
