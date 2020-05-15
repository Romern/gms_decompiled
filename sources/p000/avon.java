package p000;

import android.content.Context;

/* renamed from: avon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avon {
    /* renamed from: a */
    public static final avni m78931a(Context context, boolean z) {
        String str;
        avov.m78969b(context);
        int intValue = ((Integer) ((avtn) avtn.f93892a.mo51589b()).mo51607b(avnp.f93529d)).intValue();
        if (((long) intValue) >= cfsd.f185543a.mo6606a().mo82612t()) {
            return new avni("finished-execution", avte.m79305a(new avtc[0]));
        }
        if (!z) {
            str = "non-streaming-download";
        } else {
            str = "streaming-download";
        }
        avnx f = avny.m78899f();
        f.mo51451a(cfsd.f185543a.mo6606a().mo82609q(), cfsd.f185543a.mo6606a().mo82610r());
        f.mo51449a(cfsd.f185543a.mo6606a().mo82611s());
        f.f93564a.mo51594a(avnw.f93568g, true);
        f.mo51450a(intValue);
        f.mo51446a(str, avte.m79305a(new avtc[0]));
        avni b = f.mo51447b();
        ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93529d.mo51602b(Integer.valueOf(intValue + 1)));
        return b;
    }
}
