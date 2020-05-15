package p000;

import android.content.Context;
import android.os.DropBoxManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: asfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfl extends asem {

    /* renamed from: f */
    private final String f88841f;

    protected asfl() {
        super("Dropbox", "DROP_BOX", cgsx.m146912b());
        this.f88841f = "Dropbox";
    }

    /* renamed from: h */
    public static asfl m73964h() {
        return new asfl("DropboxRealtime");
    }

    /* renamed from: a */
    public final void mo49091a(rjx rjx, qws qws, qxq qxq, calu calu, boolean z, List list, boolean z2, boolean z3, boolean z4) {
        int length;
        qxq qxq2 = qxq;
        if (cgth.m146983c() && cgth.m146986f()) {
            asfs.m73998a((calx) calu.mo74062i());
        }
        calv[] calvArr = (calv[]) Collections.unmodifiableList(((calx) calu.f164949b).f175211i).toArray(new calv[0]);
        if (cgsx.f187685a.mo6606a().mo84439i() && calvArr != null && (length = calvArr.length) > 0) {
            qxq2.mo24385d("DropboxEntriesHistogram").mo24367a(length);
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                calv calv = calvArr[i2];
                int i3 = i + 1;
                if (i3 <= ((int) cgsx.f187685a.mo6606a().mo84435e())) {
                    calu calu2 = (calu) calu.clone();
                    if (calu2.f164950c) {
                        calu2.mo74035c();
                        calu2.f164950c = false;
                    }
                    calx calx = calx.f175201v;
                    ((calx) calu2.f164949b).f175211i = bxvk.m124030de();
                    calu2.mo74660a(calv);
                    ashd.m74117a(rjx, qws, qxq, calu2, z, list, z2, cgub.m147064b(), cgsu.m146907b(), this.f88841f, this.f88780b, asgz.m74109a((calx) calu.mo74062i(), qxq2).f174516f);
                    i2++;
                    calvArr = calvArr;
                    length = length;
                    i = i3;
                } else {
                    qxq2.mo24383c("DropboxTooManyEntries").mo24359a();
                    return;
                }
            }
        } else {
            ashd.m74117a(rjx, qws, qxq, calu, z, list, z2, cgub.m147064b(), cgsu.m146907b(), this.f88841f, this.f88780b, asgz.m74109a((calx) calu.mo74062i(), qxq2).f174516f);
        }
        if (!cgth.m146983c() && cgth.m146986f()) {
            asfs.m73998a((calx) calu.mo74062i());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final calx mo49092b(Context context, long j, long j2, qxq qxq) {
        qxq qxq2 = qxq;
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
        calu calu = (calu) calx.f175201v.mo74144da();
        if (this.f88841f.equals("DropboxRealtime")) {
            qxq2.mo24383c("DropboxRealtimeCollection").mo24359a();
        } else if (this.f88841f.equals("Dropbox")) {
            qxq2.mo24383c("DropboxDailyCollection").mo24359a();
        }
        calu.mo74661a(Arrays.asList(asgz.m74111a(context, context.getSharedPreferences("com.google.android.metrics", 0), dropBoxManager, this.f88841f, j, j2, true, qxq)));
        if (calu.f164950c) {
            calu.mo74035c();
            calu.f164950c = false;
        }
        calx calx = (calx) calu.f164949b;
        int i = calx.f175203a | 1;
        calx.f175203a = i;
        calx.f175206d = j;
        calx.f175203a = i | 2;
        calx.f175207e = j2;
        boolean a = aykr.m84203a();
        if (calu.f164950c) {
            calu.mo74035c();
            calu.f164950c = false;
        }
        calx calx2 = (calx) calu.f164949b;
        calx2.f175203a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        calx2.f175215m = a;
        dropBoxManager.addText("platform_stats_bookmark", String.valueOf(j2));
        return (calx) calu.mo74062i();
    }

    /* renamed from: c */
    public final long mo49094c() {
        return cgsx.f187685a.mo6606a().mo84438h();
    }

    /* renamed from: d */
    public final long mo49095d() {
        return 0;
    }

    /* renamed from: g */
    public final boolean mo49098g() {
        return cgsx.f187685a.mo6606a().mo84433c();
    }

    public asfl(String str) {
        super(str, "DROP_BOX", cgsx.m146912b());
        this.f88841f = str;
    }

    /* renamed from: b */
    public final boolean mo49093b() {
        return cgsf.m146815b();
    }
}
