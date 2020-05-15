package p000;

import android.database.Cursor;
import java.util.concurrent.TimeUnit;

/* renamed from: adte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adte extends adss {

    /* renamed from: d */
    final /* synthetic */ adtg f62698d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adte(adtg adtg, long j, int i) {
        super(j, i);
        this.f62698d = adtg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Cursor mo33787b() {
        new Object[1][0] = Long.valueOf(((adss) this).f62660a);
        String valueOf = String.valueOf(((adss) this).f62660a);
        return this.f62698d.f62713h.mo33689a(adta.f62680b, adtg.f62705d, adtg.f62708g, new String[]{valueOf, valueOf, String.valueOf(((adss) this).f62661b), String.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() + adtg.f62702a))}, "date,_id LIMIT 1000");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo33788c() {
        adsr b = this.f62698d.mo33810b(this.f62662c);
        if (b != null) {
            ((adss) this).f62661b = b.mo33760a();
            ((adss) this).f62660a = TimeUnit.MILLISECONDS.toSeconds(b.mo33766f());
        }
        return b;
    }
}
