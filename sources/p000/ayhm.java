package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ayhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhm extends ayfu {

    /* renamed from: c */
    final /* synthetic */ int f97600c;

    /* renamed from: d */
    final /* synthetic */ axrs f97601d;

    /* renamed from: e */
    final /* synthetic */ Uri f97602e;

    /* renamed from: f */
    final /* synthetic */ ayja f97603f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhm(ayja ayja, String str, int i, axrs axrs, Uri uri) {
        super(str);
        this.f97603f = ayja;
        this.f97600c = i;
        this.f97601d = axrs;
        this.f97602e = uri;
    }

    /* renamed from: a */
    public final void mo53991a() {
        int i = this.f97600c;
        boolean z = true;
        if (i == 0) {
            z = false;
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("getDataItemsByUri: invalid filter type: ");
            sb.append(i);
            Log.w("WearableService", sb.toString());
            this.f97601d.mo53438a(DataHolder.m22539b(13));
            return;
        }
        ayja ayja = this.f97603f;
        axxo b = ayja.f97727f.mo53742b(ayja.f97726e, this.f97602e, z);
        b.mo741a(new ayhl(this, b), bqgs.m112810a());
    }
}
