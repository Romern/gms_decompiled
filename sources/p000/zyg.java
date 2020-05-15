package p000;

import android.content.Context;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: zyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyg {

    /* renamed from: a */
    private final qws f56174a;

    public zyg() {
        this.f56174a = null;
    }

    /* renamed from: a */
    public static final brtt m46676a(int i, int i2, String str, long j) {
        brtr brtr = (brtr) brtt.f143337f.mo74144da();
        if (brtr.f164950c) {
            brtr.mo74035c();
            brtr.f164950c = false;
        }
        brtt brtt = (brtt) brtr.f164949b;
        brtt.f143340b = i - 1;
        int i3 = brtt.f143339a | 1;
        brtt.f143339a = i3;
        str.getClass();
        brtt.f143339a = i3 | 2;
        brtt.f143341c = str;
        bxvd da = brtv.f143345g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brtv brtv = (brtv) da.f164949b;
        brtv.f143350d = 0;
        int i4 = brtv.f143347a | 4;
        brtv.f143347a = i4;
        int i5 = i4 | 16;
        brtv.f143347a = i5;
        brtv.f143352f = i2;
        brtv.f143347a = i5 | 2;
        brtv.f143349c = j;
        brtv brtv2 = (brtv) da.mo74062i();
        if (brtr.f164950c) {
            brtr.mo74035c();
            brtr.f164950c = false;
        }
        brtt brtt2 = (brtt) brtr.f164949b;
        brtv2.getClass();
        brtt2.mo69939a();
        brtt2.f143342d.add(brtv2);
        return (brtt) brtr.mo74062i();
    }

    public zyg(Context context) {
        this.f56174a = new qws(context, "DL_FONTS", null);
    }

    /* renamed from: a */
    public static brtw m46677a(FontMatchSpec fontMatchSpec) {
        bxvd da = brtw.f143353g.mo74144da();
        String str = fontMatchSpec.f32464b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brtw brtw = (brtw) da.f164949b;
        str.getClass();
        int i = brtw.f143355a | 1;
        brtw.f143355a = i;
        brtw.f143356b = str;
        int i2 = fontMatchSpec.f32466d;
        int i3 = i | 4;
        brtw.f143355a = i3;
        brtw.f143358d = i2;
        float f = fontMatchSpec.f32465c;
        int i4 = i3 | 2;
        brtw.f143355a = i4;
        brtw.f143357c = f;
        float f2 = fontMatchSpec.f32467e;
        int i5 = i4 | 8;
        brtw.f143355a = i5;
        brtw.f143359e = f2;
        boolean z = fontMatchSpec.f32468f;
        brtw.f143355a = i5 | 64;
        brtw.f143360f = z;
        return (brtw) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo31587a(int i, int i2, String str) {
        mo31588a(m46676a(i, i2, str, 0));
    }

    /* renamed from: a */
    public final void mo31588a(brtt brtt) {
        zyh.m46683c("FontsClearcutWrapper", "Logging to Clearcut %s", brtt.toString());
        this.f56174a.mo24335a(brtt.mo73642k()).mo24327b();
    }
}
