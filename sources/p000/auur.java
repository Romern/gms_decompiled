package p000;

import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: auur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auur extends aupa {

    /* renamed from: c */
    public static final aunx f92555c = new aunx("TrustAgent", "FaceUnlockFragment");

    /* renamed from: d */
    public aumr f92556d;

    /* renamed from: e */
    private Preference f92557e;

    /* renamed from: f */
    private Preference f92558f;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            try {
                aumk aumk = (aumk) this.f92556d.mo50673a(aumk.class);
                aumk.mo50672a(aumk.f92084c, true);
                this.f92556d.mo50676a(aumk);
                aunw a = f92555c.mo50711a("Face trustlet is enabled by user", new Object[0]);
                a.mo50708c();
                a.mo50707b();
            } catch (aumn e) {
                f92555c.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
            }
        } else {
            getActivity().finish();
        }
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo9318a((int) C0126R.xml.face_unlock_preferences);
        this.f92556d = aumr.m77322a(getActivity());
        Preference a = mo2204a((CharSequence) "auth_trust_agent_pref_face_unlock_improve_key");
        this.f92557e = a;
        a.f1600p = new auum(this);
        Preference a2 = mo2204a((CharSequence) "auth_trust_agent_pref_face_unlock_reset_key");
        this.f92558f = a2;
        a2.f1600p = new auun(this);
        try {
            if (((Boolean) ((aumk) this.f92556d.mo50673a(aumk.class)).mo50671a(aumk.f92084c)).booleanValue()) {
                return;
            }
        } catch (aumn e) {
            f92555c.mo50710a("ModelNotFoundException", e, new Object[0]).mo50706a();
        }
        Intent intent = new Intent();
        intent.setClassName("com.android.facelock", "com.android.facelock.SetupIntro");
        intent.putExtra("showTutorial", true);
        startActivityForResult(intent, 0);
    }
}
