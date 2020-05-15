package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aeyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeyc {

    /* renamed from: a */
    public static long f63998a = -1;

    /* renamed from: b */
    public final Context f63999b;

    public aeyc(Context context) {
        this.f63999b = context;
        new qws(context, "", null);
    }

    /* renamed from: a */
    public final boolean mo34649a() {
        try {
            aucb a = anef.m64089a(this.f63999b).mo25235a("com.google.android.gms.lockbox", 1, new String[]{"LB_AS", "LB_CFG", "LB_T", "LB_D"}, new int[0]);
            aucu.m76783a(a, cfbf.m138607b(), TimeUnit.SECONDS);
            return a.mo50384b();
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            return false;
        }
    }
}
