package p000;

import java.util.Map;

/* renamed from: bchp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bchp {

    /* renamed from: a */
    public bmxv f104170a;

    /* renamed from: b */
    public bmxv f104171b;

    /* renamed from: c */
    public bmxv f104172c;

    /* renamed from: d */
    public bmxv f104173d;

    /* renamed from: e */
    private String f104174e;

    /* renamed from: f */
    private bmxv f104175f;

    /* renamed from: g */
    private bmxv f104176g;

    /* renamed from: h */
    private String f104177h;

    /* renamed from: i */
    private bnhe f104178i;

    /* renamed from: j */
    private bngx f104179j;

    /* renamed from: k */
    private bngx f104180k;

    public bchp() {
    }

    /* renamed from: a */
    public final bchq mo56889a() {
        String str = this.f104174e == null ? " name" : "";
        if (this.f104177h == null) {
            str = str.concat(" contentType");
        }
        if (this.f104178i == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.f104179j == null) {
            str = String.valueOf(str).concat(" menuItems");
        }
        if (this.f104180k == null) {
            str = String.valueOf(str).concat(" toolbarButtons");
        }
        if (str.isEmpty()) {
            return new bcgw(this.f104174e, this.f104170a, this.f104175f, this.f104176g, this.f104177h, this.f104171b, this.f104178i, this.f104179j, this.f104180k, this.f104172c, this.f104173d);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo56894b(bngx bngx) {
        if (bngx != null) {
            this.f104180k = bngx;
            return;
        }
        throw new NullPointerException("Null toolbarButtons");
    }

    /* renamed from: c */
    public final void mo56896c(String str) {
        if (str != null) {
            this.f104174e = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: b */
    public final void mo56895b(String str) {
        this.f104175f = bmxv.m108566b(str);
    }

    public bchp(byte[] bArr) {
        this.f104170a = bmvz.f131120a;
        this.f104175f = bmvz.f131120a;
        this.f104176g = bmvz.f131120a;
        this.f104171b = bmvz.f131120a;
        this.f104172c = bmvz.f131120a;
        this.f104173d = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo56890a(bngx bngx) {
        if (bngx != null) {
            this.f104179j = bngx;
            return;
        }
        throw new NullPointerException("Null menuItems");
    }

    /* renamed from: a */
    public final void mo56891a(String str) {
        if (str != null) {
            this.f104177h = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    /* renamed from: a */
    public final void mo56892a(Map map) {
        this.f104178i = bnhe.m109413a(map);
    }

    /* renamed from: a */
    public final void mo56893a(byte[] bArr) {
        this.f104176g = bmxv.m108566b(bArr);
    }
}
