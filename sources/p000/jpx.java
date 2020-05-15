package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.MutableBoolean;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: jpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpx extends aaab {

    /* renamed from: a */
    private static final sek f23016a = jsy.m17256a("GetSyncedDevices");

    /* renamed from: b */
    private static final long f23017b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    private final jsj f23018c;

    /* renamed from: d */
    private final ios f23019d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jpx(jsj jsj) {
        super(142, "GetSyncedDevices");
        ios a = inl.m15759a(rpr.m34216b());
        this.f23018c = jsj;
        this.f23019d = a;
    }

    /* renamed from: b */
    public static List m17092b(Context context) {
        ArrayList arrayList = new ArrayList();
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        try {
            new jpx(new jpw(arrayList, mutableBoolean)).mo6502a(context);
            if (!mutableBoolean.value) {
                return null;
            }
            return arrayList;
        } catch (aaaj | RemoteException e) {
            f23016a.mo25418e("Failed to fetch new device list.", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    private final void m17093c(Context context) {
        try {
            aucb a = this.f23019d.mo24701a((rpa) new inp("DeviceSync:BetterTogether"));
            aucu.m76783a(a, f23017b, TimeUnit.MILLISECONDS);
            List<DeviceMetadata> list = (List) a.mo50386d();
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (DeviceMetadata deviceMetadata : list) {
                    if (!deviceMetadata.f10525b.equals(addi.m50206a(context).mo33346b())) {
                        arrayList.add(deviceMetadata);
                    }
                }
            }
            List a2 = jkv.m16857a(arrayList, cchu.m129746b() ? m17094d(context) : bngx.m109376e());
            jsz.m17257a().mo14043a("get_synced_devices_backfill_count", a2.size() - arrayList.size());
            this.f23018c.mo13961a(Status.f30107a, a2);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new aaaj(8, e.getMessage());
        }
    }

    /* renamed from: d */
    private static final List m17094d(Context context) {
        ArrayList arrayList = new ArrayList();
        jtt a = jtu.m17328a(context);
        try {
            if (!a.mo14085b()) {
                f23016a.mo25416d("Initial sync not done", new Object[0]);
                jsz.m17257a().mo14068x(6);
                if (a != null) {
                    a.close();
                }
                return arrayList;
            }
            for (Map.Entry entry : a.mo14081a().entrySet()) {
                for (jrn jrn : (List) entry.getValue()) {
                    arrayList.add(jkq.m16850a(jrn, (String) entry.getKey()));
                }
            }
            jsz.m17257a().mo14068x(0);
            if (a != null) {
                a.close();
            }
            return arrayList;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (cchu.m129749e()) {
            m17093c(context);
            return;
        }
        this.f23018c.mo13961a(Status.f30107a, m17094d(context));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23018c.mo13961a(status, null);
    }
}
