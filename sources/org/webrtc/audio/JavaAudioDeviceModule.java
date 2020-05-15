package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JavaAudioDeviceModule {

    /* renamed from: a */
    public final Context f192093a;

    /* renamed from: b */
    public final AudioManager f192094b;

    /* renamed from: c */
    public final WebRtcAudioRecord f192095c;

    /* renamed from: d */
    public final WebRtcAudioTrack f192096d;

    /* renamed from: e */
    public final int f192097e;

    /* renamed from: f */
    public final int f192098f;

    /* renamed from: g */
    public final Object f192099g = new Object();

    /* renamed from: h */
    public long f192100h;

    public JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2) {
        this.f192093a = context;
        this.f192094b = audioManager;
        this.f192095c = webRtcAudioRecord;
        this.f192096d = webRtcAudioTrack;
        this.f192097e = i;
        this.f192098f = i2;
    }

    public static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2);
}
