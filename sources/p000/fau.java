package p000;

/* renamed from: fau */
final /* synthetic */ class fau implements C0038ax {

    /* renamed from: a */
    private final fbh f16179a;

    public fau(fbh fbh) {
        this.f16179a = fbh;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        bsxu bsxu;
        fbh fbh = this.f16179a;
        bsxk bsxk = ((epq) obj).f15491a;
        if (bsxk.f147581b != 9 || ((bsxu) bsxk.f147582c).f147620b.size() == 0) {
            fbh.f16195c.setVisibility(8);
            return;
        }
        if (bsxk.f147581b == 9) {
            bsxu = (bsxu) bsxk.f147582c;
        } else {
            bsxu = bsxu.f147617e;
        }
        fbh.f16199g = bsxu;
        fbh.f16195c.setVisibility(0);
    }
}
