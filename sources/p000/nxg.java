package p000;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.audiopolicy.AudioMix;
import android.media.audiopolicy.AudioMixingRule;
import android.media.audiopolicy.AudioPolicy;
import android.os.Build;
import android.os.Looper;

/* renamed from: nxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxg {

    /* renamed from: a */
    public final Object f36856a;

    /* renamed from: b */
    public final Object f36857b;

    /* renamed from: c */
    public final Object f36858c;

    /* renamed from: d */
    public final Context f36859d;

    static {
        odk.m28481a("CAR.AUDIO");
    }

    public nxg(Context context, boolean z, nxt nxt) {
        this.f36859d = context;
        AudioPolicy.Builder builder = new AudioPolicy.Builder(context);
        if (!z) {
            this.f36857b = m28105a(3, nxa.m28078a(3));
            this.f36858c = m28105a(5, nxa.m28078a(5));
            Object obj = this.f36857b;
            if (obj != null) {
                builder.addMix((AudioMix) obj);
            }
            Object obj2 = this.f36858c;
            if (obj2 != null) {
                builder.addMix((AudioMix) obj2);
            }
        } else {
            this.f36857b = null;
            this.f36858c = null;
        }
        int i = Build.VERSION.SDK_INT;
        builder.setAudioPolicyFocusListener(new nxf(nxt));
        AudioPolicy build = builder.setLooper(Looper.getMainLooper()).build();
        int registerAudioPolicy = ((AudioManager) context.getSystemService("audio")).registerAudioPolicy(build);
        if (registerAudioPolicy == 0) {
            this.f36856a = build;
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("registerAudioPolicy failed ");
        sb.append(registerAudioPolicy);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    private static Object m28105a(int i, int i2) {
        int i3;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        try {
            builder = (AudioAttributes.Builder) builder.getClass().getMethod("addTag", String.class).invoke(builder, "fixedVolume");
        } catch (ReflectiveOperationException e) {
            int i4 = Build.VERSION.SDK_INT;
        }
        bmxy.m108581a(builder);
        int i5 = 12;
        if (i == 3) {
            i3 = 1;
        } else {
            i3 = 12;
        }
        builder.setUsage(i3);
        AudioAttributes build = builder.build();
        AudioFormat.Builder encoding = new AudioFormat.Builder().setEncoding(2);
        if (i != 3) {
            i5 = 4;
        }
        return new AudioMix.Builder(new AudioMixingRule.Builder().addRule(build, 1).build()).setFormat(encoding.setChannelMask(i5).setSampleRate(i2).build()).setRouteFlags(2).build();
    }
}
