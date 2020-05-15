package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.List;

/* renamed from: tbl */
public final /* synthetic */ class tbl implements View.OnClickListener {

    /* renamed from: a */
    public static final View.OnClickListener f45613a = new tbl();

    private tbl() {
    }

    public void onClick(View view) {
        sek sek = ConstellationDebugChimeraActivity.f30575b;
        szr.m36692a();
        List a = szr.m36691a(-1);
        int size = a.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            ConstellationDebugChimeraActivity.f30575b.mo25412b("CellularNetworkEvent %d: %s", Integer.valueOf(i2), (cbox) a.get(i));
            i++;
            i2++;
        }
    }
}
