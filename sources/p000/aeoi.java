package p000;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: aeoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeoi extends rtr implements aelt {

    /* renamed from: d */
    private final String f63569d = mo25151d("photo_fife_url");

    /* renamed from: a */
    public final int mo34309a() {
        return mo25139a("photo_max_width", 0);
    }

    /* renamed from: b */
    public final int mo34311b() {
        return mo25139a("photo_max_height", 0);
    }

    /* renamed from: c */
    public final aelt mo7556bF() {
        return new aeoh(this.f63569d, mo34309a(), mo34311b(), mo25141a("photo_attributions", (String) null), this.f43673b);
    }

    public aeoi(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: a */
    public final rke mo34310a(rkb rkb, int i, int i2) {
        return mo7556bF().mo34310a(rkb, i, i2);
    }
}
