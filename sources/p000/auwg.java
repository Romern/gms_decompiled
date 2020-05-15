package p000;

import android.app.AlertDialog;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import java.io.File;

/* renamed from: auwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auwg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ auwj f92655a;

    public auwg(auwj auwj) {
        this.f92655a = auwj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: auol.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      auol.a(java.lang.String, long):long
      auol.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, java.lang.Object):void
      aupn.a(java.lang.String, long):long
      aupn.a(java.lang.String, java.lang.String):java.lang.String
      auol.a(java.lang.String, boolean):void */
    public void onClick(View view) {
        auwj auwj = this.f92655a;
        if (auwj.f92659d) {
            auwj.f92659d = false;
            auol g = auwj.mo50786g();
            if (g != null) {
                auwo.m77986a(this.f92655a.getActivity(), 18, true, auwo.m77982a(g), auwo.m77984a(g, ""));
                g.mo50728a("auth_trust_agent_pref_trustlet_enabled_com.google.android.gms.auth.trustagent.trustlet.PhonePositionTrustlet", false);
                aunw a = auwo.f92664a.mo50711a("Onbody trustlet is disabled by user.", new Object[0]);
                a.mo50708c();
                a.mo50707b();
            }
            this.f92655a.f92658c.toggle();
            File file = new File(this.f92655a.getActivity().getFilesDir(), "gait-nlp/library.proto");
            if (file.exists()) {
                C1226ns nsVar = new C1226ns(file);
                nsVar.f26761a.delete();
                nsVar.f26762b.delete();
                return;
            }
            return;
        }
        auwo.m77985a(auwj.getActivity(), 17, this.f92655a.f92659d);
        auwj auwj2 = this.f92655a;
        AlertDialog.Builder builder = new AlertDialog.Builder(auwj2.getActivity());
        builder.setTitle((int) C0126R.string.auth_trust_agent_dialog_on_body_detection_title);
        builder.setMessage((int) C0126R.string.onbody_detection_disclaimer);
        builder.setPositiveButton((int) C0126R.string.auth_trust_agent_dialog_continue, new auwh(auwj2));
        builder.setNegativeButton(17039360, new auwi(auwj2));
        builder.create().show();
    }
}
