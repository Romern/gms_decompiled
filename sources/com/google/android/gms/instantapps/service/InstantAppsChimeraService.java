package com.google.android.gms.instantapps.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstantAppsChimeraService extends sjh {
    public InstantAppsChimeraService() {
        super(121, "com.google.android.gms.instantapps.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        if (!adfv.m50332a(this).f61593r.mo33605a()) {
            sjj.mo25644a(16, null);
        } else {
            sjj.mo25645a(new adkm(this, getServiceRequest, sjn.m35483a(this, this.f44565c, this.f44566d)));
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        printWriter.println();
        adfv a = adfv.m50332a(this);
        if (!a.f61593r.mo33605a()) {
            printWriter.println("Disabled by KillSwitch");
            return;
        }
        printWriter.printf("Instant Apps enabled: %s\n", Boolean.valueOf(aykr.m84203a()));
        printWriter.printf("Accounts: %s\n", Arrays.toString(a.f61578c.mo33604d()));
        printWriter.printf("Opt-in account: %s\n", a.f61578c.mo33600a());
        printWriter.printf("Opt-in state: %s\n", Integer.valueOf(a.f61579d.mo33606a()));
        a.f61582g.mo33562a(printWriter);
    }
}
