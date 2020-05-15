package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: apud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apud implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f84906a;

    /* renamed from: b */
    final /* synthetic */ apue f84907b;

    public apud(apue apue, int i) {
        this.f84907b = apue;
        this.f84906a = i;
    }

    public final void run() {
        int i = this.f84906a;
        if (i == 1) {
            this.f84907b.f84909a.mo47626a(new Status(0), 1);
        } else if (i == 3) {
            this.f84907b.f84910b.mo47626a(new Status(0), 0);
        }
        this.f84907b.mo47619a();
    }
}
