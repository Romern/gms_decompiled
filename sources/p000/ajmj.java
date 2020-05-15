package p000;

import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: ajmj */
final /* synthetic */ class ajmj implements Runnable {

    /* renamed from: a */
    private final ajmk f70914a;

    /* renamed from: b */
    private final OnTransferUpdateParams f70915b;

    /* renamed from: c */
    private final String f70916c;

    /* renamed from: d */
    private final ajud f70917d;

    public ajmj(ajmk ajmk, OnTransferUpdateParams onTransferUpdateParams, String str, ajud ajud) {
        this.f70914a = ajmk;
        this.f70915b = onTransferUpdateParams;
        this.f70916c = str;
        this.f70917d = ajud;
    }

    public final void run() {
        ajmk ajmk = this.f70914a;
        OnTransferUpdateParams onTransferUpdateParams = this.f70915b;
        String str = this.f70916c;
        ajud ajud = this.f70917d;
        if (onTransferUpdateParams.f81094b.f81052a == 2) {
            ajmk.f70919b.f70922b.f70935c.f80911w.mo38802a(onTransferUpdateParams.f81093a, str);
        }
        ajud.mo38711a(onTransferUpdateParams.f81093a, onTransferUpdateParams.f81094b);
    }
}
