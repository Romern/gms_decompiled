package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hhf */
final /* synthetic */ class hhf implements C0038ax {

    /* renamed from: a */
    private final hhj f19767a;

    public hhf(hhj hhj) {
        this.f19767a = hhj;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hhj hhj = this.f19767a;
        List list = (List) obj;
        hdr hdr = hhj.f19775d;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        if (hhj.f19774c == null) {
            arrayList.add(0, aczd.m50037a(hhj.getString(C0126R.string.credentials_saving_account_linking_token_account_header_title)));
        }
        if (soz.m35813i(hhj.getContext())) {
            arrayList.add(aczd.m50036a());
        }
        hdr.mo12412a(arrayList);
    }
}
