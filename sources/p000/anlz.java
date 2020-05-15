package p000;

import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: anlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anlz implements rkl {

    /* renamed from: a */
    final /* synthetic */ anme f77103a;

    public anlz(anme anme) {
        this.f77103a = anme;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        this.f77103a.getActivity().runOnUiThread(new anly(this, (BleDevicesResult) rkk));
    }
}
