package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: nbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbg {

    /* renamed from: a */
    public final byte[] f35176a = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE];

    /* renamed from: b */
    public final nbk f35177b;

    /* renamed from: c */
    public final nbh f35178c;

    /* renamed from: d */
    public final nbj f35179d;

    public nbg(nbk nbk, nbh nbh, nbj nbj) {
        sdo.m34975b(true, "minimum chunk size must be greater than window size");
        sdo.m34975b(true, "maximum chunk size cannot be smaller than minimum chunk size");
        this.f35177b = nbk;
        this.f35179d = nbj;
        this.f35178c = nbh;
    }
}
