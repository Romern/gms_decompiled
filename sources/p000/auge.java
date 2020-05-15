package p000;

import android.net.Uri;
import com.google.android.gms.thunderbird.config.provider.EmergencyConfigChimeraContentProvider;

/* renamed from: auge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auge extends adzx {

    /* renamed from: a */
    final /* synthetic */ EmergencyConfigChimeraContentProvider f91758a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public auge(EmergencyConfigChimeraContentProvider emergencyConfigChimeraContentProvider, String str, String str2) {
        super(str, str2, null);
        this.f91758a = emergencyConfigChimeraContentProvider;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        this.f91758a.getContext().getContentResolver().notifyChange(uri, null);
    }
}
