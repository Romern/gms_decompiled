package p000;

import android.content.DialogInterface;

/* renamed from: avio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avio implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ avip f93238a;

    public avio(avip avip) {
        this.f93238a = avip;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f93238a.cancel(true);
    }
}
