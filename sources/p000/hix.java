package p000;

import com.google.android.chimera.Fragment;

/* renamed from: hix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hix {

    /* renamed from: a */
    private final String f19840a;

    /* renamed from: b */
    private final qws f19841b;

    /* renamed from: c */
    private final hiw f19842c;

    public hix(Fragment fragment, String str, qws qws) {
        sdo.m34975b(fragment instanceof C0013ak, "Fragment must implement LifecycleOwner");
        this.f19840a = str;
        this.f19841b = qws == null ? new qws(fragment.getActivity().getApplicationContext(), "IDENTITY_GMSCORE", null) : qws;
        this.f19842c = new hiw(fragment, fragment.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public final void mo12513a(int i) {
        qws qws = this.f19841b;
        bxvd da = bong.f133782r.mo74144da();
        String str = this.f19840a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong = (bong) da.f164949b;
        str.getClass();
        int i2 = bong.f133784a | 2;
        bong.f133784a = i2;
        bong.f133786c = str;
        bong.f133785b = 8;
        bong.f133784a = i2 | 1;
        bxvd da2 = bomz.f133743f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bomz bomz = (bomz) da2.f164949b;
        bomz.f133746b = i - 1;
        bomz.f133745a |= 1;
        long b = this.f19842c.mo12512b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bomz bomz2 = (bomz) da2.f164949b;
        bomz2.f133745a |= 16;
        bomz2.f133749e = b;
        bomz bomz3 = (bomz) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong2 = (bong) da.f164949b;
        bomz3.getClass();
        bong2.f133792i = bomz3;
        bong2.f133784a |= 128;
        qws.mo24333a(da.mo74062i()).mo24327b();
    }

    /* renamed from: a */
    public final void mo12514a(int i, bomw bomw) {
        qws qws = this.f19841b;
        bxvd da = bong.f133782r.mo74144da();
        String str = this.f19840a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong = (bong) da.f164949b;
        str.getClass();
        int i2 = bong.f133784a | 2;
        bong.f133784a = i2;
        bong.f133786c = str;
        bong.f133785b = 8;
        bong.f133784a = i2 | 1;
        bxvd da2 = bomz.f133743f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bomz bomz = (bomz) da2.f164949b;
        bomz.f133746b = 4;
        int i3 = bomz.f133745a | 1;
        bomz.f133745a = i3;
        int i4 = 4 | i3;
        bomz.f133745a = i4;
        bomz.f133747c = i;
        bomw.getClass();
        bomz.f133748d = bomw;
        bomz.f133745a = i4 | 8;
        long b = this.f19842c.mo12512b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bomz bomz2 = (bomz) da2.f164949b;
        bomz2.f133745a |= 16;
        bomz2.f133749e = b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong2 = (bong) da.f164949b;
        bomz bomz3 = (bomz) da2.mo74062i();
        bomz3.getClass();
        bong2.f133792i = bomz3;
        bong2.f133784a |= 128;
        qws.mo24333a(da.mo74062i()).mo24327b();
    }
}
