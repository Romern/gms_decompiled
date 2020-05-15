package p000;

import com.google.android.gms.auth.authzen.PermitAccess;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ifn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifn {

    /* renamed from: a */
    public String f20866a = "";

    /* renamed from: b */
    public String f20867b = "AUTHZEN_PUBLIC_KEY";

    /* renamed from: c */
    public byte[] f20868c = new byte[0];

    /* renamed from: d */
    public String f20869d = "";

    /* renamed from: e */
    public boolean f20870e = false;

    /* renamed from: f */
    public boolean f20871f = false;

    /* renamed from: g */
    public boolean f20872g = false;

    /* renamed from: h */
    public String f20873h;

    /* renamed from: i */
    public String f20874i;

    /* renamed from: j */
    public long f20875j = 0;

    /* renamed from: k */
    public boolean f20876k = false;

    /* renamed from: l */
    public boolean f20877l = false;

    /* renamed from: m */
    private final List f20878m = new ArrayList();

    /* renamed from: a */
    public final PermitAccess mo12970a() {
        return new PermitAccess(4, this.f20866a, this.f20867b, this.f20868c, this.f20869d, this.f20870e, this.f20871f, this.f20872g, this.f20873h, this.f20874i, this.f20878m, this.f20875j, this.f20876k, this.f20877l);
    }

    /* renamed from: a */
    public final void mo12971a(List list) {
        if (list != null) {
            ArrayList a = rtz.m34456a(new ArrayList(list));
            this.f20878m.clear();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                this.f20878m.add((BeaconSeedEntity) ((ihh) a.get(i)));
            }
            return;
        }
        this.f20878m.clear();
    }
}
