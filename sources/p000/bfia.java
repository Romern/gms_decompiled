package p000;

/* renamed from: bfia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfia {

    /* renamed from: a */
    public int f113991a = 0;

    /* renamed from: b */
    public int f113992b = 0;

    /* renamed from: c */
    public int f113993c = 0;

    /* renamed from: d */
    public int f113994d = 0;

    /* renamed from: e */
    public int f113995e = 0;

    /* renamed from: f */
    public int f113996f = 0;

    public final String toString() {
        int i = this.f113991a;
        int i2 = this.f113992b;
        int i3 = this.f113993c;
        int i4 = this.f113994d;
        int i5 = this.f113995e;
        int i6 = this.f113996f;
        StringBuilder sb = new StringBuilder(208);
        sb.append("UploadSummary [numFileOpenSucc=");
        sb.append(i);
        sb.append(", numFileOpenFailed=");
        sb.append(i2);
        sb.append(", numFileOpenInterrupted=");
        sb.append(i3);
        sb.append(", numInvalidFileFormat=");
        sb.append(i4);
        sb.append(", numGLocUploadSucc=");
        sb.append(i5);
        sb.append(", numGLocUploadFailed=");
        sb.append(i6);
        sb.append("]");
        return sb.toString();
    }
}
