package p000;

import android.service.autofill.SaveInfo;
import java.util.List;

/* renamed from: lcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lcg {

    /* renamed from: a */
    public final bmxv f25783a;

    /* renamed from: b */
    public final laz f25784b;

    /* renamed from: c */
    public final bmxv f25785c;

    /* renamed from: d */
    public final bmxv f25786d;

    /* renamed from: e */
    public final boolean f25787e;

    /* renamed from: f */
    public final boolean f25788f;

    public lcg(SaveInfo saveInfo, bmxv bmxv, bmxv bmxv2, laz laz, boolean z, boolean z2) {
        this.f25783a = bmxv.m108567c(saveInfo);
        this.f25785c = bmxv;
        this.f25786d = bmxv2;
        this.f25784b = laz;
        this.f25787e = z;
        this.f25788f = z2;
    }

    /* renamed from: a */
    public static lcg m18921a(SaveInfo saveInfo) {
        return m18922a(saveInfo, false);
    }

    /* renamed from: a */
    public static lcg m18922a(SaveInfo saveInfo, boolean z) {
        return new lcg(saveInfo, bmvz.f131120a, bmvz.f131120a, laz.CREDENTIAL, z, false);
    }

    /* renamed from: a */
    public static lcg m18923a(SaveInfo saveInfo, byte[] bArr, List list) {
        return new lcg(saveInfo, bmxv.m108566b(bArr), bmxv.m108566b(list), laz.PAYMENT_CARD, false, false);
    }
}
