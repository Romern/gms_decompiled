package p000;

import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

/* renamed from: arkn */
public final /* synthetic */ class arkn implements roo {

    /* renamed from: a */
    private final ConnectionRequest f87822a;

    /* renamed from: b */
    private final arar f87823b;

    /* renamed from: c */
    private final arba f87824c;

    public arkn(arba arba, ConnectionRequest connectionRequest, arar arar) {
        this.f87824c = arba;
        this.f87822a = connectionRequest;
        this.f87823b = arar;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        arba arba = this.f87824c;
        ConnectionRequest connectionRequest = this.f87822a;
        arar arar = this.f87823b;
        arlb arlb = new arlb((aucf) obj2);
        ((ariw) ((arkb) obj).mo25289B()).mo48414a(new ConnectParams(new arjs(arlb), connectionRequest, arba.mo48358a(arar)));
    }
}
