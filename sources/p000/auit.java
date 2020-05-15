package p000;

import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.thunderbird.state.ActivationInfo;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: auit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class auit extends auiz {

    /* renamed from: a */
    private bqgg f91913a;

    /* renamed from: b */
    private bqgg f91914b;

    /* renamed from: d */
    public final augv f91915d;

    /* renamed from: e */
    public final List f91916e = new ArrayList(1);

    /* renamed from: f */
    public EmergencyInfo f91917f;

    /* renamed from: g */
    public boolean f91918g;

    /* renamed from: h */
    public int f91919h;

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public auit(augv augv, EmergencyInfo emergencyInfo, Iterable r7) {
        this.f91915d = augv;
        this.f91917f = emergencyInfo;
        int size = r7.size();
        for (int i = 0; i < size; i++) {
            aufy aufy = (aufy) r7.get(i);
            this.f91916e.add(new auiq(this, aufy.f91746a, aufy.f91747b));
        }
        this.f91914b = null;
    }

    /* renamed from: a */
    public bqgg mo50551a() {
        boolean z;
        if (this.f91914b == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        if (cgyq.f188062a.mo6606a().mo84776t() && this.f91917f.f109087b.size() == 1 && ((DeviceState) this.f91917f.f109087b.get(0)).f109081e == null) {
            this.f91918g = true;
            if (auho.m77070a()) {
                Log.d("Thunderbird", "attempting constellation verification");
            }
            Bundle bundle = new Bundle(1);
            bundle.putString("policy_id", "emergency_location");
            aucb a = this.f91915d.mo50518b().mo26222a(bundle);
            bqgy c = bqgy.m112818c();
            a.mo50378a(bqfb.INSTANCE, new auib(c));
            bqga.m112781a(c, new auis(this), this.f91915d.f91796a);
            this.f91913a = c;
        }
        ArrayList arrayList = new ArrayList(this.f91916e.size());
        List list = this.f91916e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            auiq auiq = (auiq) list.get(i);
            auiq.mo50557a(1);
            auip auip = auiq.f91898d;
            snl.m35700a(auip);
            arrayList.add(auip);
        }
        bqgg a2 = bqga.m112782b(arrayList).mo69215a(new auir(this), this.f91915d.f91796a);
        this.f91914b = a2;
        return bqdx.m112673a(a2, bmxm.m108539a(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public void mo50570a(auit auit) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo50552b() {
        bqgg bqgg = this.f91913a;
        if (bqgg != null) {
            bqgg.cancel(true);
        }
        if (auho.m77070a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append(valueOf);
            sb.append(" emergency complete");
            Log.d("Thunderbird", sb.toString());
        }
    }

    /* renamed from: bL */
    public final ActivationInfo mo50561bL() {
        return this.f91917f.f109086a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bN */
    public final augv mo50572bN() {
        return this.f91915d;
    }

    /* renamed from: a */
    public final void mo50571a(bmxz bmxz) {
        this.f91917f = this.f91917f.mo59536a(bmxz);
        List list = this.f91916e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            auiq auiq = (auiq) list.get(i);
            if (auiq.f91900f < 4) {
                auiq.f91899e = auiq.f91899e.mo59536a(bmxz);
                auiq.mo50560b((Location) null);
            }
        }
    }
}
