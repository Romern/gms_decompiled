package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;

/* renamed from: lzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum lzx {
    BACKUP,
    RESTORE,
    LIST_DEVICES,
    CLEAR_DEVICE,
    GET_APP_BACKUP_STATS,
    SECONDARY_KEY_ROTATION_REQUEST,
    GET_APP_KEY_BLACKLIST_INFO,
    UNKNOWN;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    public static lzx m24742a(bxvd bxvd) {
        lth lth = (lth) bxvd.f164949b;
        int i = lth.f32916a;
        if ((i & 4096) != 0) {
            return LIST_DEVICES;
        }
        if ((i & 8192) != 0) {
            return CLEAR_DEVICE;
        }
        for (lsz lsz : Collections.unmodifiableList(lth.f32926k)) {
            if ((lsz.f32872a & 4) != 0) {
                return RESTORE;
            }
            if (lsz.f32876e.size() > 0 || lsz.f32878g.size() > 0 || lsz.f32877f.size() > 0) {
                return BACKUP;
            }
            while (r0.hasNext()) {
            }
        }
        if (ccnu.f179578a.mo6606a().mo76495e()) {
            int i2 = ((lth) bxvd.f164949b).f32916a;
            if ((i2 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                return GET_APP_BACKUP_STATS;
            }
            if ((i2 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
                return SECONDARY_KEY_ROTATION_REQUEST;
            }
        }
        return (!ccmw.m130709b() || (((lth) bxvd.f164949b).f32916a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) == 0) ? UNKNOWN : GET_APP_KEY_BLACKLIST_INFO;
    }
}
