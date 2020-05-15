package p000;

import android.util.Log;
import java.io.IOException;

/* renamed from: adxn */
final /* synthetic */ class adxn implements bmxj {

    /* renamed from: a */
    static final bmxj f62868a = new adxn();

    private adxn() {
    }

    public final Object apply(Object obj) {
        Log.e("StateManager", "Error while storing sync reason for an account", (IOException) obj);
        return null;
    }
}
