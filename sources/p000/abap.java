package p000;

import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abap */
public final /* synthetic */ class abap implements View.OnClickListener {

    /* renamed from: a */
    private final HelpChimeraActivity f56951a;

    /* renamed from: b */
    private final View f56952b;

    public abap(HelpChimeraActivity helpChimeraActivity, View view) {
        this.f56951a = helpChimeraActivity;
        this.f56952b = view;
    }

    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.f56951a;
        View view2 = this.f56952b;
        abcx.m47526i(helpChimeraActivity);
        MenuItem menuItem = helpChimeraActivity.f78972s;
        if (menuItem != null) {
            menuItem.setVisible(false);
            helpChimeraActivity.f78972s.expandActionView();
            helpChimeraActivity.f78962i.setVisibility(8);
            view2.setVisibility(8);
            helpChimeraActivity.mo43351m();
        }
    }
}
