package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: ayhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhk extends ayfu {

    /* renamed from: c */
    final /* synthetic */ int f97594c;

    /* renamed from: d */
    final /* synthetic */ axrs f97595d;

    /* renamed from: e */
    final /* synthetic */ Uri f97596e;

    /* renamed from: f */
    final /* synthetic */ ayja f97597f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhk(ayja ayja, String str, int i, axrs axrs, Uri uri) {
        super(str);
        this.f97597f = ayja;
        this.f97594c = i;
        this.f97595d = axrs;
        this.f97596e = uri;
    }

    /* renamed from: a */
    public final void mo53991a() {
        DataHolder a;
        try {
            int i = this.f97594c;
            boolean z = true;
            if (i == 0) {
                z = false;
            } else if (i != 1) {
                StringBuilder sb = new StringBuilder(51);
                sb.append("getDataItemsByUri: invalid filter type: ");
                sb.append(i);
                Log.w("WearableService", sb.toString());
                this.f97595d.mo53438a(DataHolder.m22539b(13));
                return;
            }
            ayja ayja = this.f97597f;
            a = ayja.f97727f.mo53730a(ayja.f97726e, this.f97596e, z);
            this.f97595d.mo53438a(a);
            ayji.m84106a(a, this.f97595d);
        } catch (Exception e) {
            String valueOf = String.valueOf(this.f97596e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb2.append("getDataItemsByUri: exception during processing: ");
            sb2.append(valueOf);
            Log.e("WearableService", sb2.toString(), e);
            this.f97595d.mo53438a(DataHolder.m22539b(8));
        } catch (Throwable th) {
            ayji.m84106a(a, this.f97595d);
            throw th;
        }
    }
}
