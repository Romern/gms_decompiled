package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.drive.p039ui.select.view.FastScrollerSwipeRefreshLayout;
import com.google.android.gms.drive.p039ui.select.view.FileListView;

/* renamed from: vok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vok implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ FastScrollerSwipeRefreshLayout f49678a;

    public vok(FastScrollerSwipeRefreshLayout fastScrollerSwipeRefreshLayout) {
        this.f49678a = fastScrollerSwipeRefreshLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof FileListView) {
            this.f49678a.f31221m = ((FileListView) view2).f31222a;
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        if (view2 instanceof FileListView) {
            this.f49678a.f31221m = null;
        }
    }
}
