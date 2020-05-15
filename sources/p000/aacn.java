package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: aacn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aacn extends BroadcastReceiver {

    /* renamed from: a */
    private final aabl f27941a;

    public aacn(Context context) {
        this.f27941a = sqr.m35998a() ? new aabl(context, getClass(), 4) : null;
    }

    /* renamed from: a */
    public abstract void mo6253a(Context context, Intent intent);

    public final void onReceive(Context context, Intent intent) {
        if (!cdoz.f181455a.mo6606a().mo78122o()) {
            blji a = aabl.m21058a(this.f27941a, "onReceive");
            try {
                mo6253a(context, intent);
                if (a != null) {
                    a.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            aabl aabl = this.f27941a;
            if (aabl != null) {
                blji a2 = aabl.mo16695a("onReceive", intent);
                try {
                    mo6253a(context, intent);
                    if (a2 != null) {
                        a2.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            } else {
                mo6253a(context, intent);
                return;
            }
        }
        throw th;
        throw th;
    }

    public aacn(String str) {
        this.f27941a = sqr.m35998a() ? new aabl(getClass(), 4, str) : null;
    }
}
