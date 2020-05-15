package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tbo */
public final /* synthetic */ class tbo implements View.OnClickListener {

    /* renamed from: a */
    public static final View.OnClickListener f45616a = new tbo();

    private tbo() {
    }

    public void onClick(View view) {
        sek sek = ConstellationDebugChimeraActivity.f30575b;
        szr.m36692a();
        szr.f45526a.mo25409a("Delete all ServiceStateEvents", new Object[0]);
        szr.m36694a("event_type = ?", new String[]{"2"});
    }
}
