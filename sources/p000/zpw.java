package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: zpw */
final /* synthetic */ class zpw implements aubq {

    /* renamed from: a */
    private final zpz f55673a;

    /* renamed from: b */
    private final zpt f55674b;

    public zpw(zpz zpz, zpt zpt) {
        this.f55673a = zpz;
        this.f55674b = zpt;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        zpz zpz = this.f55673a;
        zpt zpt = this.f55674b;
        if (!((auck) aucb).f91396d) {
            zpz.f55680c = null;
            if (aucb.mo50384b()) {
                ((zpr) zpt).f55668a.finish();
            } else {
                Toast.makeText(((zpr) zpt).f55668a, (int) C0126R.string.fitness_manage_data_sources_delete_failure, 1).show();
            }
        }
    }
}
