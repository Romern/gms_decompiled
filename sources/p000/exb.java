package p000;

import android.view.MenuItem;
import java.util.Collections;
import java.util.List;

/* renamed from: exb */
final /* synthetic */ class exb implements C0038ax {

    /* renamed from: a */
    private final exf f15964a;

    public exb(exf exf) {
        this.f15964a = exf;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        List list;
        exf exf = this.f15964a;
        bsxk bsxk = ((epq) obj).f15491a;
        if (bsxk.f147581b != 7) {
            list = Collections.emptyList();
        } else {
            list = ((bsva) bsxk.f147582c).f147221a;
        }
        List list2 = exf.f15972d;
        if (list2.size() == list.size()) {
            int size = list2.size();
            int i = 0;
            while (i < size) {
                if (bmxi.m108538a(((bsuv) list2.get(i)).f147201d, ((bsuv) list.get(i)).f147201d)) {
                    bswh bswh = ((bsuv) list2.get(i)).f147202e;
                    if (bswh == null) {
                        bswh = bswh.f147430g;
                    }
                    bswh bswh2 = ((bsuv) list.get(i)).f147202e;
                    if (bswh2 == null) {
                        bswh2 = bswh.f147430g;
                    }
                    if (bswh.f147433b == bswh2.f147433b && bmxi.m108538a(bswh.f147434c, bswh2.f147434c)) {
                        i++;
                    }
                }
            }
            return;
        }
        exf.f15972d = list;
        if (!list.isEmpty()) {
            exf.f15973e = true;
            exf.f15971c.f151068a.clear();
            for (int i2 = 0; i2 < list.size(); i2++) {
                bsuv bsuv = (bsuv) list.get(i2);
                MenuItem a = exf.f15971c.f151068a.mo16217a(0, exf.m11258a(i2), 0, bsuv.f147201d);
                if ((bsuv.f147198a & 2) != 0) {
                    bswh bswh3 = bsuv.f147202e;
                    if (bswh3 == null) {
                        bswh3 = bswh.f147430g;
                    }
                    bswg a2 = bswg.m116252a(bswh3.f147433b);
                    if (a2 == null) {
                        a2 = bswg.IMAGE_PLACEHOLDER_ICON;
                    }
                    if (cbro.m128200d()) {
                        a.setIcon(eve.m11168b(exf.getContext(), a2));
                    } else {
                        a.setIcon(eve.m11166a(exf.getContext(), a2));
                    }
                    bswh bswh4 = bsuv.f147202e;
                    if (bswh4 == null) {
                        bswh4 = bswh.f147430g;
                    }
                    if (!stm.m36302d(bswh4.f147434c)) {
                        fgt fgt = exf.f15974f;
                        bswh bswh5 = bsuv.f147202e;
                        if (bswh5 == null) {
                            bswh5 = bswh.f147430g;
                        }
                        fgt.mo10805a(bswh5.f147434c, new exe(exf, a));
                    }
                }
            }
            exf.f15973e = false;
            exf.mo10559b();
            exf.f15971c.setVisibility(0);
            return;
        }
        exf.f15971c.setVisibility(8);
    }
}
