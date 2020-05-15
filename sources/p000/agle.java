package p000;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* renamed from: agle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agle implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f65856a;

    /* renamed from: b */
    final /* synthetic */ boolean f65857b;

    /* renamed from: c */
    final /* synthetic */ ConditionalUserPropertyParcel f65858c;

    /* renamed from: d */
    final /* synthetic */ AppMetadata f65859d;

    /* renamed from: e */
    final /* synthetic */ ConditionalUserPropertyParcel f65860e;

    /* renamed from: f */
    final /* synthetic */ agln f65861f;

    public agle(agln agln, boolean z, boolean z2, ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata, ConditionalUserPropertyParcel conditionalUserPropertyParcel2) {
        this.f65861f = agln;
        this.f65856a = z;
        this.f65857b = z2;
        this.f65858c = conditionalUserPropertyParcel;
        this.f65859d = appMetadata;
        this.f65860e = conditionalUserPropertyParcel2;
    }

    public final void run() {
        ConditionalUserPropertyParcel conditionalUserPropertyParcel;
        agln agln = this.f65861f;
        aghq aghq = agln.f65887c;
        if (aghq == null) {
            agln.mo35497E().f65564c.mo35435a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (!this.f65856a) {
            try {
                if (TextUtils.isEmpty(this.f65860e.f80120a)) {
                    aghq.mo35398a(this.f65858c, this.f65859d);
                } else {
                    aghq.mo35397a(this.f65858c);
                }
            } catch (RemoteException e) {
                this.f65861f.mo35497E().f65564c.mo35436a("Failed to send conditional user property to the service", e);
            }
        } else {
            if (!this.f65857b) {
                conditionalUserPropertyParcel = this.f65858c;
            } else {
                conditionalUserPropertyParcel = null;
            }
            agln.mo35617a(aghq, conditionalUserPropertyParcel, this.f65859d);
        }
        this.f65861f.mo35624q();
    }
}
