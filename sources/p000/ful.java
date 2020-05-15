package p000;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;

/* renamed from: ful */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ful implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ AppInviteChimeraActivity f17270a;

    public ful(AppInviteChimeraActivity appInviteChimeraActivity) {
        this.f17270a = appInviteChimeraActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        boolean z2;
        Resources resources = this.f17270a.getResources();
        if (!z) {
            this.f17270a.f9722d.f17635s.setTextColor(resources.getColor(C0126R.color.appinvite_medium_black));
            View view2 = this.f17270a.f9722d.f17637u;
            view2.setLayoutParams(new LinearLayout.LayoutParams(-1, resources.getDimensionPixelSize(C0126R.dimen.appinvite_separator)));
            view2.setBackgroundColor(resources.getColor(C0126R.color.appinvite_separator));
            this.f17270a.f9724f.setText("");
            AppInviteChimeraActivity appInviteChimeraActivity = this.f17270a;
            if (appInviteChimeraActivity.f9731m) {
                appInviteChimeraActivity.f9731m = false;
                int length = ((EditText) view).getText().length();
                fuv fuv = this.f17270a.f9730l;
                if (100 - length > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bxvd da = boja.f133256d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boja boja = (boja) da.f164949b;
                int i = 1 | boja.f133258a;
                boja.f133258a = i;
                boja.f133259b = z2;
                boja.f133258a = i | 2;
                boja.f133260c = length;
                fuv.mo11372a((boja) da.mo74062i(), 4, fuv.f17310b);
                return;
            }
            return;
        }
        AppInviteChimeraActivity appInviteChimeraActivity2 = this.f17270a;
        if (!appInviteChimeraActivity2.f9732n) {
            appInviteChimeraActivity2.f9732n = true;
            appInviteChimeraActivity2.f9725g.post(new fuk(this));
        }
        int color = resources.getColor(C0126R.color.material_google_blue_800);
        this.f17270a.f9722d.f17635s.setTextColor(color);
        View view3 = this.f17270a.f9722d.f17637u;
        view3.setLayoutParams(new LinearLayout.LayoutParams(-1, resources.getDimensionPixelSize(C0126R.dimen.appinvite_separator_bold)));
        view3.setBackgroundColor(color);
    }
}
