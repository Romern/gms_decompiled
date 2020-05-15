package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rwm extends anfb {

    /* renamed from: e */
    private final Configurations f43793e;

    public rwm(Context context, aney aney, String str, Configurations configurations) {
        super(aney, str, ssv.m36268b(str), context);
        this.f43793e = configurations;
    }

    /* renamed from: a */
    private final boolean m34569a(String str, int i) {
        if (i > 0) {
            mo25082a(this.f43793e);
            try {
                aucu.m76783a(this.f76754a.mo25233a(this.f43793e.f82074a), 10000, TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String str2 = this.f76755b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 41);
                sb.append("Committing snapshot for ");
                sb.append(str2);
                sb.append(" failed, retrying");
                Log.w("PhenotypeFallbackFix", sb.toString(), e);
                return m34569a(str, i - 1);
            }
        } else {
            String valueOf = String.valueOf(this.f76755b);
            Log.w("PhenotypeFallbackFix", valueOf.length() == 0 ? new String("No more attempts remaining, giving up for ") : "No more attempts remaining, giving up for ".concat(valueOf));
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo25219a(String str) {
        return m34569a(str, 3);
    }
}
