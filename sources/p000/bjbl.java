package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bjbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbl {

    /* renamed from: a */
    private static final bjbu f122472a = new bjbu("LoggingConsentProvider");

    /* renamed from: b */
    private final Context f122473b;

    /* renamed from: a */
    public final boolean mo64973a() {
        bjbv.m103172a();
        try {
            return ((rkj) aucu.m76783a(avtz.m79338b(this.f122473b).mo24673E(), 30, TimeUnit.SECONDS)).mo24824r();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f122472a.mo64982a("Failed to get consent status", e);
            return false;
        }
    }

    public bjbl(Context context) {
        this.f122473b = context;
    }
}
