package p000;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: agkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f65837a;

    /* renamed from: b */
    final /* synthetic */ UserAttributeParcel f65838b;

    /* renamed from: c */
    final /* synthetic */ AppMetadata f65839c;

    /* renamed from: d */
    final /* synthetic */ agln f65840d;

    public agkx(agln agln, boolean z, UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        this.f65840d = agln;
        this.f65837a = z;
        this.f65838b = userAttributeParcel;
        this.f65839c = appMetadata;
    }

    public final void run() {
        UserAttributeParcel userAttributeParcel;
        agln agln = this.f65840d;
        aghq aghq = agln.f65887c;
        if (aghq == null) {
            agln.mo35497E().f65564c.mo35435a("Discarding data. Failed to set user property");
            return;
        }
        if (!this.f65837a) {
            userAttributeParcel = this.f65838b;
        } else {
            userAttributeParcel = null;
        }
        agln.mo35617a(aghq, userAttributeParcel, this.f65839c);
        this.f65840d.mo35624q();
    }
}
