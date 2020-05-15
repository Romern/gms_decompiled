package p000;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;

/* renamed from: ged */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ged {

    /* renamed from: a */
    public AudioRecord f18020a;

    /* renamed from: b */
    public final int f18021b;

    /* renamed from: c */
    public final int f18022c;

    /* renamed from: d */
    public final boolean f18023d;

    /* renamed from: e */
    public final int f18024e;

    /* renamed from: f */
    public final int f18025f;

    protected ged(int i, int i2, boolean z, int i3, int i4) {
        this.f18021b = i;
        this.f18022c = i2;
        this.f18023d = z;
        this.f18024e = i3;
        this.f18025f = i4;
    }

    /* renamed from: a */
    public static int m13007a(int i) {
        double d = (double) i;
        double m = cfnp.f184595a.mo6606a().mo81699m();
        Double.isNaN(d);
        return (int) (d * m);
    }

    /* renamed from: a */
    private static int m13008a(String str) {
        try {
            return AudioFormat.class.getField(str).getInt(null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            srn srn = gdv.f17985a;
            return 1;
        }
    }

    /* renamed from: a */
    private static int m13009a(String str, boolean z) {
        if (z && "HOTWORD".equals(str)) {
            return 1999;
        }
        try {
            return MediaRecorder.AudioSource.class.getField(str).getInt(null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            srn srn = gdv.f17985a;
            return 0;
        }
    }

    /* renamed from: a */
    private static ged m13010a(int i, int i2) {
        String str;
        ged a = m13011a(i2, i, 16, false);
        if (a != null) {
            srn srn = gdv.f17985a;
            return a;
        } else if (i == 44100) {
            if (i2 != 0) {
                str = i2 != 1 ? i2 != 5 ? i2 != 6 ? i2 != 1999 ? "UNKNOWN" : "HOTWORD" : "VOICE_RECOGNITION" : "CAMCORDER" : "MIC";
            } else {
                str = "DEFAULT";
            }
            StringBuilder sb = new StringBuilder(str.length() + 76);
            sb.append("Unable to create a mono recording configuration for source ");
            sb.append(str);
            sb.append(" at 44100hz");
            throw new IllegalStateException(sb.toString());
        } else {
            srn srn2 = gdv.f17985a;
            return m13010a(44100, i2);
        }
    }

    /* renamed from: a */
    private static ged m13011a(int i, int i2, int i3, boolean z) {
        int minBufferSize = AudioRecord.getMinBufferSize(i2, i3, 2);
        if (minBufferSize <= 0) {
            return null;
        }
        AudioRecord audioRecord = new AudioRecord(i, i2, i3, 2, m13007a(minBufferSize));
        if (audioRecord.getState() != 1) {
            return null;
        }
        audioRecord.release();
        return new ged(i3, i, z, i2, minBufferSize);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ged.a(java.lang.String, boolean):int
     arg types: [java.lang.String, int]
     candidates:
      ged.a(int, int):ged
      ged.a(java.lang.String, boolean):int */
    /* renamed from: a */
    public static ged m13012a(Context context) {
        String[] split;
        int a = m13009a(cfnp.m140680c(), true);
        int r = (int) cfnp.f184595a.mo6606a().mo81704r();
        int checkPermission = context.getPackageManager().checkPermission("android.permission.CAPTURE_AUDIO_HOTWORD", context.getPackageName());
        if (a == 1999 && checkPermission != 0) {
            srn srn = gdv.f17985a;
            a = m13009a(cfnp.f184595a.mo6606a().mo81702p(), false);
        }
        if (!cfnp.f184595a.mo6606a().mo81705s()) {
            return m13010a(r, a);
        }
        int i = 0;
        for (String str : cfnp.f184595a.mo6606a().mo81703q().split("\\|")) {
            i |= m13008a(str);
        }
        ged a2 = m13011a(a, r, i, true);
        if (a2 != null) {
            return a2;
        }
        ged a3 = m13011a(6, r, 48, true);
        if (a3 != null) {
            srn srn2 = gdv.f17985a;
            return a3;
        }
        ged a4 = m13011a(5, r, 12, true);
        if (a4 != null) {
            srn srn3 = gdv.f17985a;
            return a4;
        }
        srn srn4 = gdv.f17985a;
        return m13010a(r, a);
    }
}
