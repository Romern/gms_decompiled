package p000;

/* renamed from: csi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C0914csi implements csl {
    /* renamed from: a */
    public final csr mo8208a(String str, crv crv, csn csn) {
        String a = mo8206a(str, crv.mo8191a(), crv.mo8192b());
        if (a == null) {
            return null;
        }
        byte[] a2 = mo8209a(csn, a);
        mo8207a(crv, a2, csn);
        return csr.m7475a(crv.mo8199g().mo8232a(a2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8206a(String str, byte b, byte b2) {
        return (String) csm.f11914a.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8207a(crv crv, byte[] bArr, csn csn) {
        int length;
        css css = css.REFERENCED_DATA_NOT_FOUND;
        boolean z = true;
        if (!(bArr == null || (length = bArr.length) == 0 || length > 255)) {
            z = false;
        }
        css.mo8229a(z);
        csm.m7452a(crv, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo8209a(csn csn, String str) {
        return csn.mo8215a(str);
    }
}
