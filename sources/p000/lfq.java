package p000;

import android.app.PendingIntent;
import android.os.Build;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* renamed from: lfq */
final /* synthetic */ class lfq implements Function {

    /* renamed from: a */
    private final lfw f26001a;

    /* renamed from: b */
    private final Set f26002b;

    /* renamed from: c */
    private final lgc f26003c;

    public lfq(lfw lfw, Set set, lgc lgc) {
        this.f26001a = lfw;
        this.f26002b = set;
        this.f26003c = lgc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[SYNTHETIC] */
    public final Object apply(Object obj) {
        boolean z;
        bmxv bmxv;
        lfw lfw = this.f26001a;
        Set set = this.f26002b;
        lgc lgc = this.f26003c;
        kjl kjl = (kjl) obj;
        boolean contains = set.contains(kjl);
        bmxv a = lgc.mo15061a();
        kby a2 = kbz.m17615a();
        PendingIntent a3 = lio.m19189a(lfw.f26011a, lio.m19200c(10002));
        if (a3 != null) {
            a2.mo14353a(a3.getIntentSender());
        }
        String str = (String) kjl.mo14517b().stream().map(lfu.f26007a).collect(Collectors.joining(", "));
        if (contains) {
            str = String.valueOf(str).concat(" (ignored)");
        }
        String name = kjl.mo14518c().name();
        RemoteViews a4 = lbj.m18887a(lfw.f26011a, str, name, (kcz) null);
        kom a5 = kjl.mo14516a();
        bmxv bmxv2 = a5.f24627z;
        char c = 1;
        if (bmxv2.mo66813a()) {
            int intValue = ((Integer) bmxv2.mo66814b()).intValue();
            if (intValue == 2) {
                c = 3;
            } else if (intValue == 8) {
                c = 3;
            } else {
                if (intValue == 1) {
                    z = true;
                } else if (intValue == 4) {
                    z = true;
                }
                bmxv = a5.f24625x;
                while (true) {
                    if (!bmxv.mo66813a()) {
                        bmxv bmxv3 = ((kom) bmxv.mo66814b()).f24627z;
                        if (bmxv3.mo66813a()) {
                            int intValue2 = ((Integer) bmxv3.mo66814b()).intValue();
                            if (intValue2 != 8) {
                                if (intValue2 == 4) {
                                    c = 3;
                                    break;
                                }
                            } else {
                                c = 3;
                                break;
                            }
                        }
                        bmxv = ((kom) bmxv.mo66814b()).f24625x;
                    } else if (z) {
                        c = 2;
                    }
                }
            }
            if (c != 2) {
                lbj.m18892a(a4, -16711936);
            } else if (c == 3) {
                lbj.m18892a(a4, -65536);
            }
            int i = Build.VERSION.SDK_INT;
            a2.mo14356a((AutofillId) kjl.mo14516a().f24609h, null, Pattern.compile(".*"), a4, a.mo66810a((bmxj) new lfv(lfw, str, name)));
            return bmxv.m108567c(a2.mo14352a());
        }
        z = false;
        bmxv = a5.f24625x;
        while (true) {
            if (!bmxv.mo66813a()) {
            }
            bmxv = ((kom) bmxv.mo66814b()).f24625x;
        }
        if (c != 2) {
        }
        int i2 = Build.VERSION.SDK_INT;
        a2.mo14356a((AutofillId) kjl.mo14516a().f24609h, null, Pattern.compile(".*"), a4, a.mo66810a((bmxj) new lfv(lfw, str, name)));
        return bmxv.m108567c(a2.mo14352a());
    }
}
