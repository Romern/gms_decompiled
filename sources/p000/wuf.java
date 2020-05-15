package p000;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.Context;
import android.net.Uri;
import android.support.p001v4.graphics.drawable.IconCompat;

/* renamed from: wuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wuf extends wug {

    /* renamed from: a */
    private static final bngx f51354a = bngx.m109356a("title");

    /* renamed from: b */
    private static final bngx f51355b = bngx.m109356a("list_item");

    /* renamed from: c */
    private static final bngx f51356c = bngx.m109357a("title", "shortcut");

    /* renamed from: d */
    private static final bngx f51357d = bngx.m109376e();

    /* renamed from: e */
    private final Context f51358e;

    /* renamed from: f */
    private final Slice.Builder f51359f;

    public wuf(Context context, Uri uri) {
        this.f51358e = context;
        this.f51359f = new Slice.Builder(uri, null);
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wuf", "<init>", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("ListSliceBuilderWrapper: Build with NativeListSliceBuilder");
    }

    /* renamed from: a */
    public final androidx.slice.Slice mo29408a() {
        return aph.m1807a(this.f51359f.build(), this.f51358e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29409a(int i) {
        this.f51359f.addInt(i, "color", f51357d);
    }

    /* renamed from: a */
    public final void mo29410a(PendingIntent pendingIntent, IconCompat iconCompat, String str, String str2, boolean z) {
        Slice.Builder builder = this.f51359f;
        builder.addSubSlice(new Slice.Builder(builder).addSubSlice(new Slice.Builder(this.f51359f).addAction(pendingIntent, new Slice.Builder(this.f51359f).addIcon(iconCompat.mo1113e(), null, f51357d).build(), null).addHints(f51356c).build(), null).addHints(f51355b).addText(str, null, f51354a).addText(str2, null, f51357d).build(), null);
    }
}
