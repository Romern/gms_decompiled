package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ucf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucf implements uce {

    /* renamed from: a */
    public static final sbw f47234a = new sbw("AppPreferencesStoreImpl", "");

    /* renamed from: b */
    public final uhn f47235b;

    /* renamed from: c */
    public final Map f47236c = new HashMap();

    public ucf(uhn uhn) {
        this.f47235b = uhn;
    }

    /* renamed from: a */
    public final txg mo27232a(uey uey) {
        uin b = this.f47235b.mo27419b(uey);
        sdo.m34966a(b, "Authorized app doesn't exist");
        txi txi = new txi();
        txi.f46910b = b.f47710c;
        txi.f46911c = b.f47712e;
        txi.f46912d = b.f47711d;
        return txi.mo26871a();
    }
}
