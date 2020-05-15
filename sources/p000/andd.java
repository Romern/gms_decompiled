package p000;

import android.content.Context;
import java.util.Random;

/* renamed from: andd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andd {

    /* renamed from: a */
    public static final /* synthetic */ int f76657a = 0;

    /* renamed from: b */
    private static final Random f76658b = new Random();

    /* renamed from: c */
    private final wwr f76659c;

    public andd(Context context) {
        this.f76659c = wvu.m42361a(context);
    }

    /* renamed from: a */
    public final void mo41718a(Throwable th, double d) {
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83382cF()).booleanValue() && f76658b.nextDouble() < d) {
            wwv wwv = new wwv(th);
            wwv.f51512j = "com.google.android.gms.people";
            wwv.f51499d = "com.google.android.gms.people.SILENT_FEEDBACK";
            wwv.mo29496b();
            this.f76659c.mo29488b(wwv.mo29490a()).mo50371a(andc.f76656a);
        }
    }
}
