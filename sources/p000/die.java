package p000;

import com.google.android.chimera.SliceProvider;

/* renamed from: die */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class die extends djw {

    /* renamed from: a */
    private static final Class[] f13211a = {String[].class};

    public die() {
        super(SliceProvider.class, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8643a(dju dju, brtm brtm, String str, djv djv) {
        String str2;
        die die = dif.f13212d;
        boolean z = ((dif) dju).f13215c;
        dng e = brtm.mo69926e(str);
        if (e == null) {
            return false;
        }
        djv.f13364c = e.mo9290S();
        int __offset = e.__offset(6);
        if (__offset != 0) {
            str2 = e.__string(__offset + e.bb_pos);
        } else {
            str2 = null;
        }
        djv.f13365d = str2;
        djv.f13368g = z;
        int e2 = e.mo9303e();
        if (e2 <= 0) {
            return true;
        }
        String[] strArr = new String[e2];
        for (int i = 0; i < e2; i++) {
            strArr[i] = e.mo9302a(i);
        }
        djv.f13366e = new Object[]{strArr};
        djv.f13367f = f13211a;
        return true;
    }
}
