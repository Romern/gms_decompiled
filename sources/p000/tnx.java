package p000;

import android.content.ClipboardManager;

/* renamed from: tnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnx {

    /* renamed from: a */
    public final trz f46365a;

    /* renamed from: b */
    public final adcf f46366b;

    /* renamed from: c */
    public final tpy f46367c;

    /* renamed from: d */
    public final ClipboardManager f46368d;

    public tnx(trz trz, adcf adcf, tpy tpy) {
        this.f46365a = trz;
        this.f46367c = tpy;
        this.f46366b = adcf;
        this.f46368d = (ClipboardManager) adcf.getActivity().getSystemService("clipboard");
        trz.f46572d.mo2445a(this.f46366b, new tnu(this));
    }
}
