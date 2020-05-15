package p000;

import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: ajmh */
final /* synthetic */ class ajmh implements Runnable {

    /* renamed from: a */
    private final ajmi f70909a;

    /* renamed from: b */
    private final OnShareTargetLostParams f70910b;

    /* renamed from: c */
    private final ajsn f70911c;

    public ajmh(ajmi ajmi, OnShareTargetLostParams onShareTargetLostParams, ajsn ajsn) {
        this.f70909a = ajmi;
        this.f70910b = onShareTargetLostParams;
        this.f70911c = ajsn;
    }

    public final void run() {
        ajmi ajmi = this.f70909a;
        OnShareTargetLostParams onShareTargetLostParams = this.f70910b;
        ajsn ajsn = this.f70911c;
        ajmi.f70913b.f70922b.f70935c.f80911w.mo38807c(onShareTargetLostParams.f81092a);
        ajsn.mo38709b(onShareTargetLostParams.f81092a);
    }
}
