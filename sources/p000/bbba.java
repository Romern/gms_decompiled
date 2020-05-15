package p000;

/* renamed from: bbba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bbba {
    NEW_FILE_KEY(0),
    ADD_DOWNLOAD_TRANSFORM(1),
    USE_CHECKSUM_ONLY(2);
    

    /* renamed from: d */
    public final int f102265d;

    private bbba(int i) {
        this.f102265d = i;
    }

    /* renamed from: a */
    static bbba m87766a(int i) {
        if (i == 0) {
            return NEW_FILE_KEY;
        }
        if (i == 1) {
            return ADD_DOWNLOAD_TRANSFORM;
        }
        if (i == 2) {
            return USE_CHECKSUM_ONLY;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Unknown MDD FileKey version:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
