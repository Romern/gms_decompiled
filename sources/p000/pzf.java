package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: pzf */
public final /* synthetic */ class pzf implements Callable {

    /* renamed from: a */
    private final pyz f40730a;

    /* renamed from: b */
    private final ClientContext f40731b;

    /* renamed from: c */
    private final bxvd f40732c;

    public pzf(pyz pyz, ClientContext clientContext, bxvd bxvd) {
        this.f40730a = pyz;
        this.f40731b = clientContext;
        this.f40732c = bxvd;
    }

    public final Object call() {
        pyz pyz = this.f40730a;
        ClientContext clientContext = this.f40731b;
        bshv bshv = (bshv) this.f40732c.mo74062i();
        if (pyz.f40699c == null) {
            pyz.f40699c = chtv.m149566a(chtu.UNARY, "google.internal.home.cloud.castsdk.v1.RelaycastService/CreateRelaycastSession", ciie.m150370a(bshv.f144631d), ciie.m150370a(bshw.f144636c));
        }
        return (bshw) pyz.f40700a.mo25553a(pyz.f40699c, clientContext, bshv, (long) pyz.f40698b, TimeUnit.MILLISECONDS);
    }
}
