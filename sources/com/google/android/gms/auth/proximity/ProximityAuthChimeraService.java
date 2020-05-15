package com.google.android.gms.auth.proximity;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProximityAuthChimeraService extends zzx {

    /* renamed from: a */
    public static final sek f11135a = jsy.m17256a("ProximityAuthService");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        aaac.mo16652a(new jml(getApplicationContext()));
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) "==== ProximityAuthService Dump ====\n");
        jnj a = jnj.m16961a();
        String str = a.f22881e;
        if (str == null) {
            printWriter.append((CharSequence) "\nMy device ID not yet set\n\n");
        } else {
            StringBuilder sb = new StringBuilder(str.length() + 24);
            sb.append("\nMy device ID suffix: ");
            sb.append(str);
            sb.append("\n\n");
            printWriter.append((CharSequence) sb.toString());
        }
        printWriter.append((CharSequence) "\nRegistered Devices: \n\n");
        List b = a.mo13907b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            String valueOf = String.valueOf((RemoteDevice) b.get(i));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb2.append(valueOf);
            sb2.append("\n");
            printWriter.append((CharSequence) sb2.toString());
        }
        super.dump(fileDescriptor, printWriter, strArr);
    }

    public ProximityAuthChimeraService() {
        super(108, "com.google.android.gms.auth.proximity.START", bnon.f131923a, 0, 10);
    }
}
