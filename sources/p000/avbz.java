package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import java.util.ArrayList;

/* renamed from: avbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbz extends avav {

    /* renamed from: a */
    private static final srn f92935a = srn.m36124a();

    /* renamed from: b */
    private final UdcWriteLocalSettingsRequest f92936b;

    /* renamed from: k */
    private final avcc f92937k = new avcc(this.f92882c, this.f92886g);

    /* renamed from: l */
    private final bmzi f92938l;

    public avbz(Context context, avdl avdl, ClientContext clientContext, String str, bmzi bmzi, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        super(context, avdl, clientContext, str, "WriteLocalSettingsOperation");
        this.f92936b = udcWriteLocalSettingsRequest;
        this.f92938l = bmzi;
    }

    /* renamed from: a */
    private final Status m78219a() {
        int i;
        if (!spn.m35869b()) {
            if (!sqc.m35963b(chbh.f188248a.mo6606a().mo84940V().split(","), this.f92884e.f30215e)) {
                bnsl bnsl = (bnsl) f92935a.mo68388c();
                bnsl.mo68432a("avbz", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("writeLocalSettings called by non-whitelisted package: %s", this.f92884e.f30215e);
                return Status.f30109c;
            }
        }
        if (!chbh.m148008f()) {
            ArrayList arrayList = new ArrayList();
            UdcWriteLocalSettingsRequest.SettingChange[] settingChangeArr = this.f92936b.f109359a;
            for (UdcWriteLocalSettingsRequest.SettingChange settingChange : settingChangeArr) {
                bxvd da = bxsd.f164664d.mo74144da();
                int i2 = settingChange.f109360a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxsd bxsd = (bxsd) da.f164949b;
                int i3 = bxsd.f164666a | 1;
                bxsd.f164666a = i3;
                bxsd.f164667b = i2;
                if (!settingChange.f109361b) {
                    i = 4;
                } else {
                    i = 3;
                }
                bxsd.f164668c = i - 1;
                bxsd.f164666a = i3 | 2;
                arrayList.add((bxsd) da.mo74062i());
            }
            this.f92937k.mo51140a((bxsd[]) arrayList.toArray(new bxsd[0]));
            if (chbh.f188248a.mo6606a().mo84952l()) {
                bnsl bnsl2 = (bnsl) f92935a.mo68390d();
                bnsl2.mo68432a("avbz", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                ClientContext clientContext = this.f92884e;
                bnsl2.mo68424a("writeLocalSettings() sending FACS_CACHE_UPDATED[_EXPLICIT] broadcasts for user %s. Package: %s", clientContext.f30213c, clientContext.f30215e);
                new avfw(this.f92882c).mo51198a(this.f92884e.f30213c);
            }
        } else {
            bxvd da2 = bxok.f164161d.mo74144da();
            UdcWriteLocalSettingsRequest.SettingChange[] settingChangeArr2 = this.f92936b.f109359a;
            for (UdcWriteLocalSettingsRequest.SettingChange settingChange2 : settingChangeArr2) {
                int i4 = settingChange2.f109360a;
                if (i4 == 9) {
                    boolean z = settingChange2.f109361b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxok bxok = (bxok) da2.f164949b;
                    bxok.f164163a |= 2;
                    bxok.f164165c = z;
                } else if (i4 == 10) {
                    boolean z2 = settingChange2.f109361b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxok bxok2 = (bxok) da2.f164949b;
                    bxok2.f164163a |= 1;
                    bxok2.f164164b = z2;
                }
            }
            int i5 = ((bxok) da2.f164949b).f164163a;
            if (!((i5 & 2) == 0 && (i5 & 1) == 0)) {
                bdtq bdtq = (bdtq) this.f92938l.mo6606a();
                bxvd da3 = bxqf.f164373f.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bxqf bxqf = (bxqf) da3.f164949b;
                bxok bxok3 = (bxok) da2.mo74062i();
                bxok3.getClass();
                bxqf.f164378d = bxok3;
                bxqf.f164375a |= 8;
                avje.m78606a(bdtq.mo58360a((bxqf) da3.mo74062i()));
            }
        }
        return Status.f30107a;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        Status status;
        int i;
        super.mo6502a(context);
        mo51133b();
        if (!spn.m35869b()) {
            if (!sqc.m35963b(chbh.f188248a.mo6606a().mo84940V().split(","), this.f92884e.f30215e)) {
                bnsl bnsl = (bnsl) f92935a.mo68388c();
                bnsl.mo68432a("avbz", "a", 70, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("writeLocalSettings called by non-whitelisted package: %s", this.f92884e.f30215e);
                status = Status.f30109c;
                mo51131a(status.f30115i);
                this.f92883d.mo51154a(status);
            }
        }
        if (!chbh.m148008f()) {
            ArrayList arrayList = new ArrayList();
            UdcWriteLocalSettingsRequest.SettingChange[] settingChangeArr = this.f92936b.f109359a;
            for (UdcWriteLocalSettingsRequest.SettingChange settingChange : settingChangeArr) {
                bxvd da = bxsd.f164664d.mo74144da();
                int i2 = settingChange.f109360a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxsd bxsd = (bxsd) da.f164949b;
                int i3 = bxsd.f164666a | 1;
                bxsd.f164666a = i3;
                bxsd.f164667b = i2;
                if (!settingChange.f109361b) {
                    i = 4;
                } else {
                    i = 3;
                }
                bxsd.f164668c = i - 1;
                bxsd.f164666a = i3 | 2;
                arrayList.add((bxsd) da.mo74062i());
            }
            this.f92937k.mo51140a((bxsd[]) arrayList.toArray(new bxsd[0]));
            if (chbh.f188248a.mo6606a().mo84952l()) {
                bnsl bnsl2 = (bnsl) f92935a.mo68390d();
                bnsl2.mo68432a("avbz", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                ClientContext clientContext = this.f92884e;
                bnsl2.mo68424a("writeLocalSettings() sending FACS_CACHE_UPDATED[_EXPLICIT] broadcasts for user %s. Package: %s", clientContext.f30213c, clientContext.f30215e);
                new avfw(this.f92882c).mo51198a(this.f92884e.f30213c);
            }
        } else {
            bxvd da2 = bxok.f164161d.mo74144da();
            UdcWriteLocalSettingsRequest.SettingChange[] settingChangeArr2 = this.f92936b.f109359a;
            for (UdcWriteLocalSettingsRequest.SettingChange settingChange2 : settingChangeArr2) {
                int i4 = settingChange2.f109360a;
                if (i4 == 9) {
                    boolean z = settingChange2.f109361b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxok bxok = (bxok) da2.f164949b;
                    bxok.f164163a |= 2;
                    bxok.f164165c = z;
                } else if (i4 == 10) {
                    boolean z2 = settingChange2.f109361b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxok bxok2 = (bxok) da2.f164949b;
                    bxok2.f164163a |= 1;
                    bxok2.f164164b = z2;
                }
            }
            int i5 = ((bxok) da2.f164949b).f164163a;
            if (!((i5 & 2) == 0 && (i5 & 1) == 0)) {
                bdtq bdtq = (bdtq) this.f92938l.mo6606a();
                bxvd da3 = bxqf.f164373f.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bxqf bxqf = (bxqf) da3.f164949b;
                bxok bxok3 = (bxok) da2.mo74062i();
                bxok3.getClass();
                bxqf.f164378d = bxok3;
                bxqf.f164375a |= 8;
                avje.m78606a(bdtq.mo58360a((bxqf) da3.mo74062i()));
            }
        }
        status = Status.f30107a;
        mo51131a(status.f30115i);
        this.f92883d.mo51154a(status);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51154a(status);
    }
}
