package p000;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* renamed from: agjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConditionalUserPropertyParcel f65710a;

    /* renamed from: b */
    final /* synthetic */ aghp f65711b;

    public agjf(aghp aghp, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.f65711b = aghp;
        this.f65710a = conditionalUserPropertyParcel;
    }

    public final void run() {
        this.f65711b.f65526a.mo35701y();
        if (this.f65710a.f80122c.mo44016a() != null) {
            agmn agmn = this.f65711b.f65526a;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = this.f65710a;
            AppMetadata a = agmn.mo35665a(conditionalUserPropertyParcel.f80120a);
            if (a != null) {
                agmn.mo35668a(conditionalUserPropertyParcel, a);
                return;
            }
            return;
        }
        agmn agmn2 = this.f65711b.f65526a;
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = this.f65710a;
        AppMetadata a2 = agmn2.mo35665a(conditionalUserPropertyParcel2.f80120a);
        if (a2 != null) {
            agmn2.mo35675b(conditionalUserPropertyParcel2, a2);
        }
    }
}
