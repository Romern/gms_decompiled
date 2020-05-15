package p000;

import android.os.Build;

/* renamed from: bdrd */
final /* synthetic */ class bdrd implements bqeh {

    /* renamed from: a */
    private final Exception f106296a;

    public bdrd(Exception exc) {
        this.f106296a = exc;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        Exception exc = this.f106296a;
        int i = Build.VERSION.SDK_INT;
        bqye.m113761a(exc, (Throwable) obj);
        return bqga.m112777a((Throwable) exc);
    }
}
