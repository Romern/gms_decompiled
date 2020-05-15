package p000;

import com.google.android.gms.mdns.MdnsServiceInfo;

/* renamed from: aion */
final /* synthetic */ class aion implements Runnable {

    /* renamed from: a */
    private final String f69353a;

    /* renamed from: b */
    private final MdnsServiceInfo f69354b;

    /* renamed from: c */
    private final ahok f69355c;

    /* renamed from: d */
    private final aiou f69356d;

    public aion(aiou aiou, String str, MdnsServiceInfo mdnsServiceInfo, ahok ahok) {
        this.f69356d = aiou;
        this.f69353a = str;
        this.f69354b = mdnsServiceInfo;
        this.f69355c = ahok;
    }

    public final void run() {
        aiou aiou = this.f69356d;
        aiou.f69375b.mo37774a(this.f69353a, this.f69354b, this.f69355c);
    }
}
