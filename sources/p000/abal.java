package p000;

import android.view.View;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abal */
public final /* synthetic */ class abal implements View.OnClickListener {

    /* renamed from: a */
    private final HelpChimeraActivity f56945a;

    public abal(HelpChimeraActivity helpChimeraActivity) {
        this.f56945a = helpChimeraActivity;
    }

    public void onClick(View view) {
        this.f56945a.onBackPressed();
        aatj.m46979a(view);
    }
}
