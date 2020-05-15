package p000;

import android.util.Log;
import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: bjag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjag implements AbsListView.OnScrollListener, bjar {

    /* renamed from: a */
    private final bjas f122415a;

    /* renamed from: b */
    private final ListView f122416b;

    public bjag(bjas bjas, ListView listView) {
        this.f122415a = bjas;
        this.f122416b = listView;
    }

    /* renamed from: a */
    public final void mo64943a() {
        ListView listView = this.f122416b;
        if (listView != null) {
            listView.setOnScrollListener(this);
            if (this.f122416b.getLastVisiblePosition() < this.f122416b.getAdapter().getCount()) {
                this.f122415a.mo64963a(true);
                return;
            }
            return;
        }
        Log.w("ListViewDelegate", "Cannot require scroll. List view is null");
    }

    /* renamed from: b */
    public final void mo64944b() {
        ListView listView = this.f122416b;
        if (listView != null) {
            this.f122416b.smoothScrollBy(listView.getHeight(), 500);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (i + i2 < i3) {
            this.f122415a.mo64963a(true);
        } else {
            this.f122415a.mo64963a(false);
        }
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
