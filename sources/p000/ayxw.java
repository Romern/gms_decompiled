package p000;

import android.os.Build;

/* renamed from: ayxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayxw implements cayy {

    /* renamed from: a */
    private final cijl f98713a;

    /* renamed from: b */
    private final cijl f98714b;

    /* renamed from: c */
    private final cijl f98715c;

    /* renamed from: d */
    private final cijl f98716d;

    /* renamed from: e */
    private final cijl f98717e;

    /* renamed from: f */
    private final cijl f98718f;

    public ayxw(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6) {
        this.f98713a = cijl;
        this.f98714b = cijl2;
        this.f98715c = cijl3;
        this.f98716d = cijl4;
        this.f98717e = cijl5;
        this.f98718f = cijl6;
    }

    /* renamed from: a */
    public static ayxw m85056a(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6) {
        return new ayxw(cijl, cijl2, cijl3, cijl4, cijl5, cijl6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        ((ayvz) this.f98715c).mo6445a();
        bmxv bmxv = (bmxv) ((cayz) this.f98716d).f176439a;
        bmxv bmxv2 = (bmxv) ((cayz) this.f98717e).f176439a;
        bmxv bmxv3 = (bmxv) ((cayz) this.f98718f).f176439a;
        ayxv ayxv = (ayxv) ((bmxv) ((cayz) this.f98714b).f176439a).mo66812a(ayxv.f98712a);
        ayxq ayxq = new ayxq((ayvu) this.f98713a.mo6445a());
        if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
            ayxq.f98689d = ((Integer) bmxv.mo66812a((Object) 500)).intValue();
        }
        if (bmxv3.mo66813a()) {
            ayxq.f98691f = ((Integer) bmxv3.mo66814b()).intValue();
        }
        if (bmxv2.mo66813a()) {
            ayxq.f98687b.f98708g = ((Boolean) bmxv2.mo66814b()).booleanValue();
        }
        cazf.m127593a(ayxq, "Cannot return null from a non-@Nullable @Provides method");
        return ayxq;
    }
}
