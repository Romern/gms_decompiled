package p000;

import android.util.Log;
import android.view.View;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aasx */
final /* synthetic */ class aasx implements View.OnClickListener {

    /* renamed from: a */
    private final HelpChimeraActivity f56529a;

    /* renamed from: b */
    private final int f56530b;

    public aasx(HelpChimeraActivity helpChimeraActivity, int i) {
        this.f56529a = helpChimeraActivity;
        this.f56530b = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abcx.b(aasf, int):void
     arg types: [com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, int]
     candidates:
      abcx.b(aasf, long):void
      abcx.b(aasf, bzps):void
      abcx.b(aasf, java.lang.String):void
      abcx.b(aasf, int):void */
    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.f56529a;
        int i = this.f56530b;
        HelpConfig helpConfig = helpChimeraActivity.f56986y;
        aasm a = aasm.m46882a(helpConfig.mo43212G(), aasw.m46952a(), helpConfig);
        if (a == null) {
            String G = helpConfig.mo43212G();
            StringBuilder sb = new StringBuilder(String.valueOf(G).length() + 38);
            sb.append("Error, could not load community for '");
            sb.append(G);
            sb.append("'");
            Log.e("gH_NeedMoreHelpUtil", sb.toString());
        } else {
            abgx.m47704a(helpChimeraActivity, a, 13, 0);
        }
        abcx.m47502b((aasf) helpChimeraActivity, i);
    }
}
