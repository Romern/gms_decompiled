package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;

/* renamed from: vly */
final /* synthetic */ class vly implements rkl {

    /* renamed from: a */
    private final vme f49482a;

    public vly(vme vme) {
        this.f49482a = vme;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        vme vme = this.f49482a;
        Status status = (Status) rkk;
        if (!status.mo17710c()) {
            vme.f49489a.mo25374b("FileListAdapter", "Search query failed %s", status.f30116j);
            Toast.makeText(vme.f49500m, (int) C0126R.string.drive_empty_doclist_cannot_retrieve, 1).show();
            vme.f49497j = null;
        }
    }
}
