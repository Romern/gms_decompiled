package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.location.reporting.ReportingState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahve {

    /* renamed from: a */
    public final Context f68152a;

    /* renamed from: b */
    public final ahwf f68153b;

    /* renamed from: c */
    public final ahtp f68154c;

    /* renamed from: d */
    private final rjx f68155d;

    public ahve(Context context) {
        shl shl = new shl(context, cfog.f184854a.mo6606a().mo81963Y(), (int) cfog.f184854a.mo6606a().mo81964Z(), context.getApplicationInfo().uid, 9731);
        rjx a = aeqc.m52384a(context);
        this.f68152a = context;
        this.f68153b = new ahwf(context, new ahsg(shl));
        this.f68154c = new ahtp(context, this.f68153b, cfog.f184854a.mo6606a().mo81962X());
        this.f68155d = a;
    }

    /* renamed from: a */
    public final boolean mo37200a(Context context) {
        int length;
        Account[] a = adyd.m51363a(context).mo33916a("com.google");
        if (a == null || (length = a.length) == 0) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: No accounts on device.");
            return false;
        }
        int i = 0;
        while (i < length) {
            try {
                if (((ReportingState) aucu.m76783a(this.f68155d.mo24736c(a[i]), cfog.f184854a.mo6606a().mo81959U(), TimeUnit.MILLISECONDS)).f79601b) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Opted into location reporting.");
                    return true;
                }
                i++;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
                bnsl.mo68437a(e);
                bnsl.mo68405a("FastPair: Error getting opt in status");
                return false;
            }
        }
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Not opted into location report, no upload will occur.");
        return false;
    }
}
