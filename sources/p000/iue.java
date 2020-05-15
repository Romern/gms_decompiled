package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatusChange;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;

/* renamed from: iue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iue extends aaab {

    /* renamed from: a */
    private final rnt f21773a;

    /* renamed from: b */
    private final Account f21774b;

    /* renamed from: c */
    private final String f21775c;

    /* renamed from: d */
    private final List f21776d;

    /* renamed from: e */
    private final int f21777e;

    public iue(rnt rnt, String str, Account account, int i, List list) {
        super(129, "SetFeatureStatusesOperation");
        this.f21773a = rnt;
        this.f21774b = account;
        this.f21775c = str;
        this.f21776d = list;
        this.f21777e = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        iqm iqm;
        chtv chtv;
        if (ccfa.m129418b()) {
            iqb a = iqa.m15886a(context, this.f21774b, isr.m16057a(context, 0, 3));
            try {
                iqm = new iqm(context, a);
                String str = this.f21775c;
                List<DeviceFeatureStatusChange> list = this.f21776d;
                int i = this.f21777e;
                iql iql = iqm.f21572c;
                bxvd da = bqlr.f141155c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bqlr) da.f164949b).f141157a = i;
                bqli a2 = iql.mo13262a(str, (bqlr) da.mo74062i());
                String a3 = iqm.f21573d.mo13256a();
                bxvd da2 = bqlc.f141077c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                a3.getClass();
                ((bqlc) da2.f164949b).f141079a = a3;
                for (DeviceFeatureStatusChange deviceFeatureStatusChange : list) {
                    bxvd da3 = bqlb.f141072d.mo74144da();
                    String str2 = deviceFeatureStatusChange.f10522b.f10519b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bqlb bqlb = (bqlb) da3.f164949b;
                    str2.getClass();
                    bqlb.f141074a = str2;
                    bqlb.f141075b = deviceFeatureStatusChange.f10522b.f10520c;
                    bqlb.f141076c = deviceFeatureStatusChange.f10523c;
                    bqlb bqlb2 = (bqlb) da3.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bqlc bqlc = (bqlc) da2.f164949b;
                    bqlb2.getClass();
                    if (!bqlc.f141080b.mo73666a()) {
                        bqlc.f141080b = GeneratedMessageLite.m124021a(bqlc.f141080b);
                    }
                    bqlc.f141080b.add(bqlb2);
                }
                bxvd da4 = bqkz.f141066c.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                a2.getClass();
                ((bqkz) da4.f164949b).f141068a = a2;
                bqlc bqlc2 = (bqlc) da2.mo74062i();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bqkz bqkz = (bqkz) da4.f164949b;
                bqlc2.getClass();
                if (!bqkz.f141069b.mo73666a()) {
                    bqkz.f141069b = GeneratedMessageLite.m124021a(bqkz.f141069b);
                }
                bqkz.f141069b.add(bqlc2);
                bqkz bqkz2 = (bqkz) da4.mo74062i();
                try {
                    try {
                        bqlf c = iqm.f21571b.f21543a.mo13266c();
                        try {
                            chqp chqp = c.f190402a;
                            chtv chtv2 = bqlg.f141091d;
                            if (chtv2 == null) {
                                synchronized (bqlg.class) {
                                    chtv = bqlg.f141091d;
                                    if (chtv == null) {
                                        chts a4 = chtv.m149565a();
                                        a4.f189140c = chtu.UNARY;
                                        a4.f189141d = chtv.m149567a("google.cryptauth.devicesync.v1.DeviceSync", "BatchSetFeatureStatuses");
                                        a4.mo85659b();
                                        a4.f189138a = ciie.m150370a(bqkz.f141066c);
                                        a4.f189139b = ciie.m150370a(bqla.f141070a);
                                        chtv = a4.mo85658a();
                                        bqlg.f141091d = chtv;
                                    }
                                }
                                chtv2 = chtv;
                            }
                            bqla bqla = (bqla) ciiq.m150394a(chqp, chtv2, c.f190403b, bqkz2);
                            iqm.f21570a.mo13320a(new iso(6, 2).mo13318a());
                            a.mo13254a();
                        } catch (chux e) {
                            throw new egw("Failed to make BatchSetFeatureStatusesRequest", e, iqb.m15887a(e.f189238a.f189233s));
                        }
                    } catch (gid e2) {
                        e = e2;
                        throw new egw("failed to create stub", e, 5);
                    } catch (IOException e3) {
                        e = e3;
                        throw new egw("failed to create stub", e, 5);
                    }
                } catch (egw e4) {
                    iqm.f21570a.mo13320a(new iso(6, e4.f14892a).mo13318a());
                    throw new iqn("Failed to make set feature statuses request", e4);
                }
            } catch (iqr e5) {
                iqm.f21570a.mo13320a(new iso(6, 11).mo13318a());
                throw new iqn("Failed to generate request context", e5);
            } catch (iqn e6) {
                try {
                    this.f21773a.mo11797a(Status.f30109c);
                    return;
                } finally {
                    a.mo13254a();
                }
            }
        }
        this.f21773a.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21773a.mo11797a(status);
    }
}
