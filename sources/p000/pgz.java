package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: pgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pgz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ phb f39092a;

    public pgz(phb phb) {
        this.f39092a = phb;
    }

    public final void run() {
        if (this.f39092a.isResumed()) {
            this.f39092a.getActivity().getSupportFragmentManager().beginTransaction().replace(C0126R.C0129id.container, phq.m30341a(true), "PinFragment").commit();
        }
    }
}
