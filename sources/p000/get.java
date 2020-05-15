package p000;

import android.media.AudioManager;

/* renamed from: get */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class get {

    /* renamed from: a */
    private final AudioManager f18074a;

    public get(AudioManager audioManager) {
        this.f18074a = audioManager;
    }

    /* renamed from: a */
    public final float mo11748a(int i) {
        float streamMaxVolume = ((float) (100 - ((int) ((((float) i) / ((float) this.f18074a.getStreamMaxVolume(3))) * 100.0f)))) * -0.5f;
        if (streamMaxVolume < 0.0f) {
            return (float) Math.exp((double) ((streamMaxVolume * 2.3025851f) / 20.0f));
        }
        return 1.0f;
    }
}
