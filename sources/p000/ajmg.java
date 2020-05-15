package p000;

import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;

/* renamed from: ajmg */
final /* synthetic */ class ajmg implements Runnable {

    /* renamed from: a */
    private final ajmi f70905a;

    /* renamed from: b */
    private final OnShareTargetDiscoveredParams f70906b;

    /* renamed from: c */
    private final String f70907c;

    /* renamed from: d */
    private final ajsn f70908d;

    public ajmg(ajmi ajmi, OnShareTargetDiscoveredParams onShareTargetDiscoveredParams, String str, ajsn ajsn) {
        this.f70905a = ajmi;
        this.f70906b = onShareTargetDiscoveredParams;
        this.f70907c = str;
        this.f70908d = ajsn;
    }

    public final void run() {
        ajmi ajmi = this.f70905a;
        OnShareTargetDiscoveredParams onShareTargetDiscoveredParams = this.f70906b;
        String str = this.f70907c;
        ajsn ajsn = this.f70908d;
        ajmi.f70913b.f70922b.f70935c.f80911w.mo38802a(onShareTargetDiscoveredParams.f81089a, str);
        ajsn.mo38707a(onShareTargetDiscoveredParams.f81089a);
        srn srn = ajvp.f71371a;
    }
}
