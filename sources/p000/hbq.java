package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hbq */
final /* synthetic */ class hbq implements C0038ax {

    /* renamed from: a */
    private final hbu f19431a;

    public hbq(hbu hbu) {
        this.f19431a = hbu;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hbu hbu = this.f19431a;
        List list = (List) obj;
        hdr hdr = hbu.f19439d;
        ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        if (hbu.f19438c == null) {
            arrayList.add(0, aczd.m50037a(hbu.getString(C0126R.string.credentials_authorization_account_header_subtitle, hbu.f19440e)));
        }
        if (soz.m35813i(hbu.getContext())) {
            arrayList.add(aczd.m50036a());
        }
        hdr.mo12412a(arrayList);
    }
}
