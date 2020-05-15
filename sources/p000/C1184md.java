package p000;

import android.app.Notification;
import android.os.Build;
import android.widget.RemoteViews;

/* renamed from: md */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1184md extends C1106ji {

    /* renamed from: a */
    public int[] f26669a = null;

    /* renamed from: a */
    public final RemoteViews mo13755a() {
        int i = Build.VERSION.SDK_INT;
        return null;
    }

    /* renamed from: b */
    public final RemoteViews mo13756b() {
        int i = Build.VERSION.SDK_INT;
        return null;
    }

    /* renamed from: a */
    public final void mo13568a(C1095iy iyVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = ((C1109jl) iyVar).f22731a;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        int[] iArr = this.f26669a;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        builder.setStyle(mediaStyle);
    }
}
