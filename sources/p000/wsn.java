package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import java.util.List;

/* renamed from: wsn */
final /* synthetic */ class wsn implements View.OnClickListener {

    /* renamed from: a */
    private final wsp f51253a;

    /* renamed from: b */
    private final RecyclerView f51254b;

    public wsn(wsp wsp, RecyclerView recyclerView) {
        this.f51253a = wsp;
        this.f51254b = recyclerView;
    }

    public void onClick(View view) {
        wsp wsp = this.f51253a;
        int childLayoutPosition = this.f51254b.getChildLayoutPosition(view);
        List list = wsp.f51258d;
        if (list != null && childLayoutPosition < list.size() && childLayoutPosition >= 0) {
            wse wse = wsp.f51257a;
            wts a = wts.m42239a(((ahza) wsp.f51258d.get(childLayoutPosition)).f68444b.mo73780k());
            wse.getSupportFragmentManager().beginTransaction().addToBackStack("fast_pair_account_settings").replace(16908290, a, "fast_pair_device_details").commit();
            buqu buqu = wse.f51235b;
            if (buqu != null) {
                buqu.mo73004a(a);
            }
        }
    }
}
