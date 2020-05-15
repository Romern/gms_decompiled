package p000;

import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;

/* renamed from: xhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xhb {

    /* renamed from: l */
    public int f52270l = 0;

    /* renamed from: a */
    public abstract bqgg mo29726a();

    /* renamed from: a */
    public abstract void mo29727a(int i);

    /* renamed from: a */
    public abstract void mo29728a(ViewOptions viewOptions);

    /* renamed from: b */
    public abstract void mo29730b();

    /* renamed from: c */
    public abstract void mo29731c();

    /* renamed from: d */
    public abstract void mo29732d();

    /* renamed from: e */
    public abstract Transport mo29733e();

    /* renamed from: f */
    public abstract void mo29734f();

    /* renamed from: g */
    public final void mo29741g() {
        int i = this.f52270l;
        if (i == 1 || i == 3) {
            mo29730b();
            this.f52270l = 2;
        }
    }

    /* renamed from: h */
    public final void mo29742h() {
        if (this.f52270l == 2) {
            this.f52270l = 3;
            mo29731c();
        }
    }
}
