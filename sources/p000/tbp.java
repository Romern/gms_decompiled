package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.util.List;

/* renamed from: tbp */
public final /* synthetic */ class tbp implements View.OnClickListener {

    /* renamed from: a */
    public static final View.OnClickListener f45617a = new tbp();

    private tbp() {
    }

    public void onClick(View view) {
        Logger Logger = ConstellationDebugChimeraActivity.f30575b;
        szr.m36692a();
        List b = szr.m36697b(-1);
        int size = b.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            ConstellationDebugChimeraActivity.f30575b.mo25412b("ServiceStateEvent %d: %s", Integer.valueOf(i2), (cbpb) b.get(i));
            i++;
            i2++;
        }
    }
}
