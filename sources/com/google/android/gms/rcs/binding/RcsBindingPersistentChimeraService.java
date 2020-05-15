package com.google.android.gms.rcs.binding;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RcsBindingPersistentChimeraService extends Service {

    /* renamed from: a */
    private static final sek f83470a = aope.m66267a("RcsBindingPersistentChimeraService");

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        f83470a.mo25412b("Service created", new Object[0]);
    }

    public final void onDestroy() {
        f83470a.mo25412b("Service destroyed", new Object[0]);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        sek sek = f83470a;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Service started: ");
        sb.append(valueOf);
        sek.mo25412b(sb.toString(), new Object[0]);
        if (!aoov.m66242b()) {
            f83470a.mo25412b("Binding disabled by phenotype flag. Stopping service.", new Object[0]);
            stopSelf();
            return 2;
        }
        if (intent != null) {
            i3 = intent.getIntExtra("attempt", 0);
        } else {
            i3 = 0;
        }
        aoov a = aoov.m66238a();
        Status a2 = a.mo43133a(i3);
        aopb aopb = a.f78620b;
        String a3 = a.f78619a.mo43138a();
        String b = a.f78619a.mo43139b();
        int i4 = a2.f30115i;
        String c = a.f78619a.mo43140c();
        bxvd da = byby.f165608c.mo74144da();
        bxvd da2 = bycc.f165628g.mo74144da();
        String a4 = stm.m36299a(a3);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bycc bycc = (bycc) da2.f164949b;
        a4.getClass();
        bycc.f165630a |= 1;
        bycc.f165631b = a4;
        String a5 = stm.m36299a(b);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bycc bycc2 = (bycc) da2.f164949b;
        a5.getClass();
        int i5 = bycc2.f165630a | 2;
        bycc2.f165630a = i5;
        bycc2.f165632c = a5;
        int i6 = i5 | 4;
        bycc2.f165630a = i6;
        bycc2.f165633d = i3;
        int i7 = i6 | 8;
        bycc2.f165630a = i7;
        bycc2.f165634e = i4;
        c.getClass();
        bycc2.f165630a = i7 | 16;
        bycc2.f165635f = c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byby byby = (byby) da.f164949b;
        bycc bycc3 = (bycc) da2.mo74062i();
        bycc3.getClass();
        byby.f165611b = bycc3;
        byby.f165610a = 2;
        aopb.mo43143a((byby) da.mo74062i());
        if (Status.f30107a.equals(a2) || Status.f30111e.equals(a2)) {
            return 1;
        }
        stopSelf();
        return 2;
    }
}
