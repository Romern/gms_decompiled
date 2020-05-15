package p000;

import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: aict */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aict {

    /* renamed from: a */
    public final Context f68726a;

    /* renamed from: b */
    public final aicw f68727b;

    /* renamed from: c */
    public final burh f68728c;

    /* renamed from: d */
    public final aiag f68729d;

    /* renamed from: e */
    public final aidb f68730e;

    public aict(Context context) {
        this.f68726a = context;
        this.f68727b = (aicw) ahgz.m55754a(context, aicw.class);
        this.f68729d = (aiag) ahgz.m55754a(context, aiag.class);
        this.f68728c = (burh) ahgz.m55754a(context, burh.class);
        this.f68730e = (aidb) ahgz.m55754a(context, aidb.class);
    }

    /* renamed from: a */
    public static int m56987a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_devices_other_googblue_24);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static void m56988a(Collection r4, String str) {
        srn srn = ahsd.f67925a;
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            ((ahsu) r4.get(i)).mo37066a(3, str);
        }
    }

    /* renamed from: a */
    public final String mo37406a(String str) {
        return this.f68726a.getString(C0126R.string.devices_notification_title, str);
    }

    /* renamed from: a */
    public final String mo37407a(String str, String str2) {
        if (burl.m120295a(this.f68726a, str2)) {
            return this.f68726a.getString(C0126R.string.common_tap_to_open_app, str);
        }
        return this.f68726a.getString(C0126R.string.common_tap_to_install_app, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37408a() {
        this.f68729d.mo37331a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo37409a(ahsu ahsu) {
        List<ahsu> list;
        if (ahsu != null) {
            list = Collections.singletonList(ahsu);
        } else {
            list = null;
        }
        aiag aiag = this.f68729d;
        if (!aiag.f68562a.mo73043g()) {
            if (list != null && !list.isEmpty()) {
                boolean z = true;
                for (ahsu ahsu2 : list) {
                    if (!ahsu2.mo37080f()) {
                        z = false;
                    }
                }
                if (z) {
                    return;
                }
            }
            int i = aiag.f68562a.mo73039c().getInt("KEY_NOTIFICATION_CONSECUTIVE_DISMISS", 0);
            if (((long) i) >= cfod.f184793a.mo6606a().mo81894P()) {
                aiag.f68562a.mo73034a(Long.MAX_VALUE);
                aiag.f68563b.mo37021a(bvin.NOTIFICATION_DISMISS_BACKOFF_MAXED, list);
            } else if (aiag.mo37332b()) {
                burh burh = aiag.f68562a;
                long c = aiag.mo37333c();
                double F = (double) cfod.f184793a.mo6606a().mo81884F();
                double pow = Math.pow((double) cfod.f184793a.mo6606a().mo81892N(), (double) i);
                Double.isNaN(F);
                burh.mo73034a(c + ((long) (F * pow)));
                aiag.f68562a.mo73033a(i + 1);
            }
        }
    }
}
