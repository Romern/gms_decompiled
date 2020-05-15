package p000;

import android.app.Notification;
import android.os.Build;

/* renamed from: jd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1101jd extends C1106ji {

    /* renamed from: a */
    private CharSequence f22205a;

    /* renamed from: a */
    public final void mo13568a(C1095iy iyVar) {
        int i = Build.VERSION.SDK_INT;
        new Notification.BigTextStyle(((C1109jl) iyVar).f22731a).setBigContentTitle(this.f22528c).bigText(this.f22205a);
    }

    /* renamed from: b */
    public final void mo13594b(CharSequence charSequence) {
        this.f22528c = C1102je.m16571a(charSequence);
    }

    /* renamed from: a */
    public final void mo13593a(CharSequence charSequence) {
        this.f22205a = C1102je.m16571a(charSequence);
    }
}
