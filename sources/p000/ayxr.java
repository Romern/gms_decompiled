package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: ayxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxr {

    /* renamed from: a */
    final /* synthetic */ ayxs f98693a;

    /* renamed from: b */
    private int f98694b = -1;

    public ayxr(ayxs ayxs) {
        this.f98693a = ayxs;
    }

    /* renamed from: a */
    public final void mo54518a(aywp aywp) {
        boolean z;
        bmxy.m108600b(aywp.mo54485b());
        bxvf bxvf = aywp.f98639e;
        bptu bptu = ((aywu) bxvf.f164949b).f98654c;
        if (bptu == null) {
            bptu = bptu.f139179e;
        }
        if ((bptu.f139181a & 2048) != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        int a = bpca.m111766a(((aywu) bxvf.f164949b).f98655d);
        if (a == 0 || a == 1) {
            int size = this.f98693a.f98699e.size();
            this.f98693a.f98699e.add(aywp.mo54483a());
            this.f98693a.f98700f.put(size, this.f98694b);
            int i = this.f98694b;
            this.f98694b = size;
            ayww ayww = (ayww) aywp.f98637b;
            View view = ayww.f98659a;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ayww.m85001a(viewGroup.getChildAt(i2), this);
                }
            }
            List list = ayww.f98663e;
            if (list != null) {
                for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                    mo54518a((aywp) ayww.f98663e.get(size2));
                }
            }
            this.f98694b = i;
        }
    }
}
