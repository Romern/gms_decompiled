package p000;

/* renamed from: bfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfb extends bfc {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3075b() {
        String str = bgp.OPERATION.f3180c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
        sb.append('1');
        sb.append(str);
        byte[] a = bgz.m3020a(sb.toString());
        String str2 = new String(a);
        if (str2.length() == 0) {
            new String("::TokenCloseDelegate::close::srcBuffer::");
        } else {
            "::TokenCloseDelegate::close::srcBuffer::".concat(str2);
        }
        bgl bgl = new bgl();
        bew.m2863a(bgl.mo3106b(a));
        if (bgl.m2964b()) {
            bgl.mo3114a();
        }
    }
}
