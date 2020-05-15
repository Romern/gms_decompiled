package p000;

import android.content.Context;

/* renamed from: aiyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyz {

    /* renamed from: a */
    public final ajgo f70125a;

    /* renamed from: b */
    public final aizm f70126b;

    /* renamed from: c */
    public final ajgo f70127c;

    /* renamed from: d */
    public final aizm f70128d;

    /* renamed from: e */
    private final aiyy f70129e;

    /* renamed from: f */
    private final aiyy f70130f;

    public aiyz(Context context) {
        this.f70129e = new aiyy(context, bzbu.AUDIO_AUDIBLE_DTMF);
        this.f70125a = new aizk(context, this.f70129e, bzbu.AUDIO_AUDIBLE_DTMF);
        this.f70126b = new aizm(context, this.f70129e, bzbu.AUDIO_AUDIBLE_DTMF);
        this.f70130f = new aiyy(context, bzbu.AUDIO_ULTRASOUND_PASSBAND);
        this.f70127c = new aizk(context, this.f70130f, bzbu.AUDIO_ULTRASOUND_PASSBAND);
        this.f70128d = new aizm(context, this.f70130f, bzbu.AUDIO_ULTRASOUND_PASSBAND);
    }
}
