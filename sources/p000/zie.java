package p000;

import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zie implements zgf {

    /* renamed from: a */
    public static final srn f55127a = zvt.m46581a();

    /* renamed from: b */
    private final bngx f55128b;

    public zie(Iterable iterable) {
        this.f55128b = bngx.m109355a(iterable);
    }

    /* renamed from: a */
    static final /* synthetic */ Status m45502a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Status status = (Status) it.next();
            if (!status.mo17710c()) {
                bnsl bnsl = (bnsl) f55127a.mo68388c();
                bnsl.mo68432a("zie", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Sensor flush failed. Results may be stale. %s", status);
                return status;
            }
        }
        return Status.f30107a;
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        bngs j = bngx.m109377j();
        bnre i = this.f55128b.listIterator();
        while (i.hasNext()) {
            zgf zgf = (zgf) i.next();
            if (zgf.mo19159a(caah)) {
                bnre i2 = zgf.mo19161b(caah).listIterator();
                while (i2.hasNext()) {
                    caae caae = (caae) i2.next();
                    caah caah2 = caae.f172330f;
                    if (caah2 == null) {
                        caah2 = caah.f172333d;
                    }
                    if (bzzn.m126363a(caah2, caah)) {
                        j.mo67668c(caae);
                    } else {
                        throw new IllegalStateException(bmzh.m108675a("Adapter %s returned data source %s for data type %s", zgf, caae, caah));
                    }
                }
                continue;
            }
        }
        return j.mo67664a();
    }

    public final String toString() {
        return String.format("CompositeSensorAdapter{%s}", this.f55128b);
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        if (!cdzd.m135486o()) {
            return bqga.m112775a(Status.f30107a);
        }
        ArrayList arrayList = new ArrayList(this.f55128b.size());
        bnre i = this.f55128b.listIterator();
        while (i.hasNext()) {
            arrayList.add(((zgf) i.next()).mo19154a());
        }
        return bqdx.m112673a(bqga.m112774a((Iterable) arrayList), zid.f55126a, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        bnre i = this.f55128b.listIterator();
        while (i.hasNext()) {
            zgf zgf = (zgf) i.next();
            if (zgf.mo19158a(zgh.f55011a)) {
                return zgf.mo19155a(zgh);
            }
        }
        return bqga.m112775a((Object) false);
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
        bnre i = this.f55128b.listIterator();
        while (i.hasNext()) {
            ((zgf) i.next()).mo19156a(printWriter);
        }
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        bnre i = this.f55128b.listIterator();
        while (i.hasNext()) {
            if (((zgf) i.next()).mo19158a(caae)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        bnre i = this.f55128b.listIterator();
        while (i.hasNext()) {
            if (((zgf) i.next()).mo19159a(caah)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        bnre i = this.f55128b.listIterator();
        boolean z = false;
        while (i.hasNext()) {
            if (((zgf) i.next()).mo19160a(zgg)) {
                z = true;
            }
        }
        return z;
    }
}
