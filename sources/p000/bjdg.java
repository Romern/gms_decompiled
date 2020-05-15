package p000;

import com.google.android.gms.common.internal.ClientIdentity;
import java.util.List;

/* renamed from: bjdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjdg implements bhqe {

    /* renamed from: a */
    public final int f122538a;

    /* renamed from: b */
    public final String f122539b;

    /* renamed from: c */
    public final String f122540c;

    /* renamed from: d */
    public final int f122541d;

    /* renamed from: e */
    public final long f122542e;

    /* renamed from: f */
    public final bicz f122543f;

    /* renamed from: g */
    private final String[] f122544g = {"android:monitor_location"};

    /* renamed from: h */
    private final bhqx f122545h;

    public bjdg(bicz bicz, int i, String str, String str2, int i2, long j, bhqx bhqx) {
        this.f122543f = bicz;
        this.f122538a = i;
        this.f122539b = str;
        this.f122540c = str2;
        this.f122545h = bhqx;
        this.f122542e = j;
        this.f122541d = i2;
    }

    /* renamed from: a */
    public final void mo64999a(bhqz bhqz) {
        this.f122545h.mo64174a(bhqz);
    }

    /* renamed from: b */
    public final void mo64158b() {
        bicz bicz = this.f122543f;
        bicz.f120272e.add(this);
        ClientIdentity clientIdentity = new ClientIdentity(this.f122538a, this.f122539b);
        bicz.f120270c.mo64602a(this.f122541d, this.f122542e, clientIdentity);
    }

    /* renamed from: c */
    public final void mo64159c() {
        bicz bicz = this.f122543f;
        bicz.f120272e.remove(this);
        ClientIdentity clientIdentity = new ClientIdentity(this.f122538a, this.f122539b);
        int i = this.f122541d;
        long j = this.f122542e;
        bigx bigx = bicz.f120270c;
        sdo.m34974b(true);
        if (j < 0) {
            j = bigx.mo64600a(i);
        }
        if (bigx.f120564n.remove(new bigw(i, j, clientIdentity))) {
            if (i == bigx.f120569s) {
                List list = bigx.f120564n;
                int size = list.size();
                int i2 = -1;
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = ((bigw) list.get(i3)).f120546a;
                    if (i2 < i4) {
                        i2 = i4;
                    }
                }
                bigx.f120569s = i2;
            }
            bigx.mo64604b();
        }
    }

    /* renamed from: j */
    public final int mo9757j() {
        return this.f122538a;
    }

    /* renamed from: k */
    public final String mo9758k() {
        return this.f122539b;
    }

    /* renamed from: l */
    public final String mo9759l() {
        return null;
    }

    /* renamed from: m */
    public final String[] mo9760m() {
        return this.f122544g;
    }

    /* renamed from: n */
    public final boolean mo9761n() {
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("clientPackage", this.f122539b);
        a.mo25396a("accountName", this.f122540c);
        a.mo25396a("signalPriority", Integer.valueOf(this.f122541d));
        a.mo25396a("updateIntervalMillis", Long.valueOf(this.f122542e));
        return a.toString();
    }
}
