package p000;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: jc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1100jc extends C1106ji {

    /* renamed from: a */
    public Bitmap f22139a;

    /* renamed from: a */
    public final void mo13568a(C1095iy iyVar) {
        int i = Build.VERSION.SDK_INT;
        new Notification.BigPictureStyle(((C1109jl) iyVar).f22731a).setBigContentTitle(this.f22528c).bigPicture(this.f22139a);
    }
}
