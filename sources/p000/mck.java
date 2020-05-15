package p000;

import java.io.IOException;

/* renamed from: mck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mck {

    /* renamed from: a */
    private static final lvn f33424a = new lvn("UploadBackupBatchResponseParser");

    /* renamed from: a */
    public static bzxu m24876a(bzsb bzsb) {
        bxvd da = bzxu.f171798d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzxu bzxu = (bzxu) da.f164949b;
        bzxu.f171801b = 2;
        bzxu.f171800a |= 1;
        bzxu bzxu2 = (bzxu) da.mo74062i();
        try {
            try {
                bzxw bzxw = (bzxw) bxvk.m124014a(bzxw.f171807d, boav.m111020a(bzsb.f171222c));
                bzxu bzxu3 = bzxw.f171810b;
                if (bzxu3 == null) {
                    bzxu3 = bzxu.f171798d;
                }
                int a = bzxt.m126308a(bzxu3.f171801b);
                if (a == 0 || a == 1) {
                    bxwc bxwc = bzxw.f171811c;
                    int size = bxwc.size();
                    int i = 0;
                    while (i < size) {
                        bzxv bzxv = (bzxv) bxwc.get(i);
                        bzxu bzxu4 = bzxv.f171805a;
                        if (bzxu4 == null) {
                            bzxu4 = bzxu.f171798d;
                        }
                        int a2 = bzxt.m126308a(bzxu4.f171801b);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        i++;
                        if (a2 != 1) {
                            lvn lvn = f33424a;
                            bzxu bzxu5 = bzxv.f171805a;
                            if (bzxu5 == null) {
                                bzxu5 = bzxu.f171798d;
                            }
                            String valueOf = String.valueOf(bzxu5.f171802c);
                            lvn.mo25412b(valueOf.length() == 0 ? new String("Non-OK result response message: ") : "Non-OK result response message: ".concat(valueOf), new Object[0]);
                            bzxu bzxu6 = bzxv.f171805a;
                            return bzxu6 == null ? bzxu.f171798d : bzxu6;
                        }
                    }
                    if ((bzxw.f171809a & 1) == 0) {
                        return bzxu2;
                    }
                    bzxu bzxu7 = bzxw.f171810b;
                    return bzxu7 == null ? bzxu.f171798d : bzxu7;
                }
                lvn lvn2 = f33424a;
                bzxu bzxu8 = bzxw.f171810b;
                if (bzxu8 == null) {
                    bzxu8 = bzxu.f171798d;
                }
                String valueOf2 = String.valueOf(bzxu8.f171802c);
                lvn2.mo25412b(valueOf2.length() == 0 ? new String("Non-OK response message: ") : "Non-OK response message: ".concat(valueOf2), new Object[0]);
                bzxu bzxu9 = bzxw.f171810b;
                return bzxu9 == null ? bzxu.f171798d : bzxu9;
            } catch (IOException e) {
                return bzxu2;
            }
        } catch (IOException e2) {
            f33424a.mo25415d("Failed to read error body response", e2, new Object[0]);
            return bzxu2;
        }
    }
}
