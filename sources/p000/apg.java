package p000;

import android.app.PendingIntent;
import android.net.Uri;
import android.support.p001v4.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: apg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apg {

    /* renamed from: a */
    public final ArrayList f1924a = new ArrayList();

    /* renamed from: b */
    public SliceSpec f1925b;

    /* renamed from: c */
    private final Uri f1926c;

    /* renamed from: d */
    private final ArrayList f1927d = new ArrayList();

    /* renamed from: e */
    private int f1928e;

    public apg(Uri uri) {
        this.f1926c = uri;
    }

    /* renamed from: a */
    public final Slice mo2257a() {
        ArrayList arrayList = this.f1924a;
        ArrayList arrayList2 = this.f1927d;
        return new Slice(arrayList, (String[]) arrayList2.toArray(new String[arrayList2.size()]), this.f1926c, this.f1925b);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo2268b(long j, String str, String... strArr) {
        this.f1924a.add(new SliceItem(Long.valueOf(j), "long", str, strArr));
    }

    /* renamed from: a */
    public final void mo2258a(int i, String str, String... strArr) {
        this.f1924a.add(new SliceItem(Integer.valueOf(i), "int", str, strArr));
    }

    public apg(apg apg) {
        Uri.Builder appendPath = apg.f1926c.buildUpon().appendPath("_gen");
        int i = apg.f1928e;
        apg.f1928e = i + 1;
        this.f1926c = appendPath.appendPath(String.valueOf(i)).build();
    }

    /* renamed from: a */
    public final void mo2259a(long j, String str, String... strArr) {
        this.f1924a.add(new SliceItem(Long.valueOf(j), "long", str, strArr));
    }

    /* renamed from: a */
    public final void mo2260a(PendingIntent pendingIntent, Slice slice, String str) {
        C1244oj.m19766a(pendingIntent);
        C1244oj.m19766a(slice);
        this.f1924a.add(new SliceItem(new C1240of(pendingIntent, slice), "action", str, slice.f1654e));
    }

    /* renamed from: a */
    public final void mo2261a(IconCompat iconCompat, String str, List list) {
        C1244oj.m19766a(iconCompat);
        if (Slice.m1632a(iconCompat)) {
            mo2262a(iconCompat, str, (String[]) list.toArray(new String[list.size()]));
        }
    }

    /* renamed from: a */
    public final void mo2262a(IconCompat iconCompat, String str, String... strArr) {
        C1244oj.m19766a(iconCompat);
        if (Slice.m1632a(iconCompat)) {
            this.f1924a.add(new SliceItem(iconCompat, "image", str, strArr));
        }
    }

    /* renamed from: a */
    public final void mo2263a(Slice slice) {
        C1244oj.m19766a(slice);
        mo2264a(slice, null);
    }

    /* renamed from: a */
    public final void mo2264a(Slice slice, String str) {
        C1244oj.m19766a(slice);
        this.f1924a.add(new SliceItem(slice, "slice", str, slice.f1654e));
    }

    /* renamed from: a */
    public final void mo2265a(SliceItem sliceItem) {
        this.f1924a.add(sliceItem);
    }

    /* renamed from: a */
    public final void mo2266a(CharSequence charSequence, String str, String... strArr) {
        this.f1924a.add(new SliceItem(charSequence, "text", str, strArr));
    }

    /* renamed from: a */
    public final void mo2267a(String... strArr) {
        this.f1927d.addAll(Arrays.asList(strArr));
    }
}
