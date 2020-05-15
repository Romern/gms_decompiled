package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gym */
final /* synthetic */ class gym implements C0038ax {

    /* renamed from: a */
    private final gyt f19245a;

    public gym(gyt gyt) {
        this.f19245a = gyt;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        gyt gyt = this.f19245a;
        List list = (List) obj;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        if (gyt.f19259g == null) {
            arrayList.add(0, aczd.m50037a(gyt.getString(C0126R.string.credentials_assisted_choose_account_subtitle, gyt.f19255c.f19382f)));
        }
        if (soz.m35813i(gyt.getContext())) {
            arrayList.add(aczd.m50036a());
        }
        gyt.f19257e.mo12412a(arrayList);
    }
}
