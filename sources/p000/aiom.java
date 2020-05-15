package p000;

import com.google.android.gms.mdns.MdnsServiceInfo;

/* renamed from: aiom */
final /* synthetic */ class aiom implements Runnable {

    /* renamed from: a */
    private final String f69349a;

    /* renamed from: b */
    private final MdnsServiceInfo f69350b;

    /* renamed from: c */
    private final ahok f69351c;

    /* renamed from: d */
    private final aiou f69352d;

    public aiom(aiou aiou, String str, MdnsServiceInfo mdnsServiceInfo, ahok ahok) {
        this.f69352d = aiou;
        this.f69349a = str;
        this.f69350b = mdnsServiceInfo;
        this.f69351c = ahok;
    }

    public final void run() {
        aiou aiou = this.f69352d;
        aiou.f69375b.mo37774a(this.f69349a, this.f69350b, this.f69351c);
    }
}
