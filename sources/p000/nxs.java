package p000;

/* renamed from: nxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nxs {
    /* renamed from: a */
    public static String m28138a(int i) {
        if (i == -3) {
            return "LOSS_TR_CAN_DUCK";
        }
        if (i == -2) {
            return "LOSS_TR";
        }
        if (i == -1) {
            return "LOSS";
        }
        if (i == 1) {
            return "GAIN";
        }
        if (i == 2) {
            return "GAIN_TR";
        }
        if (i == 3) {
            return "GAIN_TR_MAY_DUCK";
        }
        if (i == 4) {
            return "GAIN_TR_EXC";
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append("UNKNOWN:");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m28139a(bios bios) {
        if (bios == null) {
            return "null AudioFocusRequestType";
        }
        biou biou = biou.AUDIO_FOCUS_STATE_INVALID;
        int ordinal = bios.ordinal();
        if (ordinal == 0) {
            return "AUDIO_FOCUS_GAIN";
        }
        if (ordinal == 1) {
            return "AUDIO_FOCUS_GAIN_TRANSIENT";
        }
        if (ordinal == 2) {
            return "AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK";
        }
        if (ordinal == 3) {
            return "AUDIO_FOCUS_RELEASE";
        }
        String valueOf = String.valueOf(bios);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("Unknown AudioFocusRequestType: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static String m28140a(biou biou) {
        biou biou2 = biou.AUDIO_FOCUS_STATE_INVALID;
        bios bios = bios.AUDIO_FOCUS_GAIN;
        switch (biou.ordinal()) {
            case 0:
                return "AUDIO_FOCUS_STATE_INVALID";
            case 1:
                return "AUDIO_FOCUS_STATE_GAIN";
            case 2:
                return "AUDIO_FOCUS_STATE_GAIN_TRANSIENT";
            case 3:
                return "AUDIO_FOCUS_STATE_LOSS";
            case 4:
                return "AUDIO_FOCUS_STATE_LOSS_TRANSIENT_CAN_DUCK";
            case 5:
                return "AUDIO_FOCUS_STATE_LOSS_TRANSIENT";
            case 6:
                return "AUDIO_FOCUS_STATE_GAIN_MEDIA_ONLY";
            case 7:
                return "AUDIO_FOCUS_STATE_GAIN_TRANSIENT_GUIDANCE_ONLY";
            default:
                String valueOf = String.valueOf(biou);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Unknown AudioFocusStateType: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
