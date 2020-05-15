package p000;

/* renamed from: cuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cuo extends cuf {
    protected cuo(cug cug) {
        super(cug);
    }

    /* renamed from: b */
    public final void mo8306b(byte[] bArr) {
        int i;
        Byte d = mo8301d();
        int length = bArr.length + 2;
        if (mo8298a() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        byte b = (byte) (length + i);
        if (d.byteValue() != 0 && d.byteValue() != b) {
            throw new cvl(new cus(b));
        }
    }

    /* renamed from: f */
    public final void mo8303f() {
    }

    /* renamed from: g */
    public final String mo8307g() {
        return cvz.m7704a(mo8308h());
    }

    /* renamed from: h */
    public final byte[] mo8308h() {
        if (mo8298a() != 0) {
            return new byte[]{mo8298a(), mo8299b()};
        }
        return new byte[]{mo8299b()};
    }

    /* renamed from: i */
    public final cuy mo8309i() {
        if (mo8298a() == 0) {
            return cuy.m7637b(mo8299b());
        }
        return cuy.m7637b(mo8298a(), mo8299b());
    }
}
