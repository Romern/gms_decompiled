package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: abff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abff implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f57337a;

    /* renamed from: b */
    final /* synthetic */ HelpConfig f57338b;

    /* renamed from: c */
    final /* synthetic */ String f57339c;

    /* renamed from: d */
    final /* synthetic */ bqgj f57340d;

    /* renamed from: e */
    final /* synthetic */ abcr f57341e;

    public abff(Context context, HelpConfig helpConfig, String str, bqgj bqgj, abcr abcr) {
        this.f57337a = context;
        this.f57338b = helpConfig;
        this.f57339c = str;
        this.f57340d = bqgj;
        this.f57341e = abcr;
    }

    public final void run() {
        try {
            int i = new abfg(this.f57337a, this.f57338b, this.f57339c, this.f57340d, this.f57341e).mo31910k().f56842a;
            if (i != 200 && i != 202) {
                StringBuilder sb = new StringBuilder(42);
                sb.append("Received bad HTTP status code: ");
                sb.append(i);
                Log.e("AutoDeclineSSCReq", sb.toString());
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("AutoDeclineSSCReq", "Sending autodecline request failed.", e);
        }
    }
}
