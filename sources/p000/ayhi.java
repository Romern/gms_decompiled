package p000;

import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemParcelable;
import com.google.android.gms.wearable.internal.GetDataItemResponse;

/* renamed from: ayhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhi extends ayfu {

    /* renamed from: c */
    final /* synthetic */ Uri f97589c;

    /* renamed from: d */
    final /* synthetic */ axrs f97590d;

    /* renamed from: e */
    final /* synthetic */ ayja f97591e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhi(ayja ayja, String str, Uri uri, axrs axrs) {
        super(str);
        this.f97591e = ayja;
        this.f97589c = uri;
        this.f97590d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        Cursor a;
        DataItemParcelable dataItemParcelable;
        try {
            ayja ayja = this.f97591e;
            a = ayja.f97727f.mo53726a(ayja.f97726e, this.f97589c);
            if (a.moveToNext()) {
                dataItemParcelable = axxj.m83473a(axxj.m83472a(a));
            } else {
                dataItemParcelable = null;
            }
            this.f97590d.mo53454a(new GetDataItemResponse(0, dataItemParcelable));
            a.close();
        } catch (Exception e) {
            String valueOf = String.valueOf(this.f97589c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("getDataItem: exception during processing: ");
            sb.append(valueOf);
            Log.e("WearableService", sb.toString(), e);
            this.f97590d.mo53454a(new GetDataItemResponse(8, null));
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
