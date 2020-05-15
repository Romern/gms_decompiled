package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.backup.ParcelableDevice;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: luy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class luy extends aaab {

    /* renamed from: a */
    private static final lvn f33013a = new lvn("GetAvailableRestoreSets");

    /* renamed from: b */
    private final mop f33014b;

    /* renamed from: c */
    private final lzu f33015c;

    /* renamed from: d */
    private final Account f33016d;

    public luy(lsp lsp, lzu lzu, mop mop, Account account) {
        super(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, "GetAvailableRestoreSets");
        bmxy.m108581a(mop);
        this.f33014b = mop;
        bmxy.m108581a(lzu);
        this.f33015c = lzu;
        bmxy.m108581a(lsp);
        if (account == null) {
            account = lsp.mo19591a();
            bmxy.m108581a(account);
        }
        this.f33016d = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f33013a.mo25409a("Getting the restore sets for %s", this.f33016d.name);
        try {
            String a = gie.m13187a(context, this.f33016d, "android");
            bxvd da = lte.f32897d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lte.m24370a((lte) da.f164949b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lte lte = (lte) da.f164949b;
            lte.f32899a |= 32;
            lte.f32901c = true;
            int d = (int) ccmh.f179446a.mo6606a().mo76375d();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lte lte2 = (lte) da.f164949b;
            lte2.f32899a |= 1;
            lte2.f32900b = d;
            lte lte3 = (lte) da.mo74062i();
            bxvd da2 = lth.f32914q.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            lth lth = (lth) da2.f164949b;
            a.getClass();
            int i = lth.f32916a | 16;
            lth.f32916a = i;
            lth.f32920e = a;
            lte3.getClass();
            lth.f32927l = lte3;
            lth.f32916a = i | 4096;
            if (!cckq.m130234b()) {
                long a2 = spn.getAndroidId(context);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                lth lth2 = (lth) da2.f164949b;
                lth2.f32916a |= 1;
                lth2.f32917b = a2;
            } else {
                long a3 = spn.getAndroidId(context);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                lth lth3 = (lth) da2.f164949b;
                int i2 = lth3.f32916a | 2;
                lth3.f32916a = i2;
                lth3.f32918c = a3;
                lth3.f32916a = i2 | 1;
                lth3.f32917b = 0;
            }
            ltq a4 = this.f33015c.mo19791a(da2);
            lzw.m24739a(a4);
            int size = a4.f32978f.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new ParcelableDevice(((ltn) a4.f32978f.get(i3)).serializeToBytes()));
            }
            this.f33014b.mo20219a(arrayList);
        } catch (gid | IOException | mbd e) {
            f33013a.mo25417e("Error getting the restore sets", e, new Object[0]);
            mo6503a(Status.f30109c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        f33013a.mo25418e("Failure, status=", status.toString());
        this.f33014b.mo20219a(bngx.m109376e());
    }
}
