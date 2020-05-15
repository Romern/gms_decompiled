package p000;

import android.hardware.Camera;

/* renamed from: akqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqy implements Camera.AutoFocusCallback {

    /* renamed from: a */
    final /* synthetic */ akqz f72473a;

    public akqy(akqz akqz) {
        this.f72473a = akqz;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        this.f72473a.f72474a.f72475a.set(false);
    }
}
