package p000;

import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;

/* renamed from: ahdx */
public final /* synthetic */ class ahdx implements roo {

    /* renamed from: a */
    private final String f67066a;

    public ahdx(String str) {
        this.f67066a = str;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f67066a;
        ahdc ahdc = (ahdc) obj;
        rlf a = ahej.m55617a((aucf) obj2);
        ahdc.mo25288A();
        ((ahds) ahdc.mo25289B()).mo36354a(new ContinueConnectRequest(str, ahdo.m55569a(a)));
    }
}
