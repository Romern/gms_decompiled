package p000;

import java.util.concurrent.Executor;

/* renamed from: bdkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdkh {

    /* renamed from: a */
    private final cijl f105799a;

    /* renamed from: b */
    private final cijl f105800b;

    /* renamed from: c */
    private final cijl f105801c;

    public bdkh(cijl cijl, cijl cijl2, cijl cijl3) {
        m90959a(cijl, 1);
        this.f105799a = cijl;
        m90959a(cijl2, 2);
        this.f105800b = cijl2;
        m90959a(cijl3, 3);
        this.f105801c = cijl3;
    }

    /* renamed from: a */
    private static void m90959a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public final bdkg mo58105a(Executor executor, bdpz bdpz) {
        cijl cijl = this.f105799a;
        cijl cijl2 = this.f105800b;
        bdif bdif = (bdif) this.f105801c.mo6445a();
        m90959a(bdif, 3);
        m90959a(executor, 4);
        m90959a(bdpz, 5);
        return new bdkg(cijl, cijl2, bdif, executor, bdpz);
    }
}
