package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: jfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfn {

    /* renamed from: a */
    final Lock f22380a;

    public jfn() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f22380a = reentrantLock;
        reentrantLock.newCondition();
    }

    /* renamed from: a */
    public static final Bundle m16646a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("showOffer", false);
        int i = Build.VERSION.SDK_INT;
        Log.e("GLSActivity", "Play is unavailable");
        return bundle;
    }

    /* renamed from: a */
    public static void m16647a(Bundle bundle, Intent intent) {
        if (bundle.containsKey("showOffer")) {
            intent.putExtra("showOffer", bundle.getBoolean("showOffer"));
        }
        if (bundle.containsKey("offerIntent")) {
            intent.putExtra("offerIntent", bundle.getParcelable("offerIntent"));
        }
        if (bundle.containsKey("offerMessageHtml")) {
            intent.putExtra("offerMessageHtml", bundle.getString("offerMessageHtml"));
        }
    }
}
