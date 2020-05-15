package p000;

import android.net.Uri;
import com.google.android.libraries.matchstick.data.DatabaseProvider;

/* renamed from: azdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azdv extends soa {

    /* renamed from: a */
    final /* synthetic */ long f99123a;

    /* renamed from: b */
    final /* synthetic */ azeb f99124b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azdv(azeb azeb, long j) {
        super(9);
        this.f99124b = azeb;
        this.f99123a = j;
    }

    public final void run() {
        azeb azeb = this.f99124b;
        Uri uri = azeb.f99133a;
        azdf a = DatabaseProvider.m94521a(azeb.f99137b.getContentResolver(), this.f99123a);
        new Object[1][0] = Long.valueOf(this.f99123a);
        this.f99124b.f99139d.post(new azdu(this, a));
    }
}
