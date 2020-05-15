package p000;

import android.content.Context;

/* renamed from: aozz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aozz {

    /* renamed from: a */
    public final Context f83966a;

    /* renamed from: b */
    protected final apbe f83967b;

    /* renamed from: c */
    protected final aoyd f83968c;

    /* renamed from: d */
    protected final aozk f83969d;

    static {
        aoyh.m69805a("ContactsDataLogger");
    }

    protected aozz(Context context, apbe apbe, aoyd aoyd, aozk aozk) {
        this.f83966a = context;
        this.f83967b = apbe;
        this.f83968c = aoyd;
        this.f83969d = aozk;
    }

    /* renamed from: a */
    protected static final void m69929a(apal apal, byte[] bArr, String str, aozk aozk) {
        int b = (int) cgij.f186992a.mo6606a().mo83866b();
        if (apal.f84034e) {
            b = (int) cgij.f186992a.mo6606a().mo83889y();
        }
        aozk.mo47035a(str, bArr, b);
    }

    /* renamed from: a */
    protected static final boolean m69930a(byte[] bArr, String str, aozk aozk) {
        aozk.mo47035a(str, bArr, (int) cgij.f186992a.mo6606a().mo83853D());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo47045a(apal apal, byte[] bArr, String str) {
        m69929a(apal, bArr, str, this.f83969d);
        return true;
    }
}
