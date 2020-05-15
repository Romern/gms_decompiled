package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: auan */
final /* synthetic */ class auan implements aubq {

    /* renamed from: a */
    private final auao f91326a;

    public auan(auao auao) {
        this.f91326a = auao;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        auao auao = this.f91326a;
        auaj auaj = auao.f91330d;
        if (auaj != null) {
            auaj.mo49541b(auao.f91327a);
            if (!aucb.mo50384b() && auao.f91328b) {
                auar auar = new auar();
                auar.f91334b = auao.getResources().getString(C0126R.string.tp_delete_from_device_error_title);
                auar.f91335c = auao.getResources().getString(C0126R.string.tp_delete_from_device_error_message);
                auar.f91340h = bpan.DELETE_PROMPT;
                auar.f91336d = auao.getResources().getString(C0126R.string.common_ok);
                auao.f91329c.getSupportFragmentManager().beginTransaction().add(auar.mo50344a(), "TAG_DELETE_FAILURE_DIALOG").commit();
            }
        }
    }
}
