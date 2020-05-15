package p000;

import android.accounts.AccountManager;
import android.content.Context;
import android.location.LocationManager;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: asie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asie {

    /* renamed from: a */
    static final bdyx f89003a;

    /* renamed from: b */
    private static final bdyw f89004b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw bdyw = new bdyw(anef.m64088a("com.google.android.gms"));
        f89004b = bdyw;
        f89003a = bdyx.m91610a(bdyw, "gms:system_health:lockbox_status", true);
    }

    /* renamed from: a */
    public static bpwi m74164a(Context context) {
        boolean z;
        List<String> allProviders;
        bxvd da = bpwi.f139493h.mo74144da();
        int i = asid.f89002a;
        if (((LocationManager) context.getSystemService("location")) == null) {
            z = false;
        } else {
            z = true;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpwi bpwi = (bpwi) da.f164949b;
        bpwi.f139495a |= 1;
        bpwi.f139496b = z;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        boolean contains = (locationManager == null || (allProviders = locationManager.getAllProviders()) == null) ? false : allProviders.contains("network");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpwi bpwi2 = (bpwi) da.f164949b;
        bpwi2.f139495a |= 2;
        bpwi2.f139497c = contains;
        asid.m74162a(context, da);
        try {
            if (((rkj) aucu.m76783a(avtz.m79338b(context).mo24673E(), 10, TimeUnit.SECONDS)).mo24824r()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpwi bpwi3 = (bpwi) da.f164949b;
                bpwi3.f139495a |= 8;
                bpwi3.f139499e = true;
            }
        } catch (ExecutionException | TimeoutException e) {
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
        bxvd da2 = bpwd.f139463b.mo74144da();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AccountManager accountManager = AccountManager.get(context);
            asic.m74161a(context, accountManager, "com.google", da2);
            asic.m74161a(context, accountManager, "cn.google", da2);
            bpwd bpwd = (bpwd) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpwi bpwi4 = (bpwi) da.f164949b;
            bpwd.getClass();
            bpwi4.f139500f = bpwd;
            bpwi4.f139495a |= 16;
            return (bpwi) da.mo74062i();
        }
        throw new IllegalStateException("Cannot gather auth health data from main thread");
    }
}
