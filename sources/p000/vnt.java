package p000;

import com.google.android.gms.drive.query.SortOrder;

/* renamed from: vnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vnt implements voa {

    /* renamed from: a */
    public final boolean f49591a;

    /* renamed from: b */
    private final String f49592b;

    /* renamed from: c */
    private final int f49593c;

    public vnt(String str, int i, boolean z) {
        sdo.m34959a((Object) str);
        this.f49592b = str;
        this.f49593c = i;
        this.f49591a = z;
    }

    /* renamed from: a */
    static int m40895a(txb txb) {
        int a = txb.mo24660a();
        int i = 0;
        while (a > i) {
            int i2 = (a + i) / 2;
            if (txb.mo24661a(i2).mo26859f()) {
                i = i2 + 1;
            } else {
                a = i2;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final String mo28672a() {
        return this.f49592b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28673a(vge vge);

    /* renamed from: b */
    public final int mo28674b() {
        return this.f49593c;
    }

    /* renamed from: c */
    public final SortOrder mo28675c() {
        vge vge = new vge();
        mo28673a(vge);
        return new SortOrder(vge.f49229a, this.f49591a);
    }
}
