package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;

/* renamed from: zpv */
final /* synthetic */ class zpv implements aubq {

    /* renamed from: a */
    private final zpz f55671a;

    /* renamed from: b */
    private final zpt f55672b;

    public zpv(zpz zpz, zpt zpt) {
        this.f55671a = zpz;
        this.f55672b = zpt;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        int i;
        zpz zpz = this.f55671a;
        zpt zpt = this.f55672b;
        if (!((auck) aucb).f91396d) {
            zpz.f55680c = null;
            if (!aucb.mo50384b()) {
                i = C0126R.string.fitness_manage_data_sources_delete_failure;
            } else {
                i = C0126R.string.fitness_manage_data_sources_delete_success;
            }
            zpq zpq = (zpq) zpt;
            Toast.makeText(zpq.f55667b, i, 1).show();
            zpq.f55667b.mo19189b(zpq.f55666a);
        }
    }
}
