package p000;

/* renamed from: fax */
final /* synthetic */ class fax implements C0038ax {

    /* renamed from: a */
    private final fbh f16182a;

    public fax(fbh fbh) {
        this.f16182a = fbh;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        fbh fbh = this.f16182a;
        bsul b = ((epq) obj).mo10395b();
        bsxs bsxs = b.f147150g;
        if (bsxs == null) {
            bsxs = bsxs.f147606f;
        }
        if ((bsxs.f147608a & 4) != 0) {
            bsxs bsxs2 = b.f147150g;
            if (bsxs2 == null) {
                bsxs2 = bsxs.f147606f;
            }
            bsxt bsxt = bsxs2.f147611d;
            if (bsxt == null) {
                bsxt = bsxt.f147613b;
            }
            if (!stm.m36302d(bsxt.f147615a)) {
                fbh.f16196d.mo1615a((CharSequence) bsxt.f147615a);
            }
        }
    }
}
