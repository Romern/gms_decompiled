package p000;

import android.widget.ListView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.feedback.PreviewChimeraActivity;

/* renamed from: wve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wve implements Runnable {

    /* renamed from: a */
    final /* synthetic */ wvg f51404a;

    public wve(wvg wvg) {
        this.f51404a = wvg;
    }

    public final void run() {
        wvg wvg;
        wvg wvg2 = this.f51404a;
        wwy wwy = FeedbackChimeraActivity.f31574e;
        if (wwy.mo29514d()) {
            PreviewChimeraActivity previewChimeraActivity = wvg2.f51412b;
            ListView listView = (ListView) previewChimeraActivity.findViewById(C0126R.C0129id.list);
            boolean z = false;
            if (!(listView == null || previewChimeraActivity.f31618b == null || listView.getLastVisiblePosition() != previewChimeraActivity.f31618b.getCount() - 1)) {
                z = true;
            }
            wvg2.f51411a.remove(wvg2.getCount() - 1);
            wvg2.mo29447a(wwy.mo29517g());
            wvg2.notifyDataSetChanged();
            if (z) {
                PreviewChimeraActivity previewChimeraActivity2 = wvg2.f51412b;
                ListView listView2 = (ListView) previewChimeraActivity2.findViewById(C0126R.C0129id.list);
                if (listView2 != null && (wvg = previewChimeraActivity2.f31618b) != null) {
                    listView2.smoothScrollToPosition(wvg.getCount() - 1);
                    return;
                }
                return;
            }
            return;
        }
        wvg2.mo29446a();
    }
}
