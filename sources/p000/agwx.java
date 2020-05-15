package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwx extends acm {

    /* renamed from: s */
    public final agug f66756s = new agug();

    public agwx(View view) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0126R.C0129id.repurchase_list);
        view.getContext();
        aah aah = new aah();
        aah.mo62b(0);
        recyclerView.setLayoutManager(aah);
        recyclerView.setAdapter(this.f66756s);
    }
}
