package p000;

import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abaq */
public final /* synthetic */ class abaq implements View.OnClickListener {

    /* renamed from: a */
    private final HelpChimeraActivity f56953a;

    public abaq(HelpChimeraActivity helpChimeraActivity) {
        this.f56953a = helpChimeraActivity;
    }

    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.f56953a;
        abcx.m47526i(helpChimeraActivity);
        MenuItem menuItem = helpChimeraActivity.f78972s;
        if (menuItem != null) {
            menuItem.setVisible(false);
            helpChimeraActivity.f78972s.expandActionView();
            helpChimeraActivity.f78962i.setVisibility(8);
        }
    }
}
