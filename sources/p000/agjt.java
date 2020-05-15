package p000;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* renamed from: agjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConditionalUserPropertyParcel f65753a;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f65754b;

    /* renamed from: c */
    final /* synthetic */ aghp f65755c;

    public agjt(aghp aghp, ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        this.f65755c = aghp;
        this.f65753a = conditionalUserPropertyParcel;
        this.f65754b = appMetadata;
    }

    public final void run() {
        this.f65755c.f65526a.mo35701y();
        if (this.f65753a.f80122c.mo44016a() == null) {
            this.f65755c.f65526a.mo35675b(this.f65753a, this.f65754b);
        } else {
            this.f65755c.f65526a.mo35668a(this.f65753a, this.f65754b);
        }
    }
}
