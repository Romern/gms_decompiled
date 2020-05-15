package p000;

import android.view.View;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;

/* renamed from: akj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MediaRouteExpandCollapseButton f773a;

    public akj(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.f773a = mediaRouteExpandCollapseButton;
    }

    public void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.f773a;
        boolean z = !mediaRouteExpandCollapseButton.f1544e;
        mediaRouteExpandCollapseButton.f1544e = z;
        if (z) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f1540a);
            this.f773a.f1540a.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = this.f773a;
            mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.f1543d);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f1541b);
            this.f773a.f1541b.start();
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = this.f773a;
            mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.f1542c);
        }
        View.OnClickListener onClickListener = this.f773a.f1545f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
