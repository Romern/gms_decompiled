package p000;

import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;

/* renamed from: afma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1600afma extends rpa {

    /* renamed from: a */
    final /* synthetic */ byte[] f64359a;

    /* renamed from: b */
    final /* synthetic */ byte[] f64360b;

    /* renamed from: c */
    final /* synthetic */ afmp f64361c;

    public C1600afma(afmp afmp, byte[] bArr, byte[] bArr2) {
        this.f64361c = afmp;
        this.f64359a = bArr;
        this.f64360b = bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        aflz aflz = new aflz(aucf);
        afni afni = (afni) ((afnp) rjd).mo25289B();
        afmp afmp = this.f64361c;
        afni.mo32808a(aflz, afmp.f64397e, afmp.f64398f, afmp.f64399g, this.f64359a, new ByteArraySafeParcelable(this.f64360b));
    }
}
