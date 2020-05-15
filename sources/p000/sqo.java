package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: sqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqo {
    /* renamed from: a */
    public static boolean m35984a(Context context) {
        return m35985a(context, avtz.m79338b(context));
    }

    /* renamed from: a */
    static boolean m35985a(Context context, rjx rjx) {
        if (!aytw.m84815b(context)) {
            return false;
        }
        try {
            return ((rkj) aucu.m76783a(rjx.mo24673E(), 5, TimeUnit.SECONDS)).mo24824r();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("CheckboxUtil", "Could not retrieve Usage & Diagnostics setting. Giving up.", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r0.getAll().isEmpty() != false) goto L_0x0026;
     */
    /* renamed from: a */
    public static boolean m35986a(Context context, boolean z) {
        SharedPreferences sharedPreferences;
        aytw.m84814b();
        if (cdks.f181170a.mo6606a().mo77843c()) {
            sharedPreferences = aytw.m84816c(context).getSharedPreferences("usagereporting", 0);
        }
        if (aytw.m84815b(context)) {
            sharedPreferences = context.getSharedPreferences("usagereporting", 0);
        } else {
            sharedPreferences = null;
        }
        return sharedPreferences != null ? sharedPreferences.getBoolean("OptInUsageReporting", false) : z;
    }
}
