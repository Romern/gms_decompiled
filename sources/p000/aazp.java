package p000;

import android.net.Uri;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aazp */
final /* synthetic */ class aazp implements View.OnClickListener {

    /* renamed from: a */
    private final HelpConfig f56897a;

    /* renamed from: b */
    private final HelpChimeraActivity f56898b;

    /* renamed from: c */
    private final aasm f56899c;

    public aazp(HelpConfig helpConfig, HelpChimeraActivity helpChimeraActivity, aasm aasm) {
        this.f56897a = helpConfig;
        this.f56898b = helpChimeraActivity;
        this.f56899c = aasm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abcx.a(aasf, java.lang.String):void
     arg types: [com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, java.lang.String]
     candidates:
      abcx.a(aasf, int):void
      abcx.a(aasf, long):void
      abcx.a(aasf, aasm):void
      abcx.a(aasf, android.accounts.Account):void
      abcx.a(aasf, bzps):void
      abcx.a(aasf, java.lang.CharSequence):void
      abcx.a(aasf, boolean):void
      abcx.a(bxvd, android.content.Context):void
      abcx.a(bxvd, com.google.android.gms.googlehelp.common.HelpConfig):void
      abcx.a(qws, bxvd):void
      abcx.a(aasf, java.lang.String):void */
    public void onClick(View view) {
        HelpConfig helpConfig = this.f56897a;
        HelpChimeraActivity helpChimeraActivity = this.f56898b;
        aasm aasm = this.f56899c;
        if (helpConfig != null) {
            abcx.m47484a((aasf) helpChimeraActivity, aazq.m47333a(aasm));
            String str = aasm.f56497g;
            if (!new aass(helpChimeraActivity).mo31749a(Uri.parse(str), 139)) {
                aasm a = aasm.m46882a(str, aasw.m46952a(), helpConfig);
                if (a == null) {
                    abht.m47727a(helpChimeraActivity, Uri.parse(str), helpConfig, helpChimeraActivity.f56987z);
                } else {
                    abgx.m47704a(helpChimeraActivity, a, 139, -1);
                }
            }
        }
    }
}
