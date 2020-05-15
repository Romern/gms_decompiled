package p000;

import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.auth.proximity.gencode.server.api.BeaconSeedEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqx {

    /* renamed from: a */
    public byte[] f23091a = new byte[0];

    /* renamed from: b */
    public String f23092b = "";

    /* renamed from: c */
    public String f23093c = "";

    /* renamed from: d */
    public boolean f23094d = false;

    /* renamed from: e */
    public boolean f23095e = false;

    /* renamed from: f */
    public boolean f23096f = false;

    /* renamed from: g */
    public String f23097g;

    /* renamed from: h */
    public String f23098h;

    /* renamed from: i */
    public long f23099i = 0;

    /* renamed from: j */
    public boolean f23100j = false;

    /* renamed from: k */
    public boolean f23101k = false;

    /* renamed from: l */
    private final List f23102l = new ArrayList();

    /* renamed from: m */
    private final List f23103m = new ArrayList();

    /* renamed from: n */
    private final List f23104n = new ArrayList();

    /* renamed from: a */
    public final SyncedCryptauthDevice mo14006a() {
        return new SyncedCryptauthDevice(this.f23091a, this.f23092b, this.f23093c, this.f23097g, this.f23095e, this.f23094d, this.f23099i, this.f23096f, this.f23098h, this.f23100j, this.f23101k, this.f23102l, this.f23103m, this.f23104n);
    }

    /* renamed from: b */
    public final void mo14008b(List list) {
        this.f23103m.clear();
        this.f23103m.addAll(list);
    }

    /* renamed from: c */
    public final void mo14009c(List list) {
        this.f23102l.clear();
        this.f23102l.addAll(list);
    }

    /* renamed from: a */
    public final void mo14007a(List list) {
        if (list != null) {
            ArrayList a = rtz.m34456a(new ArrayList(list));
            this.f23104n.clear();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                this.f23104n.add((BeaconSeedEntity) ((jrh) a.get(i)));
            }
            return;
        }
        this.f23104n.clear();
    }
}
