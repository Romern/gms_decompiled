package p000;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: bbiu */
final /* synthetic */ class bbiu implements bmzi {

    /* renamed from: a */
    private final Context f102754a;

    public bbiu(Context context) {
        this.f102754a = context;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        return (ConnectivityManager) this.f102754a.getSystemService("connectivity");
    }
}
