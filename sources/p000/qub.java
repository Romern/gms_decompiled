package p000;

/* renamed from: qub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qub extends qty {
    public qub(String str) {
        super(str, bngx.m109376e());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bmxv mo24278a(Object obj) {
        return bmxv.m108566b(bmxr.m108543a(',').mo66874a((Iterable) ((bngx) obj)).getBytes());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24279a(byte[] bArr) {
        bngs j = bngx.m109377j();
        for (String str : bmyx.m108640a(',').mo66917a().mo66918a((CharSequence) new String(bArr))) {
            if (!"!".equals(str)) {
                j.mo67668c(Long.valueOf(str));
            }
        }
        return j.mo67664a();
    }
}
