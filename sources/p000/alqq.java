package p000;

import android.content.Context;

/* renamed from: alqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class alqq {

    /* renamed from: a */
    protected final Context f74110a;

    /* renamed from: b */
    protected final amrz f74111b;

    /* renamed from: c */
    protected final anbz f74112c;

    /* renamed from: d */
    protected final bmzi f74113d;

    /* renamed from: e */
    protected final anda f74114e;

    public alqq(String str, Context context, amrz amrz, anbz anbz, bmzi bmzi) {
        amig.m62939a();
        anda a = ((Boolean) amfm.f74863a.mo41191a()).booleanValue() ? andb.m64054a(context, str) : new anda(context, str);
        this.f74110a = context;
        this.f74111b = amrz;
        this.f74112c = anbz;
        this.f74113d = bmzi;
        this.f74114e = a;
    }

    /* renamed from: a */
    protected static final void m61525a(alqx alqx, byte[] bArr, String str, anda anda) {
        amig.m62939a();
        int intValue = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83457k()).intValue();
        if (alqx.f74144d) {
            intValue = Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83301ae()).intValue();
        }
        anda.mo41717a(str, bArr, intValue);
    }

    /* renamed from: a */
    protected static final boolean m61526a(byte[] bArr, String str, anda anda) {
        amig.m62939a();
        anda.mo41717a(str, bArr, Integer.valueOf((int) cgbe.f186279a.mo6606a().mo83347bX()).intValue());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo40660a(alqx alqx, byte[] bArr, String str) {
        m61525a(alqx, bArr, str, this.f74114e);
        return true;
    }
}
