package com.google.android.gms.icing.service;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LightweightIndexChimeraService extends zzx {

    /* renamed from: a */
    private static acwv f79089a;

    /* renamed from: b */
    private static acwr f79090b;

    /* renamed from: k */
    private static acxo f79091k;

    /* renamed from: l */
    private abym f79092l;

    public LightweightIndexChimeraService() {
        super(19, "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE", Collections.emptySet(), 3, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac aaac2;
        aaac aaac3 = aaac;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        if (f79089a == null) {
            aaac2 = aaac3;
        } else if (f79090b == null || f79091k == null || this.f79092l == null) {
            aaac2 = aaac3;
        } else {
            aaac.mo16652a(new acrd(this, this.f56355f, aaag.m21013a(), getServiceRequest2.f30230d, getServiceRequest2.f30229c, f79091k, this.f79092l, new acxb(this), new abyp(this), abxp.m48475a(this), f79089a, f79090b, rfz.m33557a(this), new acap(this), new brin(this)));
            return;
        }
        absg.m48184a("LightweightIndexService is unavailable on this device");
        aaac2.mo16650a(16, new Bundle());
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        FileInputStream fileInputStream;
        printWriter.println("LightweightIndexChimeraService");
        acxo acxo = f79091k;
        if (acxo != null) {
            printWriter.println("  Pending usage reports:");
            File fileStreamPath = acxo.f61038a.getFileStreamPath(acxo.f61039b);
            try {
                fileInputStream = new FileInputStream(fileStreamPath);
                sta sta = new sta(fileInputStream, fileStreamPath.length(), abuu.class, (bxxk) abuu.f58469m.mo74142c(7));
                boolean isLoggable = Log.isLoggable("Icing", 2);
                while (sta.hasNext()) {
                    abuu abuu = (abuu) sta.next();
                    Object[] objArr = new Object[8];
                    boolean z = false;
                    objArr[0] = abuu.f58472b;
                    abuy a = abuy.m48299a(abuu.f58478h);
                    if (a == null) {
                        a = abuy.GENERAL_USE;
                    }
                    objArr[1] = a;
                    objArr[2] = Long.valueOf(abuu.f58477g);
                    if ((abuu.f58471a & 128) != 0) {
                        z = true;
                    }
                    objArr[3] = Boolean.valueOf(z);
                    objArr[4] = abuu.f58474d;
                    objArr[5] = abuu.f58475e;
                    objArr[6] = isLoggable ? abuu.f58476f : "<redacted>";
                    abtc a2 = abtc.m48241a(abuu.f58482l);
                    if (a2 == null) {
                        a2 = abtc.UNKNOWN;
                    }
                    objArr[7] = a2;
                    String valueOf = String.valueOf(String.format("From %s: type=%s, ts=%d, has_doc=%b Doc[package=%s corpus=%s, uri=%s, status=%s]", objArr));
                    printWriter.println(valueOf.length() == 0 ? new String("    ") : "    ".concat(valueOf));
                }
                fileInputStream.close();
            } catch (IOException e) {
                printWriter.println("    ".concat("<empty>"));
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
            printWriter.println();
        }
        acwv acwv = f79089a;
        if (acwv != null) {
            acwv.mo33181a(printWriter, "  ");
            return;
        }
        return;
        throw th;
    }

    public final void onCreate() {
        if (cemq.m137369f()) {
            synchronized (LightweightIndexChimeraService.class) {
                if (f79091k == null) {
                    f79091k = new acxo(this, "appdatasearch_usage");
                }
            }
            if (f79089a == null) {
                f79089a = new acwv();
            }
            if (f79090b == null) {
                f79090b = new acwr();
            }
            this.f79092l = new abym(this);
        }
    }

    public final void onDestroy() {
        acxo acxo = f79091k;
        if (acxo != null) {
            acxo.mo33214b();
        }
    }
}
