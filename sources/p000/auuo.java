package p000;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.trustlet.face.p074ui.GoogleTrustAgentFaceUnlockChimeraSettings;

/* renamed from: auuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auuo implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ auuq f92554a;

    public auuo(auuq auuq) {
        this.f92554a = auuq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public final void onClick(DialogInterface dialogInterface, int i) {
        auur auur = (auur) ((GoogleTrustAgentFaceUnlockChimeraSettings) this.f92554a.getActivity()).getSupportFragmentManager().findFragmentByTag("FACE_UNLOCK_FRAGMENT_TAG");
        Intent intent = new Intent();
        intent.setClassName("com.android.facelock", "com.android.facelock.FaceLockReceiver");
        intent.putExtra("deleteGallery", true);
        auur.getActivity().sendBroadcast(intent);
        try {
            aumk aumk = (aumk) auur.f92556d.mo50673a(aumk.class);
            aumk.mo50672a(aumk.f92084c, false);
            auur.f92556d.mo50676a(aumk);
        } catch (aumn e) {
            auur.f92555c.mo50710a("ModelNotFountException", e, new Object[0]).mo50706a();
        }
        aunw a = auur.f92555c.mo50711a("Face trustlet is disabled by user", new Object[0]);
        a.mo50708c();
        a.mo50707b();
        auur.getActivity().finish();
    }
}
