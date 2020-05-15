package p000;

import android.content.Context;
import java.util.Random;
import java.util.Set;

/* renamed from: riu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class riu {

    /* renamed from: e */
    private static final Set f43091e = sqw.m36047b(((String) rsv.f43617f.mo25081c()).split(","));

    /* renamed from: a */
    public final int f43092a;

    /* renamed from: b */
    public final String f43093b;

    /* renamed from: c */
    public final sgj f43094c;

    /* renamed from: d */
    public byte[] f43095d;

    /* renamed from: f */
    private final Random f43096f = new Random(System.currentTimeMillis());

    public riu(int i, String str, sgj sgj) {
        this.f43092a = i;
        this.f43093b = str;
        this.f43094c = sgj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sqo.a(android.content.Context, boolean):boolean
     arg types: [android.content.Context, int]
     candidates:
      sqo.a(android.content.Context, rjx):boolean
      sqo.a(android.content.Context, boolean):boolean */
    /* renamed from: a */
    public final void mo24644a(Context context, int i) {
        if (cdoe.f181420a.mo6606a().mo78060a() && sqo.m35986a(context, false) && this.f43096f.nextDouble() < cdoe.f181420a.mo6606a().mo78061b() && !f43091e.contains(this.f43093b)) {
            new soa(10, new rit(this, context, i)).start();
        }
    }
}
