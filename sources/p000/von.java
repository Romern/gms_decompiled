package p000;

import android.support.p002v7.widget.RecyclerView;
import com.google.android.gms.drive.p039ui.select.view.FileListView;

/* renamed from: von */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class von extends abz {

    /* renamed from: a */
    final /* synthetic */ FileListView f49680a;

    public von(FileListView fileListView) {
        this.f49680a = fileListView;
    }

    /* renamed from: a */
    public final void mo270a(RecyclerView recyclerView, int i) {
        abz abz = this.f49680a.f31224c;
        if (abz != null) {
            abz.mo270a(recyclerView, i);
        }
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        aah aah = (aah) recyclerView.getLayoutManager();
        int p = aah.mo83p();
        int q = aah.mo84q();
        int a = recyclerView.getAdapter().mo161a();
        voj voj = this.f49680a.f31222a;
        int i3 = (q - p) + 1;
        if (voj.f49661l != a && i3 > 0) {
            voj.f49661l = a;
            voj.f49662m = a / i3 >= 4;
        }
        if (voj.f49662m) {
            int i4 = a - i3;
            if (i4 > 0 && voj.f49667r != 3) {
                int i5 = voj.f49655f;
                voj.f49655f = ((voj.f49658i.getHeight() - voj.f49653d) * p) / i4;
                if (voj.f49671v) {
                    voj.mo28695c();
                    voj.f49671v = false;
                }
                if (voj.f49655f != i5) {
                    voj.f49672w.invalidate();
                }
            }
            voj.f49659j = true;
            if (p != voj.f49660k) {
                voj.f49660k = p;
                if (voj.f49667r != 3) {
                    voj.mo28690a(2);
                    voj.f49668s.postDelayed(voj.f49666q, 1500);
                }
            }
        } else if (voj.f49667r != 0) {
            voj.mo28690a(0);
        }
        abz abz = this.f49680a.f31224c;
        if (abz != null) {
            abz.mo271a(recyclerView, i, i2);
        }
    }
}
