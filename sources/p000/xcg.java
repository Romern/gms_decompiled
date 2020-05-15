package p000;

import android.content.Context;
import java.security.PublicKey;

/* renamed from: xcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xcg implements xch {

    /* renamed from: a */
    private final ios f51919a;

    /* renamed from: b */
    private final byte[] f51920b;

    public xcg(Context context, byte[] bArr) {
        bmxy.m108581a(context);
        bmxy.m108581a(bArr);
        this.f51919a = inl.m15759a(context);
        this.f51920b = bArr;
    }

    /* renamed from: a */
    public final bqgg mo29630a() {
        return adbb.m50100a(this.f51919a.mo13185a(this.f51920b));
    }

    /* renamed from: b */
    public final byte[] mo29631b() {
        return this.f51920b;
    }

    /* renamed from: c */
    public final PublicKey mo29632c() {
        throw new UnsupportedOperationException("Not Implemented yet!");
    }
}
