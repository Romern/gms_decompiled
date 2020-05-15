package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: acbo */
public final /* synthetic */ class acbo implements Runnable {

    /* renamed from: a */
    private final int f59446a;

    public acbo(int i) {
        this.f59446a = i;
    }

    public final void run() {
        int i = this.f59446a;
        acbt a = acbt.m48836a();
        barg barg = new barg((Context) a.f59480a.mo6445a(), cayx.m127580b(a.f59529d), cayx.m127580b(a.f59530e), cayx.m127580b(a.f59528c));
        SharedPreferences sharedPreferences = barg.f101600a.getSharedPreferences("MDH_shared_preferences", 0);
        if (i - sharedPreferences.getInt("wipeout_event_id", 0) > 0) {
            sharedPreferences.edit().putInt("wipeout_event_id", i).commit();
            try {
                baaw baaw = (baaw) barg.f101602c.mo16713a();
                synchronized (baaw.f100401e) {
                    baaw.mo55551a(0);
                }
            } catch (IOException e) {
                ((acdc) barg.f101603d.mo16713a()).mo32707a("Error during file wipeout", e);
            }
            ((bamj) barg.f101601b.mo16713a()).mo55758a();
        }
    }
}
