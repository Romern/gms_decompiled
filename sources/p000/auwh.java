package p000;

import android.content.DialogInterface;

/* renamed from: auwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auwh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ auwj f92656a;

    public auwh(auwj auwj) {
        this.f92656a = auwj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        auol g = this.f92656a.mo50786g();
        if (g != null) {
            auwo.m77985a(this.f92656a.getActivity(), 35, this.f92656a.f92659d);
            auwo.m77987a(this.f92656a.getActivity(), g, "com.google.android.gms.trustagent.GoogleTrustAgentOnBodyDetectionSettings");
            this.f92656a.f92658c.toggle();
            this.f92656a.f92659d = true;
        }
    }
}
