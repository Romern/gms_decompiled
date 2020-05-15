package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ytl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ytl {
    INSTANCE;
    

    /* renamed from: b */
    private final Object f54590b = new Object();

    /* renamed from: c */
    private long f54591c = -1;

    /* renamed from: d */
    private boolean f54592d;

    private ytl(String str) {
    }

    /* renamed from: a */
    public static SharedPreferences m44779a(Context context) {
        return context.getSharedPreferences("apilogrequirement", 0);
    }

    /* renamed from: a */
    public static String m44780a(ytr ytr) {
        return Base64.encodeToString(ytr.mo73642k(), 0);
    }

    /* renamed from: a */
    public final boolean mo30753a(rjx rjx) {
        synchronized (this.f54590b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f54591c;
            if (j == -1 || elapsedRealtime - j > TimeUnit.SECONDS.toMillis(cdza.f181994a.mo6606a().mo78526a())) {
                try {
                    boolean r = ((rkj) aucu.m76783a(rjx.mo24673E(), cdza.f181994a.mo6606a().mo78527b(), TimeUnit.SECONDS)).mo24824r();
                    this.f54592d = r;
                    this.f54591c = elapsedRealtime;
                    return r;
                } catch (ExecutionException e) {
                    return false;
                } catch (InterruptedException e2) {
                    return false;
                } catch (TimeoutException e3) {
                    return false;
                }
            } else {
                boolean z = this.f54592d;
                return z;
            }
        }
    }
}
