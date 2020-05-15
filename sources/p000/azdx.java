package p000;

import android.net.Uri;
import com.google.android.libraries.matchstick.data.DatabaseProvider;

/* renamed from: azdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azdx extends soa {

    /* renamed from: a */
    final /* synthetic */ long f99127a;

    /* renamed from: b */
    final /* synthetic */ azeb f99128b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azdx(azeb azeb, long j) {
        super(9);
        this.f99128b = azeb;
        this.f99127a = j;
    }

    public final void run() {
        azeb azeb = this.f99128b;
        Uri uri = azeb.f99133a;
        this.f99128b.f99139d.post(new azdw(this, DatabaseProvider.m94535b(azeb.f99137b.getContentResolver(), this.f99127a)));
    }
}
