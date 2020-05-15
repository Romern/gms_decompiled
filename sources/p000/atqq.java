package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.google.android.gms.tapandpay.tokenization.SelectUntokenizedCardChimeraActivity;

/* renamed from: atqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atqq implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ ListView f90681a;

    /* renamed from: b */
    final /* synthetic */ View f90682b;

    /* renamed from: c */
    final /* synthetic */ View f90683c;

    /* renamed from: d */
    final /* synthetic */ SelectUntokenizedCardChimeraActivity f90684d;

    public atqq(SelectUntokenizedCardChimeraActivity selectUntokenizedCardChimeraActivity, ListView listView, View view, View view2) {
        this.f90684d = selectUntokenizedCardChimeraActivity;
        this.f90681a = listView;
        this.f90682b = view;
        this.f90683c = view2;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f90684d.mo59454a(this.f90681a, this.f90682b, this.f90683c);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
