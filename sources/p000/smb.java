package p000;

import android.content.ContentResolver;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: smb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smb {

    /* renamed from: a */
    private static smb f44716a = null;

    /* renamed from: b */
    private final ExecutorService f44717b = snp.m35704b(10);

    private smb() {
    }

    /* renamed from: a */
    public static smb m35631a() {
        if (f44716a == null) {
            f44716a = new smb();
        }
        return f44716a;
    }

    /* renamed from: a */
    public static final synchronized void m35632a(Context context, int i, long j, long j2) {
        synchronized (smb.class) {
            new sme(context, i, j, j2, true, true).run();
        }
    }

    /* renamed from: a */
    public final synchronized Future mo25735a(ContentResolver contentResolver, int i) {
        return this.f44717b.submit(new smf(contentResolver, i), true);
    }

    /* renamed from: a */
    public final synchronized Future mo25736a(Context context, int i, long j, long j2, boolean z, boolean z2) {
        Future submit;
        synchronized (this) {
            submit = this.f44717b.submit(new sme(context, i, j, j2, z, z2), true);
        }
        return submit;
    }
}
