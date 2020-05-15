package p000;

import android.app.backup.SelectBackupTransportCallback;

/* renamed from: mai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mai extends SelectBackupTransportCallback {

    /* renamed from: a */
    final /* synthetic */ maj f33332a;

    public mai(maj maj) {
        this.f33332a = maj;
    }

    public final void onFailure(int i) {
        maj.f33333a.mo25418e("Failed to select %s. Reason: %d", this.f33332a.f33334b, Integer.valueOf(i));
        this.f33332a.mo19806c();
    }

    public final void onSuccess(String str) {
        maj.f33333a.mo25412b("Successfully selected transport: %s", str);
        this.f33332a.mo19806c();
    }
}
