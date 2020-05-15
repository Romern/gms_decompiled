package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParcel;

/* renamed from: agld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agld implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f65850a;

    /* renamed from: b */
    final /* synthetic */ boolean f65851b;

    /* renamed from: c */
    final /* synthetic */ EventParcel f65852c;

    /* renamed from: d */
    final /* synthetic */ AppMetadata f65853d;

    /* renamed from: e */
    final /* synthetic */ String f65854e;

    /* renamed from: f */
    final /* synthetic */ agln f65855f;

    public agld(agln agln, boolean z, boolean z2, EventParcel eventParcel, AppMetadata appMetadata, String str) {
        this.f65855f = agln;
        this.f65850a = z;
        this.f65851b = z2;
        this.f65852c = eventParcel;
        this.f65853d = appMetadata;
        this.f65854e = str;
    }

    public final void run() {
        EventParcel eventParcel;
        agln agln = this.f65855f;
        aghq aghq = agln.f65887c;
        if (aghq == null) {
            agln.mo35497E().f65564c.mo35435a("Discarding data. Failed to send event to service");
            return;
        }
        if (!this.f65850a) {
            try {
                if (!TextUtils.isEmpty(this.f65854e)) {
                    aghq.mo35400a(this.f65852c, this.f65854e, this.f65855f.mo35497E().mo35443c());
                } else {
                    aghq.mo35399a(this.f65852c, this.f65853d);
                }
            } catch (RemoteException e) {
                this.f65855f.mo35497E().f65564c.mo35436a("Failed to send event to the service", e);
            }
        } else {
            if (!this.f65851b) {
                eventParcel = this.f65852c;
            } else {
                eventParcel = null;
            }
            agln.mo35617a(aghq, eventParcel, this.f65853d);
        }
        this.f65855f.mo35624q();
    }
}
