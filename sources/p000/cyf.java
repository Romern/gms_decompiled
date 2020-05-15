package p000;

/* renamed from: cyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class cyf implements cyn {
    /* renamed from: a */
    public final cut mo8390a(cuo cuo, cyp cyp) {
        String a = mo8388a(cuo.mo8307g(), cuo.mo8298a(), cuo.mo8299b());
        if (a == null) {
            return null;
        }
        byte[] a2 = mo8391a(cyp, a);
        mo8389a(cuo, a2, cyp);
        return cut.m7621a(cuo.mo8309i().mo8318a(a2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8388a(String str, byte b, byte b2) {
        return (String) cyv.f12421a.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8389a(cuo cuo, byte[] bArr, cvs cvs) {
        int length;
        cuu cuu = cuu.REFERENCED_DATA_NOT_FOUND;
        boolean z = true;
        if (!(bArr == null || (length = bArr.length) == 0 || length > 255)) {
            z = false;
        }
        cuu.mo8315a(z);
        cuo.mo8306b(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo8391a(cyp cyp, String str) {
        return cyp.mo8399a(str);
    }
}
