package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.search.SearchItemsListView;
import java.util.List;

/* renamed from: faw */
final /* synthetic */ class faw implements C0038ax {

    /* renamed from: a */
    private final fbh f16181a;

    public faw(fbh fbh) {
        this.f16181a = fbh;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        bswf bswf;
        fbh fbh = this.f16181a;
        List list = (List) obj;
        if (list != null && fbh.f16199g != null) {
            boolean z = false;
            if (!stm.m36302d(fbh.f16200h)) {
                fbh.f16195c.setText(fbh.getResources().getQuantityString(C0126R.plurals.as_result_num, list.size(), Integer.valueOf(list.size())));
            } else {
                fbh.f16195c.setText(fbh.getString(C0126R.string.as_all_results));
            }
            if (list.isEmpty()) {
                fgt fgt = fbh.f16201i;
                FadeInImageView fadeInImageView = fbh.f16194b;
                bsxu bsxu = fbh.f16199g;
                if ((bsxu.f147619a & 2) != 0) {
                    z = true;
                }
                bswh bswh = bsxu.f147622d;
                if (bswh == null) {
                    bswh = bswh.f147430g;
                }
                evi.m11184a(fgt, fadeInImageView, z, bswh);
            } else {
                fbh.f16194b.setVisibility(8);
            }
            SearchItemsListView searchItemsListView = (SearchItemsListView) fbh.f16243j;
            bsxu bsxu2 = fbh.f16199g;
            if ((1 & bsxu2.f147619a) != 0) {
                bswf = bsxu2.f147621c;
                if (bswf == null) {
                    bswf = bswf.f147388f;
                }
            } else {
                bswf = null;
            }
            String str = fbh.f16200h;
            eww eww = searchItemsListView.f7776c;
            if (eww != null) {
                eww.mo10555a(eww.m11250a(list, bswf, str));
                eww.f15957d = str;
                eww.mo171aJ();
                return;
            }
            searchItemsListView.mo6333a(list, bswf, str);
        }
    }
}
