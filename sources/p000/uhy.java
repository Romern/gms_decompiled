package p000;

import android.database.Cursor;

/* renamed from: uhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uhy implements uhx {

    /* renamed from: a */
    private final ujx f47667a;

    public uhy(ujx ujx) {
        this.f47667a = ujx;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27496a(uno uno, Cursor cursor) {
        sdo.m34970a(this.f47667a.mo27641x());
        int i = ujy.f47832c;
        ujy ujy = new ujy(uno, ukb.f47839a.f48341a.mo27705b(cursor).longValue(), uka.ENTRY_ID.f47838c.mo27705b(cursor).longValue(), uka.SDK_APP_ID.f47838c.mo27702a(cursor));
        sdo.m34970a(this.f47667a.mo27613h() == ujy.f47833a);
        return ujy;
    }
}
