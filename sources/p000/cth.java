package p000;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONException;

/* renamed from: cth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cth {
    /* renamed from: a */
    public static ctg m7544a(ctn ctn) {
        return new ctg(ctn);
    }

    /* renamed from: b */
    public static ctq m7547b(byte[] bArr) {
        boolean z;
        if (bArr == null) {
            z = false;
        } else if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        czl.m8003a(z, "cannot generate credential from empty or null bundle");
        try {
            ctj a = ctj.m7550a(bArr);
            List list = a.f12016c;
            if (list != null) {
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(a.f12016c);
                    return new ctq(new ctn(a.f12015b, (ctp) arrayList.remove(0)), czm.m8020b(a.mo8261b(arrayList).mo8260a()));
                }
            }
            return new ctq(new ctn(a.f12015b, null), czm.m8020b(a.mo8260a()));
        } catch (JSONException e) {
            throw new cts(e);
        }
    }

    /* renamed from: a */
    public static ctl m7545a(byte[] bArr) {
        boolean z = false;
        if (bArr != null && bArr.length > 0) {
            z = true;
        }
        czl.m8003a(z, "cannot check status on empty or null bundle");
        try {
            ctj a = ctj.m7550a(bArr);
            int size = a.f12016c.size();
            ctk ctk = a.f12018e;
            return new ctl(size, ctk.f12019a, ctk.f12020b, ctk.f12021c, a.f12017d);
        } catch (JSONException e) {
            throw new cts(e);
        }
    }

    /* renamed from: a */
    public static ctr m7546a(ctn ctn, int i) {
        ctn ctn2 = ctn;
        czl.m8004b(ctn2.f12029b.f12033d == null, "credential and it's CAVV key cannot be null");
        int parseInt = Integer.parseInt(ctn.mo8284e().substring(0, 2));
        int parseInt2 = Integer.parseInt(czq.m8043b(ctn.mo8284e().substring(2), 2));
        byte b = czm.m8012a(ctn2.f12028a.mo8267a("CAVV_Key_Indicator"))[0];
        String d = czq.m8045d(String.valueOf(i), 4);
        String d2 = czq.m8045d(String.valueOf(i), 8);
        byte[] bArr = {b};
        String a = ctn2.mo8277a(6);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date());
        String d3 = czq.m8045d(String.valueOf(i), 4);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + String.valueOf(format).length() + String.valueOf(d3).length());
        sb.append(a);
        sb.append(format);
        sb.append(d3);
        return new ctr(parseInt, parseInt2, czm.m8016a(ctn.mo8286g(), bArr, czm.m8026d(ctn2.mo8278a(d)), czm.m8026d(d), czm.m8026d(sb.toString()), d2, new byte[]{0}), ctn.mo8283d());
    }
}
