package p000;

/* renamed from: vbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbe extends vbk {

    /* renamed from: a */
    private Long f48916a;

    public vbe(vbh vbh) {
        super(vbh);
    }

    /* renamed from: a */
    public final void mo28192a(uos uos) {
        boolean z;
        if (this.f48916a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f48916a.longValue() > ((uij) uos.mo27777a()).f47690e) {
            ((uij) uos.mo27777a()).f47690e = this.f48916a.longValue();
            uos.mo27779c();
        }
        this.f48916a = null;
        super.mo28192a(uos);
    }

    /* renamed from: a */
    public final void mo28193a(uos uos, vkw vkw) {
        super.mo28193a(uos, vkw);
        sdo.m34970a(this.f48916a == null);
        Long l = vkw.f49423c;
        sdo.m34959a(l);
        this.f48916a = l;
    }
}
