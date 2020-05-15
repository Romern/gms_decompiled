package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rsq {

    /* renamed from: a */
    public static final bnic f43602a = bnic.m109494a("CLIENT_LOGGING_GMSCORE_AUTOFILL", "CLIENT_LOGGING_GMSCORE_CAR", "CLIENT_LOGGING_GMSCORE_COMMON", "CLIENT_LOGGING_GMSCORE_CONTEXT_MANAGER", "CLIENT_LOGGING_GMSCORE_CREDENTIAL_MANAGER", "CLIENT_LOGGING_GMSCORE_FACS_CACHE", "CLIENT_LOGGING_GMSCORE_FITNESS", "CLIENT_LOGGING_GMSCORE_GROWTH", "CLIENT_LOGGING_GMSCORE_GUNS", "CLIENT_LOGGING_GMSCORE_LOCATION", "CLIENT_LOGGING_GMSCORE_LOCATION_SHARING", "CLIENT_LOGGING_GMSCORE_MDI_SYNC", "CLIENT_LOGGING_GMSCORE_MOBILE_DATA_PLAN", "CLIENT_LOGGING_GMSCORE_NEARBY", "CLIENT_LOGGING_GMSCORE_NEARBY_MESSAGES", "CLIENT_LOGGING_GMSCORE_NEARBY_SHARING", "CLIENT_LOGGING_GMSCORE_PAY_SECURE_ELEMENT_SERVICE", "CLIENT_LOGGING_GMSCORE_PHENOTYPE", "CLIENT_LOGGING_GMSCORE_PLATFORM_CONFIGURATOR", "CLIENT_LOGGING_GMSCORE_VEHICLE", "CLIENT_LOGGING_GMSCORE_WALLET_TAP_AND_PAY");

    /* renamed from: b */
    private boolean f43603b;

    /* renamed from: c */
    private final rjx f43604c;

    public rsq(Context context) {
        rjx rjx;
        if (avtz.m79337a(context)) {
            this.f43603b = true;
            rjx = avtz.m79338b(context);
        } else {
            this.f43603b = false;
            rjx = null;
        }
        this.f43604c = rjx;
    }

    /* renamed from: a */
    public final boolean mo25078a() {
        if (this.f43603b) {
            try {
                boolean r = ((rkj) aucu.m76783a(this.f43604c.mo24673E(), 5000, TimeUnit.MILLISECONDS)).mo24824r();
                this.f43603b = r;
                return r;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            }
        }
        return false;
    }
}
