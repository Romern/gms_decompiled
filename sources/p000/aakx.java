package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* renamed from: aakx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakx {

    /* renamed from: a */
    public final Context f28393a;

    /* renamed from: b */
    public aalc f28394b;

    public aakx(Context context) {
        this.f28393a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final synchronized List mo16956a() {
        aalc aalc = this.f28394b;
        if (aalc != null) {
            try {
                return aalc.mo16964a();
            } catch (RemoteException e) {
                Log.e("GcmDiagnostics", "Failed to get events.", e);
                return bngx.m109376e();
            }
        } else {
            return bngx.m109376e();
        }
    }

    /* renamed from: b */
    public final synchronized String mo16957b() {
        String str;
        aalc aalc = this.f28394b;
        if (aalc != null) {
            try {
                str = aalc.mo16965c();
            } catch (RemoteException e) {
                Log.e("GcmDiagnostics", "Failed to get status.", e);
                return "No service";
            }
        } else {
            str = "No service";
        }
        return str;
    }

    /* renamed from: c */
    public final synchronized String mo16958c() {
        String str;
        aalc aalc = this.f28394b;
        if (aalc != null) {
            try {
                str = aalc.mo16966d();
            } catch (RemoteException e) {
                Log.e("GcmDiagnostics", "Failed to get status.", e);
                return "No service";
            }
        } else {
            str = "No service";
        }
        return str;
    }
}
