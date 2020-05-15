package p000;

import android.content.Context;
import android.media.AudioManager;
import org.webrtc.audio.WebRtcAudioManager;

/* renamed from: ciuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciuu {

    /* renamed from: a */
    public final Context f191502a;

    /* renamed from: b */
    public final AudioManager f191503b;

    /* renamed from: c */
    public final int f191504c;

    /* renamed from: d */
    public final int f191505d;

    /* renamed from: e */
    public final boolean f191506e = ciuy.m151034a();

    /* renamed from: f */
    public final boolean f191507f = ciuy.m151036b();

    public ciuu(Context context) {
        this.f191502a = context;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f191503b = audioManager;
        this.f191504c = WebRtcAudioManager.getSampleRate(audioManager);
        this.f191505d = WebRtcAudioManager.getSampleRate(this.f191503b);
    }
}
