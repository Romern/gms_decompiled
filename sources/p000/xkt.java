package p000;

import java.util.List;

/* renamed from: xkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkt {

    /* renamed from: a */
    public static final bnic f52596a = bnic.m109494a("txAuthSimple", "txAuthGeneric", "exts", "uvi", "loc", "uvm", "hmac-secret");

    /* renamed from: b */
    public static final bnic f52597b = bnic.m109490a("FIDO_2_0", "U2F_V2");

    /* renamed from: c */
    public boolean f52598c = false;

    /* renamed from: d */
    public boolean f52599d = false;

    /* renamed from: e */
    public boolean f52600e = true;

    /* renamed from: f */
    public boolean f52601f = false;

    /* renamed from: g */
    public Boolean f52602g = null;

    /* renamed from: h */
    public Long f52603h;

    /* renamed from: i */
    public List f52604i;

    /* renamed from: j */
    private List f52605j;

    /* renamed from: k */
    private List f52606k;

    /* renamed from: l */
    private byte[] f52607l;

    /* renamed from: a */
    public final xku mo29876a() {
        boolean z;
        boolean z2 = true;
        if (this.f52605j != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f52607l == null) {
            z2 = false;
        }
        sdo.m34970a(z2);
        return new xku(this.f52605j, this.f52606k, this.f52607l, this.f52598c, this.f52599d, this.f52600e, this.f52601f, this.f52602g, this.f52603h, this.f52604i);
    }

    /* renamed from: b */
    public final void mo29879b(List list) {
        sdo.m34974b(f52597b.containsAll(list));
        this.f52605j = list;
    }

    /* renamed from: a */
    public final void mo29877a(List list) {
        if (list != null) {
            sdo.m34974b(f52596a.containsAll(list));
        }
        this.f52606k = list;
    }

    /* renamed from: a */
    public final void mo29878a(byte[] bArr) {
        boolean z = false;
        if (bArr != null && bArr.length == 16) {
            z = true;
        }
        sdo.m34974b(z);
        this.f52607l = bArr;
    }
}
