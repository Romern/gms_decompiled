package p000;

import android.content.DialogInterface;

/* renamed from: bjsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjsa implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bjsc f123202a;

    public bjsa(bjsc bjsc) {
        this.f123202a = bjsc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            bjsl.m104501a("BiometricFragment", this.f123202a.getActivity(), this.f123202a.f123205b, null);
        }
    }
}
