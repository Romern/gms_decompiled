package p000;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

/* renamed from: res */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class res {

    /* renamed from: a */
    public Account f42823a;

    /* renamed from: b */
    public ArrayList f42824b;

    /* renamed from: c */
    public String f42825c;

    /* renamed from: d */
    public boolean f42826d = false;

    /* renamed from: e */
    public String f42827e;

    /* renamed from: f */
    public int f42828f = 0;

    /* renamed from: g */
    public String f42829g;

    /* renamed from: h */
    public reu f42830h;

    /* renamed from: i */
    private ArrayList f42831i;

    /* renamed from: j */
    private boolean f42832j = false;

    /* renamed from: k */
    private boolean f42833k = false;

    /* renamed from: a */
    public final rev mo24563a() {
        boolean z;
        if (!this.f42833k) {
            boolean z2 = true;
            if (this.f42829g == null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34975b(z, "We only support hostedDomain filter for account chip styled account picker");
            if (this.f42830h != null) {
                z2 = false;
            }
            sdo.m34975b(z2, "Consent is only valid for account chip styled account picker");
        }
        rev rev = new rev();
        rev.f42840c = this.f42831i;
        rev.f42839b = this.f42824b;
        rev.f42841d = this.f42832j;
        rev.f42847j = this.f42830h;
        rev.f42845h = this.f42829g;
        rev.f42838a = this.f42823a;
        rev.f42843f = this.f42826d;
        rev.f42848k = this.f42827e;
        rev.f42844g = this.f42828f;
        rev.f42842e = this.f42825c;
        rev.f42846i = this.f42833k;
        return rev;
    }

    /* renamed from: b */
    public final void mo24565b() {
        this.f42832j = true;
    }

    /* renamed from: c */
    public final void mo24566c() {
        this.f42833k = true;
    }

    /* renamed from: a */
    public final void mo24564a(List list) {
        this.f42831i = list != null ? new ArrayList(list) : null;
    }
}
