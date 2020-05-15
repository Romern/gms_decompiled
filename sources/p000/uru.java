package p000;

import com.google.android.gms.drive.internal.ParcelableTransferPreferences;
import com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest;

/* renamed from: uru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uru extends usg {

    /* renamed from: a */
    final /* synthetic */ txg f48578a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uru(rkb rkb, txg txg) {
        super(rkb);
        this.f48578a = txg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((usn) rjd).mo27951n().mo27139a(new SetPinnedDownloadPreferencesRequest(new ParcelableTransferPreferences(this.f48578a)), new uuv(this));
    }
}
