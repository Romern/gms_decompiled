package p000;

import java.util.Random;

/* renamed from: bbqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqz {

    /* renamed from: a */
    public final Random f103188a = new Random();

    /* renamed from: b */
    public int f103189b = 3;

    /* renamed from: c */
    public int f103190c = 0;

    /* renamed from: d */
    public bqgg f103191d;

    /* renamed from: a */
    public final void mo56380a() {
        this.f103189b = 3;
        this.f103190c = 0;
        bqgg bqgg = this.f103191d;
        if (bqgg != null) {
            bqgg.cancel(true);
            this.f103191d = null;
        }
    }
}
