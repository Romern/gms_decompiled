package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* renamed from: bhhn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhhn implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ MaterialCalendarGridView f118678a;

    /* renamed from: b */
    final /* synthetic */ bhhp f118679b;

    public bhhn(bhhp bhhp, MaterialCalendarGridView materialCalendarGridView) {
        this.f118679b = bhhp;
        this.f118678a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        bhhm a = this.f118678a.getAdapter();
        if (i >= a.mo63763a() && i <= a.mo63765b()) {
            bhgu bhgu = this.f118679b.f118682a;
            if (bhgu.f118626a.f118647b.f151167d.mo71130a(this.f118678a.getAdapter().getItem(i).longValue())) {
                bhgu.f118626a.f118641a.mo71138h();
                Iterator it = bhgu.f118626a.f118686ad.iterator();
                while (it.hasNext()) {
                    ((bhhq) it.next()).mo63756a(bhgu.f118626a.f118641a.mo71131a());
                }
                bhgu.f118626a.f118642aa.getAdapter().mo171aJ();
                RecyclerView recyclerView = bhgu.f118626a.f118640Z;
                if (recyclerView != null) {
                    recyclerView.getAdapter().mo171aJ();
                }
            }
        }
    }
}
