package p000;

import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: bkgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkgl extends bkgj {

    /* renamed from: a */
    public final ArrayList f124212a = new ArrayList();

    /* renamed from: e */
    public C1230nw f124213e = new C1230nw();

    /* renamed from: f */
    public C1230nw f124214f = new C1230nw();

    public bkgl() {
        super(null);
    }

    /* renamed from: a */
    public final void mo65995a(long j, boolean z) {
        bkgj bkgj = (bkgj) this.f124213e.mo15534a(j);
        if (bkgj == null) {
            this.f124214f.mo15540b(j, Boolean.valueOf(z));
        } else {
            bkgj.f124211d = z;
        }
    }

    /* renamed from: b */
    public final void mo65997b(bkgj bkgj) {
        this.f124212a.remove(bkgj);
        this.f124213e.mo15539b(bkgj.f124210c);
    }

    /* renamed from: a */
    public final void mo65996a(bkgj bkgj) {
        if (bkgj != null) {
            this.f124212a.add(bkgj);
            long j = bkgj.f124210c;
            if (j != 0) {
                this.f124213e.mo15540b(j, bkgj);
                Boolean bool = (Boolean) this.f124214f.mo15534a(j);
                if (bool != null) {
                    bkgj.f124211d = bool.booleanValue();
                    this.f124214f.mo15539b(j);
                }
            }
        }
    }

    public bkgl(bkgj... bkgjArr) {
        super(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65760a(TextView textView) {
        ArrayList arrayList = this.f124212a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bkgj bkgj = (bkgj) arrayList.get(i);
            i++;
            if (!bkgj.mo65994b(textView)) {
                this.f124209b = bkgj.mo65759a();
                return false;
            }
        }
        return true;
    }
}
