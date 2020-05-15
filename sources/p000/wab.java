package p000;

import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.dynamiclinks.service.DynamicLinksApiChimeraService;

/* renamed from: wab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wab extends brsn implements aaai {

    /* renamed from: a */
    private final DynamicLinksApiChimeraService f50312a;

    /* renamed from: b */
    private final aaag f50313b;

    /* renamed from: c */
    private final String f50314c;

    /* renamed from: d */
    private final int f50315d;

    public wab(DynamicLinksApiChimeraService dynamicLinksApiChimeraService, aaag aaag, String str, int i) {
        this.f50312a = dynamicLinksApiChimeraService;
        this.f50313b = aaag;
        this.f50314c = str;
        this.f50315d = i;
    }

    /* renamed from: a */
    public final void mo29002a(brsm brsm, Bundle bundle) {
        this.f50313b.mo16659a(this.f50312a, new wac(brsm, this.f50314c, bundle));
    }

    /* renamed from: a */
    public final void mo29003a(brsm brsm, String str) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        clientContext.f30215e = this.f50314c;
        clientContext.f30216f = this.f50312a.getPackageName();
        this.f50313b.mo16659a(this.f50312a, new wae(brsm, str, clientContext, vzz.m41646a(this.f50312a), this.f50315d));
    }
}
