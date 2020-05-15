package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: anmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anmb implements rkl {

    /* renamed from: a */
    final /* synthetic */ anme f77106a;

    public anmb(anme anme) {
        this.f77106a = anme;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        this.f77106a.getActivity().runOnUiThread(new anma(this, (Status) rkk));
    }
}
