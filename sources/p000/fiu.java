package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: fiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fiu implements fjg {

    /* renamed from: a */
    private static final Uri f16680a;

    /* renamed from: b */
    private final LogPrinter f16681b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        f16680a = builder.build();
    }

    /* renamed from: a */
    public final Uri mo10851a() {
        return f16680a;
    }

    /* renamed from: a */
    public final void mo10852a(fiv fiv) {
        ArrayList arrayList = new ArrayList(fiv.f16689h.values());
        Collections.sort(arrayList, new fit());
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String obj = ((fix) arrayList.get(i)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.f16681b.println(sb.toString());
    }
}
