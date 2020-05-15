package p000;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.material.card.MaterialCardView;

/* renamed from: aasz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasz {
    /* renamed from: a */
    public static MaterialCardView m46953a(HelpChimeraActivity helpChimeraActivity, View view, int i) {
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(C0126R.C0129id.gh_community_card);
        materialCardView.setVisibility(0);
        materialCardView.setOnClickListener(new aasx(helpChimeraActivity, i));
        abcx.m47511c(helpChimeraActivity, i);
        return materialCardView;
    }

    /* renamed from: b */
    public static MaterialCardView m46955b(HelpChimeraActivity helpChimeraActivity, View view, int i) {
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(C0126R.C0129id.gh_smart_journey_card);
        materialCardView.setVisibility(0);
        materialCardView.setOnClickListener(new aasy(helpChimeraActivity, i));
        abcx.m47522f(helpChimeraActivity, i);
        return materialCardView;
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
    /* renamed from: a */
    public static void m46954a(HelpChimeraActivity helpChimeraActivity) {
        if (aaya.m47229b(cehp.m136861d())) {
            HelpConfig helpConfig = helpChimeraActivity.f56986y;
            aasm a = aasm.m46882a(helpConfig.mo43211F(), aasw.m46952a(), helpConfig);
            if (a == null) {
                String F = helpConfig.mo43211F();
                StringBuilder sb = new StringBuilder(String.valueOf(F).length() + 42);
                sb.append("Error, could not load smart journey for '");
                sb.append(F);
                sb.append("'");
                Log.e("gH_NeedMoreHelpUtil", sb.toString());
                return;
            }
            abgx.m47704a(helpChimeraActivity, a, 173, 0);
            return;
        }
        HelpConfig helpConfig2 = helpChimeraActivity.f56986y;
        abht.m47730a(helpChimeraActivity, new Intent("android.intent.action.VIEW").setData(Uri.parse(helpConfig2.mo43211F())).putExtra("requireGcmToken", true), helpConfig2, 5);
    }
}
