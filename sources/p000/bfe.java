package p000;

/* renamed from: bfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfe extends bff {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3076b() {
        String str = bgp.OPERATION.f3180c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append('1');
        sb.append(str);
        int a = new bgl().mo3102a(bgz.m3020a(sb.toString()));
        bew.m2863a(a);
        bes.m2845a("SDK_CONTEXT_DATA_LEN", Integer.valueOf(a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte[] mo3077c() {
        bgl bgl = new bgl();
        bgp bgp = bgp.OPERATION;
        int intValue = ((Integer) bes.m2844a("SDK_CONTEXT_DATA_LEN")).intValue() + 1024;
        byte[] bArr = new byte[intValue];
        bew.m2863a(bgl.mo3100a(1, null, 0, bArr, intValue));
        return bgl.m2964b() ? bgl.mo3114a() : bArr;
    }
}
