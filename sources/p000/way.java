package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.IOException;

/* renamed from: way */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class way extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ wba f50365a;

    public way(wba wba) {
        this.f50365a = wba;
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            wba wba = this.f50365a;
            long longExtra = intent.getLongExtra("last_modified_time", 0);
            int i = wba.f50368d;
            synchronized (wba) {
                if (!(wba.f50372c == null || longExtra == wba.f50371b)) {
                    try {
                        wba.m41701a(context, -1);
                    } catch (InvalidConfigException | IOException e) {
                        Log.e("DynamiteLoaderV2Impl", "Failed to load config.", e);
                    }
                }
            }
        } catch (Throwable th) {
            if (!sqr.m35998a()) {
                sqx.m36053a(context, th);
            }
            throw th;
        }
    }
}
