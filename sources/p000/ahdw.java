package p000;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;

/* renamed from: ahdw */
public final /* synthetic */ class ahdw implements roo {

    /* renamed from: a */
    private final Device f67058a;

    /* renamed from: b */
    private final String f67059b;

    /* renamed from: c */
    private final String f67060c;

    /* renamed from: d */
    private final byte f67061d;

    /* renamed from: e */
    private final String f67062e;

    /* renamed from: f */
    private final byte f67063f;

    /* renamed from: g */
    private final ahdm f67064g;

    /* renamed from: h */
    private final ahdi f67065h;

    public ahdw(Device device, String str, String str2, byte b, String str3, byte b2, ahdi ahdi, ahdm ahdm) {
        this.f67058a = device;
        this.f67059b = str;
        this.f67060c = str2;
        this.f67061d = b;
        this.f67062e = str3;
        this.f67063f = b2;
        this.f67065h = ahdi;
        this.f67064g = ahdm;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Device device = this.f67058a;
        String str = this.f67059b;
        String str2 = this.f67060c;
        byte b = this.f67061d;
        String str3 = this.f67062e;
        byte b2 = this.f67063f;
        ahdi ahdi = this.f67065h;
        ahdm ahdm = this.f67064g;
        ahdc ahdc = (ahdc) obj;
        rlf a = ahej.m55617a((aucf) obj2);
        ahdc.mo25288A();
        ((ahds) ahdc.mo25289B()).mo36353a(new ConnectRequest(device, str, str2, b, str3, b2, ahdi, ahdm, ahdo.m55569a(a)));
    }
}
