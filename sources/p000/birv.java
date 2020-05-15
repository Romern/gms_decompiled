package p000;

/* renamed from: birv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum birv implements bxvp {
    MEDIA_CODEC_AUDIO_PCM(1),
    MEDIA_CODEC_AUDIO_AAC_LC(2),
    MEDIA_CODEC_VIDEO_H264_BP(3),
    MEDIA_CODEC_AUDIO_AAC_LC_ADTS(4),
    MEDIA_CODEC_VIDEO_VP9(5),
    MEDIA_CODEC_VIDEO_AV1(6),
    MEDIA_CODEC_VIDEO_H265(7);
    

    /* renamed from: h */
    public final int f121478h;

    private birv(int i) {
        this.f121478h = i;
    }

    /* renamed from: a */
    public static birv m102768a(int i) {
        switch (i) {
            case 1:
                return MEDIA_CODEC_AUDIO_PCM;
            case 2:
                return MEDIA_CODEC_AUDIO_AAC_LC;
            case 3:
                return MEDIA_CODEC_VIDEO_H264_BP;
            case 4:
                return MEDIA_CODEC_AUDIO_AAC_LC_ADTS;
            case 5:
                return MEDIA_CODEC_VIDEO_VP9;
            case 6:
                return MEDIA_CODEC_VIDEO_AV1;
            case 7:
                return MEDIA_CODEC_VIDEO_H265;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m102769b() {
        return biru.f121469a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121478h;
    }

    public final String toString() {
        return Integer.toString(this.f121478h);
    }
}
