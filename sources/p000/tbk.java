package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tbk */
public final /* synthetic */ class tbk implements View.OnClickListener {

    /* renamed from: a */
    public static final View.OnClickListener f45612a = new tbk();

    private tbk() {
    }

    public void onClick(View view) {
        sek sek = ConstellationDebugChimeraActivity.f30575b;
        szr.m36692a();
        szr.f45526a.mo25409a("Delete all CellularNetworkEvents", new Object[0]);
        szr.m36694a("event_type = ?", new String[]{"1"});
    }
}
