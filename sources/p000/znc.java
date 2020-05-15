package p000;

import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fitness.request.DataSourceQueryParams;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.result.ReadRawResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: znc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class znc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReadRawRequest f55529a;

    /* renamed from: b */
    final /* synthetic */ zne f55530b;

    /* renamed from: c */
    final /* synthetic */ zcf f55531c;

    public znc(zne zne, ReadRawRequest readRawRequest, zcf zcf) {
        this.f55530b = zne;
        this.f55529a = readRawRequest;
        this.f55531c = zcf;
    }

    public final void run() {
        try {
            znj znj = this.f55530b.f55537g;
            List<DataSourceQueryParams> list = this.f55529a.f32269a;
            int h = (int) cdzv.f182107a.mo6606a().mo78639h();
            yfy yfy = new yfy();
            for (DataSourceQueryParams dataSourceQueryParams : list) {
                caae a = yvx.m44925a(dataSourceQueryParams.f32230a);
                yhd a2 = yhe.m44086a();
                a2.mo30492b(dataSourceQueryParams.f32231b);
                a2.mo30491a(dataSourceQueryParams.f32232c);
                a2.f53814c = dataSourceQueryParams.f32233d;
                a2.f53815d = dataSourceQueryParams.f32234e;
                yfy.mo30453a(a, a2.mo30490a());
            }
            bngx<cadp> b = znj.f55554d.mo31373b(yfy.mo30452a());
            ArrayList<CursorWindow> arrayList = new ArrayList();
            yvw.m44922a(arrayList, 0);
            int i = 0;
            for (cadp cadp : b) {
                int i2 = 0;
                while (true) {
                    if (i2 < cadp.f172715d.size()) {
                        int i3 = i2 + h;
                        int min = Math.min(cadp.f172715d.size(), i3);
                        bxwc bxwc = cadp.f172715d;
                        bxvd da = caea.f172784f.mo74144da();
                        caae caae = cadp.f172713b;
                        if (caae == null) {
                            caae = caae.f172323i;
                        }
                        String str = caae.f172326b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        caea caea = (caea) da.f164949b;
                        str.getClass();
                        caea.f172786a |= 4;
                        caea.f172789d = str;
                        List subList = bxwc.subList(i2, min);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        caea caea2 = (caea) da.f164949b;
                        if (!caea2.f172790e.mo73666a()) {
                            caea2.f172790e = bxvk.m124021a(caea2.f172790e);
                        }
                        bxsy.m123078a(subList, caea2.f172790e);
                        byte[] k = ((caea) da.mo74062i()).mo73642k();
                        if (!yvw.m44923a((CursorWindow) bnjd.m109595d(arrayList), i, k)) {
                            if (!yvw.m44923a(yvw.m44922a(arrayList, i), i, k)) {
                                for (CursorWindow cursorWindow : arrayList) {
                                    cursorWindow.close();
                                }
                                throw new IOException("Can't allocate more CursorWindows.  Completely full!");
                            }
                        }
                        i++;
                        i2 = i3;
                    }
                }
            }
            zne.m45786a(this.f55531c, new ReadRawResult(new DataHolder(new String[]{"data_point"}, (CursorWindow[]) arrayList.toArray(new CursorWindow[0]), 0, new Bundle())));
        } catch (IOException e) {
            bnsl bnsl = (bnsl) zne.f55533d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error reading raw data.");
            zne.m45786a(this.f55531c, new ReadRawResult(DataHolder.m22539b(5008)));
        }
    }
}
