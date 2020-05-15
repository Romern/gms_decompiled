package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: beht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beht implements beez {
    /* renamed from: a */
    private static void m95066a(befa befa, Uri uri, List list) {
        try {
            if (befa.mo60648d(uri)) {
                for (Uri uri2 : befa.mo60650f(uri)) {
                    m95066a(befa, uri2, list);
                }
                befa.mo60646b(uri);
                return;
            }
            befa.mo60644a(uri);
        } catch (IOException e) {
            list.add(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        ArrayList arrayList = new ArrayList();
        m95066a(beey.f111467a, beey.f111472f, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        throw behc.m95040a("Failed to delete one or more files", arrayList);
    }
}
