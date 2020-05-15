package com.google.android.gms.mdns;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdnsChimeraService extends zzx {

    /* renamed from: a */
    private agak f80063a;

    /* renamed from: b */
    private aaag f80064b;

    /* renamed from: k */
    private agah f80065k;

    /* renamed from: l */
    private agbt f80066l;

    public MdnsChimeraService() {
        super(168, "com.google.android.gms.mdns.service.START", Collections.emptySet(), 1, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        MdnsOptions mdnsOptions;
        byte[] byteArray;
        Bundle bundle = getServiceRequest.f30233g;
        if (bundle == null || (byteArray = bundle.getByteArray("MDNS_OPTIONS")) == null) {
            mdnsOptions = null;
        } else {
            mdnsOptions = (MdnsOptions) sef.m35069a(byteArray, MdnsOptions.CREATOR);
        }
        if (mdnsOptions != null) {
            aaac.mo16652a(new agbi(mdnsOptions, this.f80063a, this.f80064b));
        } else {
            aaac.mo16650a(8, (Bundle) null);
        }
    }

    public final void onCreate() {
        this.f80065k = new agah();
        WifiManager.MulticastLock createMulticastLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createMulticastLock("mdns-cast");
        createMulticastLock.setReferenceCounted(false);
        this.f80066l = new agbt(getApplicationContext(), createMulticastLock);
        agak agak = new agak(this.f80065k, this.f80066l);
        this.f80063a = agak;
        this.f80066l.mo35200a(agak);
        this.f80064b = new aaag(this, this.f56354e, this.f56355f);
    }

    public final void onDestroy() {
        this.f80064b = null;
        this.f80063a = null;
        this.f80066l = null;
        agah agah = this.f80065k;
        if (agah != null) {
            for (ScheduledExecutorService scheduledExecutorService : agah.f65070a) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }
}
