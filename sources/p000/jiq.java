package p000;

import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import com.google.android.gms.auth.proximity.ForceSyncFirstAccountIntentOperation;
import java.util.List;

/* renamed from: jiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jiq extends jmg {

    /* renamed from: a */
    final /* synthetic */ jta f22563a;

    /* renamed from: b */
    final /* synthetic */ jir f22564b;

    /* renamed from: c */
    final /* synthetic */ jiu f22565c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jiq(jiu jiu, jta jta, jir jir) {
        super(null);
        this.f22565c = jiu;
        this.f22563a = jta;
        this.f22564b = jir;
    }

    /* renamed from: a */
    public final void mo13765a() {
        this.f22565c.f22574g = false;
        this.f22565c.f22572e = null;
        this.f22563a.mo14046b(5);
        this.f22564b.mo13768a("Failed to fetch local device data.");
    }

    /* renamed from: a */
    public final void mo13766a(byte[] bArr, List list) {
        int i;
        jiu jiu = this.f22565c;
        int i2 = 2;
        if (!jiu.f22574g) {
            this.f22563a.mo14046b(2);
            this.f22564b.mo13768a("Advertising stopped during data fetch.");
            return;
        }
        BluetoothLeAdvertiser b = jiu.mo13771b();
        if (b != null) {
            jla jla = this.f22565c.f22571d;
            jkz a = jla.mo13843a(list, cchi.m129672d());
            jkw a2 = a != null ? jla.mo13841a(list, a.f22727a, a.f22728b) : null;
            if (a2 != null) {
                byte[] bArr2 = a2.f22722a;
                this.f22563a.mo14046b(0);
                jip jip = new jip(this, bArr2);
                this.f22565c.f22573f = jip;
                try {
                    AdvertiseSettings.Builder builder = new AdvertiseSettings.Builder();
                    if (cchf.m129661b()) {
                        i = (int) cchf.f178973a.mo6606a().mo75947a();
                    } else {
                        i = 1;
                    }
                    AdvertiseSettings.Builder connectable = builder.setAdvertiseMode(i).setConnectable(true);
                    if (cchf.m129661b()) {
                        i2 = (int) cchf.f178973a.mo6606a().mo75949c();
                    }
                    b.startAdvertising(connectable.setTxPowerLevel(i2).build(), new AdvertiseData.Builder().addServiceUuid(jiu.f22570c).addServiceData(jiu.f22570c, bArr2).build(), jip);
                } catch (NullPointerException e) {
                    jiu.f22568a.mo25412b("NullPointerException starting advertising.", new Object[0]);
                    jip.onStartFailure(4);
                }
            } else {
                this.f22563a.mo14046b(4);
                this.f22564b.mo13768a("Failed to generate EID data.");
                if (cchi.f178978a.mo6606a().mo75959i()) {
                    rpr b2 = rpr.m34216b();
                    b2.startService(ForceSyncFirstAccountIntentOperation.m6761a(b2));
                }
            }
        } else {
            this.f22563a.mo14046b(3);
            this.f22564b.mo13768a("Advertiser is null");
        }
    }
}
