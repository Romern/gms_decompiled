package p000;

import android.net.Uri;
import android.os.Handler;

/* renamed from: bhbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhbk extends adzx {

    /* renamed from: a */
    final /* synthetic */ bhbl f118250a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhbk(bhbl bhbl, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.f118250a = bhbl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        bhbl bhbl = this.f118250a;
        int i = bhbl.f118251c;
        float a = bhbl.mo63522a();
        synchronized (bhbl.f118253a) {
            bhbl.mo63524a(a);
        }
    }
}
