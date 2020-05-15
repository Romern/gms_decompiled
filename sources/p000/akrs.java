package p000;

import com.google.android.chimera.Activity;

/* renamed from: akrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akrs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f72514a;

    /* renamed from: b */
    final /* synthetic */ akru f72515b;

    public akrs(akru akru, String str) {
        this.f72515b = akru;
        this.f72514a = str;
    }

    public final void run() {
        akrx akrx = new akrx();
        akrx.f72540a = this.f72514a;
        Activity activity = this.f72515b.getActivity();
        if (activity != null) {
            this.f72515b.f72405d.mo39795x();
            akrx.show(activity.getContainerActivity().getFragmentManager(), "CardCaptureDialogFragment");
            this.f72515b.f72530r = null;
        }
    }
}
