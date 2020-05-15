package p000;

import android.database.Cursor;
import java.util.concurrent.Executor;

/* renamed from: uhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uhz implements uhx {

    /* renamed from: a */
    private final vdz f47668a;

    /* renamed from: b */
    private final Executor f47669b;

    /* renamed from: c */
    private final uhu f47670c;

    public uhz(vdz vdz, uhu uhu, Executor executor) {
        sdo.m34959a(vdz);
        this.f47668a = vdz;
        sdo.m34959a(executor);
        this.f47669b = executor;
        sdo.m34959a(uhu);
        this.f47670c = uhu;
    }

    /* renamed from: b */
    public final ujx mo27496a(uno uno, Cursor cursor) {
        vdz vdz = this.f47668a;
        uhu uhu = this.f47670c;
        Executor executor = this.f47669b;
        ukg ukg = new ukg(uno, cursor);
        return new ujx(uno, vdz.mo27373a(uif.m38672a(ukg.f47902ae)), uhu, executor, ujp.m38710a(uno, cursor), ukg);
    }
}
