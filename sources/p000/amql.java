package p000;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: amql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amql extends amqd {

    /* renamed from: a */
    private final alzm f75755a;

    /* renamed from: b */
    private final Uri f75756b;

    /* renamed from: c */
    private final boolean f75757c = cfyx.m143985b();

    /* renamed from: a */
    private final void m63181a(amqv amqv, String str, int i, int i2) {
        almh almh;
        almh almh2;
        almh almh3;
        alzm alzm = this.f75755a;
        if (alzm != null) {
            try {
                alzm.mo40535a(amqv.f75784a, str);
                if (this.f75757c && (almh3 = this.f75735r) != null) {
                    almh3.mo40510b(i, i2);
                }
            } catch (RemoteException e) {
                Log.e("GetTypeOperation", "Operation failed remotely: ", e);
                if (this.f75757c && (almh = this.f75735r) != null) {
                    almh.mo40510b(10, 0);
                }
            } catch (Throwable th) {
                if (this.f75757c && (almh2 = this.f75735r) != null) {
                    almh2.mo40510b(i, i2);
                }
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo40603b(Context context) {
        almh almh;
        if (this.f75757c && (almh = this.f75735r) != null && this.f75733p) {
            almh.mo40510b(8, 0);
        } else if (cgbt.m144706b()) {
            m63181a(amqv.f75777c, context.getContentResolver().getType(this.f75756b), 2, 1);
        } else {
            Log.w("GetTypeOperation", "GalProvider delegation disabled.");
            m63181a(amqv.f75783i, null, 13, 0);
        }
    }

    public amql(String str, int i, alzm alzm, Uri uri) {
        super(str, i, null, "GetGalProviderType", null);
        this.f75755a = alzm;
        this.f75756b = uri;
    }
}
