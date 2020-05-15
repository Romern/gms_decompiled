package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.concurrent.ExecutionException;

/* renamed from: bgjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgjv implements bgnv {

    /* renamed from: a */
    private final Context f116665a;

    /* renamed from: b */
    private int f116666b = 0;

    public bgjv(Context context) {
        this.f116665a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final synchronized int mo62926a() {
        return this.f116666b;
    }

    /* renamed from: b */
    public final void mo62927b() {
        rjx a = aeqc.m52384a(this.f116665a);
        Account[] a2 = adyd.m51363a(this.f116665a).mo33916a("com.google");
        int length = a2.length;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        while (true) {
            if (i2 < length) {
                try {
                    if (((ReportingState) aucu.m76782a(a.mo24736c(a2[i2]))).f79601b) {
                        i = 1;
                        break;
                    }
                    i2++;
                } catch (InterruptedException | ExecutionException e) {
                    z = false;
                }
            } else if (z) {
                i = 2;
            }
        }
        synchronized (this) {
            this.f116666b = i;
        }
    }
}
