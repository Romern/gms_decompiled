package p000;

/* renamed from: adtx */
final /* synthetic */ class adtx implements C0038ax {

    /* renamed from: a */
    private final adty f62732a;

    public adtx(adty adty) {
        this.f62732a = adty;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo2511a(Object obj) {
        adty adty = this.f62732a;
        aduf aduf = (aduf) obj;
        aduf aduf2 = aduf.NORMAL;
        switch (aduf.ordinal()) {
            case 0:
                break;
            case 1:
                adty.f62734a.mo33822a(btur.SETTINGS_NEXT_STEPS_DOWNLOADING);
                adty.f62736c.mo64888a(false);
                adty.f62737d.setVisibility(0);
                return;
            case 2:
                adty.f62734a.mo33821a(602);
                adty.startActivityForResult(adty.f62734a.mo33820a(adty.getActivity().getIntent()), 1);
                adty.f62735b.f62763f.mo2450b((Object) false);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                adtr.m51193a(aduf).show(adty.getChildFragmentManager(), "dialog");
                break;
            default:
                return;
        }
        adty.f62734a.mo33822a(adty.f62738e);
        adty.f62736c.mo64888a(true);
        adty.f62737d.setVisibility(4);
    }
}
