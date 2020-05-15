package p000;

import android.content.Context;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: qvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qvk {

    /* renamed from: a */
    public static final imo f42238a = new qvj();

    /* renamed from: c */
    private static final sek f42239c = qqu.m32672c("BroadcastManager");

    /* renamed from: b */
    public final Context f42240b;

    /* renamed from: d */
    private final qta f42241d = ((qta) qta.f42084i.mo13145b());

    public qvk(Context context) {
        this.f42240b = context;
    }

    /* renamed from: a */
    public final void mo24286a(acyr acyr, int i) {
        for (String str : (List) this.f42241d.mo24253a(acyr, qta.m32829d(i))) {
            try {
                this.f42240b.sendBroadcast(qsg.m32789a(str).putExtra("dataType", i));
            } catch (URISyntaxException e) {
                f42239c.mo25417e("Unable to parse the intent.", e, new Object[0]);
            }
        }
    }
}
