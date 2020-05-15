package p000;

import android.app.backup.RestoreSet;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: mzv */
final /* synthetic */ class mzv implements Callable {

    /* renamed from: a */
    private final nab f35065a;

    public mzv(nab nab) {
        this.f35065a = nab;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x0171=Splitter:B:57:0x0171, B:64:0x018a=Splitter:B:64:0x018a} */
    public final Object call() {
        RestoreSet restoreSet;
        int i;
        ndt ndt;
        nab nab = this.f35065a;
        File b = nab.m25824a(nab.f35110q, nab.f35117x).f34967f.mo19847b("restore_token_file");
        if (!b.exists()) {
            myr.f34962a.mo25412b("D2D restore set not found. Will use cloud restore sets.", new Object[0]);
            restoreSet = null;
        } else {
            try {
                restoreSet = new RestoreSet("D2D", "D2D", Long.valueOf(new String(srz.m36174a(b), StandardCharsets.UTF_8)).longValue());
                myr.f34962a.mo25412b("Returning d2d restore set.", new Object[0]);
            } catch (IOException e) {
                myr.f34962a.mo25417e("Restore token not found.", e, new Object[0]);
                restoreSet = null;
            }
        }
        if (restoreSet != null) {
            return new RestoreSet[]{restoreSet};
        }
        int i2 = Integer.MAX_VALUE;
        try {
            nae nae = nab.f35087L;
            msk msk = msk.GET_DEVICES_REQUEST;
            long currentRestoreSet = nab.getCurrentRestoreSet();
            bxvd da = lth.f32914q.mo74144da();
            bxvd da2 = lte.f32897d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            lte.m24370a((lte) da2.f164949b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lth lth = (lth) da.f164949b;
            lte lte = (lte) da2.mo74062i();
            lte.getClass();
            lth.f32927l = lte;
            lth.f32916a |= 4096;
            if (cckq.m130234b()) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lth lth2 = (lth) da.f164949b;
                int i3 = lth2.f32916a | 2;
                lth2.f32916a = i3;
                lth2.f32918c = currentRestoreSet;
                lth2.f32916a = 1 | i3;
                lth2.f32917b = 0;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                lth lth3 = (lth) da.f164949b;
                lth3.f32916a = 1 | lth3.f32916a;
                lth3.f32917b = currentRestoreSet;
            }
            ltq a = nae.mo20407a(msk, da);
            int size = a.f32978f.size();
            RestoreSet[] restoreSetArr = new RestoreSet[size];
            for (int i4 = 0; i4 < a.f32978f.size(); i4++) {
                ltn ltn = (ltn) a.f32978f.get(i4);
                restoreSetArr[i4] = new RestoreSet((ltn.f32962a & 8) != 0 ? ltn.f32965d : "generic", "device", ltn.f32963b);
            }
            int i5 = 0;
            while (i5 < a.f32978f.size()) {
                try {
                    i2 = Math.min(i2, (int) TimeUnit.MILLISECONDS.toDays(System.nanoTime() - ((ltn) a.f32978f.get(i5)).f32964c));
                    i5++;
                } catch (mbf e2) {
                    e = e2;
                    int i6 = e.f33375a;
                    sek sek = nab.f35075a;
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("Get error http response on getDevices : ");
                    sb.append(i6);
                    sek.mo25418e(sb.toString(), new Object[0]);
                    ndt = new ndt(i6, 0, i2);
                    ndt.mo20499a(nab.f35110q);
                    return null;
                } catch (mbd e3) {
                    e = e3;
                    try {
                        i = e.mo19815a();
                        try {
                            nab.f35075a.mo25417e("Error getting getDevices response from server: ", e, new Object[0]);
                            ndt = new ndt(i, 0, i2);
                            ndt.mo20499a(nab.f35110q);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            new ndt(i, 0, i2).mo20499a(nab.f35110q);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i = 0;
                        new ndt(i, 0, i2).mo20499a(nab.f35110q);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 0;
                    new ndt(i, 0, i2).mo20499a(nab.f35110q);
                    throw th;
                }
            }
            sek sek2 = nab.f35075a;
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("got ");
            sb2.append(size);
            sb2.append(" devices from server");
            sek2.mo25409a(sb2.toString(), new Object[0]);
            new ndt(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, size, i2).mo20499a(nab.f35110q);
            return restoreSetArr;
        } catch (mbf e4) {
            e = e4;
            int i62 = e.f33375a;
            sek sek3 = nab.f35075a;
            StringBuilder sb3 = new StringBuilder(51);
            sb3.append("Get error http response on getDevices : ");
            sb3.append(i62);
            sek3.mo25418e(sb3.toString(), new Object[0]);
            ndt = new ndt(i62, 0, i2);
            ndt.mo20499a(nab.f35110q);
            return null;
        } catch (mbd e5) {
            e = e5;
            i = e.mo19815a();
            nab.f35075a.mo25417e("Error getting getDevices response from server: ", e, new Object[0]);
            ndt = new ndt(i, 0, i2);
            ndt.mo20499a(nab.f35110q);
            return null;
        } catch (Throwable th4) {
            th = th4;
            i = 0;
            new ndt(i, 0, i2).mo20499a(nab.f35110q);
            throw th;
        }
    }
}
