package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Future;

/* renamed from: mje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mje extends mjj {

    /* renamed from: a */
    public static final lvn f33817a = new lvn("ConnectionlessSmartDeviceSourceController");

    /* renamed from: b */
    public final Context f33818b;

    /* renamed from: c */
    public final arba f33819c;

    /* renamed from: n */
    private boolean f33820n = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mje(Context context, mht mht, bqgj bqgj, arba arba) {
        super(mht, bqgj);
        bmxy.m108581a(mht);
        bmxy.m108581a(bqgj);
        bmxy.m108581a(context);
        this.f33818b = context;
        bmxy.m108581a(arba);
        this.f33819c = arba;
        f33817a.mo25414c("Using connectionless SourceDeviceClient", new Object[0]);
    }

    /* renamed from: a */
    public final void mo20086a() {
        if (!this.f33820n) {
            this.f33839m.f33740a = true;
            arba arba = this.f33819c;
            arba.mo48364n("source-direct-transfer");
            arba.mo24732b(new arkt());
            f33817a.mo25414c("Aborted Smart Device direct transfer", new Object[0]);
            mo20087b();
            this.f33820n = true;
            return;
        }
        f33817a.mo25414c("Duplicate transfer abort request.", new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20087b() {
        this.f33819c.mo48359a();
        ParcelFileDescriptor[] parcelFileDescriptorArr = this.f33834h;
        if (parcelFileDescriptorArr != null) {
            srz.m36170a(parcelFileDescriptorArr[0]);
            srz.m36170a(this.f33834h[1]);
            this.f33834h = null;
        }
        ParcelFileDescriptor[] parcelFileDescriptorArr2 = this.f33833g;
        if (parcelFileDescriptorArr2 != null) {
            srz.m36170a(parcelFileDescriptorArr2[0]);
            srz.m36170a(this.f33833g[1]);
            this.f33833g = null;
        }
        Future future = this.f33836j;
        if (future != null) {
            future.cancel(true);
            this.f33836j = null;
        }
        this.f33831e = null;
        this.f33832f = null;
        this.f33835i = new ByteArrayOutputStream();
    }

    /* renamed from: c */
    public final void mo20088c() {
        arba arba = this.f33819c;
        roz b = rpa.m34196b();
        b.f43472a = arke.f87804a;
        aucb a = arba.mo24701a(b.mo24977a());
        a.mo50372a(new miy(this));
        a.mo50373a(new miz(this));
    }
}
